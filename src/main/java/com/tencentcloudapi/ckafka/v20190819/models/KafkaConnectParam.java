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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaConnectParam extends AbstractModel {

    /**
    * Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 是否为自建集群
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
    * Kafka连接的broker地址, NetworkType=PUBLIC公网时必填
    */
    @SerializedName("BrokerAddress")
    @Expose
    private String BrokerAddress;

    /**
    * CKafka连接源的实例资源地域, 跨地域时必填
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 网络类型：PUBLIC公网；VPC
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * vpcId，NetworkType=VPC时必传
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * vip，NetworkType=VPC时必传
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * 端口，NetworkType=VPC时必传
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 跨云同步下需要客户传递唯一Id标志一组资源
    */
    @SerializedName("CrossNetResourceUniqueId")
    @Expose
    private String CrossNetResourceUniqueId;

    /**
    * 跨云子网ID
    */
    @SerializedName("CrossNetVpcSubNetId")
    @Expose
    private String CrossNetVpcSubNetId;

    /**
     * Get Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id 
     * @return Resource Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id
     * @param Resource Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 是否为自建集群 
     * @return SelfBuilt 是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
     * @param SelfBuilt 是否为自建集群
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
     * Get Kafka连接的broker地址, NetworkType=PUBLIC公网时必填 
     * @return BrokerAddress Kafka连接的broker地址, NetworkType=PUBLIC公网时必填
     */
    public String getBrokerAddress() {
        return this.BrokerAddress;
    }

    /**
     * Set Kafka连接的broker地址, NetworkType=PUBLIC公网时必填
     * @param BrokerAddress Kafka连接的broker地址, NetworkType=PUBLIC公网时必填
     */
    public void setBrokerAddress(String BrokerAddress) {
        this.BrokerAddress = BrokerAddress;
    }

    /**
     * Get CKafka连接源的实例资源地域, 跨地域时必填 
     * @return Region CKafka连接源的实例资源地域, 跨地域时必填
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set CKafka连接源的实例资源地域, 跨地域时必填
     * @param Region CKafka连接源的实例资源地域, 跨地域时必填
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 网络类型：PUBLIC公网；VPC 
     * @return NetworkType 网络类型：PUBLIC公网；VPC
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型：PUBLIC公网；VPC
     * @param NetworkType 网络类型：PUBLIC公网；VPC
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get vpcId，NetworkType=VPC时必传 
     * @return UniqVpcId vpcId，NetworkType=VPC时必传
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpcId，NetworkType=VPC时必传
     * @param UniqVpcId vpcId，NetworkType=VPC时必传
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get vip，NetworkType=VPC时必传 
     * @return ServiceVip vip，NetworkType=VPC时必传
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set vip，NetworkType=VPC时必传
     * @param ServiceVip vip，NetworkType=VPC时必传
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get 端口，NetworkType=VPC时必传 
     * @return Port 端口，NetworkType=VPC时必传
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口，NetworkType=VPC时必传
     * @param Port 端口，NetworkType=VPC时必传
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 跨云同步下需要客户传递唯一Id标志一组资源 
     * @return CrossNetResourceUniqueId 跨云同步下需要客户传递唯一Id标志一组资源
     */
    public String getCrossNetResourceUniqueId() {
        return this.CrossNetResourceUniqueId;
    }

    /**
     * Set 跨云同步下需要客户传递唯一Id标志一组资源
     * @param CrossNetResourceUniqueId 跨云同步下需要客户传递唯一Id标志一组资源
     */
    public void setCrossNetResourceUniqueId(String CrossNetResourceUniqueId) {
        this.CrossNetResourceUniqueId = CrossNetResourceUniqueId;
    }

    /**
     * Get 跨云子网ID 
     * @return CrossNetVpcSubNetId 跨云子网ID
     */
    public String getCrossNetVpcSubNetId() {
        return this.CrossNetVpcSubNetId;
    }

    /**
     * Set 跨云子网ID
     * @param CrossNetVpcSubNetId 跨云子网ID
     */
    public void setCrossNetVpcSubNetId(String CrossNetVpcSubNetId) {
        this.CrossNetVpcSubNetId = CrossNetVpcSubNetId;
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
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CrossNetResourceUniqueId != null) {
            this.CrossNetResourceUniqueId = new String(source.CrossNetResourceUniqueId);
        }
        if (source.CrossNetVpcSubNetId != null) {
            this.CrossNetVpcSubNetId = new String(source.CrossNetVpcSubNetId);
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
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CrossNetResourceUniqueId", this.CrossNetResourceUniqueId);
        this.setParamSimple(map, prefix + "CrossNetVpcSubNetId", this.CrossNetVpcSubNetId);

    }
}

