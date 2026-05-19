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
package com.tencentcloudapi.rce.v20250425.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageIPPortraitRiskValueOutput extends AbstractModel {

    /**
    * <p>对应的IP</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高</p>
    */
    @SerializedName("RiskScore")
    @Expose
    private Long RiskScore;

    /**
    * <p>风险类型<br>730001：垃圾邮件，当前IP存在未经用户请求或同意，大量发送的广告、欺诈或推广信息，通常通过邮件、短信或社交消息传播。<br>730002：恶意行为，当前IP存在破坏、窃取、干扰或未授权访问为目的的故意行为。<br>730003：恶意工具，当前IP关联用于实施恶意行为的软件或脚本，如病毒、木马、勒索软件、漏洞利用工具等。<br>730004：匿名IP，通过代理、Tor网络等技术手段隐藏真实来源的IP地址，存在逃避定位或实施攻击风险。<br>730005：开放端口，网络上处于开放状态的服务入口，若配置不当或存在漏洞。<br>730006：养号，当前IP存在通过模拟正常操作（如登录、浏览）维护和提升账号的活跃度与可信度行为。<br>730007：IDC，互联网数据中心，可能被黑客利用来托管恶意服务或发动攻击。<br>730008：晒号，当前IP在公开或地下论坛展示、交易非法获取的各类账号（如游戏、社交、金融账号）的行为。<br>730009：盗号，当前IP存在通过钓鱼、撞库、木马等手段，非法获取他人账号的登录凭证（用户名、密码等）行为。<br>730010：代理，作为中间节点转发网络流量，可用于隐藏真实IP、绕过地域限制。<br>730011：扫描，使用工具自动探测目标网络或系统的开放端口、服务、漏洞等。<br>730012：秒拨，当前IP通过不断重新拨号以快速切换IP地址，常被用于绕过基于IP的频率限制或封禁。<br>730013：爬虫，自动抓取网络信息的脚本或程序。<br>730014：VPN 虚拟专用网络。<br>730015：僵尸网络，当前IP由攻击者通过恶意软件控制的、大规模联网设备（如电脑、IoT设备）集群，可能被用于发动DDoS攻击、发送垃圾邮件等。<br>730016：网络攻击，当前IP存在对计算机系统、网络或数据的任何进攻行为。</p>
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
     * Get <p>对应的IP</p> 
     * @return UserIp <p>对应的IP</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>对应的IP</p>
     * @param UserIp <p>对应的IP</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高</p> 
     * @return RiskScore <p>返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高</p>
     */
    public Long getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set <p>返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高</p>
     * @param RiskScore <p>返回风险等级, 0 - 4，0代表无风险，数值越大，风险越高</p>
     */
    public void setRiskScore(Long RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get <p>风险类型<br>730001：垃圾邮件，当前IP存在未经用户请求或同意，大量发送的广告、欺诈或推广信息，通常通过邮件、短信或社交消息传播。<br>730002：恶意行为，当前IP存在破坏、窃取、干扰或未授权访问为目的的故意行为。<br>730003：恶意工具，当前IP关联用于实施恶意行为的软件或脚本，如病毒、木马、勒索软件、漏洞利用工具等。<br>730004：匿名IP，通过代理、Tor网络等技术手段隐藏真实来源的IP地址，存在逃避定位或实施攻击风险。<br>730005：开放端口，网络上处于开放状态的服务入口，若配置不当或存在漏洞。<br>730006：养号，当前IP存在通过模拟正常操作（如登录、浏览）维护和提升账号的活跃度与可信度行为。<br>730007：IDC，互联网数据中心，可能被黑客利用来托管恶意服务或发动攻击。<br>730008：晒号，当前IP在公开或地下论坛展示、交易非法获取的各类账号（如游戏、社交、金融账号）的行为。<br>730009：盗号，当前IP存在通过钓鱼、撞库、木马等手段，非法获取他人账号的登录凭证（用户名、密码等）行为。<br>730010：代理，作为中间节点转发网络流量，可用于隐藏真实IP、绕过地域限制。<br>730011：扫描，使用工具自动探测目标网络或系统的开放端口、服务、漏洞等。<br>730012：秒拨，当前IP通过不断重新拨号以快速切换IP地址，常被用于绕过基于IP的频率限制或封禁。<br>730013：爬虫，自动抓取网络信息的脚本或程序。<br>730014：VPN 虚拟专用网络。<br>730015：僵尸网络，当前IP由攻击者通过恶意软件控制的、大规模联网设备（如电脑、IoT设备）集群，可能被用于发动DDoS攻击、发送垃圾邮件等。<br>730016：网络攻击，当前IP存在对计算机系统、网络或数据的任何进攻行为。</p> 
     * @return RiskType <p>风险类型<br>730001：垃圾邮件，当前IP存在未经用户请求或同意，大量发送的广告、欺诈或推广信息，通常通过邮件、短信或社交消息传播。<br>730002：恶意行为，当前IP存在破坏、窃取、干扰或未授权访问为目的的故意行为。<br>730003：恶意工具，当前IP关联用于实施恶意行为的软件或脚本，如病毒、木马、勒索软件、漏洞利用工具等。<br>730004：匿名IP，通过代理、Tor网络等技术手段隐藏真实来源的IP地址，存在逃避定位或实施攻击风险。<br>730005：开放端口，网络上处于开放状态的服务入口，若配置不当或存在漏洞。<br>730006：养号，当前IP存在通过模拟正常操作（如登录、浏览）维护和提升账号的活跃度与可信度行为。<br>730007：IDC，互联网数据中心，可能被黑客利用来托管恶意服务或发动攻击。<br>730008：晒号，当前IP在公开或地下论坛展示、交易非法获取的各类账号（如游戏、社交、金融账号）的行为。<br>730009：盗号，当前IP存在通过钓鱼、撞库、木马等手段，非法获取他人账号的登录凭证（用户名、密码等）行为。<br>730010：代理，作为中间节点转发网络流量，可用于隐藏真实IP、绕过地域限制。<br>730011：扫描，使用工具自动探测目标网络或系统的开放端口、服务、漏洞等。<br>730012：秒拨，当前IP通过不断重新拨号以快速切换IP地址，常被用于绕过基于IP的频率限制或封禁。<br>730013：爬虫，自动抓取网络信息的脚本或程序。<br>730014：VPN 虚拟专用网络。<br>730015：僵尸网络，当前IP由攻击者通过恶意软件控制的、大规模联网设备（如电脑、IoT设备）集群，可能被用于发动DDoS攻击、发送垃圾邮件等。<br>730016：网络攻击，当前IP存在对计算机系统、网络或数据的任何进攻行为。</p>
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型<br>730001：垃圾邮件，当前IP存在未经用户请求或同意，大量发送的广告、欺诈或推广信息，通常通过邮件、短信或社交消息传播。<br>730002：恶意行为，当前IP存在破坏、窃取、干扰或未授权访问为目的的故意行为。<br>730003：恶意工具，当前IP关联用于实施恶意行为的软件或脚本，如病毒、木马、勒索软件、漏洞利用工具等。<br>730004：匿名IP，通过代理、Tor网络等技术手段隐藏真实来源的IP地址，存在逃避定位或实施攻击风险。<br>730005：开放端口，网络上处于开放状态的服务入口，若配置不当或存在漏洞。<br>730006：养号，当前IP存在通过模拟正常操作（如登录、浏览）维护和提升账号的活跃度与可信度行为。<br>730007：IDC，互联网数据中心，可能被黑客利用来托管恶意服务或发动攻击。<br>730008：晒号，当前IP在公开或地下论坛展示、交易非法获取的各类账号（如游戏、社交、金融账号）的行为。<br>730009：盗号，当前IP存在通过钓鱼、撞库、木马等手段，非法获取他人账号的登录凭证（用户名、密码等）行为。<br>730010：代理，作为中间节点转发网络流量，可用于隐藏真实IP、绕过地域限制。<br>730011：扫描，使用工具自动探测目标网络或系统的开放端口、服务、漏洞等。<br>730012：秒拨，当前IP通过不断重新拨号以快速切换IP地址，常被用于绕过基于IP的频率限制或封禁。<br>730013：爬虫，自动抓取网络信息的脚本或程序。<br>730014：VPN 虚拟专用网络。<br>730015：僵尸网络，当前IP由攻击者通过恶意软件控制的、大规模联网设备（如电脑、IoT设备）集群，可能被用于发动DDoS攻击、发送垃圾邮件等。<br>730016：网络攻击，当前IP存在对计算机系统、网络或数据的任何进攻行为。</p>
     * @param RiskType <p>风险类型<br>730001：垃圾邮件，当前IP存在未经用户请求或同意，大量发送的广告、欺诈或推广信息，通常通过邮件、短信或社交消息传播。<br>730002：恶意行为，当前IP存在破坏、窃取、干扰或未授权访问为目的的故意行为。<br>730003：恶意工具，当前IP关联用于实施恶意行为的软件或脚本，如病毒、木马、勒索软件、漏洞利用工具等。<br>730004：匿名IP，通过代理、Tor网络等技术手段隐藏真实来源的IP地址，存在逃避定位或实施攻击风险。<br>730005：开放端口，网络上处于开放状态的服务入口，若配置不当或存在漏洞。<br>730006：养号，当前IP存在通过模拟正常操作（如登录、浏览）维护和提升账号的活跃度与可信度行为。<br>730007：IDC，互联网数据中心，可能被黑客利用来托管恶意服务或发动攻击。<br>730008：晒号，当前IP在公开或地下论坛展示、交易非法获取的各类账号（如游戏、社交、金融账号）的行为。<br>730009：盗号，当前IP存在通过钓鱼、撞库、木马等手段，非法获取他人账号的登录凭证（用户名、密码等）行为。<br>730010：代理，作为中间节点转发网络流量，可用于隐藏真实IP、绕过地域限制。<br>730011：扫描，使用工具自动探测目标网络或系统的开放端口、服务、漏洞等。<br>730012：秒拨，当前IP通过不断重新拨号以快速切换IP地址，常被用于绕过基于IP的频率限制或封禁。<br>730013：爬虫，自动抓取网络信息的脚本或程序。<br>730014：VPN 虚拟专用网络。<br>730015：僵尸网络，当前IP由攻击者通过恶意软件控制的、大规模联网设备（如电脑、IoT设备）集群，可能被用于发动DDoS攻击、发送垃圾邮件等。<br>730016：网络攻击，当前IP存在对计算机系统、网络或数据的任何进攻行为。</p>
     */
    public void setRiskType(Long [] RiskType) {
        this.RiskType = RiskType;
    }

    public ManageIPPortraitRiskValueOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageIPPortraitRiskValueOutput(ManageIPPortraitRiskValueOutput source) {
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.RiskScore != null) {
            this.RiskScore = new Long(source.RiskScore);
        }
        if (source.RiskType != null) {
            this.RiskType = new Long[source.RiskType.length];
            for (int i = 0; i < source.RiskType.length; i++) {
                this.RiskType[i] = new Long(source.RiskType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamArraySimple(map, prefix + "RiskType.", this.RiskType);

    }
}

