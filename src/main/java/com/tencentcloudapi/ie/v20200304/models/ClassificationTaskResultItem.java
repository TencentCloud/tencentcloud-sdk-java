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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassificationTaskResultItem extends AbstractModel {

    /**
    * 分类名称。
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * 置信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 分类名称。 
     * @return Classification 分类名称。
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set 分类名称。
     * @param Classification 分类名称。
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get 置信度，取值范围是 0 到 100。 
     * @return Confidence 置信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值范围是 0 到 100。
     * @param Confidence 置信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public ClassificationTaskResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassificationTaskResultItem(ClassificationTaskResultItem source) {
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

