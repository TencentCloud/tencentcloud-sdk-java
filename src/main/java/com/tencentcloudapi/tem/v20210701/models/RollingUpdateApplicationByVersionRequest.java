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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollingUpdateApplicationByVersionRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 环境ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * JAR/WAR 包名，仅 JAR/WAR 部署时必填
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 请求来源平台，含 IntelliJ，Coding
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 环境ID 
     * @return EnvironmentId 环境ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
     * @param EnvironmentId 环境ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version 
     * @return DeployVersion 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
     * @param DeployVersion 更新版本，IMAGE 部署为 tag 值；JAR/WAR 部署 为 Version
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get JAR/WAR 包名，仅 JAR/WAR 部署时必填 
     * @return PackageName JAR/WAR 包名，仅 JAR/WAR 部署时必填
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set JAR/WAR 包名，仅 JAR/WAR 部署时必填
     * @param PackageName JAR/WAR 包名，仅 JAR/WAR 部署时必填
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 请求来源平台，含 IntelliJ，Coding 
     * @return From 请求来源平台，含 IntelliJ，Coding
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 请求来源平台，含 IntelliJ，Coding
     * @param From 请求来源平台，含 IntelliJ，Coding
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public RollingUpdateApplicationByVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollingUpdateApplicationByVersionRequest(RollingUpdateApplicationByVersionRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

