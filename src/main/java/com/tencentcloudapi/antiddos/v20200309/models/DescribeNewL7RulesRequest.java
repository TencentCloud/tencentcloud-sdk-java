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

public class DescribeNewL7RulesRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
    */
    @SerializedName("StatusList")
    @Expose
    private Long [] StatusList;

    /**
    * 域名搜索，选填，当需要搜索域名请填写
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP搜索，选填，当需要搜索IP请填写
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

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
    * 转发协议搜索，选填，取值[http, https, http/https]
    */
    @SerializedName("ProtocolList")
    @Expose
    private String [] ProtocolList;

    /**
    * 高防IP实例的Cname
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP） 
     * @return Business 大禹子产品代号（bgpip表示高防IP）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP）
     * @param Business 大禹子产品代号（bgpip表示高防IP）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)] 
     * @return StatusList 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public Long [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     * @param StatusList 状态搜索，选填，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public void setStatusList(Long [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get 域名搜索，选填，当需要搜索域名请填写 
     * @return Domain 域名搜索，选填，当需要搜索域名请填写
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名搜索，选填，当需要搜索域名请填写
     * @param Domain 域名搜索，选填，当需要搜索域名请填写
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP搜索，选填，当需要搜索IP请填写 
     * @return Ip IP搜索，选填，当需要搜索IP请填写
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP搜索，选填，当需要搜索IP请填写
     * @param Ip IP搜索，选填，当需要搜索IP请填写
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
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
     * Get 转发协议搜索，选填，取值[http, https, http/https] 
     * @return ProtocolList 转发协议搜索，选填，取值[http, https, http/https]
     */
    public String [] getProtocolList() {
        return this.ProtocolList;
    }

    /**
     * Set 转发协议搜索，选填，取值[http, https, http/https]
     * @param ProtocolList 转发协议搜索，选填，取值[http, https, http/https]
     */
    public void setProtocolList(String [] ProtocolList) {
        this.ProtocolList = ProtocolList;
    }

    /**
     * Get 高防IP实例的Cname 
     * @return Cname 高防IP实例的Cname
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set 高防IP实例的Cname
     * @param Cname 高防IP实例的Cname
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public DescribeNewL7RulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewL7RulesRequest(DescribeNewL7RulesRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.StatusList != null) {
            this.StatusList = new Long[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new Long(source.StatusList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProtocolList != null) {
            this.ProtocolList = new String[source.ProtocolList.length];
            for (int i = 0; i < source.ProtocolList.length; i++) {
                this.ProtocolList[i] = new String(source.ProtocolList[i]);
            }
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ProtocolList.", this.ProtocolList);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

