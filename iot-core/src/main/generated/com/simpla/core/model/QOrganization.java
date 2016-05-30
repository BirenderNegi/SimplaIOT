package com.simpla.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrganization is a Querydsl query type for Organization
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrganization extends EntityPathBase<Organization> {

    private static final long serialVersionUID = -1635843980L;

    public static final QOrganization organization = new QOrganization("organization");

    public final SetPath<DeviceDetails, NumberPath<DeviceDetails>> deviceDetailses = this.<DeviceDetails, NumberPath<DeviceDetails>>createSet("deviceDetailses", DeviceDetails.class, NumberPath.class, PathInits.DIRECT2);

    public final SetPath<GroupDetails, NumberPath<GroupDetails>> groupDetailses = this.<GroupDetails, NumberPath<GroupDetails>>createSet("groupDetailses", GroupDetails.class, NumberPath.class, PathInits.DIRECT2);

    public final StringPath organizationAddress = createString("organizationAddress");

    public final NumberPath<Integer> organizationId = createNumber("organizationId", Integer.class);

    public final StringPath organizationName = createString("organizationName");

    public final SetPath<UserDetails, NumberPath<UserDetails>> userDetailses = this.<UserDetails, NumberPath<UserDetails>>createSet("userDetailses", UserDetails.class, NumberPath.class, PathInits.DIRECT2);

    public QOrganization(String variable) {
        super(Organization.class, forVariable(variable));
    }

    public QOrganization(Path<? extends Organization> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrganization(PathMetadata<?> metadata) {
        super(Organization.class, metadata);
    }

}

