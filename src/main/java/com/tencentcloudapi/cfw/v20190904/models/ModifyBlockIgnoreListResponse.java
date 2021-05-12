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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockIgnoreListResponse extends AbstractModel{

    /**
    * 接口返回信息
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 接口返回错误码，0请求成功  非0失败
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 接口返回信息 
     * @return ReturnMsg 接口返回信息
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 接口返回信息
     * @param ReturnMsg 接口返回信息
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 接口返回错误码，0请求成功  非0失败 
     * @return ReturnCode 接口返回错误码，0请求成功  非0失败
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 接口返回错误码，0请求成功  非0失败
     * @param ReturnCode 接口返回错误码，0请求成功  非0失败
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
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

    public ModifyBlockIgnoreListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockIgnoreListResponse(ModifyBlockIgnoreListResponse source) {
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

