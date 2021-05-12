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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputManageMarketingRiskValue extends AbstractModel{

    /**
    * 账号 ID。对应输入参数： AccountType 是 1 时，对应 QQ 的 OpenID。
AccountType 是 2 时，对应微信的 OpenID/UnionID。
AccountType 是 4 时，对应手机号。
AccountType 是 8 时，对应 imei、idfa、imeiMD5 或者 idfaMD5。
AccountType 是 0 时，对应账号信息。
AccountType 是 10004 时，对应手机号的 MD5。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 操作时间戳，单位秒（对应输入参数）。 
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录 后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 业务详情。 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 风险值 pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险类型，请查看下面详细说明 注意：此字段可能返回 null，表示取不到有效值。
账号风险	
        账号信用低	1	账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
	疑似 低活跃账号	11	账号活跃度与正常用户有差异
	垃圾账号	2	疑似批量注册小号，近期存在严重违规或大量举报
	疑似小号	21	账号有疑似线上养号，小号等行为
	疑似 违规账号	22	账号曾有违规行为、曾被举报过、曾因违规被处罚过等
	无效账号	3	送检账号参数无法成功解析，请检查微信 openid 是否有
	黑名单	4	该账号在业务侧有过拉黑记录
	白名单 	5	业务自行有添加过白名单记录
行为风险	
        批量操作	101	存在 ip/设备/环境等因素的聚集性异常
	疑似 IP 属性聚集 	1011	出现 IP 聚集
	疑似 设备属性聚集 	1012	出现设备聚集
	自动机 	103	疑似自动机批量请求
	微信登录态无效 	104	检查 wxtoken 参数，是否已经失效
环境风险	
        环境异常 	201	操作 ip/设备/环境存在异常。当前 ip 为非常用 ip 或恶意 ip 段
	疑似 非常用IP请求 	2011	当前请求 IP 非该账号常用 IP
	疑似 IP 异常 	2012	使用 idc 机房 ip 或 使用代理 ip 或 使用恶意 ip 
	非公网有效 ip 	205	传进来的 IP 地址为内网 ip 地址或者 ip 保留地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
     * Get 账号 ID。对应输入参数： AccountType 是 1 时，对应 QQ 的 OpenID。
AccountType 是 2 时，对应微信的 OpenID/UnionID。
AccountType 是 4 时，对应手机号。
AccountType 是 8 时，对应 imei、idfa、imeiMD5 或者 idfaMD5。
AccountType 是 0 时，对应账号信息。
AccountType 是 10004 时，对应手机号的 MD5。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 账号 ID。对应输入参数： AccountType 是 1 时，对应 QQ 的 OpenID。
AccountType 是 2 时，对应微信的 OpenID/UnionID。
AccountType 是 4 时，对应手机号。
AccountType 是 8 时，对应 imei、idfa、imeiMD5 或者 idfaMD5。
AccountType 是 0 时，对应账号信息。
AccountType 是 10004 时，对应手机号的 MD5。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 账号 ID。对应输入参数： AccountType 是 1 时，对应 QQ 的 OpenID。
AccountType 是 2 时，对应微信的 OpenID/UnionID。
AccountType 是 4 时，对应手机号。
AccountType 是 8 时，对应 imei、idfa、imeiMD5 或者 idfaMD5。
AccountType 是 0 时，对应账号信息。
AccountType 是 10004 时，对应手机号的 MD5。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 账号 ID。对应输入参数： AccountType 是 1 时，对应 QQ 的 OpenID。
AccountType 是 2 时，对应微信的 OpenID/UnionID。
AccountType 是 4 时，对应手机号。
AccountType 是 8 时，对应 imei、idfa、imeiMD5 或者 idfaMD5。
AccountType 是 0 时，对应账号信息。
AccountType 是 10004 时，对应手机号的 MD5。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 操作时间戳，单位秒（对应输入参数）。 
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostTime 操作时间戳，单位秒（对应输入参数）。 
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 操作时间戳，单位秒（对应输入参数）。 
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostTime 操作时间戳，单位秒（对应输入参数）。 
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录 后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateAccount 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录 后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录 后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateAccount 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录 后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 业务详情。 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIp 业务详情。 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 业务详情。 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIp 业务详情。 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 风险值 pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险值 pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险值 pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险值 pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险类型，请查看下面详细说明 注意：此字段可能返回 null，表示取不到有效值。
账号风险	
        账号信用低	1	账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
	疑似 低活跃账号	11	账号活跃度与正常用户有差异
	垃圾账号	2	疑似批量注册小号，近期存在严重违规或大量举报
	疑似小号	21	账号有疑似线上养号，小号等行为
	疑似 违规账号	22	账号曾有违规行为、曾被举报过、曾因违规被处罚过等
	无效账号	3	送检账号参数无法成功解析，请检查微信 openid 是否有
	黑名单	4	该账号在业务侧有过拉黑记录
	白名单 	5	业务自行有添加过白名单记录
行为风险	
        批量操作	101	存在 ip/设备/环境等因素的聚集性异常
	疑似 IP 属性聚集 	1011	出现 IP 聚集
	疑似 设备属性聚集 	1012	出现设备聚集
	自动机 	103	疑似自动机批量请求
	微信登录态无效 	104	检查 wxtoken 参数，是否已经失效
环境风险	
        环境异常 	201	操作 ip/设备/环境存在异常。当前 ip 为非常用 ip 或恶意 ip 段
	疑似 非常用IP请求 	2011	当前请求 IP 非该账号常用 IP
	疑似 IP 异常 	2012	使用 idc 机房 ip 或 使用代理 ip 或 使用恶意 ip 
	非公网有效 ip 	205	传进来的 IP 地址为内网 ip 地址或者 ip 保留地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskType 风险类型，请查看下面详细说明 注意：此字段可能返回 null，表示取不到有效值。
账号风险	
        账号信用低	1	账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
	疑似 低活跃账号	11	账号活跃度与正常用户有差异
	垃圾账号	2	疑似批量注册小号，近期存在严重违规或大量举报
	疑似小号	21	账号有疑似线上养号，小号等行为
	疑似 违规账号	22	账号曾有违规行为、曾被举报过、曾因违规被处罚过等
	无效账号	3	送检账号参数无法成功解析，请检查微信 openid 是否有
	黑名单	4	该账号在业务侧有过拉黑记录
	白名单 	5	业务自行有添加过白名单记录
行为风险	
        批量操作	101	存在 ip/设备/环境等因素的聚集性异常
	疑似 IP 属性聚集 	1011	出现 IP 聚集
	疑似 设备属性聚集 	1012	出现设备聚集
	自动机 	103	疑似自动机批量请求
	微信登录态无效 	104	检查 wxtoken 参数，是否已经失效
环境风险	
        环境异常 	201	操作 ip/设备/环境存在异常。当前 ip 为非常用 ip 或恶意 ip 段
	疑似 非常用IP请求 	2011	当前请求 IP 非该账号常用 IP
	疑似 IP 异常 	2012	使用 idc 机房 ip 或 使用代理 ip 或 使用恶意 ip 
	非公网有效 ip 	205	传进来的 IP 地址为内网 ip 地址或者 ip 保留地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型，请查看下面详细说明 注意：此字段可能返回 null，表示取不到有效值。
账号风险	
        账号信用低	1	账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
	疑似 低活跃账号	11	账号活跃度与正常用户有差异
	垃圾账号	2	疑似批量注册小号，近期存在严重违规或大量举报
	疑似小号	21	账号有疑似线上养号，小号等行为
	疑似 违规账号	22	账号曾有违规行为、曾被举报过、曾因违规被处罚过等
	无效账号	3	送检账号参数无法成功解析，请检查微信 openid 是否有
	黑名单	4	该账号在业务侧有过拉黑记录
	白名单 	5	业务自行有添加过白名单记录
行为风险	
        批量操作	101	存在 ip/设备/环境等因素的聚集性异常
	疑似 IP 属性聚集 	1011	出现 IP 聚集
	疑似 设备属性聚集 	1012	出现设备聚集
	自动机 	103	疑似自动机批量请求
	微信登录态无效 	104	检查 wxtoken 参数，是否已经失效
环境风险	
        环境异常 	201	操作 ip/设备/环境存在异常。当前 ip 为非常用 ip 或恶意 ip 段
	疑似 非常用IP请求 	2011	当前请求 IP 非该账号常用 IP
	疑似 IP 异常 	2012	使用 idc 机房 ip 或 使用代理 ip 或 使用恶意 ip 
	非公网有效 ip 	205	传进来的 IP 地址为内网 ip 地址或者 ip 保留地
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskType 风险类型，请查看下面详细说明 注意：此字段可能返回 null，表示取不到有效值。
账号风险	
        账号信用低	1	账号近期存在因恶意被处罚历史，网络低活跃，被举报等因素
	疑似 低活跃账号	11	账号活跃度与正常用户有差异
	垃圾账号	2	疑似批量注册小号，近期存在严重违规或大量举报
	疑似小号	21	账号有疑似线上养号，小号等行为
	疑似 违规账号	22	账号曾有违规行为、曾被举报过、曾因违规被处罚过等
	无效账号	3	送检账号参数无法成功解析，请检查微信 openid 是否有
	黑名单	4	该账号在业务侧有过拉黑记录
	白名单 	5	业务自行有添加过白名单记录
行为风险	
        批量操作	101	存在 ip/设备/环境等因素的聚集性异常
	疑似 IP 属性聚集 	1011	出现 IP 聚集
	疑似 设备属性聚集 	1012	出现设备聚集
	自动机 	103	疑似自动机批量请求
	微信登录态无效 	104	检查 wxtoken 参数，是否已经失效
环境风险	
        环境异常 	201	操作 ip/设备/环境存在异常。当前 ip 为非常用 ip 或恶意 ip 段
	疑似 非常用IP请求 	2011	当前请求 IP 非该账号常用 IP
	疑似 IP 异常 	2012	使用 idc 机房 ip 或 使用代理 ip 或 使用恶意 ip 
	非公网有效 ip 	205	传进来的 IP 地址为内网 ip 地址或者 ip 保留地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskType(Long [] RiskType) {
        this.RiskType = RiskType;
    }

    public OutputManageMarketingRiskValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputManageMarketingRiskValue(OutputManageMarketingRiskValue source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PostTime != null) {
            this.PostTime = new Long(source.PostTime);
        }
        if (source.AssociateAccount != null) {
            this.AssociateAccount = new String(source.AssociateAccount);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "AssociateAccount", this.AssociateAccount);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "RiskType.", this.RiskType);

    }
}

