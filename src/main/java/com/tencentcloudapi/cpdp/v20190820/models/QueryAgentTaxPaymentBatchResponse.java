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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAgentTaxPaymentBatchResponse extends AbstractModel {

    /**
    * 代理商完税证明批次信息
    */
    @SerializedName("AgentTaxPaymentBatch")
    @Expose
    private AgentTaxPaymentBatch AgentTaxPaymentBatch;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 代理商完税证明批次信息 
     * @return AgentTaxPaymentBatch 代理商完税证明批次信息
     */
    public AgentTaxPaymentBatch getAgentTaxPaymentBatch() {
        return this.AgentTaxPaymentBatch;
    }

    /**
     * Set 代理商完税证明批次信息
     * @param AgentTaxPaymentBatch 代理商完税证明批次信息
     */
    public void setAgentTaxPaymentBatch(AgentTaxPaymentBatch AgentTaxPaymentBatch) {
        this.AgentTaxPaymentBatch = AgentTaxPaymentBatch;
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

    public QueryAgentTaxPaymentBatchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAgentTaxPaymentBatchResponse(QueryAgentTaxPaymentBatchResponse source) {
        if (source.AgentTaxPaymentBatch != null) {
            this.AgentTaxPaymentBatch = new AgentTaxPaymentBatch(source.AgentTaxPaymentBatch);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AgentTaxPaymentBatch.", this.AgentTaxPaymentBatch);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

