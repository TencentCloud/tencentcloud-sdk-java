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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDosageDetailByDateResponse extends AbstractModel {

    /**
    * 计量单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 用量数组
    */
    @SerializedName("DetailSets")
    @Expose
    private DetailSet [] DetailSets;

    /**
    * 错误码
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * 错误信息
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 计量单位 
     * @return Unit 计量单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 计量单位
     * @param Unit 计量单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 用量数组 
     * @return DetailSets 用量数组
     */
    public DetailSet [] getDetailSets() {
        return this.DetailSets;
    }

    /**
     * Set 用量数组
     * @param DetailSets 用量数组
     */
    public void setDetailSets(DetailSet [] DetailSets) {
        this.DetailSets = DetailSets;
    }

    /**
     * Get 错误码 
     * @return RetCode 错误码
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 错误码
     * @param RetCode 错误码
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 错误信息 
     * @return RetMsg 错误信息
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set 错误信息
     * @param RetMsg 错误信息
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
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

    public DescribeDosageDetailByDateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDosageDetailByDateResponse(DescribeDosageDetailByDateResponse source) {
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.DetailSets != null) {
            this.DetailSets = new DetailSet[source.DetailSets.length];
            for (int i = 0; i < source.DetailSets.length; i++) {
                this.DetailSets[i] = new DetailSet(source.DetailSets[i]);
            }
        }
        if (source.RetCode != null) {
            this.RetCode = new Long(source.RetCode);
        }
        if (source.RetMsg != null) {
            this.RetMsg = new String(source.RetMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "DetailSets.", this.DetailSets);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

