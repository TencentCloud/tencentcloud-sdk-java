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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSyncProgressRegion extends AbstractModel {

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 执行完成数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetCount")
    @Expose
    private Long OffsetCount;

    /**
    * 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 执行完成数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetCount 执行完成数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffsetCount() {
        return this.OffsetCount;
    }

    /**
     * Set 执行完成数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetCount 执行完成数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetCount(Long OffsetCount) {
        this.OffsetCount = OffsetCount;
    }

    /**
     * Get 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateSyncProgressRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSyncProgressRegion(UpdateSyncProgressRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OffsetCount != null) {
            this.OffsetCount = new Long(source.OffsetCount);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "OffsetCount", this.OffsetCount);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

