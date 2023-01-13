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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstanceDetailResponse extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例业务状态。取值范围：

1：正在创建
2：运行中
3：异常
4：重建中
5：销毁中
6：已停服
8：欠费停服中
9：欠费已停服
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * 计费状态

1：正常
2：过期
3：销毁
4：分配中
5：分配失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * 是否开启 Grafana
0：不开启
1：开启
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * 实例计费模式。取值范围：

2：包年包月
3：按量
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * 规格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 存储周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 自动续费标记

0：不自动续费
1：开启自动续费
2：禁止自动续费
-1：无效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 ID 
     * @return SubnetId 子网 ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID
     * @param SubnetId 子网 ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例业务状态。取值范围：

1：正在创建
2：运行中
3：异常
4：重建中
5：销毁中
6：已停服
8：欠费停服中
9：欠费已停服 
     * @return InstanceStatus 实例业务状态。取值范围：

1：正在创建
2：运行中
3：异常
4：重建中
5：销毁中
6：已停服
8：欠费停服中
9：欠费已停服
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例业务状态。取值范围：

1：正在创建
2：运行中
3：异常
4：重建中
5：销毁中
6：已停服
8：欠费停服中
9：欠费已停服
     * @param InstanceStatus 实例业务状态。取值范围：

1：正在创建
2：运行中
3：异常
4：重建中
5：销毁中
6：已停服
8：欠费停服中
9：欠费已停服
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 计费状态

1：正常
2：过期
3：销毁
4：分配中
5：分配失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus 计费状态

1：正常
2：过期
3：销毁
4：分配中
5：分配失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set 计费状态

1：正常
2：过期
3：销毁
4：分配中
5：分配失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus 计费状态

1：正常
2：过期
3：销毁
4：分配中
5：分配失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get 是否开启 Grafana
0：不开启
1：开启 
     * @return EnableGrafana 是否开启 Grafana
0：不开启
1：开启
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set 是否开启 Grafana
0：不开启
1：开启
     * @param EnableGrafana 是否开启 Grafana
0：不开启
1：开启
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
    }

    /**
     * Get Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaURL Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaURL Grafana 面板 URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    /**
     * Get 实例计费模式。取值范围：

2：包年包月
3：按量 
     * @return InstanceChargeType 实例计费模式。取值范围：

2：包年包月
3：按量
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费模式。取值范围：

2：包年包月
3：按量
     * @param InstanceChargeType 实例计费模式。取值范围：

2：包年包月
3：按量
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 规格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName 规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 存储周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataRetentionTime 存储周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set 存储周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataRetentionTime 存储周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 购买的实例过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 自动续费标记

0：不自动续费
1：开启自动续费
2：禁止自动续费
-1：无效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标记

0：不自动续费
1：开启自动续费
2：禁止自动续费
-1：无效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记

0：不自动续费
1：开启自动续费
2：禁止自动续费
-1：无效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标记

0：不自动续费
1：开启自动续费
2：禁止自动续费
-1：无效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
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

    public DescribePrometheusInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstanceDetailResponse(DescribePrometheusInstanceDetailResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.EnableGrafana != null) {
            this.EnableGrafana = new Long(source.EnableGrafana);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "EnableGrafana", this.EnableGrafana);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

