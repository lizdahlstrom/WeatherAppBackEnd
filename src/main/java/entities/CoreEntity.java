package entities;

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

    public abstract long getID();
}
