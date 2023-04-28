package sysmap.project.socialnetwork.model.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import sysmap.project.socialnetwork.model.Autor;
import sysmap.project.socialnetwork.model.Comentario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post{

    @Id
    private UUID id;
    private String conteudo;
    private Autor autor;
    private List<Comentario> comentarios = new ArrayList<>();

}
