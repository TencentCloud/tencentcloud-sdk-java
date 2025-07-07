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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindRuleRealServersRequest extends AbstractModel {

    /**
    * 转发规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 需要绑定的源站信息列表。
如果已经存在绑定的源站，则会覆盖更新成这个源站列表。
当不带该字段时，表示解绑该规则上的所有源站。
如果该规则的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
    */
    @SerializedName("RealServerBindSet")
    @Expose
    private RealServerBindSetReq [] RealServerBindSet;

    /**
     * Get 转发规则ID 
     * @return RuleId 转发规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则ID
     * @param RuleId 转发规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 需要绑定的源站信息列表。
如果已经存在绑定的源站，则会覆盖更新成这个源站列表。
当不带该字段时，表示解绑该规则上的所有源站。
如果该规则的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。 
     * @return RealServerBindSet 需要绑定的源站信息列表。
如果已经存在绑定的源站，则会覆盖更新成这个源站列表。
当不带该字段时，表示解绑该规则上的所有源站。
如果该规则的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
     */
    public RealServerBindSetReq [] getRealServerBindSet() {
        return this.RealServerBindSet;
    }

    /**
     * Set 需要绑定的源站信息列表。
如果已经存在绑定的源站，则会覆盖更新成这个源站列表。
当不带该字段时，表示解绑该规则上的所有源站。
如果该规则的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
     * @param RealServerBindSet 需要绑定的源站信息列表。
如果已经存在绑定的源站，则会覆盖更新成这个源站列表。
当不带该字段时，表示解绑该规则上的所有源站。
如果该规则的源站调度策略是加权轮询，需要填写源站权重 RealServerWeight, 不填或者其他调度类型默认源站权重为1。
     */
    public void setRealServerBindSet(RealServerBindSetReq [] RealServerBindSet) {
        this.RealServerBindSet = RealServerBindSet;
    }

    public BindRuleRealServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindRuleRealServersRequest(BindRuleRealServersRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RealServerBindSet != null) {
            this.RealServerBindSet = new RealServerBindSetReq[source.RealServerBindSet.length];
            for (int i = 0; i < source.RealServerBindSet.length; i++) {
                this.RealServerBindSet[i] = new RealServerBindSetReq(source.RealServerBindSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "RealServerBindSet.", this.RealServerBindSet);

    }
}

