package com.condecter.pkg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.condecter.pkg.entity.Condecter;
import com.condecter.pkg.repository.CtrRepository;
import com.condecter.pkg.util.CtrUtil;

@Service
public class CtrserviceIpml implements CtrService {

	@Autowired
	CtrUtil ctrUtil;

	@Autowired
	CtrRepository repo;

	@Override
	public String CsmrResister(Condecter csmr) {

		// validation costumer
		boolean validate = ctrUtil.validate(csmr);
		if (validate == true) {

			String Date = ctrUtil.setDate();
			csmr.setConDate(Date);

			String time = ctrUtil.setTime();
			csmr.setConTima(time);

			// save db
			Condecter save = repo.save(csmr);
			System.out.println(save);

			return "TiketConferom";
		}

		return "TiketNotConferom";
	}

	@Override
	public Condecter getById(int id) {
		Condecter byId = repo.findById(id).get();
		return byId;
	}

	@Override
	public void deletById(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Condecter> getAll() {
		return repo.findAll();
	}

	@Override
	public Condecter update(int id, Condecter c) {
		Condecter oldData = repo.findById(id).get();
		
		if (c.getDestination() != null) {
			oldData.setDestination(c.getDestination());
		}
		if (c.getLocation() != null) {
			oldData.setLocation(c.getLocation());
		}
		
		Condecter save = repo.save(oldData);
		return save;
	}

}
