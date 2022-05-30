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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeProxyVersionRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 当前proxy版本
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * 可升级的redis版本
    */
    @SerializedName("UpgradeProxyVersion")
    @Expose
    private String UpgradeProxyVersion;

    /**
    * 1-立即升级   0-维护时间窗口升级
    */
    @SerializedName("InstanceTypeUpgradeNow")
    @Expose
    private Long InstanceTypeUpgradeNow;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 当前proxy版本 
     * @return CurrentProxyVersion 当前proxy版本
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set 当前proxy版本
     * @param CurrentProxyVersion 当前proxy版本
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get 可升级的redis版本 
     * @return UpgradeProxyVersion 可升级的redis版本
     */
    public String getUpgradeProxyVersion() {
        return this.UpgradeProxyVersion;
    }

    /**
     * Set 可升级的redis版本
     * @param UpgradeProxyVersion 可升级的redis版本
     */
    public void setUpgradeProxyVersion(String UpgradeProxyVersion) {
        this.UpgradeProxyVersion = UpgradeProxyVersion;
    }

    /**
     * Get 1-立即升级   0-维护时间窗口升级 
     * @return InstanceTypeUpgradeNow 1-立即升级   0-维护时间窗口升级
     */
    public Long getInstanceTypeUpgradeNow() {
        return this.InstanceTypeUpgradeNow;
    }

    /**
     * Set 1-立即升级   0-维护时间窗口升级
     * @param InstanceTypeUpgradeNow 1-立即升级   0-维护时间窗口升级
     */
    public void setInstanceTypeUpgradeNow(Long InstanceTypeUpgradeNow) {
        this.InstanceTypeUpgradeNow = InstanceTypeUpgradeNow;
    }

    public UpgradeProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxyVersionRequest(UpgradeProxyVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.UpgradeProxyVersion != null) {
            this.UpgradeProxyVersion = new String(source.UpgradeProxyVersion);
        }
        if (source.InstanceTypeUpgradeNow != null) {
            this.InstanceTypeUpgradeNow = new Long(source.InstanceTypeUpgradeNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "UpgradeProxyVersion", this.UpgradeProxyVersion);
        this.setParamSimple(map, prefix + "InstanceTypeUpgradeNow", this.InstanceTypeUpgradeNow);

    }
}

