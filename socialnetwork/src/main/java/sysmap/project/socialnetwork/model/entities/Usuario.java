package sysmap.project.socialnetwork.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private UUID id;
    private String nome;
    private String email;
    private String senha;
}
