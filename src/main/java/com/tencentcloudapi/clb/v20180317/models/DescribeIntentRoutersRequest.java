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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntentRoutersRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>意图路由ID列表</p>
    */
    @SerializedName("IntentRouterIds")
    @Expose
    private String [] IntentRouterIds;

    /**
     * Get <p>模型路由实例ID。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>意图路由ID列表</p> 
     * @return IntentRouterIds <p>意图路由ID列表</p>
     */
    public String [] getIntentRouterIds() {
        return this.IntentRouterIds;
    }

    /**
     * Set <p>意图路由ID列表</p>
     * @param IntentRouterIds <p>意图路由ID列表</p>
     */
    public void setIntentRouterIds(String [] IntentRouterIds) {
        this.IntentRouterIds = IntentRouterIds;
    }

    public DescribeIntentRoutersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntentRoutersRequest(DescribeIntentRoutersRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.IntentRouterIds != null) {
            this.IntentRouterIds = new String[source.IntentRouterIds.length];
            for (int i = 0; i < source.IntentRouterIds.length; i++) {
                this.IntentRouterIds[i] = new String(source.IntentRouterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamArraySimple(map, prefix + "IntentRouterIds.", this.IntentRouterIds);

    }
}

