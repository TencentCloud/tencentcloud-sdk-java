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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectSecurityGroupRequest  extends AbstractModel{

    /**
    * 0:默认项目；-1 所有项目; >0: 特定项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 安全组Id
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
     * 获取0:默认项目；-1 所有项目; >0: 特定项目
     * @return ProjectId 0:默认项目；-1 所有项目; >0: 特定项目
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置0:默认项目；-1 所有项目; >0: 特定项目
     * @param ProjectId 0:默认项目；-1 所有项目; >0: 特定项目
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取安全组Id
     * @return SecurityGroupId 安全组Id
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组Id
     * @param SecurityGroupId 安全组Id
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);

    }
}

