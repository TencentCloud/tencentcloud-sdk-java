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

public class ModifyLabelRequest extends AbstractModel {

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
    * 资产或风险主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 企业ID，在企业管理页面查看
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 是否聚合数据
    */
    @SerializedName("IsAggregation")
    @Expose
    private Boolean IsAggregation;

    /**
    * 标签详情
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * 资产或风险主键ID列表
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

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
     * Get 资产或风险主键ID 
     * @return Id 资产或风险主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资产或风险主键ID
     * @param Id 资产或风险主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 企业ID，在企业管理页面查看 
     * @return CustomerId 企业ID，在企业管理页面查看
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID，在企业管理页面查看
     * @param CustomerId 企业ID，在企业管理页面查看
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
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
     * Get 标签详情 
     * @return Labels 标签详情
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签详情
     * @param Labels 标签详情
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 资产或风险主键ID列表 
     * @return Ids 资产或风险主键ID列表
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 资产或风险主键ID列表
     * @param Ids 资产或风险主键ID列表
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    public ModifyLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLabelRequest(ModifyLabelRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.CustomerIdList != null) {
            this.CustomerIdList = new Long[source.CustomerIdList.length];
            for (int i = 0; i < source.CustomerIdList.length; i++) {
                this.CustomerIdList[i] = new Long(source.CustomerIdList[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.IsAggregation != null) {
            this.IsAggregation = new Boolean(source.IsAggregation);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "CustomerIdList.", this.CustomerIdList);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "IsAggregation", this.IsAggregation);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

