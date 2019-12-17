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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisClassificationItem extends AbstractModel{

    /**
    * 智能分类的类别名称。
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * 智能分类的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 智能分类的类别名称。 
     * @return Classification 智能分类的类别名称。
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set 智能分类的类别名称。
     * @param Classification 智能分类的类别名称。
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get 智能分类的可信度，取值范围是 0 到 100。 
     * @return Confidence 智能分类的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 智能分类的可信度，取值范围是 0 到 100。
     * @param Confidence 智能分类的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

