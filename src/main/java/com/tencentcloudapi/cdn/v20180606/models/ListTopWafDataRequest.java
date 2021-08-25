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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTopWafDataRequest extends AbstractModel{

    /**
    * 查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指定域名查询，不填写查询整个AppID下数据
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 指定攻击类型
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
"webshell" : Webshell检测防护
"oa" : 常见OA漏洞防护
"xss" : XSS跨站脚本攻击防护
"xxe" : XXE攻击防护
"webscan" : 扫描器攻击漏洞防护
"cms" : 常见CMS漏洞防护
"upload" : 恶意文件上传攻击防护
"sql" : SQL注入攻击防护
"cmd_inject": 命令/代码注入攻击防护
"osc" : 开源组件漏洞防护
"file_read" : 任意文件读取
"ldap" : LDAP注入攻击防护
"other" : 其它漏洞防护
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
    */
    @SerializedName("DefenceMode")
    @Expose
    private String DefenceMode;

    /**
    * 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
domain：当查询整个AppID下数据时，按照域名请求量排序
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 地域：mainland 或 overseas
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 指定攻击类型列表，取值参考AttackType
    */
    @SerializedName("AttackTypes")
    @Expose
    private String [] AttackTypes;

    /**
    * 指定域名列表查询，不填写查询整个AppID下数据
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间 
     * @return StartTime 查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间
     * @param StartTime 查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间 
     * @return EndTime 查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间
     * @param EndTime 查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指定域名查询，不填写查询整个AppID下数据 
     * @return Domain 指定域名查询，不填写查询整个AppID下数据
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定域名查询，不填写查询整个AppID下数据
     * @param Domain 指定域名查询，不填写查询整个AppID下数据
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 指定攻击类型
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
"webshell" : Webshell检测防护
"oa" : 常见OA漏洞防护
"xss" : XSS跨站脚本攻击防护
"xxe" : XXE攻击防护
"webscan" : 扫描器攻击漏洞防护
"cms" : 常见CMS漏洞防护
"upload" : 恶意文件上传攻击防护
"sql" : SQL注入攻击防护
"cmd_inject": 命令/代码注入攻击防护
"osc" : 开源组件漏洞防护
"file_read" : 任意文件读取
"ldap" : LDAP注入攻击防护
"other" : 其它漏洞防护 
     * @return AttackType 指定攻击类型
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
"webshell" : Webshell检测防护
"oa" : 常见OA漏洞防护
"xss" : XSS跨站脚本攻击防护
"xxe" : XXE攻击防护
"webscan" : 扫描器攻击漏洞防护
"cms" : 常见CMS漏洞防护
"upload" : 恶意文件上传攻击防护
"sql" : SQL注入攻击防护
"cmd_inject": 命令/代码注入攻击防护
"osc" : 开源组件漏洞防护
"file_read" : 任意文件读取
"ldap" : LDAP注入攻击防护
"other" : 其它漏洞防护
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 指定攻击类型
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
"webshell" : Webshell检测防护
"oa" : 常见OA漏洞防护
"xss" : XSS跨站脚本攻击防护
"xxe" : XXE攻击防护
"webscan" : 扫描器攻击漏洞防护
"cms" : 常见CMS漏洞防护
"upload" : 恶意文件上传攻击防护
"sql" : SQL注入攻击防护
"cmd_inject": 命令/代码注入攻击防护
"osc" : 开源组件漏洞防护
"file_read" : 任意文件读取
"ldap" : LDAP注入攻击防护
"other" : 其它漏洞防护
     * @param AttackType 指定攻击类型
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
"webshell" : Webshell检测防护
"oa" : 常见OA漏洞防护
"xss" : XSS跨站脚本攻击防护
"xxe" : XXE攻击防护
"webscan" : 扫描器攻击漏洞防护
"cms" : 常见CMS漏洞防护
"upload" : 恶意文件上传攻击防护
"sql" : SQL注入攻击防护
"cmd_inject": 命令/代码注入攻击防护
"osc" : 开源组件漏洞防护
"file_read" : 任意文件读取
"ldap" : LDAP注入攻击防护
"other" : 其它漏洞防护
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式' 
     * @return DefenceMode 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     */
    public String getDefenceMode() {
        return this.DefenceMode;
    }

    /**
     * Set 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     * @param DefenceMode 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     */
    public void setDefenceMode(String DefenceMode) {
        this.DefenceMode = DefenceMode;
    }

    /**
     * Get 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
domain：当查询整个AppID下数据时，按照域名请求量排序 
     * @return Metric 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
domain：当查询整个AppID下数据时，按照域名请求量排序
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
domain：当查询整个AppID下数据时，按照域名请求量排序
     * @param Metric 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
domain：当查询整个AppID下数据时，按照域名请求量排序
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 地域：mainland 或 overseas 
     * @return Area 地域：mainland 或 overseas
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域：mainland 或 overseas
     * @param Area 地域：mainland 或 overseas
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 指定攻击类型列表，取值参考AttackType 
     * @return AttackTypes 指定攻击类型列表，取值参考AttackType
     */
    public String [] getAttackTypes() {
        return this.AttackTypes;
    }

    /**
     * Set 指定攻击类型列表，取值参考AttackType
     * @param AttackTypes 指定攻击类型列表，取值参考AttackType
     */
    public void setAttackTypes(String [] AttackTypes) {
        this.AttackTypes = AttackTypes;
    }

    /**
     * Get 指定域名列表查询，不填写查询整个AppID下数据 
     * @return Domains 指定域名列表查询，不填写查询整个AppID下数据
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定域名列表查询，不填写查询整个AppID下数据
     * @param Domains 指定域名列表查询，不填写查询整个AppID下数据
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public ListTopWafDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopWafDataRequest(ListTopWafDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.DefenceMode != null) {
            this.DefenceMode = new String(source.DefenceMode);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AttackTypes != null) {
            this.AttackTypes = new String[source.AttackTypes.length];
            for (int i = 0; i < source.AttackTypes.length; i++) {
                this.AttackTypes[i] = new String(source.AttackTypes[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "DefenceMode", this.DefenceMode);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "AttackTypes.", this.AttackTypes);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

