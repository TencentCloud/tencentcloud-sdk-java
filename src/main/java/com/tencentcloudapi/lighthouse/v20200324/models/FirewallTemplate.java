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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallTemplate extends AbstractModel {

    /**
    * 模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板类型。取值: "PRIVATE"(个人模板)
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * 模板状态。取值: "NORMAL"(正常)
    */
    @SerializedName("TemplateState")
    @Expose
    private String TemplateState;

    /**
    * 模板创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 模板ID。 
     * @return TemplateId 模板ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。
     * @param TemplateId 模板ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板类型。取值: "PRIVATE"(个人模板) 
     * @return TemplateType 模板类型。取值: "PRIVATE"(个人模板)
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 模板类型。取值: "PRIVATE"(个人模板)
     * @param TemplateType 模板类型。取值: "PRIVATE"(个人模板)
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 模板状态。取值: "NORMAL"(正常) 
     * @return TemplateState 模板状态。取值: "NORMAL"(正常)
     */
    public String getTemplateState() {
        return this.TemplateState;
    }

    /**
     * Set 模板状态。取值: "NORMAL"(正常)
     * @param TemplateState 模板状态。取值: "NORMAL"(正常)
     */
    public void setTemplateState(String TemplateState) {
        this.TemplateState = TemplateState;
    }

    /**
     * Get 模板创建时间。 
     * @return CreatedTime 模板创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 模板创建时间。
     * @param CreatedTime 模板创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public FirewallTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirewallTemplate(FirewallTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.TemplateState != null) {
            this.TemplateState = new String(source.TemplateState);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "TemplateState", this.TemplateState);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

