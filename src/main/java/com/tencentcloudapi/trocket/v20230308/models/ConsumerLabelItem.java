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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerLabelItem extends AbstractModel {

    /**
    * <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>标签状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
     * Get <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label <p>标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>标签状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>标签状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>标签状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>标签状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>最近更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public ConsumerLabelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLabelItem(ConsumerLabelItem source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

