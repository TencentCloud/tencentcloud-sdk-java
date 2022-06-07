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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomTrainingPoint extends AbstractModel{

    /**
    * X值
    */
    @SerializedName("XValue")
    @Expose
    private Float XValue;

    /**
    * Y值
    */
    @SerializedName("YValue")
    @Expose
    private Float YValue;

    /**
     * Get X值 
     * @return XValue X值
     */
    public Float getXValue() {
        return this.XValue;
    }

    /**
     * Set X值
     * @param XValue X值
     */
    public void setXValue(Float XValue) {
        this.XValue = XValue;
    }

    /**
     * Get Y值 
     * @return YValue Y值
     */
    public Float getYValue() {
        return this.YValue;
    }

    /**
     * Set Y值
     * @param YValue Y值
     */
    public void setYValue(Float YValue) {
        this.YValue = YValue;
    }

    public CustomTrainingPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomTrainingPoint(CustomTrainingPoint source) {
        if (source.XValue != null) {
            this.XValue = new Float(source.XValue);
        }
        if (source.YValue != null) {
            this.YValue = new Float(source.YValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XValue", this.XValue);
        this.setParamSimple(map, prefix + "YValue", this.YValue);

    }
}

