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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpCodeValue  extends AbstractModel{

    /**
    * 时间，格式：yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 次数。
    */
    @SerializedName("Numbers")
    @Expose
    private Integer Numbers;

    /**
    * 占比。
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
     * 获取时间，格式：yyyy-mm-dd HH:MM:SS。
     * @return Time 时间，格式：yyyy-mm-dd HH:MM:SS。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * 设置时间，格式：yyyy-mm-dd HH:MM:SS。
     * @param Time 时间，格式：yyyy-mm-dd HH:MM:SS。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * 获取次数。
     * @return Numbers 次数。
     */
    public Integer getNumbers() {
        return this.Numbers;
    }

    /**
     * 设置次数。
     * @param Numbers 次数。
     */
    public void setNumbers(Integer Numbers) {
        this.Numbers = Numbers;
    }

    /**
     * 获取占比。
     * @return Percentage 占比。
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * 设置占比。
     * @param Percentage 占比。
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Numbers", this.Numbers);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);

    }
}

