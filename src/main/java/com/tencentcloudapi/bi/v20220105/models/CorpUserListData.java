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

public class CorpUserListData extends AbstractModel {

    /**
    * 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private UserIdAndUserName [] List;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 页数
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
     * Get 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserIdAndUserName [] getList() {
        return this.List;
    }

    /**
     * Set 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(UserIdAndUserName [] List) {
        this.List = List;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 页数 
     * @return TotalPages 页数
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 页数
     * @param TotalPages 页数
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    public CorpUserListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorpUserListData(CorpUserListData source) {
        if (source.List != null) {
            this.List = new UserIdAndUserName[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new UserIdAndUserName(source.List[i]);
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

