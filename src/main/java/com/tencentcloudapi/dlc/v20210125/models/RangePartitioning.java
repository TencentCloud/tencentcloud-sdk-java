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

public class RangePartitioning extends AbstractModel {

    /**
    * <p>字段名</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>分区信息</p>
    */
    @SerializedName("Assignments")
    @Expose
    private RangePartition [] Assignments;

    /**
     * Get <p>字段名</p> 
     * @return FieldName <p>字段名</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名</p>
     * @param FieldName <p>字段名</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>分区信息</p> 
     * @return Assignments <p>分区信息</p>
     */
    public RangePartition [] getAssignments() {
        return this.Assignments;
    }

    /**
     * Set <p>分区信息</p>
     * @param Assignments <p>分区信息</p>
     */
    public void setAssignments(RangePartition [] Assignments) {
        this.Assignments = Assignments;
    }

    public RangePartitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RangePartitioning(RangePartitioning source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Assignments != null) {
            this.Assignments = new RangePartition[source.Assignments.length];
            for (int i = 0; i < source.Assignments.length; i++) {
                this.Assignments[i] = new RangePartition(source.Assignments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamArrayObj(map, prefix + "Assignments.", this.Assignments);

    }
}

