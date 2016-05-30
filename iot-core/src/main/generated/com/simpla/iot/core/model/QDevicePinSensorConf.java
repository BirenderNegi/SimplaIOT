package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDevicePinSensorConf is a Querydsl query type for DevicePinSensorConf
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDevicePinSensorConf extends EntityPathBase<DevicePinSensorConf> {

    private static final long serialVersionUID = 1797898428L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDevicePinSensorConf devicePinSensorConf = new QDevicePinSensorConf("devicePinSensorConf");

    public final QDeviceDetails deviceDetails;

    public final NumberPath<Integer> devicePin = createNumber("devicePin", Integer.class);

    public final NumberPath<Integer> devicePinSensorId = createNumber("devicePinSensorId", Integer.class);

    public final QSensorDataType sensorDataType;

    public QDevicePinSensorConf(String variable) {
        this(DevicePinSensorConf.class, forVariable(variable), INITS);
    }

    public QDevicePinSensorConf(Path<? extends DevicePinSensorConf> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDevicePinSensorConf(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDevicePinSensorConf(PathMetadata<?> metadata, PathInits inits) {
        this(DevicePinSensorConf.class, metadata, inits);
    }

    public QDevicePinSensorConf(Class<? extends DevicePinSensorConf> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.deviceDetails = inits.isInitialized("deviceDetails") ? new QDeviceDetails(forProperty("deviceDetails"), inits.get("deviceDetails")) : null;
        this.sensorDataType = inits.isInitialized("sensorDataType") ? new QSensorDataType(forProperty("sensorDataType")) : null;
    }

}

