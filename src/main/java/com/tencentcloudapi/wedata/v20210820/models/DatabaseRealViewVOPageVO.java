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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseRealViewVOPageVO extends AbstractModel {

    /**
    * 分页页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总分页页码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * 记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private DatabaseRealViewVO [] Rows;

    /**
    * 分页快照id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
     * Get 分页页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 分页页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 分页页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageSize 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageSize 分页大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 总个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 总个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总分页页码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPageNumber 总分页页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 总分页页码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPageNumber 总分页页码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get 记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows 记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatabaseRealViewVO [] getRows() {
        return this.Rows;
    }

    /**
     * Set 记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows 记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(DatabaseRealViewVO [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 分页快照id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotId 分页快照id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 分页快照id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotId 分页快照id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    public DatabaseRealViewVOPageVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseRealViewVOPageVO(DatabaseRealViewVOPageVO source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.Rows != null) {
            this.Rows = new DatabaseRealViewVO[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new DatabaseRealViewVO(source.Rows[i]);
            }
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);

    }
}

