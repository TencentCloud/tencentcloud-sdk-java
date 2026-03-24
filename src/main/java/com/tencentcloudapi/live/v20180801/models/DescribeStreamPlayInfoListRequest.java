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

public class DescribeStreamPlayInfoListRequest extends AbstractModel {

    /**
    * <p>起始时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。结束时间和开始时间跨度不支持超过24小时，支持距当前时间一个月内的数据查询。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>播放域名，<br>若不填，则为查询所有播放域名的在线流数据。</p>
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * <p>流名称，精确匹配。<br>若不填，则为查询总体播放数据。</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * <p>该参数暂不可用。</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get <p>起始时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。</p> 
     * @return StartTime <p>起始时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。</p>
     * @param StartTime <p>起始时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。结束时间和开始时间跨度不支持超过24小时，支持距当前时间一个月内的数据查询。</p> 
     * @return EndTime <p>结束时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。结束时间和开始时间跨度不支持超过24小时，支持距当前时间一个月内的数据查询。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。结束时间和开始时间跨度不支持超过24小时，支持距当前时间一个月内的数据查询。</p>
     * @param EndTime <p>结束时间点，接口查询支持两种时间格式：<br>1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I<br>2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。<br>开始时间和结束时间的格式需要保持一致。结束时间和开始时间跨度不支持超过24小时，支持距当前时间一个月内的数据查询。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>播放域名，<br>若不填，则为查询所有播放域名的在线流数据。</p> 
     * @return PlayDomain <p>播放域名，<br>若不填，则为查询所有播放域名的在线流数据。</p>
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set <p>播放域名，<br>若不填，则为查询所有播放域名的在线流数据。</p>
     * @param PlayDomain <p>播放域名，<br>若不填，则为查询所有播放域名的在线流数据。</p>
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get <p>流名称，精确匹配。<br>若不填，则为查询总体播放数据。</p> 
     * @return StreamName <p>流名称，精确匹配。<br>若不填，则为查询总体播放数据。</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>流名称，精确匹配。<br>若不填，则为查询总体播放数据。</p>
     * @param StreamName <p>流名称，精确匹配。<br>若不填，则为查询总体播放数据。</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get <p>该参数暂不可用。</p> 
     * @return AppName <p>该参数暂不可用。</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>该参数暂不可用。</p>
     * @param AppName <p>该参数暂不可用。</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。</p> 
     * @return ServiceName <p>服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。</p>
     * @param ServiceName <p>服务名称，可选值包括LVB(标准直播)，LEB(快直播)，不填则查LVB+LEB总值。</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public DescribeStreamPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPlayInfoListRequest(DescribeStreamPlayInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

