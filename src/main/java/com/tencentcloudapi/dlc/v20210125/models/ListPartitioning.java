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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPartitioning extends AbstractModel {

    /**
    * <p>分区字段</p>
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
    * <p>分区列表信息</p>
    */
    @SerializedName("Assignments")
    @Expose
    private ListPartition [] Assignments;

    /**
     * Get <p>分区字段</p> 
     * @return FieldNames <p>分区字段</p>
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set <p>分区字段</p>
     * @param FieldNames <p>分区字段</p>
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    /**
     * Get <p>分区列表信息</p> 
     * @return Assignments <p>分区列表信息</p>
     */
    public ListPartition [] getAssignments() {
        return this.Assignments;
    }

    /**
     * Set <p>分区列表信息</p>
     * @param Assignments <p>分区列表信息</p>
     */
    public void setAssignments(ListPartition [] Assignments) {
        this.Assignments = Assignments;
    }

    public ListPartitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPartitioning(ListPartitioning source) {
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
        if (source.Assignments != null) {
            this.Assignments = new ListPartition[source.Assignments.length];
            for (int i = 0; i < source.Assignments.length; i++) {
                this.Assignments[i] = new ListPartition(source.Assignments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);
        this.setParamArrayObj(map, prefix + "Assignments.", this.Assignments);

    }
}

