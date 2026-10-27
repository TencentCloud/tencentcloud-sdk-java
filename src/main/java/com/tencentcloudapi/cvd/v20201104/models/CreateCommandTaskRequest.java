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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCommandTaskRequest extends AbstractModel {

    /**
    * 脚本任务，需要 Base64 编码
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 脚本任务类型：windows 桌面可选有：    PowerShellScript — powershell脚本    BatScript — Bat 脚本
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 执行脚本任务的实例列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 是否以绑定用户身份执行，默认 System身份运行false： System身份运行，默认行为true：以绑定用户身份执行
    */
    @SerializedName("RunAsBoundUser")
    @Expose
    private Boolean RunAsBoundUser;

    /**
    * 是否前台运行false：后台运行，默认行为true：前台运行
    */
    @SerializedName("RunForeground")
    @Expose
    private Boolean RunForeground;

    /**
     * Get 脚本任务，需要 Base64 编码 
     * @return Command 脚本任务，需要 Base64 编码
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 脚本任务，需要 Base64 编码
     * @param Command 脚本任务，需要 Base64 编码
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 脚本任务类型：windows 桌面可选有：    PowerShellScript — powershell脚本    BatScript — Bat 脚本 
     * @return Type 脚本任务类型：windows 桌面可选有：    PowerShellScript — powershell脚本    BatScript — Bat 脚本
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 脚本任务类型：windows 桌面可选有：    PowerShellScript — powershell脚本    BatScript — Bat 脚本
     * @param Type 脚本任务类型：windows 桌面可选有：    PowerShellScript — powershell脚本    BatScript — Bat 脚本
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 执行脚本任务的实例列表 
     * @return InstanceIds 执行脚本任务的实例列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 执行脚本任务的实例列表
     * @param InstanceIds 执行脚本任务的实例列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 是否以绑定用户身份执行，默认 System身份运行false： System身份运行，默认行为true：以绑定用户身份执行 
     * @return RunAsBoundUser 是否以绑定用户身份执行，默认 System身份运行false： System身份运行，默认行为true：以绑定用户身份执行
     */
    public Boolean getRunAsBoundUser() {
        return this.RunAsBoundUser;
    }

    /**
     * Set 是否以绑定用户身份执行，默认 System身份运行false： System身份运行，默认行为true：以绑定用户身份执行
     * @param RunAsBoundUser 是否以绑定用户身份执行，默认 System身份运行false： System身份运行，默认行为true：以绑定用户身份执行
     */
    public void setRunAsBoundUser(Boolean RunAsBoundUser) {
        this.RunAsBoundUser = RunAsBoundUser;
    }

    /**
     * Get 是否前台运行false：后台运行，默认行为true：前台运行 
     * @return RunForeground 是否前台运行false：后台运行，默认行为true：前台运行
     */
    public Boolean getRunForeground() {
        return this.RunForeground;
    }

    /**
     * Set 是否前台运行false：后台运行，默认行为true：前台运行
     * @param RunForeground 是否前台运行false：后台运行，默认行为true：前台运行
     */
    public void setRunForeground(Boolean RunForeground) {
        this.RunForeground = RunForeground;
    }

    public CreateCommandTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCommandTaskRequest(CreateCommandTaskRequest source) {
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.RunAsBoundUser != null) {
            this.RunAsBoundUser = new Boolean(source.RunAsBoundUser);
        }
        if (source.RunForeground != null) {
            this.RunForeground = new Boolean(source.RunForeground);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RunAsBoundUser", this.RunAsBoundUser);
        this.setParamSimple(map, prefix + "RunForeground", this.RunForeground);

    }
}

