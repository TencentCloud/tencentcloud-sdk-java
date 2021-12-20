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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDetailedSingleProbeDataResponse extends AbstractModel{

    /**
    * 单次详情数据
    */
    @SerializedName("DataSet")
    @Expose
    private DetailedSingleDataDefine [] DataSet;

    /**
    * 符合条件的数据总数
    */
    @SerializedName("TotalNumber")
    @Expose
    private Long TotalNumber;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 单次详情数据 
     * @return DataSet 单次详情数据
     */
    public DetailedSingleDataDefine [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 单次详情数据
     * @param DataSet 单次详情数据
     */
    public void setDataSet(DetailedSingleDataDefine [] DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get 符合条件的数据总数 
     * @return TotalNumber 符合条件的数据总数
     */
    public Long getTotalNumber() {
        return this.TotalNumber;
    }

    /**
     * Set 符合条件的数据总数
     * @param TotalNumber 符合条件的数据总数
     */
    public void setTotalNumber(Long TotalNumber) {
        this.TotalNumber = TotalNumber;
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

    public DescribeDetailedSingleProbeDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDetailedSingleProbeDataResponse(DescribeDetailedSingleProbeDataResponse source) {
        if (source.DataSet != null) {
            this.DataSet = new DetailedSingleDataDefine[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new DetailedSingleDataDefine(source.DataSet[i]);
            }
        }
        if (source.TotalNumber != null) {
            this.TotalNumber = new Long(source.TotalNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);
        this.setParamSimple(map, prefix + "TotalNumber", this.TotalNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

