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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecIndexResponse extends AbstractModel{

    /**
    * 字段值，如下：
AttackIpCount：受攻击的IP数
AttackCount：攻击次数
BlockCount：封堵次数
MaxMbps：攻击峰值Mbps
IpNum：统计的IP数据
    */
    @SerializedName("Data")
    @Expose
    private KeyValue [] Data;

    /**
    * 本月开始时间
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 本月结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 字段值，如下：
AttackIpCount：受攻击的IP数
AttackCount：攻击次数
BlockCount：封堵次数
MaxMbps：攻击峰值Mbps
IpNum：统计的IP数据 
     * @return Data 字段值，如下：
AttackIpCount：受攻击的IP数
AttackCount：攻击次数
BlockCount：封堵次数
MaxMbps：攻击峰值Mbps
IpNum：统计的IP数据
     */
    public KeyValue [] getData() {
        return this.Data;
    }

    /**
     * Set 字段值，如下：
AttackIpCount：受攻击的IP数
AttackCount：攻击次数
BlockCount：封堵次数
MaxMbps：攻击峰值Mbps
IpNum：统计的IP数据
     * @param Data 字段值，如下：
AttackIpCount：受攻击的IP数
AttackCount：攻击次数
BlockCount：封堵次数
MaxMbps：攻击峰值Mbps
IpNum：统计的IP数据
     */
    public void setData(KeyValue [] Data) {
        this.Data = Data;
    }

    /**
     * Get 本月开始时间 
     * @return BeginDate 本月开始时间
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 本月开始时间
     * @param BeginDate 本月开始时间
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 本月结束时间 
     * @return EndDate 本月结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 本月结束时间
     * @param EndDate 本月结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

