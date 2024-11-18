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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogJoinObjectListResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 接入对象列表
    */
    @SerializedName("List")
    @Expose
    private SecLogJoinObjectInfo [] List;

    /**
    * 日志节点范围类型,0自选 1全部
    */
    @SerializedName("RangeType")
    @Expose
    private Long RangeType;

    /**
    * 新增资产是否自动加入，节点范围为全部时生效
    */
    @SerializedName("AutoJoin")
    @Expose
    private Boolean AutoJoin;

    /**
    * 剔除节点数
    */
    @SerializedName("ExcludedCount")
    @Expose
    private Long ExcludedCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 接入对象列表 
     * @return List 接入对象列表
     */
    public SecLogJoinObjectInfo [] getList() {
        return this.List;
    }

    /**
     * Set 接入对象列表
     * @param List 接入对象列表
     */
    public void setList(SecLogJoinObjectInfo [] List) {
        this.List = List;
    }

    /**
     * Get 日志节点范围类型,0自选 1全部 
     * @return RangeType 日志节点范围类型,0自选 1全部
     */
    public Long getRangeType() {
        return this.RangeType;
    }

    /**
     * Set 日志节点范围类型,0自选 1全部
     * @param RangeType 日志节点范围类型,0自选 1全部
     */
    public void setRangeType(Long RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get 新增资产是否自动加入，节点范围为全部时生效 
     * @return AutoJoin 新增资产是否自动加入，节点范围为全部时生效
     */
    public Boolean getAutoJoin() {
        return this.AutoJoin;
    }

    /**
     * Set 新增资产是否自动加入，节点范围为全部时生效
     * @param AutoJoin 新增资产是否自动加入，节点范围为全部时生效
     */
    public void setAutoJoin(Boolean AutoJoin) {
        this.AutoJoin = AutoJoin;
    }

    /**
     * Get 剔除节点数 
     * @return ExcludedCount 剔除节点数
     */
    public Long getExcludedCount() {
        return this.ExcludedCount;
    }

    /**
     * Set 剔除节点数
     * @param ExcludedCount 剔除节点数
     */
    public void setExcludedCount(Long ExcludedCount) {
        this.ExcludedCount = ExcludedCount;
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

    public DescribeSecLogJoinObjectListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogJoinObjectListResponse(DescribeSecLogJoinObjectListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new SecLogJoinObjectInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new SecLogJoinObjectInfo(source.List[i]);
            }
        }
        if (source.RangeType != null) {
            this.RangeType = new Long(source.RangeType);
        }
        if (source.AutoJoin != null) {
            this.AutoJoin = new Boolean(source.AutoJoin);
        }
        if (source.ExcludedCount != null) {
            this.ExcludedCount = new Long(source.ExcludedCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "AutoJoin", this.AutoJoin);
        this.setParamSimple(map, prefix + "ExcludedCount", this.ExcludedCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

