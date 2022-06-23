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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepositoryInfo extends AbstractModel{

    /**
    * git source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 仓库名
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 分支名
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
     * Get git source 
     * @return Source git source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set git source
     * @param Source git source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 仓库名 
     * @return Repo 仓库名
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 仓库名
     * @param Repo 仓库名
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 分支名 
     * @return Branch 分支名
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支名
     * @param Branch 分支名
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public RepositoryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepositoryInfo(RepositoryInfo source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "Branch", this.Branch);

    }
}

