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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstancesProjectRequest extends AbstractModel {

    /**
    * 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。支持同时操作多个实例。
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * 所属新项目的ID。可通过[DescribeProject](https://cloud.tencent.com/document/api/651/78725)获取
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。支持同时操作多个实例。 
     * @return DBInstanceIdSet 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。支持同时操作多个实例。
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。支持同时操作多个实例。
     * @param DBInstanceIdSet 实例ID集合。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取。支持同时操作多个实例。
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get 所属新项目的ID。可通过[DescribeProject](https://cloud.tencent.com/document/api/651/78725)获取 
     * @return ProjectId 所属新项目的ID。可通过[DescribeProject](https://cloud.tencent.com/document/api/651/78725)获取
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属新项目的ID。可通过[DescribeProject](https://cloud.tencent.com/document/api/651/78725)获取
     * @param ProjectId 所属新项目的ID。可通过[DescribeProject](https://cloud.tencent.com/document/api/651/78725)获取
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

