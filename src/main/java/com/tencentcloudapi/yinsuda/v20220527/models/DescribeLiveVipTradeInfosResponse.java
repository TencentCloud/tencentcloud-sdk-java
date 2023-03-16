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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveVipTradeInfosResponse extends AbstractModel{

    /**
    * 直播会员充值流水信息列表
    */
    @SerializedName("LiveVipTradeInfoSet")
    @Expose
    private LiveVipTradeInfo [] LiveVipTradeInfoSet;

    /**
    * 直播会员充值流水总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 直播会员充值流水信息列表 
     * @return LiveVipTradeInfoSet 直播会员充值流水信息列表
     */
    public LiveVipTradeInfo [] getLiveVipTradeInfoSet() {
        return this.LiveVipTradeInfoSet;
    }

    /**
     * Set 直播会员充值流水信息列表
     * @param LiveVipTradeInfoSet 直播会员充值流水信息列表
     */
    public void setLiveVipTradeInfoSet(LiveVipTradeInfo [] LiveVipTradeInfoSet) {
        this.LiveVipTradeInfoSet = LiveVipTradeInfoSet;
    }

    /**
     * Get 直播会员充值流水总数。 
     * @return TotalCount 直播会员充值流水总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 直播会员充值流水总数。
     * @param TotalCount 直播会员充值流水总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLiveVipTradeInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveVipTradeInfosResponse(DescribeLiveVipTradeInfosResponse source) {
        if (source.LiveVipTradeInfoSet != null) {
            this.LiveVipTradeInfoSet = new LiveVipTradeInfo[source.LiveVipTradeInfoSet.length];
            for (int i = 0; i < source.LiveVipTradeInfoSet.length; i++) {
                this.LiveVipTradeInfoSet[i] = new LiveVipTradeInfo(source.LiveVipTradeInfoSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LiveVipTradeInfoSet.", this.LiveVipTradeInfoSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

