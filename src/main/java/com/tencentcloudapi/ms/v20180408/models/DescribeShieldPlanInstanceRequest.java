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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShieldPlanInstanceRequest  extends AbstractModel{

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 服务类别id
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
     * 获取资源id
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 获取服务类别id
     * @return Pid 服务类别id
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置服务类别id
     * @param Pid 服务类别id
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

