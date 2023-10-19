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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserRoleListData extends AbstractModel {

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 总页数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private UserRoleListDataUserRoleInfo [] List;

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
     * Get 总页数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPages 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 总页数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPages 总页数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserRoleListDataUserRoleInfo [] getList() {
        return this.List;
    }

    /**
     * Set 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(UserRoleListDataUserRoleInfo [] List) {
        this.List = List;
    }

    public UserRoleListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserRoleListData(UserRoleListData source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.List != null) {
            this.List = new UserRoleListDataUserRoleInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new UserRoleListDataUserRoleInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

