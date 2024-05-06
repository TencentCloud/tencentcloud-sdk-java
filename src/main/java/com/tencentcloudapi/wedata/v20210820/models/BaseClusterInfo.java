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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseClusterInfo extends AbstractModel {

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群类型，EMR/CDW等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCn")
    @Expose
    private String RegionCn;

    /**
    * 地域英文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionEn")
    @Expose
    private String RegionEn;

    /**
    * 地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * 集群是否使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Used")
    @Expose
    private Boolean Used;

    /**
    * 集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 集群状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusInfo")
    @Expose
    private String StatusInfo;

    /**
    * 集群存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 集群计算类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeType")
    @Expose
    private String ComputeType;

    /**
    * 集群资源量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterResource")
    @Expose
    private String ClusterResource;

    /**
    * 集群付费方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 额外配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraConf")
    @Expose
    private String ExtraConf;

    /**
    * ranger账号名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangerUserName")
    @Expose
    private String RangerUserName;

    /**
    * cdw账号（用于展示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdwUserName")
    @Expose
    private String CdwUserName;

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群类型，EMR/CDW等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型，EMR/CDW等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，EMR/CDW等
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型，EMR/CDW等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCn 地域中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCn() {
        return this.RegionCn;
    }

    /**
     * Set 地域中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCn 地域中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCn(String RegionCn) {
        this.RegionCn = RegionCn;
    }

    /**
     * Get 地域英文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionEn 地域英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionEn() {
        return this.RegionEn;
    }

    /**
     * Set 地域英文
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionEn 地域英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionEn(String RegionEn) {
        this.RegionEn = RegionEn;
    }

    /**
     * Get 地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionArea 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set 地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionArea 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get 集群是否使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Used 集群是否使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUsed() {
        return this.Used;
    }

    /**
     * Set 集群是否使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Used 集群是否使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsed(Boolean Used) {
        this.Used = Used;
    }

    /**
     * Get 集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 集群状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusInfo 集群状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set 集群状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusInfo 集群状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get 集群存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 集群存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 集群存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 集群存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 集群计算类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeType 集群计算类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeType() {
        return this.ComputeType;
    }

    /**
     * Set 集群计算类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeType 集群计算类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeType(String ComputeType) {
        this.ComputeType = ComputeType;
    }

    /**
     * Get 集群资源量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterResource 集群资源量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterResource() {
        return this.ClusterResource;
    }

    /**
     * Set 集群资源量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterResource 集群资源量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterResource(String ClusterResource) {
        this.ClusterResource = ClusterResource;
    }

    /**
     * Get 集群付费方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 集群付费方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 集群付费方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 集群付费方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 额外配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraConf 额外配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraConf() {
        return this.ExtraConf;
    }

    /**
     * Set 额外配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraConf 额外配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraConf(String ExtraConf) {
        this.ExtraConf = ExtraConf;
    }

    /**
     * Get ranger账号名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangerUserName ranger账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRangerUserName() {
        return this.RangerUserName;
    }

    /**
     * Set ranger账号名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangerUserName ranger账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangerUserName(String RangerUserName) {
        this.RangerUserName = RangerUserName;
    }

    /**
     * Get cdw账号（用于展示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdwUserName cdw账号（用于展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdwUserName() {
        return this.CdwUserName;
    }

    /**
     * Set cdw账号（用于展示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdwUserName cdw账号（用于展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdwUserName(String CdwUserName) {
        this.CdwUserName = CdwUserName;
    }

    public BaseClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseClusterInfo(BaseClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RegionCn != null) {
            this.RegionCn = new String(source.RegionCn);
        }
        if (source.RegionEn != null) {
            this.RegionEn = new String(source.RegionEn);
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.Used != null) {
            this.Used = new Boolean(source.Used);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new String(source.StatusInfo);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.ComputeType != null) {
            this.ComputeType = new String(source.ComputeType);
        }
        if (source.ClusterResource != null) {
            this.ClusterResource = new String(source.ClusterResource);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExtraConf != null) {
            this.ExtraConf = new String(source.ExtraConf);
        }
        if (source.RangerUserName != null) {
            this.RangerUserName = new String(source.RangerUserName);
        }
        if (source.CdwUserName != null) {
            this.CdwUserName = new String(source.CdwUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionCn", this.RegionCn);
        this.setParamSimple(map, prefix + "RegionEn", this.RegionEn);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusInfo", this.StatusInfo);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "ComputeType", this.ComputeType);
        this.setParamSimple(map, prefix + "ClusterResource", this.ClusterResource);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExtraConf", this.ExtraConf);
        this.setParamSimple(map, prefix + "RangerUserName", this.RangerUserName);
        this.setParamSimple(map, prefix + "CdwUserName", this.CdwUserName);

    }
}

