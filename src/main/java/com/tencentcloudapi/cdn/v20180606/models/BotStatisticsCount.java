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

public class BotStatisticsCount extends AbstractModel{

    /**
    * BOT次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Top指标值,如果是ip维度就是ip如果是session维度就是域名
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * ip所在国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * ip所在省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * ip归属的idc
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
     * Get BOT次数 
     * @return Count BOT次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set BOT次数
     * @param Count BOT次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Top指标值,如果是ip维度就是ip如果是session维度就是域名 
     * @return Value Top指标值,如果是ip维度就是ip如果是session维度就是域名
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Top指标值,如果是ip维度就是ip如果是session维度就是域名
     * @param Value Top指标值,如果是ip维度就是ip如果是session维度就是域名
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get ip所在国家 
     * @return Country ip所在国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set ip所在国家
     * @param Country ip所在国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get ip所在省份 
     * @return Province ip所在省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set ip所在省份
     * @param Province ip所在省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get ip归属的idc 
     * @return Isp ip归属的idc
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set ip归属的idc
     * @param Isp ip归属的idc
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    public BotStatisticsCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotStatisticsCount(BotStatisticsCount source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Isp", this.Isp);

    }
}

