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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamTemplateInfo extends AbstractModel{

    /**
    * 参数模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 参数模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数模板描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 实例引擎版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get 参数模板ID 
     * @return TemplateId 参数模板ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 参数模板ID
     * @param TemplateId 参数模板ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 参数模板名称 
     * @return Name 参数模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数模板名称
     * @param Name 参数模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数模板描述 
     * @return Description 参数模板描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数模板描述
     * @param Description 参数模板描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 实例引擎版本 
     * @return EngineVersion 实例引擎版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 实例引擎版本
     * @param EngineVersion 实例引擎版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

