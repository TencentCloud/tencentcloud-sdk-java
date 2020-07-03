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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskRequest extends AbstractModel{

    /**
    * 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
    */
    @SerializedName("EccAppid")
    @Expose
    private String EccAppid;

    /**
     * Get 任务 ID 
     * @return TaskId 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID
     * @param TaskId 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。 
     * @return EccAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     */
    public String getEccAppid() {
        return this.EccAppid;
    }

    /**
     * Set 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     * @param EccAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数（暂时无需传入）。
     */
    public void setEccAppid(String EccAppid) {
        this.EccAppid = EccAppid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "EccAppid", this.EccAppid);

    }
}

