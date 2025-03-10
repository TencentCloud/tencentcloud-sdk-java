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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommandDocument extends AbstractModel {

    /**
    * Base64 编码后的执行命令。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 命令类型。取值为 SHELL、POWERSHELL、BAT 之一。
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * 超时时间。单位：秒。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 执行路径。
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 执行用户。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 保存输出的 COS Bucket 链接。
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * 保存输出的文件名称前缀。
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get Base64 编码后的执行命令。 
     * @return Content Base64 编码后的执行命令。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64 编码后的执行命令。
     * @param Content Base64 编码后的执行命令。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 命令类型。取值为 SHELL、POWERSHELL、BAT 之一。 
     * @return CommandType 命令类型。取值为 SHELL、POWERSHELL、BAT 之一。
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set 命令类型。取值为 SHELL、POWERSHELL、BAT 之一。
     * @param CommandType 命令类型。取值为 SHELL、POWERSHELL、BAT 之一。
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get 超时时间。单位：秒。 
     * @return Timeout 超时时间。单位：秒。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间。单位：秒。
     * @param Timeout 超时时间。单位：秒。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 执行路径。 
     * @return WorkingDirectory 执行路径。
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 执行路径。
     * @param WorkingDirectory 执行路径。
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get 执行用户。 
     * @return Username 执行用户。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 执行用户。
     * @param Username 执行用户。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 保存输出的 COS Bucket 链接。 
     * @return OutputCOSBucketUrl 保存输出的 COS Bucket 链接。
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set 保存输出的 COS Bucket 链接。
     * @param OutputCOSBucketUrl 保存输出的 COS Bucket 链接。
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get 保存输出的文件名称前缀。 
     * @return OutputCOSKeyPrefix 保存输出的文件名称前缀。
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set 保存输出的文件名称前缀。
     * @param OutputCOSKeyPrefix 保存输出的文件名称前缀。
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public CommandDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandDocument(CommandDocument source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
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
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

