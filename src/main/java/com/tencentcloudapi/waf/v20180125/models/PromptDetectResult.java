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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptDetectResult extends AbstractModel {

    /**
    * <p>检测结果</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>置信度</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>检出类别</p>
    */
    @SerializedName("Category")
    @Expose
    private String [] Category;

    /**
     * Get <p>检测结果</p> 
     * @return Result <p>检测结果</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>检测结果</p>
     * @param Result <p>检测结果</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>置信度</p> 
     * @return Confidence <p>置信度</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度</p>
     * @param Confidence <p>置信度</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>检出类别</p> 
     * @return Category <p>检出类别</p>
     */
    public String [] getCategory() {
        return this.Category;
    }

    /**
     * Set <p>检出类别</p>
     * @param Category <p>检出类别</p>
     */
    public void setCategory(String [] Category) {
        this.Category = Category;
    }

    public PromptDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptDetectResult(PromptDetectResult source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Category != null) {
            this.Category = new String[source.Category.length];
            for (int i = 0; i < source.Category.length; i++) {
                this.Category[i] = new String(source.Category[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "Category.", this.Category);

    }
}

