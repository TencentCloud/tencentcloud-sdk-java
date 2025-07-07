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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSCIMCredentialsResponse extends AbstractModel {

    /**
    * SCIM密钥数量。
    */
    @SerializedName("TotalCounts")
    @Expose
    private Long TotalCounts;

    /**
    * SCIM 密钥信息。
    */
    @SerializedName("SCIMCredentials")
    @Expose
    private SCIMCredential [] SCIMCredentials;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SCIM密钥数量。 
     * @return TotalCounts SCIM密钥数量。
     */
    public Long getTotalCounts() {
        return this.TotalCounts;
    }

    /**
     * Set SCIM密钥数量。
     * @param TotalCounts SCIM密钥数量。
     */
    public void setTotalCounts(Long TotalCounts) {
        this.TotalCounts = TotalCounts;
    }

    /**
     * Get SCIM 密钥信息。 
     * @return SCIMCredentials SCIM 密钥信息。
     */
    public SCIMCredential [] getSCIMCredentials() {
        return this.SCIMCredentials;
    }

    /**
     * Set SCIM 密钥信息。
     * @param SCIMCredentials SCIM 密钥信息。
     */
    public void setSCIMCredentials(SCIMCredential [] SCIMCredentials) {
        this.SCIMCredentials = SCIMCredentials;
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

    public ListSCIMCredentialsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSCIMCredentialsResponse(ListSCIMCredentialsResponse source) {
        if (source.TotalCounts != null) {
            this.TotalCounts = new Long(source.TotalCounts);
        }
        if (source.SCIMCredentials != null) {
            this.SCIMCredentials = new SCIMCredential[source.SCIMCredentials.length];
            for (int i = 0; i < source.SCIMCredentials.length; i++) {
                this.SCIMCredentials[i] = new SCIMCredential(source.SCIMCredentials[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCounts", this.TotalCounts);
        this.setParamArrayObj(map, prefix + "SCIMCredentials.", this.SCIMCredentials);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

