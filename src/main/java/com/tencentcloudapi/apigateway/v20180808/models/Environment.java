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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel{

    /**
    * 环境名称。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 访问路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 发布状态，1 表示已发布，0 表示未发布。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 运行版本。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
     * Get 环境名称。 
     * @return EnvironmentName 环境名称。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称。
     * @param EnvironmentName 环境名称。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 访问路径。 
     * @return Url 访问路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 访问路径。
     * @param Url 访问路径。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 发布状态，1 表示已发布，0 表示未发布。 
     * @return Status 发布状态，1 表示已发布，0 表示未发布。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态，1 表示已发布，0 表示未发布。
     * @param Status 发布状态，1 表示已发布，0 表示未发布。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 运行版本。 
     * @return VersionName 运行版本。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 运行版本。
     * @param VersionName 运行版本。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);

    }
}

