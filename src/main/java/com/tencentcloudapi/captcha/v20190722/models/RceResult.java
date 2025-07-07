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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RceResult extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 操作时间戳
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 业务参数
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 用户Ip
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
    * 设备唯一ID
    */
    @SerializedName("ConstId")
    @Expose
    private String ConstId;

    /**
    * 风险扩展参数
    */
    @SerializedName("RiskInformation")
    @Expose
    private String RiskInformation;

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 操作时间戳 
     * @return PostTime 操作时间戳
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 操作时间戳
     * @param PostTime 操作时间戳
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 业务参数 
     * @return AssociateAccount 业务参数
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set 业务参数
     * @param AssociateAccount 业务参数
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 用户Ip 
     * @return UserIp 用户Ip
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户Ip
     * @param UserIp 用户Ip
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险类型 
     * @return RiskType 风险类型
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
     * @param RiskType 风险类型
     */
    public void setRiskType(Long [] RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 设备唯一ID 
     * @return ConstId 设备唯一ID
     */
    public String getConstId() {
        return this.ConstId;
    }

    /**
     * Set 设备唯一ID
     * @param ConstId 设备唯一ID
     */
    public void setConstId(String ConstId) {
        this.ConstId = ConstId;
    }

    /**
     * Get 风险扩展参数 
     * @return RiskInformation 风险扩展参数
     */
    public String getRiskInformation() {
        return this.RiskInformation;
    }

    /**
     * Set 风险扩展参数
     * @param RiskInformation 风险扩展参数
     */
    public void setRiskInformation(String RiskInformation) {
        this.RiskInformation = RiskInformation;
    }

    public RceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RceResult(RceResult source) {
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

