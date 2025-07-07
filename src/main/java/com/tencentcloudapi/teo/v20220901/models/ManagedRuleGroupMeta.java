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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleGroupMeta extends AbstractModel {

    /**
    * 托管规则组描述，仅出参。
    */
    @SerializedName("GroupDetail")
    @Expose
    private String GroupDetail;

    /**
    * 托管规则组名称，仅出参。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 当前托管规则组下的所有子规则信息，仅出参。
    */
    @SerializedName("RuleDetails")
    @Expose
    private ManagedRuleDetail [] RuleDetails;

    /**
     * Get 托管规则组描述，仅出参。 
     * @return GroupDetail 托管规则组描述，仅出参。
     */
    public String getGroupDetail() {
        return this.GroupDetail;
    }

    /**
     * Set 托管规则组描述，仅出参。
     * @param GroupDetail 托管规则组描述，仅出参。
     */
    public void setGroupDetail(String GroupDetail) {
        this.GroupDetail = GroupDetail;
    }

    /**
     * Get 托管规则组名称，仅出参。 
     * @return GroupName 托管规则组名称，仅出参。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 托管规则组名称，仅出参。
     * @param GroupName 托管规则组名称，仅出参。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 当前托管规则组下的所有子规则信息，仅出参。 
     * @return RuleDetails 当前托管规则组下的所有子规则信息，仅出参。
     */
    public ManagedRuleDetail [] getRuleDetails() {
        return this.RuleDetails;
    }

    /**
     * Set 当前托管规则组下的所有子规则信息，仅出参。
     * @param RuleDetails 当前托管规则组下的所有子规则信息，仅出参。
     */
    public void setRuleDetails(ManagedRuleDetail [] RuleDetails) {
        this.RuleDetails = RuleDetails;
    }

    public ManagedRuleGroupMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleGroupMeta(ManagedRuleGroupMeta source) {
        if (source.GroupDetail != null) {
            this.GroupDetail = new String(source.GroupDetail);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.RuleDetails != null) {
            this.RuleDetails = new ManagedRuleDetail[source.RuleDetails.length];
            for (int i = 0; i < source.RuleDetails.length; i++) {
                this.RuleDetails[i] = new ManagedRuleDetail(source.RuleDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupDetail", this.GroupDetail);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "RuleDetails.", this.RuleDetails);

    }
}

