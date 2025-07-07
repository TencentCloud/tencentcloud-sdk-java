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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowlogsResponse extends AbstractModel {

    /**
    * 查询总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 慢查询日志信息列表
    */
    @SerializedName("Slowlogs")
    @Expose
    private SlowlogInfo [] Slowlogs;

    /**
    * 慢查询日志信息列表
    */
    @SerializedName("SlowLogs")
    @Expose
    private SlowLog [] SlowLogs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询总数 
     * @return TotalCount 查询总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询总数
     * @param TotalCount 查询总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 慢查询日志信息列表 
     * @return Slowlogs 慢查询日志信息列表
     * @deprecated
     */
    @Deprecated
    public SlowlogInfo [] getSlowlogs() {
        return this.Slowlogs;
    }

    /**
     * Set 慢查询日志信息列表
     * @param Slowlogs 慢查询日志信息列表
     * @deprecated
     */
    @Deprecated
    public void setSlowlogs(SlowlogInfo [] Slowlogs) {
        this.Slowlogs = Slowlogs;
    }

    /**
     * Get 慢查询日志信息列表 
     * @return SlowLogs 慢查询日志信息列表
     */
    public SlowLog [] getSlowLogs() {
        return this.SlowLogs;
    }

    /**
     * Set 慢查询日志信息列表
     * @param SlowLogs 慢查询日志信息列表
     */
    public void setSlowLogs(SlowLog [] SlowLogs) {
        this.SlowLogs = SlowLogs;
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

    public DescribeSlowlogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowlogsResponse(DescribeSlowlogsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Slowlogs != null) {
            this.Slowlogs = new SlowlogInfo[source.Slowlogs.length];
            for (int i = 0; i < source.Slowlogs.length; i++) {
                this.Slowlogs[i] = new SlowlogInfo(source.Slowlogs[i]);
            }
        }
        if (source.SlowLogs != null) {
            this.SlowLogs = new SlowLog[source.SlowLogs.length];
            for (int i = 0; i < source.SlowLogs.length; i++) {
                this.SlowLogs[i] = new SlowLog(source.SlowLogs[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Slowlogs.", this.Slowlogs);
        this.setParamArrayObj(map, prefix + "SlowLogs.", this.SlowLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

