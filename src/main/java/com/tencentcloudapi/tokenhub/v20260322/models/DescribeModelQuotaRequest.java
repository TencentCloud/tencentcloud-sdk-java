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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelQuotaRequest extends AbstractModel {

    /**
    * <p>模型 ID。可通过 DescribeModelList 获取。</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
     * Get <p>模型 ID。可通过 DescribeModelList 获取。</p> 
     * @return ModelId <p>模型 ID。可通过 DescribeModelList 获取。</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型 ID。可通过 DescribeModelList 获取。</p>
     * @param ModelId <p>模型 ID。可通过 DescribeModelList 获取。</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    public DescribeModelQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelQuotaRequest(DescribeModelQuotaRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);

    }
}

