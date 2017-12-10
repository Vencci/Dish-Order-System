package cmpe.dos.service;

import cmpe.dos.dto.CouponDto;
import cmpe.dos.entity.Reward;

public interface RewardService {

	public Reward getValidCoupon(String couponId);
	
	public void DeleteUsedCoupon(Reward reward);

	public Boolean addNewCoupon(CouponDto cDto);

}
