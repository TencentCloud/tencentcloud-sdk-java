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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel {

    /**
    * <p>命令ID。</p>
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * <p>命令名称。</p>
    */
    @SerializedName("CommandName")
    @Expose
    private String CommandName;

    /**
    * <p>命令描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Base64编码后的命令内容。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>命令类型。取值为 SHELL、POWERSHELL、BAT 之一。</p>
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * <p>命令执行路径。</p>
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * <p>命令超时时间。</p><p>单位：秒</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>命令创建时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>命令更新时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>是否启用自定义参数功能。</p>
    */
    @SerializedName("EnableParameter")
    @Expose
    private Boolean EnableParameter;

    /**
    * <p>自定义参数的默认取值。</p>
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * <p>自定义参数的默认取值。</p>
    */
    @SerializedName("DefaultParameterConfs")
    @Expose
    private DefaultParameterConf [] DefaultParameterConfs;

    /**
    * <p>命令关联的场景</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * <p>命令的结构化描述。公共命令有值，用户命令为空字符串。</p>
    */
    @SerializedName("FormattedDescription")
    @Expose
    private String FormattedDescription;

    /**
    * <p>命令创建者。</p><p>枚举值：</p><ul><li>TAT： 公共命令</li><li>USER： 个人创建的命令</li></ul>
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <p>命令关联的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>在实例上执行命令的用户名。</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>日志上传的cos bucket 地址。</p>
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * <p>日志在cos bucket中的目录。</p>
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get <p>命令ID。</p> 
     * @return CommandId <p>命令ID。</p>
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set <p>命令ID。</p>
     * @param CommandId <p>命令ID。</p>
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get <p>命令名称。</p> 
     * @return CommandName <p>命令名称。</p>
     */
    public String getCommandName() {
        return this.CommandName;
    }

    /**
     * Set <p>命令名称。</p>
     * @param CommandName <p>命令名称。</p>
     */
    public void setCommandName(String CommandName) {
        this.CommandName = CommandName;
    }

    /**
     * Get <p>命令描述。</p> 
     * @return Description <p>命令描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>命令描述。</p>
     * @param Description <p>命令描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Base64编码后的命令内容。</p> 
     * @return Content <p>Base64编码后的命令内容。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Base64编码后的命令内容。</p>
     * @param Content <p>Base64编码后的命令内容。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>命令类型。取值为 SHELL、POWERSHELL、BAT 之一。</p> 
     * @return CommandType <p>命令类型。取值为 SHELL、POWERSHELL、BAT 之一。</p>
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set <p>命令类型。取值为 SHELL、POWERSHELL、BAT 之一。</p>
     * @param CommandType <p>命令类型。取值为 SHELL、POWERSHELL、BAT 之一。</p>
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get <p>命令执行路径。</p> 
     * @return WorkingDirectory <p>命令执行路径。</p>
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set <p>命令执行路径。</p>
     * @param WorkingDirectory <p>命令执行路径。</p>
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get <p>命令超时时间。</p><p>单位：秒</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p> 
     * @return Timeout <p>命令超时时间。</p><p>单位：秒</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>命令超时时间。</p><p>单位：秒</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
     * @param Timeout <p>命令超时时间。</p><p>单位：秒</p><p>指定 OutputCOSBucketUrl 参数时，超时时间将包含命令输出上传 COS 的耗时</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>命令创建时间。格式为：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return CreatedTime <p>命令创建时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>命令创建时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
     * @param CreatedTime <p>命令创建时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>命令更新时间。格式为：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return UpdatedTime <p>命令更新时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>命令更新时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
     * @param UpdatedTime <p>命令更新时间。格式为：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>是否启用自定义参数功能。</p> 
     * @return EnableParameter <p>是否启用自定义参数功能。</p>
     */
    public Boolean getEnableParameter() {
        return this.EnableParameter;
    }

    /**
     * Set <p>是否启用自定义参数功能。</p>
     * @param EnableParameter <p>是否启用自定义参数功能。</p>
     */
    public void setEnableParameter(Boolean EnableParameter) {
        this.EnableParameter = EnableParameter;
    }

    /**
     * Get <p>自定义参数的默认取值。</p> 
     * @return DefaultParameters <p>自定义参数的默认取值。</p>
     */
    public String getDefaultParameters() {
        return this.DefaultParameters;
    }

    /**
     * Set <p>自定义参数的默认取值。</p>
     * @param DefaultParameters <p>自定义参数的默认取值。</p>
     */
    public void setDefaultParameters(String DefaultParameters) {
        this.DefaultParameters = DefaultParameters;
    }

    /**
     * Get <p>自定义参数的默认取值。</p> 
     * @return DefaultParameterConfs <p>自定义参数的默认取值。</p>
     */
    public DefaultParameterConf [] getDefaultParameterConfs() {
        return this.DefaultParameterConfs;
    }

    /**
     * Set <p>自定义参数的默认取值。</p>
     * @param DefaultParameterConfs <p>自定义参数的默认取值。</p>
     */
    public void setDefaultParameterConfs(DefaultParameterConf [] DefaultParameterConfs) {
        this.DefaultParameterConfs = DefaultParameterConfs;
    }

    /**
     * Get <p>命令关联的场景</p> 
     * @return Scenes <p>命令关联的场景</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>命令关联的场景</p>
     * @param Scenes <p>命令关联的场景</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get <p>命令的结构化描述。公共命令有值，用户命令为空字符串。</p> 
     * @return FormattedDescription <p>命令的结构化描述。公共命令有值，用户命令为空字符串。</p>
     */
    public String getFormattedDescription() {
        return this.FormattedDescription;
    }

    /**
     * Set <p>命令的结构化描述。公共命令有值，用户命令为空字符串。</p>
     * @param FormattedDescription <p>命令的结构化描述。公共命令有值，用户命令为空字符串。</p>
     */
    public void setFormattedDescription(String FormattedDescription) {
        this.FormattedDescription = FormattedDescription;
    }

    /**
     * Get <p>命令创建者。</p><p>枚举值：</p><ul><li>TAT： 公共命令</li><li>USER： 个人创建的命令</li></ul> 
     * @return CreatedBy <p>命令创建者。</p><p>枚举值：</p><ul><li>TAT： 公共命令</li><li>USER： 个人创建的命令</li></ul>
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>命令创建者。</p><p>枚举值：</p><ul><li>TAT： 公共命令</li><li>USER： 个人创建的命令</li></ul>
     * @param CreatedBy <p>命令创建者。</p><p>枚举值：</p><ul><li>TAT： 公共命令</li><li>USER： 个人创建的命令</li></ul>
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <p>命令关联的标签列表。</p> 
     * @return Tags <p>命令关联的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>命令关联的标签列表。</p>
     * @param Tags <p>命令关联的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>在实例上执行命令的用户名。</p> 
     * @return Username <p>在实例上执行命令的用户名。</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>在实例上执行命令的用户名。</p>
     * @param Username <p>在实例上执行命令的用户名。</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>日志上传的cos bucket 地址。</p> 
     * @return OutputCOSBucketUrl <p>日志上传的cos bucket 地址。</p>
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set <p>日志上传的cos bucket 地址。</p>
     * @param OutputCOSBucketUrl <p>日志上传的cos bucket 地址。</p>
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get <p>日志在cos bucket中的目录。</p> 
     * @return OutputCOSKeyPrefix <p>日志在cos bucket中的目录。</p>
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set <p>日志在cos bucket中的目录。</p>
     * @param OutputCOSKeyPrefix <p>日志在cos bucket中的目录。</p>
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
        if (source.DefaultParameterConfs != null) {
            this.DefaultParameterConfs = new DefaultParameterConf[source.DefaultParameterConfs.length];
            for (int i = 0; i < source.DefaultParameterConfs.length; i++) {
                this.DefaultParameterConfs[i] = new DefaultParameterConf(source.DefaultParameterConfs[i]);
            }
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DefaultParameterConfs.", this.DefaultParameterConfs);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "FormattedDescription", this.FormattedDescription);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

