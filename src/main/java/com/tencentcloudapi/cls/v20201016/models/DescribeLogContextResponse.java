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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogContextResponse extends AbstractModel {

    /**
    * 日志上下文信息集合
    */
    @SerializedName("LogContextInfos")
    @Expose
    private LogContextInfo [] LogContextInfos;

    /**
    * 上文日志是否已经返回完成（当PrevOver为false，表示有上文日志还未全部返回）。
    */
    @SerializedName("PrevOver")
    @Expose
    private Boolean PrevOver;

    /**
    * 下文日志是否已经返回完成（当NextOver为false，表示有下文日志还未全部返回）。
    */
    @SerializedName("NextOver")
    @Expose
    private Boolean NextOver;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志上下文信息集合 
     * @return LogContextInfos 日志上下文信息集合
     */
    public LogContextInfo [] getLogContextInfos() {
        return this.LogContextInfos;
    }

    /**
     * Set 日志上下文信息集合
     * @param LogContextInfos 日志上下文信息集合
     */
    public void setLogContextInfos(LogContextInfo [] LogContextInfos) {
        this.LogContextInfos = LogContextInfos;
    }

    /**
     * Get 上文日志是否已经返回完成（当PrevOver为false，表示有上文日志还未全部返回）。 
     * @return PrevOver 上文日志是否已经返回完成（当PrevOver为false，表示有上文日志还未全部返回）。
     */
    public Boolean getPrevOver() {
        return this.PrevOver;
    }

    /**
     * Set 上文日志是否已经返回完成（当PrevOver为false，表示有上文日志还未全部返回）。
     * @param PrevOver 上文日志是否已经返回完成（当PrevOver为false，表示有上文日志还未全部返回）。
     */
    public void setPrevOver(Boolean PrevOver) {
        this.PrevOver = PrevOver;
    }

    /**
     * Get 下文日志是否已经返回完成（当NextOver为false，表示有下文日志还未全部返回）。 
     * @return NextOver 下文日志是否已经返回完成（当NextOver为false，表示有下文日志还未全部返回）。
     */
    public Boolean getNextOver() {
        return this.NextOver;
    }

    /**
     * Set 下文日志是否已经返回完成（当NextOver为false，表示有下文日志还未全部返回）。
     * @param NextOver 下文日志是否已经返回完成（当NextOver为false，表示有下文日志还未全部返回）。
     */
    public void setNextOver(Boolean NextOver) {
        this.NextOver = NextOver;
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

    public DescribeLogContextResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogContextResponse(DescribeLogContextResponse source) {
        if (source.LogContextInfos != null) {
            this.LogContextInfos = new LogContextInfo[source.LogContextInfos.length];
            for (int i = 0; i < source.LogContextInfos.length; i++) {
                this.LogContextInfos[i] = new LogContextInfo(source.LogContextInfos[i]);
            }
        }
        if (source.PrevOver != null) {
            this.PrevOver = new Boolean(source.PrevOver);
        }
        if (source.NextOver != null) {
            this.NextOver = new Boolean(source.NextOver);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LogContextInfos.", this.LogContextInfos);
        this.setParamSimple(map, prefix + "PrevOver", this.PrevOver);
        this.setParamSimple(map, prefix + "NextOver", this.NextOver);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

