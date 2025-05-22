package pooutp.demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pooutp.demo.Entity.Persona;
import pooutp.demo.Repository.PersonaRepository;
import pooutp.demo.Service.PersonaService;

import java.util.Collections;
import java.util.List;
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<Persona> listar_persona() {
        return repository.findAll();
    }
}
