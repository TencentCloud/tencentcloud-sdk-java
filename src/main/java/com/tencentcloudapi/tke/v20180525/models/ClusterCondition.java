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

public class ClusterCondition extends AbstractModel{

    /**
    * 集群创建过程类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 集群创建过程状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 最后一次探测到该状态的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastProbeTime")
    @Expose
    private String LastProbeTime;

    /**
    * 最后一次转换到该过程的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTransitionTime")
    @Expose
    private String LastTransitionTime;

    /**
    * 转换到该过程的简明原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 转换到该过程的更多信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 集群创建过程类型 
     * @return Type 集群创建过程类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 集群创建过程类型
     * @param Type 集群创建过程类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 集群创建过程状态 
     * @return Status 集群创建过程状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群创建过程状态
     * @param Status 集群创建过程状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 最后一次探测到该状态的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastProbeTime 最后一次探测到该状态的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastProbeTime() {
        return this.LastProbeTime;
    }

    /**
     * Set 最后一次探测到该状态的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastProbeTime 最后一次探测到该状态的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastProbeTime(String LastProbeTime) {
        this.LastProbeTime = LastProbeTime;
    }

    /**
     * Get 最后一次转换到该过程的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTransitionTime 最后一次转换到该过程的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTransitionTime() {
        return this.LastTransitionTime;
    }

    /**
     * Set 最后一次转换到该过程的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTransitionTime 最后一次转换到该过程的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTransitionTime(String LastTransitionTime) {
        this.LastTransitionTime = LastTransitionTime;
    }

    /**
     * Get 转换到该过程的简明原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 转换到该过程的简明原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 转换到该过程的简明原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 转换到该过程的简明原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 转换到该过程的更多信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 转换到该过程的更多信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 转换到该过程的更多信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 转换到该过程的更多信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ClusterCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCondition(ClusterCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastProbeTime != null) {
            this.LastProbeTime = new String(source.LastProbeTime);
        }
        if (source.LastTransitionTime != null) {
            this.LastTransitionTime = new String(source.LastTransitionTime);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastProbeTime", this.LastProbeTime);
        this.setParamSimple(map, prefix + "LastTransitionTime", this.LastTransitionTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

