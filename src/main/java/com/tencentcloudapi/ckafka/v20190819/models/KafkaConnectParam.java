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
    * <p>Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>是否为自建集群</p>
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * <p>是否更新到关联的Dip任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * <p>Kafka连接的broker地址, NetworkType=PUBLIC公网时必填</p>
    */
    @SerializedName("BrokerAddress")
    @Expose
    private String BrokerAddress;

    /**
    * <p>CKafka连接源的实例资源地域, 跨地域时必填</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>网络类型：PUBLIC公网；VPC</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>vpcId，NetworkType=VPC时必传</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>vip，NetworkType=VPC时必传</p>
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * <p>端口，NetworkType=VPC时必传</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>跨云同步下需要客户传递唯一Id标志一组资源</p>
    */
    @SerializedName("CrossNetResourceUniqueId")
    @Expose
    private String CrossNetResourceUniqueId;

    /**
    * <p>跨云子网ID</p>
    */
    @SerializedName("CrossNetVpcSubNetId")
    @Expose
    private String CrossNetVpcSubNetId;

    /**
    * <p>用户输入原始broker接入点地址</p>
    */
    @SerializedName("OriginalBrokerAddresses")
    @Expose
    private String OriginalBrokerAddresses;

    /**
     * Get <p>Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id</p> 
     * @return Resource <p>Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id</p>
     * @param Resource <p>Kafka连接源的实例资源, 非自建时必填，NetworkType=VPC时传clb实例id</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>是否为自建集群</p> 
     * @return SelfBuilt <p>是否为自建集群</p>
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set <p>是否为自建集群</p>
     * @param SelfBuilt <p>是否为自建集群</p>
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get <p>是否更新到关联的Dip任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate <p>是否更新到关联的Dip任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set <p>是否更新到关联的Dip任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate <p>是否更新到关联的Dip任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get <p>Kafka连接的broker地址, NetworkType=PUBLIC公网时必填</p> 
     * @return BrokerAddress <p>Kafka连接的broker地址, NetworkType=PUBLIC公网时必填</p>
     */
    public String getBrokerAddress() {
        return this.BrokerAddress;
    }

    /**
     * Set <p>Kafka连接的broker地址, NetworkType=PUBLIC公网时必填</p>
     * @param BrokerAddress <p>Kafka连接的broker地址, NetworkType=PUBLIC公网时必填</p>
     */
    public void setBrokerAddress(String BrokerAddress) {
        this.BrokerAddress = BrokerAddress;
    }

    /**
     * Get <p>CKafka连接源的实例资源地域, 跨地域时必填</p> 
     * @return Region <p>CKafka连接源的实例资源地域, 跨地域时必填</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>CKafka连接源的实例资源地域, 跨地域时必填</p>
     * @param Region <p>CKafka连接源的实例资源地域, 跨地域时必填</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>网络类型：PUBLIC公网；VPC</p> 
     * @return NetworkType <p>网络类型：PUBLIC公网；VPC</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型：PUBLIC公网；VPC</p>
     * @param NetworkType <p>网络类型：PUBLIC公网；VPC</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>vpcId，NetworkType=VPC时必传</p> 
     * @return UniqVpcId <p>vpcId，NetworkType=VPC时必传</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>vpcId，NetworkType=VPC时必传</p>
     * @param UniqVpcId <p>vpcId，NetworkType=VPC时必传</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>vip，NetworkType=VPC时必传</p> 
     * @return ServiceVip <p>vip，NetworkType=VPC时必传</p>
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set <p>vip，NetworkType=VPC时必传</p>
     * @param ServiceVip <p>vip，NetworkType=VPC时必传</p>
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get <p>端口，NetworkType=VPC时必传</p> 
     * @return Port <p>端口，NetworkType=VPC时必传</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口，NetworkType=VPC时必传</p>
     * @param Port <p>端口，NetworkType=VPC时必传</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>跨云同步下需要客户传递唯一Id标志一组资源</p> 
     * @return CrossNetResourceUniqueId <p>跨云同步下需要客户传递唯一Id标志一组资源</p>
     */
    public String getCrossNetResourceUniqueId() {
        return this.CrossNetResourceUniqueId;
    }

    /**
     * Set <p>跨云同步下需要客户传递唯一Id标志一组资源</p>
     * @param CrossNetResourceUniqueId <p>跨云同步下需要客户传递唯一Id标志一组资源</p>
     */
    public void setCrossNetResourceUniqueId(String CrossNetResourceUniqueId) {
        this.CrossNetResourceUniqueId = CrossNetResourceUniqueId;
    }

    /**
     * Get <p>跨云子网ID</p> 
     * @return CrossNetVpcSubNetId <p>跨云子网ID</p>
     */
    public String getCrossNetVpcSubNetId() {
        return this.CrossNetVpcSubNetId;
    }

    /**
     * Set <p>跨云子网ID</p>
     * @param CrossNetVpcSubNetId <p>跨云子网ID</p>
     */
    public void setCrossNetVpcSubNetId(String CrossNetVpcSubNetId) {
        this.CrossNetVpcSubNetId = CrossNetVpcSubNetId;
    }

    /**
     * Get <p>用户输入原始broker接入点地址</p> 
     * @return OriginalBrokerAddresses <p>用户输入原始broker接入点地址</p>
     */
    public String getOriginalBrokerAddresses() {
        return this.OriginalBrokerAddresses;
    }

    /**
     * Set <p>用户输入原始broker接入点地址</p>
     * @param OriginalBrokerAddresses <p>用户输入原始broker接入点地址</p>
     */
    public void setOriginalBrokerAddresses(String OriginalBrokerAddresses) {
        this.OriginalBrokerAddresses = OriginalBrokerAddresses;
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
        if (source.OriginalBrokerAddresses != null) {
            this.OriginalBrokerAddresses = new String(source.OriginalBrokerAddresses);
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
        this.setParamSimple(map, prefix + "OriginalBrokerAddresses", this.OriginalBrokerAddresses);

    }
}

