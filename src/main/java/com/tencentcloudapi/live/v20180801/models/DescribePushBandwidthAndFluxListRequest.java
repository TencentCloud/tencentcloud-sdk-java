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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePushBandwidthAndFluxListRequest extends AbstractModel {

    /**
    * 查询开始时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名，可以填多个，若不填，表示总体数据。
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
    * 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
不填则默认查询全球地区（境内+境外）的数据。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
60：1小时粒度（跨度不支持超过一个月），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * 大区，映射表如下：
China Mainland 中国大陆
Asia Pacific I 亚太一区
Asia Pacific II 亚太二区
Asia Pacific III 亚太三区
Europe 欧洲
North America 北美
South America 南美
Middle East 中东
Africa 非洲。
    */
    @SerializedName("RegionNames")
    @Expose
    private String [] RegionNames;

    /**
    * 国家，映射表参照如下文档：
https://cloud.tencent.com/document/product/267/34019。
    */
    @SerializedName("CountryNames")
    @Expose
    private String [] CountryNames;

    /**
     * Get 查询开始时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。 
     * @return StartTime 查询开始时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
     * @param StartTime 查询开始时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。 
     * @return EndTime 查询结束时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
     * @param EndTime 查询结束时间点，精确到分钟粒度，接口查询支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F,-ISO%20%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
支持最近三年的查询，查询开始和结束时间跨度不支持超过31天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名，可以填多个，若不填，表示总体数据。 
     * @return PushDomains 域名，可以填多个，若不填，表示总体数据。
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set 域名，可以填多个，若不填，表示总体数据。
     * @param PushDomains 域名，可以填多个，若不填，表示总体数据。
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    /**
     * Get 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
不填则默认查询全球地区（境内+境外）的数据。 
     * @return MainlandOrOversea 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
不填则默认查询全球地区（境内+境外）的数据。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
不填则默认查询全球地区（境内+境外）的数据。
     * @param MainlandOrOversea 可选值：
Mainland：查询中国大陆（境内）数据，
Oversea：则查询国际/港澳台（境外）数据，
不填则默认查询全球地区（境内+境外）的数据。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
60：1小时粒度（跨度不支持超过一个月），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。 
     * @return Granularity 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
60：1小时粒度（跨度不支持超过一个月），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
60：1小时粒度（跨度不支持超过一个月），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
     * @param Granularity 数据粒度，支持如下粒度：
5：5分钟粒度，（跨度不支持超过1天），
60：1小时粒度（跨度不支持超过一个月），
1440：天粒度（跨度不支持超过一个月）。
默认值：5。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 大区，映射表如下：
China Mainland 中国大陆
Asia Pacific I 亚太一区
Asia Pacific II 亚太二区
Asia Pacific III 亚太三区
Europe 欧洲
North America 北美
South America 南美
Middle East 中东
Africa 非洲。 
     * @return RegionNames 大区，映射表如下：
China Mainland 中国大陆
Asia Pacific I 亚太一区
Asia Pacific II 亚太二区
Asia Pacific III 亚太三区
Europe 欧洲
North America 北美
South America 南美
Middle East 中东
Africa 非洲。
     */
    public String [] getRegionNames() {
        return this.RegionNames;
    }

    /**
     * Set 大区，映射表如下：
China Mainland 中国大陆
Asia Pacific I 亚太一区
Asia Pacific II 亚太二区
Asia Pacific III 亚太三区
Europe 欧洲
North America 北美
South America 南美
Middle East 中东
Africa 非洲。
     * @param RegionNames 大区，映射表如下：
China Mainland 中国大陆
Asia Pacific I 亚太一区
Asia Pacific II 亚太二区
Asia Pacific III 亚太三区
Europe 欧洲
North America 北美
South America 南美
Middle East 中东
Africa 非洲。
     */
    public void setRegionNames(String [] RegionNames) {
        this.RegionNames = RegionNames;
    }

    /**
     * Get 国家，映射表参照如下文档：
https://cloud.tencent.com/document/product/267/34019。 
     * @return CountryNames 国家，映射表参照如下文档：
https://cloud.tencent.com/document/product/267/34019。
     */
    public String [] getCountryNames() {
        return this.CountryNames;
    }

    /**
     * Set 国家，映射表参照如下文档：
https://cloud.tencent.com/document/product/267/34019。
     * @param CountryNames 国家，映射表参照如下文档：
https://cloud.tencent.com/document/product/267/34019。
     */
    public void setCountryNames(String [] CountryNames) {
        this.CountryNames = CountryNames;
    }

    public DescribePushBandwidthAndFluxListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePushBandwidthAndFluxListRequest(DescribePushBandwidthAndFluxListRequest source) {
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
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.RegionNames != null) {
            this.RegionNames = new String[source.RegionNames.length];
            for (int i = 0; i < source.RegionNames.length; i++) {
                this.RegionNames[i] = new String(source.RegionNames[i]);
            }
        }
        if (source.CountryNames != null) {
            this.CountryNames = new String[source.CountryNames.length];
            for (int i = 0; i < source.CountryNames.length; i++) {
                this.CountryNames[i] = new String(source.CountryNames[i]);
            }
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
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamArraySimple(map, prefix + "RegionNames.", this.RegionNames);
        this.setParamArraySimple(map, prefix + "CountryNames.", this.CountryNames);

    }
}

