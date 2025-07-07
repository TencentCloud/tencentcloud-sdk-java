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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAclRuleRequest extends AbstractModel {

    /**
    * 实例id信息
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * acl规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get 实例id信息 
     * @return InstanceId 实例id信息
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id信息
     * @param InstanceId 实例id信息
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get acl规则名称 
     * @return RuleName acl规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set acl规则名称
     * @param RuleName acl规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public DeleteAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAclRuleRequest(DeleteAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

