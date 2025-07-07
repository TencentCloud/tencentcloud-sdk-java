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

public class DescribeCasterDisplayInfoResponse extends AbstractModel {

    /**
    * 导播台状态
0：停止状态，无预监，无主监 
1：无预监，有主监 
2：有预监，无主监 
3：有预监，有主监
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 预监使用的展示参数。
    */
    @SerializedName("PvwDisplayInfo")
    @Expose
    private CasterDisplayInfo PvwDisplayInfo;

    /**
    * 主监使用的展示参数。
    */
    @SerializedName("PgmDisplayInfo")
    @Expose
    private CasterDisplayInfo PgmDisplayInfo;

    /**
    * 启动直播的时间，值为unix时间戳。
    */
    @SerializedName("StartLiveTime")
    @Expose
    private Long StartLiveTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 导播台状态
0：停止状态，无预监，无主监 
1：无预监，有主监 
2：有预监，无主监 
3：有预监，有主监 
     * @return Status 导播台状态
0：停止状态，无预监，无主监 
1：无预监，有主监 
2：有预监，无主监 
3：有预监，有主监
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 导播台状态
0：停止状态，无预监，无主监 
1：无预监，有主监 
2：有预监，无主监 
3：有预监，有主监
     * @param Status 导播台状态
0：停止状态，无预监，无主监 
1：无预监，有主监 
2：有预监，无主监 
3：有预监，有主监
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 预监使用的展示参数。 
     * @return PvwDisplayInfo 预监使用的展示参数。
     */
    public CasterDisplayInfo getPvwDisplayInfo() {
        return this.PvwDisplayInfo;
    }

    /**
     * Set 预监使用的展示参数。
     * @param PvwDisplayInfo 预监使用的展示参数。
     */
    public void setPvwDisplayInfo(CasterDisplayInfo PvwDisplayInfo) {
        this.PvwDisplayInfo = PvwDisplayInfo;
    }

    /**
     * Get 主监使用的展示参数。 
     * @return PgmDisplayInfo 主监使用的展示参数。
     */
    public CasterDisplayInfo getPgmDisplayInfo() {
        return this.PgmDisplayInfo;
    }

    /**
     * Set 主监使用的展示参数。
     * @param PgmDisplayInfo 主监使用的展示参数。
     */
    public void setPgmDisplayInfo(CasterDisplayInfo PgmDisplayInfo) {
        this.PgmDisplayInfo = PgmDisplayInfo;
    }

    /**
     * Get 启动直播的时间，值为unix时间戳。 
     * @return StartLiveTime 启动直播的时间，值为unix时间戳。
     */
    public Long getStartLiveTime() {
        return this.StartLiveTime;
    }

    /**
     * Set 启动直播的时间，值为unix时间戳。
     * @param StartLiveTime 启动直播的时间，值为unix时间戳。
     */
    public void setStartLiveTime(Long StartLiveTime) {
        this.StartLiveTime = StartLiveTime;
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

    public DescribeCasterDisplayInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCasterDisplayInfoResponse(DescribeCasterDisplayInfoResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PvwDisplayInfo != null) {
            this.PvwDisplayInfo = new CasterDisplayInfo(source.PvwDisplayInfo);
        }
        if (source.PgmDisplayInfo != null) {
            this.PgmDisplayInfo = new CasterDisplayInfo(source.PgmDisplayInfo);
        }
        if (source.StartLiveTime != null) {
            this.StartLiveTime = new Long(source.StartLiveTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "PvwDisplayInfo.", this.PvwDisplayInfo);
        this.setParamObj(map, prefix + "PgmDisplayInfo.", this.PgmDisplayInfo);
        this.setParamSimple(map, prefix + "StartLiveTime", this.StartLiveTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

