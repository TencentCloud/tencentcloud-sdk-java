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
    * <p>电子印章编号</p>
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * <p>电子印章名称</p>
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * <p>电子印章授权时间戳，单位秒</p>
    */
    @SerializedName("CreateOn")
    @Expose
    private Long CreateOn;

    /**
    * <p>电子印章授权人的UserId</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>电子印章策略Id</p>
    */
    @SerializedName("SealPolicyId")
    @Expose
    private String SealPolicyId;

    /**
    * <p>印章状态</p><p>枚举值：</p><ul><li>CHECKING： 待审核</li><li>SUCCESS： 启用状态</li><li>FAIL： 审核拒绝</li><li>DISABLE： 已停用</li><li>STOPPED： 已终止</li><li>VOID： 已作废</li><li>INVALID： 已失效</li><li>CHECKING-SADM： 待超管审核</li></ul>
    */
    @SerializedName("SealStatus")
    @Expose
    private String SealStatus;

    /**
    * <p>审核失败原因</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>印章图片url，5分钟内有效</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章</p>
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * <p>用印申请是否为永久授权，true-是，false-否</p>
    */
    @SerializedName("IsAllTime")
    @Expose
    private Boolean IsAllTime;

    /**
    * <p>授权人列表</p>
    */
    @SerializedName("AuthorizedUsers")
    @Expose
    private AuthorizedUser [] AuthorizedUsers;

    /**
    * <p>印章扩展数据信息</p>
    */
    @SerializedName("ExtendScene")
    @Expose
    private ExtendScene ExtendScene;

    /**
    * <p>印章的真实宽度，单位毫米</p>
    */
    @SerializedName("RealWidth")
    @Expose
    private Long RealWidth;

    /**
    * <p>印章的真实高度，单位毫米</p>
    */
    @SerializedName("RealHeight")
    @Expose
    private Long RealHeight;

    /**
    * <p>自定义子类型印章</p>
    */
    @SerializedName("SubSealType")
    @Expose
    private String SubSealType;

    /**
    * <p>自定义子类型印章名称</p>
    */
    @SerializedName("SubSealName")
    @Expose
    private String SubSealName;

    /**
    * <p>印章描述</p>
    */
    @SerializedName("SealDescription")
    @Expose
    private String SealDescription;

    /**
     * Get <p>电子印章编号</p> 
     * @return SealId <p>电子印章编号</p>
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set <p>电子印章编号</p>
     * @param SealId <p>电子印章编号</p>
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get <p>电子印章名称</p> 
     * @return SealName <p>电子印章名称</p>
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set <p>电子印章名称</p>
     * @param SealName <p>电子印章名称</p>
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get <p>电子印章授权时间戳，单位秒</p> 
     * @return CreateOn <p>电子印章授权时间戳，单位秒</p>
     */
    public Long getCreateOn() {
        return this.CreateOn;
    }

    /**
     * Set <p>电子印章授权时间戳，单位秒</p>
     * @param CreateOn <p>电子印章授权时间戳，单位秒</p>
     */
    public void setCreateOn(Long CreateOn) {
        this.CreateOn = CreateOn;
    }

    /**
     * Get <p>电子印章授权人的UserId</p> 
     * @return Creator <p>电子印章授权人的UserId</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>电子印章授权人的UserId</p>
     * @param Creator <p>电子印章授权人的UserId</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>电子印章策略Id</p> 
     * @return SealPolicyId <p>电子印章策略Id</p>
     */
    public String getSealPolicyId() {
        return this.SealPolicyId;
    }

    /**
     * Set <p>电子印章策略Id</p>
     * @param SealPolicyId <p>电子印章策略Id</p>
     */
    public void setSealPolicyId(String SealPolicyId) {
        this.SealPolicyId = SealPolicyId;
    }

    /**
     * Get <p>印章状态</p><p>枚举值：</p><ul><li>CHECKING： 待审核</li><li>SUCCESS： 启用状态</li><li>FAIL： 审核拒绝</li><li>DISABLE： 已停用</li><li>STOPPED： 已终止</li><li>VOID： 已作废</li><li>INVALID： 已失效</li><li>CHECKING-SADM： 待超管审核</li></ul> 
     * @return SealStatus <p>印章状态</p><p>枚举值：</p><ul><li>CHECKING： 待审核</li><li>SUCCESS： 启用状态</li><li>FAIL： 审核拒绝</li><li>DISABLE： 已停用</li><li>STOPPED： 已终止</li><li>VOID： 已作废</li><li>INVALID： 已失效</li><li>CHECKING-SADM： 待超管审核</li></ul>
     */
    public String getSealStatus() {
        return this.SealStatus;
    }

    /**
     * Set <p>印章状态</p><p>枚举值：</p><ul><li>CHECKING： 待审核</li><li>SUCCESS： 启用状态</li><li>FAIL： 审核拒绝</li><li>DISABLE： 已停用</li><li>STOPPED： 已终止</li><li>VOID： 已作废</li><li>INVALID： 已失效</li><li>CHECKING-SADM： 待超管审核</li></ul>
     * @param SealStatus <p>印章状态</p><p>枚举值：</p><ul><li>CHECKING： 待审核</li><li>SUCCESS： 启用状态</li><li>FAIL： 审核拒绝</li><li>DISABLE： 已停用</li><li>STOPPED： 已终止</li><li>VOID： 已作废</li><li>INVALID： 已失效</li><li>CHECKING-SADM： 待超管审核</li></ul>
     */
    public void setSealStatus(String SealStatus) {
        this.SealStatus = SealStatus;
    }

    /**
     * Get <p>审核失败原因</p> 
     * @return FailReason <p>审核失败原因</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>审核失败原因</p>
     * @param FailReason <p>审核失败原因</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>印章图片url，5分钟内有效</p> 
     * @return Url <p>印章图片url，5分钟内有效</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>印章图片url，5分钟内有效</p>
     * @param Url <p>印章图片url，5分钟内有效</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章</p> 
     * @return SealType <p>印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章</p>
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set <p>印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章</p>
     * @param SealType <p>印章类型,OFFICIAL-企业公章, CONTRACT-合同专用章,ORGANIZATIONSEAL-企业印章(本地上传印章类型),LEGAL_PERSON_SEAL-法人印章</p>
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get <p>用印申请是否为永久授权，true-是，false-否</p> 
     * @return IsAllTime <p>用印申请是否为永久授权，true-是，false-否</p>
     */
    public Boolean getIsAllTime() {
        return this.IsAllTime;
    }

    /**
     * Set <p>用印申请是否为永久授权，true-是，false-否</p>
     * @param IsAllTime <p>用印申请是否为永久授权，true-是，false-否</p>
     */
    public void setIsAllTime(Boolean IsAllTime) {
        this.IsAllTime = IsAllTime;
    }

    /**
     * Get <p>授权人列表</p> 
     * @return AuthorizedUsers <p>授权人列表</p>
     */
    public AuthorizedUser [] getAuthorizedUsers() {
        return this.AuthorizedUsers;
    }

    /**
     * Set <p>授权人列表</p>
     * @param AuthorizedUsers <p>授权人列表</p>
     */
    public void setAuthorizedUsers(AuthorizedUser [] AuthorizedUsers) {
        this.AuthorizedUsers = AuthorizedUsers;
    }

    /**
     * Get <p>印章扩展数据信息</p> 
     * @return ExtendScene <p>印章扩展数据信息</p>
     */
    public ExtendScene getExtendScene() {
        return this.ExtendScene;
    }

    /**
     * Set <p>印章扩展数据信息</p>
     * @param ExtendScene <p>印章扩展数据信息</p>
     */
    public void setExtendScene(ExtendScene ExtendScene) {
        this.ExtendScene = ExtendScene;
    }

    /**
     * Get <p>印章的真实宽度，单位毫米</p> 
     * @return RealWidth <p>印章的真实宽度，单位毫米</p>
     */
    public Long getRealWidth() {
        return this.RealWidth;
    }

    /**
     * Set <p>印章的真实宽度，单位毫米</p>
     * @param RealWidth <p>印章的真实宽度，单位毫米</p>
     */
    public void setRealWidth(Long RealWidth) {
        this.RealWidth = RealWidth;
    }

    /**
     * Get <p>印章的真实高度，单位毫米</p> 
     * @return RealHeight <p>印章的真实高度，单位毫米</p>
     */
    public Long getRealHeight() {
        return this.RealHeight;
    }

    /**
     * Set <p>印章的真实高度，单位毫米</p>
     * @param RealHeight <p>印章的真实高度，单位毫米</p>
     */
    public void setRealHeight(Long RealHeight) {
        this.RealHeight = RealHeight;
    }

    /**
     * Get <p>自定义子类型印章</p> 
     * @return SubSealType <p>自定义子类型印章</p>
     */
    public String getSubSealType() {
        return this.SubSealType;
    }

    /**
     * Set <p>自定义子类型印章</p>
     * @param SubSealType <p>自定义子类型印章</p>
     */
    public void setSubSealType(String SubSealType) {
        this.SubSealType = SubSealType;
    }

    /**
     * Get <p>自定义子类型印章名称</p> 
     * @return SubSealName <p>自定义子类型印章名称</p>
     */
    public String getSubSealName() {
        return this.SubSealName;
    }

    /**
     * Set <p>自定义子类型印章名称</p>
     * @param SubSealName <p>自定义子类型印章名称</p>
     */
    public void setSubSealName(String SubSealName) {
        this.SubSealName = SubSealName;
    }

    /**
     * Get <p>印章描述</p> 
     * @return SealDescription <p>印章描述</p>
     */
    public String getSealDescription() {
        return this.SealDescription;
    }

    /**
     * Set <p>印章描述</p>
     * @param SealDescription <p>印章描述</p>
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

