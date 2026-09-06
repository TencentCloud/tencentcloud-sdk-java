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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBCustomDisasterRecoverGroupQuotaResponse extends AbstractModel {

    /**
    * <p>可创建置放群组数量的上限</p>
    */
    @SerializedName("GroupQuota")
    @Expose
    private Long GroupQuota;

    /**
    * <p>已经创建的置放群组数量</p>
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * <p>物理机类型置放群组内节点的配额数</p>
    */
    @SerializedName("NodeInHostGroupQuota")
    @Expose
    private Long NodeInHostGroupQuota;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>可创建置放群组数量的上限</p> 
     * @return GroupQuota <p>可创建置放群组数量的上限</p>
     */
    public Long getGroupQuota() {
        return this.GroupQuota;
    }

    /**
     * Set <p>可创建置放群组数量的上限</p>
     * @param GroupQuota <p>可创建置放群组数量的上限</p>
     */
    public void setGroupQuota(Long GroupQuota) {
        this.GroupQuota = GroupQuota;
    }

    /**
     * Get <p>已经创建的置放群组数量</p> 
     * @return CurrentNum <p>已经创建的置放群组数量</p>
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set <p>已经创建的置放群组数量</p>
     * @param CurrentNum <p>已经创建的置放群组数量</p>
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get <p>物理机类型置放群组内节点的配额数</p> 
     * @return NodeInHostGroupQuota <p>物理机类型置放群组内节点的配额数</p>
     */
    public Long getNodeInHostGroupQuota() {
        return this.NodeInHostGroupQuota;
    }

    /**
     * Set <p>物理机类型置放群组内节点的配额数</p>
     * @param NodeInHostGroupQuota <p>物理机类型置放群组内节点的配额数</p>
     */
    public void setNodeInHostGroupQuota(Long NodeInHostGroupQuota) {
        this.NodeInHostGroupQuota = NodeInHostGroupQuota;
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

    public DescribeDBCustomDisasterRecoverGroupQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBCustomDisasterRecoverGroupQuotaResponse(DescribeDBCustomDisasterRecoverGroupQuotaResponse source) {
        if (source.GroupQuota != null) {
            this.GroupQuota = new Long(source.GroupQuota);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.NodeInHostGroupQuota != null) {
            this.NodeInHostGroupQuota = new Long(source.NodeInHostGroupQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupQuota", this.GroupQuota);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "NodeInHostGroupQuota", this.NodeInHostGroupQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

