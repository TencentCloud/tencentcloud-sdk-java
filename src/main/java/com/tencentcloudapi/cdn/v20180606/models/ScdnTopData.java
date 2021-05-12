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

public class ScdnTopData extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 数值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 运营商
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 区域
    */
    @SerializedName("District")
    @Expose
    private String District;

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
     * Get 运营商 
     * @return Isp 运营商
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商
     * @param Isp 运营商
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 区域 
     * @return District 区域
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 区域
     * @param District 区域
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    public ScdnTopData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnTopData(ScdnTopData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "District", this.District);

    }
}

