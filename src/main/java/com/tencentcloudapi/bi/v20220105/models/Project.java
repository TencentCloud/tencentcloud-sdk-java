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

public class Project extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 项目Logo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * logo底色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

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
    * 成员个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 页面个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 最后修改报表、简报名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyName")
    @Expose
    private String LastModifyName;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Apply")
    @Expose
    private Boolean Apply;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * 项目内权限列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthList")
    @Expose
    private String [] AuthList;

    /**
    * 默认看板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PanelScope")
    @Expose
    private String PanelScope;

    /**
    * 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExternalManage")
    @Expose
    private Boolean IsExternalManage;

    /**
    * 托管平台名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
    * 定制化参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigList")
    @Expose
    private ProjectConfigList [] ConfigList;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUserName")
    @Expose
    private String CreatedUserName;

    /**
    * 所属人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 所属人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
     * Get 项目ID 
     * @return Id 项目ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 项目ID
     * @param Id 项目ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 项目Logo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo 项目Logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 项目Logo
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo 项目Logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get logo底色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorCode logo底色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set logo底色
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorCode logo底色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
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
     * Get 成员个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberCount 成员个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 成员个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberCount 成员个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get 页面个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageCount 页面个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 页面个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageCount 页面个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 最后修改报表、简报名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyName 最后修改报表、简报名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifyName() {
        return this.LastModifyName;
    }

    /**
     * Set 最后修改报表、简报名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyName 最后修改报表、简报名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyName(String LastModifyName) {
        this.LastModifyName = LastModifyName;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Apply ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getApply() {
        return this.Apply;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Apply ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApply(Boolean Apply) {
        this.Apply = Apply;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorpId ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorpId ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mark ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mark ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seed ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seed ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get 项目内权限列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthList 项目内权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAuthList() {
        return this.AuthList;
    }

    /**
     * Set 项目内权限列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthList 项目内权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthList(String [] AuthList) {
        this.AuthList = AuthList;
    }

    /**
     * Get 默认看板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PanelScope 默认看板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPanelScope() {
        return this.PanelScope;
    }

    /**
     * Set 默认看板
注意：此字段可能返回 null，表示取不到有效值。
     * @param PanelScope 默认看板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPanelScope(String PanelScope) {
        this.PanelScope = PanelScope;
    }

    /**
     * Get 是否被托管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExternalManage 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExternalManage() {
        return this.IsExternalManage;
    }

    /**
     * Set 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExternalManage 是否被托管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExternalManage(Boolean IsExternalManage) {
        this.IsExternalManage = IsExternalManage;
    }

    /**
     * Get 托管平台名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagePlatform 托管平台名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set 托管平台名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagePlatform 托管平台名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    /**
     * Get 定制化参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigList 定制化参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectConfigList [] getConfigList() {
        return this.ConfigList;
    }

    /**
     * Set 定制化参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigList 定制化参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigList(ProjectConfigList [] ConfigList) {
        this.ConfigList = ConfigList;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUserName 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUserName() {
        return this.CreatedUserName;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUserName 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUserName(String CreatedUserName) {
        this.CreatedUserName = CreatedUserName;
    }

    /**
     * Get 所属人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 所属人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 所属人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 所属人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 所属人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 所属人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 所属人
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 所属人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ColorCode != null) {
            this.ColorCode = new String(source.ColorCode);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.LastModifyName != null) {
            this.LastModifyName = new String(source.LastModifyName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Apply != null) {
            this.Apply = new Boolean(source.Apply);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.AuthList != null) {
            this.AuthList = new String[source.AuthList.length];
            for (int i = 0; i < source.AuthList.length; i++) {
                this.AuthList[i] = new String(source.AuthList[i]);
            }
        }
        if (source.PanelScope != null) {
            this.PanelScope = new String(source.PanelScope);
        }
        if (source.IsExternalManage != null) {
            this.IsExternalManage = new Boolean(source.IsExternalManage);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
        if (source.ConfigList != null) {
            this.ConfigList = new ProjectConfigList[source.ConfigList.length];
            for (int i = 0; i < source.ConfigList.length; i++) {
                this.ConfigList[i] = new ProjectConfigList(source.ConfigList[i]);
            }
        }
        if (source.CreatedUserName != null) {
            this.CreatedUserName = new String(source.CreatedUserName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ColorCode", this.ColorCode);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "LastModifyName", this.LastModifyName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Apply", this.Apply);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamArraySimple(map, prefix + "AuthList.", this.AuthList);
        this.setParamSimple(map, prefix + "PanelScope", this.PanelScope);
        this.setParamSimple(map, prefix + "IsExternalManage", this.IsExternalManage);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);
        this.setParamArrayObj(map, prefix + "ConfigList.", this.ConfigList);
        this.setParamSimple(map, prefix + "CreatedUserName", this.CreatedUserName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);

    }
}

