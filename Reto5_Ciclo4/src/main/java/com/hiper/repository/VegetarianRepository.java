package com.hiper.repository;

import com.hiper.model.Vegetarian;
import com.hiper.repository.crud.InterfaceVegetarian;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan pablo Roa Fragozo
 */
@Repository
public class VegetarianRepository {

    @Autowired
    private InterfaceVegetarian crudInterface;

    public List<Vegetarian> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Vegetarian> getSupplement(String reference) {
        return crudInterface.findById(reference);
    }

    public Vegetarian create(Vegetarian clothe) {
        return crudInterface.save(clothe);
    }

    public void update(Vegetarian clothe) {
        crudInterface.save(clothe);
    }

    public void delete(Vegetarian clothe) {
        crudInterface.delete(clothe);
    }

        //Reto 5
        public List<Vegetarian> productByPrice(double precio){
            return crudInterface.findByPriceLessThanEqual(precio);
        }
        //Reto 5
        public List<Vegetarian> findByDescriptionLike(String description){
            return crudInterface.findByDescriptionLike(description);
        }
}
