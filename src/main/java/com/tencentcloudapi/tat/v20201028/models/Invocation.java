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

public class Invocation extends AbstractModel{

    /**
    * 执行活动ID。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * 命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
    */
    @SerializedName("InvocationStatus")
    @Expose
    private String InvocationStatus;

    /**
    * 执行任务信息列表。
    */
    @SerializedName("InvocationTaskBasicInfoSet")
    @Expose
    private InvocationTaskBasicInfo [] InvocationTaskBasicInfoSet;

    /**
    * 执行活动描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 执行活动开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 执行活动结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 执行活动创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 执行活动更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 自定义参数取值。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 自定义参数的默认取值。
    */
    @SerializedName("DefaultParameters")
    @Expose
    private String DefaultParameters;

    /**
    * 执行命令的实例类型，取值范围：CVM、LIGHTHOUSE。
    */
    @SerializedName("InstanceKind")
    @Expose
    private String InstanceKind;

    /**
    * 在实例上执行命令时使用的用户名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 调用来源。
    */
    @SerializedName("InvocationSource")
    @Expose
    private String InvocationSource;

    /**
    * base64编码的命令内容
    */
    @SerializedName("CommandContent")
    @Expose
    private String CommandContent;

    /**
    * 命令类型
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * 执行命令过期时间， 单位秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 执行命令的工作路径
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

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
     * Get 执行活动ID。 
     * @return InvocationId 执行活动ID。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set 执行活动ID。
     * @param InvocationId 执行活动ID。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

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
     * Get 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败 
     * @return InvocationStatus 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
     */
    public String getInvocationStatus() {
        return this.InvocationStatus;
    }

    /**
     * Set 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
     * @param InvocationStatus 执行任务状态。取值范围：
<li> PENDING：等待下发 
<li> RUNNING：命令运行中
<li> SUCCESS：命令成功
<li> FAILED：命令失败
<li> TIMEOUT：命令超时
<li> PARTIAL_FAILED：命令部分失败
     */
    public void setInvocationStatus(String InvocationStatus) {
        this.InvocationStatus = InvocationStatus;
    }

    /**
     * Get 执行任务信息列表。 
     * @return InvocationTaskBasicInfoSet 执行任务信息列表。
     */
    public InvocationTaskBasicInfo [] getInvocationTaskBasicInfoSet() {
        return this.InvocationTaskBasicInfoSet;
    }

    /**
     * Set 执行任务信息列表。
     * @param InvocationTaskBasicInfoSet 执行任务信息列表。
     */
    public void setInvocationTaskBasicInfoSet(InvocationTaskBasicInfo [] InvocationTaskBasicInfoSet) {
        this.InvocationTaskBasicInfoSet = InvocationTaskBasicInfoSet;
    }

    /**
     * Get 执行活动描述。 
     * @return Description 执行活动描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 执行活动描述。
     * @param Description 执行活动描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 执行活动开始时间。 
     * @return StartTime 执行活动开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 执行活动开始时间。
     * @param StartTime 执行活动开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 执行活动结束时间。 
     * @return EndTime 执行活动结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 执行活动结束时间。
     * @param EndTime 执行活动结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 执行活动创建时间。 
     * @return CreatedTime 执行活动创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 执行活动创建时间。
     * @param CreatedTime 执行活动创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 执行活动更新时间。 
     * @return UpdatedTime 执行活动更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 执行活动更新时间。
     * @param UpdatedTime 执行活动更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 自定义参数取值。 
     * @return Parameters 自定义参数取值。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 自定义参数取值。
     * @param Parameters 自定义参数取值。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
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
     * Get 执行命令的实例类型，取值范围：CVM、LIGHTHOUSE。 
     * @return InstanceKind 执行命令的实例类型，取值范围：CVM、LIGHTHOUSE。
     */
    public String getInstanceKind() {
        return this.InstanceKind;
    }

    /**
     * Set 执行命令的实例类型，取值范围：CVM、LIGHTHOUSE。
     * @param InstanceKind 执行命令的实例类型，取值范围：CVM、LIGHTHOUSE。
     */
    public void setInstanceKind(String InstanceKind) {
        this.InstanceKind = InstanceKind;
    }

    /**
     * Get 在实例上执行命令时使用的用户名。 
     * @return Username 在实例上执行命令时使用的用户名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 在实例上执行命令时使用的用户名。
     * @param Username 在实例上执行命令时使用的用户名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 调用来源。 
     * @return InvocationSource 调用来源。
     */
    public String getInvocationSource() {
        return this.InvocationSource;
    }

    /**
     * Set 调用来源。
     * @param InvocationSource 调用来源。
     */
    public void setInvocationSource(String InvocationSource) {
        this.InvocationSource = InvocationSource;
    }

    /**
     * Get base64编码的命令内容 
     * @return CommandContent base64编码的命令内容
     */
    public String getCommandContent() {
        return this.CommandContent;
    }

    /**
     * Set base64编码的命令内容
     * @param CommandContent base64编码的命令内容
     */
    public void setCommandContent(String CommandContent) {
        this.CommandContent = CommandContent;
    }

    /**
     * Get 命令类型 
     * @return CommandType 命令类型
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set 命令类型
     * @param CommandType 命令类型
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get 执行命令过期时间， 单位秒 
     * @return Timeout 执行命令过期时间， 单位秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 执行命令过期时间， 单位秒
     * @param Timeout 执行命令过期时间， 单位秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 执行命令的工作路径 
     * @return WorkingDirectory 执行命令的工作路径
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 执行命令的工作路径
     * @param WorkingDirectory 执行命令的工作路径
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
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

    public Invocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Invocation(Invocation source) {
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InvocationStatus != null) {
            this.InvocationStatus = new String(source.InvocationStatus);
        }
        if (source.InvocationTaskBasicInfoSet != null) {
            this.InvocationTaskBasicInfoSet = new InvocationTaskBasicInfo[source.InvocationTaskBasicInfoSet.length];
            for (int i = 0; i < source.InvocationTaskBasicInfoSet.length; i++) {
                this.InvocationTaskBasicInfoSet[i] = new InvocationTaskBasicInfo(source.InvocationTaskBasicInfoSet[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.DefaultParameters != null) {
            this.DefaultParameters = new String(source.DefaultParameters);
        }
        if (source.InstanceKind != null) {
            this.InstanceKind = new String(source.InstanceKind);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.InvocationSource != null) {
            this.InvocationSource = new String(source.InvocationSource);
        }
        if (source.CommandContent != null) {
            this.CommandContent = new String(source.CommandContent);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
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
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "InvocationStatus", this.InvocationStatus);
        this.setParamArrayObj(map, prefix + "InvocationTaskBasicInfoSet.", this.InvocationTaskBasicInfoSet);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "DefaultParameters", this.DefaultParameters);
        this.setParamSimple(map, prefix + "InstanceKind", this.InstanceKind);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "InvocationSource", this.InvocationSource);
        this.setParamSimple(map, prefix + "CommandContent", this.CommandContent);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

