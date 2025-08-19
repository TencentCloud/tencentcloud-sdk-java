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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OccupiedSeal extends AbstractModel {

    /**
    * 电子印章编号
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 电子印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 电子印章授权时间戳，单位秒
    */
    @SerializedName("CreateOn")
    @Expose
    private Long CreateOn;

    /**
    * 电子印章授权人的UserId
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 电子印章策略Id
    */
    @SerializedName("SealPolicyId")
    @Expose
    private String SealPolicyId;

    /**
    * 印章状态，有以下六种：CHECKING（审核中）SUCCESS（已启用）FAIL（审核拒绝）CHECKING-SADM（待超管审核）DISABLE（已停用）STOPPED（已终止）
    */
    @SerializedName("SealStatus")
    @Expose
    private String SealStatus;

    /**
    * 审核失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 印章图片url，5分钟内有效
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 用印申请是否为永久授权，true-是，false-否
    */
    @SerializedName("IsAllTime")
    @Expose
    private Boolean IsAllTime;

    /**
    * 授权人列表
    */
    @SerializedName("AuthorizedUsers")
    @Expose
    private AuthorizedUser [] AuthorizedUsers;

    /**
    * 印章扩展数据信息
    */
    @SerializedName("ExtendScene")
    @Expose
    private ExtendScene ExtendScene;

    /**
    * 印章的真实宽度，单位毫米
    */
    @SerializedName("RealWidth")
    @Expose
    private Long RealWidth;

    /**
    * 印章的真实高度，单位毫米
    */
    @SerializedName("RealHeight")
    @Expose
    private Long RealHeight;

    /**
    * 自定义子类型印章
    */
    @SerializedName("SubSealType")
    @Expose
    private String SubSealType;

    /**
    * 自定义子类型印章名称
    */
    @SerializedName("SubSealName")
    @Expose
    private String SubSealName;

    /**
    * 印章描述
    */
    @SerializedName("SealDescription")
    @Expose
    private String SealDescription;

    /**
     * Get 电子印章编号 
     * @return SealId 电子印章编号
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 电子印章编号
     * @param SealId 电子印章编号
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 电子印章名称 
     * @return SealName 电子印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 电子印章名称
     * @param SealName 电子印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 电子印章授权时间戳，单位秒 
     * @return CreateOn 电子印章授权时间戳，单位秒
     */
    public Long getCreateOn() {
        return this.CreateOn;
    }

    /**
     * Set 电子印章授权时间戳，单位秒
     * @param CreateOn 电子印章授权时间戳，单位秒
     */
    public void setCreateOn(Long CreateOn) {
        this.CreateOn = CreateOn;
    }

    /**
     * Get 电子印章授权人的UserId 
     * @return Creator 电子印章授权人的UserId
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 电子印章授权人的UserId
     * @param Creator 电子印章授权人的UserId
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 电子印章策略Id 
     * @return SealPolicyId 电子印章策略Id
     */
    public String getSealPolicyId() {
        return this.SealPolicyId;
    }

    /**
     * Set 电子印章策略Id
     * @param SealPolicyId 电子印章策略Id
     */
    public void setSealPolicyId(String SealPolicyId) {
        this.SealPolicyId = SealPolicyId;
    }

    /**
     * Get 印章状态，有以下六种：CHECKING（审核中）SUCCESS（已启用）FAIL（审核拒绝）CHECKING-SADM（待超管审核）DISABLE（已停用）STOPPED（已终止） 
     * @return SealStatus 印章状态，有以下六种：CHECKING（审核中）SUCCESS（已启用）FAIL（审核拒绝）CHECKING-SADM（待超管审核）DISABLE（已停用）STOPPED（已终止）
     */
    public String getSealStatus() {
        return this.SealStatus;
    }

    /**
     * Set 印章状态，有以下六种：CHECKING（审核中）SUCCESS（已启用）FAIL（审核拒绝）CHECKING-SADM（待超管审核）DISABLE（已停用）STOPPED（已终止）
     * @param SealStatus 印章状态，有以下六种：CHECKING（审核中）SUCCESS（已启用）FAIL（审核拒绝）CHECKING-SADM（待超管审核）DISABLE（已停用）STOPPED（已终止）
     */
    public void setSealStatus(String SealStatus) {
        this.SealStatus = SealStatus;
    }

    /**
     * Get 审核失败原因 
     * @return FailReason 审核失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 审核失败原因
     * @param FailReason 审核失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 印章图片url，5分钟内有效 
     * @return Url 印章图片url，5分钟内有效
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 印章图片url，5分钟内有效
     * @param Url 印章图片url，5分钟内有效
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章 
     * @return SealType 印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章
     * @param SealType 印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 用印申请是否为永久授权，true-是，false-否 
     * @return IsAllTime 用印申请是否为永久授权，true-是，false-否
     */
    public Boolean getIsAllTime() {
        return this.IsAllTime;
    }

    /**
     * Set 用印申请是否为永久授权，true-是，false-否
     * @param IsAllTime 用印申请是否为永久授权，true-是，false-否
     */
    public void setIsAllTime(Boolean IsAllTime) {
        this.IsAllTime = IsAllTime;
    }

    /**
     * Get 授权人列表 
     * @return AuthorizedUsers 授权人列表
     */
    public AuthorizedUser [] getAuthorizedUsers() {
        return this.AuthorizedUsers;
    }

    /**
     * Set 授权人列表
     * @param AuthorizedUsers 授权人列表
     */
    public void setAuthorizedUsers(AuthorizedUser [] AuthorizedUsers) {
        this.AuthorizedUsers = AuthorizedUsers;
    }

    /**
     * Get 印章扩展数据信息 
     * @return ExtendScene 印章扩展数据信息
     */
    public ExtendScene getExtendScene() {
        return this.ExtendScene;
    }

    /**
     * Set 印章扩展数据信息
     * @param ExtendScene 印章扩展数据信息
     */
    public void setExtendScene(ExtendScene ExtendScene) {
        this.ExtendScene = ExtendScene;
    }

    /**
     * Get 印章的真实宽度，单位毫米 
     * @return RealWidth 印章的真实宽度，单位毫米
     */
    public Long getRealWidth() {
        return this.RealWidth;
    }

    /**
     * Set 印章的真实宽度，单位毫米
     * @param RealWidth 印章的真实宽度，单位毫米
     */
    public void setRealWidth(Long RealWidth) {
        this.RealWidth = RealWidth;
    }

    /**
     * Get 印章的真实高度，单位毫米 
     * @return RealHeight 印章的真实高度，单位毫米
     */
    public Long getRealHeight() {
        return this.RealHeight;
    }

    /**
     * Set 印章的真实高度，单位毫米
     * @param RealHeight 印章的真实高度，单位毫米
     */
    public void setRealHeight(Long RealHeight) {
        this.RealHeight = RealHeight;
    }

    /**
     * Get 自定义子类型印章 
     * @return SubSealType 自定义子类型印章
     */
    public String getSubSealType() {
        return this.SubSealType;
    }

    /**
     * Set 自定义子类型印章
     * @param SubSealType 自定义子类型印章
     */
    public void setSubSealType(String SubSealType) {
        this.SubSealType = SubSealType;
    }

    /**
     * Get 自定义子类型印章名称 
     * @return SubSealName 自定义子类型印章名称
     */
    public String getSubSealName() {
        return this.SubSealName;
    }

    /**
     * Set 自定义子类型印章名称
     * @param SubSealName 自定义子类型印章名称
     */
    public void setSubSealName(String SubSealName) {
        this.SubSealName = SubSealName;
    }

    /**
     * Get 印章描述 
     * @return SealDescription 印章描述
     */
    public String getSealDescription() {
        return this.SealDescription;
    }

    /**
     * Set 印章描述
     * @param SealDescription 印章描述
     */
    public void setSealDescription(String SealDescription) {
        this.SealDescription = SealDescription;
    }

    public OccupiedSeal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OccupiedSeal(OccupiedSeal source) {
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.CreateOn != null) {
            this.CreateOn = new Long(source.CreateOn);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.SealPolicyId != null) {
            this.SealPolicyId = new String(source.SealPolicyId);
        }
        if (source.SealStatus != null) {
            this.SealStatus = new String(source.SealStatus);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.IsAllTime != null) {
            this.IsAllTime = new Boolean(source.IsAllTime);
        }
        if (source.AuthorizedUsers != null) {
            this.AuthorizedUsers = new AuthorizedUser[source.AuthorizedUsers.length];
            for (int i = 0; i < source.AuthorizedUsers.length; i++) {
                this.AuthorizedUsers[i] = new AuthorizedUser(source.AuthorizedUsers[i]);
            }
        }
        if (source.ExtendScene != null) {
            this.ExtendScene = new ExtendScene(source.ExtendScene);
        }
        if (source.RealWidth != null) {
            this.RealWidth = new Long(source.RealWidth);
        }
        if (source.RealHeight != null) {
            this.RealHeight = new Long(source.RealHeight);
        }
        if (source.SubSealType != null) {
            this.SubSealType = new String(source.SubSealType);
        }
        if (source.SubSealName != null) {
            this.SubSealName = new String(source.SubSealName);
        }
        if (source.SealDescription != null) {
            this.SealDescription = new String(source.SealDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "CreateOn", this.CreateOn);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "SealPolicyId", this.SealPolicyId);
        this.setParamSimple(map, prefix + "SealStatus", this.SealStatus);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "IsAllTime", this.IsAllTime);
        this.setParamArrayObj(map, prefix + "AuthorizedUsers.", this.AuthorizedUsers);
        this.setParamObj(map, prefix + "ExtendScene.", this.ExtendScene);
        this.setParamSimple(map, prefix + "RealWidth", this.RealWidth);
        this.setParamSimple(map, prefix + "RealHeight", this.RealHeight);
        this.setParamSimple(map, prefix + "SubSealType", this.SubSealType);
        this.setParamSimple(map, prefix + "SubSealName", this.SubSealName);
        this.setParamSimple(map, prefix + "SealDescription", this.SealDescription);

    }
}

