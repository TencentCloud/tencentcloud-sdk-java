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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamTemplateListInfo extends AbstractModel{

    /**
    * 参数模板ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 参数模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 参数模板描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 引擎版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get 参数模板ID 
     * @return Id 参数模板ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 参数模板ID
     * @param Id 参数模板ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 参数模板名称 
     * @return TemplateName 参数模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 参数模板名称
     * @param TemplateName 参数模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 参数模板描述 
     * @return TemplateDescription 参数模板描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 参数模板描述
     * @param TemplateDescription 参数模板描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 引擎版本 
     * @return EngineVersion 引擎版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本
     * @param EngineVersion 引擎版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    public ParamTemplateListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamTemplateListInfo(ParamTemplateListInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

