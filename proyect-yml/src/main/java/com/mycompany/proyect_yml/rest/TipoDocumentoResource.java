package com.mycompany.proyect_yml.rest;


import com.mycompany.proyect_yml.domain.TipoDocumento;
import com.mycompany.proyect_yml.repository.TipoDocumentoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class TipoDocumentoResource {

    private final TipoDocumentoRepository tipoDocumentoRepository;

    public TipoDocumentoResource(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

    @PostMapping("tipo-documento")
    public String createTipoDocument(@RequestBody TipoDocumento documentType){
        System.out.println("Se crea: "+documentType.toString());
        return "CREATE DOCUMENT TYPE";
    }
    @PutMapping("/tipo-documento")
    public String updateTIpoDocumento(@RequestBody TipoDocumento documentType){
        System.out.println("Se actualiza: "+documentType.toString());
        return "UPDATE DOCUMENT TYPE";
    }@GetMapping("/document-types")
    public ResponseEntity<Set<TipoDocumento>> getDocumentTypes(){
        List <TipoDocumento> tipoDocumentos =tipoDocumentoRepository.findAll() ;
        ResponseEntity body = ResponseEntity.ok().body(tipoDocumentos);
        return body;
    }@GetMapping("tipo-documentos/{id}")
    public String getTIpoDocumentoByID(@PathVariable("id") Long id){
        return "Document type By id "+ id;

    }@DeleteMapping("tipo-documentos/{id}")
    public String deleteTipoDocumento(@PathVariable("id") Long id){

        return "Delete document type by id "+id;
    }
}
