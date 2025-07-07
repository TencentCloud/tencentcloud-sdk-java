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

public class CdnPlayStatData extends AbstractModel {

    /**
    * 时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 带宽，单位: Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 流量，单位: MB。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 新增请求数。
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
    * 并发连接数。
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
     * Get 时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return Time 时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param Time 时间点，
使用UTC格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 带宽，单位: Mbps。 
     * @return Bandwidth 带宽，单位: Mbps。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽，单位: Mbps。
     * @param Bandwidth 带宽，单位: Mbps。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 流量，单位: MB。 
     * @return Flux 流量，单位: MB。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set 流量，单位: MB。
     * @param Flux 流量，单位: MB。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get 新增请求数。 
     * @return Request 新增请求数。
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set 新增请求数。
     * @param Request 新增请求数。
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Get 并发连接数。 
     * @return Online 并发连接数。
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 并发连接数。
     * @param Online 并发连接数。
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    public CdnPlayStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnPlayStatData(CdnPlayStatData source) {
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

