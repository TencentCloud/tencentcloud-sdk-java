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

public class RepositoryInfoResp extends AbstractModel{

    /**
    * 镜像仓库名字
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 镜像仓库类型
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * 镜像仓库服务地址
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 镜像仓库描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否为公有镜像
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
    * 下载次数
    */
    @SerializedName("PullCount")
    @Expose
    private Long PullCount;

    /**
    * 收藏次数
    */
    @SerializedName("FavorCount")
    @Expose
    private Long FavorCount;

    /**
    * 是否为用户收藏
    */
    @SerializedName("IsUserFavor")
    @Expose
    private Boolean IsUserFavor;

    /**
    * 是否为腾讯云官方镜像
    */
    @SerializedName("IsQcloudOfficial")
    @Expose
    private Boolean IsQcloudOfficial;

    /**
     * Get 镜像仓库名字 
     * @return RepoName 镜像仓库名字
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 镜像仓库名字
     * @param RepoName 镜像仓库名字
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 镜像仓库类型 
     * @return RepoType 镜像仓库类型
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 镜像仓库类型
     * @param RepoType 镜像仓库类型
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 镜像仓库服务地址 
     * @return Server 镜像仓库服务地址
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像仓库服务地址
     * @param Server 镜像仓库服务地址
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 镜像仓库描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 镜像仓库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 镜像仓库描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 镜像仓库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否为公有镜像 
     * @return Public 是否为公有镜像
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 是否为公有镜像
     * @param Public 是否为公有镜像
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    /**
     * Get 下载次数 
     * @return PullCount 下载次数
     */
    public Long getPullCount() {
        return this.PullCount;
    }

    /**
     * Set 下载次数
     * @param PullCount 下载次数
     */
    public void setPullCount(Long PullCount) {
        this.PullCount = PullCount;
    }

    /**
     * Get 收藏次数 
     * @return FavorCount 收藏次数
     */
    public Long getFavorCount() {
        return this.FavorCount;
    }

    /**
     * Set 收藏次数
     * @param FavorCount 收藏次数
     */
    public void setFavorCount(Long FavorCount) {
        this.FavorCount = FavorCount;
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
     * Get 是否为腾讯云官方镜像 
     * @return IsQcloudOfficial 是否为腾讯云官方镜像
     */
    public Boolean getIsQcloudOfficial() {
        return this.IsQcloudOfficial;
    }

    /**
     * Set 是否为腾讯云官方镜像
     * @param IsQcloudOfficial 是否为腾讯云官方镜像
     */
    public void setIsQcloudOfficial(Boolean IsQcloudOfficial) {
        this.IsQcloudOfficial = IsQcloudOfficial;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "PullCount", this.PullCount);
        this.setParamSimple(map, prefix + "FavorCount", this.FavorCount);
        this.setParamSimple(map, prefix + "IsUserFavor", this.IsUserFavor);
        this.setParamSimple(map, prefix + "IsQcloudOfficial", this.IsQcloudOfficial);

    }
}

