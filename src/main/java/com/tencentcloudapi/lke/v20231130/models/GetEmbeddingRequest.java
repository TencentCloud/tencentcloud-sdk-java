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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmbeddingRequest extends AbstractModel {

    /**
    * 模型名称
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 需要 embedding 的文本, 单条文本最大长度500个字符, 总条数最大7条
    */
    @SerializedName("Inputs")
    @Expose
    private String [] Inputs;

    /**
    * 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
    */
    @SerializedName("Online")
    @Expose
    private Boolean Online;

    /**
     * Get 模型名称 
     * @return Model 模型名称
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称
     * @param Model 模型名称
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 需要 embedding 的文本, 单条文本最大长度500个字符, 总条数最大7条 
     * @return Inputs 需要 embedding 的文本, 单条文本最大长度500个字符, 总条数最大7条
     */
    public String [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 需要 embedding 的文本, 单条文本最大长度500个字符, 总条数最大7条
     * @param Inputs 需要 embedding 的文本, 单条文本最大长度500个字符, 总条数最大7条
     */
    public void setInputs(String [] Inputs) {
        this.Inputs = Inputs;
    }

    /**
     * Get 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false 
     * @return Online 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
     */
    public Boolean getOnline() {
        return this.Online;
    }

    /**
     * Set 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
     * @param Online 是否在线, 后台异步任务使用离线, 实时任务使用在线, 默认值: false
     */
    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public GetEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmbeddingRequest(GetEmbeddingRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Inputs != null) {
            this.Inputs = new String[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new String(source.Inputs[i]);
            }
        }
        if (source.Online != null) {
            this.Online = new Boolean(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "Inputs.", this.Inputs);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

