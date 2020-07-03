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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GitConfig extends AbstractModel{

    /**
    * git地址
    */
    @SerializedName("RepositoryUrl")
    @Expose
    private String RepositoryUrl;

    /**
    * 代码分支
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
     * Get git地址 
     * @return RepositoryUrl git地址
     */
    public String getRepositoryUrl() {
        return this.RepositoryUrl;
    }

    /**
     * Set git地址
     * @param RepositoryUrl git地址
     */
    public void setRepositoryUrl(String RepositoryUrl) {
        this.RepositoryUrl = RepositoryUrl;
    }

    /**
     * Get 代码分支
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branch 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branch 代码分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryUrl", this.RepositoryUrl);
        this.setParamSimple(map, prefix + "Branch", this.Branch);

    }
}

