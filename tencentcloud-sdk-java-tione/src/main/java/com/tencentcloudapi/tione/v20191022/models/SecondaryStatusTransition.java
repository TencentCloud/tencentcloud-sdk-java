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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecondaryStatusTransition extends AbstractModel{

    /**
    * 状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 状态名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
     * Get 状态开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 状态结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 状态名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusMessage 状态详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set 状态详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusMessage 状态详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);

    }
}

