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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHpcClusterResponse extends AbstractModel{

    /**
    * 高性能计算集群信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HpcClusterSet")
    @Expose
    private HpcClusterInfo [] HpcClusterSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 高性能计算集群信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HpcClusterSet 高性能计算集群信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HpcClusterInfo [] getHpcClusterSet() {
        return this.HpcClusterSet;
    }

    /**
     * Set 高性能计算集群信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HpcClusterSet 高性能计算集群信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHpcClusterSet(HpcClusterInfo [] HpcClusterSet) {
        this.HpcClusterSet = HpcClusterSet;
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

    public CreateHpcClusterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHpcClusterResponse(CreateHpcClusterResponse source) {
        if (source.HpcClusterSet != null) {
            this.HpcClusterSet = new HpcClusterInfo[source.HpcClusterSet.length];
            for (int i = 0; i < source.HpcClusterSet.length; i++) {
                this.HpcClusterSet[i] = new HpcClusterInfo(source.HpcClusterSet[i]);
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
        this.setParamArrayObj(map, prefix + "HpcClusterSet.", this.HpcClusterSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

