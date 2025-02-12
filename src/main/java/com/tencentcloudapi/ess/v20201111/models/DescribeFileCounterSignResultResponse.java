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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileCounterSignResultResponse extends AbstractModel {

    /**
    * 加签任务的状态。

<ul>
<li><b>PROCESSING</b>: 任务正在执行中。</li>
<li><b>FINISHED</b>: 已执行成功</li>
<li><b>FAILED</b>: 执行失败</li>
</ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 加签完成后新的文件Id
    */
    @SerializedName("ResultFileId")
    @Expose
    private String ResultFileId;

    /**
    * 失败的错误信息，加签任务失败的情况下会返回。
    */
    @SerializedName("ErrorDetail")
    @Expose
    private String ErrorDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加签任务的状态。

<ul>
<li><b>PROCESSING</b>: 任务正在执行中。</li>
<li><b>FINISHED</b>: 已执行成功</li>
<li><b>FAILED</b>: 执行失败</li>
</ul> 
     * @return Status 加签任务的状态。

<ul>
<li><b>PROCESSING</b>: 任务正在执行中。</li>
<li><b>FINISHED</b>: 已执行成功</li>
<li><b>FAILED</b>: 执行失败</li>
</ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 加签任务的状态。

<ul>
<li><b>PROCESSING</b>: 任务正在执行中。</li>
<li><b>FINISHED</b>: 已执行成功</li>
<li><b>FAILED</b>: 执行失败</li>
</ul>
     * @param Status 加签任务的状态。

<ul>
<li><b>PROCESSING</b>: 任务正在执行中。</li>
<li><b>FINISHED</b>: 已执行成功</li>
<li><b>FAILED</b>: 执行失败</li>
</ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 加签完成后新的文件Id 
     * @return ResultFileId 加签完成后新的文件Id
     */
    public String getResultFileId() {
        return this.ResultFileId;
    }

    /**
     * Set 加签完成后新的文件Id
     * @param ResultFileId 加签完成后新的文件Id
     */
    public void setResultFileId(String ResultFileId) {
        this.ResultFileId = ResultFileId;
    }

    /**
     * Get 失败的错误信息，加签任务失败的情况下会返回。 
     * @return ErrorDetail 失败的错误信息，加签任务失败的情况下会返回。
     */
    public String getErrorDetail() {
        return this.ErrorDetail;
    }

    /**
     * Set 失败的错误信息，加签任务失败的情况下会返回。
     * @param ErrorDetail 失败的错误信息，加签任务失败的情况下会返回。
     */
    public void setErrorDetail(String ErrorDetail) {
        this.ErrorDetail = ErrorDetail;
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

    public DescribeFileCounterSignResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileCounterSignResultResponse(DescribeFileCounterSignResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResultFileId != null) {
            this.ResultFileId = new String(source.ResultFileId);
        }
        if (source.ErrorDetail != null) {
            this.ErrorDetail = new String(source.ErrorDetail);
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
        this.setParamSimple(map, prefix + "ResultFileId", this.ResultFileId);
        this.setParamSimple(map, prefix + "ErrorDetail", this.ErrorDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

