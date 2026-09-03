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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecommendedParamsRequest extends AbstractModel {

    /**
    * <p>模型业务唯一标识</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>推理引擎 ID，如 vllm、xgboost（必填）</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
     * Get <p>模型业务唯一标识</p> 
     * @return ModelUid <p>模型业务唯一标识</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型业务唯一标识</p>
     * @param ModelUid <p>模型业务唯一标识</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>推理引擎 ID，如 vllm、xgboost（必填）</p> 
     * @return Engine <p>推理引擎 ID，如 vllm、xgboost（必填）</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>推理引擎 ID，如 vllm、xgboost（必填）</p>
     * @param Engine <p>推理引擎 ID，如 vllm、xgboost（必填）</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public DescribeRecommendedParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecommendedParamsRequest(DescribeRecommendedParamsRequest source) {
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "Engine", this.Engine);

    }
}

