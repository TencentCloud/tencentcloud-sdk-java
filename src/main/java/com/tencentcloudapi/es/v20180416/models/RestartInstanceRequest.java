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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartInstanceRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * 重启模式：0 滚动重启； 1 全量重启
    */
    @SerializedName("RestartMode")
    @Expose
    private Long RestartMode;

    /**
    * 重启时选择是否升级内核patch版本
    */
    @SerializedName("UpgradeKernel")
    @Expose
    private Boolean UpgradeKernel;

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
     * Get 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false 
     * @return ForceRestart 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
     * @param ForceRestart 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get 重启模式：0 滚动重启； 1 全量重启 
     * @return RestartMode 重启模式：0 滚动重启； 1 全量重启
     */
    public Long getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set 重启模式：0 滚动重启； 1 全量重启
     * @param RestartMode 重启模式：0 滚动重启； 1 全量重启
     */
    public void setRestartMode(Long RestartMode) {
        this.RestartMode = RestartMode;
    }

    /**
     * Get 重启时选择是否升级内核patch版本 
     * @return UpgradeKernel 重启时选择是否升级内核patch版本
     */
    public Boolean getUpgradeKernel() {
        return this.UpgradeKernel;
    }

    /**
     * Set 重启时选择是否升级内核patch版本
     * @param UpgradeKernel 重启时选择是否升级内核patch版本
     */
    public void setUpgradeKernel(Boolean UpgradeKernel) {
        this.UpgradeKernel = UpgradeKernel;
    }

    public RestartInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartInstanceRequest(RestartInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.RestartMode != null) {
            this.RestartMode = new Long(source.RestartMode);
        }
        if (source.UpgradeKernel != null) {
            this.UpgradeKernel = new Boolean(source.UpgradeKernel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamSimple(map, prefix + "RestartMode", this.RestartMode);
        this.setParamSimple(map, prefix + "UpgradeKernel", this.UpgradeKernel);

    }
}

