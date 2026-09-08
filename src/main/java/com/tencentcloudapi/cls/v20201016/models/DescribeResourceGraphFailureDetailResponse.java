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

public class DescribeResourceGraphFailureDetailResponse extends AbstractModel {

    /**
    * <p>失败详情信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>最近一次失败时间</p><p>单位：秒</p>
    */
    @SerializedName("LastFailedTime")
    @Expose
    private Long LastFailedTime;

    /**
    * <p>重试次数</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>首次失败时间</p><p>单位：秒</p>
    */
    @SerializedName("FirstFailedAt")
    @Expose
    private Long FirstFailedAt;

    /**
    * <p>引起失败的操作</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>失败详情信息</p> 
     * @return ErrorMessage <p>失败详情信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>失败详情信息</p>
     * @param ErrorMessage <p>失败详情信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>最近一次失败时间</p><p>单位：秒</p> 
     * @return LastFailedTime <p>最近一次失败时间</p><p>单位：秒</p>
     */
    public Long getLastFailedTime() {
        return this.LastFailedTime;
    }

    /**
     * Set <p>最近一次失败时间</p><p>单位：秒</p>
     * @param LastFailedTime <p>最近一次失败时间</p><p>单位：秒</p>
     */
    public void setLastFailedTime(Long LastFailedTime) {
        this.LastFailedTime = LastFailedTime;
    }

    /**
     * Get <p>重试次数</p> 
     * @return RetryCount <p>重试次数</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数</p>
     * @param RetryCount <p>重试次数</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>首次失败时间</p><p>单位：秒</p> 
     * @return FirstFailedAt <p>首次失败时间</p><p>单位：秒</p>
     */
    public Long getFirstFailedAt() {
        return this.FirstFailedAt;
    }

    /**
     * Set <p>首次失败时间</p><p>单位：秒</p>
     * @param FirstFailedAt <p>首次失败时间</p><p>单位：秒</p>
     */
    public void setFirstFailedAt(Long FirstFailedAt) {
        this.FirstFailedAt = FirstFailedAt;
    }

    /**
     * Get <p>引起失败的操作</p> 
     * @return Operation <p>引起失败的操作</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>引起失败的操作</p>
     * @param Operation <p>引起失败的操作</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
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

    public DescribeResourceGraphFailureDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphFailureDetailResponse(DescribeResourceGraphFailureDetailResponse source) {
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.LastFailedTime != null) {
            this.LastFailedTime = new Long(source.LastFailedTime);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.FirstFailedAt != null) {
            this.FirstFailedAt = new Long(source.FirstFailedAt);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "LastFailedTime", this.LastFailedTime);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "FirstFailedAt", this.FirstFailedAt);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

