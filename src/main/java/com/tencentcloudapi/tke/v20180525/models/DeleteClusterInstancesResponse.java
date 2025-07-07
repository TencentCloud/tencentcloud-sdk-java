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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterInstancesResponse extends AbstractModel {

    /**
    * 删除成功的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccInstanceIds")
    @Expose
    private String [] SuccInstanceIds;

    /**
    * 删除失败的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * 未匹配到的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotFoundInstanceIds")
    @Expose
    private String [] NotFoundInstanceIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除成功的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccInstanceIds 删除成功的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuccInstanceIds() {
        return this.SuccInstanceIds;
    }

    /**
     * Set 删除成功的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccInstanceIds 删除成功的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccInstanceIds(String [] SuccInstanceIds) {
        this.SuccInstanceIds = SuccInstanceIds;
    }

    /**
     * Get 删除失败的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedInstanceIds 删除失败的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set 删除失败的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedInstanceIds 删除失败的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
    }

    /**
     * Get 未匹配到的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotFoundInstanceIds 未匹配到的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotFoundInstanceIds() {
        return this.NotFoundInstanceIds;
    }

    /**
     * Set 未匹配到的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotFoundInstanceIds 未匹配到的实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotFoundInstanceIds(String [] NotFoundInstanceIds) {
        this.NotFoundInstanceIds = NotFoundInstanceIds;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DeleteClusterInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteClusterInstancesResponse(DeleteClusterInstancesResponse source) {
        if (source.SuccInstanceIds != null) {
            this.SuccInstanceIds = new String[source.SuccInstanceIds.length];
            for (int i = 0; i < source.SuccInstanceIds.length; i++) {
                this.SuccInstanceIds[i] = new String(source.SuccInstanceIds[i]);
            }
        }
        if (source.FailedInstanceIds != null) {
            this.FailedInstanceIds = new String[source.FailedInstanceIds.length];
            for (int i = 0; i < source.FailedInstanceIds.length; i++) {
                this.FailedInstanceIds[i] = new String(source.FailedInstanceIds[i]);
            }
        }
        if (source.NotFoundInstanceIds != null) {
            this.NotFoundInstanceIds = new String[source.NotFoundInstanceIds.length];
            for (int i = 0; i < source.NotFoundInstanceIds.length; i++) {
                this.NotFoundInstanceIds[i] = new String(source.NotFoundInstanceIds[i]);
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
        this.setParamArraySimple(map, prefix + "SuccInstanceIds.", this.SuccInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamArraySimple(map, prefix + "NotFoundInstanceIds.", this.NotFoundInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

