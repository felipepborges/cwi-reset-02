package br.com.cwi.reset.exemploreset.repository;

import br.com.cwi.reset.exemploreset.domain.Usuario;
import br.com.cwi.reset.exemploreset.exception.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class UsuarioRepository {

    static List<Usuario> usuarios = new ArrayList<>();
    private Long contadorId = 1l;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario addUsuario(Usuario usuario){
        usuario.setId(String.valueOf(contadorId));
        usuarios.add(usuario);
        contadorId++;
        return usuario;
    }

    public void removerUsuario(String id){
        Usuario deletar = null;

        for(Usuario usuario : usuarios) {   //não pode modificar enquanto está percorrendo a lista, por isso a necessecidade de criar um atributo fora do loop
            if (usuario.getId().equals(id)) {
                deletar = usuario;
            }
        }

        if(deletar == null){
            throw new NotFoundException();
        }

        usuarios.remove(deletar);
    }
}
