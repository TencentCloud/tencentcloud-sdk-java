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

public class DescribeModelTaskOptionsRequest extends AbstractModel {

    /**
    * <p>模型类型（如 LLM、Embedding、ML），不传返回全部类型的 Tasks</p>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
     * Get <p>模型类型（如 LLM、Embedding、ML），不传返回全部类型的 Tasks</p> 
     * @return ModelType <p>模型类型（如 LLM、Embedding、ML），不传返回全部类型的 Tasks</p>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型（如 LLM、Embedding、ML），不传返回全部类型的 Tasks</p>
     * @param ModelType <p>模型类型（如 LLM、Embedding、ML），不传返回全部类型的 Tasks</p>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    public DescribeModelTaskOptionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelTaskOptionsRequest(DescribeModelTaskOptionsRequest source) {
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);

    }
}

