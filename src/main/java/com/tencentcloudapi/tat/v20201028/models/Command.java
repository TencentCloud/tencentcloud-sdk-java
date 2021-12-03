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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel{

    /**
    * 命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 命令名称。
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * 命令描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Base64编码后的命令内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 命令类型。
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * 命令执行路径。
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 命令超时时间。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 命令创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 命令更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 是否启用自定义参数功能。
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * 自定义参数的默认取值。
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * 命令的结构化描述。公共命令有值，用户命令为空字符串。
    */
    @SerializedName("FormattedDescription")
    @Expose
    private String FormattedDescription;

    /**
    * 命令创建者。TAT 代表公共命令，USER 代表个人命令。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * 命令关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 在实例上执行命令的用户名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 日志上传的cos bucket 地址。
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * 日志在cos bucket中的目录。
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get 命令ID。 
     * @return CommandId 命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 命令ID。
     * @param CommandId 命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 命令名称。 
     * @return CommandName 命令名称。
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set 命令名称。
     * @param CommandName 命令名称。
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get 命令描述。 
     * @return Description 命令描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 命令描述。
     * @param Description 命令描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Base64编码后的命令内容。 
     * @return Content Base64编码后的命令内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64编码后的命令内容。
     * @param Content Base64编码后的命令内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 命令类型。 
     * @return CommandType 命令类型。
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set 命令类型。
     * @param CommandType 命令类型。
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get 命令执行路径。 
     * @return WorkingDirectory 命令执行路径。
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 命令执行路径。
     * @param WorkingDirectory 命令执行路径。
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get 命令超时时间。 
     * @return Timeout 命令超时时间。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 命令超时时间。
     * @param Timeout 命令超时时间。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 命令创建时间。 
     * @return CreatedTime 命令创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 命令创建时间。
     * @param CreatedTime 命令创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 命令更新时间。 
     * @return UpdatedTime 命令更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 命令更新时间。
     * @param UpdatedTime 命令更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 是否启用自定义参数功能。 
     * @return EnableParameter 是否启用自定义参数功能。
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set 是否启用自定义参数功能。
     * @param EnableParameter 是否启用自定义参数功能。
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get 自定义参数的默认取值。 
     * @return DefaultParameters 自定义参数的默认取值。
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set 自定义参数的默认取值。
     * @param DefaultParameters 自定义参数的默认取值。
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get 命令的结构化描述。公共命令有值，用户命令为空字符串。 
     * @return FormattedDescription 命令的结构化描述。公共命令有值，用户命令为空字符串。
     */
    public String getFormattedDescription() {
        return this.FormattedDescription;
    }

    /**
     * Set 命令的结构化描述。公共命令有值，用户命令为空字符串。
     * @param FormattedDescription 命令的结构化描述。公共命令有值，用户命令为空字符串。
     */
    public void setFormattedDescription(String FormattedDescription) {
        this.FormattedDescription = FormattedDescription;
    }

    /**
     * Get 命令创建者。TAT 代表公共命令，USER 代表个人命令。 
     * @return CreatedBy 命令创建者。TAT 代表公共命令，USER 代表个人命令。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 命令创建者。TAT 代表公共命令，USER 代表个人命令。
     * @param CreatedBy 命令创建者。TAT 代表公共命令，USER 代表个人命令。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get 命令关联的标签列表。 
     * @return Tags 命令关联的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 命令关联的标签列表。
     * @param Tags 命令关联的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 在实例上执行命令的用户名。 
     * @return Username 在实例上执行命令的用户名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 在实例上执行命令的用户名。
     * @param Username 在实例上执行命令的用户名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 日志上传的cos bucket 地址。 
     * @return OutputCOSBucketUrl 日志上传的cos bucket 地址。
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set 日志上传的cos bucket 地址。
     * @param OutputCOSBucketUrl 日志上传的cos bucket 地址。
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get 日志在cos bucket中的目录。 
     * @return OutputCOSKeyPrefix 日志在cos bucket中的目录。
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set 日志在cos bucket中的目录。
     * @param OutputCOSKeyPrefix 日志在cos bucket中的目录。
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public Command() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Command(Command source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.CommandName != null) {
            this.CommandName = new String(source.CommandName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.EnableParameter != null) {
            this.EnableParameter = new Boolean(source.EnableParameter);
        }
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.FormattedDescription != null) {
            this.FormattedDescription = new String(source.FormattedDescription);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.OutputCOSBucketUrl != null) {
            this.OutputCOSBucketUrl = new String(source.OutputCOSBucketUrl);
        }
        if (source.OutputCOSKeyPrefix != null) {
            this.OutputCOSKeyPrefix = new String(source.OutputCOSKeyPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "CommandName", this.CommandName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "EnableParameter", this.EnableParameter);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamSimple(map, prefix + "FormattedDescription", this.FormattedDescription);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

