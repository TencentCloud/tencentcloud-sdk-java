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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatasetsResponse extends AbstractModel{

    /**
    * 数据集总量（名称维度）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据集按照数据集名称聚合的分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetGroups")
    @Expose
    private DatasetGroup [] DatasetGroups;

    /**
    * 数据集ID总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetIdNums")
    @Expose
    private Long DatasetIdNums;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据集总量（名称维度）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 数据集总量（名称维度）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数据集总量（名称维度）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 数据集总量（名称维度）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 数据集按照数据集名称聚合的分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetGroups 数据集按照数据集名称聚合的分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatasetGroup [] getDatasetGroups() {
        return this.DatasetGroups;
    }

    /**
     * Set 数据集按照数据集名称聚合的分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetGroups 数据集按照数据集名称聚合的分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetGroups(DatasetGroup [] DatasetGroups) {
        this.DatasetGroups = DatasetGroups;
    }

    /**
     * Get 数据集ID总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetIdNums 数据集ID总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasetIdNums() {
        return this.DatasetIdNums;
    }

    /**
     * Set 数据集ID总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetIdNums 数据集ID总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetIdNums(Long DatasetIdNums) {
        this.DatasetIdNums = DatasetIdNums;
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

    public DescribeDatasetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasetsResponse(DescribeDatasetsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DatasetGroups != null) {
            this.DatasetGroups = new DatasetGroup[source.DatasetGroups.length];
            for (int i = 0; i < source.DatasetGroups.length; i++) {
                this.DatasetGroups[i] = new DatasetGroup(source.DatasetGroups[i]);
            }
        }
        if (source.DatasetIdNums != null) {
            this.DatasetIdNums = new Long(source.DatasetIdNums);
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
        this.setParamArrayObj(map, prefix + "DatasetGroups.", this.DatasetGroups);
        this.setParamSimple(map, prefix + "DatasetIdNums", this.DatasetIdNums);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

