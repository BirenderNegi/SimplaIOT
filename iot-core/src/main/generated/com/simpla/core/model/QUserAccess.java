package com.simpla.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserAccess is a Querydsl query type for UserAccess
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserAccess extends EntityPathBase<UserAccess> {

    private static final long serialVersionUID = 1437612176L;

    public static final QUserAccess userAccess = new QUserAccess("userAccess");

    public final NumberPath<Integer> accessId = createNumber("accessId", Integer.class);

    public final StringPath flag = createString("flag");

    public final StringPath type = createString("type");

    public final NumberPath<Integer> userAccessId = createNumber("userAccessId", Integer.class);

    public final NumberPath<UserDetails> userDetails = createNumber("userDetails", UserDetails.class);

    public QUserAccess(String variable) {
        super(UserAccess.class, forVariable(variable));
    }

    public QUserAccess(Path<? extends UserAccess> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserAccess(PathMetadata<?> metadata) {
        super(UserAccess.class, metadata);
    }

}

