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

public class CloudAppVersionItem extends AbstractModel {

    /**
    * <p>版本名</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>构建方式</p>
    */
    @SerializedName("BuildType")
    @Expose
    private String BuildType;

    /**
    * <p>构建Id</p>
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
    * <p>构建状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>框架名</p>
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * <p>构建配置</p>
    */
    @SerializedName("StaticConfig")
    @Expose
    private StaticConfig StaticConfig;

    /**
    * <p>构建时间</p>
    */
    @SerializedName("BuildTime")
    @Expose
    private String BuildTime;

    /**
    * <p>构建步骤</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Steps")
    @Expose
    private BuildStepStatus [] Steps;

    /**
     * Get <p>版本名</p> 
     * @return VersionName <p>版本名</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>版本名</p>
     * @param VersionName <p>版本名</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>构建方式</p> 
     * @return BuildType <p>构建方式</p>
     */
    public String getBuildType() {
        return this.BuildType;
    }

    /**
     * Set <p>构建方式</p>
     * @param BuildType <p>构建方式</p>
     */
    public void setBuildType(String BuildType) {
        this.BuildType = BuildType;
    }

    /**
     * Get <p>构建Id</p> 
     * @return BuildId <p>构建Id</p>
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set <p>构建Id</p>
     * @param BuildId <p>构建Id</p>
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get <p>构建状态</p> 
     * @return Status <p>构建状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>构建状态</p>
     * @param Status <p>构建状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>框架名</p> 
     * @return Framework <p>框架名</p>
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set <p>框架名</p>
     * @param Framework <p>框架名</p>
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get <p>构建配置</p> 
     * @return StaticConfig <p>构建配置</p>
     */
    public StaticConfig getStaticConfig() {
        return this.StaticConfig;
    }

    /**
     * Set <p>构建配置</p>
     * @param StaticConfig <p>构建配置</p>
     */
    public void setStaticConfig(StaticConfig StaticConfig) {
        this.StaticConfig = StaticConfig;
    }

    /**
     * Get <p>构建时间</p> 
     * @return BuildTime <p>构建时间</p>
     */
    public String getBuildTime() {
        return this.BuildTime;
    }

    /**
     * Set <p>构建时间</p>
     * @param BuildTime <p>构建时间</p>
     */
    public void setBuildTime(String BuildTime) {
        this.BuildTime = BuildTime;
    }

    /**
     * Get <p>构建步骤</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Steps <p>构建步骤</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BuildStepStatus [] getSteps() {
        return this.Steps;
    }

    /**
     * Set <p>构建步骤</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Steps <p>构建步骤</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSteps(BuildStepStatus [] Steps) {
        this.Steps = Steps;
    }

    public CloudAppVersionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppVersionItem(CloudAppVersionItem source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.BuildType != null) {
            this.BuildType = new String(source.BuildType);
        }
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.StaticConfig != null) {
            this.StaticConfig = new StaticConfig(source.StaticConfig);
        }
        if (source.BuildTime != null) {
            this.BuildTime = new String(source.BuildTime);
        }
        if (source.Steps != null) {
            this.Steps = new BuildStepStatus[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new BuildStepStatus(source.Steps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "BuildType", this.BuildType);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamObj(map, prefix + "StaticConfig.", this.StaticConfig);
        this.setParamSimple(map, prefix + "BuildTime", this.BuildTime);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);

    }
}

