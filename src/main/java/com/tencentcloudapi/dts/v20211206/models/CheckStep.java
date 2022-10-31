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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckStep extends AbstractModel{

    /**
    * 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 步骤Id， 如：ConnectDBCheck、VersionCheck、SrcPrivilegeCheck等，具体校验项和源目标实例相关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 此检查步骤的结果，pass(校验通过)、failed(校验失败)、notStarted(校验还未开始进行)、blocked(检验阻塞)、warning(校验有告警，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepStatus")
    @Expose
    private String StepStatus;

    /**
    * 此检查步骤的错误消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
    * 每个检查步骤里的具体检查项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailCheckItems")
    @Expose
    private DetailCheckItem [] DetailCheckItems;

    /**
    * 是否已跳过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasSkipped")
    @Expose
    private Boolean HasSkipped;

    /**
     * Get 步骤编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNo 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNo 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 步骤Id， 如：ConnectDBCheck、VersionCheck、SrcPrivilegeCheck等，具体校验项和源目标实例相关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepId 步骤Id， 如：ConnectDBCheck、VersionCheck、SrcPrivilegeCheck等，具体校验项和源目标实例相关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤Id， 如：ConnectDBCheck、VersionCheck、SrcPrivilegeCheck等，具体校验项和源目标实例相关
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepId 步骤Id， 如：ConnectDBCheck、VersionCheck、SrcPrivilegeCheck等，具体校验项和源目标实例相关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 步骤名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepName 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepName 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 此检查步骤的结果，pass(校验通过)、failed(校验失败)、notStarted(校验还未开始进行)、blocked(检验阻塞)、warning(校验有告警，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepStatus 此检查步骤的结果，pass(校验通过)、failed(校验失败)、notStarted(校验还未开始进行)、blocked(检验阻塞)、warning(校验有告警，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepStatus() {
        return this.StepStatus;
    }

    /**
     * Set 此检查步骤的结果，pass(校验通过)、failed(校验失败)、notStarted(校验还未开始进行)、blocked(检验阻塞)、warning(校验有告警，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepStatus 此检查步骤的结果，pass(校验通过)、failed(校验失败)、notStarted(校验还未开始进行)、blocked(检验阻塞)、warning(校验有告警，但仍通过)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepStatus(String StepStatus) {
        this.StepStatus = StepStatus;
    }

    /**
     * Get 此检查步骤的错误消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepMessage 此检查步骤的错误消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set 此检查步骤的错误消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepMessage 此检查步骤的错误消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * Get 每个检查步骤里的具体检查项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailCheckItems 每个检查步骤里的具体检查项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailCheckItem [] getDetailCheckItems() {
        return this.DetailCheckItems;
    }

    /**
     * Set 每个检查步骤里的具体检查项
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailCheckItems 每个检查步骤里的具体检查项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailCheckItems(DetailCheckItem [] DetailCheckItems) {
        this.DetailCheckItems = DetailCheckItems;
    }

    /**
     * Get 是否已跳过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasSkipped 是否已跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasSkipped() {
        return this.HasSkipped;
    }

    /**
     * Set 是否已跳过
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasSkipped 是否已跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasSkipped(Boolean HasSkipped) {
        this.HasSkipped = HasSkipped;
    }

    public CheckStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckStep(CheckStep source) {
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepStatus != null) {
            this.StepStatus = new String(source.StepStatus);
        }
        if (source.StepMessage != null) {
            this.StepMessage = new String(source.StepMessage);
        }
        if (source.DetailCheckItems != null) {
            this.DetailCheckItems = new DetailCheckItem[source.DetailCheckItems.length];
            for (int i = 0; i < source.DetailCheckItems.length; i++) {
                this.DetailCheckItems[i] = new DetailCheckItem(source.DetailCheckItems[i]);
            }
        }
        if (source.HasSkipped != null) {
            this.HasSkipped = new Boolean(source.HasSkipped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepStatus", this.StepStatus);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);
        this.setParamArrayObj(map, prefix + "DetailCheckItems.", this.DetailCheckItems);
        this.setParamSimple(map, prefix + "HasSkipped", this.HasSkipped);

    }
}

