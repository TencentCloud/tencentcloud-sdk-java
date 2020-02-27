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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesResponse extends AbstractModel{

    /**
    * 符合条件的实例总数。
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * EMR实例详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterList")
    @Expose
    private ClusterInstancesInfo [] ClusterList;

    /**
    * 实例关联的标签键列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的实例总数。 
     * @return TotalCnt 符合条件的实例总数。
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 符合条件的实例总数。
     * @param TotalCnt 符合条件的实例总数。
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get EMR实例详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterList EMR实例详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterInstancesInfo [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set EMR实例详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterList EMR实例详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterList(ClusterInstancesInfo [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get 实例关联的标签键列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagKeys 实例关联的标签键列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 实例关联的标签键列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagKeys 实例关联的标签键列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

