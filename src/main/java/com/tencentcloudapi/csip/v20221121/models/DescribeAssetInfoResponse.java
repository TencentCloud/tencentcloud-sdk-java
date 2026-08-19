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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetInfoResponse extends AbstractModel {

    /**
    * 基本信息
    */
    @SerializedName("Basic")
    @Expose
    private FieldConfig [] Basic;

    /**
    * 网络信息
    */
    @SerializedName("Network")
    @Expose
    private FieldConfig [] Network;

    /**
    * 防护信息
    */
    @SerializedName("Protection")
    @Expose
    private FieldConfig [] Protection;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基本信息 
     * @return Basic 基本信息
     */
    public FieldConfig [] getBasic() {
        return this.Basic;
    }

    /**
     * Set 基本信息
     * @param Basic 基本信息
     */
    public void setBasic(FieldConfig [] Basic) {
        this.Basic = Basic;
    }

    /**
     * Get 网络信息 
     * @return Network 网络信息
     */
    public FieldConfig [] getNetwork() {
        return this.Network;
    }

    /**
     * Set 网络信息
     * @param Network 网络信息
     */
    public void setNetwork(FieldConfig [] Network) {
        this.Network = Network;
    }

    /**
     * Get 防护信息 
     * @return Protection 防护信息
     */
    public FieldConfig [] getProtection() {
        return this.Protection;
    }

    /**
     * Set 防护信息
     * @param Protection 防护信息
     */
    public void setProtection(FieldConfig [] Protection) {
        this.Protection = Protection;
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

    public DescribeAssetInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetInfoResponse(DescribeAssetInfoResponse source) {
        if (source.Basic != null) {
            this.Basic = new FieldConfig[source.Basic.length];
            for (int i = 0; i < source.Basic.length; i++) {
                this.Basic[i] = new FieldConfig(source.Basic[i]);
            }
        }
        if (source.Network != null) {
            this.Network = new FieldConfig[source.Network.length];
            for (int i = 0; i < source.Network.length; i++) {
                this.Network[i] = new FieldConfig(source.Network[i]);
            }
        }
        if (source.Protection != null) {
            this.Protection = new FieldConfig[source.Protection.length];
            for (int i = 0; i < source.Protection.length; i++) {
                this.Protection[i] = new FieldConfig(source.Protection[i]);
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
        this.setParamArrayObj(map, prefix + "Basic.", this.Basic);
        this.setParamArrayObj(map, prefix + "Network.", this.Network);
        this.setParamArrayObj(map, prefix + "Protection.", this.Protection);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

