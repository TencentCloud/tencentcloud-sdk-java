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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookSetItem extends AbstractModel{

    /**
    * notebook ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * notebook 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 计费模式
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 资源配置
    */
    @SerializedName("ResourceConf")
    @Expose
    private ResourceConf ResourceConf;

    /**
    * 预付费资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 存储卷大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfos")
    @Expose
    private String [] BillingInfos;

    /**
    * 标签配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeInSeconds")
    @Expose
    private Long RuntimeInSeconds;

    /**
    * 计费状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pod名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 后付费资源规格名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeAlias")
    @Expose
    private String InstanceTypeAlias;

    /**
    * 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 是否自动终止
    */
    @SerializedName("AutoStopping")
    @Expose
    private Boolean AutoStopping;

    /**
    * 自动停止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutomaticStopTime")
    @Expose
    private Long AutomaticStopTime;

    /**
    * 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceCFS")
    @Expose
    private CFSConfig VolumeSourceCFS;

    /**
    * notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * notebook用户类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserTypes")
    @Expose
    private String [] UserTypes;

    /**
     * Get notebook ID 
     * @return Id notebook ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set notebook ID
     * @param Id notebook ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get notebook 名称 
     * @return Name notebook 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set notebook 名称
     * @param Name notebook 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 计费模式 
     * @return ChargeType 计费模式
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式
     * @param ChargeType 计费模式
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 资源配置 
     * @return ResourceConf 资源配置
     */
    public ResourceConf getResourceConf() {
        return this.ResourceConf;
    }

    /**
     * Set 资源配置
     * @param ResourceConf 资源配置
     */
    public void setResourceConf(ResourceConf ResourceConf) {
        this.ResourceConf = ResourceConf;
    }

    /**
     * Get 预付费资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 预付费资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 预付费资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 预付费资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 存储卷大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSizeInGB 存储卷大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 存储卷大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSizeInGB 存储卷大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfos 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBillingInfos() {
        return this.BillingInfos;
    }

    /**
     * Set 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfos 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfos(String [] BillingInfos) {
        this.BillingInfos = BillingInfos;
    }

    /**
     * Get 标签配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeInSeconds 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeInSeconds() {
        return this.RuntimeInSeconds;
    }

    /**
     * Set 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeInSeconds 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeInSeconds(Long RuntimeInSeconds) {
        this.RuntimeInSeconds = RuntimeInSeconds;
    }

    /**
     * Get 计费状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(String ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pod名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 后付费资源规格名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeAlias 后付费资源规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceTypeAlias() {
        return this.InstanceTypeAlias;
    }

    /**
     * Set 后付费资源规格名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeAlias 后付费资源规格名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeAlias(String InstanceTypeAlias) {
        this.InstanceTypeAlias = InstanceTypeAlias;
    }

    /**
     * Get 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 是否自动终止 
     * @return AutoStopping 是否自动终止
     */
    public Boolean getAutoStopping() {
        return this.AutoStopping;
    }

    /**
     * Set 是否自动终止
     * @param AutoStopping 是否自动终止
     */
    public void setAutoStopping(Boolean AutoStopping) {
        this.AutoStopping = AutoStopping;
    }

    /**
     * Get 自动停止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutomaticStopTime 自动停止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutomaticStopTime() {
        return this.AutomaticStopTime;
    }

    /**
     * Set 自动停止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutomaticStopTime 自动停止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutomaticStopTime(Long AutomaticStopTime) {
        this.AutomaticStopTime = AutomaticStopTime;
    }

    /**
     * Get 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceType 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceType 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceCFS CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSConfig getVolumeSourceCFS() {
        return this.VolumeSourceCFS;
    }

    /**
     * Set CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceCFS CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceCFS(CFSConfig VolumeSourceCFS) {
        this.VolumeSourceCFS = VolumeSourceCFS;
    }

    /**
     * Get notebook 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get notebook用户类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserTypes notebook用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserTypes() {
        return this.UserTypes;
    }

    /**
     * Set notebook用户类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserTypes notebook用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserTypes(String [] UserTypes) {
        this.UserTypes = UserTypes;
    }

    public NotebookSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSetItem(NotebookSetItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConf != null) {
            this.ResourceConf = new ResourceConf(source.ResourceConf);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.VolumeSizeInGB != null) {
            this.VolumeSizeInGB = new Long(source.VolumeSizeInGB);
        }
        if (source.BillingInfos != null) {
            this.BillingInfos = new String[source.BillingInfos.length];
            for (int i = 0; i < source.BillingInfos.length; i++) {
                this.BillingInfos[i] = new String(source.BillingInfos[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuntimeInSeconds != null) {
            this.RuntimeInSeconds = new Long(source.RuntimeInSeconds);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new String(source.ChargeStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.InstanceTypeAlias != null) {
            this.InstanceTypeAlias = new String(source.InstanceTypeAlias);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.AutoStopping != null) {
            this.AutoStopping = new Boolean(source.AutoStopping);
        }
        if (source.AutomaticStopTime != null) {
            this.AutomaticStopTime = new Long(source.AutomaticStopTime);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
        }
        if (source.VolumeSourceCFS != null) {
            this.VolumeSourceCFS = new CFSConfig(source.VolumeSourceCFS);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.UserTypes != null) {
            this.UserTypes = new String[source.UserTypes.length];
            for (int i = 0; i < source.UserTypes.length; i++) {
                this.UserTypes[i] = new String(source.UserTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ResourceConf.", this.ResourceConf);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamArraySimple(map, prefix + "BillingInfos.", this.BillingInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "InstanceTypeAlias", this.InstanceTypeAlias);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "AutoStopping", this.AutoStopping);
        this.setParamSimple(map, prefix + "AutomaticStopTime", this.AutomaticStopTime);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
        this.setParamObj(map, prefix + "VolumeSourceCFS.", this.VolumeSourceCFS);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArraySimple(map, prefix + "UserTypes.", this.UserTypes);

    }
}

