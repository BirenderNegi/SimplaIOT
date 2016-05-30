package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLoginDetails is a Querydsl query type for LoginDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLoginDetails extends EntityPathBase<LoginDetails> {

    private static final long serialVersionUID = -1181875846L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLoginDetails loginDetails = new QLoginDetails("loginDetails");

    public final NumberPath<Integer> loginDetailId = createNumber("loginDetailId", Integer.class);

    public final StringPath password = createString("password");

    public final QUserDetails userDetails;

    public final StringPath userName = createString("userName");

    public QLoginDetails(String variable) {
        this(LoginDetails.class, forVariable(variable), INITS);
    }

    public QLoginDetails(Path<? extends LoginDetails> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLoginDetails(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLoginDetails(PathMetadata<?> metadata, PathInits inits) {
        this(LoginDetails.class, metadata, inits);
    }

    public QLoginDetails(Class<? extends LoginDetails> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userDetails = inits.isInitialized("userDetails") ? new QUserDetails(forProperty("userDetails"), inits.get("userDetails")) : null;
    }

}

