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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployParam extends AbstractModel{

    /**
    * 部署类型：package/image/repository/pipeline/jar/war
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * 部署类型为image时传入
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 部署类型为package时传入
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 部署类型为package时传入
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 部署备注
    */
    @SerializedName("DeployRemark")
    @Expose
    private String DeployRemark;

    /**
    * 代码仓库信息
    */
    @SerializedName("RepoInfo")
    @Expose
    private RepositoryInfo RepoInfo;

    /**
    * 无Dockerfile时填写
    */
    @SerializedName("BuildPacks")
    @Expose
    private BuildPacksInfo BuildPacks;

    /**
    * 发布类型 GRAY | FULL
    */
    @SerializedName("ReleaseType")
    @Expose
    private String ReleaseType;

    /**
     * Get 部署类型：package/image/repository/pipeline/jar/war 
     * @return DeployType 部署类型：package/image/repository/pipeline/jar/war
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set 部署类型：package/image/repository/pipeline/jar/war
     * @param DeployType 部署类型：package/image/repository/pipeline/jar/war
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get 部署类型为image时传入 
     * @return ImageUrl 部署类型为image时传入
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 部署类型为image时传入
     * @param ImageUrl 部署类型为image时传入
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 部署类型为package时传入 
     * @return PackageName 部署类型为package时传入
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 部署类型为package时传入
     * @param PackageName 部署类型为package时传入
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 部署类型为package时传入 
     * @return PackageVersion 部署类型为package时传入
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 部署类型为package时传入
     * @param PackageVersion 部署类型为package时传入
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 部署备注 
     * @return DeployRemark 部署备注
     */
    public String getDeployRemark() {
        return this.DeployRemark;
    }

    /**
     * Set 部署备注
     * @param DeployRemark 部署备注
     */
    public void setDeployRemark(String DeployRemark) {
        this.DeployRemark = DeployRemark;
    }

    /**
     * Get 代码仓库信息 
     * @return RepoInfo 代码仓库信息
     */
    public RepositoryInfo getRepoInfo() {
        return this.RepoInfo;
    }

    /**
     * Set 代码仓库信息
     * @param RepoInfo 代码仓库信息
     */
    public void setRepoInfo(RepositoryInfo RepoInfo) {
        this.RepoInfo = RepoInfo;
    }

    /**
     * Get 无Dockerfile时填写 
     * @return BuildPacks 无Dockerfile时填写
     */
    public BuildPacksInfo getBuildPacks() {
        return this.BuildPacks;
    }

    /**
     * Set 无Dockerfile时填写
     * @param BuildPacks 无Dockerfile时填写
     */
    public void setBuildPacks(BuildPacksInfo BuildPacks) {
        this.BuildPacks = BuildPacks;
    }

    /**
     * Get 发布类型 GRAY | FULL 
     * @return ReleaseType 发布类型 GRAY | FULL
     */
    public String getReleaseType() {
        return this.ReleaseType;
    }

    /**
     * Set 发布类型 GRAY | FULL
     * @param ReleaseType 发布类型 GRAY | FULL
     */
    public void setReleaseType(String ReleaseType) {
        this.ReleaseType = ReleaseType;
    }

    public DeployParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployParam(DeployParam source) {
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.DeployRemark != null) {
            this.DeployRemark = new String(source.DeployRemark);
        }
        if (source.RepoInfo != null) {
            this.RepoInfo = new RepositoryInfo(source.RepoInfo);
        }
        if (source.BuildPacks != null) {
            this.BuildPacks = new BuildPacksInfo(source.BuildPacks);
        }
        if (source.ReleaseType != null) {
            this.ReleaseType = new String(source.ReleaseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "DeployRemark", this.DeployRemark);
        this.setParamObj(map, prefix + "RepoInfo.", this.RepoInfo);
        this.setParamObj(map, prefix + "BuildPacks.", this.BuildPacks);
        this.setParamSimple(map, prefix + "ReleaseType", this.ReleaseType);

    }
}

