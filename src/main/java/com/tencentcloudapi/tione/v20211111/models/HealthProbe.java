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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthProbe extends AbstractModel {

    /**
    * 存活探针
    */
    @SerializedName("LivenessProbe")
    @Expose
    private Probe LivenessProbe;

    /**
    * 就绪探针
    */
    @SerializedName("ReadinessProbe")
    @Expose
    private Probe ReadinessProbe;

    /**
    * 启动探针
    */
    @SerializedName("StartupProbe")
    @Expose
    private Probe StartupProbe;

    /**
     * Get 存活探针 
     * @return LivenessProbe 存活探针
     */
    public Probe getLivenessProbe() {
        return this.LivenessProbe;
    }

    /**
     * Set 存活探针
     * @param LivenessProbe 存活探针
     */
    public void setLivenessProbe(Probe LivenessProbe) {
        this.LivenessProbe = LivenessProbe;
    }

    /**
     * Get 就绪探针 
     * @return ReadinessProbe 就绪探针
     */
    public Probe getReadinessProbe() {
        return this.ReadinessProbe;
    }

    /**
     * Set 就绪探针
     * @param ReadinessProbe 就绪探针
     */
    public void setReadinessProbe(Probe ReadinessProbe) {
        this.ReadinessProbe = ReadinessProbe;
    }

    /**
     * Get 启动探针 
     * @return StartupProbe 启动探针
     */
    public Probe getStartupProbe() {
        return this.StartupProbe;
    }

    /**
     * Set 启动探针
     * @param StartupProbe 启动探针
     */
    public void setStartupProbe(Probe StartupProbe) {
        this.StartupProbe = StartupProbe;
    }

    public HealthProbe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthProbe(HealthProbe source) {
        if (source.LivenessProbe != null) {
            this.LivenessProbe = new Probe(source.LivenessProbe);
        }
        if (source.ReadinessProbe != null) {
            this.ReadinessProbe = new Probe(source.ReadinessProbe);
        }
        if (source.StartupProbe != null) {
            this.StartupProbe = new Probe(source.StartupProbe);
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

