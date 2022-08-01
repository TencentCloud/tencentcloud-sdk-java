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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * 等于：0，不等于：1
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * 指标名
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * 指标值
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get 等于：0，不等于：1 
     * @return Operator 等于：0，不等于：1
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set 等于：0，不等于：1
     * @param Operator 等于：0，不等于：1
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指标名 
     * @return LabelName 指标名
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 指标名
     * @param LabelName 指标名
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get 指标值 
     * @return LabelValue 指标值
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set 指标值
     * @param LabelValue 指标值
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

