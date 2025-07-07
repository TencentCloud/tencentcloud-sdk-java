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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterPersonTraceResponse extends AbstractModel {

    /**
    * 卖场系统编码
    */
    @SerializedName("MallId")
    @Expose
    private String MallId;

    /**
    * 卖场用户编码
    */
    @SerializedName("MallCode")
    @Expose
    private String MallCode;

    /**
    * 客户编码
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 轨迹序列
    */
    @SerializedName("TracePointSet")
    @Expose
    private DailyTracePoint [] TracePointSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 卖场系统编码 
     * @return MallId 卖场系统编码
     */
    public String getMallId() {
        return this.MallId;
    }

    /**
     * Set 卖场系统编码
     * @param MallId 卖场系统编码
     */
    public void setMallId(String MallId) {
        this.MallId = MallId;
    }

    /**
     * Get 卖场用户编码 
     * @return MallCode 卖场用户编码
     */
    public String getMallCode() {
        return this.MallCode;
    }

    /**
     * Set 卖场用户编码
     * @param MallCode 卖场用户编码
     */
    public void setMallCode(String MallCode) {
        this.MallCode = MallCode;
    }

    /**
     * Get 客户编码 
     * @return PersonId 客户编码
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 客户编码
     * @param PersonId 客户编码
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 轨迹序列 
     * @return TracePointSet 轨迹序列
     */
    public DailyTracePoint [] getTracePointSet() {
        return this.TracePointSet;
    }

    /**
     * Set 轨迹序列
     * @param TracePointSet 轨迹序列
     */
    public void setTracePointSet(DailyTracePoint [] TracePointSet) {
        this.TracePointSet = TracePointSet;
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

    public DescribeClusterPersonTraceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterPersonTraceResponse(DescribeClusterPersonTraceResponse source) {
        if (source.MallId != null) {
            this.MallId = new String(source.MallId);
        }
        if (source.MallCode != null) {
            this.MallCode = new String(source.MallCode);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.TracePointSet != null) {
            this.TracePointSet = new DailyTracePoint[source.TracePointSet.length];
            for (int i = 0; i < source.TracePointSet.length; i++) {
                this.TracePointSet[i] = new DailyTracePoint(source.TracePointSet[i]);
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
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "MallCode", this.MallCode);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArrayObj(map, prefix + "TracePointSet.", this.TracePointSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

