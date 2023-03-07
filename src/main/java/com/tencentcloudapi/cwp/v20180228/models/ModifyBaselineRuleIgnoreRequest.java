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

public class ModifyBaselineRuleIgnoreRequest extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 资产类型[0:所有专业版旗舰版|1:id|2:ip]
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 关联项
    */
    @SerializedName("ItemIds")
    @Expose
    private Long [] ItemIds;

    /**
    * 主机Id
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 主机Ip
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
    * 是否全选过滤
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
    * <li>ItemName - string - 是否必填：否 - 项名称</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 资产类型[0:所有专业版旗舰版|1:id|2:ip] 
     * @return AssetType 资产类型[0:所有专业版旗舰版|1:id|2:ip]
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型[0:所有专业版旗舰版|1:id|2:ip]
     * @param AssetType 资产类型[0:所有专业版旗舰版|1:id|2:ip]
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 关联项 
     * @return ItemIds 关联项
     */
    public Long [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set 关联项
     * @param ItemIds 关联项
     */
    public void setItemIds(Long [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * Get 主机Id 
     * @return HostIds 主机Id
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 主机Id
     * @param HostIds 主机Id
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 主机Ip 
     * @return HostIps 主机Ip
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set 主机Ip
     * @param HostIps 主机Ip
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    /**
     * Get 是否全选过滤 
     * @return SelectAll 是否全选过滤
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set 是否全选过滤
     * @param SelectAll 是否全选过滤
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get <li>ItemName - string - 是否必填：否 - 项名称</li> 
     * @return Filters <li>ItemName - string - 是否必填：否 - 项名称</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>ItemName - string - 是否必填：否 - 项名称</li>
     * @param Filters <li>ItemName - string - 是否必填：否 - 项名称</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ModifyBaselineRuleIgnoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineRuleIgnoreRequest(ModifyBaselineRuleIgnoreRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
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
        if (source.HostIps != null) {
            this.HostIps = new String[source.HostIps.length];
            for (int i = 0; i < source.HostIps.length; i++) {
                this.HostIps[i] = new String(source.HostIps[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

