package entities.super_entity;

import javax.persistence.*;

/**
 * Created by Liz on 2/8/2017.
 *
 */

@MappedSuperclass
public abstract class CoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    protected CoreEntity() {}

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }
}
