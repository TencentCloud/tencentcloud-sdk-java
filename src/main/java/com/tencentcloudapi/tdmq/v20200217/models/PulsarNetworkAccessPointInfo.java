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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PulsarNetworkAccessPointInfo extends AbstractModel {

    /**
    * vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 接入地址
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
    */
    @SerializedName("RouteType")
    @Expose
    private Long RouteType;

    /**
    * 0：本地域访问，由于并没有配置跨地域容灾，所该类型的接入点，无法进行异地切换、异地访问切回；
1：本地域访问，由于配置了跨地域容灾，随时可以进行异地切换，该状态用于主集群的接入点
2：跨地域访问，已经完成了异地切换，该状态用于源集群的接入点，该状态下的接入点不可删除
3：跨地域访问，随时可以进行异地访问切回，该状态用于目标集群的接入点，该状态下的接入点不可删除
4:跨地域访问，目标集群已经完成异地切回，等待删除状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * 接入点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessPointsType")
    @Expose
    private String AccessPointsType;

    /**
    * 带宽，目前只有公网会有这个值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy [] SecurityPolicy;

    /**
    * 是否是标准的接入点 true是标准的 false不是标准的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardAccessPoint")
    @Expose
    private Boolean StandardAccessPoint;

    /**
    * 可用区信息
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 接入地址 
     * @return Endpoint 接入地址
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 接入地址
     * @param Endpoint 接入地址
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点 
     * @return RouteType 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
     */
    public Long getRouteType() {
        return this.RouteType;
    }

    /**
     * Set 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
     * @param RouteType 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
     */
    public void setRouteType(Long RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get 0：本地域访问，由于并没有配置跨地域容灾，所该类型的接入点，无法进行异地切换、异地访问切回；
1：本地域访问，由于配置了跨地域容灾，随时可以进行异地切换，该状态用于主集群的接入点
2：跨地域访问，已经完成了异地切换，该状态用于源集群的接入点，该状态下的接入点不可删除
3：跨地域访问，随时可以进行异地访问切回，该状态用于目标集群的接入点，该状态下的接入点不可删除
4:跨地域访问，目标集群已经完成异地切回，等待删除状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationType 0：本地域访问，由于并没有配置跨地域容灾，所该类型的接入点，无法进行异地切换、异地访问切回；
1：本地域访问，由于配置了跨地域容灾，随时可以进行异地切换，该状态用于主集群的接入点
2：跨地域访问，已经完成了异地切换，该状态用于源集群的接入点，该状态下的接入点不可删除
3：跨地域访问，随时可以进行异地访问切回，该状态用于目标集群的接入点，该状态下的接入点不可删除
4:跨地域访问，目标集群已经完成异地切回，等待删除状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 0：本地域访问，由于并没有配置跨地域容灾，所该类型的接入点，无法进行异地切换、异地访问切回；
1：本地域访问，由于配置了跨地域容灾，随时可以进行异地切换，该状态用于主集群的接入点
2：跨地域访问，已经完成了异地切换，该状态用于源集群的接入点，该状态下的接入点不可删除
3：跨地域访问，随时可以进行异地访问切回，该状态用于目标集群的接入点，该状态下的接入点不可删除
4:跨地域访问，目标集群已经完成异地切回，等待删除状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationType 0：本地域访问，由于并没有配置跨地域容灾，所该类型的接入点，无法进行异地切换、异地访问切回；
1：本地域访问，由于配置了跨地域容灾，随时可以进行异地切换，该状态用于主集群的接入点
2：跨地域访问，已经完成了异地切换，该状态用于源集群的接入点，该状态下的接入点不可删除
3：跨地域访问，随时可以进行异地访问切回，该状态用于目标集群的接入点，该状态下的接入点不可删除
4:跨地域访问，目标集群已经完成异地切回，等待删除状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 接入点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessPointsType 接入点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessPointsType() {
        return this.AccessPointsType;
    }

    /**
     * Set 接入点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessPointsType 接入点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessPointsType(String AccessPointsType) {
        this.AccessPointsType = AccessPointsType;
    }

    /**
     * Get 带宽，目前只有公网会有这个值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 带宽，目前只有公网会有这个值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽，目前只有公网会有这个值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 带宽，目前只有公网会有这个值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityPolicy 类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityPolicy [] getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set 类
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityPolicy 类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityPolicy(SecurityPolicy [] SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get 是否是标准的接入点 true是标准的 false不是标准的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardAccessPoint 是否是标准的接入点 true是标准的 false不是标准的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStandardAccessPoint() {
        return this.StandardAccessPoint;
    }

    /**
     * Set 是否是标准的接入点 true是标准的 false不是标准的
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardAccessPoint 是否是标准的接入点 true是标准的 false不是标准的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardAccessPoint(Boolean StandardAccessPoint) {
        this.StandardAccessPoint = StandardAccessPoint;
    }

    /**
     * Get 可用区信息 
     * @return ZoneName 可用区信息
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区信息
     * @param ZoneName 可用区信息
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public PulsarNetworkAccessPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarNetworkAccessPointInfo(PulsarNetworkAccessPointInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteType != null) {
            this.RouteType = new Long(source.RouteType);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.AccessPointsType != null) {
            this.AccessPointsType = new String(source.AccessPointsType);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.SecurityPolicy != null) {
            this.SecurityPolicy = new SecurityPolicy[source.SecurityPolicy.length];
            for (int i = 0; i < source.SecurityPolicy.length; i++) {
                this.SecurityPolicy[i] = new SecurityPolicy(source.SecurityPolicy[i]);
            }
        }
        if (source.StandardAccessPoint != null) {
            this.StandardAccessPoint = new Boolean(source.StandardAccessPoint);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "AccessPointsType", this.AccessPointsType);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);
        this.setParamSimple(map, prefix + "StandardAccessPoint", this.StandardAccessPoint);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

