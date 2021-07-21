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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotResult extends AbstractModel{

    /**
    * 任务执行错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 任务执行错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 快照生成图片总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 快照图片链接列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Snapshots")
    @Expose
    private String [] Snapshots;

    /**
     * Get 任务执行错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 任务执行错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务执行错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 任务执行错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 任务执行错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 任务执行错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务执行错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 任务执行错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 快照生成图片总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 快照生成图片总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 快照生成图片总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 快照生成图片总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 快照图片链接列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Snapshots 快照图片链接列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSnapshots() {
        return this.Snapshots;
    }

    /**
     * Set 快照图片链接列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Snapshots 快照图片链接列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshots(String [] Snapshots) {
        this.Snapshots = Snapshots;
    }

    public SnapshotResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotResult(SnapshotResult source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Snapshots != null) {
            this.Snapshots = new String[source.Snapshots.length];
            for (int i = 0; i < source.Snapshots.length; i++) {
                this.Snapshots[i] = new String(source.Snapshots[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArraySimple(map, prefix + "Snapshots.", this.Snapshots);

    }
}

