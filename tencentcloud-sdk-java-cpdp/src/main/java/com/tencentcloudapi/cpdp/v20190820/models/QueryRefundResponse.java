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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryRefundResponse extends AbstractModel{

    /**
    * 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。 
     * @return State 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
     * @param State 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
     */
    public void setState(String State) {
        this.State = State;
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
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

