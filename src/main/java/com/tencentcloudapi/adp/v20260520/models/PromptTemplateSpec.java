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

public class PromptTemplateSpec extends AbstractModel {

    /**
    * 分类标识
    */
    @SerializedName("CategoryKey")
    @Expose
    private String CategoryKey;

    /**
    * 自定义变量列表
    */
    @SerializedName("CustomVariableList")
    @Expose
    private String [] CustomVariableList;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签ID列表
    */
    @SerializedName("LabelIdList")
    @Expose
    private String [] LabelIdList;

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 提示词内容
    */
    @SerializedName("PromptContent")
    @Expose
    private String PromptContent;

    /**
     * Get 分类标识 
     * @return CategoryKey 分类标识
     */
    public String getCategoryKey() {
        return this.CategoryKey;
    }

    /**
     * Set 分类标识
     * @param CategoryKey 分类标识
     */
    public void setCategoryKey(String CategoryKey) {
        this.CategoryKey = CategoryKey;
    }

    /**
     * Get 自定义变量列表 
     * @return CustomVariableList 自定义变量列表
     */
    public String [] getCustomVariableList() {
        return this.CustomVariableList;
    }

    /**
     * Set 自定义变量列表
     * @param CustomVariableList 自定义变量列表
     */
    public void setCustomVariableList(String [] CustomVariableList) {
        this.CustomVariableList = CustomVariableList;
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
     * Get 标签ID列表 
     * @return LabelIdList 标签ID列表
     */
    public String [] getLabelIdList() {
        return this.LabelIdList;
    }

    /**
     * Set 标签ID列表
     * @param LabelIdList 标签ID列表
     */
    public void setLabelIdList(String [] LabelIdList) {
        this.LabelIdList = LabelIdList;
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
     * Get 提示词内容 
     * @return PromptContent 提示词内容
     */
    public String getPromptContent() {
        return this.PromptContent;
    }

    /**
     * Set 提示词内容
     * @param PromptContent 提示词内容
     */
    public void setPromptContent(String PromptContent) {
        this.PromptContent = PromptContent;
    }

    public PromptTemplateSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTemplateSpec(PromptTemplateSpec source) {
        if (source.CategoryKey != null) {
            this.CategoryKey = new String(source.CategoryKey);
        }
        if (source.CustomVariableList != null) {
            this.CustomVariableList = new String[source.CustomVariableList.length];
            for (int i = 0; i < source.CustomVariableList.length; i++) {
                this.CustomVariableList[i] = new String(source.CustomVariableList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LabelIdList != null) {
            this.LabelIdList = new String[source.LabelIdList.length];
            for (int i = 0; i < source.LabelIdList.length; i++) {
                this.LabelIdList[i] = new String(source.LabelIdList[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PromptContent != null) {
            this.PromptContent = new String(source.PromptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryKey", this.CategoryKey);
        this.setParamArraySimple(map, prefix + "CustomVariableList.", this.CustomVariableList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "LabelIdList.", this.LabelIdList);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PromptContent", this.PromptContent);

    }
}

