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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerStatus extends AbstractModel{

    /**
    * 重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 是否就绪
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ready")
    @Expose
    private Boolean Ready;

    /**
    * 状态原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 容器的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 是否就绪
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ready 是否就绪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReady() {
        return this.Ready;
    }

    /**
     * Set 是否就绪
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ready 是否就绪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReady(Boolean Ready) {
        this.Ready = Ready;
    }

    /**
     * Get 状态原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 状态原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 状态原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 状态原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 容器的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 容器的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 容器的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 容器的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ContainerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerStatus(ContainerStatus source) {
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Ready != null) {
            this.Ready = new Boolean(source.Ready);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

