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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonTraceDetailResponse  extends AbstractModel{

    /**
    * 卖场编码
    */
    @SerializedName("MallId")
    @Expose
    private String MallId;

    /**
    * 客户编码
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 轨迹编码
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 轨迹点坐标序列
    */
    @SerializedName("CoordinateSet")
    @Expose
    private PersonCoordinate [] CoordinateSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取卖场编码
     * @return MallId 卖场编码
     */
    public String getMallId() {
        return this.MallId;
    }

    /**
     * 设置卖场编码
     * @param MallId 卖场编码
     */
    public void setMallId(String MallId) {
        this.MallId = MallId;
    }

    /**
     * 获取客户编码
     * @return PersonId 客户编码
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置客户编码
     * @param PersonId 客户编码
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取轨迹编码
     * @return TraceId 轨迹编码
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * 设置轨迹编码
     * @param TraceId 轨迹编码
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * 获取轨迹点坐标序列
     * @return CoordinateSet 轨迹点坐标序列
     */
    public PersonCoordinate [] getCoordinateSet() {
        return this.CoordinateSet;
    }

    /**
     * 设置轨迹点坐标序列
     * @param CoordinateSet 轨迹点坐标序列
     */
    public void setCoordinateSet(PersonCoordinate [] CoordinateSet) {
        this.CoordinateSet = CoordinateSet;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MallId", this.MallId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArrayObj(map, prefix + "CoordinateSet.", this.CoordinateSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

