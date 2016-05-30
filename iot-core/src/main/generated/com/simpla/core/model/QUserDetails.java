package com.simpla.core.model;

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

    private static final long serialVersionUID = 56677526L;

    public static final QUserDetails userDetails = new QUserDetails("userDetails");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final SetPath<LoginDetails, NumberPath<LoginDetails>> loginDetailses = this.<LoginDetails, NumberPath<LoginDetails>>createSet("loginDetailses", LoginDetails.class, NumberPath.class, PathInits.DIRECT2);

    public final NumberPath<Organization> organization = createNumber("organization", Organization.class);

    public final NumberPath<Role> role = createNumber("role", Role.class);

    public final SetPath<UserAccess, NumberPath<UserAccess>> userAccesses = this.<UserAccess, NumberPath<UserAccess>>createSet("userAccesses", UserAccess.class, NumberPath.class, PathInits.DIRECT2);

    public final SetPath<UserDevice, NumberPath<UserDevice>> userDevices = this.<UserDevice, NumberPath<UserDevice>>createSet("userDevices", UserDevice.class, NumberPath.class, PathInits.DIRECT2);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QUserDetails(String variable) {
        super(UserDetails.class, forVariable(variable));
    }

    public QUserDetails(Path<? extends UserDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDetails(PathMetadata<?> metadata) {
        super(UserDetails.class, metadata);
    }

}

