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

public class CreateFileConfigRequest extends AbstractModel{

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
    * 配置项文件名
    */
    @SerializedName("ConfigFileName")
    @Expose
    private String ConfigFileName;

    /**
    * 配置项文件内容（原始内容编码需要 utf-8 格式，如果 ConfigFileCode 为 gbk，后台会进行转换）
    */
    @SerializedName("ConfigFileValue")
    @Expose
    private String ConfigFileValue;

    /**
    * 配置项关联应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 发布路径
    */
    @SerializedName("ConfigFilePath")
    @Expose
    private String ConfigFilePath;

    /**
    * 配置项版本描述
    */
    @SerializedName("ConfigVersionDesc")
    @Expose
    private String ConfigVersionDesc;

    /**
    * 配置项文件编码，utf-8 或 gbk。注：如果选择 gbk，需要新版本 tsf-consul-template （公有云虚拟机需要使用 1.32 tsf-agent，容器需要从文档中获取最新的 tsf-consul-template-docker.tar.gz）的支持
    */
    @SerializedName("ConfigFileCode")
    @Expose
    private String ConfigFileCode;

    /**
    * 后置命令
    */
    @SerializedName("ConfigPostCmd")
    @Expose
    private String ConfigPostCmd;

    /**
    * Base64编码的配置项
    */
    @SerializedName("EncodeWithBase64")
    @Expose
    private Boolean EncodeWithBase64;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

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
     * Get 配置项文件名 
     * @return ConfigFileName 配置项文件名
     */
    public String getConfigFileName() {
        return this.ConfigFileName;
    }

    /**
     * Set 配置项文件名
     * @param ConfigFileName 配置项文件名
     */
    public void setConfigFileName(String ConfigFileName) {
        this.ConfigFileName = ConfigFileName;
    }

    /**
     * Get 配置项文件内容（原始内容编码需要 utf-8 格式，如果 ConfigFileCode 为 gbk，后台会进行转换） 
     * @return ConfigFileValue 配置项文件内容（原始内容编码需要 utf-8 格式，如果 ConfigFileCode 为 gbk，后台会进行转换）
     */
    public String getConfigFileValue() {
        return this.ConfigFileValue;
    }

    /**
     * Set 配置项文件内容（原始内容编码需要 utf-8 格式，如果 ConfigFileCode 为 gbk，后台会进行转换）
     * @param ConfigFileValue 配置项文件内容（原始内容编码需要 utf-8 格式，如果 ConfigFileCode 为 gbk，后台会进行转换）
     */
    public void setConfigFileValue(String ConfigFileValue) {
        this.ConfigFileValue = ConfigFileValue;
    }

    /**
     * Get 配置项关联应用ID 
     * @return ApplicationId 配置项关联应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 配置项关联应用ID
     * @param ApplicationId 配置项关联应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 发布路径 
     * @return ConfigFilePath 发布路径
     */
    public String getConfigFilePath() {
        return this.ConfigFilePath;
    }

    /**
     * Set 发布路径
     * @param ConfigFilePath 发布路径
     */
    public void setConfigFilePath(String ConfigFilePath) {
        this.ConfigFilePath = ConfigFilePath;
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
     * Get 配置项文件编码，utf-8 或 gbk。注：如果选择 gbk，需要新版本 tsf-consul-template （公有云虚拟机需要使用 1.32 tsf-agent，容器需要从文档中获取最新的 tsf-consul-template-docker.tar.gz）的支持 
     * @return ConfigFileCode 配置项文件编码，utf-8 或 gbk。注：如果选择 gbk，需要新版本 tsf-consul-template （公有云虚拟机需要使用 1.32 tsf-agent，容器需要从文档中获取最新的 tsf-consul-template-docker.tar.gz）的支持
     */
    public String getConfigFileCode() {
        return this.ConfigFileCode;
    }

    /**
     * Set 配置项文件编码，utf-8 或 gbk。注：如果选择 gbk，需要新版本 tsf-consul-template （公有云虚拟机需要使用 1.32 tsf-agent，容器需要从文档中获取最新的 tsf-consul-template-docker.tar.gz）的支持
     * @param ConfigFileCode 配置项文件编码，utf-8 或 gbk。注：如果选择 gbk，需要新版本 tsf-consul-template （公有云虚拟机需要使用 1.32 tsf-agent，容器需要从文档中获取最新的 tsf-consul-template-docker.tar.gz）的支持
     */
    public void setConfigFileCode(String ConfigFileCode) {
        this.ConfigFileCode = ConfigFileCode;
    }

    /**
     * Get 后置命令 
     * @return ConfigPostCmd 后置命令
     */
    public String getConfigPostCmd() {
        return this.ConfigPostCmd;
    }

    /**
     * Set 后置命令
     * @param ConfigPostCmd 后置命令
     */
    public void setConfigPostCmd(String ConfigPostCmd) {
        this.ConfigPostCmd = ConfigPostCmd;
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

    public CreateFileConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileConfigRequest(CreateFileConfigRequest source) {
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigVersion != null) {
            this.ConfigVersion = new String(source.ConfigVersion);
        }
        if (source.ConfigFileName != null) {
            this.ConfigFileName = new String(source.ConfigFileName);
        }
        if (source.ConfigFileValue != null) {
            this.ConfigFileValue = new String(source.ConfigFileValue);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ConfigFilePath != null) {
            this.ConfigFilePath = new String(source.ConfigFilePath);
        }
        if (source.ConfigVersionDesc != null) {
            this.ConfigVersionDesc = new String(source.ConfigVersionDesc);
        }
        if (source.ConfigFileCode != null) {
            this.ConfigFileCode = new String(source.ConfigFileCode);
        }
        if (source.ConfigPostCmd != null) {
            this.ConfigPostCmd = new String(source.ConfigPostCmd);
        }
        if (source.EncodeWithBase64 != null) {
            this.EncodeWithBase64 = new Boolean(source.EncodeWithBase64);
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
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "ConfigFileName", this.ConfigFileName);
        this.setParamSimple(map, prefix + "ConfigFileValue", this.ConfigFileValue);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ConfigFilePath", this.ConfigFilePath);
        this.setParamSimple(map, prefix + "ConfigVersionDesc", this.ConfigVersionDesc);
        this.setParamSimple(map, prefix + "ConfigFileCode", this.ConfigFileCode);
        this.setParamSimple(map, prefix + "ConfigPostCmd", this.ConfigPostCmd);
        this.setParamSimple(map, prefix + "EncodeWithBase64", this.EncodeWithBase64);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

