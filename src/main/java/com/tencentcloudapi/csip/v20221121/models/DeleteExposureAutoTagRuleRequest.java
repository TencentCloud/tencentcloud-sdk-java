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

public class DeleteExposureAutoTagRuleRequest extends AbstractModel {

    /**
    * <p>规则ID集合</p>
    */
    @SerializedName("RuleIDs")
    @Expose
    private Long [] RuleIDs;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>规则ID集合</p> 
     * @return RuleIDs <p>规则ID集合</p>
     */
    public Long [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set <p>规则ID集合</p>
     * @param RuleIDs <p>规则ID集合</p>
     */
    public void setRuleIDs(Long [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DeleteExposureAutoTagRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteExposureAutoTagRuleRequest(DeleteExposureAutoTagRuleRequest source) {
        if (source.RuleIDs != null) {
            this.RuleIDs = new Long[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new Long(source.RuleIDs[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

