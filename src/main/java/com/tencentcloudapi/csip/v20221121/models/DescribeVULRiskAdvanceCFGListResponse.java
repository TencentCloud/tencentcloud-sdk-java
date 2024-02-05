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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVULRiskAdvanceCFGListResponse extends AbstractModel {

    /**
    * 配置项列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private VULRiskAdvanceCFGList [] Data;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 风险等级过滤列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevelLists")
    @Expose
    private FilterDataObject [] RiskLevelLists;

    /**
    * 漏洞类型过滤列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VULTypeLists")
    @Expose
    private FilterDataObject [] VULTypeLists;

    /**
    * 识别来源过滤列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckFromLists")
    @Expose
    private FilterDataObject [] CheckFromLists;

    /**
    * 漏洞标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulTagList")
    @Expose
    private FilterDataObject [] VulTagList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 配置项列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 配置项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VULRiskAdvanceCFGList [] getData() {
        return this.Data;
    }

    /**
     * Set 配置项列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 配置项列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(VULRiskAdvanceCFGList [] Data) {
        this.Data = Data;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 风险等级过滤列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevelLists 风险等级过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getRiskLevelLists() {
        return this.RiskLevelLists;
    }

    /**
     * Set 风险等级过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevelLists 风险等级过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevelLists(FilterDataObject [] RiskLevelLists) {
        this.RiskLevelLists = RiskLevelLists;
    }

    /**
     * Get 漏洞类型过滤列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VULTypeLists 漏洞类型过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getVULTypeLists() {
        return this.VULTypeLists;
    }

    /**
     * Set 漏洞类型过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VULTypeLists 漏洞类型过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVULTypeLists(FilterDataObject [] VULTypeLists) {
        this.VULTypeLists = VULTypeLists;
    }

    /**
     * Get 识别来源过滤列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckFromLists 识别来源过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getCheckFromLists() {
        return this.CheckFromLists;
    }

    /**
     * Set 识别来源过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckFromLists 识别来源过滤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckFromLists(FilterDataObject [] CheckFromLists) {
        this.CheckFromLists = CheckFromLists;
    }

    /**
     * Get 漏洞标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulTagList 漏洞标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FilterDataObject [] getVulTagList() {
        return this.VulTagList;
    }

    /**
     * Set 漏洞标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulTagList 漏洞标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulTagList(FilterDataObject [] VulTagList) {
        this.VulTagList = VulTagList;
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

    public DescribeVULRiskAdvanceCFGListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVULRiskAdvanceCFGListResponse(DescribeVULRiskAdvanceCFGListResponse source) {
        if (source.Data != null) {
            this.Data = new VULRiskAdvanceCFGList[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new VULRiskAdvanceCFGList(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskLevelLists != null) {
            this.RiskLevelLists = new FilterDataObject[source.RiskLevelLists.length];
            for (int i = 0; i < source.RiskLevelLists.length; i++) {
                this.RiskLevelLists[i] = new FilterDataObject(source.RiskLevelLists[i]);
            }
        }
        if (source.VULTypeLists != null) {
            this.VULTypeLists = new FilterDataObject[source.VULTypeLists.length];
            for (int i = 0; i < source.VULTypeLists.length; i++) {
                this.VULTypeLists[i] = new FilterDataObject(source.VULTypeLists[i]);
            }
        }
        if (source.CheckFromLists != null) {
            this.CheckFromLists = new FilterDataObject[source.CheckFromLists.length];
            for (int i = 0; i < source.CheckFromLists.length; i++) {
                this.CheckFromLists[i] = new FilterDataObject(source.CheckFromLists[i]);
            }
        }
        if (source.VulTagList != null) {
            this.VulTagList = new FilterDataObject[source.VulTagList.length];
            for (int i = 0; i < source.VulTagList.length; i++) {
                this.VulTagList[i] = new FilterDataObject(source.VulTagList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RiskLevelLists.", this.RiskLevelLists);
        this.setParamArrayObj(map, prefix + "VULTypeLists.", this.VULTypeLists);
        this.setParamArrayObj(map, prefix + "CheckFromLists.", this.CheckFromLists);
        this.setParamArrayObj(map, prefix + "VulTagList.", this.VulTagList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

