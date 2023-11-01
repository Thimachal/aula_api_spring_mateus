package com.aulamateus.springmateus.Controllers;

import com.aulamateus.springmateus.Remedy.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadremedios")
public class RemedioController {
    @PostMapping
    public void register(@RequestBody DadosCadastroRemedio dados){

    }

}
