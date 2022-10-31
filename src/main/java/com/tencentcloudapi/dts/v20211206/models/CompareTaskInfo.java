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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTaskInfo extends AbstractModel{

    /**
    * 一致性校验任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 一致性校验结果，包括：unstart(未启动)、running(校验中)、canceled(已终止)、failed(校验任务失败)、inconsistent(不一致)、consistent(一致)、notexist(不存在校验任务)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 一致性校验任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareTaskId 一致性校验任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 一致性校验任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareTaskId 一致性校验任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 一致性校验结果，包括：unstart(未启动)、running(校验中)、canceled(已终止)、failed(校验任务失败)、inconsistent(不一致)、consistent(一致)、notexist(不存在校验任务)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 一致性校验结果，包括：unstart(未启动)、running(校验中)、canceled(已终止)、failed(校验任务失败)、inconsistent(不一致)、consistent(一致)、notexist(不存在校验任务)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 一致性校验结果，包括：unstart(未启动)、running(校验中)、canceled(已终止)、failed(校验任务失败)、inconsistent(不一致)、consistent(一致)、notexist(不存在校验任务)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 一致性校验结果，包括：unstart(未启动)、running(校验中)、canceled(已终止)、failed(校验任务失败)、inconsistent(不一致)、consistent(一致)、notexist(不存在校验任务)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CompareTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTaskInfo(CompareTaskInfo source) {
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

