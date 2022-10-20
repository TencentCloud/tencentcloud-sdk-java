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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEditImageAutoAuthorizedRuleRequest extends AbstractModel{

    /**
    * 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * 每天最大的镜像授权数限制, 0表示无限制
    */
    @SerializedName("MaxDailyCount")
    @Expose
    private Long MaxDailyCount;

    /**
    * 规则是否生效，0:不生效，1:已生效
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 自选主机id，当授权范围为MANUAL:自选主机时且HostIdFilters为空时，必填
    */
    @SerializedName("HostIdSet")
    @Expose
    private String [] HostIdSet;

    /**
    * 规则id，在编辑时，必填
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 根据条件过滤，当授权范围为MANUAL:自选主机时且HostIdSet为空时，必填
    */
    @SerializedName("HostIdFilters")
    @Expose
    private AssetFilters [] HostIdFilters;

    /**
    * 根据条件过滤而且排除指定主机id
    */
    @SerializedName("ExcludeHostIdSet")
    @Expose
    private String [] ExcludeHostIdSet;

    /**
     * Get 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像 
     * @return RangeType 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
     * @param RangeType 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get 每天最大的镜像授权数限制, 0表示无限制 
     * @return MaxDailyCount 每天最大的镜像授权数限制, 0表示无限制
     */
    public Long getMaxDailyCount() {
        return this.MaxDailyCount;
    }

    /**
     * Set 每天最大的镜像授权数限制, 0表示无限制
     * @param MaxDailyCount 每天最大的镜像授权数限制, 0表示无限制
     */
    public void setMaxDailyCount(Long MaxDailyCount) {
        this.MaxDailyCount = MaxDailyCount;
    }

    /**
     * Get 规则是否生效，0:不生效，1:已生效 
     * @return IsEnabled 规则是否生效，0:不生效，1:已生效
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 规则是否生效，0:不生效，1:已生效
     * @param IsEnabled 规则是否生效，0:不生效，1:已生效
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 自选主机id，当授权范围为MANUAL:自选主机时且HostIdFilters为空时，必填 
     * @return HostIdSet 自选主机id，当授权范围为MANUAL:自选主机时且HostIdFilters为空时，必填
     */
    public String [] getHostIdSet() {
        return this.HostIdSet;
    }

    /**
     * Set 自选主机id，当授权范围为MANUAL:自选主机时且HostIdFilters为空时，必填
     * @param HostIdSet 自选主机id，当授权范围为MANUAL:自选主机时且HostIdFilters为空时，必填
     */
    public void setHostIdSet(String [] HostIdSet) {
        this.HostIdSet = HostIdSet;
    }

    /**
     * Get 规则id，在编辑时，必填 
     * @return RuleId 规则id，在编辑时，必填
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id，在编辑时，必填
     * @param RuleId 规则id，在编辑时，必填
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 根据条件过滤，当授权范围为MANUAL:自选主机时且HostIdSet为空时，必填 
     * @return HostIdFilters 根据条件过滤，当授权范围为MANUAL:自选主机时且HostIdSet为空时，必填
     */
    public AssetFilters [] getHostIdFilters() {
        return this.HostIdFilters;
    }

    /**
     * Set 根据条件过滤，当授权范围为MANUAL:自选主机时且HostIdSet为空时，必填
     * @param HostIdFilters 根据条件过滤，当授权范围为MANUAL:自选主机时且HostIdSet为空时，必填
     */
    public void setHostIdFilters(AssetFilters [] HostIdFilters) {
        this.HostIdFilters = HostIdFilters;
    }

    /**
     * Get 根据条件过滤而且排除指定主机id 
     * @return ExcludeHostIdSet 根据条件过滤而且排除指定主机id
     */
    public String [] getExcludeHostIdSet() {
        return this.ExcludeHostIdSet;
    }

    /**
     * Set 根据条件过滤而且排除指定主机id
     * @param ExcludeHostIdSet 根据条件过滤而且排除指定主机id
     */
    public void setExcludeHostIdSet(String [] ExcludeHostIdSet) {
        this.ExcludeHostIdSet = ExcludeHostIdSet;
    }

    public AddEditImageAutoAuthorizedRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditImageAutoAuthorizedRuleRequest(AddEditImageAutoAuthorizedRuleRequest source) {
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.MaxDailyCount != null) {
            this.MaxDailyCount = new Long(source.MaxDailyCount);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.HostIdSet != null) {
            this.HostIdSet = new String[source.HostIdSet.length];
            for (int i = 0; i < source.HostIdSet.length; i++) {
                this.HostIdSet[i] = new String(source.HostIdSet[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.HostIdFilters != null) {
            this.HostIdFilters = new AssetFilters[source.HostIdFilters.length];
            for (int i = 0; i < source.HostIdFilters.length; i++) {
                this.HostIdFilters[i] = new AssetFilters(source.HostIdFilters[i]);
            }
        }
        if (source.ExcludeHostIdSet != null) {
            this.ExcludeHostIdSet = new String[source.ExcludeHostIdSet.length];
            for (int i = 0; i < source.ExcludeHostIdSet.length; i++) {
                this.ExcludeHostIdSet[i] = new String(source.ExcludeHostIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "MaxDailyCount", this.MaxDailyCount);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamArraySimple(map, prefix + "HostIdSet.", this.HostIdSet);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "HostIdFilters.", this.HostIdFilters);
        this.setParamArraySimple(map, prefix + "ExcludeHostIdSet.", this.ExcludeHostIdSet);

    }
}

