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

public class UpsertIpAccessControlRequest extends AbstractModel {

    /**
    * 具体域名如：test.qcloudwaf.com
全局域名为：global
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP 参数列表，json数组由IP，source，note，action，valid_ts组成。IP对应配置的IP地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 可选值为：batch（批量添加）、bot、cc、custom（非批量添加时的默认值）
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get 具体域名如：test.qcloudwaf.com
全局域名为：global 
     * @return Domain 具体域名如：test.qcloudwaf.com
全局域名为：global
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 具体域名如：test.qcloudwaf.com
全局域名为：global
     * @param Domain 具体域名如：test.qcloudwaf.com
全局域名为：global
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP 参数列表，json数组由IP，source，note，action，valid_ts组成。IP对应配置的IP地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00）） 
     * @return Items IP 参数列表，json数组由IP，source，note，action，valid_ts组成。IP对应配置的IP地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set IP 参数列表，json数组由IP，source，note，action，valid_ts组成。IP对应配置的IP地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     * @param Items IP 参数列表，json数组由IP，source，note，action，valid_ts组成。IP对应配置的IP地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF 
     * @return Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     * @param Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 可选值为：batch（批量添加）、bot、cc、custom（非批量添加时的默认值） 
     * @return SourceType 可选值为：batch（批量添加）、bot、cc、custom（非批量添加时的默认值）
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 可选值为：batch（批量添加）、bot、cc、custom（非批量添加时的默认值）
     * @param SourceType 可选值为：batch（批量添加）、bot、cc、custom（非批量添加时的默认值）
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public UpsertIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertIpAccessControlRequest(UpsertIpAccessControlRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Items != null) {
            this.Items = new String[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new String(source.Items[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

