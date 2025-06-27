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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeAISearchServiceRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 自然语言查询
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
    */
    @SerializedName("SummaryLang")
    @Expose
    private String SummaryLang;

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 是否需要返回总结，默认为True；  开启后会加大接口响应时长
    */
    @SerializedName("EnableSummary")
    @Expose
    private Boolean EnableSummary;

    /**
    * 开始时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * 结束时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * 时区。默认值：Asia/Shanghai

注：
符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok

    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 自然语言查询 
     * @return Query 自然语言查询
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 自然语言查询
     * @param Query 自然语言查询
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH 
     * @return SummaryLang 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
     */
    public String getSummaryLang() {
        return this.SummaryLang;
    }

    /**
     * Set 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
     * @param SummaryLang 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
     */
    public void setSummaryLang(String SummaryLang) {
        this.SummaryLang = SummaryLang;
    }

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 是否需要返回总结，默认为True；  开启后会加大接口响应时长 
     * @return EnableSummary 是否需要返回总结，默认为True；  开启后会加大接口响应时长
     */
    public Boolean getEnableSummary() {
        return this.EnableSummary;
    }

    /**
     * Set 是否需要返回总结，默认为True；  开启后会加大接口响应时长
     * @param EnableSummary 是否需要返回总结，默认为True；  开启后会加大接口响应时长
     */
    public void setEnableSummary(Boolean EnableSummary) {
        this.EnableSummary = EnableSummary;
    }

    /**
     * Get 开始时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"） 
     * @return StartTimeMs 开始时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set 开始时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
     * @param StartTimeMs 开始时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get 结束时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"） 
     * @return EndTimeMs 结束时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set 结束时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
     * @param EndTimeMs 结束时间。

注：
1. 单位为毫秒（ms）
2. 如果同时指定了StartTimeMs与EndTimeMs，时间区间不能大于7天；如果只指定其中一个（例如只指定StartTimeMs，则查询自StartTimeMs后7天内的数据， 反之EndTimeMs也一样）
3. 只要指定了其中一个参数，接口则会忽略Query参数中关于时间的描述；（例如Query为"过去三天关于猫咪的视频"， 则会将"过去三天忽略"）
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get 时区。默认值：Asia/Shanghai

注：
符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok
 
     * @return TimeZone 时区。默认值：Asia/Shanghai

注：
符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok

     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区。默认值：Asia/Shanghai

注：
符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok

     * @param TimeZone 时区。默认值：Asia/Shanghai

注：
符合iana标准 https://www.iana.org/time-zones，例如Asia/Shanghai、Asia/Bangkok

     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public InvokeAISearchServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeAISearchServiceRequest(InvokeAISearchServiceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SummaryLang != null) {
            this.SummaryLang = new String(source.SummaryLang);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.EnableSummary != null) {
            this.EnableSummary = new Boolean(source.EnableSummary);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SummaryLang", this.SummaryLang);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "EnableSummary", this.EnableSummary);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

