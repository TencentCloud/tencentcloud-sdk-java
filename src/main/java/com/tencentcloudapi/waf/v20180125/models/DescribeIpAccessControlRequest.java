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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpAccessControlRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 计数标识
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 动作，40表示查询白名单，42表示查询黑名单
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 最小有效时间的时间戳
    */
    @SerializedName("VtsMin")
    @Expose
    private Long VtsMin;

    /**
    * 最大有效时间的时间戳
    */
    @SerializedName("VtsMax")
    @Expose
    private Long VtsMax;

    /**
    * 最小创建时间的时间戳
    */
    @SerializedName("CtsMin")
    @Expose
    private Long CtsMin;

    /**
    * 最大创建时间的时间戳
    */
    @SerializedName("CtsMax")
    @Expose
    private Long CtsMax;

    /**
    * 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
    * 每页返回的数量，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 排序参数
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 生效状态
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * 最小有效时间的时间戳
    */
    @SerializedName("ValidTimeStampMin")
    @Expose
    private String ValidTimeStampMin;

    /**
    * 最大有效时间的时间戳
    */
    @SerializedName("ValidTimeStampMax")
    @Expose
    private String ValidTimeStampMax;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 定时任务类型筛选0 1 2 3 4
    */
    @SerializedName("TimerType")
    @Expose
    private Long TimerType;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 计数标识 
     * @return Count 计数标识
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 计数标识
     * @param Count 计数标识
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 动作，40表示查询白名单，42表示查询黑名单 
     * @return ActionType 动作，40表示查询白名单，42表示查询黑名单
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作，40表示查询白名单，42表示查询黑名单
     * @param ActionType 动作，40表示查询白名单，42表示查询黑名单
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 最小有效时间的时间戳 
     * @return VtsMin 最小有效时间的时间戳
     * @deprecated
     */
    @Deprecated
    public Long getVtsMin() {
        return this.VtsMin;
    }

    /**
     * Set 最小有效时间的时间戳
     * @param VtsMin 最小有效时间的时间戳
     * @deprecated
     */
    @Deprecated
    public void setVtsMin(Long VtsMin) {
        this.VtsMin = VtsMin;
    }

    /**
     * Get 最大有效时间的时间戳 
     * @return VtsMax 最大有效时间的时间戳
     * @deprecated
     */
    @Deprecated
    public Long getVtsMax() {
        return this.VtsMax;
    }

    /**
     * Set 最大有效时间的时间戳
     * @param VtsMax 最大有效时间的时间戳
     * @deprecated
     */
    @Deprecated
    public void setVtsMax(Long VtsMax) {
        this.VtsMax = VtsMax;
    }

    /**
     * Get 最小创建时间的时间戳 
     * @return CtsMin 最小创建时间的时间戳
     */
    public Long getCtsMin() {
        return this.CtsMin;
    }

    /**
     * Set 最小创建时间的时间戳
     * @param CtsMin 最小创建时间的时间戳
     */
    public void setCtsMin(Long CtsMin) {
        this.CtsMin = CtsMin;
    }

    /**
     * Get 最大创建时间的时间戳 
     * @return CtsMax 最大创建时间的时间戳
     */
    public Long getCtsMax() {
        return this.CtsMax;
    }

    /**
     * Set 最大创建时间的时间戳
     * @param CtsMax 最大创建时间的时间戳
     */
    public void setCtsMax(Long CtsMax) {
        this.CtsMax = CtsMax;
    }

    /**
     * Get 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整 
     * @return OffSet 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
     * @param OffSet 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    /**
     * Get 每页返回的数量，默认为20 
     * @return Limit 每页返回的数量，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回的数量，默认为20
     * @param Limit 每页返回的数量，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 排序参数 
     * @return Sort 排序参数
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序参数
     * @param Sort 排序参数
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 生效状态 
     * @return ValidStatus 生效状态
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 生效状态
     * @param ValidStatus 生效状态
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get 最小有效时间的时间戳 
     * @return ValidTimeStampMin 最小有效时间的时间戳
     */
    public String getValidTimeStampMin() {
        return this.ValidTimeStampMin;
    }

    /**
     * Set 最小有效时间的时间戳
     * @param ValidTimeStampMin 最小有效时间的时间戳
     */
    public void setValidTimeStampMin(String ValidTimeStampMin) {
        this.ValidTimeStampMin = ValidTimeStampMin;
    }

    /**
     * Get 最大有效时间的时间戳 
     * @return ValidTimeStampMax 最大有效时间的时间戳
     */
    public String getValidTimeStampMax() {
        return this.ValidTimeStampMax;
    }

    /**
     * Set 最大有效时间的时间戳
     * @param ValidTimeStampMax 最大有效时间的时间戳
     */
    public void setValidTimeStampMax(String ValidTimeStampMax) {
        this.ValidTimeStampMax = ValidTimeStampMax;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 定时任务类型筛选0 1 2 3 4 
     * @return TimerType 定时任务类型筛选0 1 2 3 4
     */
    public Long getTimerType() {
        return this.TimerType;
    }

    /**
     * Set 定时任务类型筛选0 1 2 3 4
     * @param TimerType 定时任务类型筛选0 1 2 3 4
     */
    public void setTimerType(Long TimerType) {
        this.TimerType = TimerType;
    }

    public DescribeIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpAccessControlRequest(DescribeIpAccessControlRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.VtsMin != null) {
            this.VtsMin = new Long(source.VtsMin);
        }
        if (source.VtsMax != null) {
            this.VtsMax = new Long(source.VtsMax);
        }
        if (source.CtsMin != null) {
            this.CtsMin = new Long(source.CtsMin);
        }
        if (source.CtsMax != null) {
            this.CtsMax = new Long(source.CtsMax);
        }
        if (source.OffSet != null) {
            this.OffSet = new Long(source.OffSet);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.ValidTimeStampMin != null) {
            this.ValidTimeStampMin = new String(source.ValidTimeStampMin);
        }
        if (source.ValidTimeStampMax != null) {
            this.ValidTimeStampMax = new String(source.ValidTimeStampMax);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.TimerType != null) {
            this.TimerType = new Long(source.TimerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "VtsMin", this.VtsMin);
        this.setParamSimple(map, prefix + "VtsMax", this.VtsMax);
        this.setParamSimple(map, prefix + "CtsMin", this.CtsMin);
        this.setParamSimple(map, prefix + "CtsMax", this.CtsMax);
        this.setParamSimple(map, prefix + "OffSet", this.OffSet);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "ValidTimeStampMin", this.ValidTimeStampMin);
        this.setParamSimple(map, prefix + "ValidTimeStampMax", this.ValidTimeStampMax);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TimerType", this.TimerType);

    }
}

