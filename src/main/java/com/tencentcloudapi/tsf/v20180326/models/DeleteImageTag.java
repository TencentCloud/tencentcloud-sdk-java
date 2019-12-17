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

public class DeleteImageTag extends AbstractModel{

    /**
    * 仓库名，如/tsf/nginx
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 版本号:如V1
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
     * Get 仓库名，如/tsf/nginx 
     * @return RepoName 仓库名，如/tsf/nginx
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名，如/tsf/nginx
     * @param RepoName 仓库名，如/tsf/nginx
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 版本号:如V1 
     * @return TagName 版本号:如V1
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 版本号:如V1
     * @param TagName 版本号:如V1
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);

    }
}

