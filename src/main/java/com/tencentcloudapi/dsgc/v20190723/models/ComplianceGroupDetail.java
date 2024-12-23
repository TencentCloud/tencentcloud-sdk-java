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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceGroupDetail extends AbstractModel {

    /**
    * 模板id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模板类型
    */
    @SerializedName("ComplianceGroupType")
    @Expose
    private Long ComplianceGroupType;

    /**
    * 模板分级方案id
    */
    @SerializedName("LevelGroupId")
    @Expose
    private Long LevelGroupId;

    /**
    * 模板分级方案名称
    */
    @SerializedName("LevelGroupName")
    @Expose
    private String LevelGroupName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 是否开启别名
    */
    @SerializedName("IsAlias")
    @Expose
    private Boolean IsAlias;

    /**
     * Get 模板id 
     * @return Id 模板id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 模板id
     * @param Id 模板id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模板类型 
     * @return ComplianceGroupType 模板类型
     */
    public Long getComplianceGroupType() {
        return this.ComplianceGroupType;
    }

    /**
     * Set 模板类型
     * @param ComplianceGroupType 模板类型
     */
    public void setComplianceGroupType(Long ComplianceGroupType) {
        this.ComplianceGroupType = ComplianceGroupType;
    }

    /**
     * Get 模板分级方案id 
     * @return LevelGroupId 模板分级方案id
     */
    public Long getLevelGroupId() {
        return this.LevelGroupId;
    }

    /**
     * Set 模板分级方案id
     * @param LevelGroupId 模板分级方案id
     */
    public void setLevelGroupId(Long LevelGroupId) {
        this.LevelGroupId = LevelGroupId;
    }

    /**
     * Get 模板分级方案名称 
     * @return LevelGroupName 模板分级方案名称
     */
    public String getLevelGroupName() {
        return this.LevelGroupName;
    }

    /**
     * Set 模板分级方案名称
     * @param LevelGroupName 模板分级方案名称
     */
    public void setLevelGroupName(String LevelGroupName) {
        this.LevelGroupName = LevelGroupName;
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
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 是否开启别名 
     * @return IsAlias 是否开启别名
     */
    public Boolean getIsAlias() {
        return this.IsAlias;
    }

    /**
     * Set 是否开启别名
     * @param IsAlias 是否开启别名
     */
    public void setIsAlias(Boolean IsAlias) {
        this.IsAlias = IsAlias;
    }

    public ComplianceGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceGroupDetail(ComplianceGroupDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ComplianceGroupType != null) {
            this.ComplianceGroupType = new Long(source.ComplianceGroupType);
        }
        if (source.LevelGroupId != null) {
            this.LevelGroupId = new Long(source.LevelGroupId);
        }
        if (source.LevelGroupName != null) {
            this.LevelGroupName = new String(source.LevelGroupName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IsAlias != null) {
            this.IsAlias = new Boolean(source.IsAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ComplianceGroupType", this.ComplianceGroupType);
        this.setParamSimple(map, prefix + "LevelGroupId", this.LevelGroupId);
        this.setParamSimple(map, prefix + "LevelGroupName", this.LevelGroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IsAlias", this.IsAlias);

    }
}

