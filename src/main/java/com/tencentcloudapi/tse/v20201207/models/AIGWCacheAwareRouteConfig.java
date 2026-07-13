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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWCacheAwareRouteConfig extends AbstractModel {

    /**
    * <p>前缀缓存感知路由模型服务候选列表</p>
    */
    @SerializedName("Candidates")
    @Expose
    private AIGWCacheAwareRouteCandidate [] Candidates;

    /**
     * Get <p>前缀缓存感知路由模型服务候选列表</p> 
     * @return Candidates <p>前缀缓存感知路由模型服务候选列表</p>
     */
    public AIGWCacheAwareRouteCandidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set <p>前缀缓存感知路由模型服务候选列表</p>
     * @param Candidates <p>前缀缓存感知路由模型服务候选列表</p>
     */
    public void setCandidates(AIGWCacheAwareRouteCandidate [] Candidates) {
        this.Candidates = Candidates;
    }

    public AIGWCacheAwareRouteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWCacheAwareRouteConfig(AIGWCacheAwareRouteConfig source) {
        if (source.Candidates != null) {
            this.Candidates = new AIGWCacheAwareRouteCandidate[source.Candidates.length];
            for (int i = 0; i < source.Candidates.length; i++) {
                this.Candidates[i] = new AIGWCacheAwareRouteCandidate(source.Candidates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Candidates.", this.Candidates);

    }
}

