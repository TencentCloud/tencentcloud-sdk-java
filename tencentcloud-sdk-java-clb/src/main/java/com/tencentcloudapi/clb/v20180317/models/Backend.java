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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Backend extends AbstractModel{

    /**
    * 后端服务的类型，可取：CVM、ENI（即将支持）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 后端服务的唯一 ID，如 ins-abcd1234
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 后端服务的监听端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 后端服务的外网 IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 后端服务的内网 IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 后端服务的实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 后端服务被绑定的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisteredTime")
    @Expose
    private String RegisteredTime;

    /**
    * 弹性网卡唯一ID，如 eni-1234abcd
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
     * Get 后端服务的类型，可取：CVM、ENI（即将支持） 
     * @return Type 后端服务的类型，可取：CVM、ENI（即将支持）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 后端服务的类型，可取：CVM、ENI（即将支持）
     * @param Type 后端服务的类型，可取：CVM、ENI（即将支持）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 后端服务的唯一 ID，如 ins-abcd1234 
     * @return InstanceId 后端服务的唯一 ID，如 ins-abcd1234
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 后端服务的唯一 ID，如 ins-abcd1234
     * @param InstanceId 后端服务的唯一 ID，如 ins-abcd1234
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 后端服务的监听端口 
     * @return Port 后端服务的监听端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 后端服务的监听端口
     * @param Port 后端服务的监听端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 后端服务的转发权重，取值范围：[0, 100]，默认为 10。 
     * @return Weight 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
     * @param Weight 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 后端服务的外网 IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses 后端服务的外网 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 后端服务的外网 IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses 后端服务的外网 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 后端服务的内网 IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIpAddresses 后端服务的内网 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 后端服务的内网 IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIpAddresses 后端服务的内网 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 后端服务的实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 后端服务的实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 后端服务的实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 后端服务的实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 后端服务被绑定的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisteredTime 后端服务被绑定的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegisteredTime() {
        return this.RegisteredTime;
    }

    /**
     * Set 后端服务被绑定的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisteredTime 后端服务被绑定的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisteredTime(String RegisteredTime) {
        this.RegisteredTime = RegisteredTime;
    }

    /**
     * Get 弹性网卡唯一ID，如 eni-1234abcd
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EniId 弹性网卡唯一ID，如 eni-1234abcd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set 弹性网卡唯一ID，如 eni-1234abcd
注意：此字段可能返回 null，表示取不到有效值。
     * @param EniId 弹性网卡唯一ID，如 eni-1234abcd
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);
        this.setParamSimple(map, prefix + "EniId", this.EniId);

    }
}

