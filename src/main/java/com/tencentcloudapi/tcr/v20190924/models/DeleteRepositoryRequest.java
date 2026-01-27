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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRepositoryRequest extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>命名空间的名称</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>镜像仓库的名称</p>
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * <p>默认值为true，表示无论仓库是否存在镜像都直接删除；false代表删除仓库前需检查是否存在镜像。</p>
    */
    @SerializedName("ForceDelete")
    @Expose
    private Boolean ForceDelete;

    /**
     * Get <p>实例Id</p> 
     * @return RegistryId <p>实例Id</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>实例Id</p>
     * @param RegistryId <p>实例Id</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>命名空间的名称</p> 
     * @return NamespaceName <p>命名空间的名称</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>命名空间的名称</p>
     * @param NamespaceName <p>命名空间的名称</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>镜像仓库的名称</p> 
     * @return RepositoryName <p>镜像仓库的名称</p>
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set <p>镜像仓库的名称</p>
     * @param RepositoryName <p>镜像仓库的名称</p>
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get <p>默认值为true，表示无论仓库是否存在镜像都直接删除；false代表删除仓库前需检查是否存在镜像。</p> 
     * @return ForceDelete <p>默认值为true，表示无论仓库是否存在镜像都直接删除；false代表删除仓库前需检查是否存在镜像。</p>
     */
    public Boolean getForceDelete() {
        return this.ForceDelete;
    }

    /**
     * Set <p>默认值为true，表示无论仓库是否存在镜像都直接删除；false代表删除仓库前需检查是否存在镜像。</p>
     * @param ForceDelete <p>默认值为true，表示无论仓库是否存在镜像都直接删除；false代表删除仓库前需检查是否存在镜像。</p>
     */
    public void setForceDelete(Boolean ForceDelete) {
        this.ForceDelete = ForceDelete;
    }

    public DeleteRepositoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRepositoryRequest(DeleteRepositoryRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.ForceDelete != null) {
            this.ForceDelete = new Boolean(source.ForceDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ForceDelete", this.ForceDelete);

    }
}

