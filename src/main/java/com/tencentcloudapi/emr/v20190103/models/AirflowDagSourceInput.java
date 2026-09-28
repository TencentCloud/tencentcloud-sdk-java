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

public class AirflowDagSourceInput extends AbstractModel {

    /**
    * <p>是否支持dag共享源</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>dag源类型</p><p>枚举值：</p><ul><li>CFS： CFS</li><li>GIT： Git</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>cfs实例DAG源配置</p>
    */
    @SerializedName("Cfs")
    @Expose
    private AirflowCfsSource Cfs;

    /**
    * <p>Git型DAG源配置</p>
    */
    @SerializedName("Git")
    @Expose
    private AirflowGitSource Git;

    /**
     * Get <p>是否支持dag共享源</p> 
     * @return Enabled <p>是否支持dag共享源</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否支持dag共享源</p>
     * @param Enabled <p>是否支持dag共享源</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>dag源类型</p><p>枚举值：</p><ul><li>CFS： CFS</li><li>GIT： Git</li></ul> 
     * @return Type <p>dag源类型</p><p>枚举值：</p><ul><li>CFS： CFS</li><li>GIT： Git</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>dag源类型</p><p>枚举值：</p><ul><li>CFS： CFS</li><li>GIT： Git</li></ul>
     * @param Type <p>dag源类型</p><p>枚举值：</p><ul><li>CFS： CFS</li><li>GIT： Git</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>cfs实例DAG源配置</p> 
     * @return Cfs <p>cfs实例DAG源配置</p>
     */
    public AirflowCfsSource getCfs() {
        return this.Cfs;
    }

    /**
     * Set <p>cfs实例DAG源配置</p>
     * @param Cfs <p>cfs实例DAG源配置</p>
     */
    public void setCfs(AirflowCfsSource Cfs) {
        this.Cfs = Cfs;
    }

    /**
     * Get <p>Git型DAG源配置</p> 
     * @return Git <p>Git型DAG源配置</p>
     */
    public AirflowGitSource getGit() {
        return this.Git;
    }

    /**
     * Set <p>Git型DAG源配置</p>
     * @param Git <p>Git型DAG源配置</p>
     */
    public void setGit(AirflowGitSource Git) {
        this.Git = Git;
    }

    public AirflowDagSourceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AirflowDagSourceInput(AirflowDagSourceInput source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Cfs != null) {
            this.Cfs = new AirflowCfsSource(source.Cfs);
        }
        if (source.Git != null) {
            this.Git = new AirflowGitSource(source.Git);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Cfs.", this.Cfs);
        this.setParamObj(map, prefix + "Git.", this.Git);

    }
}

