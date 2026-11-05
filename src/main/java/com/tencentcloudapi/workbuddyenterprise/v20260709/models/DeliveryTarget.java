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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliveryTarget extends AbstractModel {

    /**
    * <p>投递类型：BOT_CHANNEL（IM 渠道投递）或 WEBHOOK（自定义回调）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>是否启用此投递目标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>投递配置，按 Type 不同</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Options")
    @Expose
    private TargetOptions Options;

    /**
     * Get <p>投递类型：BOT_CHANNEL（IM 渠道投递）或 WEBHOOK（自定义回调）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>投递类型：BOT_CHANNEL（IM 渠道投递）或 WEBHOOK（自定义回调）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>投递类型：BOT_CHANNEL（IM 渠道投递）或 WEBHOOK（自定义回调）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>投递类型：BOT_CHANNEL（IM 渠道投递）或 WEBHOOK（自定义回调）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否启用此投递目标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled <p>是否启用此投递目标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用此投递目标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled <p>是否启用此投递目标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>投递配置，按 Type 不同</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Options <p>投递配置，按 Type 不同</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetOptions getOptions() {
        return this.Options;
    }

    /**
     * Set <p>投递配置，按 Type 不同</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Options <p>投递配置，按 Type 不同</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptions(TargetOptions Options) {
        this.Options = Options;
    }

    public DeliveryTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliveryTarget(DeliveryTarget source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Options != null) {
            this.Options = new TargetOptions(source.Options);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Options.", this.Options);

    }
}

