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

public class GrafanaInstanceInfo extends AbstractModel{

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网 ID 数组
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Grafana 内网地址
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * Grafana 公网地址
    */
    @SerializedName("InternalUrl")
    @Expose
    private String InternalUrl;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:停机中； 6:已停机； 7: 已删除）
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * 实例的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * 实例的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 计费模式（1:包年包月）
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * VPC 名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 地域 ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可访问此实例的完整 URL
    */
    @SerializedName("RootUrl")
    @Expose
    private String RootUrl;

    /**
    * 是否开启 SSO
    */
    @SerializedName("EnableSSO")
    @Expose
    private Boolean EnableSSO;

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * SSO登录时是否开启cam鉴权
    */
    @SerializedName("EnableSSOCamCheck")
    @Expose
    private Boolean EnableSSOCamCheck;

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get 子网 ID 数组 
     * @return SubnetIds 子网 ID 数组
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网 ID 数组
     * @param SubnetIds 子网 ID 数组
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Grafana 内网地址 
     * @return InternetUrl Grafana 内网地址
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set Grafana 内网地址
     * @param InternetUrl Grafana 内网地址
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get Grafana 公网地址 
     * @return InternalUrl Grafana 公网地址
     */
    public String getInternalUrl() {
        return this.InternalUrl;
    }

    /**
     * Set Grafana 公网地址
     * @param InternalUrl Grafana 公网地址
     */
    public void setInternalUrl(String InternalUrl) {
        this.InternalUrl = InternalUrl;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:停机中； 6:已停机； 7: 已删除） 
     * @return InstanceStatus 运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:停机中； 6:已停机； 7: 已删除）
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:停机中； 6:已停机； 7: 已删除）
     * @param InstanceStatus 运行状态（1:正在创建；2:运行中；3:异常；4:重启中；5:停机中； 6:已停机； 7: 已删除）
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 实例的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 实例的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 实例的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 实例的可用区 
     * @return Zone 实例的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例的可用区
     * @param Zone 实例的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 计费模式（1:包年包月） 
     * @return InstanceChargeType 计费模式（1:包年包月）
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 计费模式（1:包年包月）
     * @param InstanceChargeType 计费模式（1:包年包月）
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get VPC 名称 
     * @return VpcName VPC 名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC 名称
     * @param VpcName VPC 名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 地域 ID 
     * @return RegionId 地域 ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID
     * @param RegionId 地域 ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可访问此实例的完整 URL 
     * @return RootUrl 可访问此实例的完整 URL
     */
    public String getRootUrl() {
        return this.RootUrl;
    }

    /**
     * Set 可访问此实例的完整 URL
     * @param RootUrl 可访问此实例的完整 URL
     */
    public void setRootUrl(String RootUrl) {
        this.RootUrl = RootUrl;
    }

    /**
     * Get 是否开启 SSO 
     * @return EnableSSO 是否开启 SSO
     */
    public Boolean getEnableSSO() {
        return this.EnableSSO;
    }

    /**
     * Set 是否开启 SSO
     * @param EnableSSO 是否开启 SSO
     */
    public void setEnableSSO(Boolean EnableSSO) {
        this.EnableSSO = EnableSSO;
    }

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get SSO登录时是否开启cam鉴权 
     * @return EnableSSOCamCheck SSO登录时是否开启cam鉴权
     */
    public Boolean getEnableSSOCamCheck() {
        return this.EnableSSOCamCheck;
    }

    /**
     * Set SSO登录时是否开启cam鉴权
     * @param EnableSSOCamCheck SSO登录时是否开启cam鉴权
     */
    public void setEnableSSOCamCheck(Boolean EnableSSOCamCheck) {
        this.EnableSSOCamCheck = EnableSSOCamCheck;
    }

    public GrafanaInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaInstanceInfo(GrafanaInstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.InternetUrl != null) {
            this.InternetUrl = new String(source.InternetUrl);
        }
        if (source.InternalUrl != null) {
            this.InternalUrl = new String(source.InternalUrl);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RootUrl != null) {
            this.RootUrl = new String(source.RootUrl);
        }
        if (source.EnableSSO != null) {
            this.EnableSSO = new Boolean(source.EnableSSO);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.EnableSSOCamCheck != null) {
            this.EnableSSOCamCheck = new Boolean(source.EnableSSOCamCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "InternalUrl", this.InternalUrl);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RootUrl", this.RootUrl);
        this.setParamSimple(map, prefix + "EnableSSO", this.EnableSSO);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "EnableSSOCamCheck", this.EnableSSOCamCheck);

    }
}

