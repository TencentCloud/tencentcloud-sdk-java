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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GitInfo extends AbstractModel {

    /**
    * Git地址。
    */
    @SerializedName("GitHttpPath")
    @Expose
    private String GitHttpPath;

    /**
    * Git用户名。
    */
    @SerializedName("GitUserName")
    @Expose
    private String GitUserName;

    /**
    * Git密码或者Token。
    */
    @SerializedName("GitTokenOrPassword")
    @Expose
    private String GitTokenOrPassword;

    /**
    * 分支。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 标签。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get Git地址。 
     * @return GitHttpPath Git地址。
     */
    public String getGitHttpPath() {
        return this.GitHttpPath;
    }

    /**
     * Set Git地址。
     * @param GitHttpPath Git地址。
     */
    public void setGitHttpPath(String GitHttpPath) {
        this.GitHttpPath = GitHttpPath;
    }

    /**
     * Get Git用户名。 
     * @return GitUserName Git用户名。
     */
    public String getGitUserName() {
        return this.GitUserName;
    }

    /**
     * Set Git用户名。
     * @param GitUserName Git用户名。
     */
    public void setGitUserName(String GitUserName) {
        this.GitUserName = GitUserName;
    }

    /**
     * Get Git密码或者Token。 
     * @return GitTokenOrPassword Git密码或者Token。
     */
    public String getGitTokenOrPassword() {
        return this.GitTokenOrPassword;
    }

    /**
     * Set Git密码或者Token。
     * @param GitTokenOrPassword Git密码或者Token。
     */
    public void setGitTokenOrPassword(String GitTokenOrPassword) {
        this.GitTokenOrPassword = GitTokenOrPassword;
    }

    /**
     * Get 分支。 
     * @return Branch 分支。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支。
     * @param Branch 分支。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get 标签。 
     * @return Tag 标签。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签。
     * @param Tag 标签。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public GitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GitInfo(GitInfo source) {
        if (source.GitHttpPath != null) {
            this.GitHttpPath = new String(source.GitHttpPath);
        }
        if (source.GitUserName != null) {
            this.GitUserName = new String(source.GitUserName);
        }
        if (source.GitTokenOrPassword != null) {
            this.GitTokenOrPassword = new String(source.GitTokenOrPassword);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GitHttpPath", this.GitHttpPath);
        this.setParamSimple(map, prefix + "GitUserName", this.GitUserName);
        this.setParamSimple(map, prefix + "GitTokenOrPassword", this.GitTokenOrPassword);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

