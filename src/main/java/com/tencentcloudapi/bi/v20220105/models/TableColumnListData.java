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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableColumnListData extends AbstractModel {

    /**
    * 表中的列的列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private TableColumn [] List;

    /**
    * 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 异步事务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranStatus")
    @Expose
    private Long TranStatus;

    /**
     * Get 表中的列的列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 表中的列的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableColumn [] getList() {
        return this.List;
    }

    /**
     * Set 表中的列的列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 表中的列的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(TableColumn [] List) {
        this.List = List;
    }

    /**
     * Get 异步事务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranId 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranId 异步事务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 异步事务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranStatus 异步事务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set 异步事务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranStatus 异步事务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranStatus(Long TranStatus) {
        this.TranStatus = TranStatus;
    }

    public TableColumnListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableColumnListData(TableColumnListData source) {
        if (source.List != null) {
            this.List = new TableColumn[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new TableColumn(source.List[i]);
            }
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new Long(source.TranStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);

    }
}

