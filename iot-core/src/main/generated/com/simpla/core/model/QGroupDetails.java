package com.simpla.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGroupDetails is a Querydsl query type for GroupDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGroupDetails extends EntityPathBase<GroupDetails> {

    private static final long serialVersionUID = -1606473212L;

    public static final QGroupDetails groupDetails = new QGroupDetails("groupDetails");

    public final SetPath<DeviceDetails, QDeviceDetails> deviceDetailses = this.<DeviceDetails, QDeviceDetails>createSet("deviceDetailses", DeviceDetails.class, QDeviceDetails.class, PathInits.DIRECT2);

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final StringPath groupName = createString("groupName");

    public final StringPath groupPostalAddress = createString("groupPostalAddress");

    public final StringPath groupStreetAddress = createString("groupStreetAddress");

    public final NumberPath<Organization> organization = createNumber("organization", Organization.class);

    public QGroupDetails(String variable) {
        super(GroupDetails.class, forVariable(variable));
    }

    public QGroupDetails(Path<? extends GroupDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGroupDetails(PathMetadata<?> metadata) {
        super(GroupDetails.class, metadata);
    }

}

