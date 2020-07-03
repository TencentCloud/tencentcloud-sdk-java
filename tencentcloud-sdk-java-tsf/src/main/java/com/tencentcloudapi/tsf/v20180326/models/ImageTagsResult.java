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

public class ImageTagsResult extends AbstractModel{

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 仓库名,含命名空间,如tsf/ngin
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 镜像服务器地址
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 列表信息
    */
    @SerializedName("Content")
    @Expose
    private ImageTag [] Content;

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 仓库名,含命名空间,如tsf/ngin 
     * @return RepoName 仓库名,含命名空间,如tsf/ngin
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名,含命名空间,如tsf/ngin
     * @param RepoName 仓库名,含命名空间,如tsf/ngin
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 镜像服务器地址 
     * @return Server 镜像服务器地址
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像服务器地址
     * @param Server 镜像服务器地址
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 列表信息 
     * @return Content 列表信息
     */
    public ImageTag [] getContent() {
        return this.Content;
    }

    /**
     * Set 列表信息
     * @param Content 列表信息
     */
    public void setContent(ImageTag [] Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

