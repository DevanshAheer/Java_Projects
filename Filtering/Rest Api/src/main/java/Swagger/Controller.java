package Swagger;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
@RestController
public class Controller {
    @Autowired
    private MessageSource messageSource ;
    @RequestMapping(method = RequestMethod.GET , path = "/home/{name}")
    public String show(@PathVariable String name){
        Locale locale = LocaleContextHolder.getLocale() ;
        return messageSource.getMessage("hello.message" , null , "Default Message" , locale) + " " +name;

    }

    /*@GetMapping("/inter")
    public String internationalized() {
        public MessageSource messageSource;
            *//*@Override
            public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
                return null;
            }

            @Override
            public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
                return null;
            }

            @Override
            public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {
                return null;
            }
        }*//*
        Locale locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage("good.morning.message",null,"Default message",locale);

        }*/
}





