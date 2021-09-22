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

public class DescribeBaselineListResponse extends AbstractModel{

    /**
    * 基线信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaselineList")
    @Expose
    private BaselineInfo [] BaselineList;

    /**
    * 分页查询记录总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基线信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaselineList 基线信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineInfo [] getBaselineList() {
        return this.BaselineList;
    }

    /**
     * Set 基线信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaselineList 基线信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaselineList(BaselineInfo [] BaselineList) {
        this.BaselineList = BaselineList;
    }

    /**
     * Get 分页查询记录总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 分页查询记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 分页查询记录总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 分页查询记录总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeBaselineListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineListResponse(DescribeBaselineListResponse source) {
        if (source.BaselineList != null) {
            this.BaselineList = new BaselineInfo[source.BaselineList.length];
            for (int i = 0; i < source.BaselineList.length; i++) {
                this.BaselineList[i] = new BaselineInfo(source.BaselineList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BaselineList.", this.BaselineList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

