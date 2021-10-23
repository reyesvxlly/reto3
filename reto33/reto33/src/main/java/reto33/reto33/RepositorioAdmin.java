/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto33.reto33;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioAdmin {
    @Autowired
    private InterfaceAdmin crud4;

    public List<Admin> getAll(){
        return (List<Admin>) crud4.findAll();
    }
    public Optional<Admin> getReservation(int id){
        return crud4.findById(id);
    }
    public Admin save(Admin reservation){
        return crud4.save(reservation);
    }
    public void delete(Admin reservation){
        crud4.delete(reservation);
    }
    
}
