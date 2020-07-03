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

public class ModifyCCUrlAllowRequest extends AbstractModel{

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
    * =add表示添加，=delete表示删除
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 黑/白名单类型；取值[white(白名单)]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * URL数组，URL格式如下：
http://域名/cgi
https://域名/cgi
    */
    @SerializedName("UrlList")
    @Expose
    private String [] UrlList;

    /**
    * 可选字段，代表CC防护类型，取值[http（HTTP协议的CC防护），https（HTTPS协议的CC防护）]；当不填时，默认为HTTP协议的CC防护；当填写https时还需要填写Domain和RuleId字段；
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 可选字段，表示HTTPS协议的7层转发规则域名（通过获取7层转发规则接口可以获取域名），只有当Protocol字段为https时才必须填写此字段；
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 可选字段，表示HTTPS协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID），当添加并且Protocol=https时必须填写；
当Method为delete时，可以不用填写此字段；
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID 
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get =add表示添加，=delete表示删除 
     * @return Method =add表示添加，=delete表示删除
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set =add表示添加，=delete表示删除
     * @param Method =add表示添加，=delete表示删除
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 黑/白名单类型；取值[white(白名单)] 
     * @return Type 黑/白名单类型；取值[white(白名单)]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 黑/白名单类型；取值[white(白名单)]
     * @param Type 黑/白名单类型；取值[white(白名单)]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get URL数组，URL格式如下：
http://域名/cgi
https://域名/cgi 
     * @return UrlList URL数组，URL格式如下：
http://域名/cgi
https://域名/cgi
     */
    public String [] getUrlList() {
        return this.UrlList;
    }

    /**
     * Set URL数组，URL格式如下：
http://域名/cgi
https://域名/cgi
     * @param UrlList URL数组，URL格式如下：
http://域名/cgi
https://域名/cgi
     */
    public void setUrlList(String [] UrlList) {
        this.UrlList = UrlList;
    }

    /**
     * Get 可选字段，代表CC防护类型，取值[http（HTTP协议的CC防护），https（HTTPS协议的CC防护）]；当不填时，默认为HTTP协议的CC防护；当填写https时还需要填写Domain和RuleId字段； 
     * @return Protocol 可选字段，代表CC防护类型，取值[http（HTTP协议的CC防护），https（HTTPS协议的CC防护）]；当不填时，默认为HTTP协议的CC防护；当填写https时还需要填写Domain和RuleId字段；
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 可选字段，代表CC防护类型，取值[http（HTTP协议的CC防护），https（HTTPS协议的CC防护）]；当不填时，默认为HTTP协议的CC防护；当填写https时还需要填写Domain和RuleId字段；
     * @param Protocol 可选字段，代表CC防护类型，取值[http（HTTP协议的CC防护），https（HTTPS协议的CC防护）]；当不填时，默认为HTTP协议的CC防护；当填写https时还需要填写Domain和RuleId字段；
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 可选字段，表示HTTPS协议的7层转发规则域名（通过获取7层转发规则接口可以获取域名），只有当Protocol字段为https时才必须填写此字段； 
     * @return Domain 可选字段，表示HTTPS协议的7层转发规则域名（通过获取7层转发规则接口可以获取域名），只有当Protocol字段为https时才必须填写此字段；
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 可选字段，表示HTTPS协议的7层转发规则域名（通过获取7层转发规则接口可以获取域名），只有当Protocol字段为https时才必须填写此字段；
     * @param Domain 可选字段，表示HTTPS协议的7层转发规则域名（通过获取7层转发规则接口可以获取域名），只有当Protocol字段为https时才必须填写此字段；
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 可选字段，表示HTTPS协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID），当添加并且Protocol=https时必须填写；
当Method为delete时，可以不用填写此字段； 
     * @return RuleId 可选字段，表示HTTPS协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID），当添加并且Protocol=https时必须填写；
当Method为delete时，可以不用填写此字段；
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 可选字段，表示HTTPS协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID），当添加并且Protocol=https时必须填写；
当Method为delete时，可以不用填写此字段；
     * @param RuleId 可选字段，表示HTTPS协议的7层转发规则ID（通过获取7层转发规则接口可以获取规则ID），当添加并且Protocol=https时必须填写；
当Method为delete时，可以不用填写此字段；
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "UrlList.", this.UrlList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

