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

public class ModifyBackupStrategyResponse extends AbstractModel {

    /**
    * 返回错误码
    */
    @SerializedName("Errno")
    @Expose
    private Long Errno;

    /**
    * 返回错误信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 返回错误码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回错误码 
     * @return Errno 返回错误码
     * @deprecated
     */
    @Deprecated
    public Long getErrno() {
        return this.Errno;
    }

    /**
     * Set 返回错误码
     * @param Errno 返回错误码
     * @deprecated
     */
    @Deprecated
    public void setErrno(Long Errno) {
        this.Errno = Errno;
    }

    /**
     * Get 返回错误信息 
     * @return Msg 返回错误信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 返回错误信息
     * @param Msg 返回错误信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 返回错误码 
     * @return Code 返回错误码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 返回错误码
     * @param Code 返回错误码
     */
    public void setCode(Long Code) {
        this.Code = Code;
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

    public ModifyBackupStrategyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupStrategyResponse(ModifyBackupStrategyResponse source) {
        if (source.Errno != null) {
            this.Errno = new Long(source.Errno);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Errno", this.Errno);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

