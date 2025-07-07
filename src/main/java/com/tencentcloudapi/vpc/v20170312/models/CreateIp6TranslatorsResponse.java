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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIp6TranslatorsResponse extends AbstractModel {

    /**
    * 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
    */
    @SerializedName("Ip6TranslatorSet")
    @Expose
    private String [] Ip6TranslatorSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 转换实例的唯一ID数组，形如"ip6-xxxxxxxx" 
     * @return Ip6TranslatorSet 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
     */
    public String [] getIp6TranslatorSet() {
        return this.Ip6TranslatorSet;
    }

    /**
     * Set 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
     * @param Ip6TranslatorSet 转换实例的唯一ID数组，形如"ip6-xxxxxxxx"
     */
    public void setIp6TranslatorSet(String [] Ip6TranslatorSet) {
        this.Ip6TranslatorSet = Ip6TranslatorSet;
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

    public CreateIp6TranslatorsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIp6TranslatorsResponse(CreateIp6TranslatorsResponse source) {
        if (source.Ip6TranslatorSet != null) {
            this.Ip6TranslatorSet = new String[source.Ip6TranslatorSet.length];
            for (int i = 0; i < source.Ip6TranslatorSet.length; i++) {
                this.Ip6TranslatorSet[i] = new String(source.Ip6TranslatorSet[i]);
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
        this.setParamArraySimple(map, prefix + "Ip6TranslatorSet.", this.Ip6TranslatorSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

