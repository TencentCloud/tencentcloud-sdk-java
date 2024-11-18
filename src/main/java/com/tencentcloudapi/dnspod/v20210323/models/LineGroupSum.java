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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineGroupSum extends AbstractModel {

    /**
    * 本次请求返回自定义线路分组个数
    */
    @SerializedName("NowTotal")
    @Expose
    private Long NowTotal;

    /**
    * 自定义线路分组总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 还可允许添加的自定义线路分组个数
    */
    @SerializedName("AvailableCount")
    @Expose
    private Long AvailableCount;

    /**
     * Get 本次请求返回自定义线路分组个数 
     * @return NowTotal 本次请求返回自定义线路分组个数
     */
    public Long getNowTotal() {
        return this.NowTotal;
    }

    /**
     * Set 本次请求返回自定义线路分组个数
     * @param NowTotal 本次请求返回自定义线路分组个数
     */
    public void setNowTotal(Long NowTotal) {
        this.NowTotal = NowTotal;
    }

    /**
     * Get 自定义线路分组总数 
     * @return Total 自定义线路分组总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 自定义线路分组总数
     * @param Total 自定义线路分组总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 还可允许添加的自定义线路分组个数 
     * @return AvailableCount 还可允许添加的自定义线路分组个数
     */
    public Long getAvailableCount() {
        return this.AvailableCount;
    }

    /**
     * Set 还可允许添加的自定义线路分组个数
     * @param AvailableCount 还可允许添加的自定义线路分组个数
     */
    public void setAvailableCount(Long AvailableCount) {
        this.AvailableCount = AvailableCount;
    }

    public LineGroupSum() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineGroupSum(LineGroupSum source) {
        if (source.NowTotal != null) {
            this.NowTotal = new Long(source.NowTotal);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AvailableCount != null) {
            this.AvailableCount = new Long(source.AvailableCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NowTotal", this.NowTotal);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "AvailableCount", this.AvailableCount);

    }
}

