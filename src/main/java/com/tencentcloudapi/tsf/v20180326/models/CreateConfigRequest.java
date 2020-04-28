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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConfigRequest extends AbstractModel{

    /**
    * 配置项名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项版本
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
    * 配置项值
    */
    @SerializedName("ConfigValue")
    @Expose
    private String ConfigValue;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 配置项版本描述
    */
    @SerializedName("ConfigVersionDesc")
    @Expose
    private String ConfigVersionDesc;

    /**
    * 配置项值类型
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * Base64编码的配置项
    */
    @SerializedName("EncodeWithBase64")
    @Expose
    private Boolean EncodeWithBase64;

    /**
     * Get 配置项名称 
     * @return ConfigName 配置项名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称
     * @param ConfigName 配置项名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置项版本 
     * @return ConfigVersion 配置项版本
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * Set 配置项版本
     * @param ConfigVersion 配置项版本
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    /**
     * Get 配置项值 
     * @return ConfigValue 配置项值
     */
    public String getConfigValue() {
        return this.ConfigValue;
    }

    /**
     * Set 配置项值
     * @param ConfigValue 配置项值
     */
    public void setConfigValue(String ConfigValue) {
        this.ConfigValue = ConfigValue;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 配置项版本描述 
     * @return ConfigVersionDesc 配置项版本描述
     */
    public String getConfigVersionDesc() {
        return this.ConfigVersionDesc;
    }

    /**
     * Set 配置项版本描述
     * @param ConfigVersionDesc 配置项版本描述
     */
    public void setConfigVersionDesc(String ConfigVersionDesc) {
        this.ConfigVersionDesc = ConfigVersionDesc;
    }

    /**
     * Get 配置项值类型 
     * @return ConfigType 配置项值类型
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 配置项值类型
     * @param ConfigType 配置项值类型
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Base64编码的配置项 
     * @return EncodeWithBase64 Base64编码的配置项
     */
    public Boolean getEncodeWithBase64() {
        return this.EncodeWithBase64;
    }

    /**
     * Set Base64编码的配置项
     * @param EncodeWithBase64 Base64编码的配置项
     */
    public void setEncodeWithBase64(Boolean EncodeWithBase64) {
        this.EncodeWithBase64 = EncodeWithBase64;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "ConfigValue", this.ConfigValue);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ConfigVersionDesc", this.ConfigVersionDesc);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "EncodeWithBase64", this.EncodeWithBase64);

    }
}

