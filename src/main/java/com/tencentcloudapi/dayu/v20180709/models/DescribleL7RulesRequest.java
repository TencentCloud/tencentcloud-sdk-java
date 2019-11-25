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

public class DescribleL7RulesRequest  extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 规则ID，可选参数，填写后获取指定的规则
    */
    @SerializedName("RuleIdList")
    @Expose
    private String [] RuleIdList;

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
    * 域名搜索，选填，当需要搜索域名请填写
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发协议搜索，选填，取值[http, https, http/https]
    */
    @SerializedName("ProtocolList")
    @Expose
    private String [] ProtocolList;

    /**
    * 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
    */
    @SerializedName("StatusList")
    @Expose
    private Long [] StatusList;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取规则ID，可选参数，填写后获取指定的规则
     * @return RuleIdList 规则ID，可选参数，填写后获取指定的规则
     */
    public String [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * 设置规则ID，可选参数，填写后获取指定的规则
     * @param RuleIdList 规则ID，可选参数，填写后获取指定的规则
     */
    public void setRuleIdList(String [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * 获取一页条数，填0表示不分页
     * @return Limit 一页条数，填0表示不分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置一页条数，填0表示不分页
     * @param Limit 一页条数，填0表示不分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取页起始偏移，取值为(页码-1)*一页条数
     * @return Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置页起始偏移，取值为(页码-1)*一页条数
     * @param Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取域名搜索，选填，当需要搜索域名请填写
     * @return Domain 域名搜索，选填，当需要搜索域名请填写
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置域名搜索，选填，当需要搜索域名请填写
     * @param Domain 域名搜索，选填，当需要搜索域名请填写
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取转发协议搜索，选填，取值[http, https, http/https]
     * @return ProtocolList 转发协议搜索，选填，取值[http, https, http/https]
     */
    public String [] getProtocolList() {
        return this.ProtocolList;
    }

    /**
     * 设置转发协议搜索，选填，取值[http, https, http/https]
     * @param ProtocolList 转发协议搜索，选填，取值[http, https, http/https]
     */
    public void setProtocolList(String [] ProtocolList) {
        this.ProtocolList = ProtocolList;
    }

    /**
     * 获取状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     * @return StatusList 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public Long [] getStatusList() {
        return this.StatusList;
    }

    /**
     * 设置状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     * @param StatusList 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public void setStatusList(Long [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ProtocolList.", this.ProtocolList);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}

