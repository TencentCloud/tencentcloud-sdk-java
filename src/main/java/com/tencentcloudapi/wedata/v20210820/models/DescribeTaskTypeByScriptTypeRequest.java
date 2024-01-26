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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskTypeByScriptTypeRequest extends AbstractModel {

    /**
    * 脚本类型
    */
    @SerializedName("ScriptType")
    @Expose
    private String ScriptType;

    /**
    * 项目编号
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 脚本类型 
     * @return ScriptType 脚本类型
     */
    public String getScriptType() {
        return this.ScriptType;
    }

    /**
     * Set 脚本类型
     * @param ScriptType 脚本类型
     */
    public void setScriptType(String ScriptType) {
        this.ScriptType = ScriptType;
    }

    /**
     * Get 项目编号 
     * @return ProjectId 项目编号
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目编号
     * @param ProjectId 项目编号
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeTaskTypeByScriptTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskTypeByScriptTypeRequest(DescribeTaskTypeByScriptTypeRequest source) {
        if (source.ScriptType != null) {
            this.ScriptType = new String(source.ScriptType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptType", this.ScriptType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

