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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeInfo extends AbstractModel {

    /**
    * <p>存活探针</p>
    */
    @SerializedName("LivenessProbe")
    @Expose
    private ProbeConfig LivenessProbe;

    /**
    * <p>就绪探针</p>
    */
    @SerializedName("ReadinessProbe")
    @Expose
    private ProbeConfig ReadinessProbe;

    /**
    * <p>启动探针</p>
    */
    @SerializedName("StartupProbe")
    @Expose
    private ProbeConfig StartupProbe;

    /**
     * Get <p>存活探针</p> 
     * @return LivenessProbe <p>存活探针</p>
     */
    public ProbeConfig getLivenessProbe() {
        return this.LivenessProbe;
    }

    /**
     * Set <p>存活探针</p>
     * @param LivenessProbe <p>存活探针</p>
     */
    public void setLivenessProbe(ProbeConfig LivenessProbe) {
        this.LivenessProbe = LivenessProbe;
    }

    /**
     * Get <p>就绪探针</p> 
     * @return ReadinessProbe <p>就绪探针</p>
     */
    public ProbeConfig getReadinessProbe() {
        return this.ReadinessProbe;
    }

    /**
     * Set <p>就绪探针</p>
     * @param ReadinessProbe <p>就绪探针</p>
     */
    public void setReadinessProbe(ProbeConfig ReadinessProbe) {
        this.ReadinessProbe = ReadinessProbe;
    }

    /**
     * Get <p>启动探针</p> 
     * @return StartupProbe <p>启动探针</p>
     */
    public ProbeConfig getStartupProbe() {
        return this.StartupProbe;
    }

    /**
     * Set <p>启动探针</p>
     * @param StartupProbe <p>启动探针</p>
     */
    public void setStartupProbe(ProbeConfig StartupProbe) {
        this.StartupProbe = StartupProbe;
    }

    public ProbeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeInfo(ProbeInfo source) {
        if (source.LivenessProbe != null) {
            this.LivenessProbe = new ProbeConfig(source.LivenessProbe);
        }
        if (source.ReadinessProbe != null) {
            this.ReadinessProbe = new ProbeConfig(source.ReadinessProbe);
        }
        if (source.StartupProbe != null) {
            this.StartupProbe = new ProbeConfig(source.StartupProbe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LivenessProbe.", this.LivenessProbe);
        this.setParamObj(map, prefix + "ReadinessProbe.", this.ReadinessProbe);
        this.setParamObj(map, prefix + "StartupProbe.", this.StartupProbe);

    }
}

