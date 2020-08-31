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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnTopUrlData extends AbstractModel{

    /**
    * Top数据的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 数值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get Top数据的URL 
     * @return Url Top数据的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Top数据的URL
     * @param Url Top数据的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 数值 
     * @return Value 数值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 数值
     * @param Value 数值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 时间 
     * @return Time 时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

