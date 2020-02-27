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

public class TagInfoResp extends AbstractModel{

    /**
    * Tag的总数
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
    * TagInfo列表
    */
    @SerializedName("TagInfo")
    @Expose
    private TagInfo [] TagInfo;

    /**
    * Server
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 仓库名称
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
     * Get Tag的总数 
     * @return TagCount Tag的总数
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set Tag的总数
     * @param TagCount Tag的总数
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Get TagInfo列表 
     * @return TagInfo TagInfo列表
     */
    public TagInfo [] getTagInfo() {
        return this.TagInfo;
    }

    /**
     * Set TagInfo列表
     * @param TagInfo TagInfo列表
     */
    public void setTagInfo(TagInfo [] TagInfo) {
        this.TagInfo = TagInfo;
    }

    /**
     * Get Server 
     * @return Server Server
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set Server
     * @param Server Server
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagCount", this.TagCount);
        this.setParamArrayObj(map, prefix + "TagInfo.", this.TagInfo);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);

    }
}

