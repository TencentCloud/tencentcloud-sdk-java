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

public class CopyBaselinePolicyRequest extends AbstractModel {

    /**
    * <p>被复制的策略ID</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>复制的目标AppID</p>
    */
    @SerializedName("TargetAppIDList")
    @Expose
    private Long [] TargetAppIDList;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>被复制的策略ID</p> 
     * @return PolicyID <p>被复制的策略ID</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>被复制的策略ID</p>
     * @param PolicyID <p>被复制的策略ID</p>
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>复制的目标AppID</p> 
     * @return TargetAppIDList <p>复制的目标AppID</p>
     */
    public Long [] getTargetAppIDList() {
        return this.TargetAppIDList;
    }

    /**
     * Set <p>复制的目标AppID</p>
     * @param TargetAppIDList <p>复制的目标AppID</p>
     */
    public void setTargetAppIDList(Long [] TargetAppIDList) {
        this.TargetAppIDList = TargetAppIDList;
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

    public CopyBaselinePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyBaselinePolicyRequest(CopyBaselinePolicyRequest source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.TargetAppIDList != null) {
            this.TargetAppIDList = new Long[source.TargetAppIDList.length];
            for (int i = 0; i < source.TargetAppIDList.length; i++) {
                this.TargetAppIDList[i] = new Long(source.TargetAppIDList[i]);
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
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamArraySimple(map, prefix + "TargetAppIDList.", this.TargetAppIDList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

