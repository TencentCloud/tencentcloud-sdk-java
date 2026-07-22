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

public class CreateAlertCenterOmitResponse extends AbstractModel {

    /**
    * <p>Cloud API 处理返回码。0 表示 Action 处理函数未返回顶层错误，-1 表示入口参数校验或路由处理失败。忽略记录的数据库处理结果由 Status 表示；ReturnCode=0 不代表一定有记录被更新。</p>
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * <p>Cloud API 处理信息。Action 处理函数未返回顶层错误时为 success；入口参数校验或路由处理失败时为 failed，并同时返回 Error。</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * <p>忽略处理状态。0 表示目标表更新语句执行时未返回数据库错误，但接口不检查受影响行数，因此不保证有记录命中；-1 表示参数归一化后无有效目标或下游处理失败；-3 表示下游报告重复记录错误。应结合 ReturnCode 判断入口校验是否通过。</p>
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
     * Get <p>Cloud API 处理返回码。0 表示 Action 处理函数未返回顶层错误，-1 表示入口参数校验或路由处理失败。忽略记录的数据库处理结果由 Status 表示；ReturnCode=0 不代表一定有记录被更新。</p> 
     * @return ReturnCode <p>Cloud API 处理返回码。0 表示 Action 处理函数未返回顶层错误，-1 表示入口参数校验或路由处理失败。忽略记录的数据库处理结果由 Status 表示；ReturnCode=0 不代表一定有记录被更新。</p>
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set <p>Cloud API 处理返回码。0 表示 Action 处理函数未返回顶层错误，-1 表示入口参数校验或路由处理失败。忽略记录的数据库处理结果由 Status 表示；ReturnCode=0 不代表一定有记录被更新。</p>
     * @param ReturnCode <p>Cloud API 处理返回码。0 表示 Action 处理函数未返回顶层错误，-1 表示入口参数校验或路由处理失败。忽略记录的数据库处理结果由 Status 表示；ReturnCode=0 不代表一定有记录被更新。</p>
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get <p>Cloud API 处理信息。Action 处理函数未返回顶层错误时为 success；入口参数校验或路由处理失败时为 failed，并同时返回 Error。</p> 
     * @return ReturnMsg <p>Cloud API 处理信息。Action 处理函数未返回顶层错误时为 success；入口参数校验或路由处理失败时为 failed，并同时返回 Error。</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>Cloud API 处理信息。Action 处理函数未返回顶层错误时为 success；入口参数校验或路由处理失败时为 failed，并同时返回 Error。</p>
     * @param ReturnMsg <p>Cloud API 处理信息。Action 处理函数未返回顶层错误时为 success；入口参数校验或路由处理失败时为 failed，并同时返回 Error。</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get <p>忽略处理状态。0 表示目标表更新语句执行时未返回数据库错误，但接口不检查受影响行数，因此不保证有记录命中；-1 表示参数归一化后无有效目标或下游处理失败；-3 表示下游报告重复记录错误。应结合 ReturnCode 判断入口校验是否通过。</p> 
     * @return Status <p>忽略处理状态。0 表示目标表更新语句执行时未返回数据库错误，但接口不检查受影响行数，因此不保证有记录命中；-1 表示参数归一化后无有效目标或下游处理失败；-3 表示下游报告重复记录错误。应结合 ReturnCode 判断入口校验是否通过。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>忽略处理状态。0 表示目标表更新语句执行时未返回数据库错误，但接口不检查受影响行数，因此不保证有记录命中；-1 表示参数归一化后无有效目标或下游处理失败；-3 表示下游报告重复记录错误。应结合 ReturnCode 判断入口校验是否通过。</p>
     * @param Status <p>忽略处理状态。0 表示目标表更新语句执行时未返回数据库错误，但接口不检查受影响行数，因此不保证有记录命中；-1 表示参数归一化后无有效目标或下游处理失败；-3 表示下游报告重复记录错误。应结合 ReturnCode 判断入口校验是否通过。</p>
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

    public CreateAlertCenterOmitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterOmitResponse(CreateAlertCenterOmitResponse source) {
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

