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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatisticsResponse extends AbstractModel {

    /**
    * 发送数据统计响应包体。
    */
    @SerializedName("SmsPackagesStatisticsSet")
    @Expose
    private SmsPackagesStatistics [] SmsPackagesStatisticsSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发送数据统计响应包体。 
     * @return SmsPackagesStatisticsSet 发送数据统计响应包体。
     */
    public SmsPackagesStatistics [] getSmsPackagesStatisticsSet() {
        return this.SmsPackagesStatisticsSet;
    }

    /**
     * Set 发送数据统计响应包体。
     * @param SmsPackagesStatisticsSet 发送数据统计响应包体。
     */
    public void setSmsPackagesStatisticsSet(SmsPackagesStatistics [] SmsPackagesStatisticsSet) {
        this.SmsPackagesStatisticsSet = SmsPackagesStatisticsSet;
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

    public SmsPackagesStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsPackagesStatisticsResponse(SmsPackagesStatisticsResponse source) {
        if (source.SmsPackagesStatisticsSet != null) {
            this.SmsPackagesStatisticsSet = new SmsPackagesStatistics[source.SmsPackagesStatisticsSet.length];
            for (int i = 0; i < source.SmsPackagesStatisticsSet.length; i++) {
                this.SmsPackagesStatisticsSet[i] = new SmsPackagesStatistics(source.SmsPackagesStatisticsSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SmsPackagesStatisticsSet.", this.SmsPackagesStatisticsSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

