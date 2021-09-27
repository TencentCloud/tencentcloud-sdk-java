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

public class DescribeAssetProcessInfoListResponse extends AbstractModel{

    /**
    * 记录总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Process")
    @Expose
    private AssetProcessBaseInfo [] Process;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 记录总数 
     * @return Total 记录总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 记录总数
     * @param Total 记录总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Process 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetProcessBaseInfo [] getProcess() {
        return this.Process;
    }

    /**
     * Set 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Process 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcess(AssetProcessBaseInfo [] Process) {
        this.Process = Process;
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

    public DescribeAssetProcessInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetProcessInfoListResponse(DescribeAssetProcessInfoListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Process != null) {
            this.Process = new AssetProcessBaseInfo[source.Process.length];
            for (int i = 0; i < source.Process.length; i++) {
                this.Process[i] = new AssetProcessBaseInfo(source.Process[i]);
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
        this.setParamArrayObj(map, prefix + "Process.", this.Process);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

