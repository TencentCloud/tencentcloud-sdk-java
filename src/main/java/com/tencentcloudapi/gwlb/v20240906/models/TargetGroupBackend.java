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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupBackend extends AbstractModel {

    /**
    * 目标组ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 后端服务的类型，可取：CVM、ENI（即将支持）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 后端服务的唯一 ID
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
    * 弹性网卡唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
    * 后端服务的可用区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get 目标组ID 
     * @return TargetGroupId 目标组ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID
     * @param TargetGroupId 目标组ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

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
     * Get 后端服务的唯一 ID 
     * @return InstanceId 后端服务的唯一 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 后端服务的唯一 ID
     * @param InstanceId 后端服务的唯一 ID
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
     * Get 弹性网卡唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EniId 弹性网卡唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set 弹性网卡唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EniId 弹性网卡唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Get 后端服务的可用区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 后端服务的可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 后端服务的可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 后端服务的可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    public TargetGroupBackend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupBackend(TargetGroupBackend source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegisteredTime != null) {
            this.RegisteredTime = new String(source.RegisteredTime);
        }
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);
        this.setParamSimple(map, prefix + "EniId", this.EniId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

