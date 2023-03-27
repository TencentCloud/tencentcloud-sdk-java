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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataItem extends AbstractModel{

    /**
    * 时间
按月格式yyyy-mm
按天格式yyyy-mm-dd
按分钟格式 yyyy-mm-dd HH:MM:SS
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 画图所需要的值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 各个具体指标的详情
    */
    @SerializedName("Details")
    @Expose
    private Detail [] Details;

    /**
     * Get 时间
按月格式yyyy-mm
按天格式yyyy-mm-dd
按分钟格式 yyyy-mm-dd HH:MM:SS 
     * @return Time 时间
按月格式yyyy-mm
按天格式yyyy-mm-dd
按分钟格式 yyyy-mm-dd HH:MM:SS
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
按月格式yyyy-mm
按天格式yyyy-mm-dd
按分钟格式 yyyy-mm-dd HH:MM:SS
     * @param Time 时间
按月格式yyyy-mm
按天格式yyyy-mm-dd
按分钟格式 yyyy-mm-dd HH:MM:SS
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 画图所需要的值 
     * @return Value 画图所需要的值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 画图所需要的值
     * @param Value 画图所需要的值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 各个具体指标的详情 
     * @return Details 各个具体指标的详情
     */
    public Detail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 各个具体指标的详情
     * @param Details 各个具体指标的详情
     */
    public void setDetails(Detail [] Details) {
        this.Details = Details;
    }

    public DataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataItem(DataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Details != null) {
            this.Details = new Detail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new Detail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

