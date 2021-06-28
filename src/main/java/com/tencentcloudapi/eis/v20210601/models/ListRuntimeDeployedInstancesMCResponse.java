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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRuntimeDeployedInstancesMCResponse extends AbstractModel{

    /**
    * 运行时所部属的应用实例列表
    */
    @SerializedName("Instances")
    @Expose
    private RuntimeDeployedInstanceMC [] Instances;

    /**
    * 满足条件的记录总数，用于分页器
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 运行时所部属的应用实例列表 
     * @return Instances 运行时所部属的应用实例列表
     */
    public RuntimeDeployedInstanceMC [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 运行时所部属的应用实例列表
     * @param Instances 运行时所部属的应用实例列表
     */
    public void setInstances(RuntimeDeployedInstanceMC [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 满足条件的记录总数，用于分页器 
     * @return TotalCount 满足条件的记录总数，用于分页器
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足条件的记录总数，用于分页器
     * @param TotalCount 满足条件的记录总数，用于分页器
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public ListRuntimeDeployedInstancesMCResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRuntimeDeployedInstancesMCResponse(ListRuntimeDeployedInstancesMCResponse source) {
        if (source.Instances != null) {
            this.Instances = new RuntimeDeployedInstanceMC[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new RuntimeDeployedInstanceMC(source.Instances[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

