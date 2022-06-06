package com.moto.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moto.service.entidades.Moto;
import com.moto.service.repositorio.MotoRepository;

@Service
public class MotoService {

	@Autowired
	private MotoRepository motoRepository;

	public List<Moto> getAll() {
		return motoRepository.findAll();
	}

	public List<Moto> byUsuarioId(int usuarioId) {
		return motoRepository.findByUsuario(usuarioId);
	}

	public Moto getCarroById(int id) {
		return motoRepository.findById(id).orElse(null);
	}

	public Moto save(Moto moto) {
		Moto nuevoMoto = motoRepository.save(moto);
		return nuevoMoto;
	}

}
