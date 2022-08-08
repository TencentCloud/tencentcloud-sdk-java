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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitWorkflow extends AbstractModel{

    /**
    * 被提交的任务id集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 执行结果
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 执行情况备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * 执行情况id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorId")
    @Expose
    private String ErrorId;

    /**
     * Get 被提交的任务id集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskIds 被提交的任务id集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 被提交的任务id集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIds 被提交的任务id集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 执行结果 
     * @return Result 执行结果
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 执行结果
     * @param Result 执行结果
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 执行情况备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDesc 执行情况备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set 执行情况备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDesc 执行情况备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get 执行情况id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorId 执行情况id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorId() {
        return this.ErrorId;
    }

    /**
     * Set 执行情况id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorId 执行情况id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorId(String ErrorId) {
        this.ErrorId = ErrorId;
    }

    public SubmitWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitWorkflow(SubmitWorkflow source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.ErrorId != null) {
            this.ErrorId = new String(source.ErrorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamSimple(map, prefix + "ErrorId", this.ErrorId);

    }
}

