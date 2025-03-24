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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstanceWebShellResponse extends AbstractModel {

    /**
    * 鉴权密钥
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 连接地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 连接区域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 鉴权密钥 
     * @return Key 鉴权密钥
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 鉴权密钥
     * @param Key 鉴权密钥
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 连接地址 
     * @return Address 连接地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 连接地址
     * @param Address 连接地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 连接区域 
     * @return Zone 连接区域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 连接区域
     * @param Zone 连接区域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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

    public CreateAndroidInstanceWebShellResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstanceWebShellResponse(CreateAndroidInstanceWebShellResponse source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

