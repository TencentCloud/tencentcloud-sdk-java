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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptTemplateProfile extends AbstractModel {

    /**
    * <p>分类</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private PromptTemplateCategory Category;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模板名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>提示词模板ID</p>
    */
    @SerializedName("PromptTemplateId")
    @Expose
    private String PromptTemplateId;

    /**
    * <p>模板类型。1-预置模板, 2-自定义模板</p>
    */
    @SerializedName("PromptTemplateType")
    @Expose
    private Long PromptTemplateType;

    /**
    * <p>空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>审计信息</p>
    */
    @SerializedName("Audit")
    @Expose
    private Audit Audit;

    /**
     * Get <p>分类</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category <p>分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PromptTemplateCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category <p>分类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(PromptTemplateCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模板名称</p> 
     * @return Name <p>模板名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称</p>
     * @param Name <p>模板名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>提示词模板ID</p> 
     * @return PromptTemplateId <p>提示词模板ID</p>
     */
    public String getPromptTemplateId() {
        return this.PromptTemplateId;
    }

    /**
     * Set <p>提示词模板ID</p>
     * @param PromptTemplateId <p>提示词模板ID</p>
     */
    public void setPromptTemplateId(String PromptTemplateId) {
        this.PromptTemplateId = PromptTemplateId;
    }

    /**
     * Get <p>模板类型。1-预置模板, 2-自定义模板</p> 
     * @return PromptTemplateType <p>模板类型。1-预置模板, 2-自定义模板</p>
     */
    public Long getPromptTemplateType() {
        return this.PromptTemplateType;
    }

    /**
     * Set <p>模板类型。1-预置模板, 2-自定义模板</p>
     * @param PromptTemplateType <p>模板类型。1-预置模板, 2-自定义模板</p>
     */
    public void setPromptTemplateType(Long PromptTemplateType) {
        this.PromptTemplateType = PromptTemplateType;
    }

    /**
     * Get <p>空间ID</p> 
     * @return SpaceId <p>空间ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>空间ID</p>
     * @param SpaceId <p>空间ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>审计信息</p> 
     * @return Audit <p>审计信息</p>
     */
    public Audit getAudit() {
        return this.Audit;
    }

    /**
     * Set <p>审计信息</p>
     * @param Audit <p>审计信息</p>
     */
    public void setAudit(Audit Audit) {
        this.Audit = Audit;
    }

    public PromptTemplateProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTemplateProfile(PromptTemplateProfile source) {
        if (source.Category != null) {
            this.Category = new PromptTemplateCategory(source.Category);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PromptTemplateId != null) {
            this.PromptTemplateId = new String(source.PromptTemplateId);
        }
        if (source.PromptTemplateType != null) {
            this.PromptTemplateType = new Long(source.PromptTemplateType);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Audit != null) {
            this.Audit = new Audit(source.Audit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PromptTemplateId", this.PromptTemplateId);
        this.setParamSimple(map, prefix + "PromptTemplateType", this.PromptTemplateType);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "Audit.", this.Audit);

    }
}

