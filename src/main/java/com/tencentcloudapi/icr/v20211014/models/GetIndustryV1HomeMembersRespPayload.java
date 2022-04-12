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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIndustryV1HomeMembersRespPayload extends AbstractModel{

    /**
    * 用户级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountLevel")
    @Expose
    private String AccountLevel;

    /**
    * 用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataList")
    @Expose
    private GetIndustryV1HomeMembersRespData [] DataList;

    /**
    * 每页数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，从0开始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 用户总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 用户级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountLevel 用户级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountLevel() {
        return this.AccountLevel;
    }

    /**
     * Set 用户级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountLevel 用户级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountLevel(String AccountLevel) {
        this.AccountLevel = AccountLevel;
    }

    /**
     * Get 用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataList 用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GetIndustryV1HomeMembersRespData [] getDataList() {
        return this.DataList;
    }

    /**
     * Set 用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataList 用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataList(GetIndustryV1HomeMembersRespData [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get 每页数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit 每页数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit 每页数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，从0开始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 分页偏移量，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 分页偏移量，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 用户总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 用户总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 用户总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 用户总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public GetIndustryV1HomeMembersRespPayload() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersRespPayload(GetIndustryV1HomeMembersRespPayload source) {
        if (source.AccountLevel != null) {
            this.AccountLevel = new String(source.AccountLevel);
        }
        if (source.DataList != null) {
            this.DataList = new GetIndustryV1HomeMembersRespData[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new GetIndustryV1HomeMembersRespData(source.DataList[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountLevel", this.AccountLevel);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

