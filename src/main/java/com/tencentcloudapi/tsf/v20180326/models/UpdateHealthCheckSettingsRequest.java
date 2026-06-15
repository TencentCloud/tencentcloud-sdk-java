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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateHealthCheckSettingsRequest extends AbstractModel {

    /**
    * <p>部署组ID，可通过调用<a href="https://cloud.tencent.com/document/api/649/36068">DescribeContainerGroups</a>查询已创建的部署组列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/api/649/36075">CreateContainGroup</a>创建新的部署组。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>是否开启健康检查</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>健康检查配置</p>
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * <p>是否自动重启</p>
    */
    @SerializedName("LivenessAutoRestart")
    @Expose
    private Boolean LivenessAutoRestart;

    /**
     * Get <p>部署组ID，可通过调用<a href="https://cloud.tencent.com/document/api/649/36068">DescribeContainerGroups</a>查询已创建的部署组列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/api/649/36075">CreateContainGroup</a>创建新的部署组。</p> 
     * @return GroupId <p>部署组ID，可通过调用<a href="https://cloud.tencent.com/document/api/649/36068">DescribeContainerGroups</a>查询已创建的部署组列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/api/649/36075">CreateContainGroup</a>创建新的部署组。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>部署组ID，可通过调用<a href="https://cloud.tencent.com/document/api/649/36068">DescribeContainerGroups</a>查询已创建的部署组列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/api/649/36075">CreateContainGroup</a>创建新的部署组。</p>
     * @param GroupId <p>部署组ID，可通过调用<a href="https://cloud.tencent.com/document/api/649/36068">DescribeContainerGroups</a>查询已创建的部署组列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/api/649/36075">CreateContainGroup</a>创建新的部署组。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>是否开启健康检查</p> 
     * @return EnableHealthCheck <p>是否开启健康检查</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否开启健康检查</p>
     * @param EnableHealthCheck <p>是否开启健康检查</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>健康检查配置</p> 
     * @return HealthCheckSettings <p>健康检查配置</p>
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set <p>健康检查配置</p>
     * @param HealthCheckSettings <p>健康检查配置</p>
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get <p>是否自动重启</p> 
     * @return LivenessAutoRestart <p>是否自动重启</p>
     */
    public Boolean getLivenessAutoRestart() {
        return this.LivenessAutoRestart;
    }

    /**
     * Set <p>是否自动重启</p>
     * @param LivenessAutoRestart <p>是否自动重启</p>
     */
    public void setLivenessAutoRestart(Boolean LivenessAutoRestart) {
        this.LivenessAutoRestart = LivenessAutoRestart;
    }

    public UpdateHealthCheckSettingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateHealthCheckSettingsRequest(UpdateHealthCheckSettingsRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.LivenessAutoRestart != null) {
            this.LivenessAutoRestart = new Boolean(source.LivenessAutoRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "LivenessAutoRestart", this.LivenessAutoRestart);

    }
}

