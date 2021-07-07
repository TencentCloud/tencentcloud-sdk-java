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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIModelChannelResponse extends AbstractModel{

    /**
    * 推送类型。ckafka：消息队列；forward：http/https推送
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 第三方推送地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForwardAddress")
    @Expose
    private String ForwardAddress;

    /**
    * 第三方推送密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForwardKey")
    @Expose
    private String ForwardKey;

    /**
    * ckafka地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CKafkaRegion")
    @Expose
    private String CKafkaRegion;

    /**
    * ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CKafkaInstance")
    @Expose
    private String CKafkaInstance;

    /**
    * ckafka订阅主题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CKafkaTopic")
    @Expose
    private String CKafkaTopic;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 推送类型。ckafka：消息队列；forward：http/https推送 
     * @return Type 推送类型。ckafka：消息队列；forward：http/https推送
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 推送类型。ckafka：消息队列；forward：http/https推送
     * @param Type 推送类型。ckafka：消息队列；forward：http/https推送
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 第三方推送地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForwardAddress 第三方推送地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForwardAddress() {
        return this.ForwardAddress;
    }

    /**
     * Set 第三方推送地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForwardAddress 第三方推送地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForwardAddress(String ForwardAddress) {
        this.ForwardAddress = ForwardAddress;
    }

    /**
     * Get 第三方推送密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForwardKey 第三方推送密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForwardKey() {
        return this.ForwardKey;
    }

    /**
     * Set 第三方推送密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForwardKey 第三方推送密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForwardKey(String ForwardKey) {
        this.ForwardKey = ForwardKey;
    }

    /**
     * Get ckafka地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CKafkaRegion ckafka地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCKafkaRegion() {
        return this.CKafkaRegion;
    }

    /**
     * Set ckafka地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param CKafkaRegion ckafka地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCKafkaRegion(String CKafkaRegion) {
        this.CKafkaRegion = CKafkaRegion;
    }

    /**
     * Get ckafka实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CKafkaInstance ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCKafkaInstance() {
        return this.CKafkaInstance;
    }

    /**
     * Set ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param CKafkaInstance ckafka实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCKafkaInstance(String CKafkaInstance) {
        this.CKafkaInstance = CKafkaInstance;
    }

    /**
     * Get ckafka订阅主题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CKafkaTopic ckafka订阅主题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCKafkaTopic() {
        return this.CKafkaTopic;
    }

    /**
     * Set ckafka订阅主题
注意：此字段可能返回 null，表示取不到有效值。
     * @param CKafkaTopic ckafka订阅主题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCKafkaTopic(String CKafkaTopic) {
        this.CKafkaTopic = CKafkaTopic;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAIModelChannelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIModelChannelResponse(DescribeAIModelChannelResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ForwardAddress != null) {
            this.ForwardAddress = new String(source.ForwardAddress);
        }
        if (source.ForwardKey != null) {
            this.ForwardKey = new String(source.ForwardKey);
        }
        if (source.CKafkaRegion != null) {
            this.CKafkaRegion = new String(source.CKafkaRegion);
        }
        if (source.CKafkaInstance != null) {
            this.CKafkaInstance = new String(source.CKafkaInstance);
        }
        if (source.CKafkaTopic != null) {
            this.CKafkaTopic = new String(source.CKafkaTopic);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ForwardAddress", this.ForwardAddress);
        this.setParamSimple(map, prefix + "ForwardKey", this.ForwardKey);
        this.setParamSimple(map, prefix + "CKafkaRegion", this.CKafkaRegion);
        this.setParamSimple(map, prefix + "CKafkaInstance", this.CKafkaInstance);
        this.setParamSimple(map, prefix + "CKafkaTopic", this.CKafkaTopic);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

