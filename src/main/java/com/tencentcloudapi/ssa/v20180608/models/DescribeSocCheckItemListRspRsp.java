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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSocCheckItemListRspRsp extends AbstractModel {

    /**
    * 检查项详情列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private SocCheckItemV1 [] List;

    /**
    * 检查项总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 检查项详情列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 检查项详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SocCheckItemV1 [] getList() {
        return this.List;
    }

    /**
     * Set 检查项详情列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 检查项详情列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(SocCheckItemV1 [] List) {
        this.List = List;
    }

    /**
     * Get 检查项总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public DescribeSocCheckItemListRspRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSocCheckItemListRspRsp(DescribeSocCheckItemListRspRsp source) {
        if (source.List != null) {
            this.List = new SocCheckItemV1[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new SocCheckItemV1(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

