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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSpaceStatusResponse extends AbstractModel{

    /**
    * 磁盘增长量(MB)。
    */
    @SerializedName("Growth")
    @Expose
    private Long Growth;

    /**
    * 磁盘剩余(MB)。
    */
    @SerializedName("Remain")
    @Expose
    private Long Remain;

    /**
    * 磁盘总量(MB)。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 预计可用天数。
    */
    @SerializedName("AvailableDays")
    @Expose
    private Long AvailableDays;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 磁盘增长量(MB)。 
     * @return Growth 磁盘增长量(MB)。
     */
    public Long getGrowth() {
        return this.Growth;
    }

    /**
     * Set 磁盘增长量(MB)。
     * @param Growth 磁盘增长量(MB)。
     */
    public void setGrowth(Long Growth) {
        this.Growth = Growth;
    }

    /**
     * Get 磁盘剩余(MB)。 
     * @return Remain 磁盘剩余(MB)。
     */
    public Long getRemain() {
        return this.Remain;
    }

    /**
     * Set 磁盘剩余(MB)。
     * @param Remain 磁盘剩余(MB)。
     */
    public void setRemain(Long Remain) {
        this.Remain = Remain;
    }

    /**
     * Get 磁盘总量(MB)。 
     * @return Total 磁盘总量(MB)。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 磁盘总量(MB)。
     * @param Total 磁盘总量(MB)。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 预计可用天数。 
     * @return AvailableDays 预计可用天数。
     */
    public Long getAvailableDays() {
        return this.AvailableDays;
    }

    /**
     * Set 预计可用天数。
     * @param AvailableDays 预计可用天数。
     */
    public void setAvailableDays(Long AvailableDays) {
        this.AvailableDays = AvailableDays;
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

    public DescribeDBSpaceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSpaceStatusResponse(DescribeDBSpaceStatusResponse source) {
        if (source.Growth != null) {
            this.Growth = new Long(source.Growth);
        }
        if (source.Remain != null) {
            this.Remain = new Long(source.Remain);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AvailableDays != null) {
            this.AvailableDays = new Long(source.AvailableDays);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Growth", this.Growth);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "AvailableDays", this.AvailableDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

