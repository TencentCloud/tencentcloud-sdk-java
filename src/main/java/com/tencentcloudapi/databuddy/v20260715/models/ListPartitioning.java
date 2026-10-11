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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPartitioning extends AbstractModel {

    /**
    * 分区字段
    */
    @SerializedName("FiledNames")
    @Expose
    private String [] FiledNames;

    /**
    * 分区
    */
    @SerializedName("Assignments")
    @Expose
    private ListPartition [] Assignments;

    /**
     * Get 分区字段 
     * @return FiledNames 分区字段
     */
    public String [] getFiledNames() {
        return this.FiledNames;
    }

    /**
     * Set 分区字段
     * @param FiledNames 分区字段
     */
    public void setFiledNames(String [] FiledNames) {
        this.FiledNames = FiledNames;
    }

    /**
     * Get 分区 
     * @return Assignments 分区
     */
    public ListPartition [] getAssignments() {
        return this.Assignments;
    }

    /**
     * Set 分区
     * @param Assignments 分区
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
        if (source.FiledNames != null) {
            this.FiledNames = new String[source.FiledNames.length];
            for (int i = 0; i < source.FiledNames.length; i++) {
                this.FiledNames[i] = new String(source.FiledNames[i]);
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
        this.setParamArraySimple(map, prefix + "FiledNames.", this.FiledNames);
        this.setParamArrayObj(map, prefix + "Assignments.", this.Assignments);

    }
}

