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

public class CreateRocketMQVipInstanceRequest extends AbstractModel {

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集群规格，支持规格有 1.通用型:rocket-vip-basic-0; 2.基础型:rocket-vip-basic-1; 3.标准型:rocket-vip-basic-2; 4.高阶Ⅰ型:rocket-vip-basic-3; 5.高阶Ⅱ型:rocket-vip-basic-4
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 节点数量，最小2，最大20
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 单节点存储空间，GB为单位，最低200GB
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * VPC信息
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo VpcInfo;

    /**
    * 购买时长，月为单位
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 是否用于迁移上云，默认为false
    */
    @SerializedName("SupportsMigrateToCloud")
    @Expose
    private Boolean SupportsMigrateToCloud;

    /**
    * 是否开启公网
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * 公网带宽，在开启公网情况下为必传字段
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 公网白名单
    */
    @SerializedName("IpRules")
    @Expose
    private PublicAccessRule [] IpRules;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集群规格，支持规格有 1.通用型:rocket-vip-basic-0; 2.基础型:rocket-vip-basic-1; 3.标准型:rocket-vip-basic-2; 4.高阶Ⅰ型:rocket-vip-basic-3; 5.高阶Ⅱ型:rocket-vip-basic-4 
     * @return Spec 集群规格，支持规格有 1.通用型:rocket-vip-basic-0; 2.基础型:rocket-vip-basic-1; 3.标准型:rocket-vip-basic-2; 4.高阶Ⅰ型:rocket-vip-basic-3; 5.高阶Ⅱ型:rocket-vip-basic-4
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 集群规格，支持规格有 1.通用型:rocket-vip-basic-0; 2.基础型:rocket-vip-basic-1; 3.标准型:rocket-vip-basic-2; 4.高阶Ⅰ型:rocket-vip-basic-3; 5.高阶Ⅱ型:rocket-vip-basic-4
     * @param Spec 集群规格，支持规格有 1.通用型:rocket-vip-basic-0; 2.基础型:rocket-vip-basic-1; 3.标准型:rocket-vip-basic-2; 4.高阶Ⅰ型:rocket-vip-basic-3; 5.高阶Ⅱ型:rocket-vip-basic-4
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 节点数量，最小2，最大20 
     * @return NodeCount 节点数量，最小2，最大20
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量，最小2，最大20
     * @param NodeCount 节点数量，最小2，最大20
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 单节点存储空间，GB为单位，最低200GB 
     * @return StorageSize 单节点存储空间，GB为单位，最低200GB
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 单节点存储空间，GB为单位，最低200GB
     * @param StorageSize 单节点存储空间，GB为单位，最低200GB
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网 
     * @return ZoneIds 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
     * @param ZoneIds 节点部署的区域ID列表，如广州一区，则是100001，具体可查询腾讯云官网
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get VPC信息 
     * @return VpcInfo VPC信息
     */
    public VpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set VPC信息
     * @param VpcInfo VPC信息
     */
    public void setVpcInfo(VpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 购买时长，月为单位 
     * @return TimeSpan 购买时长，月为单位
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长，月为单位
     * @param TimeSpan 购买时长，月为单位
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 是否用于迁移上云，默认为false 
     * @return SupportsMigrateToCloud 是否用于迁移上云，默认为false
     */
    public Boolean getSupportsMigrateToCloud() {
        return this.SupportsMigrateToCloud;
    }

    /**
     * Set 是否用于迁移上云，默认为false
     * @param SupportsMigrateToCloud 是否用于迁移上云，默认为false
     */
    public void setSupportsMigrateToCloud(Boolean SupportsMigrateToCloud) {
        this.SupportsMigrateToCloud = SupportsMigrateToCloud;
    }

    /**
     * Get 是否开启公网 
     * @return EnablePublic 是否开启公网
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set 是否开启公网
     * @param EnablePublic 是否开启公网
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get 公网带宽，在开启公网情况下为必传字段 
     * @return Bandwidth 公网带宽，在开启公网情况下为必传字段
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽，在开启公网情况下为必传字段
     * @param Bandwidth 公网带宽，在开启公网情况下为必传字段
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 公网白名单 
     * @return IpRules 公网白名单
     */
    public PublicAccessRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set 公网白名单
     * @param IpRules 公网白名单
     */
    public void setIpRules(PublicAccessRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateRocketMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQVipInstanceRequest(CreateRocketMQVipInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo(source.VpcInfo);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.SupportsMigrateToCloud != null) {
            this.SupportsMigrateToCloud = new Boolean(source.SupportsMigrateToCloud);
        }
        if (source.EnablePublic != null) {
            this.EnablePublic = new Boolean(source.EnablePublic);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new PublicAccessRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new PublicAccessRule(source.IpRules[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "SupportsMigrateToCloud", this.SupportsMigrateToCloud);
        this.setParamSimple(map, prefix + "EnablePublic", this.EnablePublic);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

