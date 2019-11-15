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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobStatus  extends AbstractModel{

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误时为错误描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 预期Worker数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DesiredWorkers")
    @Expose
    private Long DesiredWorkers;

    /**
    * 当前Worker数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentWorkers")
    @Expose
    private Long CurrentWorkers;

    /**
    * 副本名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private String [] Replicas;

    /**
     * 获取任务状态
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取错误时为错误描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return Message 错误时为错误描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误时为错误描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误时为错误描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取预期Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return DesiredWorkers 预期Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDesiredWorkers() {
        return this.DesiredWorkers;
    }

    /**
     * 设置预期Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DesiredWorkers 预期Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesiredWorkers(Long DesiredWorkers) {
        this.DesiredWorkers = DesiredWorkers;
    }

    /**
     * 获取当前Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return CurrentWorkers 当前Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentWorkers() {
        return this.CurrentWorkers;
    }

    /**
     * 设置当前Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentWorkers 当前Worker数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentWorkers(Long CurrentWorkers) {
        this.CurrentWorkers = CurrentWorkers;
    }

    /**
     * 获取副本名
注意：此字段可能返回 null，表示取不到有效值。
     * @return Replicas 副本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReplicas() {
        return this.Replicas;
    }

    /**
     * 设置副本名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 副本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(String [] Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "DesiredWorkers", this.DesiredWorkers);
        this.setParamSimple(map, prefix + "CurrentWorkers", this.CurrentWorkers);
        this.setParamArraySimple(map, prefix + "Replicas.", this.Replicas);

    }
}

