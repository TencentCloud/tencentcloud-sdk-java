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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecognizeVocabV3Request extends AbstractModel {

    /**
    * <p>词表名称（同 SdkAppId 下唯一）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>客户维度唯一标识</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>热词+权重数组</p>
    */
    @SerializedName("WordWeights")
    @Expose
    private HotWord [] WordWeights;

    /**
    * <p>文本形式热词</p>
    */
    @SerializedName("WordWeightStr")
    @Expose
    private String WordWeightStr;

    /**
     * Get <p>词表名称（同 SdkAppId 下唯一）</p> 
     * @return Name <p>词表名称（同 SdkAppId 下唯一）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>词表名称（同 SdkAppId 下唯一）</p>
     * @param Name <p>词表名称（同 SdkAppId 下唯一）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>客户维度唯一标识</p> 
     * @return SdkAppId <p>客户维度唯一标识</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>客户维度唯一标识</p>
     * @param SdkAppId <p>客户维度唯一标识</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>热词+权重数组</p> 
     * @return WordWeights <p>热词+权重数组</p>
     */
    public HotWord [] getWordWeights() {
        return this.WordWeights;
    }

    /**
     * Set <p>热词+权重数组</p>
     * @param WordWeights <p>热词+权重数组</p>
     */
    public void setWordWeights(HotWord [] WordWeights) {
        this.WordWeights = WordWeights;
    }

    /**
     * Get <p>文本形式热词</p> 
     * @return WordWeightStr <p>文本形式热词</p>
     */
    public String getWordWeightStr() {
        return this.WordWeightStr;
    }

    /**
     * Set <p>文本形式热词</p>
     * @param WordWeightStr <p>文本形式热词</p>
     */
    public void setWordWeightStr(String WordWeightStr) {
        this.WordWeightStr = WordWeightStr;
    }

    public CreateRecognizeVocabV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecognizeVocabV3Request(CreateRecognizeVocabV3Request source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "WordWeights.", this.WordWeights);
        this.setParamSimple(map, prefix + "WordWeightStr", this.WordWeightStr);

    }
}

