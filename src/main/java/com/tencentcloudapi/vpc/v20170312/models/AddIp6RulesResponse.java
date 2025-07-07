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

public class AddIp6RulesResponse extends AbstractModel {

    /**
    * IPV6转换规则唯一ID数组，形如rule6-xxxxxxxx
    */
    @SerializedName("Ip6RuleSet")
    @Expose
    private String [] Ip6RuleSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IPV6转换规则唯一ID数组，形如rule6-xxxxxxxx 
     * @return Ip6RuleSet IPV6转换规则唯一ID数组，形如rule6-xxxxxxxx
     */
    public String [] getIp6RuleSet() {
        return this.Ip6RuleSet;
    }

    /**
     * Set IPV6转换规则唯一ID数组，形如rule6-xxxxxxxx
     * @param Ip6RuleSet IPV6转换规则唯一ID数组，形如rule6-xxxxxxxx
     */
    public void setIp6RuleSet(String [] Ip6RuleSet) {
        this.Ip6RuleSet = Ip6RuleSet;
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

    public AddIp6RulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddIp6RulesResponse(AddIp6RulesResponse source) {
        if (source.Ip6RuleSet != null) {
            this.Ip6RuleSet = new String[source.Ip6RuleSet.length];
            for (int i = 0; i < source.Ip6RuleSet.length; i++) {
                this.Ip6RuleSet[i] = new String(source.Ip6RuleSet[i]);
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
        this.setParamArraySimple(map, prefix + "Ip6RuleSet.", this.Ip6RuleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

