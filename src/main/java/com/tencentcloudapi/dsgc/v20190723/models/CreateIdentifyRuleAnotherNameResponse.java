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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIdentifyRuleAnotherNameResponse extends AbstractModel {

    /**
    * 创建的别名规则id
    */
    @SerializedName("AliasRuleId")
    @Expose
    private Long AliasRuleId;

    /**
    * 别名规则名称
    */
    @SerializedName("AliasRuleName")
    @Expose
    private String AliasRuleName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 创建的别名规则id 
     * @return AliasRuleId 创建的别名规则id
     */
    public Long getAliasRuleId() {
        return this.AliasRuleId;
    }

    /**
     * Set 创建的别名规则id
     * @param AliasRuleId 创建的别名规则id
     */
    public void setAliasRuleId(Long AliasRuleId) {
        this.AliasRuleId = AliasRuleId;
    }

    /**
     * Get 别名规则名称 
     * @return AliasRuleName 别名规则名称
     */
    public String getAliasRuleName() {
        return this.AliasRuleName;
    }

    /**
     * Set 别名规则名称
     * @param AliasRuleName 别名规则名称
     */
    public void setAliasRuleName(String AliasRuleName) {
        this.AliasRuleName = AliasRuleName;
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

    public CreateIdentifyRuleAnotherNameResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIdentifyRuleAnotherNameResponse(CreateIdentifyRuleAnotherNameResponse source) {
        if (source.AliasRuleId != null) {
            this.AliasRuleId = new Long(source.AliasRuleId);
        }
        if (source.AliasRuleName != null) {
            this.AliasRuleName = new String(source.AliasRuleName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasRuleId", this.AliasRuleId);
        this.setParamSimple(map, prefix + "AliasRuleName", this.AliasRuleName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

