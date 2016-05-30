package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDeviceDetails is a Querydsl query type for DeviceDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDeviceDetails extends EntityPathBase<DeviceDetails> {

    private static final long serialVersionUID = -1956135861L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeviceDetails deviceDetails = new QDeviceDetails("deviceDetails");

    public final NumberPath<Integer> deviceId = createNumber("deviceId", Integer.class);

    public final StringPath deviceName = createString("deviceName");

    public final SetPath<DevicePinSensorConf, QDevicePinSensorConf> devicePinSensorConfs = this.<DevicePinSensorConf, QDevicePinSensorConf>createSet("devicePinSensorConfs", DevicePinSensorConf.class, QDevicePinSensorConf.class, PathInits.DIRECT2);

    public final StringPath gatewayId = createString("gatewayId");

    public final QGroupDetails groupDetails;

    public final StringPath networkAddress = createString("networkAddress");

    public final QOrganization organization;

    public final SetPath<SensorData, QSensorData> sensorDatas = this.<SensorData, QSensorData>createSet("sensorDatas", SensorData.class, QSensorData.class, PathInits.DIRECT2);

    public final StringPath ssid = createString("ssid");

    public QDeviceDetails(String variable) {
        this(DeviceDetails.class, forVariable(variable), INITS);
    }

    public QDeviceDetails(Path<? extends DeviceDetails> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceDetails(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceDetails(PathMetadata<?> metadata, PathInits inits) {
        this(DeviceDetails.class, metadata, inits);
    }

    public QDeviceDetails(Class<? extends DeviceDetails> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.groupDetails = inits.isInitialized("groupDetails") ? new QGroupDetails(forProperty("groupDetails"), inits.get("groupDetails")) : null;
        this.organization = inits.isInitialized("organization") ? new QOrganization(forProperty("organization")) : null;
    }

}

