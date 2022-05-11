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

public class Layer7Rule extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发类型列表
    */
    @SerializedName("ProxyTypeList")
    @Expose
    private ProxyTypeInfo [] ProxyTypeList;

    /**
    * 源站列表
    */
    @SerializedName("RealServers")
    @Expose
    private SourceServer [] RealServers;

    /**
    * 资源实例
    */
    @SerializedName("InstanceDetails")
    @Expose
    private InstanceRelation [] InstanceDetails;

    /**
    * 规则所属的资源实例
    */
    @SerializedName("InstanceDetailRule")
    @Expose
    private RuleInstanceRelation [] InstanceDetailRule;

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
     * Get 转发类型列表 
     * @return ProxyTypeList 转发类型列表
     */
    public ProxyTypeInfo [] getProxyTypeList() {
        return this.ProxyTypeList;
    }

    /**
     * Set 转发类型列表
     * @param ProxyTypeList 转发类型列表
     */
    public void setProxyTypeList(ProxyTypeInfo [] ProxyTypeList) {
        this.ProxyTypeList = ProxyTypeList;
    }

    /**
     * Get 源站列表 
     * @return RealServers 源站列表
     */
    public SourceServer [] getRealServers() {
        return this.RealServers;
    }

    /**
     * Set 源站列表
     * @param RealServers 源站列表
     */
    public void setRealServers(SourceServer [] RealServers) {
        this.RealServers = RealServers;
    }

    /**
     * Get 资源实例 
     * @return InstanceDetails 资源实例
     */
    public InstanceRelation [] getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set 资源实例
     * @param InstanceDetails 资源实例
     */
    public void setInstanceDetails(InstanceRelation [] InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    /**
     * Get 规则所属的资源实例 
     * @return InstanceDetailRule 规则所属的资源实例
     */
    public RuleInstanceRelation [] getInstanceDetailRule() {
        return this.InstanceDetailRule;
    }

    /**
     * Set 规则所属的资源实例
     * @param InstanceDetailRule 规则所属的资源实例
     */
    public void setInstanceDetailRule(RuleInstanceRelation [] InstanceDetailRule) {
        this.InstanceDetailRule = InstanceDetailRule;
    }

    public Layer7Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Layer7Rule(Layer7Rule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProxyTypeList != null) {
            this.ProxyTypeList = new ProxyTypeInfo[source.ProxyTypeList.length];
            for (int i = 0; i < source.ProxyTypeList.length; i++) {
                this.ProxyTypeList[i] = new ProxyTypeInfo(source.ProxyTypeList[i]);
            }
        }
        if (source.RealServers != null) {
            this.RealServers = new SourceServer[source.RealServers.length];
            for (int i = 0; i < source.RealServers.length; i++) {
                this.RealServers[i] = new SourceServer(source.RealServers[i]);
            }
        }
        if (source.InstanceDetails != null) {
            this.InstanceDetails = new InstanceRelation[source.InstanceDetails.length];
            for (int i = 0; i < source.InstanceDetails.length; i++) {
                this.InstanceDetails[i] = new InstanceRelation(source.InstanceDetails[i]);
            }
        }
        if (source.InstanceDetailRule != null) {
            this.InstanceDetailRule = new RuleInstanceRelation[source.InstanceDetailRule.length];
            for (int i = 0; i < source.InstanceDetailRule.length; i++) {
                this.InstanceDetailRule[i] = new RuleInstanceRelation(source.InstanceDetailRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "ProxyTypeList.", this.ProxyTypeList);
        this.setParamArrayObj(map, prefix + "RealServers.", this.RealServers);
        this.setParamArrayObj(map, prefix + "InstanceDetails.", this.InstanceDetails);
        this.setParamArrayObj(map, prefix + "InstanceDetailRule.", this.InstanceDetailRule);

    }
}

