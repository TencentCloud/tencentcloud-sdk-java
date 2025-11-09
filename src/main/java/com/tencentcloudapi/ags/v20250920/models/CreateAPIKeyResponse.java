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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAPIKeyResponse extends AbstractModel {

    /**
    * 用户传入的API密钥名称，方便用户记忆
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 生成的API密钥，仅返回此一次，后续无法获取
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * API密钥ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户传入的API密钥名称，方便用户记忆 
     * @return Name 用户传入的API密钥名称，方便用户记忆
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户传入的API密钥名称，方便用户记忆
     * @param Name 用户传入的API密钥名称，方便用户记忆
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 生成的API密钥，仅返回此一次，后续无法获取 
     * @return APIKey 生成的API密钥，仅返回此一次，后续无法获取
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set 生成的API密钥，仅返回此一次，后续无法获取
     * @param APIKey 生成的API密钥，仅返回此一次，后续无法获取
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get API密钥ID 
     * @return KeyId API密钥ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set API密钥ID
     * @param KeyId API密钥ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
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

    public CreateAPIKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAPIKeyResponse(CreateAPIKeyResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

