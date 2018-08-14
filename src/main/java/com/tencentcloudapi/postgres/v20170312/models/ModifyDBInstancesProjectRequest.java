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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstancesProjectRequest  extends AbstractModel{

    /**
    * postgresql实例ID数组
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * postgresql实例所属新项目的ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * 获取postgresql实例ID数组
     * @return DBInstanceIdSet postgresql实例ID数组
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * 设置postgresql实例ID数组
     * @param DBInstanceIdSet postgresql实例ID数组
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * 获取postgresql实例所属新项目的ID
     * @return ProjectId postgresql实例所属新项目的ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置postgresql实例所属新项目的ID
     * @param ProjectId postgresql实例所属新项目的ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

