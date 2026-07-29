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

public class BuildCommands extends AbstractModel {

    /**
    * <p>平台生成默认 install step 时执行</p>
    */
    @SerializedName("InstallCmd")
    @Expose
    private String InstallCmd;

    /**
    * <p>平台生成默认build step 时执行</p>
    */
    @SerializedName("BuildCmd")
    @Expose
    private String BuildCmd;

    /**
    * <p>平台生成默认deploy step 时执行</p>
    */
    @SerializedName("DeployCmd")
    @Expose
    private String DeployCmd;

    /**
     * Get <p>平台生成默认 install step 时执行</p> 
     * @return InstallCmd <p>平台生成默认 install step 时执行</p>
     */
    public String getInstallCmd() {
        return this.InstallCmd;
    }

    /**
     * Set <p>平台生成默认 install step 时执行</p>
     * @param InstallCmd <p>平台生成默认 install step 时执行</p>
     */
    public void setInstallCmd(String InstallCmd) {
        this.InstallCmd = InstallCmd;
    }

    /**
     * Get <p>平台生成默认build step 时执行</p> 
     * @return BuildCmd <p>平台生成默认build step 时执行</p>
     */
    public String getBuildCmd() {
        return this.BuildCmd;
    }

    /**
     * Set <p>平台生成默认build step 时执行</p>
     * @param BuildCmd <p>平台生成默认build step 时执行</p>
     */
    public void setBuildCmd(String BuildCmd) {
        this.BuildCmd = BuildCmd;
    }

    /**
     * Get <p>平台生成默认deploy step 时执行</p> 
     * @return DeployCmd <p>平台生成默认deploy step 时执行</p>
     */
    public String getDeployCmd() {
        return this.DeployCmd;
    }

    /**
     * Set <p>平台生成默认deploy step 时执行</p>
     * @param DeployCmd <p>平台生成默认deploy step 时执行</p>
     */
    public void setDeployCmd(String DeployCmd) {
        this.DeployCmd = DeployCmd;
    }

    public BuildCommands() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildCommands(BuildCommands source) {
        if (source.InstallCmd != null) {
            this.InstallCmd = new String(source.InstallCmd);
        }
        if (source.BuildCmd != null) {
            this.BuildCmd = new String(source.BuildCmd);
        }
        if (source.DeployCmd != null) {
            this.DeployCmd = new String(source.DeployCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstallCmd", this.InstallCmd);
        this.setParamSimple(map, prefix + "BuildCmd", this.BuildCmd);
        this.setParamSimple(map, prefix + "DeployCmd", this.DeployCmd);

    }
}

