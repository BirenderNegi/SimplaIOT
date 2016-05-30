package com.simpla.iot.core.model;

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

    private static final long serialVersionUID = -1224280668L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGroupDetails groupDetails = new QGroupDetails("groupDetails");

    public final SetPath<DeviceDetails, QDeviceDetails> deviceDetailses = this.<DeviceDetails, QDeviceDetails>createSet("deviceDetailses", DeviceDetails.class, QDeviceDetails.class, PathInits.DIRECT2);

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final StringPath groupName = createString("groupName");

    public final StringPath groupPostalAddress = createString("groupPostalAddress");

    public final StringPath groupStreetAddress = createString("groupStreetAddress");

    public final QOrganization organization;

    public QGroupDetails(String variable) {
        this(GroupDetails.class, forVariable(variable), INITS);
    }

    public QGroupDetails(Path<? extends GroupDetails> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroupDetails(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGroupDetails(PathMetadata<?> metadata, PathInits inits) {
        this(GroupDetails.class, metadata, inits);
    }

    public QGroupDetails(Class<? extends GroupDetails> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.organization = inits.isInitialized("organization") ? new QOrganization(forProperty("organization")) : null;
    }

}

