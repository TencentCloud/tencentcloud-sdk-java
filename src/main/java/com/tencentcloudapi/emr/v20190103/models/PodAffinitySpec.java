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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodAffinitySpec extends AbstractModel {

    /**
    * <p>调度硬关联规则</p>
    */
    @SerializedName("RequiredDuringSchedulingIgnoredDuringExecution")
    @Expose
    private PodAffinityTerm [] RequiredDuringSchedulingIgnoredDuringExecution;

    /**
    * <p>调度软关联规则</p>
    */
    @SerializedName("PreferredDuringSchedulingIgnoredDuringExecution")
    @Expose
    private WeightedPodAffinityTerm [] PreferredDuringSchedulingIgnoredDuringExecution;

    /**
     * Get <p>调度硬关联规则</p> 
     * @return RequiredDuringSchedulingIgnoredDuringExecution <p>调度硬关联规则</p>
     */
    public PodAffinityTerm [] getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.RequiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Set <p>调度硬关联规则</p>
     * @param RequiredDuringSchedulingIgnoredDuringExecution <p>调度硬关联规则</p>
     */
    public void setRequiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm [] RequiredDuringSchedulingIgnoredDuringExecution) {
        this.RequiredDuringSchedulingIgnoredDuringExecution = RequiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Get <p>调度软关联规则</p> 
     * @return PreferredDuringSchedulingIgnoredDuringExecution <p>调度软关联规则</p>
     */
    public WeightedPodAffinityTerm [] getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.PreferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * Set <p>调度软关联规则</p>
     * @param PreferredDuringSchedulingIgnoredDuringExecution <p>调度软关联规则</p>
     */
    public void setPreferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm [] PreferredDuringSchedulingIgnoredDuringExecution) {
        this.PreferredDuringSchedulingIgnoredDuringExecution = PreferredDuringSchedulingIgnoredDuringExecution;
    }

    public PodAffinitySpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodAffinitySpec(PodAffinitySpec source) {
        if (source.RequiredDuringSchedulingIgnoredDuringExecution != null) {
            this.RequiredDuringSchedulingIgnoredDuringExecution = new PodAffinityTerm[source.RequiredDuringSchedulingIgnoredDuringExecution.length];
            for (int i = 0; i < source.RequiredDuringSchedulingIgnoredDuringExecution.length; i++) {
                this.RequiredDuringSchedulingIgnoredDuringExecution[i] = new PodAffinityTerm(source.RequiredDuringSchedulingIgnoredDuringExecution[i]);
            }
        }
        if (source.PreferredDuringSchedulingIgnoredDuringExecution != null) {
            this.PreferredDuringSchedulingIgnoredDuringExecution = new WeightedPodAffinityTerm[source.PreferredDuringSchedulingIgnoredDuringExecution.length];
            for (int i = 0; i < source.PreferredDuringSchedulingIgnoredDuringExecution.length; i++) {
                this.PreferredDuringSchedulingIgnoredDuringExecution[i] = new WeightedPodAffinityTerm(source.PreferredDuringSchedulingIgnoredDuringExecution[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RequiredDuringSchedulingIgnoredDuringExecution.", this.RequiredDuringSchedulingIgnoredDuringExecution);
        this.setParamArrayObj(map, prefix + "PreferredDuringSchedulingIgnoredDuringExecution.", this.PreferredDuringSchedulingIgnoredDuringExecution);

    }
}

