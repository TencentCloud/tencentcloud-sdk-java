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

public class CreateScdnLogTaskRequest extends AbstractModel{

    /**
    * 防护类型
Mode 映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
  bot = "Bot攻击"
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

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
    * 指定域名查询, 不填默认查询全部域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 指定攻击类型, 不填默认查询全部攻击类型
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
  js = "JS主动探测"
  cookie = "Cookie指纹"
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 指定执行动作, 不填默认查询全部执行动作
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
  captcha = "验证码"
  redirect = "重定向"
    */
    @SerializedName("DefenceMode")
    @Expose
    private String DefenceMode;

    /**
    * 不填为全部ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 指定域名查询, 与 Domain 参数同时有值时使用 Domains 参数，不填默认查询全部域名，指定域名查询时最多支持同时选择 5 个域名查询
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 指定攻击类型查询, 与 AttackType 参数同时有值时使用 AttackTypes 参数，不填默认查询全部攻击类型
    */
    @SerializedName("AttackTypes")
    @Expose
    private String [] AttackTypes;

    /**
    * 查询条件
    */
    @SerializedName("Conditions")
    @Expose
    private ScdnEventLogConditions [] Conditions;

    /**
    * 来源产品 cdn ecdn
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 地域：mainland 或 overseas
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 防护类型
Mode 映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
  bot = "Bot攻击" 
     * @return Mode 防护类型
Mode 映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
  bot = "Bot攻击"
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 防护类型
Mode 映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
  bot = "Bot攻击"
     * @param Mode 防护类型
Mode 映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
  bot = "Bot攻击"
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

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
     * Get 指定域名查询, 不填默认查询全部域名 
     * @return Domain 指定域名查询, 不填默认查询全部域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定域名查询, 不填默认查询全部域名
     * @param Domain 指定域名查询, 不填默认查询全部域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 指定攻击类型, 不填默认查询全部攻击类型
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
  js = "JS主动探测"
  cookie = "Cookie指纹" 
     * @return AttackType 指定攻击类型, 不填默认查询全部攻击类型
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
  js = "JS主动探测"
  cookie = "Cookie指纹"
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 指定攻击类型, 不填默认查询全部攻击类型
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
  js = "JS主动探测"
  cookie = "Cookie指纹"
     * @param AttackType 指定攻击类型, 不填默认查询全部攻击类型
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
  js = "JS主动探测"
  cookie = "Cookie指纹"
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 指定执行动作, 不填默认查询全部执行动作
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
  captcha = "验证码"
  redirect = "重定向" 
     * @return DefenceMode 指定执行动作, 不填默认查询全部执行动作
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
  captcha = "验证码"
  redirect = "重定向"
     */
    public String getDefenceMode() {
        return this.DefenceMode;
    }

    /**
     * Set 指定执行动作, 不填默认查询全部执行动作
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
  captcha = "验证码"
  redirect = "重定向"
     * @param DefenceMode 指定执行动作, 不填默认查询全部执行动作
DefenceMode 映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
  captcha = "验证码"
  redirect = "重定向"
     */
    public void setDefenceMode(String DefenceMode) {
        this.DefenceMode = DefenceMode;
    }

    /**
     * Get 不填为全部ip 
     * @return Ip 不填为全部ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 不填为全部ip
     * @param Ip 不填为全部ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 指定域名查询, 与 Domain 参数同时有值时使用 Domains 参数，不填默认查询全部域名，指定域名查询时最多支持同时选择 5 个域名查询 
     * @return Domains 指定域名查询, 与 Domain 参数同时有值时使用 Domains 参数，不填默认查询全部域名，指定域名查询时最多支持同时选择 5 个域名查询
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定域名查询, 与 Domain 参数同时有值时使用 Domains 参数，不填默认查询全部域名，指定域名查询时最多支持同时选择 5 个域名查询
     * @param Domains 指定域名查询, 与 Domain 参数同时有值时使用 Domains 参数，不填默认查询全部域名，指定域名查询时最多支持同时选择 5 个域名查询
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 指定攻击类型查询, 与 AttackType 参数同时有值时使用 AttackTypes 参数，不填默认查询全部攻击类型 
     * @return AttackTypes 指定攻击类型查询, 与 AttackType 参数同时有值时使用 AttackTypes 参数，不填默认查询全部攻击类型
     */
    public String [] getAttackTypes() {
        return this.AttackTypes;
    }

    /**
     * Set 指定攻击类型查询, 与 AttackType 参数同时有值时使用 AttackTypes 参数，不填默认查询全部攻击类型
     * @param AttackTypes 指定攻击类型查询, 与 AttackType 参数同时有值时使用 AttackTypes 参数，不填默认查询全部攻击类型
     */
    public void setAttackTypes(String [] AttackTypes) {
        this.AttackTypes = AttackTypes;
    }

    /**
     * Get 查询条件 
     * @return Conditions 查询条件
     */
    public ScdnEventLogConditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 查询条件
     * @param Conditions 查询条件
     */
    public void setConditions(ScdnEventLogConditions [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 来源产品 cdn ecdn 
     * @return Source 来源产品 cdn ecdn
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源产品 cdn ecdn
     * @param Source 来源产品 cdn ecdn
     */
    public void setSource(String Source) {
        this.Source = Source;
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

    public CreateScdnLogTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScdnLogTaskRequest(CreateScdnLogTaskRequest source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
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
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.AttackTypes != null) {
            this.AttackTypes = new String[source.AttackTypes.length];
            for (int i = 0; i < source.AttackTypes.length; i++) {
                this.AttackTypes[i] = new String(source.AttackTypes[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new ScdnEventLogConditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ScdnEventLogConditions(source.Conditions[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "DefenceMode", this.DefenceMode);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "AttackTypes.", this.AttackTypes);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

