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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IgnoreDataRequest extends AbstractModel {

    /**
    * ID列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 模块，包括：enterprise：企业架构，domain：主域名，sub_domain：子域名，asset：IP资产，port：端口服务，http：HTTP资产，vul：漏洞信息，app：APP，wechat_applet：微信小程序，wechat_official_account：微信公众号，github：Github信息泄露，manage：管理后台暴露，config：目录爆破，dark_web：暗网泄露，net_disk：文库网盘泄露，supply_chain：供应链，weak_password：弱口令，sensitive_info：敏感信息泄露
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 企业ID列表，可多选
    */
    @SerializedName("CustomerIdList")
    @Expose
    private Long [] CustomerIdList;

    /**
    * 是否聚合数据
    */
    @SerializedName("IsAggregation")
    @Expose
    private Boolean IsAggregation;

    /**
    * 是否显示被忽略的数据
    */
    @SerializedName("Ignored")
    @Expose
    private Boolean Ignored;

    /**
    * 是否忽略全部
    */
    @SerializedName("IsAffectOther")
    @Expose
    private Boolean IsAffectOther;

    /**
     * Get ID列表 
     * @return Ids ID列表
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set ID列表
     * @param Ids ID列表
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 模块，包括：enterprise：企业架构，domain：主域名，sub_domain：子域名，asset：IP资产，port：端口服务，http：HTTP资产，vul：漏洞信息，app：APP，wechat_applet：微信小程序，wechat_official_account：微信公众号，github：Github信息泄露，manage：管理后台暴露，config：目录爆破，dark_web：暗网泄露，net_disk：文库网盘泄露，supply_chain：供应链，weak_password：弱口令，sensitive_info：敏感信息泄露 
     * @return Module 模块，包括：enterprise：企业架构，domain：主域名，sub_domain：子域名，asset：IP资产，port：端口服务，http：HTTP资产，vul：漏洞信息，app：APP，wechat_applet：微信小程序，wechat_official_account：微信公众号，github：Github信息泄露，manage：管理后台暴露，config：目录爆破，dark_web：暗网泄露，net_disk：文库网盘泄露，supply_chain：供应链，weak_password：弱口令，sensitive_info：敏感信息泄露
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块，包括：enterprise：企业架构，domain：主域名，sub_domain：子域名，asset：IP资产，port：端口服务，http：HTTP资产，vul：漏洞信息，app：APP，wechat_applet：微信小程序，wechat_official_account：微信公众号，github：Github信息泄露，manage：管理后台暴露，config：目录爆破，dark_web：暗网泄露，net_disk：文库网盘泄露，supply_chain：供应链，weak_password：弱口令，sensitive_info：敏感信息泄露
     * @param Module 模块，包括：enterprise：企业架构，domain：主域名，sub_domain：子域名，asset：IP资产，port：端口服务，http：HTTP资产，vul：漏洞信息，app：APP，wechat_applet：微信小程序，wechat_official_account：微信公众号，github：Github信息泄露，manage：管理后台暴露，config：目录爆破，dark_web：暗网泄露，net_disk：文库网盘泄露，supply_chain：供应链，weak_password：弱口令，sensitive_info：敏感信息泄露
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 企业ID列表，可多选 
     * @return CustomerIdList 企业ID列表，可多选
     */
    public Long [] getCustomerIdList() {
        return this.CustomerIdList;
    }

    /**
     * Set 企业ID列表，可多选
     * @param CustomerIdList 企业ID列表，可多选
     */
    public void setCustomerIdList(Long [] CustomerIdList) {
        this.CustomerIdList = CustomerIdList;
    }

    /**
     * Get 是否聚合数据 
     * @return IsAggregation 是否聚合数据
     */
    public Boolean getIsAggregation() {
        return this.IsAggregation;
    }

    /**
     * Set 是否聚合数据
     * @param IsAggregation 是否聚合数据
     */
    public void setIsAggregation(Boolean IsAggregation) {
        this.IsAggregation = IsAggregation;
    }

    /**
     * Get 是否显示被忽略的数据 
     * @return Ignored 是否显示被忽略的数据
     */
    public Boolean getIgnored() {
        return this.Ignored;
    }

    /**
     * Set 是否显示被忽略的数据
     * @param Ignored 是否显示被忽略的数据
     */
    public void setIgnored(Boolean Ignored) {
        this.Ignored = Ignored;
    }

    /**
     * Get 是否忽略全部 
     * @return IsAffectOther 是否忽略全部
     */
    public Boolean getIsAffectOther() {
        return this.IsAffectOther;
    }

    /**
     * Set 是否忽略全部
     * @param IsAffectOther 是否忽略全部
     */
    public void setIsAffectOther(Boolean IsAffectOther) {
        this.IsAffectOther = IsAffectOther;
    }

    public IgnoreDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IgnoreDataRequest(IgnoreDataRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.CustomerIdList != null) {
            this.CustomerIdList = new Long[source.CustomerIdList.length];
            for (int i = 0; i < source.CustomerIdList.length; i++) {
                this.CustomerIdList[i] = new Long(source.CustomerIdList[i]);
            }
        }
        if (source.IsAggregation != null) {
            this.IsAggregation = new Boolean(source.IsAggregation);
        }
        if (source.Ignored != null) {
            this.Ignored = new Boolean(source.Ignored);
        }
        if (source.IsAffectOther != null) {
            this.IsAffectOther = new Boolean(source.IsAffectOther);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "CustomerIdList.", this.CustomerIdList);
        this.setParamSimple(map, prefix + "IsAggregation", this.IsAggregation);
        this.setParamSimple(map, prefix + "Ignored", this.Ignored);
        this.setParamSimple(map, prefix + "IsAffectOther", this.IsAffectOther);

    }
}

