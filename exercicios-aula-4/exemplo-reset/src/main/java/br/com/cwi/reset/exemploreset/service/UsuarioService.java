package br.com.cwi.reset.exemploreset.service;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.BadRequestException;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> obterUsuarios(){
        return repository.getUsuarios();
    }

    public Usuario criarUsuario(Usuario usuario){
        if(usuario == null){
            throw new BadRequestException();
        }
        return repository.addUsuario(usuario);
    }

    public void deletar(String id){
        repository.removerUsuario(id);
    }


}
