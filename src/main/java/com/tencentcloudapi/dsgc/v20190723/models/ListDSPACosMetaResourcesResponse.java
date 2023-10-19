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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDSPACosMetaResourcesResponse extends AbstractModel {

    /**
    * 符合条件的COS元数据数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * COS元数据信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private DSPACosMetaDataInfo [] Items;

    /**
    * DSPA实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的COS元数据数量。 
     * @return TotalCount 符合条件的COS元数据数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的COS元数据数量。
     * @param TotalCount 符合条件的COS元数据数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get COS元数据信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items COS元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DSPACosMetaDataInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set COS元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items COS元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(DSPACosMetaDataInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get DSPA实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DspaId DSPA实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DspaId DSPA实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListDSPACosMetaResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDSPACosMetaResourcesResponse(ListDSPACosMetaResourcesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new DSPACosMetaDataInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DSPACosMetaDataInfo(source.Items[i]);
            }
        }
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

