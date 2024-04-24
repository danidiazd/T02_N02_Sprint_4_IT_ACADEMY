package cat.itacademy.barcelonactiva.diazdiaz.dani.s04.t02.n02.Controllers;


import cat.itacademy.barcelonactiva.diazdiaz.dani.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.diazdiaz.dani.s04.t02.n02.model.services.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

    @Autowired
    private FruitaService fruitaService;

    @PostMapping("/add")
    public ResponseEntity<Fruita> createFruita(@RequestBody Fruita fruita) {
        return ResponseEntity.ok().body(this.fruitaService.createFruita(fruita));
    }

    @PutMapping
    public ResponseEntity<Fruita> updateFruita(@RequestBody Fruita fruita) {
        return ResponseEntity.ok().body(this.fruitaService.updateFruita(fruita));
    }

    @DeleteMapping
    public ResponseEntity<Fruita> deleteFruita(@PathVariable("id") int id) {

        ResponseEntity<Fruita> responseEntity;

        if (fruitaService.deleteFruita(id)) {
            responseEntity = ResponseEntity.noContent().build();
        } else  {
            responseEntity = ResponseEntity.internalServerError().build();
        }
        return responseEntity;
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruita> getOneFruit(@PathVariable("id") int id) {
        return ResponseEntity.ok().body(this.fruitaService.getOne(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruita>> getAllFruits() {
        return ResponseEntity.ok().body(this.fruitaService.getAll());
    }
}
