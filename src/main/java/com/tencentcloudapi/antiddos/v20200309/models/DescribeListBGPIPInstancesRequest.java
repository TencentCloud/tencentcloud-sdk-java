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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListBGPIPInstancesRequest extends AbstractModel{

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * IP搜索
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * 资产实例ID搜索，例如，bgpip-00000001
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * 高防IP线路搜索，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
    */
    @SerializedName("FilterLine")
    @Expose
    private Long FilterLine;

    /**
    * 地域搜索，例如，ap-guangzhou
    */
    @SerializedName("FilterRegion")
    @Expose
    private String FilterRegion;

    /**
    * 名称搜索
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * 是否只获取高防弹性公网IP实例。填写时，只能填写1或者0。当填写1时，表示返回高防弹性公网IP实例。当填写0时，表示返回非高防弹性公网IP实例。
    */
    @SerializedName("FilterEipType")
    @Expose
    private Long FilterEipType;

    /**
    * 高防弹性公网IP实例的绑定状态搜索条件，取值范围 [BINDING、 BIND、UNBINDING、UNBIND]。该搜索条件只在FilterEipType=1时才有效。
    */
    @SerializedName("FilterEipEipAddressStatus")
    @Expose
    private String [] FilterEipEipAddressStatus;

    /**
    * 是否只获取安全加速实例。填写时，只能填写1或者0。当填写1时，表示返回安全加速实例。当填写0时，表示返回非安全加速实例。
    */
    @SerializedName("FilterDamDDoSStatus")
    @Expose
    private Long FilterDamDDoSStatus;

    /**
    * 获取特定状态的资源，运行中填idle，攻击中填attacking，封堵中填blocking
    */
    @SerializedName("FilterStatus")
    @Expose
    private String FilterStatus;

    /**
    * 获取特定的实例Cname
    */
    @SerializedName("FilterCname")
    @Expose
    private String FilterCname;

    /**
    * 批量查询实例ID对应的高防IP实例资源
    */
    @SerializedName("FilterInstanceIdList")
    @Expose
    private String [] FilterInstanceIdList;

    /**
     * Get 页起始偏移，取值为(页码-1)*一页条数 
     * @return Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页起始偏移，取值为(页码-1)*一页条数
     * @param Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页条数，当Limit=0时，默认一页条数为20;最大取值为100 
     * @return Limit 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     * @param Limit 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get IP搜索 
     * @return FilterIp IP搜索
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP搜索
     * @param FilterIp IP搜索
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get 资产实例ID搜索，例如，bgpip-00000001 
     * @return FilterInstanceId 资产实例ID搜索，例如，bgpip-00000001
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set 资产实例ID搜索，例如，bgpip-00000001
     * @param FilterInstanceId 资产实例ID搜索，例如，bgpip-00000001
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get 高防IP线路搜索，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
] 
     * @return FilterLine 高防IP线路搜索，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
     */
    public Long getFilterLine() {
        return this.FilterLine;
    }

    /**
     * Set 高防IP线路搜索，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
     * @param FilterLine 高防IP线路搜索，取值为[
1：BGP线路
2：电信
3：联通
4：移动
99：第三方合作线路
]
     */
    public void setFilterLine(Long FilterLine) {
        this.FilterLine = FilterLine;
    }

    /**
     * Get 地域搜索，例如，ap-guangzhou 
     * @return FilterRegion 地域搜索，例如，ap-guangzhou
     */
    public String getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set 地域搜索，例如，ap-guangzhou
     * @param FilterRegion 地域搜索，例如，ap-guangzhou
     */
    public void setFilterRegion(String FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get 名称搜索 
     * @return FilterName 名称搜索
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set 名称搜索
     * @param FilterName 名称搜索
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get 是否只获取高防弹性公网IP实例。填写时，只能填写1或者0。当填写1时，表示返回高防弹性公网IP实例。当填写0时，表示返回非高防弹性公网IP实例。 
     * @return FilterEipType 是否只获取高防弹性公网IP实例。填写时，只能填写1或者0。当填写1时，表示返回高防弹性公网IP实例。当填写0时，表示返回非高防弹性公网IP实例。
     */
    public Long getFilterEipType() {
        return this.FilterEipType;
    }

    /**
     * Set 是否只获取高防弹性公网IP实例。填写时，只能填写1或者0。当填写1时，表示返回高防弹性公网IP实例。当填写0时，表示返回非高防弹性公网IP实例。
     * @param FilterEipType 是否只获取高防弹性公网IP实例。填写时，只能填写1或者0。当填写1时，表示返回高防弹性公网IP实例。当填写0时，表示返回非高防弹性公网IP实例。
     */
    public void setFilterEipType(Long FilterEipType) {
        this.FilterEipType = FilterEipType;
    }

    /**
     * Get 高防弹性公网IP实例的绑定状态搜索条件，取值范围 [BINDING、 BIND、UNBINDING、UNBIND]。该搜索条件只在FilterEipType=1时才有效。 
     * @return FilterEipEipAddressStatus 高防弹性公网IP实例的绑定状态搜索条件，取值范围 [BINDING、 BIND、UNBINDING、UNBIND]。该搜索条件只在FilterEipType=1时才有效。
     */
    public String [] getFilterEipEipAddressStatus() {
        return this.FilterEipEipAddressStatus;
    }

    /**
     * Set 高防弹性公网IP实例的绑定状态搜索条件，取值范围 [BINDING、 BIND、UNBINDING、UNBIND]。该搜索条件只在FilterEipType=1时才有效。
     * @param FilterEipEipAddressStatus 高防弹性公网IP实例的绑定状态搜索条件，取值范围 [BINDING、 BIND、UNBINDING、UNBIND]。该搜索条件只在FilterEipType=1时才有效。
     */
    public void setFilterEipEipAddressStatus(String [] FilterEipEipAddressStatus) {
        this.FilterEipEipAddressStatus = FilterEipEipAddressStatus;
    }

    /**
     * Get 是否只获取安全加速实例。填写时，只能填写1或者0。当填写1时，表示返回安全加速实例。当填写0时，表示返回非安全加速实例。 
     * @return FilterDamDDoSStatus 是否只获取安全加速实例。填写时，只能填写1或者0。当填写1时，表示返回安全加速实例。当填写0时，表示返回非安全加速实例。
     */
    public Long getFilterDamDDoSStatus() {
        return this.FilterDamDDoSStatus;
    }

    /**
     * Set 是否只获取安全加速实例。填写时，只能填写1或者0。当填写1时，表示返回安全加速实例。当填写0时，表示返回非安全加速实例。
     * @param FilterDamDDoSStatus 是否只获取安全加速实例。填写时，只能填写1或者0。当填写1时，表示返回安全加速实例。当填写0时，表示返回非安全加速实例。
     */
    public void setFilterDamDDoSStatus(Long FilterDamDDoSStatus) {
        this.FilterDamDDoSStatus = FilterDamDDoSStatus;
    }

    /**
     * Get 获取特定状态的资源，运行中填idle，攻击中填attacking，封堵中填blocking 
     * @return FilterStatus 获取特定状态的资源，运行中填idle，攻击中填attacking，封堵中填blocking
     */
    public String getFilterStatus() {
        return this.FilterStatus;
    }

    /**
     * Set 获取特定状态的资源，运行中填idle，攻击中填attacking，封堵中填blocking
     * @param FilterStatus 获取特定状态的资源，运行中填idle，攻击中填attacking，封堵中填blocking
     */
    public void setFilterStatus(String FilterStatus) {
        this.FilterStatus = FilterStatus;
    }

    /**
     * Get 获取特定的实例Cname 
     * @return FilterCname 获取特定的实例Cname
     */
    public String getFilterCname() {
        return this.FilterCname;
    }

    /**
     * Set 获取特定的实例Cname
     * @param FilterCname 获取特定的实例Cname
     */
    public void setFilterCname(String FilterCname) {
        this.FilterCname = FilterCname;
    }

    /**
     * Get 批量查询实例ID对应的高防IP实例资源 
     * @return FilterInstanceIdList 批量查询实例ID对应的高防IP实例资源
     */
    public String [] getFilterInstanceIdList() {
        return this.FilterInstanceIdList;
    }

    /**
     * Set 批量查询实例ID对应的高防IP实例资源
     * @param FilterInstanceIdList 批量查询实例ID对应的高防IP实例资源
     */
    public void setFilterInstanceIdList(String [] FilterInstanceIdList) {
        this.FilterInstanceIdList = FilterInstanceIdList;
    }

    public DescribeListBGPIPInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListBGPIPInstancesRequest(DescribeListBGPIPInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterLine != null) {
            this.FilterLine = new Long(source.FilterLine);
        }
        if (source.FilterRegion != null) {
            this.FilterRegion = new String(source.FilterRegion);
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterEipType != null) {
            this.FilterEipType = new Long(source.FilterEipType);
        }
        if (source.FilterEipEipAddressStatus != null) {
            this.FilterEipEipAddressStatus = new String[source.FilterEipEipAddressStatus.length];
            for (int i = 0; i < source.FilterEipEipAddressStatus.length; i++) {
                this.FilterEipEipAddressStatus[i] = new String(source.FilterEipEipAddressStatus[i]);
            }
        }
        if (source.FilterDamDDoSStatus != null) {
            this.FilterDamDDoSStatus = new Long(source.FilterDamDDoSStatus);
        }
        if (source.FilterStatus != null) {
            this.FilterStatus = new String(source.FilterStatus);
        }
        if (source.FilterCname != null) {
            this.FilterCname = new String(source.FilterCname);
        }
        if (source.FilterInstanceIdList != null) {
            this.FilterInstanceIdList = new String[source.FilterInstanceIdList.length];
            for (int i = 0; i < source.FilterInstanceIdList.length; i++) {
                this.FilterInstanceIdList[i] = new String(source.FilterInstanceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterLine", this.FilterLine);
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterEipType", this.FilterEipType);
        this.setParamArraySimple(map, prefix + "FilterEipEipAddressStatus.", this.FilterEipEipAddressStatus);
        this.setParamSimple(map, prefix + "FilterDamDDoSStatus", this.FilterDamDDoSStatus);
        this.setParamSimple(map, prefix + "FilterStatus", this.FilterStatus);
        this.setParamSimple(map, prefix + "FilterCname", this.FilterCname);
        this.setParamArraySimple(map, prefix + "FilterInstanceIdList.", this.FilterInstanceIdList);

    }
}

