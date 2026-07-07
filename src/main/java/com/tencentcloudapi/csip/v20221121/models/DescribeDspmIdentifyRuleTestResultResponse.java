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

public class DescribeDspmIdentifyRuleTestResultResponse extends AbstractModel {

    /**
    * <p>是否匹配成功</p><p>枚举值：</p><ul><li>true： 匹配成功</li><li>false： 匹配失败</li></ul>
    */
    @SerializedName("IsMatch")
    @Expose
    private Boolean IsMatch;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否匹配成功</p><p>枚举值：</p><ul><li>true： 匹配成功</li><li>false： 匹配失败</li></ul> 
     * @return IsMatch <p>是否匹配成功</p><p>枚举值：</p><ul><li>true： 匹配成功</li><li>false： 匹配失败</li></ul>
     */
    public Boolean getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set <p>是否匹配成功</p><p>枚举值：</p><ul><li>true： 匹配成功</li><li>false： 匹配失败</li></ul>
     * @param IsMatch <p>是否匹配成功</p><p>枚举值：</p><ul><li>true： 匹配成功</li><li>false： 匹配失败</li></ul>
     */
    public void setIsMatch(Boolean IsMatch) {
        this.IsMatch = IsMatch;
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

    public DescribeDspmIdentifyRuleTestResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyRuleTestResultResponse(DescribeDspmIdentifyRuleTestResultResponse source) {
        if (source.IsMatch != null) {
            this.IsMatch = new Boolean(source.IsMatch);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsMatch", this.IsMatch);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

