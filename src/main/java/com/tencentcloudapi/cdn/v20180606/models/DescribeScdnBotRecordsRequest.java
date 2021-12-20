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

public class DescribeScdnBotRecordsRequest extends AbstractModel{

    /**
    * BOT类型，取值为"UB","UCB","TCB"，分别表示：未知类型，自定义类型，公开类型
    */
    @SerializedName("BotType")
    @Expose
    private String BotType;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * mainland 大陆地区 overseas境外地区
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 排序参数
    */
    @SerializedName("SortBy")
    @Expose
    private BotSortBy [] SortBy;

    /**
    * BotType=UB时，表示需要过滤的预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示需要过滤的Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，取值如下：
User-Agent为空或不存在
User-Agent类型为BOT
User-Agent类型为HTTP Library
User-Agent类型为Framework
User-Agent类型为Tools
User-Agent类型为Unkonwn BOT
User-Agent类型为Scanner
Referer空或不存在
Referer滥用(多个UA使用相同Referer)
Cookie滥用(多个UA使用相同Cookie)
Cookie空或不存在
Connection空或不存在
Accept空或不存在
Accept-Language空或不存在
Accept-Enconding空或不存在
使用HTTP HEAD方法
HTTP协议为1.0或者更低
IDC-IP 腾讯云
IDC-IP 阿里云
IDC-IP 华为云
IDC-IP 金山云
IDC-IP UCloud
IDC-IP 百度云
IDC-IP 京东云
IDC-IP 青云
IDC-IP Aws
IDC-IP Azure
IDC-IP Google

以上所有类型，FilterName为空时，表示不过滤，获取所有内容
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * 目前支持的Action
"intercept" 拦截
"monitor"，监控
"permit" 放行
"redirect" 重定向

尚未支持的Action
"captcha" 验证码
    */
    @SerializedName("FilterAction")
    @Expose
    private String FilterAction;

    /**
    * 过滤的IP
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * 域名列表，为空表示查询AppID维度数据
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get BOT类型，取值为"UB","UCB","TCB"，分别表示：未知类型，自定义类型，公开类型 
     * @return BotType BOT类型，取值为"UB","UCB","TCB"，分别表示：未知类型，自定义类型，公开类型
     */
    public String getBotType() {
        return this.BotType;
    }

