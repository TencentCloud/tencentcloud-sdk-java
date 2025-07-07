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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConfigTemplateRequest extends AbstractModel {

    /**
    * 配置模板名称
    */
    @SerializedName("ConfigTemplateName")
    @Expose
    private String ConfigTemplateName;

    /**
    * 配置模板对应的微服务框架
    */
    @SerializedName("ConfigTemplateType")
    @Expose
    private String ConfigTemplateType;

    /**
    * 配置模板数据
    */
    @SerializedName("ConfigTemplateValue")
    @Expose
    private String ConfigTemplateValue;

    /**
    * 配置模板描述
    */
    @SerializedName("ConfigTemplateDesc")
    @Expose
    private String ConfigTemplateDesc;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

    /**
     * Get 配置模板名称 
     * @return ConfigTemplateName 配置模板名称
     */
    public String getConfigTemplateName() {
        return this.ConfigTemplateName;
    }

    /**
     * Set 配置模板名称
     * @param ConfigTemplateName 配置模板名称
     */
    public void setConfigTemplateName(String ConfigTemplateName) {
        this.ConfigTemplateName = ConfigTemplateName;
    }

    /**
     * Get 配置模板对应的微服务框架 
     * @return ConfigTemplateType 配置模板对应的微服务框架
     */
    public String getConfigTemplateType() {
        return this.ConfigTemplateType;
    }

    /**
     * Set 配置模板对应的微服务框架
     * @param ConfigTemplateType 配置模板对应的微服务框架
     */
    public void setConfigTemplateType(String ConfigTemplateType) {
        this.ConfigTemplateType = ConfigTemplateType;
    }

    /**
     * Get 配置模板数据 
     * @return ConfigTemplateValue 配置模板数据
     */
    public String getConfigTemplateValue() {
        return this.ConfigTemplateValue;
    }

    /**
     * Set 配置模板数据
     * @param ConfigTemplateValue 配置模板数据
     */
    public void setConfigTemplateValue(String ConfigTemplateValue) {
        this.ConfigTemplateValue = ConfigTemplateValue;
    }

    /**
     * Get 配置模板描述 
     * @return ConfigTemplateDesc 配置模板描述
     */
    public String getConfigTemplateDesc() {
        return this.ConfigTemplateDesc;
    }

    /**
     * Set 配置模板描述
     * @param ConfigTemplateDesc 配置模板描述
     */
    public void setConfigTemplateDesc(String ConfigTemplateDesc) {
        this.ConfigTemplateDesc = ConfigTemplateDesc;
    }

    /**
     * Get 无 
     * @return ProgramIdList 无
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 无
     * @param ProgramIdList 无
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    public CreateConfigTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigTemplateRequest(CreateConfigTemplateRequest source) {
        if (source.ConfigTemplateName != null) {
            this.ConfigTemplateName = new String(source.ConfigTemplateName);
        }
        if (source.ConfigTemplateType != null) {
            this.ConfigTemplateType = new String(source.ConfigTemplateType);
        }
        if (source.ConfigTemplateValue != null) {
            this.ConfigTemplateValue = new String(source.ConfigTemplateValue);
        }
        if (source.ConfigTemplateDesc != null) {
            this.ConfigTemplateDesc = new String(source.ConfigTemplateDesc);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigTemplateName", this.ConfigTemplateName);
        this.setParamSimple(map, prefix + "ConfigTemplateType", this.ConfigTemplateType);
        this.setParamSimple(map, prefix + "ConfigTemplateValue", this.ConfigTemplateValue);
        this.setParamSimple(map, prefix + "ConfigTemplateDesc", this.ConfigTemplateDesc);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

