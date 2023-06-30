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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExtensionRequest extends AbstractModel{

    /**
    * TCCC 实例应用 ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分机号
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 分机名称
    */
    @SerializedName("ExtensionName")
    @Expose
    private String ExtensionName;

    /**
    * 绑定的技能组列表
    */
    @SerializedName("SkillGroupIds")
    @Expose
    private Long [] SkillGroupIds;

    /**
    * 绑定的坐席邮箱
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get TCCC 实例应用 ID 
     * @return SdkAppId TCCC 实例应用 ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TCCC 实例应用 ID
     * @param SdkAppId TCCC 实例应用 ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分机号 
     * @return ExtensionId 分机号
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 分机号
     * @param ExtensionId 分机号
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 分机名称 
     * @return ExtensionName 分机名称
     */
    public String getExtensionName() {
        return this.ExtensionName;
    }

    /**
     * Set 分机名称
     * @param ExtensionName 分机名称
     */
    public void setExtensionName(String ExtensionName) {
        this.ExtensionName = ExtensionName;
    }

    /**
     * Get 绑定的技能组列表 
     * @return SkillGroupIds 绑定的技能组列表
     */
    public Long [] getSkillGroupIds() {
        return this.SkillGroupIds;
    }

    /**
     * Set 绑定的技能组列表
     * @param SkillGroupIds 绑定的技能组列表
     */
    public void setSkillGroupIds(Long [] SkillGroupIds) {
        this.SkillGroupIds = SkillGroupIds;
    }

    /**
     * Get 绑定的坐席邮箱 
     * @return Relation 绑定的坐席邮箱
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 绑定的坐席邮箱
     * @param Relation 绑定的坐席邮箱
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public CreateExtensionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExtensionRequest(CreateExtensionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.ExtensionName != null) {
            this.ExtensionName = new String(source.ExtensionName);
        }
        if (source.SkillGroupIds != null) {
            this.SkillGroupIds = new Long[source.SkillGroupIds.length];
            for (int i = 0; i < source.SkillGroupIds.length; i++) {
                this.SkillGroupIds[i] = new Long(source.SkillGroupIds[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "ExtensionName", this.ExtensionName);
        this.setParamArraySimple(map, prefix + "SkillGroupIds.", this.SkillGroupIds);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}

