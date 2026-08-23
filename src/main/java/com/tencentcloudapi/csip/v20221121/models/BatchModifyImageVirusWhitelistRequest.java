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

public class BatchModifyImageVirusWhitelistRequest extends AbstractModel {

    /**
    * <p>木马白名单id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long [] RuleId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>木马白名单id</p> 
     * @return RuleId <p>木马白名单id</p>
     */
    public Long [] getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>木马白名单id</p>
     * @param RuleId <p>木马白名单id</p>
     */
    public void setRuleId(Long [] RuleId) {
        this.RuleId = RuleId;
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

    /**
     * Get <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul> 
     * @return Status <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     * @param Status <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BatchModifyImageVirusWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyImageVirusWhitelistRequest(BatchModifyImageVirusWhitelistRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long[source.RuleId.length];
            for (int i = 0; i < source.RuleId.length; i++) {
                this.RuleId[i] = new Long(source.RuleId[i]);
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
        this.setParamArraySimple(map, prefix + "RuleId.", this.RuleId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

