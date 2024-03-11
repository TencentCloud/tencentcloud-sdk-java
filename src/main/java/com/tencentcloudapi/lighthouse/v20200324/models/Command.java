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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Command extends AbstractModel {

    /**
    * Base64编码后的命令内容，长度不可超过64KB。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 命令超时时间，默认60秒。取值范围[1, 86400]。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * 在 Lighthouse 实例中执行命令的用户名称。
默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get Base64编码后的命令内容，长度不可超过64KB。 
     * @return Content Base64编码后的命令内容，长度不可超过64KB。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64编码后的命令内容，长度不可超过64KB。
     * @param Content Base64编码后的命令内容，长度不可超过64KB。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 命令超时时间，默认60秒。取值范围[1, 86400]。 
     * @return Timeout 命令超时时间，默认60秒。取值范围[1, 86400]。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 命令超时时间，默认60秒。取值范围[1, 86400]。
     * @param Timeout 命令超时时间，默认60秒。取值范围[1, 86400]。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。 
     * @return WorkingDirectory 命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set 命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。
     * @param WorkingDirectory 命令执行路径，对于 SHELL 命令默认为 /root，对于 POWERSHELL 命令默认为 C:\Program Files\qcloud\tat_agent\workdir。
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get 在 Lighthouse 实例中执行命令的用户名称。
默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。 
     * @return Username 在 Lighthouse 实例中执行命令的用户名称。
默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 在 Lighthouse 实例中执行命令的用户名称。
默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。
     * @param Username 在 Lighthouse 实例中执行命令的用户名称。
默认情况下，在 Linux 实例中以 root 用户执行命令；在Windows 实例中以 System 用户执行命令。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public Command() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Command(Command source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

