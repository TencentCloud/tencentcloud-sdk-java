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

public class CreateRepositoryPersonalRequest extends AbstractModel {

    /**
    * 仓库名称，格式为 {Namespace}/{lmageName}。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 是否公共,1:公共,0:私有
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
    * 仓库描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 仓库名称，格式为 {Namespace}/{lmageName}。 
     * @return RepoName 仓库名称，格式为 {Namespace}/{lmageName}。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名称，格式为 {Namespace}/{lmageName}。
     * @param RepoName 仓库名称，格式为 {Namespace}/{lmageName}。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 是否公共,1:公共,0:私有 
     * @return Public 是否公共,1:公共,0:私有
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 是否公共,1:公共,0:私有
     * @param Public 是否公共,1:公共,0:私有
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    /**
     * Get 仓库描述 
     * @return Description 仓库描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 仓库描述
     * @param Description 仓库描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateRepositoryPersonalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRepositoryPersonalRequest(CreateRepositoryPersonalRequest source) {
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.Public != null) {
            this.Public = new Long(source.Public);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

