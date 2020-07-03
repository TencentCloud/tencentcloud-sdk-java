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

public class DescribeImagesRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 镜像仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 指定镜像版本(Tag)，不填默认返回仓库内全部容器镜像
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 每页个数，用于分页，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页数，默认值为1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

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
     * Get 指定镜像版本(Tag)，不填默认返回仓库内全部容器镜像 
     * @return ImageVersion 指定镜像版本(Tag)，不填默认返回仓库内全部容器镜像
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 指定镜像版本(Tag)，不填默认返回仓库内全部容器镜像
     * @param ImageVersion 指定镜像版本(Tag)，不填默认返回仓库内全部容器镜像
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 每页个数，用于分页，默认20 
     * @return Limit 每页个数，用于分页，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页个数，用于分页，默认20
     * @param Limit 每页个数，用于分页，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页数，默认值为1 
     * @return Offset 页数，默认值为1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页数，默认值为1
     * @param Offset 页数，默认值为1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

