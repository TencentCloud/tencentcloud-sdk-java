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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubProjectRequest extends AbstractModel{

    /**
    * 所属项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 子项目名称
    */
    @SerializedName("SubProjectName")
    @Expose
    private String SubProjectName;

    /**
     * Get 所属项目id 
     * @return ProjectId 所属项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目id
     * @param ProjectId 所属项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 子项目名称 
     * @return SubProjectName 子项目名称
     */
    public String getSubProjectName() {
        return this.SubProjectName;
    }

    /**
     * Set 子项目名称
     * @param SubProjectName 子项目名称
     */
    public void setSubProjectName(String SubProjectName) {
        this.SubProjectName = SubProjectName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SubProjectName", this.SubProjectName);

    }
}

