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

public class FileConfig extends AbstractModel{

    /**
    * 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
    * 配置项版本描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigVersionDesc")
    @Expose
    private String ConfigVersionDesc;

    /**
    * 配置项文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFileName")
    @Expose
    private String ConfigFileName;

    /**
    * 配置项文件内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFileValue")
    @Expose
    private String ConfigFileValue;

    /**
    * 配置项文件编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFileCode")
    @Expose
    private String ConfigFileCode;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 配置项归属应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 删除标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 配置项版本数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigVersionCount")
    @Expose
    private Long ConfigVersionCount;

    /**
    * 配置项最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 发布路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFilePath")
    @Expose
    private String ConfigFilePath;

    /**
    * 后置命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigPostCmd")
    @Expose
    private String ConfigPostCmd;

    /**
    * 配置项文件长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFileValueLength")
    @Expose
    private Long ConfigFileValueLength;

    /**
     * Get 配置项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 配置项名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置项版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigVersion 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * Set 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigVersion 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    /**
     * Get 配置项版本描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigVersionDesc 配置项版本描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigVersionDesc() {
        return this.ConfigVersionDesc;
    }

    /**
     * Set 配置项版本描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigVersionDesc 配置项版本描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigVersionDesc(String ConfigVersionDesc) {
        this.ConfigVersionDesc = ConfigVersionDesc;
    }

    /**
     * Get 配置项文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFileName 配置项文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigFileName() {
        return this.ConfigFileName;
    }

    /**
     * Set 配置项文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFileName 配置项文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFileName(String ConfigFileName) {
        this.ConfigFileName = ConfigFileName;
    }

    /**
     * Get 配置项文件内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFileValue 配置项文件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigFileValue() {
        return this.ConfigFileValue;
    }

    /**
     * Set 配置项文件内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFileValue 配置项文件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFileValue(String ConfigFileValue) {
        this.ConfigFileValue = ConfigFileValue;
    }

    /**
     * Get 配置项文件编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFileCode 配置项文件编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigFileCode() {
        return this.ConfigFileCode;
    }

    /**
     * Set 配置项文件编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFileCode 配置项文件编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFileCode(String ConfigFileCode) {
        this.ConfigFileCode = ConfigFileCode;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 配置项归属应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 配置项归属应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 配置项归属应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 配置项归属应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 删除标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteFlag 删除标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 删除标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 配置项版本数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigVersionCount 配置项版本数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigVersionCount() {
        return this.ConfigVersionCount;
    }

    /**
     * Set 配置项版本数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigVersionCount 配置项版本数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigVersionCount(Long ConfigVersionCount) {
        this.ConfigVersionCount = ConfigVersionCount;
    }

    /**
     * Get 配置项最后更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 配置项最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 配置项最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 配置项最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 发布路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFilePath 发布路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigFilePath() {
        return this.ConfigFilePath;
    }

    /**
     * Set 发布路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFilePath 发布路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFilePath(String ConfigFilePath) {
        this.ConfigFilePath = ConfigFilePath;
    }

    /**
     * Get 后置命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigPostCmd 后置命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigPostCmd() {
        return this.ConfigPostCmd;
    }

    /**
     * Set 后置命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigPostCmd 后置命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigPostCmd(String ConfigPostCmd) {
        this.ConfigPostCmd = ConfigPostCmd;
    }

    /**
     * Get 配置项文件长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFileValueLength 配置项文件长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigFileValueLength() {
        return this.ConfigFileValueLength;
    }

    /**
     * Set 配置项文件长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFileValueLength 配置项文件长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFileValueLength(Long ConfigFileValueLength) {
        this.ConfigFileValueLength = ConfigFileValueLength;
    }

    public FileConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileConfig(FileConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigVersion != null) {
            this.ConfigVersion = new String(source.ConfigVersion);
        }
        if (source.ConfigVersionDesc != null) {
            this.ConfigVersionDesc = new String(source.ConfigVersionDesc);
        }
        if (source.ConfigFileName != null) {
            this.ConfigFileName = new String(source.ConfigFileName);
        }
        if (source.ConfigFileValue != null) {
            this.ConfigFileValue = new String(source.ConfigFileValue);
        }
        if (source.ConfigFileCode != null) {
            this.ConfigFileCode = new String(source.ConfigFileCode);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.ConfigVersionCount != null) {
            this.ConfigVersionCount = new Long(source.ConfigVersionCount);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.ConfigFilePath != null) {
            this.ConfigFilePath = new String(source.ConfigFilePath);
        }
        if (source.ConfigPostCmd != null) {
            this.ConfigPostCmd = new String(source.ConfigPostCmd);
        }
        if (source.ConfigFileValueLength != null) {
            this.ConfigFileValueLength = new Long(source.ConfigFileValueLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "ConfigVersionDesc", this.ConfigVersionDesc);
        this.setParamSimple(map, prefix + "ConfigFileName", this.ConfigFileName);
        this.setParamSimple(map, prefix + "ConfigFileValue", this.ConfigFileValue);
        this.setParamSimple(map, prefix + "ConfigFileCode", this.ConfigFileCode);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "ConfigVersionCount", this.ConfigVersionCount);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "ConfigFilePath", this.ConfigFilePath);
        this.setParamSimple(map, prefix + "ConfigPostCmd", this.ConfigPostCmd);
        this.setParamSimple(map, prefix + "ConfigFileValueLength", this.ConfigFileValueLength);

    }
}

