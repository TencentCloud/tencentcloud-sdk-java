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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmbeddingRequest extends AbstractModel {

    /**
    * 输入文本。总长度不超过 1024 个 Token，超过则会截断最后面的内容。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
     * Get 输入文本。总长度不超过 1024 个 Token，超过则会截断最后面的内容。 
     * @return Input 输入文本。总长度不超过 1024 个 Token，超过则会截断最后面的内容。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 输入文本。总长度不超过 1024 个 Token，超过则会截断最后面的内容。
     * @param Input 输入文本。总长度不超过 1024 个 Token，超过则会截断最后面的内容。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    public GetEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmbeddingRequest(GetEmbeddingRequest source) {
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Input", this.Input);

    }
}

