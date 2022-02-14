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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RotateProductSecretResponse extends AbstractModel{

    /**
    * 当凭据类型为云产品凭据时（即SecretType为1，如MySQL、Tdsql等托管凭据）此字段有效，返回轮转异步任务ID号。
    */
    @SerializedName("FlowID")
    @Expose
    private Long FlowID;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当凭据类型为云产品凭据时（即SecretType为1，如MySQL、Tdsql等托管凭据）此字段有效，返回轮转异步任务ID号。 
     * @return FlowID 当凭据类型为云产品凭据时（即SecretType为1，如MySQL、Tdsql等托管凭据）此字段有效，返回轮转异步任务ID号。
     */
    public Long getFlowID() {
        return this.FlowID;
    }

    /**
     * Set 当凭据类型为云产品凭据时（即SecretType为1，如MySQL、Tdsql等托管凭据）此字段有效，返回轮转异步任务ID号。
     * @param FlowID 当凭据类型为云产品凭据时（即SecretType为1，如MySQL、Tdsql等托管凭据）此字段有效，返回轮转异步任务ID号。
     */
    public void setFlowID(Long FlowID) {
        this.FlowID = FlowID;
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

    public RotateProductSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RotateProductSecretResponse(RotateProductSecretResponse source) {
        if (source.FlowID != null) {
            this.FlowID = new Long(source.FlowID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowID", this.FlowID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

