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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployServiceBatchDetail extends AbstractModel{

    /**
    * 旧实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldPodList")
    @Expose
    private DeployServicePodDetail OldPodList;

    /**
    * 新实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewPodList")
    @Expose
    private DeployServicePodDetail NewPodList;

    /**
    * 当前批次状态："WaitForTimeExceed", "WaitForResume", "Deploying", "Finish", "NotStart"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchStatus")
    @Expose
    private String BatchStatus;

    /**
    * 该批次预计旧实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodNum")
    @Expose
    private Long PodNum;

    /**
    * 批次id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchIndex")
    @Expose
    private Long BatchIndex;

    /**
     * Get 旧实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldPodList 旧实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployServicePodDetail getOldPodList() {
        return this.OldPodList;
    }

    /**
     * Set 旧实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldPodList 旧实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldPodList(DeployServicePodDetail OldPodList) {
        this.OldPodList = OldPodList;
    }

    /**
     * Get 新实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewPodList 新实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployServicePodDetail getNewPodList() {
        return this.NewPodList;
    }

    /**
     * Set 新实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewPodList 新实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewPodList(DeployServicePodDetail NewPodList) {
        this.NewPodList = NewPodList;
    }

    /**
     * Get 当前批次状态："WaitForTimeExceed", "WaitForResume", "Deploying", "Finish", "NotStart"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchStatus 当前批次状态："WaitForTimeExceed", "WaitForResume", "Deploying", "Finish", "NotStart"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchStatus() {
        return this.BatchStatus;
    }

    /**
     * Set 当前批次状态："WaitForTimeExceed", "WaitForResume", "Deploying", "Finish", "NotStart"
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchStatus 当前批次状态："WaitForTimeExceed", "WaitForResume", "Deploying", "Finish", "NotStart"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchStatus(String BatchStatus) {
        this.BatchStatus = BatchStatus;
    }

    /**
     * Get 该批次预计旧实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodNum 该批次预计旧实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPodNum() {
        return this.PodNum;
    }

    /**
     * Set 该批次预计旧实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodNum 该批次预计旧实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodNum(Long PodNum) {
        this.PodNum = PodNum;
    }

    /**
     * Get 批次id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchIndex 批次id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchIndex() {
        return this.BatchIndex;
    }

    /**
     * Set 批次id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchIndex 批次id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchIndex(Long BatchIndex) {
        this.BatchIndex = BatchIndex;
    }

    public DeployServiceBatchDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployServiceBatchDetail(DeployServiceBatchDetail source) {
        if (source.OldPodList != null) {
            this.OldPodList = new DeployServicePodDetail(source.OldPodList);
        }
        if (source.NewPodList != null) {
            this.NewPodList = new DeployServicePodDetail(source.NewPodList);
        }
        if (source.BatchStatus != null) {
            this.BatchStatus = new String(source.BatchStatus);
        }
        if (source.PodNum != null) {
            this.PodNum = new Long(source.PodNum);
        }
        if (source.BatchIndex != null) {
            this.BatchIndex = new Long(source.BatchIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OldPodList.", this.OldPodList);
        this.setParamObj(map, prefix + "NewPodList.", this.NewPodList);
        this.setParamSimple(map, prefix + "BatchStatus", this.BatchStatus);
        this.setParamSimple(map, prefix + "PodNum", this.PodNum);
        this.setParamSimple(map, prefix + "BatchIndex", this.BatchIndex);

    }
}

