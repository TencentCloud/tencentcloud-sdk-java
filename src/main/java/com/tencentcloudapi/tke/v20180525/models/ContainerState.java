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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerState extends AbstractModel{

    /**
    * 容器运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 容器状态：created, running, exited, unknown
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 容器运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 容器运行退出码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
    * 容器状态 Reason
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 容器状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 容器重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
     * Get 容器运行开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 容器运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 容器运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 容器运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 容器状态：created, running, exited, unknown 
     * @return State 容器状态：created, running, exited, unknown
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 容器状态：created, running, exited, unknown
     * @param State 容器状态：created, running, exited, unknown
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 容器运行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 容器运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 容器运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 容器运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 容器运行退出码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExitCode 容器运行退出码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set 容器运行退出码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExitCode 容器运行退出码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * Get 容器状态 Reason
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 容器状态 Reason
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 容器状态 Reason
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 容器状态 Reason
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 容器状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 容器状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 容器状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 容器状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 容器重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 容器重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 容器重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 容器重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    public ContainerState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerState(ContainerState source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);

    }
}

