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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpAccessControlRequest extends AbstractModel{

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
    * 动作
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 有效时间最小时间戳
    */
    @SerializedName("VtsMin")
    @Expose
    private Long VtsMin;

    /**
    * 有效时间最大时间戳
    */
    @SerializedName("VtsMax")
    @Expose
    private Long VtsMax;

    /**
    * 创建时间最小时间戳
    */
    @SerializedName("CtsMin")
    @Expose
    private Long CtsMin;

    /**
    * 创建时间最大时间戳
    */
    @SerializedName("CtsMax")
    @Expose
    private Long CtsMax;

    /**
    * 偏移
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
    * 限制
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
    * ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

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
     * Get 动作 
     * @return ActionType 动作
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作
     * @param ActionType 动作
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 有效时间最小时间戳 
     * @return VtsMin 有效时间最小时间戳
     */
    public Long getVtsMin() {
        return this.VtsMin;
    }

    /**
     * Set 有效时间最小时间戳
     * @param VtsMin 有效时间最小时间戳
     */
    public void setVtsMin(Long VtsMin) {
        this.VtsMin = VtsMin;
    }

    /**
     * Get 有效时间最大时间戳 
     * @return VtsMax 有效时间最大时间戳
     */
    public Long getVtsMax() {
        return this.VtsMax;
    }

    /**
     * Set 有效时间最大时间戳
     * @param VtsMax 有效时间最大时间戳
     */
    public void setVtsMax(Long VtsMax) {
        this.VtsMax = VtsMax;
    }

    /**
     * Get 创建时间最小时间戳 
     * @return CtsMin 创建时间最小时间戳
     */
    public Long getCtsMin() {
        return this.CtsMin;
    }

    /**
     * Set 创建时间最小时间戳
     * @param CtsMin 创建时间最小时间戳
     */
    public void setCtsMin(Long CtsMin) {
        this.CtsMin = CtsMin;
    }

    /**
     * Get 创建时间最大时间戳 
     * @return CtsMax 创建时间最大时间戳
     */
    public Long getCtsMax() {
        return this.CtsMax;
    }

    /**
     * Set 创建时间最大时间戳
     * @param CtsMax 创建时间最大时间戳
     */
    public void setCtsMax(Long CtsMax) {
        this.CtsMax = CtsMax;
    }

    /**
     * Get 偏移 
     * @return OffSet 偏移
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set 偏移
     * @param OffSet 偏移
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    /**
     * Get 限制 
     * @return Limit 限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制
     * @param Limit 限制
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
     * Get ip 
     * @return Ip ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip
     * @param Ip ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
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

    }
}

