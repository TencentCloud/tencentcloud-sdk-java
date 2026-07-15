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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyLevelGroupItem extends AbstractModel {

    /**
    * <p>级别组id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>级别组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>级别组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>级别组类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>级别信息</p>
    */
    @SerializedName("LevelItems")
    @Expose
    private DspmIdentifyLevelItem [] LevelItems;

    /**
    * <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>关联的识别模板信息</p>
    */
    @SerializedName("ComplianceRelations")
    @Expose
    private DspmIdentifyRefComplianceInfo [] ComplianceRelations;

    /**
     * Get <p>级别组id</p> 
     * @return Id <p>级别组id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>级别组id</p>
     * @param Id <p>级别组id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>级别组名称</p> 
     * @return Name <p>级别组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>级别组名称</p>
     * @param Name <p>级别组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>级别组描述</p> 
     * @return Description <p>级别组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>级别组描述</p>
     * @param Description <p>级别组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>级别组类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul> 
     * @return Type <p>级别组类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>级别组类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     * @param Type <p>级别组类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>级别信息</p> 
     * @return LevelItems <p>级别信息</p>
     */
    public DspmIdentifyLevelItem [] getLevelItems() {
        return this.LevelItems;
    }

    /**
     * Set <p>级别信息</p>
     * @param LevelItems <p>级别信息</p>
     */
    public void setLevelItems(DspmIdentifyLevelItem [] LevelItems) {
        this.LevelItems = LevelItems;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>更新时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>关联的识别模板信息</p> 
     * @return ComplianceRelations <p>关联的识别模板信息</p>
     */
    public DspmIdentifyRefComplianceInfo [] getComplianceRelations() {
        return this.ComplianceRelations;
    }

    /**
     * Set <p>关联的识别模板信息</p>
     * @param ComplianceRelations <p>关联的识别模板信息</p>
     */
    public void setComplianceRelations(DspmIdentifyRefComplianceInfo [] ComplianceRelations) {
        this.ComplianceRelations = ComplianceRelations;
    }

    public DspmIdentifyLevelGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyLevelGroupItem(DspmIdentifyLevelGroupItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.LevelItems != null) {
            this.LevelItems = new DspmIdentifyLevelItem[source.LevelItems.length];
            for (int i = 0; i < source.LevelItems.length; i++) {
                this.LevelItems[i] = new DspmIdentifyLevelItem(source.LevelItems[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ComplianceRelations != null) {
            this.ComplianceRelations = new DspmIdentifyRefComplianceInfo[source.ComplianceRelations.length];
            for (int i = 0; i < source.ComplianceRelations.length; i++) {
                this.ComplianceRelations[i] = new DspmIdentifyRefComplianceInfo(source.ComplianceRelations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "LevelItems.", this.LevelItems);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ComplianceRelations.", this.ComplianceRelations);

    }
}

