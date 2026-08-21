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

public class DeleteBaselineSelfDefinedPolicyListRequest extends AbstractModel {

    /**
    * <p>待删除的自定义策略 ID 列表，不可为空且元素不可为 0。</p>
    */
    @SerializedName("PolicyIDList")
    @Expose
    private Long [] PolicyIDList;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>待删除的自定义策略 ID 列表，不可为空且元素不可为 0。</p> 
     * @return PolicyIDList <p>待删除的自定义策略 ID 列表，不可为空且元素不可为 0。</p>
     */
    public Long [] getPolicyIDList() {
        return this.PolicyIDList;
    }

    /**
     * Set <p>待删除的自定义策略 ID 列表，不可为空且元素不可为 0。</p>
     * @param PolicyIDList <p>待删除的自定义策略 ID 列表，不可为空且元素不可为 0。</p>
     */
    public void setPolicyIDList(Long [] PolicyIDList) {
        this.PolicyIDList = PolicyIDList;
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

    public DeleteBaselineSelfDefinedPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBaselineSelfDefinedPolicyListRequest(DeleteBaselineSelfDefinedPolicyListRequest source) {
        if (source.PolicyIDList != null) {
            this.PolicyIDList = new Long[source.PolicyIDList.length];
            for (int i = 0; i < source.PolicyIDList.length; i++) {
                this.PolicyIDList[i] = new Long(source.PolicyIDList[i]);
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
        this.setParamArraySimple(map, prefix + "PolicyIDList.", this.PolicyIDList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

