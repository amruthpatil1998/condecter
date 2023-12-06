package com.condecter.pkg.service;

import java.util.List;

import com.condecter.pkg.entity.Condecter;

public interface CtrService {
	
	public String CsmrResister(Condecter csmr);

	public Condecter getById(int id);

	public void deletById(int id);

	public List<Condecter> getAll();

	public Condecter update(int id, Condecter c);
	
}