    /**
     * Set BOT类型，取值为"UB","UCB","TCB"，分别表示：未知类型，自定义类型，公开类型
     * @param BotType BOT类型，取值为"UB","UCB","TCB"，分别表示：未知类型，自定义类型，公开类型
     */
    public void setBotType(String BotType) {
        this.BotType = BotType;
    }

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
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数 
     * @return Limit 分页参数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数
     * @param Limit 分页参数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get mainland 大陆地区 overseas境外地区 
     * @return Area mainland 大陆地区 overseas境外地区
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set mainland 大陆地区 overseas境外地区
     * @param Area mainland 大陆地区 overseas境外地区
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 排序参数 
     * @return SortBy 排序参数
     */
    public BotSortBy [] getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序参数
     * @param SortBy 排序参数
     */
    public void setSortBy(BotSortBy [] SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get BotType=UB时，表示需要过滤的预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示需要过滤的Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，取值如下：
User-Agent为空或不存在
User-Agent类型为BOT
User-Agent类型为HTTP Library
User-Agent类型为Framework
User-Agent类型为Tools
User-Agent类型为Unkonwn BOT
User-Agent类型为Scanner
Referer空或不存在
Referer滥用(多个UA使用相同Referer)
Cookie滥用(多个UA使用相同Cookie)
Cookie空或不存在
Connection空或不存在
Accept空或不存在
Accept-Language空或不存在
Accept-Enconding空或不存在
使用HTTP HEAD方法
HTTP协议为1.0或者更低
IDC-IP 腾讯云
IDC-IP 阿里云
IDC-IP 华为云
IDC-IP 金山云
IDC-IP UCloud
IDC-IP 百度云
IDC-IP 京东云
IDC-IP 青云
IDC-IP Aws
IDC-IP Azure
IDC-IP Google

以上所有类型，FilterName为空时，表示不过滤，获取所有内容 
     * @return FilterName BotType=UB时，表示需要过滤的预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示需要过滤的Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，取值如下：
User-Agent为空或不存在
User-Agent类型为BOT
User-Agent类型为HTTP Library
User-Agent类型为Framework
User-Agent类型为Tools
User-Agent类型为Unkonwn BOT
User-Agent类型为Scanner
Referer空或不存在
Referer滥用(多个UA使用相同Referer)
Cookie滥用(多个UA使用相同Cookie)
Cookie空或不存在
Connection空或不存在
Accept空或不存在
Accept-Language空或不存在
Accept-Enconding空或不存在
使用HTTP HEAD方法
HTTP协议为1.0或者更低
IDC-IP 腾讯云
IDC-IP 阿里云
IDC-IP 华为云
IDC-IP 金山云
IDC-IP UCloud
IDC-IP 百度云
IDC-IP 京东云
IDC-IP 青云
IDC-IP Aws
IDC-IP Azure
IDC-IP Google

以上所有类型，FilterName为空时，表示不过滤，获取所有内容
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set BotType=UB时，表示需要过滤的预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示需要过滤的Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，取值如下：
User-Agent为空或不存在
User-Agent类型为BOT
User-Agent类型为HTTP Library
User-Agent类型为Framework
User-Agent类型为Tools
User-Agent类型为Unkonwn BOT
User-Agent类型为Scanner
Referer空或不存在
Referer滥用(多个UA使用相同Referer)
Cookie滥用(多个UA使用相同Cookie)
Cookie空或不存在
Connection空或不存在
Accept空或不存在
Accept-Language空或不存在
Accept-Enconding空或不存在
使用HTTP HEAD方法
HTTP协议为1.0或者更低
IDC-IP 腾讯云
IDC-IP 阿里云
IDC-IP 华为云
IDC-IP 金山云
IDC-IP UCloud
IDC-IP 百度云
IDC-IP 京东云
IDC-IP 青云
IDC-IP Aws
IDC-IP Azure
IDC-IP Google

以上所有类型，FilterName为空时，表示不过滤，获取所有内容
     * @param FilterName BotType=UB时，表示需要过滤的预测标签，取值如下：
                "crawler_unregular",
                "crawler_regular",
                "request_repeat",
                "credential_miss_user",
                "credential_without_user",
                "credential_only_action",
                "credential_user_password",
                "credential_cracking",
                "credential_stuffing",
                "brush_sms",
                "brush_captcha",
                "reg_malicious"
BotType=TCB时，表示需要过滤的Bot分类，取值如下：
                "Uncategorised",
                "Search engine bot",
                "Site monitor",
                "Screenshot creator",
                "Link checker",
                "Web scraper",
                "Vulnerability scanner",
                "Virus scanner",
                "Speed tester",
                "Feed Fetcher",
                "Tool",
                "Marketing"
BotType=UCB时，取值如下：
User-Agent为空或不存在
User-Agent类型为BOT
User-Agent类型为HTTP Library
User-Agent类型为Framework
User-Agent类型为Tools
User-Agent类型为Unkonwn BOT
User-Agent类型为Scanner
Referer空或不存在
Referer滥用(多个UA使用相同Referer)
Cookie滥用(多个UA使用相同Cookie)
Cookie空或不存在
Connection空或不存在
Accept空或不存在
Accept-Language空或不存在
Accept-Enconding空或不存在
使用HTTP HEAD方法
HTTP协议为1.0或者更低
IDC-IP 腾讯云
IDC-IP 阿里云
IDC-IP 华为云
IDC-IP 金山云
IDC-IP UCloud
IDC-IP 百度云
IDC-IP 京东云
IDC-IP 青云
IDC-IP Aws
IDC-IP Azure
IDC-IP Google

以上所有类型，FilterName为空时，表示不过滤，获取所有内容
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get 目前支持的Action
"intercept" 拦截
"monitor"，监控
"permit" 放行
"redirect" 重定向

尚未支持的Action
"captcha" 验证码 
     * @return FilterAction 目前支持的Action
"intercept" 拦截
"monitor"，监控
"permit" 放行
"redirect" 重定向

尚未支持的Action
"captcha" 验证码
     */
    public String getFilterAction() {
        return this.FilterAction;
    }

    /**
     * Set 目前支持的Action
"intercept" 拦截
"monitor"，监控
"permit" 放行
"redirect" 重定向

尚未支持的Action
"captcha" 验证码
     * @param FilterAction 目前支持的Action
"intercept" 拦截
"monitor"，监控
"permit" 放行
"redirect" 重定向

尚未支持的Action
"captcha" 验证码
     */
    public void setFilterAction(String FilterAction) {
        this.FilterAction = FilterAction;
    }

    /**
     * Get 过滤的IP 
     * @return FilterIp 过滤的IP
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set 过滤的IP
     * @param FilterIp 过滤的IP
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get 域名列表，为空表示查询AppID维度数据 
     * @return Domains 域名列表，为空表示查询AppID维度数据
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表，为空表示查询AppID维度数据
     * @param Domains 域名列表，为空表示查询AppID维度数据
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DescribeScdnBotRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnBotRecordsRequest(DescribeScdnBotRecordsRequest source) {
        if (source.BotType != null) {
            this.BotType = new String(source.BotType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SortBy != null) {
            this.SortBy = new BotSortBy[source.SortBy.length];
            for (int i = 0; i < source.SortBy.length; i++) {
                this.SortBy[i] = new BotSortBy(source.SortBy[i]);
            }
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterAction != null) {
            this.FilterAction = new String(source.FilterAction);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
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
        this.setParamSimple(map, prefix + "BotType", this.BotType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "SortBy.", this.SortBy);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterAction", this.FilterAction);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

