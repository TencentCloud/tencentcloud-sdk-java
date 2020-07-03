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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassificationResult extends AbstractModel{

    /**
    * 一级分类名称
    */
    @SerializedName("FirstClassName")
    @Expose
    private String FirstClassName;

    /**
    * 一级分类概率
    */
    @SerializedName("FirstClassProbability")
    @Expose
    private Float FirstClassProbability;

    /**
    * 二级分类名称
    */
    @SerializedName("SecondClassName")
    @Expose
    private String SecondClassName;

    /**
    * 二级分类概率
    */
    @SerializedName("SecondClassProbability")
    @Expose
    private Float SecondClassProbability;

    /**
     * Get 一级分类名称 
     * @return FirstClassName 一级分类名称
     */
    public String getFirstClassName() {
        return this.FirstClassName;
    }

    /**
     * Set 一级分类名称
     * @param FirstClassName 一级分类名称
     */
    public void setFirstClassName(String FirstClassName) {
        this.FirstClassName = FirstClassName;
    }

    /**
     * Get 一级分类概率 
     * @return FirstClassProbability 一级分类概率
     */
    public Float getFirstClassProbability() {
        return this.FirstClassProbability;
    }

    /**
     * Set 一级分类概率
     * @param FirstClassProbability 一级分类概率
     */
    public void setFirstClassProbability(Float FirstClassProbability) {
        this.FirstClassProbability = FirstClassProbability;
    }

    /**
     * Get 二级分类名称 
     * @return SecondClassName 二级分类名称
     */
    public String getSecondClassName() {
        return this.SecondClassName;
    }

    /**
     * Set 二级分类名称
     * @param SecondClassName 二级分类名称
     */
    public void setSecondClassName(String SecondClassName) {
        this.SecondClassName = SecondClassName;
    }

    /**
     * Get 二级分类概率 
     * @return SecondClassProbability 二级分类概率
     */
    public Float getSecondClassProbability() {
        return this.SecondClassProbability;
    }

    /**
     * Set 二级分类概率
     * @param SecondClassProbability 二级分类概率
     */
    public void setSecondClassProbability(Float SecondClassProbability) {
        this.SecondClassProbability = SecondClassProbability;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstClassName", this.FirstClassName);
        this.setParamSimple(map, prefix + "FirstClassProbability", this.FirstClassProbability);
        this.setParamSimple(map, prefix + "SecondClassName", this.SecondClassName);
        this.setParamSimple(map, prefix + "SecondClassProbability", this.SecondClassProbability);

    }
}

