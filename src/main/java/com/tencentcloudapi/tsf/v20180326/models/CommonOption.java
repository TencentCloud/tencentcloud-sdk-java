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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonOption extends AbstractModel {

    /**
    * -
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * -
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * -
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get - 
     * @return LabelName -
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set -
     * @param LabelName -
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get - 
     * @return Operator -
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set -
     * @param Operator -
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get - 
     * @return LabelValue -
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set -
     * @param LabelValue -
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public CommonOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonOption(CommonOption source) {
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

