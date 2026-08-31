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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpansionPolicy extends AbstractModel {

    /**
    * <p>扩容方式。可选值：LAUNCH_TEMPLATE（启动模板）、MULTI_CARD（多卡型混扩）。</p>
    */
    @SerializedName("ExpansionMode")
    @Expose
    private String ExpansionMode;

    /**
    * <p>启动模板 ID 列表，最多 10 个。ExpansionMode=LAUNCH_TEMPLATE 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTemplateIds")
    @Expose
    private String [] LaunchTemplateIds;

    /**
    * <p>参考实例 ID，根据已有实例配置生成启动模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferenceInstanceId")
    @Expose
    private String ReferenceInstanceId;

    /**
    * <p>启动模板扩容覆盖配置。ExpansionMode=MULTI_CARD 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateOverrides")
    @Expose
    private TemplateOverrides TemplateOverrides;

    /**
    * <p>候选规格排序策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpansionPriority")
    @Expose
    private ExpansionPriority ExpansionPriority;

    /**
     * Get <p>扩容方式。可选值：LAUNCH_TEMPLATE（启动模板）、MULTI_CARD（多卡型混扩）。</p> 
     * @return ExpansionMode <p>扩容方式。可选值：LAUNCH_TEMPLATE（启动模板）、MULTI_CARD（多卡型混扩）。</p>
     */
    public String getExpansionMode() {
        return this.ExpansionMode;
    }

    /**
     * Set <p>扩容方式。可选值：LAUNCH_TEMPLATE（启动模板）、MULTI_CARD（多卡型混扩）。</p>
     * @param ExpansionMode <p>扩容方式。可选值：LAUNCH_TEMPLATE（启动模板）、MULTI_CARD（多卡型混扩）。</p>
     */
    public void setExpansionMode(String ExpansionMode) {
        this.ExpansionMode = ExpansionMode;
    }

    /**
     * Get <p>启动模板 ID 列表，最多 10 个。ExpansionMode=LAUNCH_TEMPLATE 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchTemplateIds <p>启动模板 ID 列表，最多 10 个。ExpansionMode=LAUNCH_TEMPLATE 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLaunchTemplateIds() {
        return this.LaunchTemplateIds;
    }

    /**
     * Set <p>启动模板 ID 列表，最多 10 个。ExpansionMode=LAUNCH_TEMPLATE 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTemplateIds <p>启动模板 ID 列表，最多 10 个。ExpansionMode=LAUNCH_TEMPLATE 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTemplateIds(String [] LaunchTemplateIds) {
        this.LaunchTemplateIds = LaunchTemplateIds;
    }

    /**
     * Get <p>参考实例 ID，根据已有实例配置生成启动模板。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferenceInstanceId <p>参考实例 ID，根据已有实例配置生成启动模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReferenceInstanceId() {
        return this.ReferenceInstanceId;
    }

    /**
     * Set <p>参考实例 ID，根据已有实例配置生成启动模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferenceInstanceId <p>参考实例 ID，根据已有实例配置生成启动模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferenceInstanceId(String ReferenceInstanceId) {
        this.ReferenceInstanceId = ReferenceInstanceId;
    }

    /**
     * Get <p>启动模板扩容覆盖配置。ExpansionMode=MULTI_CARD 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateOverrides <p>启动模板扩容覆盖配置。ExpansionMode=MULTI_CARD 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TemplateOverrides getTemplateOverrides() {
        return this.TemplateOverrides;
    }

    /**
     * Set <p>启动模板扩容覆盖配置。ExpansionMode=MULTI_CARD 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateOverrides <p>启动模板扩容覆盖配置。ExpansionMode=MULTI_CARD 时使用。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateOverrides(TemplateOverrides TemplateOverrides) {
        this.TemplateOverrides = TemplateOverrides;
    }

    /**
     * Get <p>候选规格排序策略。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpansionPriority <p>候选规格排序策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpansionPriority getExpansionPriority() {
        return this.ExpansionPriority;
    }

    /**
     * Set <p>候选规格排序策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpansionPriority <p>候选规格排序策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpansionPriority(ExpansionPriority ExpansionPriority) {
        this.ExpansionPriority = ExpansionPriority;
    }

    public ExpansionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpansionPolicy(ExpansionPolicy source) {
        if (source.ExpansionMode != null) {
            this.ExpansionMode = new String(source.ExpansionMode);
        }
        if (source.LaunchTemplateIds != null) {
            this.LaunchTemplateIds = new String[source.LaunchTemplateIds.length];
            for (int i = 0; i < source.LaunchTemplateIds.length; i++) {
                this.LaunchTemplateIds[i] = new String(source.LaunchTemplateIds[i]);
            }
        }
        if (source.ReferenceInstanceId != null) {
            this.ReferenceInstanceId = new String(source.ReferenceInstanceId);
        }
        if (source.TemplateOverrides != null) {
            this.TemplateOverrides = new TemplateOverrides(source.TemplateOverrides);
        }
        if (source.ExpansionPriority != null) {
            this.ExpansionPriority = new ExpansionPriority(source.ExpansionPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpansionMode", this.ExpansionMode);
        this.setParamArraySimple(map, prefix + "LaunchTemplateIds.", this.LaunchTemplateIds);
        this.setParamSimple(map, prefix + "ReferenceInstanceId", this.ReferenceInstanceId);
        this.setParamObj(map, prefix + "TemplateOverrides.", this.TemplateOverrides);
        this.setParamObj(map, prefix + "ExpansionPriority.", this.ExpansionPriority);

    }
}

