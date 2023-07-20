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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperationOpsDto extends AbstractModel{

    /**
    * 批量操作成功数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 批量操作失败数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 批量操作的总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 批量操作成功数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCount 批量操作成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 批量操作成功数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCount 批量操作成功数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 批量操作失败数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedCount 批量操作失败数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 批量操作失败数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedCount 批量操作失败数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 批量操作的总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 批量操作的总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 批量操作的总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 批量操作的总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public BatchOperationOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperationOpsDto(BatchOperationOpsDto source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

