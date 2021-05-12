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
package com.tencentcloudapi.aa.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputManageMarketingRiskValue extends AbstractModel{

    /**
    * 账号ID。对应输入参数：
AccountType是1时，对应QQ的OpenID。
AccountType是2时，对应微信的OpenID/UnionID。
AccountType是4时，对应手机号。
AccountType是8时，对应imei、idfa、imeiMD5或者idfaMD5。
AccountType是0时，对应账号信息。
AccountType是10004时，对应手机号的MD5。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 操作时间戳，单位秒（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 操作来源的外网IP（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 风险值
pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险类型，请参考官网风险类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
     * Get 账号ID。对应输入参数：
AccountType是1时，对应QQ的OpenID。
AccountType是2时，对应微信的OpenID/UnionID。
AccountType是4时，对应手机号。
AccountType是8时，对应imei、idfa、imeiMD5或者idfaMD5。
AccountType是0时，对应账号信息。
AccountType是10004时，对应手机号的MD5。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 账号ID。对应输入参数：
AccountType是1时，对应QQ的OpenID。
AccountType是2时，对应微信的OpenID/UnionID。
AccountType是4时，对应手机号。
AccountType是8时，对应imei、idfa、imeiMD5或者idfaMD5。
AccountType是0时，对应账号信息。
AccountType是10004时，对应手机号的MD5。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 账号ID。对应输入参数：
AccountType是1时，对应QQ的OpenID。
AccountType是2时，对应微信的OpenID/UnionID。
AccountType是4时，对应手机号。
AccountType是8时，对应imei、idfa、imeiMD5或者idfaMD5。
AccountType是0时，对应账号信息。
AccountType是10004时，对应手机号的MD5。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 账号ID。对应输入参数：
AccountType是1时，对应QQ的OpenID。
AccountType是2时，对应微信的OpenID/UnionID。
AccountType是4时，对应手机号。
AccountType是8时，对应imei、idfa、imeiMD5或者idfaMD5。
AccountType是0时，对应账号信息。
AccountType是10004时，对应手机号的MD5。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 操作时间戳，单位秒（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostTime 操作时间戳，单位秒（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 操作时间戳，单位秒（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostTime 操作时间戳，单位秒（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateAccount 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateAccount 对应输入参数，AccountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 操作来源的外网IP（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIp 操作来源的外网IP（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 操作来源的外网IP（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIp 操作来源的外网IP（对应输入参数）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 风险值
pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险值
pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险值
pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险值
pass : 无恶意
review：需要人工审核
reject：拒绝，高风险恶意
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险类型，请参考官网风险类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskType 风险类型，请参考官网风险类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型，请参考官网风险类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskType 风险类型，请参考官网风险类型
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

