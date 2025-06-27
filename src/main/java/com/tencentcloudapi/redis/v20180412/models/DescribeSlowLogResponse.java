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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogResponse extends AbstractModel {

    /**
    * 慢查询总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 已废弃，该参数存在命名不规范问题，后续用参数InstanceSlowLogDetail取代。慢查询详情。
    */
    @SerializedName("InstanceSlowlogDetail")
    @Expose
    private InstanceSlowlogDetail [] InstanceSlowlogDetail;

    /**
    * 慢查询详情，注意：TotalCount大于1W，即慢日志超过1万条，不支持返回日志详情，返回数据为空。 建议缩小BeginTime和EndTime的时间间隔，多次查询。
    */
    @SerializedName("InstanceSlowLogDetail")
    @Expose
    private InstanceSlowlogDetail [] InstanceSlowLogDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 慢查询总数。 
     * @return TotalCount 慢查询总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 慢查询总数。
     * @param TotalCount 慢查询总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 已废弃，该参数存在命名不规范问题，后续用参数InstanceSlowLogDetail取代。慢查询详情。 
     * @return InstanceSlowlogDetail 已废弃，该参数存在命名不规范问题，后续用参数InstanceSlowLogDetail取代。慢查询详情。
     * @deprecated
     */
    @Deprecated
    public InstanceSlowlogDetail [] getInstanceSlowlogDetail() {
        return this.InstanceSlowlogDetail;
    }

    /**
     * Set 已废弃，该参数存在命名不规范问题，后续用参数InstanceSlowLogDetail取代。慢查询详情。
     * @param InstanceSlowlogDetail 已废弃，该参数存在命名不规范问题，后续用参数InstanceSlowLogDetail取代。慢查询详情。
     * @deprecated
     */
    @Deprecated
    public void setInstanceSlowlogDetail(InstanceSlowlogDetail [] InstanceSlowlogDetail) {
        this.InstanceSlowlogDetail = InstanceSlowlogDetail;
    }

    /**
     * Get 慢查询详情，注意：TotalCount大于1W，即慢日志超过1万条，不支持返回日志详情，返回数据为空。 建议缩小BeginTime和EndTime的时间间隔，多次查询。 
     * @return InstanceSlowLogDetail 慢查询详情，注意：TotalCount大于1W，即慢日志超过1万条，不支持返回日志详情，返回数据为空。 建议缩小BeginTime和EndTime的时间间隔，多次查询。
     */
    public InstanceSlowlogDetail [] getInstanceSlowLogDetail() {
        return this.InstanceSlowLogDetail;
    }

    /**
     * Set 慢查询详情，注意：TotalCount大于1W，即慢日志超过1万条，不支持返回日志详情，返回数据为空。 建议缩小BeginTime和EndTime的时间间隔，多次查询。
     * @param InstanceSlowLogDetail 慢查询详情，注意：TotalCount大于1W，即慢日志超过1万条，不支持返回日志详情，返回数据为空。 建议缩小BeginTime和EndTime的时间间隔，多次查询。
     */
    public void setInstanceSlowLogDetail(InstanceSlowlogDetail [] InstanceSlowLogDetail) {
        this.InstanceSlowLogDetail = InstanceSlowLogDetail;
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

    public DescribeSlowLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogResponse(DescribeSlowLogResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceSlowlogDetail != null) {
            this.InstanceSlowlogDetail = new InstanceSlowlogDetail[source.InstanceSlowlogDetail.length];
            for (int i = 0; i < source.InstanceSlowlogDetail.length; i++) {
                this.InstanceSlowlogDetail[i] = new InstanceSlowlogDetail(source.InstanceSlowlogDetail[i]);
            }
        }
        if (source.InstanceSlowLogDetail != null) {
            this.InstanceSlowLogDetail = new InstanceSlowlogDetail[source.InstanceSlowLogDetail.length];
            for (int i = 0; i < source.InstanceSlowLogDetail.length; i++) {
                this.InstanceSlowLogDetail[i] = new InstanceSlowlogDetail(source.InstanceSlowLogDetail[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceSlowlogDetail.", this.InstanceSlowlogDetail);
        this.setParamArrayObj(map, prefix + "InstanceSlowLogDetail.", this.InstanceSlowLogDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

