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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfoV2 extends AbstractModel {

    /**
    * <p>镜像类型</p><p>枚举值：</p><ul><li>official： 官方镜像</li><li>custom： 自定义镜像</li><li>imageUrl： 镜像地址</li></ul>
    */
    @SerializedName("ImageMode")
    @Expose
    private String ImageMode;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>是否是存量镜像</p>
    */
    @SerializedName("LegacyCCR")
    @Expose
    private Boolean LegacyCCR;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("FullImageUrl")
    @Expose
    private String FullImageUrl;

    /**
    * <p>版本</p>
    */
    @SerializedName("MainVersion")
    @Expose
    private String MainVersion;

    /**
    * <p>镜像地址域名</p>
    */
    @SerializedName("RegistryUrl")
    @Expose
    private String RegistryUrl;

    /**
    * <p>镜像命名空间</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>镜像仓库名</p>
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>镜像版本标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>用户名</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>镜像拉取密钥</p>
    */
    @SerializedName("ImagePullSecret")
    @Expose
    private ImagePullSecret ImagePullSecret;

    /**
    * <p>镜像拉取策略</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
     * Get <p>镜像类型</p><p>枚举值：</p><ul><li>official： 官方镜像</li><li>custom： 自定义镜像</li><li>imageUrl： 镜像地址</li></ul> 
     * @return ImageMode <p>镜像类型</p><p>枚举值：</p><ul><li>official： 官方镜像</li><li>custom： 自定义镜像</li><li>imageUrl： 镜像地址</li></ul>
     */
    public String getImageMode() {
        return this.ImageMode;
    }

    /**
     * Set <p>镜像类型</p><p>枚举值：</p><ul><li>official： 官方镜像</li><li>custom： 自定义镜像</li><li>imageUrl： 镜像地址</li></ul>
     * @param ImageMode <p>镜像类型</p><p>枚举值：</p><ul><li>official： 官方镜像</li><li>custom： 自定义镜像</li><li>imageUrl： 镜像地址</li></ul>
     */
    public void setImageMode(String ImageMode) {
        this.ImageMode = ImageMode;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>是否是存量镜像</p> 
     * @return LegacyCCR <p>是否是存量镜像</p>
     */
    public Boolean getLegacyCCR() {
        return this.LegacyCCR;
    }

    /**
     * Set <p>是否是存量镜像</p>
     * @param LegacyCCR <p>是否是存量镜像</p>
     */
    public void setLegacyCCR(Boolean LegacyCCR) {
        this.LegacyCCR = LegacyCCR;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return FullImageUrl <p>镜像地址</p>
     */
    public String getFullImageUrl() {
        return this.FullImageUrl;
    }

    /**
     * Set <p>镜像地址</p>
     * @param FullImageUrl <p>镜像地址</p>
     */
    public void setFullImageUrl(String FullImageUrl) {
        this.FullImageUrl = FullImageUrl;
    }

    /**
     * Get <p>版本</p> 
     * @return MainVersion <p>版本</p>
     */
    public String getMainVersion() {
        return this.MainVersion;
    }

    /**
     * Set <p>版本</p>
     * @param MainVersion <p>版本</p>
     */
    public void setMainVersion(String MainVersion) {
        this.MainVersion = MainVersion;
    }

    /**
     * Get <p>镜像地址域名</p> 
     * @return RegistryUrl <p>镜像地址域名</p>
     */
    public String getRegistryUrl() {
        return this.RegistryUrl;
    }

    /**
     * Set <p>镜像地址域名</p>
     * @param RegistryUrl <p>镜像地址域名</p>
     */
    public void setRegistryUrl(String RegistryUrl) {
        this.RegistryUrl = RegistryUrl;
    }

    /**
     * Get <p>镜像命名空间</p> 
     * @return NamespaceName <p>镜像命名空间</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>镜像命名空间</p>
     * @param NamespaceName <p>镜像命名空间</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>镜像仓库名</p> 
     * @return RepoName <p>镜像仓库名</p>
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>镜像仓库名</p>
     * @param RepoName <p>镜像仓库名</p>
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>镜像版本标签</p> 
     * @return Tag <p>镜像版本标签</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>镜像版本标签</p>
     * @param Tag <p>镜像版本标签</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>用户名</p> 
     * @return Username <p>用户名</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>用户名</p>
     * @param Username <p>用户名</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>密码</p> 
     * @return Password <p>密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码</p>
     * @param Password <p>密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>镜像拉取密钥</p> 
     * @return ImagePullSecret <p>镜像拉取密钥</p>
     */
    public ImagePullSecret getImagePullSecret() {
        return this.ImagePullSecret;
    }

    /**
     * Set <p>镜像拉取密钥</p>
     * @param ImagePullSecret <p>镜像拉取密钥</p>
     */
    public void setImagePullSecret(ImagePullSecret ImagePullSecret) {
        this.ImagePullSecret = ImagePullSecret;
    }

    /**
     * Get <p>镜像拉取策略</p> 
     * @return ImagePullPolicy <p>镜像拉取策略</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>镜像拉取策略</p>
     * @param ImagePullPolicy <p>镜像拉取策略</p>
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    public ImageInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfoV2(ImageInfoV2 source) {
        if (source.ImageMode != null) {
            this.ImageMode = new String(source.ImageMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LegacyCCR != null) {
            this.LegacyCCR = new Boolean(source.LegacyCCR);
        }
        if (source.FullImageUrl != null) {
            this.FullImageUrl = new String(source.FullImageUrl);
        }
        if (source.MainVersion != null) {
            this.MainVersion = new String(source.MainVersion);
        }
        if (source.RegistryUrl != null) {
            this.RegistryUrl = new String(source.RegistryUrl);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ImagePullSecret != null) {
            this.ImagePullSecret = new ImagePullSecret(source.ImagePullSecret);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageMode", this.ImageMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LegacyCCR", this.LegacyCCR);
        this.setParamSimple(map, prefix + "FullImageUrl", this.FullImageUrl);
        this.setParamSimple(map, prefix + "MainVersion", this.MainVersion);
        this.setParamSimple(map, prefix + "RegistryUrl", this.RegistryUrl);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "ImagePullSecret.", this.ImagePullSecret);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);

    }
}

