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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainOwnerResponse extends AbstractModel {

    /**
    * null: 未转移对应的 DNS 解析域名，false: 转移对应的 DNS 解析域名失败，true: 转移对应的 DNS 解析域名成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferDnsResult")
    @Expose
    private Boolean TransferDnsResult;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get null: 未转移对应的 DNS 解析域名，false: 转移对应的 DNS 解析域名失败，true: 转移对应的 DNS 解析域名成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferDnsResult null: 未转移对应的 DNS 解析域名，false: 转移对应的 DNS 解析域名失败，true: 转移对应的 DNS 解析域名成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTransferDnsResult() {
        return this.TransferDnsResult;
    }

    /**
     * Set null: 未转移对应的 DNS 解析域名，false: 转移对应的 DNS 解析域名失败，true: 转移对应的 DNS 解析域名成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferDnsResult null: 未转移对应的 DNS 解析域名，false: 转移对应的 DNS 解析域名失败，true: 转移对应的 DNS 解析域名成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferDnsResult(Boolean TransferDnsResult) {
        this.TransferDnsResult = TransferDnsResult;
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

    public ModifyDomainOwnerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainOwnerResponse(ModifyDomainOwnerResponse source) {
        if (source.TransferDnsResult != null) {
            this.TransferDnsResult = new Boolean(source.TransferDnsResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferDnsResult", this.TransferDnsResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

