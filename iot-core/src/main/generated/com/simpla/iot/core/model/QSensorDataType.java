package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSensorDataType is a Querydsl query type for SensorDataType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSensorDataType extends EntityPathBase<SensorDataType> {

    private static final long serialVersionUID = -667347329L;

    public static final QSensorDataType sensorDataType = new QSensorDataType("sensorDataType");

    public final SetPath<DevicePinSensorConf, QDevicePinSensorConf> devicePinSensorConfs = this.<DevicePinSensorConf, QDevicePinSensorConf>createSet("devicePinSensorConfs", DevicePinSensorConf.class, QDevicePinSensorConf.class, PathInits.DIRECT2);

    public final StringPath sensorTypeDesc = createString("sensorTypeDesc");

    public final NumberPath<Integer> sensorTypeId = createNumber("sensorTypeId", Integer.class);

    public final StringPath type = createString("type");

    public QSensorDataType(String variable) {
        super(SensorDataType.class, forVariable(variable));
    }

    public QSensorDataType(Path<? extends SensorDataType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSensorDataType(PathMetadata<?> metadata) {
        super(SensorDataType.class, metadata);
    }

}

