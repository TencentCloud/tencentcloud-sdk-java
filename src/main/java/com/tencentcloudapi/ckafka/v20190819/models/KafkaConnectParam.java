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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaConnectParam extends AbstractModel{

    /**
    * Kafka连接源的实例资源, 非自建时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * Kafka连接的broker地址, 自建时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerAddress")
    @Expose
    private String BrokerAddress;

    /**
    * CKafka连接源的实例资源地域, 跨地域时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Kafka连接源的实例资源, 非自建时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource Kafka连接源的实例资源, 非自建时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Kafka连接源的实例资源, 非自建时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource Kafka连接源的实例资源, 非自建时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfBuilt 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfBuilt 是否为自建集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get Kafka连接的broker地址, 自建时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerAddress Kafka连接的broker地址, 自建时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerAddress() {
        return this.BrokerAddress;
    }

    /**
     * Set Kafka连接的broker地址, 自建时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerAddress Kafka连接的broker地址, 自建时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerAddress(String BrokerAddress) {
        this.BrokerAddress = BrokerAddress;
    }

    /**
     * Get CKafka连接源的实例资源地域, 跨地域时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region CKafka连接源的实例资源地域, 跨地域时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set CKafka连接源的实例资源地域, 跨地域时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region CKafka连接源的实例资源地域, 跨地域时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public KafkaConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaConnectParam(KafkaConnectParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.BrokerAddress != null) {
            this.BrokerAddress = new String(source.BrokerAddress);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "BrokerAddress", this.BrokerAddress);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

