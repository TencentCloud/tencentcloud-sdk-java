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

public class DescribeCheckConfigAssetListResponse extends AbstractModel {

    /**
    * 资产列表总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资产列表项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckAssetsList")
    @Expose
    private CheckAssetItem [] CheckAssetsList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产列表总数 
     * @return Total 资产列表总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 资产列表总数
     * @param Total 资产列表总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 资产列表项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckAssetsList 资产列表项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CheckAssetItem [] getCheckAssetsList() {
        return this.CheckAssetsList;
    }

    /**
     * Set 资产列表项
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckAssetsList 资产列表项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckAssetsList(CheckAssetItem [] CheckAssetsList) {
        this.CheckAssetsList = CheckAssetsList;
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

    public DescribeCheckConfigAssetListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckConfigAssetListResponse(DescribeCheckConfigAssetListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CheckAssetsList != null) {
            this.CheckAssetsList = new CheckAssetItem[source.CheckAssetsList.length];
            for (int i = 0; i < source.CheckAssetsList.length; i++) {
                this.CheckAssetsList[i] = new CheckAssetItem(source.CheckAssetsList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "CheckAssetsList.", this.CheckAssetsList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

