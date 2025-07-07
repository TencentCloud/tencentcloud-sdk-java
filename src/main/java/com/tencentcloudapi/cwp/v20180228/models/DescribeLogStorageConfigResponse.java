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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogStorageConfigResponse extends AbstractModel {

    /**
    * 存储类型，string数组
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 日志存储时长，3640表示不限
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 本月Period的修改次数
    */
    @SerializedName("PeriodModifyCount")
    @Expose
    private Long PeriodModifyCount;

    /**
    * 日志存储时长单位，年year/月month/天day
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存储类型，string数组 
     * @return Type 存储类型，string数组
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 存储类型，string数组
     * @param Type 存储类型，string数组
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 日志存储时长，3640表示不限 
     * @return Period 日志存储时长，3640表示不限
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志存储时长，3640表示不限
     * @param Period 日志存储时长，3640表示不限
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 本月Period的修改次数 
     * @return PeriodModifyCount 本月Period的修改次数
     */
    public Long getPeriodModifyCount() {
        return this.PeriodModifyCount;
    }

    /**
     * Set 本月Period的修改次数
     * @param PeriodModifyCount 本月Period的修改次数
     */
    public void setPeriodModifyCount(Long PeriodModifyCount) {
        this.PeriodModifyCount = PeriodModifyCount;
    }

    /**
     * Get 日志存储时长单位，年year/月month/天day 
     * @return Granularity 日志存储时长单位，年year/月month/天day
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 日志存储时长单位，年year/月month/天day
     * @param Granularity 日志存储时长单位，年year/月month/天day
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
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

    public DescribeLogStorageConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogStorageConfigResponse(DescribeLogStorageConfigResponse source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.PeriodModifyCount != null) {
            this.PeriodModifyCount = new Long(source.PeriodModifyCount);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "PeriodModifyCount", this.PeriodModifyCount);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

