package br.com.diegogalindo.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.diegogalindo.clientes.model.Cliente;
import br.com.diegogalindo.clientes.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    

    @Autowired
    private ClienteRepository clienteRepository;
      
    @GetMapping
    public ModelAndView listar(){
        ModelAndView modelAndView = new ModelAndView("cliente/listar");
      
        List<Cliente> clientes = clienteRepository.findAll();
        modelAndView.addObject("clientes", clientes);

        return modelAndView;
    }
}