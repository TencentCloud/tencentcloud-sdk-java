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

public class DayStreamPlayInfo extends AbstractModel {

    /**
    * 数据时间点，接口返回支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见ISO日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。
接口返回的时间格式和查询请求传入的时间格式一致。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 带宽（单位Mbps）。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 流量 （单位MB）。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 请求数。
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
    * 在线人数。当前后端接口数据的统计方式与客户端侧不同，该数据仅供参考，具体数据请以业务客户端侧统计数据为准。
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
     * Get 数据时间点，接口返回支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见ISO日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。
接口返回的时间格式和查询请求传入的时间格式一致。 
     * @return Time 数据时间点，接口返回支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见ISO日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。
接口返回的时间格式和查询请求传入的时间格式一致。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间点，接口返回支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见ISO日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。
接口返回的时间格式和查询请求传入的时间格式一致。
     * @param Time 数据时间点，接口返回支持两种时间格式：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见ISO日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）yyyy-MM-dd HH:mm:ss：使用此格式时，默认代表北京时间。
接口返回的时间格式和查询请求传入的时间格式一致。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 带宽（单位Mbps）。 
     * @return Bandwidth 带宽（单位Mbps）。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽（单位Mbps）。
     * @param Bandwidth 带宽（单位Mbps）。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 流量 （单位MB）。 
     * @return Flux 流量 （单位MB）。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set 流量 （单位MB）。
     * @param Flux 流量 （单位MB）。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get 请求数。 
     * @return Request 请求数。
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set 请求数。
     * @param Request 请求数。
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Get 在线人数。当前后端接口数据的统计方式与客户端侧不同，该数据仅供参考，具体数据请以业务客户端侧统计数据为准。 
     * @return Online 在线人数。当前后端接口数据的统计方式与客户端侧不同，该数据仅供参考，具体数据请以业务客户端侧统计数据为准。
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 在线人数。当前后端接口数据的统计方式与客户端侧不同，该数据仅供参考，具体数据请以业务客户端侧统计数据为准。
     * @param Online 在线人数。当前后端接口数据的统计方式与客户端侧不同，该数据仅供参考，具体数据请以业务客户端侧统计数据为准。
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    public DayStreamPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DayStreamPlayInfo(DayStreamPlayInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
        if (source.Flux != null) {
            this.Flux = new Float(source.Flux);
        }
        if (source.Request != null) {
            this.Request = new Long(source.Request);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

