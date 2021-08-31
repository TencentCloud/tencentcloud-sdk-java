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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEmergencyVulListResponse extends AbstractModel{

    /**
    * 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private EmergencyVul [] List;

    /**
    * 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 是否存在风险
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExistsRisk")
    @Expose
    private Boolean ExistsRisk;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmergencyVul [] getList() {
        return this.List;
    }

    /**
     * Set 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 漏洞列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(EmergencyVul [] List) {
        this.List = List;
    }

    /**
     * Get 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 漏洞总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 是否存在风险
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExistsRisk 是否存在风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExistsRisk() {
        return this.ExistsRisk;
    }

    /**
     * Set 是否存在风险
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExistsRisk 是否存在风险
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExistsRisk(Boolean ExistsRisk) {
        this.ExistsRisk = ExistsRisk;
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

    public DescribeEmergencyVulListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmergencyVulListResponse(DescribeEmergencyVulListResponse source) {
        if (source.List != null) {
            this.List = new EmergencyVul[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new EmergencyVul(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ExistsRisk != null) {
            this.ExistsRisk = new Boolean(source.ExistsRisk);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ExistsRisk", this.ExistsRisk);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

