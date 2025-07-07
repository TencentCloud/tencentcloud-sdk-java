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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueBlock extends AbstractModel {

    /**
    * 等级
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float [] Percent;

    /**
    * 阳性阴性
    */
    @SerializedName("Positive")
    @Expose
    private String Positive;

    /**
     * Get 等级 
     * @return Grade 等级
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 等级
     * @param Grade 等级
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 百分比 
     * @return Percent 百分比
     */
    public Float [] getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比
     * @param Percent 百分比
     */
    public void setPercent(Float [] Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 阳性阴性 
     * @return Positive 阳性阴性
     */
    public String getPositive() {
        return this.Positive;
    }

    /**
     * Set 阳性阴性
     * @param Positive 阳性阴性
     */
    public void setPositive(String Positive) {
        this.Positive = Positive;
    }

    public ValueBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueBlock(ValueBlock source) {
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.Percent != null) {
            this.Percent = new Float[source.Percent.length];
            for (int i = 0; i < source.Percent.length; i++) {
                this.Percent[i] = new Float(source.Percent[i]);
            }
        }
        if (source.Positive != null) {
            this.Positive = new String(source.Positive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamArraySimple(map, prefix + "Percent.", this.Percent);
        this.setParamSimple(map, prefix + "Positive", this.Positive);

    }
}

