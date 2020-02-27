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

public class RepoInfo extends AbstractModel{

    /**
    * 仓库名称
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
    * Tag数量
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
    * 是否为公开
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
    * 是否为用户收藏
    */
    @SerializedName("IsUserFavor")
    @Expose
    private Boolean IsUserFavor;

    /**
    * 是否为腾讯云官方仓库
    */
    @SerializedName("IsQcloudOfficial")
    @Expose
    private Boolean IsQcloudOfficial;

    /**
    * 被收藏的个数
    */
    @SerializedName("FavorCount")
    @Expose
    private Long FavorCount;

    /**
    * 拉取的数量
    */
    @SerializedName("PullCount")
    @Expose
    private Long PullCount;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 仓库创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 仓库更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 仓库名称 
     * @return RepoName 仓库名称
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名称
     * @param RepoName 仓库名称
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
     * Get Tag数量 
     * @return TagCount Tag数量
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set Tag数量
     * @param TagCount Tag数量
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Get 是否为公开 
     * @return Public 是否为公开
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 是否为公开
     * @param Public 是否为公开
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    /**
     * Get 是否为用户收藏 
     * @return IsUserFavor 是否为用户收藏
     */
    public Boolean getIsUserFavor() {
        return this.IsUserFavor;
    }

    /**
     * Set 是否为用户收藏
     * @param IsUserFavor 是否为用户收藏
     */
    public void setIsUserFavor(Boolean IsUserFavor) {
        this.IsUserFavor = IsUserFavor;
    }

    /**
     * Get 是否为腾讯云官方仓库 
     * @return IsQcloudOfficial 是否为腾讯云官方仓库
     */
    public Boolean getIsQcloudOfficial() {
        return this.IsQcloudOfficial;
    }

    /**
     * Set 是否为腾讯云官方仓库
     * @param IsQcloudOfficial 是否为腾讯云官方仓库
     */
    public void setIsQcloudOfficial(Boolean IsQcloudOfficial) {
        this.IsQcloudOfficial = IsQcloudOfficial;
    }

    /**
     * Get 被收藏的个数 
     * @return FavorCount 被收藏的个数
     */
    public Long getFavorCount() {
        return this.FavorCount;
    }

    /**
     * Set 被收藏的个数
     * @param FavorCount 被收藏的个数
     */
    public void setFavorCount(Long FavorCount) {
        this.FavorCount = FavorCount;
    }

    /**
     * Get 拉取的数量 
     * @return PullCount 拉取的数量
     */
    public Long getPullCount() {
        return this.PullCount;
    }

    /**
     * Set 拉取的数量
     * @param PullCount 拉取的数量
     */
    public void setPullCount(Long PullCount) {
        this.PullCount = PullCount;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 仓库创建时间 
     * @return CreationTime 仓库创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 仓库创建时间
     * @param CreationTime 仓库创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 仓库更新时间 
     * @return UpdateTime 仓库更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 仓库更新时间
     * @param UpdateTime 仓库更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "TagCount", this.TagCount);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "IsUserFavor", this.IsUserFavor);
        this.setParamSimple(map, prefix + "IsQcloudOfficial", this.IsQcloudOfficial);
        this.setParamSimple(map, prefix + "FavorCount", this.FavorCount);
        this.setParamSimple(map, prefix + "PullCount", this.PullCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

