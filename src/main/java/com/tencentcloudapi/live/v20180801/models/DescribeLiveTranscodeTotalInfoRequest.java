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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTranscodeTotalInfoRequest extends AbstractModel {

    /**
    * <p>开始时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>推流域名列表，若不填，表示查询所有域名总体数据。指定域名时返回1小时粒度数据。</p>
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
    * <p>可选值：Mainland：查询中国大陆（境内）数据，Oversea：则查询国际/港澳台（境外）数据，默认：查询全球地区（境内+境外）的数据。</p>
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get <p>开始时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p> 
     * @return StartTime <p>开始时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
     * @param StartTime <p>开始时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p> 
     * @return EndTime <p>结束时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
     * @param EndTime <p>结束时间，支持最近三个月的数据查询，起始时间和结束时间跨度不能超过三个月。接口查询支持两种时间格式：1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 <a href="https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F">ISO 日期格式说明</a>2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>推流域名列表，若不填，表示查询所有域名总体数据。指定域名时返回1小时粒度数据。</p> 
     * @return PushDomains <p>推流域名列表，若不填，表示查询所有域名总体数据。指定域名时返回1小时粒度数据。</p>
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set <p>推流域名列表，若不填，表示查询所有域名总体数据。指定域名时返回1小时粒度数据。</p>
     * @param PushDomains <p>推流域名列表，若不填，表示查询所有域名总体数据。指定域名时返回1小时粒度数据。</p>
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Get <p>可选值：Mainland：查询中国大陆（境内）数据，Oversea：则查询国际/港澳台（境外）数据，默认：查询全球地区（境内+境外）的数据。</p> 
     * @return MainlandOrOversea <p>可选值：Mainland：查询中国大陆（境内）数据，Oversea：则查询国际/港澳台（境外）数据，默认：查询全球地区（境内+境外）的数据。</p>
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set <p>可选值：Mainland：查询中国大陆（境内）数据，Oversea：则查询国际/港澳台（境外）数据，默认：查询全球地区（境内+境外）的数据。</p>
     * @param MainlandOrOversea <p>可选值：Mainland：查询中国大陆（境内）数据，Oversea：则查询国际/港澳台（境外）数据，默认：查询全球地区（境内+境外）的数据。</p>
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    public DescribeLiveTranscodeTotalInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeTotalInfoRequest(DescribeLiveTranscodeTotalInfoRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PushDomains != null) {
            this.PushDomains = new String[source.PushDomains.length];
            for (int i = 0; i < source.PushDomains.length; i++) {
                this.PushDomains[i] = new String(source.PushDomains[i]);
            }
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}

