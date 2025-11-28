/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMsgResponse extends AbstractModel {

    /**
    * 消息属性。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 消息体。
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 批次ID。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 生产时间。
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 消息ID。
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 生产者名称。
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 消息 key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 消息属性。 
     * @return Properties 消息属性。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 消息属性。
     * @param Properties 消息属性。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 消息体。 
     * @return Body 消息体。
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 消息体。
     * @param Body 消息体。
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 批次ID。 
     * @return BatchId 批次ID。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID。
     * @param BatchId 批次ID。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 生产时间。 
     * @return ProduceTime 生产时间。
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 生产时间。
     * @param ProduceTime 生产时间。
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 消息ID。 
     * @return MsgId 消息ID。
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息ID。
     * @param MsgId 消息ID。
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 生产者名称。 
     * @return ProducerName 生产者名称。
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 生产者名称。
     * @param ProducerName 生产者名称。
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 消息 key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 消息 key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 消息 key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 消息 key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMsgResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgResponse(DescribeMsgResponse source) {
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

