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

public class DescribeScdnTopDataRequest extends AbstractModel{

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
    * 查询的SCDN TOP攻击数据类型：
waf：Web 攻击防护TOP数据
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 排序使用的指标名称：
request：请求次数
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 指定域名查询
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 指定攻击类型, 仅 Mode=waf 时有效
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  malicious_file_upload= '恶意文件上传'
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 指定防御模式,仅 Mode=waf 时有效
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
    */
    @SerializedName("DefenceMode")
    @Expose
    private String DefenceMode;

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
     * Get 查询的SCDN TOP攻击数据类型：
waf：Web 攻击防护TOP数据 
     * @return Mode 查询的SCDN TOP攻击数据类型：
waf：Web 攻击防护TOP数据
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 查询的SCDN TOP攻击数据类型：
waf：Web 攻击防护TOP数据
     * @param Mode 查询的SCDN TOP攻击数据类型：
waf：Web 攻击防护TOP数据
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序 
     * @return Metric 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
     * @param Metric 排序对象，支持以下几种形式：
url：攻击目标 url 排序
ip：攻击源 IP 排序
attackType：攻击类型排序
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 排序使用的指标名称：
request：请求次数 
     * @return Filter 排序使用的指标名称：
request：请求次数
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 排序使用的指标名称：
request：请求次数
     * @param Filter 排序使用的指标名称：
request：请求次数
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 指定域名查询 
     * @return Domain 指定域名查询
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定域名查询
     * @param Domain 指定域名查询
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 指定攻击类型, 仅 Mode=waf 时有效
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  malicious_file_upload= '恶意文件上传' 
     * @return AttackType 指定攻击类型, 仅 Mode=waf 时有效
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  malicious_file_upload= '恶意文件上传'
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 指定攻击类型, 仅 Mode=waf 时有效
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  malicious_file_upload= '恶意文件上传'
     * @param AttackType 指定攻击类型, 仅 Mode=waf 时有效
不填则查询所有攻击类型的数据总和
AttackType 映射如下:
  other = '未知类型'
  malicious_scan = "恶意扫描"
  sql_inject = "SQL注入攻击"
  xss = "XSS攻击"
  cmd_inject = "命令注入攻击"
  ldap_inject = "LDAP注入攻击"
  ssi_inject = "SSI注入攻击"
  xml_inject = "XML注入攻击"
  web_service = "WEB服务漏洞攻击"
  web_app = "WEB应用漏洞攻击"
  path_traversal = "路径跨越攻击"
  illegal_access_core_file = "核心文件非法访问"
  trojan_horse = "木马后门攻击"
  csrf = "CSRF攻击"
  malicious_file_upload= '恶意文件上传'
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 指定防御模式,仅 Mode=waf 时有效
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式' 
     * @return DefenceMode 指定防御模式,仅 Mode=waf 时有效
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     */
    public String getDefenceMode() {
        return this.DefenceMode;
    }

    /**
     * Set 指定防御模式,仅 Mode=waf 时有效
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     * @param DefenceMode 指定防御模式,仅 Mode=waf 时有效
不填则查询所有防御模式的数据总和
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     */
    public void setDefenceMode(String DefenceMode) {
        this.DefenceMode = DefenceMode;
    }

    public DescribeScdnTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnTopDataRequest(DescribeScdnTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "DefenceMode", this.DefenceMode);

    }
}

