/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.comics.dtos;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class ComicDetailDTO extends ComicDTO implements Serializable {
    
    private List<VendedorDTO> vendedorDTO;
    
    public ComicDetailDTO (){
    
    }
}
