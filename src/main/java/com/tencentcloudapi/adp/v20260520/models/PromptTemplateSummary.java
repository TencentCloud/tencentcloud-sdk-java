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

public class PromptTemplateSummary extends AbstractModel {

    /**
    * <p>提示词模板Profile</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profile")
    @Expose
    private PromptTemplateProfile Profile;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("LabelList")
    @Expose
    private PromptTemplateLabel [] LabelList;

    /**
    * <p>是否已收藏</p>
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * <p>权限列表</p>
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

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
     * Get <p>是否已收藏</p> 
     * @return IsFavorite <p>是否已收藏</p>
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set <p>是否已收藏</p>
     * @param IsFavorite <p>是否已收藏</p>
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get <p>权限列表</p> 
     * @return PermissionIdList <p>权限列表</p>
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set <p>权限列表</p>
     * @param PermissionIdList <p>权限列表</p>
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    public PromptTemplateSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptTemplateSummary(PromptTemplateSummary source) {
        if (source.Profile != null) {
            this.Profile = new PromptTemplateProfile(source.Profile);
        }
        if (source.LabelList != null) {
            this.LabelList = new PromptTemplateLabel[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new PromptTemplateLabel(source.LabelList[i]);
            }
        }
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);

    }
}

