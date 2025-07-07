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

public class DescribeLiveEnhanceInfoListRequest extends AbstractModel {

    /**
    * 起始时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询粒度，支持5，60分钟。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * 查询域名，如果不填则默认查全部的数据。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * 增强服务类型，如果不填则默认查全部的数据。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 分辨率，如果不填则默认查全部的数据。
    */
    @SerializedName("Resolution")
    @Expose
    private String [] Resolution;

    /**
    * 帧率，如果不填则默认查全部的数据。
    */
    @SerializedName("Fps")
    @Expose
    private String [] Fps;

    /**
     * Get 起始时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。 
     * @return StartTime 起始时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
     * @param StartTime 起始时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。 
     * @return EndTime 结束时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
     * @param EndTime 结束时间点，使用ISO格式时间，
例如：2019-01-08T10:00:00Z。
注意：北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见[ISO 日期格式说明](https://cloud.tencent.com/document/product/267/38543#:~:text=I-,ISO,-%E6%97%A5%E6%9C%9F%E6%A0%BC%E5%BC%8F)。
接口支持最近三个月的查询，开始时间和结束时间查询跨度不能超过三十天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询粒度，支持5，60分钟。 
     * @return Granularity 查询粒度，支持5，60分钟。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 查询粒度，支持5，60分钟。
     * @param Granularity 查询粒度，支持5，60分钟。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 查询域名，如果不填则默认查全部的数据。 
     * @return DomainNames 查询域名，如果不填则默认查全部的数据。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 查询域名，如果不填则默认查全部的数据。
     * @param DomainNames 查询域名，如果不填则默认查全部的数据。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get 增强服务类型，如果不填则默认查全部的数据。 
     * @return Type 增强服务类型，如果不填则默认查全部的数据。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 增强服务类型，如果不填则默认查全部的数据。
     * @param Type 增强服务类型，如果不填则默认查全部的数据。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 分辨率，如果不填则默认查全部的数据。 
     * @return Resolution 分辨率，如果不填则默认查全部的数据。
     */
    public String [] getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率，如果不填则默认查全部的数据。
     * @param Resolution 分辨率，如果不填则默认查全部的数据。
     */
    public void setResolution(String [] Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 帧率，如果不填则默认查全部的数据。 
     * @return Fps 帧率，如果不填则默认查全部的数据。
     */
    public String [] getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，如果不填则默认查全部的数据。
     * @param Fps 帧率，如果不填则默认查全部的数据。
     */
    public void setFps(String [] Fps) {
        this.Fps = Fps;
    }

    public DescribeLiveEnhanceInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveEnhanceInfoListRequest(DescribeLiveEnhanceInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Resolution != null) {
            this.Resolution = new String[source.Resolution.length];
            for (int i = 0; i < source.Resolution.length; i++) {
                this.Resolution[i] = new String(source.Resolution[i]);
            }
        }
        if (source.Fps != null) {
            this.Fps = new String[source.Fps.length];
            for (int i = 0; i < source.Fps.length; i++) {
                this.Fps[i] = new String(source.Fps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "Resolution.", this.Resolution);
        this.setParamArraySimple(map, prefix + "Fps.", this.Fps);

    }
}

