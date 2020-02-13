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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceListRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 地域码搜索，可选，当不指定地域时空数组，当指定地域时，填地域码。例如：["gz", "sh"]
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * 线路搜索，可选，只有当获取高防IP资源列表是可以选填，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]，当获取其他产品时请填空数组；
    */
    @SerializedName("Line")
    @Expose
    private Long [] Line;

    /**
    * 资源ID搜索，可选，当不为空数组时表示获取指定资源的资源列表；
    */
    @SerializedName("IdList")
    @Expose
    private String [] IdList;

    /**
    * 资源名称搜索，可选，当不为空字符串时表示按名称搜索资源；
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IP搜索列表，可选，当不为空时表示安装IP搜索资源；
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 资源状态搜索列表，可选，取值为[0（运行中）, 1（清洗中）, 2（封堵中）]，当填空数组时不进行状态搜索；
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 即将到期搜索；可选，取值为[0（不搜索），1（搜索即将到期的资源）]
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * 排序字段，可选
    */
    @SerializedName("OderBy")
    @Expose
    private OrderBy [] OderBy;

    /**
    * 一页条数，填0表示不分页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 高防IP专业版资源的CNAME，可选，只对高防IP专业版资源列表有效；
    */
    @SerializedName("CName")
    @Expose
    private String CName;

    /**
    * 高防IP专业版资源的域名，可选，只对高防IP专业版资源列表有效；
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 地域码搜索，可选，当不指定地域时空数组，当指定地域时，填地域码。例如：["gz", "sh"] 
     * @return RegionList 地域码搜索，可选，当不指定地域时空数组，当指定地域时，填地域码。例如：["gz", "sh"]
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域码搜索，可选，当不指定地域时空数组，当指定地域时，填地域码。例如：["gz", "sh"]
     * @param RegionList 地域码搜索，可选，当不指定地域时空数组，当指定地域时，填地域码。例如：["gz", "sh"]
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get 线路搜索，可选，只有当获取高防IP资源列表是可以选填，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]，当获取其他产品时请填空数组； 
     * @return Line 线路搜索，可选，只有当获取高防IP资源列表是可以选填，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]，当获取其他产品时请填空数组；
     */
    public Long [] getLine() {
        return this.Line;
    }

    /**
     * Set 线路搜索，可选，只有当获取高防IP资源列表是可以选填，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]，当获取其他产品时请填空数组；
     * @param Line 线路搜索，可选，只有当获取高防IP资源列表是可以选填，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]，当获取其他产品时请填空数组；
     */
    public void setLine(Long [] Line) {
        this.Line = Line;
    }

    /**
     * Get 资源ID搜索，可选，当不为空数组时表示获取指定资源的资源列表； 
     * @return IdList 资源ID搜索，可选，当不为空数组时表示获取指定资源的资源列表；
     */
    public String [] getIdList() {
        return this.IdList;
    }

    /**
     * Set 资源ID搜索，可选，当不为空数组时表示获取指定资源的资源列表；
     * @param IdList 资源ID搜索，可选，当不为空数组时表示获取指定资源的资源列表；
     */
    public void setIdList(String [] IdList) {
        this.IdList = IdList;
    }

    /**
     * Get 资源名称搜索，可选，当不为空字符串时表示按名称搜索资源； 
     * @return Name 资源名称搜索，可选，当不为空字符串时表示按名称搜索资源；
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称搜索，可选，当不为空字符串时表示按名称搜索资源；
     * @param Name 资源名称搜索，可选，当不为空字符串时表示按名称搜索资源；
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IP搜索列表，可选，当不为空时表示安装IP搜索资源； 
     * @return IpList IP搜索列表，可选，当不为空时表示安装IP搜索资源；
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP搜索列表，可选，当不为空时表示安装IP搜索资源；
     * @param IpList IP搜索列表，可选，当不为空时表示安装IP搜索资源；
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 资源状态搜索列表，可选，取值为[0（运行中）, 1（清洗中）, 2（封堵中）]，当填空数组时不进行状态搜索； 
     * @return Status 资源状态搜索列表，可选，取值为[0（运行中）, 1（清洗中）, 2（封堵中）]，当填空数组时不进行状态搜索；
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态搜索列表，可选，取值为[0（运行中）, 1（清洗中）, 2（封堵中）]，当填空数组时不进行状态搜索；
     * @param Status 资源状态搜索列表，可选，取值为[0（运行中）, 1（清洗中）, 2（封堵中）]，当填空数组时不进行状态搜索；
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 即将到期搜索；可选，取值为[0（不搜索），1（搜索即将到期的资源）] 
     * @return Expire 即将到期搜索；可选，取值为[0（不搜索），1（搜索即将到期的资源）]
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 即将到期搜索；可选，取值为[0（不搜索），1（搜索即将到期的资源）]
     * @param Expire 即将到期搜索；可选，取值为[0（不搜索），1（搜索即将到期的资源）]
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get 排序字段，可选 
     * @return OderBy 排序字段，可选
     */
    public OrderBy [] getOderBy() {
        return this.OderBy;
    }

    /**
     * Set 排序字段，可选
     * @param OderBy 排序字段，可选
     */
    public void setOderBy(OrderBy [] OderBy) {
        this.OderBy = OderBy;
    }

    /**
     * Get 一页条数，填0表示不分页 
     * @return Limit 一页条数，填0表示不分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，填0表示不分页
     * @param Limit 一页条数，填0表示不分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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
     * Get 高防IP专业版资源的CNAME，可选，只对高防IP专业版资源列表有效； 
     * @return CName 高防IP专业版资源的CNAME，可选，只对高防IP专业版资源列表有效；
     */
    public String getCName() {
        return this.CName;
    }

    /**
     * Set 高防IP专业版资源的CNAME，可选，只对高防IP专业版资源列表有效；
     * @param CName 高防IP专业版资源的CNAME，可选，只对高防IP专业版资源列表有效；
     */
    public void setCName(String CName) {
        this.CName = CName;
    }

    /**
     * Get 高防IP专业版资源的域名，可选，只对高防IP专业版资源列表有效； 
     * @return Domain 高防IP专业版资源的域名，可选，只对高防IP专业版资源列表有效；
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 高防IP专业版资源的域名，可选，只对高防IP专业版资源列表有效；
     * @param Domain 高防IP专业版资源的域名，可选，只对高防IP专业版资源列表有效；
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamArraySimple(map, prefix + "Line.", this.Line);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamArrayObj(map, prefix + "OderBy.", this.OderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CName", this.CName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

