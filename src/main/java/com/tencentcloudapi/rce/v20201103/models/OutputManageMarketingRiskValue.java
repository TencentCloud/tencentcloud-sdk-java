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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputManageMarketingRiskValue extends AbstractModel {

    /**
    * <p>账号ID：对应输入参数。<br>当AccountType为1时，对应QQ的OpenId；<br>当AccountType为2时，对应微信的OpenId/UnionId；<br>当AccountType为10004时，对应手机号的MD5值；<br>当AccountType为10005时，对应手机号的SHA256值。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>操作时间戳，单位秒（对应输入参数）。</p>
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * <p>业务预留参数（暂无实际业务含义， 无需关注返回值）</p>
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * <p>操作来源的外网IP（对应输入参数）。</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>风险等级<br>pass：无恶意<br>review：低风险，需要人工审核<br>reject：高风险，建议拦截</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>风险类型，可能同时命中多个风险类型<br>1: 账号信用低。<br>11: 疑似低活跃账号。<br>2: 垃圾账号。<br>21: 疑似小号。<br>22: 疑似违规账号。<br>3: 无效账号。<br>4: 黑名单。<br>5: 白名单。<br>101: 批量操作。<br>1011: 疑似 IP 属性聚集。<br>1012: 疑似设备属性聚集。<br>102: 自动机。<br>103: 恶意行为。<br>104: 登录态无效。<br>201: 环境风险。<br>2011: 疑似非常用IP。<br>2012: 疑似 IP 异常。<br>205: 非公网有效 IP。</p>
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
    * <p>设备指纹ID，如果集成了设备指纹，并传入了正确的DeviceToken和Platform，该字段正常输出；如果DeviceToken异常（校验不通过），则会在RiskType中返回&quot;-1&quot;标签，ConstId字段为空；如果没有集成设备指纹ConstId字段默认为空。</p>
    */
    @SerializedName("ConstId")
    @Expose
    private String ConstId;

    /**
    * <p>风险扩展数据。</p>
    */
    @SerializedName("RiskInformation")
    @Expose
    private String RiskInformation;

    /**
     * Get <p>账号ID：对应输入参数。<br>当AccountType为1时，对应QQ的OpenId；<br>当AccountType为2时，对应微信的OpenId/UnionId；<br>当AccountType为10004时，对应手机号的MD5值；<br>当AccountType为10005时，对应手机号的SHA256值。</p> 
     * @return UserId <p>账号ID：对应输入参数。<br>当AccountType为1时，对应QQ的OpenId；<br>当AccountType为2时，对应微信的OpenId/UnionId；<br>当AccountType为10004时，对应手机号的MD5值；<br>当AccountType为10005时，对应手机号的SHA256值。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>账号ID：对应输入参数。<br>当AccountType为1时，对应QQ的OpenId；<br>当AccountType为2时，对应微信的OpenId/UnionId；<br>当AccountType为10004时，对应手机号的MD5值；<br>当AccountType为10005时，对应手机号的SHA256值。</p>
     * @param UserId <p>账号ID：对应输入参数。<br>当AccountType为1时，对应QQ的OpenId；<br>当AccountType为2时，对应微信的OpenId/UnionId；<br>当AccountType为10004时，对应手机号的MD5值；<br>当AccountType为10005时，对应手机号的SHA256值。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>操作时间戳，单位秒（对应输入参数）。</p> 
     * @return PostTime <p>操作时间戳，单位秒（对应输入参数）。</p>
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set <p>操作时间戳，单位秒（对应输入参数）。</p>
     * @param PostTime <p>操作时间戳，单位秒（对应输入参数）。</p>
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get <p>业务预留参数（暂无实际业务含义， 无需关注返回值）</p> 
     * @return AssociateAccount <p>业务预留参数（暂无实际业务含义， 无需关注返回值）</p>
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set <p>业务预留参数（暂无实际业务含义， 无需关注返回值）</p>
     * @param AssociateAccount <p>业务预留参数（暂无实际业务含义， 无需关注返回值）</p>
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get <p>操作来源的外网IP（对应输入参数）。</p> 
     * @return UserIp <p>操作来源的外网IP（对应输入参数）。</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>操作来源的外网IP（对应输入参数）。</p>
     * @param UserIp <p>操作来源的外网IP（对应输入参数）。</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>风险等级<br>pass：无恶意<br>review：低风险，需要人工审核<br>reject：高风险，建议拦截</p> 
     * @return RiskLevel <p>风险等级<br>pass：无恶意<br>review：低风险，需要人工审核<br>reject：高风险，建议拦截</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级<br>pass：无恶意<br>review：低风险，需要人工审核<br>reject：高风险，建议拦截</p>
     * @param RiskLevel <p>风险等级<br>pass：无恶意<br>review：低风险，需要人工审核<br>reject：高风险，建议拦截</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>风险类型，可能同时命中多个风险类型<br>1: 账号信用低。<br>11: 疑似低活跃账号。<br>2: 垃圾账号。<br>21: 疑似小号。<br>22: 疑似违规账号。<br>3: 无效账号。<br>4: 黑名单。<br>5: 白名单。<br>101: 批量操作。<br>1011: 疑似 IP 属性聚集。<br>1012: 疑似设备属性聚集。<br>102: 自动机。<br>103: 恶意行为。<br>104: 登录态无效。<br>201: 环境风险。<br>2011: 疑似非常用IP。<br>2012: 疑似 IP 异常。<br>205: 非公网有效 IP。</p> 
     * @return RiskType <p>风险类型，可能同时命中多个风险类型<br>1: 账号信用低。<br>11: 疑似低活跃账号。<br>2: 垃圾账号。<br>21: 疑似小号。<br>22: 疑似违规账号。<br>3: 无效账号。<br>4: 黑名单。<br>5: 白名单。<br>101: 批量操作。<br>1011: 疑似 IP 属性聚集。<br>1012: 疑似设备属性聚集。<br>102: 自动机。<br>103: 恶意行为。<br>104: 登录态无效。<br>201: 环境风险。<br>2011: 疑似非常用IP。<br>2012: 疑似 IP 异常。<br>205: 非公网有效 IP。</p>
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型，可能同时命中多个风险类型<br>1: 账号信用低。<br>11: 疑似低活跃账号。<br>2: 垃圾账号。<br>21: 疑似小号。<br>22: 疑似违规账号。<br>3: 无效账号。<br>4: 黑名单。<br>5: 白名单。<br>101: 批量操作。<br>1011: 疑似 IP 属性聚集。<br>1012: 疑似设备属性聚集。<br>102: 自动机。<br>103: 恶意行为。<br>104: 登录态无效。<br>201: 环境风险。<br>2011: 疑似非常用IP。<br>2012: 疑似 IP 异常。<br>205: 非公网有效 IP。</p>
     * @param RiskType <p>风险类型，可能同时命中多个风险类型<br>1: 账号信用低。<br>11: 疑似低活跃账号。<br>2: 垃圾账号。<br>21: 疑似小号。<br>22: 疑似违规账号。<br>3: 无效账号。<br>4: 黑名单。<br>5: 白名单。<br>101: 批量操作。<br>1011: 疑似 IP 属性聚集。<br>1012: 疑似设备属性聚集。<br>102: 自动机。<br>103: 恶意行为。<br>104: 登录态无效。<br>201: 环境风险。<br>2011: 疑似非常用IP。<br>2012: 疑似 IP 异常。<br>205: 非公网有效 IP。</p>
     */
    public void setRiskType(Long [] RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>设备指纹ID，如果集成了设备指纹，并传入了正确的DeviceToken和Platform，该字段正常输出；如果DeviceToken异常（校验不通过），则会在RiskType中返回&quot;-1&quot;标签，ConstId字段为空；如果没有集成设备指纹ConstId字段默认为空。</p> 
     * @return ConstId <p>设备指纹ID，如果集成了设备指纹，并传入了正确的DeviceToken和Platform，该字段正常输出；如果DeviceToken异常（校验不通过），则会在RiskType中返回&quot;-1&quot;标签，ConstId字段为空；如果没有集成设备指纹ConstId字段默认为空。</p>
     */
    public String getConstId() {
        return this.ConstId;
    }

    /**
     * Set <p>设备指纹ID，如果集成了设备指纹，并传入了正确的DeviceToken和Platform，该字段正常输出；如果DeviceToken异常（校验不通过），则会在RiskType中返回&quot;-1&quot;标签，ConstId字段为空；如果没有集成设备指纹ConstId字段默认为空。</p>
     * @param ConstId <p>设备指纹ID，如果集成了设备指纹，并传入了正确的DeviceToken和Platform，该字段正常输出；如果DeviceToken异常（校验不通过），则会在RiskType中返回&quot;-1&quot;标签，ConstId字段为空；如果没有集成设备指纹ConstId字段默认为空。</p>
     */
    public void setConstId(String ConstId) {
        this.ConstId = ConstId;
    }

    /**
     * Get <p>风险扩展数据。</p> 
     * @return RiskInformation <p>风险扩展数据。</p>
     */
    public String getRiskInformation() {
        return this.RiskInformation;
    }

    /**
     * Set <p>风险扩展数据。</p>
     * @param RiskInformation <p>风险扩展数据。</p>
     */
    public void setRiskInformation(String RiskInformation) {
        this.RiskInformation = RiskInformation;
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
        if (source.ConstId != null) {
            this.ConstId = new String(source.ConstId);
        }
        if (source.RiskInformation != null) {
            this.RiskInformation = new String(source.RiskInformation);
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
        this.setParamSimple(map, prefix + "ConstId", this.ConstId);
        this.setParamSimple(map, prefix + "RiskInformation", this.RiskInformation);

    }
}

