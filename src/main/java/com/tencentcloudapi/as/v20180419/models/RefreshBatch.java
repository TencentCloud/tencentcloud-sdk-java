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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshBatch extends AbstractModel {

    /**
    * 刷新批次序号。例如，2 表示当前批次实例会在第二批次进行实例刷新。
    */
    @SerializedName("RefreshBatchNum")
    @Expose
    private Long RefreshBatchNum;

    /**
    * 刷新批次状态。取值如下：<br><li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED:  刷新失败</li><li>PARTIALLY_SUCCESSFUL：批次部分成功</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功
    */
    @SerializedName("RefreshBatchStatus")
    @Expose
    private String RefreshBatchStatus;

    /**
    * 刷新批次关联实例列表。
    */
    @SerializedName("RefreshBatchRelatedInstanceSet")
    @Expose
    private RefreshBatchRelatedInstance [] RefreshBatchRelatedInstanceSet;

    /**
    * 刷新批次开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 刷新批次结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 刷新批次序号。例如，2 表示当前批次实例会在第二批次进行实例刷新。 
     * @return RefreshBatchNum 刷新批次序号。例如，2 表示当前批次实例会在第二批次进行实例刷新。
     */
    public Long getRefreshBatchNum() {
        return this.RefreshBatchNum;
    }

    /**
     * Set 刷新批次序号。例如，2 表示当前批次实例会在第二批次进行实例刷新。
     * @param RefreshBatchNum 刷新批次序号。例如，2 表示当前批次实例会在第二批次进行实例刷新。
     */
    public void setRefreshBatchNum(Long RefreshBatchNum) {
        this.RefreshBatchNum = RefreshBatchNum;
    }

    /**
     * Get 刷新批次状态。取值如下：<br><li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED:  刷新失败</li><li>PARTIALLY_SUCCESSFUL：批次部分成功</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功 
     * @return RefreshBatchStatus 刷新批次状态。取值如下：<br><li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED:  刷新失败</li><li>PARTIALLY_SUCCESSFUL：批次部分成功</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功
     */
    public String getRefreshBatchStatus() {
        return this.RefreshBatchStatus;
    }

    /**
     * Set 刷新批次状态。取值如下：<br><li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED:  刷新失败</li><li>PARTIALLY_SUCCESSFUL：批次部分成功</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功
     * @param RefreshBatchStatus 刷新批次状态。取值如下：<br><li>WAITING：待刷新</li><li>INIT：初始化中</li><li>RUNNING：刷新中</li><li>FAILED:  刷新失败</li><li>PARTIALLY_SUCCESSFUL：批次部分成功</li><li>CANCELLED：已取消</li><li>SUCCESSFUL：刷新成功
     */
    public void setRefreshBatchStatus(String RefreshBatchStatus) {
        this.RefreshBatchStatus = RefreshBatchStatus;
    }

    /**
     * Get 刷新批次关联实例列表。 
     * @return RefreshBatchRelatedInstanceSet 刷新批次关联实例列表。
     */
    public RefreshBatchRelatedInstance [] getRefreshBatchRelatedInstanceSet() {
        return this.RefreshBatchRelatedInstanceSet;
    }

    /**
     * Set 刷新批次关联实例列表。
     * @param RefreshBatchRelatedInstanceSet 刷新批次关联实例列表。
     */
    public void setRefreshBatchRelatedInstanceSet(RefreshBatchRelatedInstance [] RefreshBatchRelatedInstanceSet) {
        this.RefreshBatchRelatedInstanceSet = RefreshBatchRelatedInstanceSet;
    }

    /**
     * Get 刷新批次开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 刷新批次开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 刷新批次开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 刷新批次开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 刷新批次结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 刷新批次结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 刷新批次结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 刷新批次结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public RefreshBatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshBatch(RefreshBatch source) {
        if (source.RefreshBatchNum != null) {
            this.RefreshBatchNum = new Long(source.RefreshBatchNum);
        }
        if (source.RefreshBatchStatus != null) {
            this.RefreshBatchStatus = new String(source.RefreshBatchStatus);
        }
        if (source.RefreshBatchRelatedInstanceSet != null) {
            this.RefreshBatchRelatedInstanceSet = new RefreshBatchRelatedInstance[source.RefreshBatchRelatedInstanceSet.length];
            for (int i = 0; i < source.RefreshBatchRelatedInstanceSet.length; i++) {
                this.RefreshBatchRelatedInstanceSet[i] = new RefreshBatchRelatedInstance(source.RefreshBatchRelatedInstanceSet[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RefreshBatchNum", this.RefreshBatchNum);
        this.setParamSimple(map, prefix + "RefreshBatchStatus", this.RefreshBatchStatus);
        this.setParamArrayObj(map, prefix + "RefreshBatchRelatedInstanceSet.", this.RefreshBatchRelatedInstanceSet);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

