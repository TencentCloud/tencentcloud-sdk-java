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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDrillPairsResponse extends AbstractModel {

    /**
    * 删除演练对的逐条结果列表。
    */
    @SerializedName("DeleteDrillPairResultSet")
    @Expose
    private DeleteDrillPairResult [] DeleteDrillPairResultSet;

    /**
    * 成功标记为删除的演练组ID列表。
    */
    @SerializedName("DeleteDrillPairGroupSet")
    @Expose
    private String [] DeleteDrillPairGroupSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除演练对的逐条结果列表。 
     * @return DeleteDrillPairResultSet 删除演练对的逐条结果列表。
     */
    public DeleteDrillPairResult [] getDeleteDrillPairResultSet() {
        return this.DeleteDrillPairResultSet;
    }

    /**
     * Set 删除演练对的逐条结果列表。
     * @param DeleteDrillPairResultSet 删除演练对的逐条结果列表。
     */
    public void setDeleteDrillPairResultSet(DeleteDrillPairResult [] DeleteDrillPairResultSet) {
        this.DeleteDrillPairResultSet = DeleteDrillPairResultSet;
    }

    /**
     * Get 成功标记为删除的演练组ID列表。 
     * @return DeleteDrillPairGroupSet 成功标记为删除的演练组ID列表。
     */
    public String [] getDeleteDrillPairGroupSet() {
        return this.DeleteDrillPairGroupSet;
    }

    /**
     * Set 成功标记为删除的演练组ID列表。
     * @param DeleteDrillPairGroupSet 成功标记为删除的演练组ID列表。
     */
    public void setDeleteDrillPairGroupSet(String [] DeleteDrillPairGroupSet) {
        this.DeleteDrillPairGroupSet = DeleteDrillPairGroupSet;
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

    public DeleteDrillPairsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDrillPairsResponse(DeleteDrillPairsResponse source) {
        if (source.DeleteDrillPairResultSet != null) {
            this.DeleteDrillPairResultSet = new DeleteDrillPairResult[source.DeleteDrillPairResultSet.length];
            for (int i = 0; i < source.DeleteDrillPairResultSet.length; i++) {
                this.DeleteDrillPairResultSet[i] = new DeleteDrillPairResult(source.DeleteDrillPairResultSet[i]);
            }
        }
        if (source.DeleteDrillPairGroupSet != null) {
            this.DeleteDrillPairGroupSet = new String[source.DeleteDrillPairGroupSet.length];
            for (int i = 0; i < source.DeleteDrillPairGroupSet.length; i++) {
                this.DeleteDrillPairGroupSet[i] = new String(source.DeleteDrillPairGroupSet[i]);
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
        this.setParamArrayObj(map, prefix + "DeleteDrillPairResultSet.", this.DeleteDrillPairResultSet);
        this.setParamArraySimple(map, prefix + "DeleteDrillPairGroupSet.", this.DeleteDrillPairGroupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

