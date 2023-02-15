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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviewInfo extends AbstractModel{

    /**
    * 审核模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 审核类型，当 Suggestion 为 review 或 block 时有效，格式为：Form.Label。
Form 表示违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
Label 表示违禁的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
    */
    @SerializedName("TypeSet")
    @Expose
    private String [] TypeSet;

    /**
    * 审核时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ReviewTime")
    @Expose
    private String ReviewTime;

    /**
     * Get 审核模板 ID。 
     * @return Definition 审核模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 审核模板 ID。
     * @param Definition 审核模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li> 
     * @return Suggestion 审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
     * @param Suggestion 审核的结果建议，取值范围：
<li>pass：建议通过；</li>
<li>review：建议复审；</li>
<li>block：建议封禁。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 审核类型，当 Suggestion 为 review 或 block 时有效，格式为：Form.Label。
Form 表示违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
Label 表示违禁的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li> 
     * @return TypeSet 审核类型，当 Suggestion 为 review 或 block 时有效，格式为：Form.Label。
Form 表示违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
Label 表示违禁的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
     */
    public String [] getTypeSet() {
        return this.TypeSet;
    }

    /**
     * Set 审核类型，当 Suggestion 为 review 或 block 时有效，格式为：Form.Label。
Form 表示违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
Label 表示违禁的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
     * @param TypeSet 审核类型，当 Suggestion 为 review 或 block 时有效，格式为：Form.Label。
Form 表示违禁的形式，取值范围：
<li>Image：画面上的人物或图标；</li>
<li>OCR：画面上的文字；</li>
<li>ASR：语音中的文字；</li>
<li>Voice：声音。</li>
Label 表示违禁的标签，取值范围：
<li>Porn：色情；</li>
<li>Terror：暴力；</li>
<li>Polity：不适宜的信息；</li>
<li>Ad：广告；</li>
<li>Illegal：违法；</li>
<li>Abuse：谩骂；</li>
<li>Moan：娇喘。</li>
     */
    public void setTypeSet(String [] TypeSet) {
        this.TypeSet = TypeSet;
    }

    /**
     * Get 审核时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ReviewTime 审核时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getReviewTime() {
        return this.ReviewTime;
    }

    /**
     * Set 审核时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ReviewTime 审核时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setReviewTime(String ReviewTime) {
        this.ReviewTime = ReviewTime;
    }

    public ReviewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewInfo(ReviewInfo source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.TypeSet != null) {
            this.TypeSet = new String[source.TypeSet.length];
            for (int i = 0; i < source.TypeSet.length; i++) {
                this.TypeSet[i] = new String(source.TypeSet[i]);
            }
        }
        if (source.ReviewTime != null) {
            this.ReviewTime = new String(source.ReviewTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "TypeSet.", this.TypeSet);
        this.setParamSimple(map, prefix + "ReviewTime", this.ReviewTime);

    }
}

