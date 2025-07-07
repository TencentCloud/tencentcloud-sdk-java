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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRequestDataResponse extends AbstractModel {

    /**
    * 请求量统计表
    */
    @SerializedName("Data")
    @Expose
    private MetricData [] Data;

    /**
    * 请求量单位时间: Day：天，Hour：小时
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 导出数据下载地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求量统计表 
     * @return Data 请求量统计表
     */
    public MetricData [] getData() {
        return this.Data;
    }

    /**
     * Set 请求量统计表
     * @param Data 请求量统计表
     */
    public void setData(MetricData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 请求量单位时间: Day：天，Hour：小时 
     * @return Interval 请求量单位时间: Day：天，Hour：小时
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 请求量单位时间: Day：天，Hour：小时
     * @param Interval 请求量单位时间: Day：天，Hour：小时
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 导出数据下载地址 
     * @return Url 导出数据下载地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 导出数据下载地址
     * @param Url 导出数据下载地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRequestDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRequestDataResponse(DescribeRequestDataResponse source) {
        if (source.Data != null) {
            this.Data = new MetricData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new MetricData(source.Data[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

