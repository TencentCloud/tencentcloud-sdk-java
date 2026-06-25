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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegenerateKeysResponse extends AbstractModel {

    /**
    * <p>重新生成后的Key的信息</p>
    */
    @SerializedName("RegeneratedKeys")
    @Expose
    private RegeneratedKey [] RegeneratedKeys;

    /**
    * <p>重新生成失败的Key的ID列表</p>
    */
    @SerializedName("FailedKeyIds")
    @Expose
    private String [] FailedKeyIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>重新生成后的Key的信息</p> 
     * @return RegeneratedKeys <p>重新生成后的Key的信息</p>
     */
    public RegeneratedKey [] getRegeneratedKeys() {
        return this.RegeneratedKeys;
    }

    /**
     * Set <p>重新生成后的Key的信息</p>
     * @param RegeneratedKeys <p>重新生成后的Key的信息</p>
     */
    public void setRegeneratedKeys(RegeneratedKey [] RegeneratedKeys) {
        this.RegeneratedKeys = RegeneratedKeys;
    }

    /**
     * Get <p>重新生成失败的Key的ID列表</p> 
     * @return FailedKeyIds <p>重新生成失败的Key的ID列表</p>
     */
    public String [] getFailedKeyIds() {
        return this.FailedKeyIds;
    }

    /**
     * Set <p>重新生成失败的Key的ID列表</p>
     * @param FailedKeyIds <p>重新生成失败的Key的ID列表</p>
     */
    public void setFailedKeyIds(String [] FailedKeyIds) {
        this.FailedKeyIds = FailedKeyIds;
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

    public RegenerateKeysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegenerateKeysResponse(RegenerateKeysResponse source) {
        if (source.RegeneratedKeys != null) {
            this.RegeneratedKeys = new RegeneratedKey[source.RegeneratedKeys.length];
            for (int i = 0; i < source.RegeneratedKeys.length; i++) {
                this.RegeneratedKeys[i] = new RegeneratedKey(source.RegeneratedKeys[i]);
            }
        }
        if (source.FailedKeyIds != null) {
            this.FailedKeyIds = new String[source.FailedKeyIds.length];
            for (int i = 0; i < source.FailedKeyIds.length; i++) {
                this.FailedKeyIds[i] = new String(source.FailedKeyIds[i]);
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
        this.setParamArrayObj(map, prefix + "RegeneratedKeys.", this.RegeneratedKeys);
        this.setParamArraySimple(map, prefix + "FailedKeyIds.", this.FailedKeyIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

