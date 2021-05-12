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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesCountResponse extends AbstractModel{

    /**
    * 客户的实例总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 客户的实例运行数
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 客户的实例总数 
     * @return Total 客户的实例总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 客户的实例总数
     * @param Total 客户的实例总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 客户的实例运行数 
     * @return Running 客户的实例运行数
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set 客户的实例运行数
     * @param Running 客户的实例运行数
     */
    public void setRunning(Long Running) {
        this.Running = Running;
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

    public DescribeInstancesCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesCountResponse(DescribeInstancesCountResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Running != null) {
            this.Running = new Long(source.Running);
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
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

