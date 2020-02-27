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

public class ModifyRepositoryInfoPersonalRequest extends AbstractModel{

    /**
    * 仓库名称
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 仓库描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

