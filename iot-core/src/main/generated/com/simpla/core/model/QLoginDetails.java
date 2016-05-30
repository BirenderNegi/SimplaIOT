package com.simpla.core.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QLoginDetails is a Querydsl query type for LoginDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLoginDetails extends EntityPathBase<LoginDetails> {

    private static final long serialVersionUID = -1564068390L;

    public static final QLoginDetails loginDetails = new QLoginDetails("loginDetails");

    public final NumberPath<Integer> loginDetailId = createNumber("loginDetailId", Integer.class);

    public final StringPath password = createString("password");

    public final NumberPath<UserDetails> userDetails = createNumber("userDetails", UserDetails.class);

    public final StringPath userName = createString("userName");

    public QLoginDetails(String variable) {
        super(LoginDetails.class, forVariable(variable));
    }

    public QLoginDetails(Path<? extends LoginDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoginDetails(PathMetadata<?> metadata) {
        super(LoginDetails.class, metadata);
    }

}

