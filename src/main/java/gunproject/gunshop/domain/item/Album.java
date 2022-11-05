package gunproject.gunshop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity @Getter @Setter
@DiscriminatorValue("album")
public class Album extends Item {
    private String artist;
    private String etc;
}
