package Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/couponApi")
public interface CouponRestController {

    @Autowired
    CouponRepo repo = null;

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public static Coupon create(@RequestBody Coupon coupon)
    {
        return repo.save(coupon);
    }

    @RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
    public static Coupon getCoupon(@PathVariable("code") String  code)
    {
        return repo.findByCode(code);
    }



}
