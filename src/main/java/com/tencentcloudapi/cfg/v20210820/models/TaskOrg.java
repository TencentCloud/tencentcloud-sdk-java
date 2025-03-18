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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOrg extends AbstractModel {

    /**
    * 演练角色
    */
    @SerializedName("TaskRole")
    @Expose
    private String TaskRole;

    /**
    * 负责人
    */
    @SerializedName("TaskOperator")
    @Expose
    private String TaskOperator;

    /**
     * Get 演练角色 
     * @return TaskRole 演练角色
     */
    public String getTaskRole() {
        return this.TaskRole;
    }

    /**
     * Set 演练角色
     * @param TaskRole 演练角色
     */
    public void setTaskRole(String TaskRole) {
        this.TaskRole = TaskRole;
    }

    /**
     * Get 负责人 
     * @return TaskOperator 负责人
     */
    public String getTaskOperator() {
        return this.TaskOperator;
    }

    /**
     * Set 负责人
     * @param TaskOperator 负责人
     */
    public void setTaskOperator(String TaskOperator) {
        this.TaskOperator = TaskOperator;
    }

    public TaskOrg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOrg(TaskOrg source) {
        if (source.TaskRole != null) {
            this.TaskRole = new String(source.TaskRole);
        }
        if (source.TaskOperator != null) {
            this.TaskOperator = new String(source.TaskOperator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskRole", this.TaskRole);
        this.setParamSimple(map, prefix + "TaskOperator", this.TaskOperator);

    }
}

