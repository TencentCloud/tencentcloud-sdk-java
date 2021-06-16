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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectStreamConnectStatusChangedEvent extends AbstractModel{

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束。</li> 
     * @return Status 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束。</li>
     * @param Status 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ProjectStreamConnectStatusChangedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectStreamConnectStatusChangedEvent(ProjectStreamConnectStatusChangedEvent source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

