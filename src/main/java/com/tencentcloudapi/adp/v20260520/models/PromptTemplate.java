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

public class PromptTemplate extends AbstractModel {

    /**
    * <p>提示词模板Profile</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profile")
    @Expose
    private PromptTemplateProfile Profile;

    /**
    * <p>自定义变量列表</p>
    */
    @SerializedName("CustomVariableList")
    @Expose
    private String [] CustomVariableList;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("LabelList")
    @Expose
    private PromptTemplateLabel [] LabelList;

    /**
    * <p>提示词内容</p>
    */
    @SerializedName("PromptContent")
    @Expose
    private String PromptContent;

    /**
     * Get <p>提示词模板Profile</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Profile <p>提示词模板Profile</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PromptTemplateProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>提示词模板Profile</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Profile <p>提示词模板Profile</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfile(PromptTemplateProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>自定义变量列表</p> 
     * @return CustomVariableList <p>自定义变量列表</p>
     */
    public String [] getCustomVariableList() {
        return this.CustomVariableList;
    }

    /**
     * Set <p>自定义变量列表</p>
     * @param CustomVariableList <p>自定义变量列表</p>
     */
    public void setCustomVariableList(String [] CustomVariableList) {
        this.CustomVariableList = CustomVariableList;
    }

    /**
     * Get <p>标签列表</p> 
     * @return LabelList <p>标签列表</p>
     */
    public PromptTemplateLabel [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set <p>标签列表</p>
     * @param LabelList <p>标签列表</p>
     */
    public void setLabelList(PromptTemplateLabel [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get <p>提示词内容</p> 
     * @return PromptContent <p>提示词内容</p>
     */
    public String getPromptContent() {
        return this.PromptContent;
    }

    /**
     * Set <p>提示词内容</p>
     * @param PromptContent <p>提示词内容</p>
     */
    public void setPromptContent(String PromptContent) {
        this.PromptContent = PromptContent;
    }

    public PromptTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTemplate(PromptTemplate source) {
        if (source.Profile != null) {
            this.Profile = new PromptTemplateProfile(source.Profile);
        }
        if (source.CustomVariableList != null) {
            this.CustomVariableList = new String[source.CustomVariableList.length];
            for (int i = 0; i < source.CustomVariableList.length; i++) {
                this.CustomVariableList[i] = new String(source.CustomVariableList[i]);
            }
        }
        if (source.LabelList != null) {
            this.LabelList = new PromptTemplateLabel[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new PromptTemplateLabel(source.LabelList[i]);
            }
        }
        if (source.PromptContent != null) {
            this.PromptContent = new String(source.PromptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamArraySimple(map, prefix + "CustomVariableList.", this.CustomVariableList);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamSimple(map, prefix + "PromptContent", this.PromptContent);

    }
}

