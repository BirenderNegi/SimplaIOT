package com.simpla.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserDevice is a Querydsl query type for UserDevice
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserDevice extends EntityPathBase<UserDevice> {

    private static final long serialVersionUID = 1525916034L;

    public static final QUserDevice userDevice = new QUserDevice("userDevice");

    public final StringPath deviceId = createString("deviceId");

    public final NumberPath<UserDetails> userDetails = createNumber("userDetails", UserDetails.class);

    public final NumberPath<Integer> userDeviceId = createNumber("userDeviceId", Integer.class);

    public final StringPath userDeviceName = createString("userDeviceName");

    public QUserDevice(String variable) {
        super(UserDevice.class, forVariable(variable));
    }

    public QUserDevice(Path<? extends UserDevice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserDevice(PathMetadata<?> metadata) {
        super(UserDevice.class, metadata);
    }

}

