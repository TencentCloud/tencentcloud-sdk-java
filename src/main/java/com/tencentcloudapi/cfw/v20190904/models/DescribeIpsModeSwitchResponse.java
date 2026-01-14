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

public class DescribeIpsModeSwitchResponse extends AbstractModel {

    /**
    * // Mode 取值校验：0-观察模式, 1-拦截模式, 2-严格模式
    */
    @SerializedName("Data")
    @Expose
    private ModeInfo Data;

    /**
    * 0 成功 非0失败
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * success 成功 其他失败
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get // Mode 取值校验：0-观察模式, 1-拦截模式, 2-严格模式 
     * @return Data // Mode 取值校验：0-观察模式, 1-拦截模式, 2-严格模式
     */
    public ModeInfo getData() {
        return this.Data;
    }

    /**
     * Set // Mode 取值校验：0-观察模式, 1-拦截模式, 2-严格模式
     * @param Data // Mode 取值校验：0-观察模式, 1-拦截模式, 2-严格模式
     */
    public void setData(ModeInfo Data) {
        this.Data = Data;
    }

    /**
     * Get 0 成功 非0失败 
     * @return ReturnCode 0 成功 非0失败
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 0 成功 非0失败
     * @param ReturnCode 0 成功 非0失败
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get success 成功 其他失败 
     * @return ReturnMsg success 成功 其他失败
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set success 成功 其他失败
     * @param ReturnMsg success 成功 其他失败
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public DescribeIpsModeSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpsModeSwitchResponse(DescribeIpsModeSwitchResponse source) {
        if (source.Data != null) {
            this.Data = new ModeInfo(source.Data);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

