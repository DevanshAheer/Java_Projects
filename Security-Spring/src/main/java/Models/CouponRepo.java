package Models;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CouponRepo extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);

}
