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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlertListResponse extends AbstractModel {

    /**
    * 全量告警列表
    */
    @SerializedName("AlertList")
    @Expose
    private AlertInfo [] AlertList;

    /**
    * 告警大类数量
    */
    @SerializedName("AlertTypeCount")
    @Expose
    private TagCount [] AlertTypeCount;

    /**
    * 告警总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 0：succeed 1：timeout
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 返回状态信息
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 全量告警列表 
     * @return AlertList 全量告警列表
     */
    public AlertInfo [] getAlertList() {
        return this.AlertList;
    }

    /**
     * Set 全量告警列表
     * @param AlertList 全量告警列表
     */
    public void setAlertList(AlertInfo [] AlertList) {
        this.AlertList = AlertList;
    }

    /**
     * Get 告警大类数量 
     * @return AlertTypeCount 告警大类数量
     */
    public TagCount [] getAlertTypeCount() {
        return this.AlertTypeCount;
    }

    /**
     * Set 告警大类数量
     * @param AlertTypeCount 告警大类数量
     */
    public void setAlertTypeCount(TagCount [] AlertTypeCount) {
        this.AlertTypeCount = AlertTypeCount;
    }

    /**
     * Get 告警总数 
     * @return TotalCount 告警总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 告警总数
     * @param TotalCount 告警总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 0：succeed 1：timeout 
     * @return ReturnCode 0：succeed 1：timeout
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 0：succeed 1：timeout
     * @param ReturnCode 0：succeed 1：timeout
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 返回状态信息 
     * @return ReturnMsg 返回状态信息
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 返回状态信息
     * @param ReturnMsg 返回状态信息
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public DescribeAlertListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertListResponse(DescribeAlertListResponse source) {
        if (source.AlertList != null) {
            this.AlertList = new AlertInfo[source.AlertList.length];
            for (int i = 0; i < source.AlertList.length; i++) {
                this.AlertList[i] = new AlertInfo(source.AlertList[i]);
            }
        }
        if (source.AlertTypeCount != null) {
            this.AlertTypeCount = new TagCount[source.AlertTypeCount.length];
            for (int i = 0; i < source.AlertTypeCount.length; i++) {
                this.AlertTypeCount[i] = new TagCount(source.AlertTypeCount[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlertList.", this.AlertList);
        this.setParamArrayObj(map, prefix + "AlertTypeCount.", this.AlertTypeCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

