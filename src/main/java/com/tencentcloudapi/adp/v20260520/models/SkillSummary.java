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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillSummary extends AbstractModel {

    /**
    * 分类信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationInfo")
    @Expose
    private SkillClassification ClassificationInfo;

    /**
    * 当前版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentVersionInfo")
    @Expose
    private SkillVersion CurrentVersionInfo;

    /**
    * 当前用户是否收藏
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * 基础信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profile")
    @Expose
    private SkillProfile Profile;

    /**
    * Skill ID
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * Skill 异常通知列表
    */
    @SerializedName("NoticeList")
    @Expose
    private SkillNotice [] NoticeList;

    /**
    * 当前用户对该 Skill 的资源操作权限位列表；内置/共享 Skill 固定为空数组
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
    * 共享信息；可能有两条，一条是已共享的，一条是审核中的
    */
    @SerializedName("ShareList")
    @Expose
    private SkillShare [] ShareList;

    /**
    * Skill状态 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 初始化（无任何已发布版本，且最新版本处于 INITIALIZED/UNRELEASED） |
| 1 | 安全检测中（无任何已发布版本，且最新版本处于 AUDITING） |
| 2 | 待发布（无任何已发布版本，且最新版本处于 PENDING_RELEASE） |
| 3 | 已发布（存在任一 RELEASED 版本，吸收态） |
    */
    @SerializedName("SkillStatus")
    @Expose
    private Long SkillStatus;

    /**
     * Get 分类信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationInfo 分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillClassification getClassificationInfo() {
        return this.ClassificationInfo;
    }

    /**
     * Set 分类信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationInfo 分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationInfo(SkillClassification ClassificationInfo) {
        this.ClassificationInfo = ClassificationInfo;
    }

    /**
     * Get 当前版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentVersionInfo 当前版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillVersion getCurrentVersionInfo() {
        return this.CurrentVersionInfo;
    }

    /**
     * Set 当前版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentVersionInfo 当前版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentVersionInfo(SkillVersion CurrentVersionInfo) {
        this.CurrentVersionInfo = CurrentVersionInfo;
    }

    /**
     * Get 当前用户是否收藏 
     * @return IsFavorite 当前用户是否收藏
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set 当前用户是否收藏
     * @param IsFavorite 当前用户是否收藏
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get 基础信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Profile 基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set 基础信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Profile 基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfile(SkillProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Skill ID 
     * @return SkillId Skill ID
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set Skill ID
     * @param SkillId Skill ID
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get Skill 异常通知列表 
     * @return NoticeList Skill 异常通知列表
     */
    public SkillNotice [] getNoticeList() {
        return this.NoticeList;
    }

    /**
     * Set Skill 异常通知列表
     * @param NoticeList Skill 异常通知列表
     */
    public void setNoticeList(SkillNotice [] NoticeList) {
        this.NoticeList = NoticeList;
    }

    /**
     * Get 当前用户对该 Skill 的资源操作权限位列表；内置/共享 Skill 固定为空数组 
     * @return PermissionIdList 当前用户对该 Skill 的资源操作权限位列表；内置/共享 Skill 固定为空数组
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set 当前用户对该 Skill 的资源操作权限位列表；内置/共享 Skill 固定为空数组
     * @param PermissionIdList 当前用户对该 Skill 的资源操作权限位列表；内置/共享 Skill 固定为空数组
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    /**
     * Get 共享信息；可能有两条，一条是已共享的，一条是审核中的 
     * @return ShareList 共享信息；可能有两条，一条是已共享的，一条是审核中的
     */
    public SkillShare [] getShareList() {
        return this.ShareList;
    }

    /**
     * Set 共享信息；可能有两条，一条是已共享的，一条是审核中的
     * @param ShareList 共享信息；可能有两条，一条是已共享的，一条是审核中的
     */
    public void setShareList(SkillShare [] ShareList) {
        this.ShareList = ShareList;
    }

    /**
     * Get Skill状态 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 初始化（无任何已发布版本，且最新版本处于 INITIALIZED/UNRELEASED） |
| 1 | 安全检测中（无任何已发布版本，且最新版本处于 AUDITING） |
| 2 | 待发布（无任何已发布版本，且最新版本处于 PENDING_RELEASE） |
| 3 | 已发布（存在任一 RELEASED 版本，吸收态） | 
     * @return SkillStatus Skill状态 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 初始化（无任何已发布版本，且最新版本处于 INITIALIZED/UNRELEASED） |
| 1 | 安全检测中（无任何已发布版本，且最新版本处于 AUDITING） |
| 2 | 待发布（无任何已发布版本，且最新版本处于 PENDING_RELEASE） |
| 3 | 已发布（存在任一 RELEASED 版本，吸收态） |
     */
    public Long getSkillStatus() {
        return this.SkillStatus;
    }

    /**
     * Set Skill状态 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 初始化（无任何已发布版本，且最新版本处于 INITIALIZED/UNRELEASED） |
| 1 | 安全检测中（无任何已发布版本，且最新版本处于 AUDITING） |
| 2 | 待发布（无任何已发布版本，且最新版本处于 PENDING_RELEASE） |
| 3 | 已发布（存在任一 RELEASED 版本，吸收态） |
     * @param SkillStatus Skill状态 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 初始化（无任何已发布版本，且最新版本处于 INITIALIZED/UNRELEASED） |
| 1 | 安全检测中（无任何已发布版本，且最新版本处于 AUDITING） |
| 2 | 待发布（无任何已发布版本，且最新版本处于 PENDING_RELEASE） |
| 3 | 已发布（存在任一 RELEASED 版本，吸收态） |
     */
    public void setSkillStatus(Long SkillStatus) {
        this.SkillStatus = SkillStatus;
    }

    public SkillSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillSummary(SkillSummary source) {
        if (source.ClassificationInfo != null) {
            this.ClassificationInfo = new SkillClassification(source.ClassificationInfo);
        }
        if (source.CurrentVersionInfo != null) {
            this.CurrentVersionInfo = new SkillVersion(source.CurrentVersionInfo);
        }
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.Profile != null) {
            this.Profile = new SkillProfile(source.Profile);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.NoticeList != null) {
            this.NoticeList = new SkillNotice[source.NoticeList.length];
            for (int i = 0; i < source.NoticeList.length; i++) {
                this.NoticeList[i] = new SkillNotice(source.NoticeList[i]);
            }
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
        if (source.ShareList != null) {
            this.ShareList = new SkillShare[source.ShareList.length];
            for (int i = 0; i < source.ShareList.length; i++) {
                this.ShareList[i] = new SkillShare(source.ShareList[i]);
            }
        }
        if (source.SkillStatus != null) {
            this.SkillStatus = new Long(source.SkillStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClassificationInfo.", this.ClassificationInfo);
        this.setParamObj(map, prefix + "CurrentVersionInfo.", this.CurrentVersionInfo);
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamArrayObj(map, prefix + "NoticeList.", this.NoticeList);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);
        this.setParamArrayObj(map, prefix + "ShareList.", this.ShareList);
        this.setParamSimple(map, prefix + "SkillStatus", this.SkillStatus);

    }
}

