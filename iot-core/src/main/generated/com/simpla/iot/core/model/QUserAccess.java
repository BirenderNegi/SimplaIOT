package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserAccess is a Querydsl query type for UserAccess
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserAccess extends EntityPathBase<UserAccess> {

    private static final long serialVersionUID = 892759088L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserAccess userAccess = new QUserAccess("userAccess");

    public final NumberPath<Integer> accessId = createNumber("accessId", Integer.class);

    public final StringPath flag = createString("flag");

    public final StringPath type = createString("type");

    public final NumberPath<Integer> userAccessId = createNumber("userAccessId", Integer.class);

    public final QUserDetails userDetails;

    public QUserAccess(String variable) {
        this(UserAccess.class, forVariable(variable), INITS);
    }

    public QUserAccess(Path<? extends UserAccess> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserAccess(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserAccess(PathMetadata<?> metadata, PathInits inits) {
        this(UserAccess.class, metadata, inits);
    }

    public QUserAccess(Class<? extends UserAccess> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userDetails = inits.isInitialized("userDetails") ? new QUserDetails(forProperty("userDetails"), inits.get("userDetails")) : null;
    }

}

