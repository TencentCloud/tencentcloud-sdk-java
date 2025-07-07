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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterAuthenticationOptionsResponse extends AbstractModel {

    /**
    * ServiceAccount认证配置
    */
    @SerializedName("ServiceAccounts")
    @Expose
    private ServiceAccountAuthenticationOptions ServiceAccounts;

    /**
    * 最近一次修改操作结果，返回值可能为：Updating，Success，Failed，TimeOut
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * OIDC认证配置
    */
    @SerializedName("OIDCConfig")
    @Expose
    private OIDCConfigAuthenticationOptions OIDCConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ServiceAccount认证配置 
     * @return ServiceAccounts ServiceAccount认证配置
     */
    public ServiceAccountAuthenticationOptions getServiceAccounts() {
        return this.ServiceAccounts;
    }

    /**
     * Set ServiceAccount认证配置
     * @param ServiceAccounts ServiceAccount认证配置
     */
    public void setServiceAccounts(ServiceAccountAuthenticationOptions ServiceAccounts) {
        this.ServiceAccounts = ServiceAccounts;
    }

    /**
     * Get 最近一次修改操作结果，返回值可能为：Updating，Success，Failed，TimeOut 
     * @return LatestOperationState 最近一次修改操作结果，返回值可能为：Updating，Success，Failed，TimeOut
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 最近一次修改操作结果，返回值可能为：Updating，Success，Failed，TimeOut
     * @param LatestOperationState 最近一次修改操作结果，返回值可能为：Updating，Success，Failed，TimeOut
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get OIDC认证配置 
     * @return OIDCConfig OIDC认证配置
     */
    public OIDCConfigAuthenticationOptions getOIDCConfig() {
        return this.OIDCConfig;
    }

    /**
     * Set OIDC认证配置
     * @param OIDCConfig OIDC认证配置
     */
    public void setOIDCConfig(OIDCConfigAuthenticationOptions OIDCConfig) {
        this.OIDCConfig = OIDCConfig;
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

    public DescribeClusterAuthenticationOptionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterAuthenticationOptionsResponse(DescribeClusterAuthenticationOptionsResponse source) {
        if (source.ServiceAccounts != null) {
            this.ServiceAccounts = new ServiceAccountAuthenticationOptions(source.ServiceAccounts);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.OIDCConfig != null) {
            this.OIDCConfig = new OIDCConfigAuthenticationOptions(source.OIDCConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceAccounts.", this.ServiceAccounts);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamObj(map, prefix + "OIDCConfig.", this.OIDCConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

