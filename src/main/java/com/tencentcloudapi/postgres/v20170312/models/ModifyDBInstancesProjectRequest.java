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

public class ModifyDBInstancesProjectRequest extends AbstractModel{

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
     * Get postgresql实例ID数组 
     * @return DBInstanceIdSet postgresql实例ID数组
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set postgresql实例ID数组
     * @param DBInstanceIdSet postgresql实例ID数组
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get postgresql实例所属新项目的ID 
     * @return ProjectId postgresql实例所属新项目的ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set postgresql实例所属新项目的ID
     * @param ProjectId postgresql实例所属新项目的ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyDBInstancesProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstancesProjectRequest(ModifyDBInstancesProjectRequest source) {
        if (source.DBInstanceIdSet != null) {
            this.DBInstanceIdSet = new String[source.DBInstanceIdSet.length];
            for (int i = 0; i < source.DBInstanceIdSet.length; i++) {
                this.DBInstanceIdSet[i] = new String(source.DBInstanceIdSet[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

