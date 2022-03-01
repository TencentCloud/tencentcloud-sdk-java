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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CurvePoint extends AbstractModel{

    /**
    * 当前坐标 X轴的值 当前是日期格式:"yyyy-MM-dd HH:mm:ss"
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 当前坐标 Y轴的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 该坐标点时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
     * Get 当前坐标 X轴的值 当前是日期格式:"yyyy-MM-dd HH:mm:ss" 
     * @return Label 当前坐标 X轴的值 当前是日期格式:"yyyy-MM-dd HH:mm:ss"
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 当前坐标 X轴的值 当前是日期格式:"yyyy-MM-dd HH:mm:ss"
     * @param Label 当前坐标 X轴的值 当前是日期格式:"yyyy-MM-dd HH:mm:ss"
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 当前坐标 Y轴的值 
     * @return Value 当前坐标 Y轴的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 当前坐标 Y轴的值
     * @param Value 当前坐标 Y轴的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 该坐标点时间戳 
     * @return Timestamp 该坐标点时间戳
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 该坐标点时间戳
     * @param Timestamp 该坐标点时间戳
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public CurvePoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CurvePoint(CurvePoint source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

