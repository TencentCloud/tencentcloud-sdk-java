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

public class UpgradeSmallVersionRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 当前redis版本
    */
    @SerializedName("CurrentRedisVersion")
    @Expose
    private String CurrentRedisVersion;

    /**
    * 可升级的redis版本
    */
    @SerializedName("UpgradeRedisVersion")
    @Expose
    private String UpgradeRedisVersion;

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
     * Get 当前redis版本 
     * @return CurrentRedisVersion 当前redis版本
     */
    public String getCurrentRedisVersion() {
        return this.CurrentRedisVersion;
    }

    /**
     * Set 当前redis版本
     * @param CurrentRedisVersion 当前redis版本
     */
    public void setCurrentRedisVersion(String CurrentRedisVersion) {
        this.CurrentRedisVersion = CurrentRedisVersion;
    }

    /**
     * Get 可升级的redis版本 
     * @return UpgradeRedisVersion 可升级的redis版本
     */
    public String getUpgradeRedisVersion() {
        return this.UpgradeRedisVersion;
    }

    /**
     * Set 可升级的redis版本
     * @param UpgradeRedisVersion 可升级的redis版本
     */
    public void setUpgradeRedisVersion(String UpgradeRedisVersion) {
        this.UpgradeRedisVersion = UpgradeRedisVersion;
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

    public UpgradeSmallVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeSmallVersionRequest(UpgradeSmallVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CurrentRedisVersion != null) {
            this.CurrentRedisVersion = new String(source.CurrentRedisVersion);
        }
        if (source.UpgradeRedisVersion != null) {
            this.UpgradeRedisVersion = new String(source.UpgradeRedisVersion);
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
        this.setParamSimple(map, prefix + "CurrentRedisVersion", this.CurrentRedisVersion);
        this.setParamSimple(map, prefix + "UpgradeRedisVersion", this.UpgradeRedisVersion);
        this.setParamSimple(map, prefix + "InstanceTypeUpgradeNow", this.InstanceTypeUpgradeNow);

    }
}

