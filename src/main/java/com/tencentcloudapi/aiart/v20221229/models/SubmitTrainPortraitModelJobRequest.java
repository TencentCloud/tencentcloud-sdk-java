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

public class SubmitTrainPortraitModelJobRequest extends AbstractModel {

    /**
    * 在上传写真训练图片时指定的写真模型 ID。 
每个 AI 写真模型自训练完成起1年内有效，有效期内可使用模型生成图片，期满后需要重新训练模型。

    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
     * Get 在上传写真训练图片时指定的写真模型 ID。 
每个 AI 写真模型自训练完成起1年内有效，有效期内可使用模型生成图片，期满后需要重新训练模型。
 
     * @return ModelId 在上传写真训练图片时指定的写真模型 ID。 
每个 AI 写真模型自训练完成起1年内有效，有效期内可使用模型生成图片，期满后需要重新训练模型。

     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 在上传写真训练图片时指定的写真模型 ID。 
每个 AI 写真模型自训练完成起1年内有效，有效期内可使用模型生成图片，期满后需要重新训练模型。

     * @param ModelId 在上传写真训练图片时指定的写真模型 ID。 
每个 AI 写真模型自训练完成起1年内有效，有效期内可使用模型生成图片，期满后需要重新训练模型。

     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    public SubmitTrainPortraitModelJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTrainPortraitModelJobRequest(SubmitTrainPortraitModelJobRequest source) {
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

