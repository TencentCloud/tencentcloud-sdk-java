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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceListResponse extends AbstractModel{

    /**
    * 检查项列表
    */
    @SerializedName("Data")
    @Expose
    private DataCompliance [] Data;

    /**
    * 总检查资产数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetTotalNum")
    @Expose
    private Long AssetTotalNum;

    /**
    * 总检查项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTotalNum")
    @Expose
    private Long ConfigTotalNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检查项列表 
     * @return Data 检查项列表
     */
    public DataCompliance [] getData() {
        return this.Data;
    }

    /**
     * Set 检查项列表
     * @param Data 检查项列表
     */
    public void setData(DataCompliance [] Data) {
        this.Data = Data;
    }

    /**
     * Get 总检查资产数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetTotalNum 总检查资产数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetTotalNum() {
        return this.AssetTotalNum;
    }

    /**
     * Set 总检查资产数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetTotalNum 总检查资产数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetTotalNum(Long AssetTotalNum) {
        this.AssetTotalNum = AssetTotalNum;
    }

    /**
     * Get 总检查项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTotalNum 总检查项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigTotalNum() {
        return this.ConfigTotalNum;
    }

    /**
     * Set 总检查项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTotalNum 总检查项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTotalNum(Long ConfigTotalNum) {
        this.ConfigTotalNum = ConfigTotalNum;
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

    public DescribeComplianceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceListResponse(DescribeComplianceListResponse source) {
        if (source.Data != null) {
            this.Data = new DataCompliance[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DataCompliance(source.Data[i]);
            }
        }
        if (source.AssetTotalNum != null) {
            this.AssetTotalNum = new Long(source.AssetTotalNum);
        }
        if (source.ConfigTotalNum != null) {
            this.ConfigTotalNum = new Long(source.ConfigTotalNum);
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
        this.setParamSimple(map, prefix + "AssetTotalNum", this.AssetTotalNum);
        this.setParamSimple(map, prefix + "ConfigTotalNum", this.ConfigTotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

