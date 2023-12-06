package com.condecter.pkg.util;

import java.time.LocalDateTime;
import java.util.Random;
import org.springframework.stereotype.Component;
import com.condecter.pkg.entity.Condecter;

@Component
public class CtrUtil {

	LocalDateTime datTime = LocalDateTime.now();

	public boolean validate(Condecter csmr) {
		
		if (csmr.getLocation() == null) {
			System.out.println("location is null");
			return false;
		}
		if (csmr.getDestination() == null) {
			System.out.println("destination is null");
			return false;
		}
		return true;
	}

	public int CreatId() {
		Random id = new Random();
		int Id = id.nextInt(1000);
		return Id;
	}

	public String setDate() {
		String valueOf = String.valueOf(datTime);
		String date = valueOf.substring(0, 10);
		return date;
	}

	public String setTime() {
		String valueOf = String.valueOf(datTime);
		String time = valueOf.substring(11, 19);
		return time;
	}

}
