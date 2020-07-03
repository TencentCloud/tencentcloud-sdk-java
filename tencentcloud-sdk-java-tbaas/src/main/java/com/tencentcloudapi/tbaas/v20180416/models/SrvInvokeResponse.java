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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrvInvokeResponse extends AbstractModel{

    /**
    * 返回码
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * 返回消息
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * 返回数据
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回码 
     * @return RetCode 返回码
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 返回码
     * @param RetCode 返回码
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 返回消息 
     * @return RetMsg 返回消息
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set 返回消息
     * @param RetMsg 返回消息
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * Get 返回数据 
     * @return Data 返回数据
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 返回数据
     * @param Data 返回数据
     */
    public void setData(String Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

