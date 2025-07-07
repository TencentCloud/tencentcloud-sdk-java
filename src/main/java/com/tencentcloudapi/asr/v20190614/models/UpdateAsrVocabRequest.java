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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAsrVocabRequest extends AbstractModel {

    /**
    * 热词表ID
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * 热词表名称，长度在1-255之间
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 词权重数组，包含全部的热词和对应的权重。每个热词的长度不大于10个汉字或30个英文字符，权重为[1,11]之间整数或100，数组长度不大于1000 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
    */
    @SerializedName("WordWeights")
    @Expose
    private HotWord [] WordWeights;

    /**
    * 词权重文件（纯文本文件）的二进制base64编码，以行分隔，每行的格式为word|weight，即以英文符号|为分割，左边为词，右边为权重，如：你好|5。
当用户传此参数（参数长度大于0），即以此参数解析词权重，WordWeights会被忽略
 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
    */
    @SerializedName("WordWeightStr")
    @Expose
    private String WordWeightStr;

    /**
    * 热词表描述，长度在0-1000之间
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 热词表ID 
     * @return VocabId 热词表ID
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set 热词表ID
     * @param VocabId 热词表ID
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get 热词表名称，长度在1-255之间 
     * @return Name 热词表名称，长度在1-255之间
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词表名称，长度在1-255之间
     * @param Name 热词表名称，长度在1-255之间
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 词权重数组，包含全部的热词和对应的权重。每个热词的长度不大于10个汉字或30个英文字符，权重为[1,11]之间整数或100，数组长度不大于1000 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数） 
     * @return WordWeights 词权重数组，包含全部的热词和对应的权重。每个热词的长度不大于10个汉字或30个英文字符，权重为[1,11]之间整数或100，数组长度不大于1000 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
     */
    public HotWord [] getWordWeights() {
        return this.WordWeights;
    }

    /**
     * Set 词权重数组，包含全部的热词和对应的权重。每个热词的长度不大于10个汉字或30个英文字符，权重为[1,11]之间整数或100，数组长度不大于1000 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
     * @param WordWeights 词权重数组，包含全部的热词和对应的权重。每个热词的长度不大于10个汉字或30个英文字符，权重为[1,11]之间整数或100，数组长度不大于1000 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
     */
    public void setWordWeights(HotWord [] WordWeights) {
        this.WordWeights = WordWeights;
    }

    /**
     * Get 词权重文件（纯文本文件）的二进制base64编码，以行分隔，每行的格式为word|weight，即以英文符号|为分割，左边为词，右边为权重，如：你好|5。
当用户传此参数（参数长度大于0），即以此参数解析词权重，WordWeights会被忽略
 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数） 
     * @return WordWeightStr 词权重文件（纯文本文件）的二进制base64编码，以行分隔，每行的格式为word|weight，即以英文符号|为分割，左边为词，右边为权重，如：你好|5。
当用户传此参数（参数长度大于0），即以此参数解析词权重，WordWeights会被忽略
 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
     */
    public String getWordWeightStr() {
        return this.WordWeightStr;
    }

    /**
     * Set 词权重文件（纯文本文件）的二进制base64编码，以行分隔，每行的格式为word|weight，即以英文符号|为分割，左边为词，右边为权重，如：你好|5。
当用户传此参数（参数长度大于0），即以此参数解析词权重，WordWeights会被忽略
 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
     * @param WordWeightStr 词权重文件（纯文本文件）的二进制base64编码，以行分隔，每行的格式为word|weight，即以英文符号|为分割，左边为词，右边为权重，如：你好|5。
当用户传此参数（参数长度大于0），即以此参数解析词权重，WordWeights会被忽略
 (注意：如果仅更新热词表名称或者描述字段，请求不用带本参数）
     */
    public void setWordWeightStr(String WordWeightStr) {
        this.WordWeightStr = WordWeightStr;
    }

    /**
     * Get 热词表描述，长度在0-1000之间 
     * @return Description 热词表描述，长度在0-1000之间
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 热词表描述，长度在0-1000之间
     * @param Description 热词表描述，长度在0-1000之间
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateAsrVocabRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAsrVocabRequest(UpdateAsrVocabRequest source) {
        if (source.VocabId != null) {
            this.VocabId = new String(source.VocabId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WordWeights != null) {
            this.WordWeights = new HotWord[source.WordWeights.length];
            for (int i = 0; i < source.WordWeights.length; i++) {
                this.WordWeights[i] = new HotWord(source.WordWeights[i]);
            }
        }
        if (source.WordWeightStr != null) {
            this.WordWeightStr = new String(source.WordWeightStr);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VocabId", this.VocabId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "WordWeights.", this.WordWeights);
        this.setParamSimple(map, prefix + "WordWeightStr", this.WordWeightStr);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

