package sysmap.project.socialnetwork.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import sysmap.project.socialnetwork.model.entities.Autor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentario {
    private String texto;
    private Autor autor;
}
