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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XMagicResource extends AbstractModel {

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
    * 资源是否已使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagic")
    @Expose
    private Boolean XMagic;

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
    * 资源包是否过期
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 功能模块名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * single: 原子能力,combined:套餐
    */
    @SerializedName("XMagicType")
    @Expose
    private String XMagicType;

    /**
    * xmagic:优图， avatar：虚拟人
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源是否可以使用
    */
    @SerializedName("IsUse")
    @Expose
    private Boolean IsUse;

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
     * Get 资源是否已使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagic 资源是否已使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getXMagic() {
        return this.XMagic;
    }

    /**
     * Set 资源是否已使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagic 资源是否已使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagic(Boolean XMagic) {
        this.XMagic = XMagic;
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
     * Get 资源包是否过期 
     * @return Expired 资源包是否过期
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 资源包是否过期
     * @param Expired 资源包是否过期
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
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
     * Get xmagic:优图， avatar：虚拟人 
     * @return BizType xmagic:优图， avatar：虚拟人
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set xmagic:优图， avatar：虚拟人
     * @param BizType xmagic:优图， avatar：虚拟人
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 资源Id 
     * @return ResourceId 资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
     * @param ResourceId 资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源是否可以使用 
     * @return IsUse 资源是否可以使用
     */
    public Boolean getIsUse() {
        return this.IsUse;
    }

    /**
     * Set 资源是否可以使用
     * @param IsUse 资源是否可以使用
     */
    public void setIsUse(Boolean IsUse) {
        this.IsUse = IsUse;
    }

    public XMagicResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XMagicResource(XMagicResource source) {
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
        if (source.XMagic != null) {
            this.XMagic = new Boolean(source.XMagic);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.XMagicType != null) {
            this.XMagicType = new String(source.XMagicType);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IsUse != null) {
            this.IsUse = new Boolean(source.IsUse);
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
        this.setParamSimple(map, prefix + "XMagic", this.XMagic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "XMagicType", this.XMagicType);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "IsUse", this.IsUse);

    }
}

