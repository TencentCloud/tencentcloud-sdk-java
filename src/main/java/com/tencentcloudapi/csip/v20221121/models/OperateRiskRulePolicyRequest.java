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

public class OperateRiskRulePolicyRequest extends AbstractModel {

    /**
    * 启用或者禁用
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * 风险规则ID集合
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * 是否选择全部
    */
    @SerializedName("CheckAll")
    @Expose
    private Boolean CheckAll;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 用户AppID
    */
    @SerializedName("UserAppID")
    @Expose
    private Long UserAppID;

    /**
     * Get 启用或者禁用 
     * @return OperateType 启用或者禁用
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 启用或者禁用
     * @param OperateType 启用或者禁用
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 风险规则ID集合 
     * @return RuleIDs 风险规则ID集合
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set 风险规则ID集合
     * @param RuleIDs 风险规则ID集合
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get 是否选择全部 
     * @return CheckAll 是否选择全部
     */
    public Boolean getCheckAll() {
        return this.CheckAll;
    }

    /**
     * Set 是否选择全部
     * @param CheckAll 是否选择全部
     */
    public void setCheckAll(Boolean CheckAll) {
        this.CheckAll = CheckAll;
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
     * Get 用户AppID 
     * @return UserAppID 用户AppID
     */
    public Long getUserAppID() {
        return this.UserAppID;
    }

    /**
     * Set 用户AppID
     * @param UserAppID 用户AppID
     */
    public void setUserAppID(Long UserAppID) {
        this.UserAppID = UserAppID;
    }

    public OperateRiskRulePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateRiskRulePolicyRequest(OperateRiskRulePolicyRequest source) {
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.CheckAll != null) {
            this.CheckAll = new Boolean(source.CheckAll);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.UserAppID != null) {
            this.UserAppID = new Long(source.UserAppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamSimple(map, prefix + "CheckAll", this.CheckAll);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "UserAppID", this.UserAppID);

    }
}

