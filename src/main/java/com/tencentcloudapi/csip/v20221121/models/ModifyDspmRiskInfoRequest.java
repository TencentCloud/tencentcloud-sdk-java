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

public class ModifyDspmRiskInfoRequest extends AbstractModel {

    /**
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private String [] RiskId;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 风险状态 2-已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 风险id 
     * @return RiskId 风险id
     */
    public String [] getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险id
     * @param RiskId 风险id
     */
    public void setRiskId(String [] RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 风险状态 2-已忽略 
     * @return Status 风险状态 2-已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 风险状态 2-已忽略
     * @param Status 风险状态 2-已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDspmRiskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmRiskInfoRequest(ModifyDspmRiskInfoRequest source) {
        if (source.RiskId != null) {
            this.RiskId = new String[source.RiskId.length];
            for (int i = 0; i < source.RiskId.length; i++) {
                this.RiskId[i] = new String(source.RiskId[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RiskId.", this.RiskId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

