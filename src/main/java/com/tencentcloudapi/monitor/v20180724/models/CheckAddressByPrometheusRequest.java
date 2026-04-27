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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAddressByPrometheusRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>探测地址</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>探测方式。tcp或http，默认是tcp</p>
    */
    @SerializedName("ProbeProtocol")
    @Expose
    private String ProbeProtocol;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>探测地址</p> 
     * @return Target <p>探测地址</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>探测地址</p>
     * @param Target <p>探测地址</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>探测方式。tcp或http，默认是tcp</p> 
     * @return ProbeProtocol <p>探测方式。tcp或http，默认是tcp</p>
     */
    public String getProbeProtocol() {
        return this.ProbeProtocol;
    }

    /**
     * Set <p>探测方式。tcp或http，默认是tcp</p>
     * @param ProbeProtocol <p>探测方式。tcp或http，默认是tcp</p>
     */
    public void setProbeProtocol(String ProbeProtocol) {
        this.ProbeProtocol = ProbeProtocol;
    }

    public CheckAddressByPrometheusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAddressByPrometheusRequest(CheckAddressByPrometheusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.ProbeProtocol != null) {
            this.ProbeProtocol = new String(source.ProbeProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "ProbeProtocol", this.ProbeProtocol);

    }
}

