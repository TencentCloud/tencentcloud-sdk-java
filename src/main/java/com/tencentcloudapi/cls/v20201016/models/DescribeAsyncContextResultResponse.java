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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncContextResultResponse extends AbstractModel{

    /**
    * 上文日志是否已经返回
    */
    @SerializedName("PrevOver")
    @Expose
    private Boolean PrevOver;

    /**
    * 下文日志是否已经返回
    */
    @SerializedName("NextOver")
    @Expose
    private Boolean NextOver;

    /**
    * 日志内容
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上文日志是否已经返回 
     * @return PrevOver 上文日志是否已经返回
     */
    public Boolean getPrevOver() {
        return this.PrevOver;
    }

    /**
     * Set 上文日志是否已经返回
     * @param PrevOver 上文日志是否已经返回
     */
    public void setPrevOver(Boolean PrevOver) {
        this.PrevOver = PrevOver;
    }

    /**
     * Get 下文日志是否已经返回 
     * @return NextOver 下文日志是否已经返回
     */
    public Boolean getNextOver() {
        return this.NextOver;
    }

    /**
     * Set 下文日志是否已经返回
     * @param NextOver 下文日志是否已经返回
     */
    public void setNextOver(Boolean NextOver) {
        this.NextOver = NextOver;
    }

    /**
     * Get 日志内容 
     * @return Results 日志内容
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志内容
     * @param Results 日志内容
     */
    public void setResults(LogInfo [] Results) {
        this.Results = Results;
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

    public DescribeAsyncContextResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncContextResultResponse(DescribeAsyncContextResultResponse source) {
        if (source.PrevOver != null) {
            this.PrevOver = new Boolean(source.PrevOver);
        }
        if (source.NextOver != null) {
            this.NextOver = new Boolean(source.NextOver);
        }
        if (source.Results != null) {
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
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
        this.setParamSimple(map, prefix + "PrevOver", this.PrevOver);
        this.setParamSimple(map, prefix + "NextOver", this.NextOver);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

