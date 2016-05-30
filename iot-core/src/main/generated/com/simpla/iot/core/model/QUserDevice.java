package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserDevice is a Querydsl query type for UserDevice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserDevice extends EntityPathBase<UserDevice> {

    private static final long serialVersionUID = 981062946L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserDevice userDevice = new QUserDevice("userDevice");

    public final StringPath deviceId = createString("deviceId");

    public final QUserDetails userDetails;

    public final NumberPath<Integer> userDeviceId = createNumber("userDeviceId", Integer.class);

    public final StringPath userDeviceName = createString("userDeviceName");

    public QUserDevice(String variable) {
        this(UserDevice.class, forVariable(variable), INITS);
    }

    public QUserDevice(Path<? extends UserDevice> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserDevice(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserDevice(PathMetadata<?> metadata, PathInits inits) {
        this(UserDevice.class, metadata, inits);
    }

    public QUserDevice(Class<? extends UserDevice> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userDetails = inits.isInitialized("userDetails") ? new QUserDetails(forProperty("userDetails"), inits.get("userDetails")) : null;
    }

}

