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

public class DescribeLiveStreamMonitorListResponse extends AbstractModel {

    /**
    * 账号下的直播流监播任务个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 直播流监播任务列表
    */
    @SerializedName("LiveStreamMonitors")
    @Expose
    private LiveStreamMonitorInfo [] LiveStreamMonitors;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账号下的直播流监播任务个数。 
     * @return TotalNum 账号下的直播流监播任务个数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 账号下的直播流监播任务个数。
     * @param TotalNum 账号下的直播流监播任务个数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 直播流监播任务列表 
     * @return LiveStreamMonitors 直播流监播任务列表
     */
    public LiveStreamMonitorInfo [] getLiveStreamMonitors() {
        return this.LiveStreamMonitors;
    }

    /**
     * Set 直播流监播任务列表
     * @param LiveStreamMonitors 直播流监播任务列表
     */
    public void setLiveStreamMonitors(LiveStreamMonitorInfo [] LiveStreamMonitors) {
        this.LiveStreamMonitors = LiveStreamMonitors;
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

    public DescribeLiveStreamMonitorListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveStreamMonitorListResponse(DescribeLiveStreamMonitorListResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.LiveStreamMonitors != null) {
            this.LiveStreamMonitors = new LiveStreamMonitorInfo[source.LiveStreamMonitors.length];
            for (int i = 0; i < source.LiveStreamMonitors.length; i++) {
                this.LiveStreamMonitors[i] = new LiveStreamMonitorInfo(source.LiveStreamMonitors[i]);
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
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "LiveStreamMonitors.", this.LiveStreamMonitors);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

