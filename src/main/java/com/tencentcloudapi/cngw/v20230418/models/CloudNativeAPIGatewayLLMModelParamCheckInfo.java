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

public class CloudNativeAPIGatewayLLMModelParamCheckInfo extends AbstractModel {

    /**
    * 允许的模型列表。
    */
    @SerializedName("AllowModelList")
    @Expose
    private String [] AllowModelList;

    /**
    * 模型参数校验失败时的处理策略，选项：Return404（返回404）、FallBackToDefaultModel（使用默认模型降级）。
    */
    @SerializedName("ModelValidationFailureStrategy")
    @Expose
    private String ModelValidationFailureStrategy;

    /**
     * Get 允许的模型列表。 
     * @return AllowModelList 允许的模型列表。
     */
    public String [] getAllowModelList() {
        return this.AllowModelList;
    }

    /**
     * Set 允许的模型列表。
     * @param AllowModelList 允许的模型列表。
     */
    public void setAllowModelList(String [] AllowModelList) {
        this.AllowModelList = AllowModelList;
    }

    /**
     * Get 模型参数校验失败时的处理策略，选项：Return404（返回404）、FallBackToDefaultModel（使用默认模型降级）。 
     * @return ModelValidationFailureStrategy 模型参数校验失败时的处理策略，选项：Return404（返回404）、FallBackToDefaultModel（使用默认模型降级）。
     */
    public String getModelValidationFailureStrategy() {
        return this.ModelValidationFailureStrategy;
    }

    /**
     * Set 模型参数校验失败时的处理策略，选项：Return404（返回404）、FallBackToDefaultModel（使用默认模型降级）。
     * @param ModelValidationFailureStrategy 模型参数校验失败时的处理策略，选项：Return404（返回404）、FallBackToDefaultModel（使用默认模型降级）。
     */
    public void setModelValidationFailureStrategy(String ModelValidationFailureStrategy) {
        this.ModelValidationFailureStrategy = ModelValidationFailureStrategy;
    }

    public CloudNativeAPIGatewayLLMModelParamCheckInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayLLMModelParamCheckInfo(CloudNativeAPIGatewayLLMModelParamCheckInfo source) {
        if (source.AllowModelList != null) {
            this.AllowModelList = new String[source.AllowModelList.length];
            for (int i = 0; i < source.AllowModelList.length; i++) {
                this.AllowModelList[i] = new String(source.AllowModelList[i]);
            }
        }
        if (source.ModelValidationFailureStrategy != null) {
            this.ModelValidationFailureStrategy = new String(source.ModelValidationFailureStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllowModelList.", this.AllowModelList);
        this.setParamSimple(map, prefix + "ModelValidationFailureStrategy", this.ModelValidationFailureStrategy);

    }
}

