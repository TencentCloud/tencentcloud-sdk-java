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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpAccessControlRequest extends AbstractModel {

    /**
    * <p>域名，当操作对象为全局规则时，Domain参数应填写为&quot;global&quot;</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>计数标识</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>动作，40表示查询白名单，42表示查询黑名单</p>
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * <p>最小有效时间的时间戳</p>
    */
    @SerializedName("VtsMin")
    @Expose
    private Long VtsMin;

    /**
    * <p>最大有效时间的时间戳</p>
    */
    @SerializedName("VtsMax")
    @Expose
    private Long VtsMax;

    /**
    * <p>最小创建时间的时间戳</p>
    */
    @SerializedName("CtsMin")
    @Expose
    private Long CtsMin;

    /**
    * <p>最大创建时间的时间戳</p>
    */
    @SerializedName("CtsMax")
    @Expose
    private Long CtsMax;

    /**
    * <p>分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整</p>
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
    * <p>每页返回的数量，默认为20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>用于按数据来源过滤黑白名单记录，非必填（默认为空字符串，表示不过滤/查询全部）。 &quot;&quot; (空字符串)    ，不按来源过滤，返回所有记录（默认值） custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护    ），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则 batch-group（防护对象组），防护对象组维度添加的黑白名单规则</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>排序参数</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>生效状态，1表示生效中，2表示过期，0表示全部</p>
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * <p>最小有效时间的时间戳</p>
    */
    @SerializedName("ValidTimeStampMin")
    @Expose
    private String ValidTimeStampMin;

    /**
    * <p>最大有效时间的时间戳</p>
    */
    @SerializedName("ValidTimeStampMax")
    @Expose
    private String ValidTimeStampMax;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>0表示全部，1表示永久生效，2表示定时生效，3表示周粒度生效，4表示月粒度生效</p>
    */
    @SerializedName("TimerType")
    @Expose
    private Long TimerType;

    /**
    * <p>查询的ip列表</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get <p>域名，当操作对象为全局规则时，Domain参数应填写为&quot;global&quot;</p> 
     * @return Domain <p>域名，当操作对象为全局规则时，Domain参数应填写为&quot;global&quot;</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名，当操作对象为全局规则时，Domain参数应填写为&quot;global&quot;</p>
     * @param Domain <p>域名，当操作对象为全局规则时，Domain参数应填写为&quot;global&quot;</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>计数标识</p> 
     * @return Count <p>计数标识</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>计数标识</p>
     * @param Count <p>计数标识</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>动作，40表示查询白名单，42表示查询黑名单</p> 
     * @return ActionType <p>动作，40表示查询白名单，42表示查询黑名单</p>
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>动作，40表示查询白名单，42表示查询黑名单</p>
     * @param ActionType <p>动作，40表示查询白名单，42表示查询黑名单</p>
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>最小有效时间的时间戳</p> 
     * @return VtsMin <p>最小有效时间的时间戳</p>
     * @deprecated
     */
    @Deprecated
    public Long getVtsMin() {
        return this.VtsMin;
    }

    /**
     * Set <p>最小有效时间的时间戳</p>
     * @param VtsMin <p>最小有效时间的时间戳</p>
     * @deprecated
     */
    @Deprecated
    public void setVtsMin(Long VtsMin) {
        this.VtsMin = VtsMin;
    }

    /**
     * Get <p>最大有效时间的时间戳</p> 
     * @return VtsMax <p>最大有效时间的时间戳</p>
     * @deprecated
     */
    @Deprecated
    public Long getVtsMax() {
        return this.VtsMax;
    }

    /**
     * Set <p>最大有效时间的时间戳</p>
     * @param VtsMax <p>最大有效时间的时间戳</p>
     * @deprecated
     */
    @Deprecated
    public void setVtsMax(Long VtsMax) {
        this.VtsMax = VtsMax;
    }

    /**
     * Get <p>最小创建时间的时间戳</p> 
     * @return CtsMin <p>最小创建时间的时间戳</p>
     */
    public Long getCtsMin() {
        return this.CtsMin;
    }

    /**
     * Set <p>最小创建时间的时间戳</p>
     * @param CtsMin <p>最小创建时间的时间戳</p>
     */
    public void setCtsMin(Long CtsMin) {
        this.CtsMin = CtsMin;
    }

    /**
     * Get <p>最大创建时间的时间戳</p> 
     * @return CtsMax <p>最大创建时间的时间戳</p>
     */
    public Long getCtsMax() {
        return this.CtsMax;
    }

    /**
     * Set <p>最大创建时间的时间戳</p>
     * @param CtsMax <p>最大创建时间的时间戳</p>
     */
    public void setCtsMax(Long CtsMax) {
        this.CtsMax = CtsMax;
    }

    /**
     * Get <p>分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整</p> 
     * @return OffSet <p>分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整</p>
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set <p>分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整</p>
     * @param OffSet <p>分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整</p>
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    /**
     * Get <p>每页返回的数量，默认为20</p> 
     * @return Limit <p>每页返回的数量，默认为20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回的数量，默认为20</p>
     * @param Limit <p>每页返回的数量，默认为20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>用于按数据来源过滤黑白名单记录，非必填（默认为空字符串，表示不过滤/查询全部）。 &quot;&quot; (空字符串)    ，不按来源过滤，返回所有记录（默认值） custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护    ），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则 batch-group（防护对象组），防护对象组维度添加的黑白名单规则</p> 
     * @return Source <p>用于按数据来源过滤黑白名单记录，非必填（默认为空字符串，表示不过滤/查询全部）。 &quot;&quot; (空字符串)    ，不按来源过滤，返回所有记录（默认值） custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护    ），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则 batch-group（防护对象组），防护对象组维度添加的黑白名单规则</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>用于按数据来源过滤黑白名单记录，非必填（默认为空字符串，表示不过滤/查询全部）。 &quot;&quot; (空字符串)    ，不按来源过滤，返回所有记录（默认值） custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护    ），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则 batch-group（防护对象组），防护对象组维度添加的黑白名单规则</p>
     * @param Source <p>用于按数据来源过滤黑白名单记录，非必填（默认为空字符串，表示不过滤/查询全部）。 &quot;&quot; (空字符串)    ，不按来源过滤，返回所有记录（默认值） custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护    ），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则 batch-group（防护对象组），防护对象组维度添加的黑白名单规则</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>排序参数</p> 
     * @return Sort <p>排序参数</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序参数</p>
     * @param Sort <p>排序参数</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>IP</p> 
     * @return Ip <p>IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP</p>
     * @param Ip <p>IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>生效状态，1表示生效中，2表示过期，0表示全部</p> 
     * @return ValidStatus <p>生效状态，1表示生效中，2表示过期，0表示全部</p>
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set <p>生效状态，1表示生效中，2表示过期，0表示全部</p>
     * @param ValidStatus <p>生效状态，1表示生效中，2表示过期，0表示全部</p>
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get <p>最小有效时间的时间戳</p> 
     * @return ValidTimeStampMin <p>最小有效时间的时间戳</p>
     */
    public String getValidTimeStampMin() {
        return this.ValidTimeStampMin;
    }

    /**
     * Set <p>最小有效时间的时间戳</p>
     * @param ValidTimeStampMin <p>最小有效时间的时间戳</p>
     */
    public void setValidTimeStampMin(String ValidTimeStampMin) {
        this.ValidTimeStampMin = ValidTimeStampMin;
    }

    /**
     * Get <p>最大有效时间的时间戳</p> 
     * @return ValidTimeStampMax <p>最大有效时间的时间戳</p>
     */
    public String getValidTimeStampMax() {
        return this.ValidTimeStampMax;
    }

    /**
     * Set <p>最大有效时间的时间戳</p>
     * @param ValidTimeStampMax <p>最大有效时间的时间戳</p>
     */
    public void setValidTimeStampMax(String ValidTimeStampMax) {
        this.ValidTimeStampMax = ValidTimeStampMax;
    }

    /**
     * Get <p>规则ID</p> 
     * @return RuleId <p>规则ID</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleId <p>规则ID</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>0表示全部，1表示永久生效，2表示定时生效，3表示周粒度生效，4表示月粒度生效</p> 
     * @return TimerType <p>0表示全部，1表示永久生效，2表示定时生效，3表示周粒度生效，4表示月粒度生效</p>
     */
    public Long getTimerType() {
        return this.TimerType;
    }

    /**
     * Set <p>0表示全部，1表示永久生效，2表示定时生效，3表示周粒度生效，4表示月粒度生效</p>
     * @param TimerType <p>0表示全部，1表示永久生效，2表示定时生效，3表示周粒度生效，4表示月粒度生效</p>
     */
    public void setTimerType(Long TimerType) {
        this.TimerType = TimerType;
    }

    /**
     * Get <p>查询的ip列表</p> 
     * @return IpList <p>查询的ip列表</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>查询的ip列表</p>
     * @param IpList <p>查询的ip列表</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
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
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

