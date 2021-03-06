package com.ravenpack.aws.sample.model;

import com.ravenpack.aws.reactor.ddb.datamodeling.DynamoDBDocument;
import com.ravenpack.aws.reactor.ddb.datamodeling.DynamoDBHashKey;
import com.ravenpack.aws.reactor.ddb.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Value;
import lombok.With;

@With
@Builder
@Value
@DynamoDBTable
public class InternalDocumentTable
{

    @DynamoDBHashKey
    String uid;

    String payload;

    InternalDocumentContent content;

    @With
    @Value
    @Builder
    @DynamoDBDocument
    public static class InternalDocumentContent
    {

        String payload;
    }
}

