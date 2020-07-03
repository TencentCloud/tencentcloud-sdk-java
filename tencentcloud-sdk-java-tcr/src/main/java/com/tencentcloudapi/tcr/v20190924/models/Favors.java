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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Favors extends AbstractModel{

    /**
    * 仓库名字
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 仓库类型
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * Pull总共的次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullCount")
    @Expose
    private Long PullCount;

    /**
    * 仓库收藏次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FavorCount")
    @Expose
    private Long FavorCount;

    /**
    * 仓库是否公开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
    * 是否为官方所有
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsQcloudOfficial")
    @Expose
    private Boolean IsQcloudOfficial;

    /**
    * 仓库Tag的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
    * Logo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域的Id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 仓库名字 
     * @return RepoName 仓库名字
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名字
     * @param RepoName 仓库名字
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 仓库类型 
     * @return RepoType 仓库类型
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 仓库类型
     * @param RepoType 仓库类型
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get Pull总共的次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullCount Pull总共的次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPullCount() {
        return this.PullCount;
    }

    /**
     * Set Pull总共的次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullCount Pull总共的次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullCount(Long PullCount) {
        this.PullCount = PullCount;
    }

    /**
     * Get 仓库收藏次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FavorCount 仓库收藏次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFavorCount() {
        return this.FavorCount;
    }

    /**
     * Set 仓库收藏次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FavorCount 仓库收藏次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFavorCount(Long FavorCount) {
        this.FavorCount = FavorCount;
    }

    /**
     * Get 仓库是否公开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Public 仓库是否公开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 仓库是否公开
注意：此字段可能返回 null，表示取不到有效值。
     * @param Public 仓库是否公开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    /**
     * Get 是否为官方所有
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsQcloudOfficial 是否为官方所有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsQcloudOfficial() {
        return this.IsQcloudOfficial;
    }

    /**
     * Set 是否为官方所有
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsQcloudOfficial 是否为官方所有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsQcloudOfficial(Boolean IsQcloudOfficial) {
        this.IsQcloudOfficial = IsQcloudOfficial;
    }

    /**
     * Get 仓库Tag的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagCount 仓库Tag的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set 仓库Tag的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagCount 仓库Tag的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Get Logo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo Logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Logo
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo Logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域的Id 
     * @return RegionId 地域的Id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域的Id
     * @param RegionId 地域的Id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "PullCount", this.PullCount);
        this.setParamSimple(map, prefix + "FavorCount", this.FavorCount);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "IsQcloudOfficial", this.IsQcloudOfficial);
        this.setParamSimple(map, prefix + "TagCount", this.TagCount);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

