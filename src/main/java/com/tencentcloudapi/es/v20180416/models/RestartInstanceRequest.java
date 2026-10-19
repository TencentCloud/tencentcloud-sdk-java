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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false</p>
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * <p>重启模式：0 滚动重启； 1 全量重启</p>
    */
    @SerializedName("RestartMode")
    @Expose
    private Long RestartMode;

    /**
    * <p>重启时选择是否升级内核patch版本</p>
    */
    @SerializedName("UpgradeKernel")
    @Expose
    private Boolean UpgradeKernel;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false</p> 
     * @return ForceRestart <p>是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false</p>
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set <p>是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false</p>
     * @param ForceRestart <p>是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false</p>
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get <p>重启模式：0 滚动重启； 1 全量重启</p> 
     * @return RestartMode <p>重启模式：0 滚动重启； 1 全量重启</p>
     */
    public Long getRestartMode() {
        return this.RestartMode;
    }

    /**
     * Set <p>重启模式：0 滚动重启； 1 全量重启</p>
     * @param RestartMode <p>重启模式：0 滚动重启； 1 全量重启</p>
     */
    public void setRestartMode(Long RestartMode) {
        this.RestartMode = RestartMode;
    }

    /**
     * Get <p>重启时选择是否升级内核patch版本</p> 
     * @return UpgradeKernel <p>重启时选择是否升级内核patch版本</p>
     */
    public Boolean getUpgradeKernel() {
        return this.UpgradeKernel;
    }

    /**
     * Set <p>重启时选择是否升级内核patch版本</p>
     * @param UpgradeKernel <p>重启时选择是否升级内核patch版本</p>
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

