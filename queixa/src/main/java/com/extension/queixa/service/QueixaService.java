package com.extension.queixa.service;

import com.extension.queixa.model.Queixa;
import com.extension.queixa.repository.QueixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QueixaService {

    @Autowired
    private QueixaRepository queixaRepository;

    // Listar todas as queixas
    public List<Queixa> listarTodas() {
        return queixaRepository.findAll();
    }

    // Salvar uma nova queixa
    public Queixa salvarQueixa(Queixa queixa) {
        return queixaRepository.save(queixa);
    }

    // Buscar uma queixa por ID
    public Queixa buscarPorId(Long id) {
        Optional<Queixa> queixa = queixaRepository.findById(id);
        return queixa.orElse(null);
    }

    // Deletar uma queixa por ID
    public void deletarQueixa(Long id) {
        queixaRepository.deleteById(id);
    }
}
