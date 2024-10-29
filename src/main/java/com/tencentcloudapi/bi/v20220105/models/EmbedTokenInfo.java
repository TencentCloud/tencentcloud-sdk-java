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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbedTokenInfo extends AbstractModel {

    /**
    * 信息标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 令牌
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BIToken")
    @Expose
    private String BIToken;

    /**
    * 项目Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 页面Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 备用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 嵌出类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 过期时间，分钟为单位，最大240
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 使用者企业Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserCorpId")
    @Expose
    private String UserCorpId;

    /**
    * 使用者Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TicketNum")
    @Expose
    private Long TicketNum;

    /**
    * 全局参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalParam")
    @Expose
    private String GlobalParam;

    /**
    * embed表示页面看板嵌出，chatBIEmbed表示ChatBI嵌出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Intention")
    @Expose
    private String Intention;

    /**
     * Get 信息标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 信息标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 信息标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 信息标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 令牌
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BIToken 令牌
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBIToken() {
        return this.BIToken;
    }

    /**
     * Set 令牌
注意：此字段可能返回 null，表示取不到有效值。
     * @param BIToken 令牌
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBIToken(String BIToken) {
        this.BIToken = BIToken;
    }

    /**
     * Get 项目Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set 更新人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 页面Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageId 页面Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set 页面Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageId 页面Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 备用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraParam 备用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 备用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraParam 备用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get 嵌出类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 嵌出类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 嵌出类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 嵌出类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 过期时间，分钟为单位，最大240
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间，分钟为单位，最大240
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，分钟为单位，最大240
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间，分钟为单位，最大240
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 使用者企业Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserCorpId 使用者企业Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserCorpId() {
        return this.UserCorpId;
    }

    /**
     * Set 使用者企业Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserCorpId 使用者企业Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserCorpId(String UserCorpId) {
        this.UserCorpId = UserCorpId;
    }

    /**
     * Get 使用者Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 使用者Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 使用者Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 使用者Id(仅用于多用户)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TicketNum 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTicketNum() {
        return this.TicketNum;
    }

    /**
     * Set 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param TicketNum 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTicketNum(Long TicketNum) {
        this.TicketNum = TicketNum;
    }

    /**
     * Get 全局参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalParam 全局参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalParam() {
        return this.GlobalParam;
    }

    /**
     * Set 全局参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalParam 全局参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalParam(String GlobalParam) {
        this.GlobalParam = GlobalParam;
    }

    /**
     * Get embed表示页面看板嵌出，chatBIEmbed表示ChatBI嵌出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Intention embed表示页面看板嵌出，chatBIEmbed表示ChatBI嵌出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntention() {
        return this.Intention;
    }

    /**
     * Set embed表示页面看板嵌出，chatBIEmbed表示ChatBI嵌出
注意：此字段可能返回 null，表示取不到有效值。
     * @param Intention embed表示页面看板嵌出，chatBIEmbed表示ChatBI嵌出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntention(String Intention) {
        this.Intention = Intention;
    }

    public EmbedTokenInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbedTokenInfo(EmbedTokenInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BIToken != null) {
            this.BIToken = new String(source.BIToken);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.UserCorpId != null) {
            this.UserCorpId = new String(source.UserCorpId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TicketNum != null) {
            this.TicketNum = new Long(source.TicketNum);
        }
        if (source.GlobalParam != null) {
            this.GlobalParam = new String(source.GlobalParam);
        }
        if (source.Intention != null) {
            this.Intention = new String(source.Intention);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BIToken", this.BIToken);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UserCorpId", this.UserCorpId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TicketNum", this.TicketNum);
        this.setParamSimple(map, prefix + "GlobalParam", this.GlobalParam);
        this.setParamSimple(map, prefix + "Intention", this.Intention);

    }
}

