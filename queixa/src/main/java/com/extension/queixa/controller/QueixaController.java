package com.extension.queixa.controller;

import com.extension.queixa.model.Queixa;
import com.extension.queixa.service.QueixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/queixas")
public class QueixaController {

    @Autowired
    private QueixaService queixaService;

    @GetMapping
    public List<Queixa> listarQueixas() {
        return queixaService.listarTodas();
    }

    @PostMapping
    public Queixa adicionarQueixa(@RequestBody Queixa queixa) {
        return queixaService.salvarQueixa(queixa);
    }

    @GetMapping("/{id}")
    public Queixa buscarQueixa(@PathVariable Long id) {
        return queixaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarQueixa(@PathVariable Long id) {
        queixaService.deletarQueixa(id);
    }
}
