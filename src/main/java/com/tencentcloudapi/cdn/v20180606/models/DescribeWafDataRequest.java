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

public class DescribeWafDataRequest extends AbstractModel{

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
    * 时间粒度，支持以下几种模式：
min：1 分钟粒度，指定查询区间 24 小时内（含 24 小时），可返回 1 分钟粒度明细数据
5min：5 分钟粒度，指定查询区间 31 天内（含 31 天），可返回 5 分钟粒度明细数据
hour：1 小时粒度，指定查询区间 31 天内（含 31 天），可返回 1 小时粒度明细数据
day：天粒度，指定查询区间大于 31 天，可返回天粒度明细数据

仅支持30天内数据查询，且查询时间范围在 7 到 30 天最小粒度是 hour。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 指定域名查询
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 指定攻击类型
不填则查询所有攻击类型的数据分布
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
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
    */
    @SerializedName("DefenceMode")
    @Expose
    private String DefenceMode;

    /**
    * 地域：mainland 或 overseas
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 指定多个攻击类型，取值参考AttackType
    */
    @SerializedName("AttackTypes")
    @Expose
    private String [] AttackTypes;

    /**
    * 指定域名列表查询
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
     * Get 时间粒度，支持以下几种模式：
min：1 分钟粒度，指定查询区间 24 小时内（含 24 小时），可返回 1 分钟粒度明细数据
5min：5 分钟粒度，指定查询区间 31 天内（含 31 天），可返回 5 分钟粒度明细数据
hour：1 小时粒度，指定查询区间 31 天内（含 31 天），可返回 1 小时粒度明细数据
day：天粒度，指定查询区间大于 31 天，可返回天粒度明细数据

仅支持30天内数据查询，且查询时间范围在 7 到 30 天最小粒度是 hour。 
     * @return Interval 时间粒度，支持以下几种模式：
min：1 分钟粒度，指定查询区间 24 小时内（含 24 小时），可返回 1 分钟粒度明细数据
5min：5 分钟粒度，指定查询区间 31 天内（含 31 天），可返回 5 分钟粒度明细数据
hour：1 小时粒度，指定查询区间 31 天内（含 31 天），可返回 1 小时粒度明细数据
day：天粒度，指定查询区间大于 31 天，可返回天粒度明细数据

仅支持30天内数据查询，且查询时间范围在 7 到 30 天最小粒度是 hour。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间粒度，支持以下几种模式：
min：1 分钟粒度，指定查询区间 24 小时内（含 24 小时），可返回 1 分钟粒度明细数据
5min：5 分钟粒度，指定查询区间 31 天内（含 31 天），可返回 5 分钟粒度明细数据
hour：1 小时粒度，指定查询区间 31 天内（含 31 天），可返回 1 小时粒度明细数据
day：天粒度，指定查询区间大于 31 天，可返回天粒度明细数据

仅支持30天内数据查询，且查询时间范围在 7 到 30 天最小粒度是 hour。
     * @param Interval 时间粒度，支持以下几种模式：
min：1 分钟粒度，指定查询区间 24 小时内（含 24 小时），可返回 1 分钟粒度明细数据
5min：5 分钟粒度，指定查询区间 31 天内（含 31 天），可返回 5 分钟粒度明细数据
hour：1 小时粒度，指定查询区间 31 天内（含 31 天），可返回 1 小时粒度明细数据
day：天粒度，指定查询区间大于 31 天，可返回天粒度明细数据

仅支持30天内数据查询，且查询时间范围在 7 到 30 天最小粒度是 hour。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
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
     * Get 指定攻击类型
不填则查询所有攻击类型的数据分布
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
不填则查询所有攻击类型的数据分布
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
不填则查询所有攻击类型的数据分布
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
不填则查询所有攻击类型的数据分布
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
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '拦截模式' 
     * @return DefenceMode 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     */
    public String getDefenceMode() {
        return this.DefenceMode;
    }

    /**
     * Set 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     * @param DefenceMode 指定防御模式
不填则查询所有防御模式的数据总和
DefenceMode映射如下：
  observe = '观察模式'
  intercept = '拦截模式'
     */
    public void setDefenceMode(String DefenceMode) {
        this.DefenceMode = DefenceMode;
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
     * Get 指定多个攻击类型，取值参考AttackType 
     * @return AttackTypes 指定多个攻击类型，取值参考AttackType
     */
    public String [] getAttackTypes() {
        return this.AttackTypes;
    }

    /**
     * Set 指定多个攻击类型，取值参考AttackType
     * @param AttackTypes 指定多个攻击类型，取值参考AttackType
     */
    public void setAttackTypes(String [] AttackTypes) {
        this.AttackTypes = AttackTypes;
    }

    /**
     * Get 指定域名列表查询 
     * @return Domains 指定域名列表查询
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定域名列表查询
     * @param Domains 指定域名列表查询
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DescribeWafDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWafDataRequest(DescribeWafDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "DefenceMode", this.DefenceMode);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "AttackTypes.", this.AttackTypes);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

