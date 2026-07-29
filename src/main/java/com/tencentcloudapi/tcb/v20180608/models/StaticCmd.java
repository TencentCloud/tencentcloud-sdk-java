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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticCmd extends AbstractModel {

    /**
    * 构建命令
    */
    @SerializedName("BuildCmd")
    @Expose
    private String BuildCmd;

    /**
    * 安装命令
    */
    @SerializedName("InstallCmd")
    @Expose
    private String InstallCmd;

    /**
    * 部署命令
    */
    @SerializedName("DeployCmd")
    @Expose
    private String DeployCmd;

    /**
     * Get 构建命令 
     * @return BuildCmd 构建命令
     */
    public String getBuildCmd() {
        return this.BuildCmd;
    }

    /**
     * Set 构建命令
     * @param BuildCmd 构建命令
     */
    public void setBuildCmd(String BuildCmd) {
        this.BuildCmd = BuildCmd;
    }

    /**
     * Get 安装命令 
     * @return InstallCmd 安装命令
     */
    public String getInstallCmd() {
        return this.InstallCmd;
    }

    /**
     * Set 安装命令
     * @param InstallCmd 安装命令
     */
    public void setInstallCmd(String InstallCmd) {
        this.InstallCmd = InstallCmd;
    }

    /**
     * Get 部署命令 
     * @return DeployCmd 部署命令
     */
    public String getDeployCmd() {
        return this.DeployCmd;
    }

    /**
     * Set 部署命令
     * @param DeployCmd 部署命令
     */
    public void setDeployCmd(String DeployCmd) {
        this.DeployCmd = DeployCmd;
    }

    public StaticCmd() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticCmd(StaticCmd source) {
        if (source.BuildCmd != null) {
            this.BuildCmd = new String(source.BuildCmd);
        }
        if (source.InstallCmd != null) {
            this.InstallCmd = new String(source.InstallCmd);
        }
        if (source.DeployCmd != null) {
            this.DeployCmd = new String(source.DeployCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "DeployCmd", this.DeployCmd);

    }
}

