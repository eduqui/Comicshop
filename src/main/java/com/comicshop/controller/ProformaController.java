  
package com.comicshop.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

import com.comicshop.model.Producto;
import com.comicshop.model.Proforma;
import com.comicshop.model.Usuario;
import com.comicshop.repository.ProformaRepository;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.util.List;

@Controller
public class ProformaController {
 
    private static final String VIEW_INDEX ="proforma/index";
    private static String MODEL_PRODUCTO="proforma";
    private final ProformaRepository proformaData;
    
    public ProformaController(ProformaRepository proformaData
        ){
        this.proformaData = proformaData;
    }      

    @GetMapping("/proforma/index")
    public String index(Model model, HttpSession session){
        Usuario user = (Usuario)session.getAttribute("user"); 
        List<Proforma> listItems = this.proformaData.findItemsByUsuario(user);
        model.addAttribute("proformas",listItems);
        return VIEW_INDEX;
    }    

    @PostMapping("/proforma/update")
    public String createSubmitForm(Model model, 
        @Valid Producto objProducto, BindingResult result ){

        return VIEW_INDEX;
    }



}