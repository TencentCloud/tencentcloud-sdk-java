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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigsResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 数组
    */
    @SerializedName("List")
    @Expose
    private DisplayConfig [] List;

    /**
    * 全部路径数量
    */
    @SerializedName("AllConfigNum")
    @Expose
    private Long AllConfigNum;

    /**
    * 高风险路径数量
    */
    @SerializedName("HighRiskConfigNum")
    @Expose
    private Long HighRiskConfigNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 数组 
     * @return List 数组
     */
    public DisplayConfig [] getList() {
        return this.List;
    }

    /**
     * Set 数组
     * @param List 数组
     */
    public void setList(DisplayConfig [] List) {
        this.List = List;
    }

    /**
     * Get 全部路径数量 
     * @return AllConfigNum 全部路径数量
     */
    public Long getAllConfigNum() {
        return this.AllConfigNum;
    }

    /**
     * Set 全部路径数量
     * @param AllConfigNum 全部路径数量
     */
    public void setAllConfigNum(Long AllConfigNum) {
        this.AllConfigNum = AllConfigNum;
    }

    /**
     * Get 高风险路径数量 
     * @return HighRiskConfigNum 高风险路径数量
     */
    public Long getHighRiskConfigNum() {
        return this.HighRiskConfigNum;
    }

    /**
     * Set 高风险路径数量
     * @param HighRiskConfigNum 高风险路径数量
     */
    public void setHighRiskConfigNum(Long HighRiskConfigNum) {
        this.HighRiskConfigNum = HighRiskConfigNum;
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

    public DescribeConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigsResponse(DescribeConfigsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new DisplayConfig[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new DisplayConfig(source.List[i]);
            }
        }
        if (source.AllConfigNum != null) {
            this.AllConfigNum = new Long(source.AllConfigNum);
        }
        if (source.HighRiskConfigNum != null) {
            this.HighRiskConfigNum = new Long(source.HighRiskConfigNum);
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
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "AllConfigNum", this.AllConfigNum);
        this.setParamSimple(map, prefix + "HighRiskConfigNum", this.HighRiskConfigNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

