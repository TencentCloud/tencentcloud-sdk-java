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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AirflowGitSource extends AbstractModel {

    /**
    * <p>git仓库URL</p>
    */
    @SerializedName("RepositoryUrl")
    @Expose
    private String RepositoryUrl;

    /**
    * <p>DAG跟踪分支/TAG</p>
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * <p>DAG挂载目录</p>
    */
    @SerializedName("Directory")
    @Expose
    private String Directory;

    /**
     * Get <p>git仓库URL</p> 
     * @return RepositoryUrl <p>git仓库URL</p>
     */
    public String getRepositoryUrl() {
        return this.RepositoryUrl;
    }

    /**
     * Set <p>git仓库URL</p>
     * @param RepositoryUrl <p>git仓库URL</p>
     */
    public void setRepositoryUrl(String RepositoryUrl) {
        this.RepositoryUrl = RepositoryUrl;
    }

    /**
     * Get <p>DAG跟踪分支/TAG</p> 
     * @return Ref <p>DAG跟踪分支/TAG</p>
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set <p>DAG跟踪分支/TAG</p>
     * @param Ref <p>DAG跟踪分支/TAG</p>
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get <p>DAG挂载目录</p> 
     * @return Directory <p>DAG挂载目录</p>
     */
    public String getDirectory() {
        return this.Directory;
    }

    /**
     * Set <p>DAG挂载目录</p>
     * @param Directory <p>DAG挂载目录</p>
     */
    public void setDirectory(String Directory) {
        this.Directory = Directory;
    }

    public AirflowGitSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AirflowGitSource(AirflowGitSource source) {
        if (source.RepositoryUrl != null) {
            this.RepositoryUrl = new String(source.RepositoryUrl);
        }
        if (source.Ref != null) {
            this.Ref = new String(source.Ref);
        }
        if (source.Directory != null) {
            this.Directory = new String(source.Directory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryUrl", this.RepositoryUrl);
        this.setParamSimple(map, prefix + "Ref", this.Ref);
        this.setParamSimple(map, prefix + "Directory", this.Directory);

    }
}

