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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XMagicResourceSimpleInfo extends AbstractModel {

    /**
    * 资源Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 套餐类别
    */
    @SerializedName("Plan")
    @Expose
    private String Plan;

    /**
    * 单位：年
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 资源开始生效时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 资源结束生效时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 应用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Application")
    @Expose
    private AppInfo Application;

    /**
    * 开通的优图功能信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagic")
    @Expose
    private XMagicSimpleInfo XMagic;

    /**
    * 优图资源状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 操作日期记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private String [] Operation;

    /**
    * 是否可以使用
    */
    @SerializedName("IsUse")
    @Expose
    private Boolean IsUse;

    /**
    * single: 原子能力,combined:套餐
    */
    @SerializedName("XMagicType")
    @Expose
    private String XMagicType;

    /**
    * 功能模块名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源所属业务方 xmagic：优图，avatar：虚拟形象 
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源自动续费状态
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 资源Id 
     * @return Id 资源Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资源Id
     * @param Id 资源Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 套餐类别 
     * @return Plan 套餐类别
     */
    public String getPlan() {
        return this.Plan;
    }

    /**
     * Set 套餐类别
     * @param Plan 套餐类别
     */
    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    /**
     * Get 单位：年 
     * @return Duration 单位：年
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 单位：年
     * @param Duration 单位：年
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
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
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 资源开始生效时间 
     * @return StartTime 资源开始生效时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 资源开始生效时间
     * @param StartTime 资源开始生效时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 资源结束生效时间 
     * @return EndTime 资源结束生效时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 资源结束生效时间
     * @param EndTime 资源结束生效时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Application 应用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppInfo getApplication() {
        return this.Application;
    }

    /**
     * Set 应用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Application 应用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplication(AppInfo Application) {
        this.Application = Application;
    }

    /**
     * Get 开通的优图功能信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagic 开通的优图功能信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public XMagicSimpleInfo getXMagic() {
        return this.XMagic;
    }

    /**
     * Set 开通的优图功能信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagic 开通的优图功能信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagic(XMagicSimpleInfo XMagic) {
        this.XMagic = XMagic;
    }

    /**
     * Get 优图资源状态 
     * @return Status 优图资源状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 优图资源状态
     * @param Status 优图资源状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 操作日期记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation 操作日期记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作日期记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation 操作日期记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(String [] Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 是否可以使用 
     * @return IsUse 是否可以使用
     */
    public Boolean getIsUse() {
        return this.IsUse;
    }

    /**
     * Set 是否可以使用
     * @param IsUse 是否可以使用
     */
    public void setIsUse(Boolean IsUse) {
        this.IsUse = IsUse;
    }

    /**
     * Get single: 原子能力,combined:套餐 
     * @return XMagicType single: 原子能力,combined:套餐
     */
    public String getXMagicType() {
        return this.XMagicType;
    }

    /**
     * Set single: 原子能力,combined:套餐
     * @param XMagicType single: 原子能力,combined:套餐
     */
    public void setXMagicType(String XMagicType) {
        this.XMagicType = XMagicType;
    }

    /**
     * Get 功能模块名称 
     * @return Name 功能模块名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 功能模块名称
     * @param Name 功能模块名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源所属业务方 xmagic：优图，avatar：虚拟形象  
     * @return BizType 资源所属业务方 xmagic：优图，avatar：虚拟形象 
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 资源所属业务方 xmagic：优图，avatar：虚拟形象 
     * @param BizType 资源所属业务方 xmagic：优图，avatar：虚拟形象 
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源自动续费状态 
     * @return AutoRenewFlag 资源自动续费状态
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 资源自动续费状态
     * @param AutoRenewFlag 资源自动续费状态
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public XMagicResourceSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XMagicResourceSimpleInfo(XMagicResourceSimpleInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Plan != null) {
            this.Plan = new String(source.Plan);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Application != null) {
            this.Application = new AppInfo(source.Application);
        }
        if (source.XMagic != null) {
            this.XMagic = new XMagicSimpleInfo(source.XMagic);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String[source.Operation.length];
            for (int i = 0; i < source.Operation.length; i++) {
                this.Operation[i] = new String(source.Operation[i]);
            }
        }
        if (source.IsUse != null) {
            this.IsUse = new Boolean(source.IsUse);
        }
        if (source.XMagicType != null) {
            this.XMagicType = new String(source.XMagicType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "Application.", this.Application);
        this.setParamObj(map, prefix + "XMagic.", this.XMagic);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Operation.", this.Operation);
        this.setParamSimple(map, prefix + "IsUse", this.IsUse);
        this.setParamSimple(map, prefix + "XMagicType", this.XMagicType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

