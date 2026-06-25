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

public class DeleteModelRoutersRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID列表</p>
    */
    @SerializedName("ModelRouterIds")
    @Expose
    private String [] ModelRouterIds;

    /**
     * Get <p>模型路由实例ID列表</p> 
     * @return ModelRouterIds <p>模型路由实例ID列表</p>
     */
    public String [] getModelRouterIds() {
        return this.ModelRouterIds;
    }

    /**
     * Set <p>模型路由实例ID列表</p>
     * @param ModelRouterIds <p>模型路由实例ID列表</p>
     */
    public void setModelRouterIds(String [] ModelRouterIds) {
        this.ModelRouterIds = ModelRouterIds;
    }

    public DeleteModelRoutersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteModelRoutersRequest(DeleteModelRoutersRequest source) {
        if (source.ModelRouterIds != null) {
            this.ModelRouterIds = new String[source.ModelRouterIds.length];
            for (int i = 0; i < source.ModelRouterIds.length; i++) {
                this.ModelRouterIds[i] = new String(source.ModelRouterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ModelRouterIds.", this.ModelRouterIds);

    }
}

