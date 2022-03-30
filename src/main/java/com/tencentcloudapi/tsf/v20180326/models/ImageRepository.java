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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRepository extends AbstractModel{

    /**
    * 仓库名,含命名空间,如tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reponame")
    @Expose
    private String Reponame;

    /**
    * 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repotype")
    @Expose
    private String Repotype;

    /**
    * 镜像版本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
    * 是否公共,1:公有,0:私有
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPublic")
    @Expose
    private Long IsPublic;

    /**
    * 是否被用户收藏。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUserFavor")
    @Expose
    private Boolean IsUserFavor;

    /**
    * 是否是腾讯云官方仓库。 是否是腾讯云官方仓库。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsQcloudOfficial")
    @Expose
    private Boolean IsQcloudOfficial;

    /**
    * 被所有用户收藏次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FavorCount")
    @Expose
    private Long FavorCount;

    /**
    * 拉取次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullCount")
    @Expose
    private Long PullCount;

    /**
    * 描述内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * TcrBindingId值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrBindingId")
    @Expose
    private Long TcrBindingId;

    /**
    * applicationid值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * ApplicationName值（类型是string）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private ScalableRule ApplicationName;

    /**
     * Get 仓库名,含命名空间,如tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reponame 仓库名,含命名空间,如tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReponame() {
        return this.Reponame;
    }

    /**
     * Set 仓库名,含命名空间,如tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reponame 仓库名,含命名空间,如tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReponame(String Reponame) {
        this.Reponame = Reponame;
    }

    /**
     * Get 仓库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repotype 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepotype() {
        return this.Repotype;
    }

    /**
     * Set 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repotype 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepotype(String Repotype) {
        this.Repotype = Repotype;
    }

    /**
     * Get 镜像版本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagCount 镜像版本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set 镜像版本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagCount 镜像版本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Get 是否公共,1:公有,0:私有
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPublic 是否公共,1:公有,0:私有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否公共,1:公有,0:私有
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPublic 是否公共,1:公有,0:私有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPublic(Long IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 是否被用户收藏。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUserFavor 是否被用户收藏。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUserFavor() {
        return this.IsUserFavor;
    }

    /**
     * Set 是否被用户收藏。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUserFavor 是否被用户收藏。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUserFavor(Boolean IsUserFavor) {
        this.IsUserFavor = IsUserFavor;
    }

    /**
     * Get 是否是腾讯云官方仓库。 是否是腾讯云官方仓库。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsQcloudOfficial 是否是腾讯云官方仓库。 是否是腾讯云官方仓库。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsQcloudOfficial() {
        return this.IsQcloudOfficial;
    }

    /**
     * Set 是否是腾讯云官方仓库。 是否是腾讯云官方仓库。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsQcloudOfficial 是否是腾讯云官方仓库。 是否是腾讯云官方仓库。true：是，false：否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsQcloudOfficial(Boolean IsQcloudOfficial) {
        this.IsQcloudOfficial = IsQcloudOfficial;
    }

    /**
     * Get 被所有用户收藏次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FavorCount 被所有用户收藏次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFavorCount() {
        return this.FavorCount;
    }

    /**
     * Set 被所有用户收藏次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FavorCount 被所有用户收藏次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFavorCount(Long FavorCount) {
        this.FavorCount = FavorCount;
    }

    /**
     * Get 拉取次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullCount 拉取次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPullCount() {
        return this.PullCount;
    }

    /**
     * Set 拉取次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullCount 拉取次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullCount(Long PullCount) {
        this.PullCount = PullCount;
    }

    /**
     * Get 描述内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrRepoInfo TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrRepoInfo TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get TcrBindingId值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrBindingId TcrBindingId值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTcrBindingId() {
        return this.TcrBindingId;
    }

    /**
     * Set TcrBindingId值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrBindingId TcrBindingId值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrBindingId(Long TcrBindingId) {
        this.TcrBindingId = TcrBindingId;
    }

    /**
     * Get applicationid值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId applicationid值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set applicationid值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId applicationid值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get ApplicationName值（类型是string）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName ApplicationName值（类型是string）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScalableRule getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set ApplicationName值（类型是string）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName ApplicationName值（类型是string）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(ScalableRule ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public ImageRepository() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRepository(ImageRepository source) {
        if (source.Reponame != null) {
            this.Reponame = new String(source.Reponame);
        }
        if (source.Repotype != null) {
            this.Repotype = new String(source.Repotype);
        }
        if (source.TagCount != null) {
            this.TagCount = new Long(source.TagCount);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Long(source.IsPublic);
        }
        if (source.IsUserFavor != null) {
            this.IsUserFavor = new Boolean(source.IsUserFavor);
        }
        if (source.IsQcloudOfficial != null) {
            this.IsQcloudOfficial = new Boolean(source.IsQcloudOfficial);
        }
        if (source.FavorCount != null) {
            this.FavorCount = new Long(source.FavorCount);
        }
        if (source.PullCount != null) {
            this.PullCount = new Long(source.PullCount);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TcrRepoInfo != null) {
            this.TcrRepoInfo = new TcrRepoInfo(source.TcrRepoInfo);
        }
        if (source.TcrBindingId != null) {
            this.TcrBindingId = new Long(source.TcrBindingId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new ScalableRule(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reponame", this.Reponame);
        this.setParamSimple(map, prefix + "Repotype", this.Repotype);
        this.setParamSimple(map, prefix + "TagCount", this.TagCount);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "IsUserFavor", this.IsUserFavor);
        this.setParamSimple(map, prefix + "IsQcloudOfficial", this.IsQcloudOfficial);
        this.setParamSimple(map, prefix + "FavorCount", this.FavorCount);
        this.setParamSimple(map, prefix + "PullCount", this.PullCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "TcrRepoInfo.", this.TcrRepoInfo);
        this.setParamSimple(map, prefix + "TcrBindingId", this.TcrBindingId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamObj(map, prefix + "ApplicationName.", this.ApplicationName);

    }
}

