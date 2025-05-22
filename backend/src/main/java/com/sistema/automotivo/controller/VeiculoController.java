package com.sistema.automotivo.controller;

import com.sistema.automotivo.model.Veiculo;
import com.sistema.automotivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
@CrossOrigin(origins = "*")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow();
        veiculo.setPreco(veiculoAtualizado.getPreco());
        veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
        veiculo.setStatus(veiculoAtualizado.getStatus());
        return veiculoRepository.save(veiculo);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        veiculoRepository.deleteById(id);
    }
}
