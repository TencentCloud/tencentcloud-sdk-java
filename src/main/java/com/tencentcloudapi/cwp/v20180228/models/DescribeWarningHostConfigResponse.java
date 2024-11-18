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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWarningHostConfigResponse extends AbstractModel {

    /**
    * 告警主机范围类型，0:全部主机，1:按所属项目选，2:按腾讯云标签选，3:按主机安全标签选，4:自选主机
    */
    @SerializedName("HostRange")
    @Expose
    private Long HostRange;

    /**
    * 项目或标签的名称列表，自选主机时为空
    */
    @SerializedName("ItemLabels")
    @Expose
    private String [] ItemLabels;

    /**
    * 机器列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 机器列表总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 项目或标签的id列表，自选主机时为空
    */
    @SerializedName("ItemLabelIds")
    @Expose
    private String [] ItemLabelIds;

    /**
    * 需排除的机器列表
    */
    @SerializedName("ExcludedQuuids")
    @Expose
    private String [] ExcludedQuuids;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 告警主机范围类型，0:全部主机，1:按所属项目选，2:按腾讯云标签选，3:按主机安全标签选，4:自选主机 
     * @return HostRange 告警主机范围类型，0:全部主机，1:按所属项目选，2:按腾讯云标签选，3:按主机安全标签选，4:自选主机
     */
    public Long getHostRange() {
        return this.HostRange;
    }

    /**
     * Set 告警主机范围类型，0:全部主机，1:按所属项目选，2:按腾讯云标签选，3:按主机安全标签选，4:自选主机
     * @param HostRange 告警主机范围类型，0:全部主机，1:按所属项目选，2:按腾讯云标签选，3:按主机安全标签选，4:自选主机
     */
    public void setHostRange(Long HostRange) {
        this.HostRange = HostRange;
    }

    /**
     * Get 项目或标签的名称列表，自选主机时为空 
     * @return ItemLabels 项目或标签的名称列表，自选主机时为空
     */
    public String [] getItemLabels() {
        return this.ItemLabels;
    }

    /**
     * Set 项目或标签的名称列表，自选主机时为空
     * @param ItemLabels 项目或标签的名称列表，自选主机时为空
     */
    public void setItemLabels(String [] ItemLabels) {
        this.ItemLabels = ItemLabels;
    }

    /**
     * Get 机器列表 
     * @return Quuids 机器列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 机器列表
     * @param Quuids 机器列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 机器列表总数量 
     * @return TotalCount 机器列表总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 机器列表总数量
     * @param TotalCount 机器列表总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 项目或标签的id列表，自选主机时为空 
     * @return ItemLabelIds 项目或标签的id列表，自选主机时为空
     */
    public String [] getItemLabelIds() {
        return this.ItemLabelIds;
    }

    /**
     * Set 项目或标签的id列表，自选主机时为空
     * @param ItemLabelIds 项目或标签的id列表，自选主机时为空
     */
    public void setItemLabelIds(String [] ItemLabelIds) {
        this.ItemLabelIds = ItemLabelIds;
    }

    /**
     * Get 需排除的机器列表 
     * @return ExcludedQuuids 需排除的机器列表
     */
    public String [] getExcludedQuuids() {
        return this.ExcludedQuuids;
    }

    /**
     * Set 需排除的机器列表
     * @param ExcludedQuuids 需排除的机器列表
     */
    public void setExcludedQuuids(String [] ExcludedQuuids) {
        this.ExcludedQuuids = ExcludedQuuids;
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

    public DescribeWarningHostConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWarningHostConfigResponse(DescribeWarningHostConfigResponse source) {
        if (source.HostRange != null) {
            this.HostRange = new Long(source.HostRange);
        }
        if (source.ItemLabels != null) {
            this.ItemLabels = new String[source.ItemLabels.length];
            for (int i = 0; i < source.ItemLabels.length; i++) {
                this.ItemLabels[i] = new String(source.ItemLabels[i]);
            }
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ItemLabelIds != null) {
            this.ItemLabelIds = new String[source.ItemLabelIds.length];
            for (int i = 0; i < source.ItemLabelIds.length; i++) {
                this.ItemLabelIds[i] = new String(source.ItemLabelIds[i]);
            }
        }
        if (source.ExcludedQuuids != null) {
            this.ExcludedQuuids = new String[source.ExcludedQuuids.length];
            for (int i = 0; i < source.ExcludedQuuids.length; i++) {
                this.ExcludedQuuids[i] = new String(source.ExcludedQuuids[i]);
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
        this.setParamSimple(map, prefix + "HostRange", this.HostRange);
        this.setParamArraySimple(map, prefix + "ItemLabels.", this.ItemLabels);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "ItemLabelIds.", this.ItemLabelIds);
        this.setParamArraySimple(map, prefix + "ExcludedQuuids.", this.ExcludedQuuids);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

