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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveCloudEffectListRequest extends AbstractModel {

    /**
    * 云端特效ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 云端特效描述词。由用户原始输入的描述词。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 云端特效标签。对云端特效进行分类标签，可用于分类搜索。
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 云端特效类型, 默认不填，返回全部。PGC: 特效库中的特效；AICG : AI生成的特效；UGC：用户自定义上传的特效；
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 云端特效ID。 
     * @return Id 云端特效ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 云端特效ID。
     * @param Id 云端特效ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 云端特效描述词。由用户原始输入的描述词。 
     * @return Prompt 云端特效描述词。由用户原始输入的描述词。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 云端特效描述词。由用户原始输入的描述词。
     * @param Prompt 云端特效描述词。由用户原始输入的描述词。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 云端特效标签。对云端特效进行分类标签，可用于分类搜索。 
     * @return Flag 云端特效标签。对云端特效进行分类标签，可用于分类搜索。
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 云端特效标签。对云端特效进行分类标签，可用于分类搜索。
     * @param Flag 云端特效标签。对云端特效进行分类标签，可用于分类搜索。
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 云端特效类型, 默认不填，返回全部。PGC: 特效库中的特效；AICG : AI生成的特效；UGC：用户自定义上传的特效； 
     * @return Type 云端特效类型, 默认不填，返回全部。PGC: 特效库中的特效；AICG : AI生成的特效；UGC：用户自定义上传的特效；
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 云端特效类型, 默认不填，返回全部。PGC: 特效库中的特效；AICG : AI生成的特效；UGC：用户自定义上传的特效；
     * @param Type 云端特效类型, 默认不填，返回全部。PGC: 特效库中的特效；AICG : AI生成的特效；UGC：用户自定义上传的特效；
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeLiveCloudEffectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveCloudEffectListRequest(DescribeLiveCloudEffectListRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

