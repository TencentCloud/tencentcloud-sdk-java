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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCDedicatedCloudAccUsageResponse extends AbstractModel {

    /**
    * 用量指标名列表
    */
    @SerializedName("UsageKey")
    @Expose
    private String [] UsageKey;

    /**
    * 用量明细列表
    */
    @SerializedName("UsageList")
    @Expose
    private UsageList [] UsageList;

    /**
    * 汇总用量列表
    */
    @SerializedName("TotalUsage")
    @Expose
    private Long [] TotalUsage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用量指标名列表 
     * @return UsageKey 用量指标名列表
     */
    public String [] getUsageKey() {
        return this.UsageKey;
    }

    /**
     * Set 用量指标名列表
     * @param UsageKey 用量指标名列表
     */
    public void setUsageKey(String [] UsageKey) {
        this.UsageKey = UsageKey;
    }

    /**
     * Get 用量明细列表 
     * @return UsageList 用量明细列表
     */
    public UsageList [] getUsageList() {
        return this.UsageList;
    }

    /**
     * Set 用量明细列表
     * @param UsageList 用量明细列表
     */
    public void setUsageList(UsageList [] UsageList) {
        this.UsageList = UsageList;
    }

    /**
     * Get 汇总用量列表 
     * @return TotalUsage 汇总用量列表
     */
    public Long [] getTotalUsage() {
        return this.TotalUsage;
    }

    /**
     * Set 汇总用量列表
     * @param TotalUsage 汇总用量列表
     */
    public void setTotalUsage(Long [] TotalUsage) {
        this.TotalUsage = TotalUsage;
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

    public DescribeTRTCDedicatedCloudAccUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCDedicatedCloudAccUsageResponse(DescribeTRTCDedicatedCloudAccUsageResponse source) {
        if (source.UsageKey != null) {
            this.UsageKey = new String[source.UsageKey.length];
            for (int i = 0; i < source.UsageKey.length; i++) {
                this.UsageKey[i] = new String(source.UsageKey[i]);
            }
        }
        if (source.UsageList != null) {
            this.UsageList = new UsageList[source.UsageList.length];
            for (int i = 0; i < source.UsageList.length; i++) {
                this.UsageList[i] = new UsageList(source.UsageList[i]);
            }
        }
        if (source.TotalUsage != null) {
            this.TotalUsage = new Long[source.TotalUsage.length];
            for (int i = 0; i < source.TotalUsage.length; i++) {
                this.TotalUsage[i] = new Long(source.TotalUsage[i]);
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
        this.setParamArraySimple(map, prefix + "UsageKey.", this.UsageKey);
        this.setParamArrayObj(map, prefix + "UsageList.", this.UsageList);
        this.setParamArraySimple(map, prefix + "TotalUsage.", this.TotalUsage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

