package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserDetails is a Querydsl query type for UserDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserDetails extends EntityPathBase<UserDetails> {

    private static final long serialVersionUID = 346100982L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserDetails userDetails = new QUserDetails("userDetails");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final QOrganization organization;

    public final QRole role;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QUserDetails(String variable) {
        this(UserDetails.class, forVariable(variable), INITS);
    }

    public QUserDetails(Path<? extends UserDetails> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserDetails(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserDetails(PathMetadata<?> metadata, PathInits inits) {
        this(UserDetails.class, metadata, inits);
    }

    public QUserDetails(Class<? extends UserDetails> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.organization = inits.isInitialized("organization") ? new QOrganization(forProperty("organization")) : null;
        this.role = inits.isInitialized("role") ? new QRole(forProperty("role")) : null;
    }

}

