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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy extends AbstractModel {

    /**
    * <p>模型服务id</p>
    */
    @SerializedName("ModelServiceId")
    @Expose
    private String ModelServiceId;

    /**
    * <p>权重值</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get <p>模型服务id</p> 
     * @return ModelServiceId <p>模型服务id</p>
     */
    public String getModelServiceId() {
        return this.ModelServiceId;
    }

    /**
     * Set <p>模型服务id</p>
     * @param ModelServiceId <p>模型服务id</p>
     */
    public void setModelServiceId(String ModelServiceId) {
        this.ModelServiceId = ModelServiceId;
    }

    /**
     * Get <p>权重值</p> 
     * @return Weight <p>权重值</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>权重值</p>
     * @param Weight <p>权重值</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy(CloudNativeAPIGatewayLLMModelServiceRouteWeightedStrategy source) {
        if (source.ModelServiceId != null) {
            this.ModelServiceId = new String(source.ModelServiceId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelServiceId", this.ModelServiceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

