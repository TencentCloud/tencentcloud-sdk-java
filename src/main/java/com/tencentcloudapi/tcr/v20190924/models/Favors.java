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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Favors extends AbstractModel {

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
    */
    @SerializedName("PullCount")
    @Expose
    private Long PullCount;

    /**
    * 仓库收藏次数
    */
    @SerializedName("FavorCount")
    @Expose
    private Long FavorCount;

    /**
    * 仓库是否公开
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
    * 是否为官方所有
    */
    @SerializedName("IsQcloudOfficial")
    @Expose
    private Boolean IsQcloudOfficial;

    /**
    * 仓库Tag的数量
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
    * Logo
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
     * @return PullCount Pull总共的次数
     */
    public Long getPullCount() {
        return this.PullCount;
    }

    /**
     * Set Pull总共的次数
     * @param PullCount Pull总共的次数
     */
    public void setPullCount(Long PullCount) {
        this.PullCount = PullCount;
    }

    /**
     * Get 仓库收藏次数 
     * @return FavorCount 仓库收藏次数
     */
    public Long getFavorCount() {
        return this.FavorCount;
    }

    /**
     * Set 仓库收藏次数
     * @param FavorCount 仓库收藏次数
     */
    public void setFavorCount(Long FavorCount) {
        this.FavorCount = FavorCount;
    }

    /**
     * Get 仓库是否公开 
     * @return Public 仓库是否公开
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 仓库是否公开
     * @param Public 仓库是否公开
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    /**
     * Get 是否为官方所有 
     * @return IsQcloudOfficial 是否为官方所有
     */
    public Boolean getIsQcloudOfficial() {
        return this.IsQcloudOfficial;
    }

    /**
     * Set 是否为官方所有
     * @param IsQcloudOfficial 是否为官方所有
     */
    public void setIsQcloudOfficial(Boolean IsQcloudOfficial) {
        this.IsQcloudOfficial = IsQcloudOfficial;
    }

    /**
     * Get 仓库Tag的数量 
     * @return TagCount 仓库Tag的数量
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set 仓库Tag的数量
     * @param TagCount 仓库Tag的数量
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Get Logo 
     * @return Logo Logo
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Logo
     * @param Logo Logo
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

    public Favors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Favors(Favors source) {
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.PullCount != null) {
            this.PullCount = new Long(source.PullCount);
        }
        if (source.FavorCount != null) {
            this.FavorCount = new Long(source.FavorCount);
        }
        if (source.Public != null) {
            this.Public = new Long(source.Public);
        }
        if (source.IsQcloudOfficial != null) {
            this.IsQcloudOfficial = new Boolean(source.IsQcloudOfficial);
        }
        if (source.TagCount != null) {
            this.TagCount = new Long(source.TagCount);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
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

