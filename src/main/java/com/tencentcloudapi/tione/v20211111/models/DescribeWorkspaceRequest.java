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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkspaceRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>是否包含运行中的任务</p>
    */
    @SerializedName("WithRunningTasks")
    @Expose
    private Boolean WithRunningTasks;

    /**
    * <p>是否包含有管理权限的人员信息</p>
    */
    @SerializedName("WithMembers")
    @Expose
    private Boolean WithMembers;

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>是否包含运行中的任务</p> 
     * @return WithRunningTasks <p>是否包含运行中的任务</p>
     */
    public Boolean getWithRunningTasks() {
        return this.WithRunningTasks;
    }

    /**
     * Set <p>是否包含运行中的任务</p>
     * @param WithRunningTasks <p>是否包含运行中的任务</p>
     */
    public void setWithRunningTasks(Boolean WithRunningTasks) {
        this.WithRunningTasks = WithRunningTasks;
    }

    /**
     * Get <p>是否包含有管理权限的人员信息</p> 
     * @return WithMembers <p>是否包含有管理权限的人员信息</p>
     */
    public Boolean getWithMembers() {
        return this.WithMembers;
    }

    /**
     * Set <p>是否包含有管理权限的人员信息</p>
     * @param WithMembers <p>是否包含有管理权限的人员信息</p>
     */
    public void setWithMembers(Boolean WithMembers) {
        this.WithMembers = WithMembers;
    }

    public DescribeWorkspaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkspaceRequest(DescribeWorkspaceRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.WithRunningTasks != null) {
            this.WithRunningTasks = new Boolean(source.WithRunningTasks);
        }
        if (source.WithMembers != null) {
            this.WithMembers = new Boolean(source.WithMembers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "WithRunningTasks", this.WithRunningTasks);
        this.setParamSimple(map, prefix + "WithMembers", this.WithMembers);

    }
}

