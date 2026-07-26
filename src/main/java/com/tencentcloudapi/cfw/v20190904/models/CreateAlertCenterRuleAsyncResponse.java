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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertCenterRuleAsyncResponse extends AbstractModel {

    /**
    * 请求返回码，0 表示已进入异步处理；处理进度见 Status。
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 与 ReturnCode 对应的结果信息，成功时为 success。
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 异步处理状态：1 表示处理中，使用完全相同的请求参数继续查询；修改参数会发起新的操作。0 表示处理结束，处置结果通过对应查询接口获取。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求返回码，0 表示已进入异步处理；处理进度见 Status。 
     * @return ReturnCode 请求返回码，0 表示已进入异步处理；处理进度见 Status。
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 请求返回码，0 表示已进入异步处理；处理进度见 Status。
     * @param ReturnCode 请求返回码，0 表示已进入异步处理；处理进度见 Status。
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 与 ReturnCode 对应的结果信息，成功时为 success。 
     * @return ReturnMsg 与 ReturnCode 对应的结果信息，成功时为 success。
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 与 ReturnCode 对应的结果信息，成功时为 success。
     * @param ReturnMsg 与 ReturnCode 对应的结果信息，成功时为 success。
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 异步处理状态：1 表示处理中，使用完全相同的请求参数继续查询；修改参数会发起新的操作。0 表示处理结束，处置结果通过对应查询接口获取。 
     * @return Status 异步处理状态：1 表示处理中，使用完全相同的请求参数继续查询；修改参数会发起新的操作。0 表示处理结束，处置结果通过对应查询接口获取。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 异步处理状态：1 表示处理中，使用完全相同的请求参数继续查询；修改参数会发起新的操作。0 表示处理结束，处置结果通过对应查询接口获取。
     * @param Status 异步处理状态：1 表示处理中，使用完全相同的请求参数继续查询；修改参数会发起新的操作。0 表示处理结束，处置结果通过对应查询接口获取。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public CreateAlertCenterRuleAsyncResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterRuleAsyncResponse(CreateAlertCenterRuleAsyncResponse source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

