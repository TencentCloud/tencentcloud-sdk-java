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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineDetectParam extends AbstractModel{

    /**
    * 检测的策略集合
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * 检测的规则集合
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * 检测项集合
    */
    @SerializedName("ItemIds")
    @Expose
    private Long [] ItemIds;

    /**
    * 检测的主机ID集合
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
     * Get 检测的策略集合 
     * @return PolicyIds 检测的策略集合
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 检测的策略集合
     * @param PolicyIds 检测的策略集合
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 检测的规则集合 
     * @return RuleIds 检测的规则集合
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 检测的规则集合
     * @param RuleIds 检测的规则集合
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 检测项集合 
     * @return ItemIds 检测项集合
     */
    public Long [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set 检测项集合
     * @param ItemIds 检测项集合
     */
    public void setItemIds(Long [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * Get 检测的主机ID集合 
     * @return HostIds 检测的主机ID集合
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 检测的主机ID集合
     * @param HostIds 检测的主机ID集合
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    public BaselineDetectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineDetectParam(BaselineDetectParam source) {
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.ItemIds != null) {
            this.ItemIds = new Long[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new Long(source.ItemIds[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);

    }
}

