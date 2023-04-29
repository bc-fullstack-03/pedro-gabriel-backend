package sysmap.project.socialnetwork.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sysmap.project.socialnetwork.model.entities.Autor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comentario {
    private String texto;
    private Autor autor;
}
