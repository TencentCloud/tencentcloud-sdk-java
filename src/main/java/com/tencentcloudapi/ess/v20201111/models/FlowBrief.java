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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowBrief extends AbstractModel{

    /**
    * 流程的编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流程的名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 流程的类型
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 流程状态
- `1` 未签署
- `2`  部分签署
- `3`  已退回
- `4`  完成签署
- `5`  已过期
- `6`  已取消
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * 流程创建的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 拒签或者取消的原因描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
     * Get 流程的编号 
     * @return FlowId 流程的编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程的编号
     * @param FlowId 流程的编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流程的名称 
     * @return FlowName 流程的名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流程的名称
     * @param FlowName 流程的名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 流程的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowDescription 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowDescription 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 流程的类型 
     * @return FlowType 流程的类型
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 流程的类型
     * @param FlowType 流程的类型
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 流程状态
- `1` 未签署
- `2`  部分签署
- `3`  已退回
- `4`  完成签署
- `5`  已过期
- `6`  已取消
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowStatus 流程状态
- `1` 未签署
- `2`  部分签署
- `3`  已退回
- `4`  完成签署
- `5`  已过期
- `6`  已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 流程状态
- `1` 未签署
- `2`  部分签署
- `3`  已退回
- `4`  完成签署
- `5`  已过期
- `6`  已取消
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowStatus 流程状态
- `1` 未签署
- `2`  部分签署
- `3`  已退回
- `4`  完成签署
- `5`  已过期
- `6`  已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 流程创建的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn 流程创建的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 流程创建的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn 流程创建的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 拒签或者取消的原因描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowMessage 拒签或者取消的原因描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 拒签或者取消的原因描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowMessage 拒签或者取消的原因描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    public FlowBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowBrief(FlowBrief source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new Long(source.FlowStatus);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "FlowMessage", this.FlowMessage);

    }
}

