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

public class DescribeRepositoryFilterPersonalRequest extends AbstractModel{

    /**
    * 搜索镜像名
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回最大数量，默认 20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 筛选条件：1表示public，0表示private
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 搜索镜像名 
     * @return RepoName 搜索镜像名
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 搜索镜像名
     * @param RepoName 搜索镜像名
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回最大数量，默认 20，最大100 
     * @return Limit 返回最大数量，默认 20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回最大数量，默认 20，最大100
     * @param Limit 返回最大数量，默认 20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 筛选条件：1表示public，0表示private 
     * @return Public 筛选条件：1表示public，0表示private
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 筛选条件：1表示public，0表示private
     * @param Public 筛选条件：1表示public，0表示private
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

