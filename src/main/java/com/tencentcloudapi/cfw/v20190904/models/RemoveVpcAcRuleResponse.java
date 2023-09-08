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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveVpcAcRuleResponse extends AbstractModel{

    /**
    * 删除成功后返回被删除策略的uuid列表
    */
    @SerializedName("RuleUuids")
    @Expose
    private Long [] RuleUuids;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除成功后返回被删除策略的uuid列表 
     * @return RuleUuids 删除成功后返回被删除策略的uuid列表
     */
    public Long [] getRuleUuids() {
        return this.RuleUuids;
    }

    /**
     * Set 删除成功后返回被删除策略的uuid列表
     * @param RuleUuids 删除成功后返回被删除策略的uuid列表
     */
    public void setRuleUuids(Long [] RuleUuids) {
        this.RuleUuids = RuleUuids;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RemoveVpcAcRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveVpcAcRuleResponse(RemoveVpcAcRuleResponse source) {
        if (source.RuleUuids != null) {
            this.RuleUuids = new Long[source.RuleUuids.length];
            for (int i = 0; i < source.RuleUuids.length; i++) {
                this.RuleUuids[i] = new Long(source.RuleUuids[i]);
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
        this.setParamArraySimple(map, prefix + "RuleUuids.", this.RuleUuids);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

