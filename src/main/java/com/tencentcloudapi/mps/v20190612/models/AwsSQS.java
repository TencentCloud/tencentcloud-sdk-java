/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AwsSQS extends AbstractModel{

    /**
    * SQS 队列区域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQSRegion")
    @Expose
    private String SQSRegion;

    /**
    * SQS 队列名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQSQueueName")
    @Expose
    private String SQSQueueName;

    /**
    * 读写SQS的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3SecretId")
    @Expose
    private String S3SecretId;

    /**
    * 读写SQS的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3SecretKey")
    @Expose
    private String S3SecretKey;

    /**
     * Get SQS 队列区域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQSRegion SQS 队列区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSQSRegion() {
        return this.SQSRegion;
    }

    /**
     * Set SQS 队列区域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQSRegion SQS 队列区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQSRegion(String SQSRegion) {
        this.SQSRegion = SQSRegion;
    }

    /**
     * Get SQS 队列名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQSQueueName SQS 队列名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSQSQueueName() {
        return this.SQSQueueName;
    }

    /**
     * Set SQS 队列名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQSQueueName SQS 队列名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQSQueueName(String SQSQueueName) {
        this.SQSQueueName = SQSQueueName;
    }

    /**
     * Get 读写SQS的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3SecretId 读写SQS的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3SecretId() {
        return this.S3SecretId;
    }

    /**
     * Set 读写SQS的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3SecretId 读写SQS的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3SecretId(String S3SecretId) {
        this.S3SecretId = S3SecretId;
    }

    /**
     * Get 读写SQS的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3SecretKey 读写SQS的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3SecretKey() {
        return this.S3SecretKey;
    }

    /**
     * Set 读写SQS的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3SecretKey 读写SQS的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3SecretKey(String S3SecretKey) {
        this.S3SecretKey = S3SecretKey;
    }

    public AwsSQS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AwsSQS(AwsSQS source) {
        if (source.SQSRegion != null) {
            this.SQSRegion = new String(source.SQSRegion);
        }
        if (source.SQSQueueName != null) {
            this.SQSQueueName = new String(source.SQSQueueName);
        }
        if (source.S3SecretId != null) {
            this.S3SecretId = new String(source.S3SecretId);
        }
        if (source.S3SecretKey != null) {
            this.S3SecretKey = new String(source.S3SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SQSRegion", this.SQSRegion);
        this.setParamSimple(map, prefix + "SQSQueueName", this.SQSQueueName);
        this.setParamSimple(map, prefix + "S3SecretId", this.S3SecretId);
        this.setParamSimple(map, prefix + "S3SecretKey", this.S3SecretKey);

    }
}

