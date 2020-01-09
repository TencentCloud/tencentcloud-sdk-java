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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyResultResponse extends AbstractModel{

    /**
    * 错误的原因
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
    * 错误号
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误的原因 
     * @return ErrorReason 错误的原因
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set 错误的原因
     * @param ErrorReason 错误的原因
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    /**
     * Get 错误号 
     * @return ResultCode 错误号
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 错误号
     * @param ResultCode 错误号
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

