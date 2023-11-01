package com.aulamateus.springmateus.Controllers;

import com.aulamateus.springmateus.Remedy.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/remedio")
public class RemedioController {
    @PostMapping
    public void register(@RequestBody DadosCadastroRemedio dados){
        System.out.println(dados);
    }

}
