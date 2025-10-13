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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetProjectRequest extends AbstractModel {

    /**
    * 项目id。一般使用项目Id来查询，与projectName必须存在一个。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 项目id。一般使用项目Id来查询，与projectName必须存在一个。 
     * @return ProjectId 项目id。一般使用项目Id来查询，与projectName必须存在一个。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id。一般使用项目Id来查询，与projectName必须存在一个。
     * @param ProjectId 项目id。一般使用项目Id来查询，与projectName必须存在一个。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public GetProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProjectRequest(GetProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

