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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel{

    /**
    * 项目名称，长度不超过24个字符
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目描述，长度不超过120个字符，不填默认为空
    */
    @SerializedName("ProjectDescription")
    @Expose
    private String ProjectDescription;

    /**
    * 权限模式，black为黑名单，white为白名单，不填默认为black
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
     * Get 项目名称，长度不超过24个字符 
     * @return ProjectName 项目名称，长度不超过24个字符
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称，长度不超过24个字符
     * @param ProjectName 项目名称，长度不超过24个字符
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目描述，长度不超过120个字符，不填默认为空 
     * @return ProjectDescription 项目描述，长度不超过120个字符，不填默认为空
     */
    public String getProjectDescription() {
        return this.ProjectDescription;
    }

    /**
     * Set 项目描述，长度不超过120个字符，不填默认为空
     * @param ProjectDescription 项目描述，长度不超过120个字符，不填默认为空
     */
    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    /**
     * Get 权限模式，black为黑名单，white为白名单，不填默认为black 
     * @return PolicyMode 权限模式，black为黑名单，white为白名单，不填默认为black
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set 权限模式，black为黑名单，white为白名单，不填默认为black
     * @param PolicyMode 权限模式，black为黑名单，white为白名单，不填默认为black
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDescription != null) {
            this.ProjectDescription = new String(source.ProjectDescription);
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDescription", this.ProjectDescription);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);

    }
}

