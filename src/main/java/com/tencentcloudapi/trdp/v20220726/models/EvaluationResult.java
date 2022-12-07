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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvaluationResult extends AbstractModel{

    /**
    * SSID值
    */
    @SerializedName("SSID")
    @Expose
    private String SSID;

    /**
    * 风险价值分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 风险标签，请参考官网风险类型
账号风险
1 账号信用低 账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
11 疑似低活跃账号 账号活跃度与正常用户有差异
2 垃圾账号 疑似批量注册小号，近期存在严重违规或大量举报
21 疑似小号 账号有疑似线上养号，小号等行为
22 疑似违规账号 账号曾有违规行为、曾被举报过、曾因违规被处罚过等
3 无效账号 送检账号参数无法成功解析，请检查微信 Openid 是否有误/Appid与QQopenid无法关联/微信Openid权限是否有开通/手机号是否为中国大陆手机号
4 黑名单 该账号在业务侧有过拉黑记录
5 白名单 业务自行有添加过白名单记录
行为风险
101 批量操作存在 IP/设备/环境等因素的聚集性异常
1011 疑似 IP 属性聚集 出现 IP 聚集
1012 疑似设备属性聚集 出现设备聚集
102 自动机 疑似自动机批量请求
103 恶意行为-网赚 疑似网赚
104 微信登录态无效 检查 WeChatAccessToken 参数，是否已经失效
201 环境风险 环境异常 操作 IP/设备/环境存在异常。当前 IP 为非常用 IP 或恶意 IP 段
2011 疑似非常用 IP 请求 当前请求 IP 非该账号常用 IP
2012 疑似 IP 异常 使用 idc 机房 IP 或使用代理 IP 或使用恶意 IP 等
205 非公网有效IP 传进来的 IP 地址为内网 IP 地址或者 IP 保留地址
设备风险
206 设备异常 该设备存在异常的使用行为
2061 疑似非常用设备 当前请求的设备非该账号常用设备
2062 疑似虚拟设备 请求设备为模拟器、脚本、云设备等虚拟设备
2063 疑似群控设备 请求设备为猫池、手机墙等群控设备
10201 设备处于开发者模式 来源于Android
10202 设备疑似 Root 来源于Android
10203 疑似应用被注 来源于Android
10204 疑似应用被重打包 来源于Android
10205 疑似使用 hook 技术 来源于Android
10206 疑似应用被双开 来源于Android
10207 疑似设备存在风险进程 来源于Android
10208 疑似伪造地理位置 来源于Android
10209 疑似使用 VPN 软件 来源于Android
10210 疑似使用代理软件 来源于Android
10211 疑似设备处于调试模式 来源于Android
10212 疑似高危 ROM 来源于Android
10213 疑似检测到系统劫持 来源于Android
10003 疑似模拟器 来源于Android
10301 疑似主流模拟器 来源于Android
10302 疑似云模拟器 来源于Android
10303 疑似开发板设备 来源于Android
10004 疑似群控设备风险 来源于Android
10401 疑似使用自动化软件 来源于Android
10402 疑似群控自动化操作 来源于Android
10501 疑似参数异常-IMEI 来源于Android
10502 疑似参数异常-FP 来源于Android
10504 疑似参数异常-IMSI 来源于Android
10801 疑似存在刷量安装应用的行为 来源于Android
10901 疑似多账号异常 来源于Android
11001 疑似设备参数篡改 来源于Android
11002 疑似存在风险软件 来源于Android
11003 疑似应用被调试 来源于Android
11100 疑似云真机 来源于Android
25001 设备疑似越狱 来源于IOS
25004 进程疑似有注入文件 来源于IOS
25005 疑似使用代理软件 来源于IOS
25006 疑似使用 VPN 软件 来源于IOS
25007 疑似被 Hook 来源于IOS
25008 疑似进程被调试 来源于IOS
25009 疑似多开 来源于IOS
25010 疑似改机 来源于IOS
25011 疑似应用二次打包 来源于IOS
25012 疑似模拟器 来源于IOS
25013 疑似云真机 来源于IOS
25014 疑似云模拟器 来源于IOS
25015 疑似伪造地理位置 来源于IOS
25016 疑似使用自动化脚本 来源于IOS
25017 疑似群控自动化操作 来源于IOS
30001 疑似虚拟浏览器 来源于H5
30002 疑似安装作弊插件 来源于H5
30003 疑似浏览器参数遭篡改 来源于H5
30004 疑似 JS 代码被篡改 来源于H5
30005 疑似 JS 被调试 来源于H5
30006 Cookies 被禁用 来源于H5
40001 疑似伪造地理位置 来源于小程序
40002 疑似被调试 来源于小程序
40003 疑似模拟器 来源于小程序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLabels")
    @Expose
    private Long [] RiskLabels;

    /**
     * Get SSID值 
     * @return SSID SSID值
     */
    public String getSSID() {
        return this.SSID;
    }

    /**
     * Set SSID值
     * @param SSID SSID值
     */
    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    /**
     * Get 风险价值分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 风险价值分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 风险价值分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 风险价值分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 风险标签，请参考官网风险类型
账号风险
1 账号信用低 账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
11 疑似低活跃账号 账号活跃度与正常用户有差异
2 垃圾账号 疑似批量注册小号，近期存在严重违规或大量举报
21 疑似小号 账号有疑似线上养号，小号等行为
22 疑似违规账号 账号曾有违规行为、曾被举报过、曾因违规被处罚过等
3 无效账号 送检账号参数无法成功解析，请检查微信 Openid 是否有误/Appid与QQopenid无法关联/微信Openid权限是否有开通/手机号是否为中国大陆手机号
4 黑名单 该账号在业务侧有过拉黑记录
5 白名单 业务自行有添加过白名单记录
行为风险
101 批量操作存在 IP/设备/环境等因素的聚集性异常
1011 疑似 IP 属性聚集 出现 IP 聚集
1012 疑似设备属性聚集 出现设备聚集
102 自动机 疑似自动机批量请求
103 恶意行为-网赚 疑似网赚
104 微信登录态无效 检查 WeChatAccessToken 参数，是否已经失效
201 环境风险 环境异常 操作 IP/设备/环境存在异常。当前 IP 为非常用 IP 或恶意 IP 段
2011 疑似非常用 IP 请求 当前请求 IP 非该账号常用 IP
2012 疑似 IP 异常 使用 idc 机房 IP 或使用代理 IP 或使用恶意 IP 等
205 非公网有效IP 传进来的 IP 地址为内网 IP 地址或者 IP 保留地址
设备风险
206 设备异常 该设备存在异常的使用行为
2061 疑似非常用设备 当前请求的设备非该账号常用设备
2062 疑似虚拟设备 请求设备为模拟器、脚本、云设备等虚拟设备
2063 疑似群控设备 请求设备为猫池、手机墙等群控设备
10201 设备处于开发者模式 来源于Android
10202 设备疑似 Root 来源于Android
10203 疑似应用被注 来源于Android
10204 疑似应用被重打包 来源于Android
10205 疑似使用 hook 技术 来源于Android
10206 疑似应用被双开 来源于Android
10207 疑似设备存在风险进程 来源于Android
10208 疑似伪造地理位置 来源于Android
10209 疑似使用 VPN 软件 来源于Android
10210 疑似使用代理软件 来源于Android
10211 疑似设备处于调试模式 来源于Android
10212 疑似高危 ROM 来源于Android
10213 疑似检测到系统劫持 来源于Android
10003 疑似模拟器 来源于Android
10301 疑似主流模拟器 来源于Android
10302 疑似云模拟器 来源于Android
10303 疑似开发板设备 来源于Android
10004 疑似群控设备风险 来源于Android
10401 疑似使用自动化软件 来源于Android
10402 疑似群控自动化操作 来源于Android
10501 疑似参数异常-IMEI 来源于Android
10502 疑似参数异常-FP 来源于Android
10504 疑似参数异常-IMSI 来源于Android
10801 疑似存在刷量安装应用的行为 来源于Android
10901 疑似多账号异常 来源于Android
11001 疑似设备参数篡改 来源于Android
11002 疑似存在风险软件 来源于Android
11003 疑似应用被调试 来源于Android
11100 疑似云真机 来源于Android
25001 设备疑似越狱 来源于IOS
25004 进程疑似有注入文件 来源于IOS
25005 疑似使用代理软件 来源于IOS
25006 疑似使用 VPN 软件 来源于IOS
25007 疑似被 Hook 来源于IOS
25008 疑似进程被调试 来源于IOS
25009 疑似多开 来源于IOS
25010 疑似改机 来源于IOS
25011 疑似应用二次打包 来源于IOS
25012 疑似模拟器 来源于IOS
25013 疑似云真机 来源于IOS
25014 疑似云模拟器 来源于IOS
25015 疑似伪造地理位置 来源于IOS
25016 疑似使用自动化脚本 来源于IOS
25017 疑似群控自动化操作 来源于IOS
30001 疑似虚拟浏览器 来源于H5
30002 疑似安装作弊插件 来源于H5
30003 疑似浏览器参数遭篡改 来源于H5
30004 疑似 JS 代码被篡改 来源于H5
30005 疑似 JS 被调试 来源于H5
30006 Cookies 被禁用 来源于H5
40001 疑似伪造地理位置 来源于小程序
40002 疑似被调试 来源于小程序
40003 疑似模拟器 来源于小程序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLabels 风险标签，请参考官网风险类型
账号风险
1 账号信用低 账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
11 疑似低活跃账号 账号活跃度与正常用户有差异
2 垃圾账号 疑似批量注册小号，近期存在严重违规或大量举报
21 疑似小号 账号有疑似线上养号，小号等行为
22 疑似违规账号 账号曾有违规行为、曾被举报过、曾因违规被处罚过等
3 无效账号 送检账号参数无法成功解析，请检查微信 Openid 是否有误/Appid与QQopenid无法关联/微信Openid权限是否有开通/手机号是否为中国大陆手机号
4 黑名单 该账号在业务侧有过拉黑记录
5 白名单 业务自行有添加过白名单记录
行为风险
101 批量操作存在 IP/设备/环境等因素的聚集性异常
1011 疑似 IP 属性聚集 出现 IP 聚集
1012 疑似设备属性聚集 出现设备聚集
102 自动机 疑似自动机批量请求
103 恶意行为-网赚 疑似网赚
104 微信登录态无效 检查 WeChatAccessToken 参数，是否已经失效
201 环境风险 环境异常 操作 IP/设备/环境存在异常。当前 IP 为非常用 IP 或恶意 IP 段
2011 疑似非常用 IP 请求 当前请求 IP 非该账号常用 IP
2012 疑似 IP 异常 使用 idc 机房 IP 或使用代理 IP 或使用恶意 IP 等
205 非公网有效IP 传进来的 IP 地址为内网 IP 地址或者 IP 保留地址
设备风险
206 设备异常 该设备存在异常的使用行为
2061 疑似非常用设备 当前请求的设备非该账号常用设备
2062 疑似虚拟设备 请求设备为模拟器、脚本、云设备等虚拟设备
2063 疑似群控设备 请求设备为猫池、手机墙等群控设备
10201 设备处于开发者模式 来源于Android
10202 设备疑似 Root 来源于Android
10203 疑似应用被注 来源于Android
10204 疑似应用被重打包 来源于Android
10205 疑似使用 hook 技术 来源于Android
10206 疑似应用被双开 来源于Android
10207 疑似设备存在风险进程 来源于Android
10208 疑似伪造地理位置 来源于Android
10209 疑似使用 VPN 软件 来源于Android
10210 疑似使用代理软件 来源于Android
10211 疑似设备处于调试模式 来源于Android
10212 疑似高危 ROM 来源于Android
10213 疑似检测到系统劫持 来源于Android
10003 疑似模拟器 来源于Android
10301 疑似主流模拟器 来源于Android
10302 疑似云模拟器 来源于Android
10303 疑似开发板设备 来源于Android
10004 疑似群控设备风险 来源于Android
10401 疑似使用自动化软件 来源于Android
10402 疑似群控自动化操作 来源于Android
10501 疑似参数异常-IMEI 来源于Android
10502 疑似参数异常-FP 来源于Android
10504 疑似参数异常-IMSI 来源于Android
10801 疑似存在刷量安装应用的行为 来源于Android
10901 疑似多账号异常 来源于Android
11001 疑似设备参数篡改 来源于Android
11002 疑似存在风险软件 来源于Android
11003 疑似应用被调试 来源于Android
11100 疑似云真机 来源于Android
25001 设备疑似越狱 来源于IOS
25004 进程疑似有注入文件 来源于IOS
25005 疑似使用代理软件 来源于IOS
25006 疑似使用 VPN 软件 来源于IOS
25007 疑似被 Hook 来源于IOS
25008 疑似进程被调试 来源于IOS
25009 疑似多开 来源于IOS
25010 疑似改机 来源于IOS
25011 疑似应用二次打包 来源于IOS
25012 疑似模拟器 来源于IOS
25013 疑似云真机 来源于IOS
25014 疑似云模拟器 来源于IOS
25015 疑似伪造地理位置 来源于IOS
25016 疑似使用自动化脚本 来源于IOS
25017 疑似群控自动化操作 来源于IOS
30001 疑似虚拟浏览器 来源于H5
30002 疑似安装作弊插件 来源于H5
30003 疑似浏览器参数遭篡改 来源于H5
30004 疑似 JS 代码被篡改 来源于H5
30005 疑似 JS 被调试 来源于H5
30006 Cookies 被禁用 来源于H5
40001 疑似伪造地理位置 来源于小程序
40002 疑似被调试 来源于小程序
40003 疑似模拟器 来源于小程序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRiskLabels() {
        return this.RiskLabels;
    }

    /**
     * Set 风险标签，请参考官网风险类型
账号风险
1 账号信用低 账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
11 疑似低活跃账号 账号活跃度与正常用户有差异
2 垃圾账号 疑似批量注册小号，近期存在严重违规或大量举报
21 疑似小号 账号有疑似线上养号，小号等行为
22 疑似违规账号 账号曾有违规行为、曾被举报过、曾因违规被处罚过等
3 无效账号 送检账号参数无法成功解析，请检查微信 Openid 是否有误/Appid与QQopenid无法关联/微信Openid权限是否有开通/手机号是否为中国大陆手机号
4 黑名单 该账号在业务侧有过拉黑记录
5 白名单 业务自行有添加过白名单记录
行为风险
101 批量操作存在 IP/设备/环境等因素的聚集性异常
1011 疑似 IP 属性聚集 出现 IP 聚集
1012 疑似设备属性聚集 出现设备聚集
102 自动机 疑似自动机批量请求
103 恶意行为-网赚 疑似网赚
104 微信登录态无效 检查 WeChatAccessToken 参数，是否已经失效
201 环境风险 环境异常 操作 IP/设备/环境存在异常。当前 IP 为非常用 IP 或恶意 IP 段
2011 疑似非常用 IP 请求 当前请求 IP 非该账号常用 IP
2012 疑似 IP 异常 使用 idc 机房 IP 或使用代理 IP 或使用恶意 IP 等
205 非公网有效IP 传进来的 IP 地址为内网 IP 地址或者 IP 保留地址
设备风险
206 设备异常 该设备存在异常的使用行为
2061 疑似非常用设备 当前请求的设备非该账号常用设备
2062 疑似虚拟设备 请求设备为模拟器、脚本、云设备等虚拟设备
2063 疑似群控设备 请求设备为猫池、手机墙等群控设备
10201 设备处于开发者模式 来源于Android
10202 设备疑似 Root 来源于Android
10203 疑似应用被注 来源于Android
10204 疑似应用被重打包 来源于Android
10205 疑似使用 hook 技术 来源于Android
10206 疑似应用被双开 来源于Android
10207 疑似设备存在风险进程 来源于Android
10208 疑似伪造地理位置 来源于Android
10209 疑似使用 VPN 软件 来源于Android
10210 疑似使用代理软件 来源于Android
10211 疑似设备处于调试模式 来源于Android
10212 疑似高危 ROM 来源于Android
10213 疑似检测到系统劫持 来源于Android
10003 疑似模拟器 来源于Android
10301 疑似主流模拟器 来源于Android
10302 疑似云模拟器 来源于Android
10303 疑似开发板设备 来源于Android
10004 疑似群控设备风险 来源于Android
10401 疑似使用自动化软件 来源于Android
10402 疑似群控自动化操作 来源于Android
10501 疑似参数异常-IMEI 来源于Android
10502 疑似参数异常-FP 来源于Android
10504 疑似参数异常-IMSI 来源于Android
10801 疑似存在刷量安装应用的行为 来源于Android
10901 疑似多账号异常 来源于Android
11001 疑似设备参数篡改 来源于Android
11002 疑似存在风险软件 来源于Android
11003 疑似应用被调试 来源于Android
11100 疑似云真机 来源于Android
25001 设备疑似越狱 来源于IOS
25004 进程疑似有注入文件 来源于IOS
25005 疑似使用代理软件 来源于IOS
25006 疑似使用 VPN 软件 来源于IOS
25007 疑似被 Hook 来源于IOS
25008 疑似进程被调试 来源于IOS
25009 疑似多开 来源于IOS
25010 疑似改机 来源于IOS
25011 疑似应用二次打包 来源于IOS
25012 疑似模拟器 来源于IOS
25013 疑似云真机 来源于IOS
25014 疑似云模拟器 来源于IOS
25015 疑似伪造地理位置 来源于IOS
25016 疑似使用自动化脚本 来源于IOS
25017 疑似群控自动化操作 来源于IOS
30001 疑似虚拟浏览器 来源于H5
30002 疑似安装作弊插件 来源于H5
30003 疑似浏览器参数遭篡改 来源于H5
30004 疑似 JS 代码被篡改 来源于H5
30005 疑似 JS 被调试 来源于H5
30006 Cookies 被禁用 来源于H5
40001 疑似伪造地理位置 来源于小程序
40002 疑似被调试 来源于小程序
40003 疑似模拟器 来源于小程序
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLabels 风险标签，请参考官网风险类型
账号风险
1 账号信用低 账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
11 疑似低活跃账号 账号活跃度与正常用户有差异
2 垃圾账号 疑似批量注册小号，近期存在严重违规或大量举报
21 疑似小号 账号有疑似线上养号，小号等行为
22 疑似违规账号 账号曾有违规行为、曾被举报过、曾因违规被处罚过等
3 无效账号 送检账号参数无法成功解析，请检查微信 Openid 是否有误/Appid与QQopenid无法关联/微信Openid权限是否有开通/手机号是否为中国大陆手机号
4 黑名单 该账号在业务侧有过拉黑记录
5 白名单 业务自行有添加过白名单记录
行为风险
101 批量操作存在 IP/设备/环境等因素的聚集性异常
1011 疑似 IP 属性聚集 出现 IP 聚集
1012 疑似设备属性聚集 出现设备聚集
102 自动机 疑似自动机批量请求
103 恶意行为-网赚 疑似网赚
104 微信登录态无效 检查 WeChatAccessToken 参数，是否已经失效
201 环境风险 环境异常 操作 IP/设备/环境存在异常。当前 IP 为非常用 IP 或恶意 IP 段
2011 疑似非常用 IP 请求 当前请求 IP 非该账号常用 IP
2012 疑似 IP 异常 使用 idc 机房 IP 或使用代理 IP 或使用恶意 IP 等
205 非公网有效IP 传进来的 IP 地址为内网 IP 地址或者 IP 保留地址
设备风险
206 设备异常 该设备存在异常的使用行为
2061 疑似非常用设备 当前请求的设备非该账号常用设备
2062 疑似虚拟设备 请求设备为模拟器、脚本、云设备等虚拟设备
2063 疑似群控设备 请求设备为猫池、手机墙等群控设备
10201 设备处于开发者模式 来源于Android
10202 设备疑似 Root 来源于Android
10203 疑似应用被注 来源于Android
10204 疑似应用被重打包 来源于Android
10205 疑似使用 hook 技术 来源于Android
10206 疑似应用被双开 来源于Android
10207 疑似设备存在风险进程 来源于Android
10208 疑似伪造地理位置 来源于Android
10209 疑似使用 VPN 软件 来源于Android
10210 疑似使用代理软件 来源于Android
10211 疑似设备处于调试模式 来源于Android
10212 疑似高危 ROM 来源于Android
10213 疑似检测到系统劫持 来源于Android
10003 疑似模拟器 来源于Android
10301 疑似主流模拟器 来源于Android
10302 疑似云模拟器 来源于Android
10303 疑似开发板设备 来源于Android
10004 疑似群控设备风险 来源于Android
10401 疑似使用自动化软件 来源于Android
10402 疑似群控自动化操作 来源于Android
10501 疑似参数异常-IMEI 来源于Android
10502 疑似参数异常-FP 来源于Android
10504 疑似参数异常-IMSI 来源于Android
10801 疑似存在刷量安装应用的行为 来源于Android
10901 疑似多账号异常 来源于Android
11001 疑似设备参数篡改 来源于Android
11002 疑似存在风险软件 来源于Android
11003 疑似应用被调试 来源于Android
11100 疑似云真机 来源于Android
25001 设备疑似越狱 来源于IOS
25004 进程疑似有注入文件 来源于IOS
25005 疑似使用代理软件 来源于IOS
25006 疑似使用 VPN 软件 来源于IOS
25007 疑似被 Hook 来源于IOS
25008 疑似进程被调试 来源于IOS
25009 疑似多开 来源于IOS
25010 疑似改机 来源于IOS
25011 疑似应用二次打包 来源于IOS
25012 疑似模拟器 来源于IOS
25013 疑似云真机 来源于IOS
25014 疑似云模拟器 来源于IOS
25015 疑似伪造地理位置 来源于IOS
25016 疑似使用自动化脚本 来源于IOS
25017 疑似群控自动化操作 来源于IOS
30001 疑似虚拟浏览器 来源于H5
30002 疑似安装作弊插件 来源于H5
30003 疑似浏览器参数遭篡改 来源于H5
30004 疑似 JS 代码被篡改 来源于H5
30005 疑似 JS 被调试 来源于H5
30006 Cookies 被禁用 来源于H5
40001 疑似伪造地理位置 来源于小程序
40002 疑似被调试 来源于小程序
40003 疑似模拟器 来源于小程序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLabels(Long [] RiskLabels) {
        this.RiskLabels = RiskLabels;
    }

    public EvaluationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluationResult(EvaluationResult source) {
        if (source.SSID != null) {
            this.SSID = new String(source.SSID);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.RiskLabels != null) {
            this.RiskLabels = new Long[source.RiskLabels.length];
            for (int i = 0; i < source.RiskLabels.length; i++) {
                this.RiskLabels[i] = new Long(source.RiskLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSID", this.SSID);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "RiskLabels.", this.RiskLabels);

    }
}

