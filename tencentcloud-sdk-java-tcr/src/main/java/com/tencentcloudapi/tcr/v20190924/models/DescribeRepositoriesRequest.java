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

public class DescribeRepositoriesRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 指定命名空间，不填写默认为查询所有命名空间下镜像仓库
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 指定镜像仓库，不填写默认查询指定命名空间下所有镜像仓库
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 页数，用于分页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页个数，用于分页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 基于字段排序，支持的值有-creation_time,-name, -update_time
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 指定命名空间，不填写默认为查询所有命名空间下镜像仓库 
     * @return NamespaceName 指定命名空间，不填写默认为查询所有命名空间下镜像仓库
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 指定命名空间，不填写默认为查询所有命名空间下镜像仓库
     * @param NamespaceName 指定命名空间，不填写默认为查询所有命名空间下镜像仓库
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 指定镜像仓库，不填写默认查询指定命名空间下所有镜像仓库 
     * @return RepositoryName 指定镜像仓库，不填写默认查询指定命名空间下所有镜像仓库
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 指定镜像仓库，不填写默认查询指定命名空间下所有镜像仓库
     * @param RepositoryName 指定镜像仓库，不填写默认查询指定命名空间下所有镜像仓库
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 页数，用于分页 
     * @return Offset 页数，用于分页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页数，用于分页
     * @param Offset 页数，用于分页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页个数，用于分页 
     * @return Limit 每页个数，用于分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页个数，用于分页
     * @param Limit 每页个数，用于分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 基于字段排序，支持的值有-creation_time,-name, -update_time 
     * @return SortBy 基于字段排序，支持的值有-creation_time,-name, -update_time
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 基于字段排序，支持的值有-creation_time,-name, -update_time
     * @param SortBy 基于字段排序，支持的值有-creation_time,-name, -update_time
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);

    }
}

