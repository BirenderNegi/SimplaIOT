package com.simpla.iot.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSensorData is a Querydsl query type for SensorData
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSensorData extends EntityPathBase<SensorData> {

    private static final long serialVersionUID = 1543138725L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSensorData sensorData = new QSensorData("sensorData");

    public final QDeviceDetails deviceDetails;

    public final NumberPath<Integer> devicePinNumber = createNumber("devicePinNumber", Integer.class);

    public final NumberPath<Integer> sensorDataId = createNumber("sensorDataId", Integer.class);

    public final NumberPath<Float> sensorValue = createNumber("sensorValue", Float.class);

    public QSensorData(String variable) {
        this(SensorData.class, forVariable(variable), INITS);
    }

    public QSensorData(Path<? extends SensorData> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSensorData(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSensorData(PathMetadata<?> metadata, PathInits inits) {
        this(SensorData.class, metadata, inits);
    }

    public QSensorData(Class<? extends SensorData> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.deviceDetails = inits.isInitialized("deviceDetails") ? new QDeviceDetails(forProperty("deviceDetails"), inits.get("deviceDetails")) : null;
    }

}

