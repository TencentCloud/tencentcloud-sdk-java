/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryTrainPortraitModelJobRequest extends AbstractModel {

    /**
    * 写真模型 ID。

    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
     * Get 写真模型 ID。
 
     * @return ModelId 写真模型 ID。

     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 写真模型 ID。

     * @param ModelId 写真模型 ID。

     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    public QueryTrainPortraitModelJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTrainPortraitModelJobRequest(QueryTrainPortraitModelJobRequest source) {
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

