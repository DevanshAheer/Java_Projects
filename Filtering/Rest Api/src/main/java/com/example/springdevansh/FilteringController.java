package com.example.springdevansh;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    //this is mappingJacksonValue used for dynamic filtering that is inside the RestApi
    public MappingJacksonValue filtering()
    {
        SomeBean someBean= new SomeBean("value-1", "value-2","value-3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);//-------1-step
        // syntax of mappingJacksonValue
        // filterProvider is used for providing the filters to the values in some beans

        SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");//-----------5-step

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);//--------4-step
        mappingJacksonValue.setFilters(filters); //-------------3-step

        return mappingJacksonValue; //----------2-step
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList()
    {
        List<SomeBean> list = Arrays.asList(new SomeBean("value-1","value-2","value-3"),
                new SomeBean("value-5","value-6","value-7"));

        PropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);// syntax of mappingJacksonValue

        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

}
