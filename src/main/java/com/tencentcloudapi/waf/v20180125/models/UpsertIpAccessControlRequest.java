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

public class UpsertIpAccessControlRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * ip 参数列表，json数组由ip，source，note，action，valid_ts组成。ip对应配置的ip地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
    * WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 是否为多域名黑白名单，当为多域名的黑白名单时，取值为batch，否则为空
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

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
     * Get ip 参数列表，json数组由ip，source，note，action，valid_ts组成。ip对应配置的ip地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00）） 
     * @return Items ip 参数列表，json数组由ip，source，note，action，valid_ts组成。ip对应配置的ip地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set ip 参数列表，json数组由ip，source，note，action，valid_ts组成。ip对应配置的ip地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     * @param Items ip 参数列表，json数组由ip，source，note，action，valid_ts组成。ip对应配置的ip地址，source固定为custom值，note为注释，action值42为黑名单，40为白名单，valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     */
    public void setItems(String [] Items) {
        this.Items = Items;
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
     * Get 是否为多域名黑白名单，当为多域名的黑白名单时，取值为batch，否则为空 
     * @return SourceType 是否为多域名黑白名单，当为多域名的黑白名单时，取值为batch，否则为空
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 是否为多域名黑白名单，当为多域名的黑白名单时，取值为batch，否则为空
     * @param SourceType 是否为多域名黑白名单，当为多域名的黑白名单时，取值为batch，否则为空
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
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

