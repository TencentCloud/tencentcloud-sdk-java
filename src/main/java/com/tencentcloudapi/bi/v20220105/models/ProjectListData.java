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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectListData extends AbstractModel{

    /**
    * 数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private Project [] List;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
     * Get 数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Project [] getList() {
        return this.List;
    }

    /**
     * Set 数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(Project [] List) {
        this.List = List;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPages 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPages 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    public ProjectListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectListData(ProjectListData source) {
        if (source.List != null) {
            this.List = new Project[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new Project(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);

    }
}

