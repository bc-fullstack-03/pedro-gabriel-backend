package sysmap.project.socialnetwork.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sysmap.project.socialnetwork.model.entities.Usuario;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, UUID> {

}
