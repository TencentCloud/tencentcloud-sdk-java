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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunImageInfo extends AbstractModel{

    /**
    * 镜像仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 是否公有
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 镜像tag名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 镜像server
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * 镜像拉取地址
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get 镜像仓库名称 
     * @return RepositoryName 镜像仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 镜像仓库名称
     * @param RepositoryName 镜像仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 是否公有 
     * @return IsPublic 是否公有
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否公有
     * @param IsPublic 是否公有
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 镜像tag名称 
     * @return TagName 镜像tag名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像tag名称
     * @param TagName 镜像tag名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 镜像server 
     * @return ServerAddr 镜像server
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 镜像server
     * @param ServerAddr 镜像server
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get 镜像拉取地址 
     * @return ImageUrl 镜像拉取地址
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像拉取地址
     * @param ImageUrl 镜像拉取地址
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

