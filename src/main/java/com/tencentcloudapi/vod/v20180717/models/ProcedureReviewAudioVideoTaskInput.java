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

public class ProcedureReviewAudioVideoTaskInput extends AbstractModel{

    /**
    * 审核模板。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 审核的内容，可选值：
<li>Media：原始音视频；</li>
<li>Cover：封面。</li>
不填或填空数组时，默认为审核 Media。
    */
    @SerializedName("ReviewContents")
    @Expose
    private String [] ReviewContents;

    /**
     * Get 审核模板。 
     * @return Definition 审核模板。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 审核模板。
     * @param Definition 审核模板。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 审核的内容，可选值：
<li>Media：原始音视频；</li>
<li>Cover：封面。</li>
不填或填空数组时，默认为审核 Media。 
     * @return ReviewContents 审核的内容，可选值：
<li>Media：原始音视频；</li>
<li>Cover：封面。</li>
不填或填空数组时，默认为审核 Media。
     */
    public String [] getReviewContents() {
        return this.ReviewContents;
    }

    /**
     * Set 审核的内容，可选值：
<li>Media：原始音视频；</li>
<li>Cover：封面。</li>
不填或填空数组时，默认为审核 Media。
     * @param ReviewContents 审核的内容，可选值：
<li>Media：原始音视频；</li>
<li>Cover：封面。</li>
不填或填空数组时，默认为审核 Media。
     */
    public void setReviewContents(String [] ReviewContents) {
        this.ReviewContents = ReviewContents;
    }

    public ProcedureReviewAudioVideoTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedureReviewAudioVideoTaskInput(ProcedureReviewAudioVideoTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ReviewContents != null) {
            this.ReviewContents = new String[source.ReviewContents.length];
            for (int i = 0; i < source.ReviewContents.length; i++) {
                this.ReviewContents[i] = new String(source.ReviewContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ReviewContents.", this.ReviewContents);

    }
}

