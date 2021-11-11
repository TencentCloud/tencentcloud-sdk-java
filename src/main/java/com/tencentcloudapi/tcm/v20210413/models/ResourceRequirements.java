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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceRequirements extends AbstractModel{

    /**
    * Limits 描述了允许的最大计算资源量。
    */
    @SerializedName("Limits")
    @Expose
    private Resource [] Limits;

    /**
    * Requests 描述所需的最小计算资源量。
    */
    @SerializedName("Requests")
    @Expose
    private Resource [] Requests;

    /**
     * Get Limits 描述了允许的最大计算资源量。 
     * @return Limits Limits 描述了允许的最大计算资源量。
     */
    public Resource [] getLimits() {
        return this.Limits;
    }

    /**
     * Set Limits 描述了允许的最大计算资源量。
     * @param Limits Limits 描述了允许的最大计算资源量。
     */
    public void setLimits(Resource [] Limits) {
        this.Limits = Limits;
    }

    /**
     * Get Requests 描述所需的最小计算资源量。 
     * @return Requests Requests 描述所需的最小计算资源量。
     */
    public Resource [] getRequests() {
        return this.Requests;
    }

    /**
     * Set Requests 描述所需的最小计算资源量。
     * @param Requests Requests 描述所需的最小计算资源量。
     */
    public void setRequests(Resource [] Requests) {
        this.Requests = Requests;
    }

    public ResourceRequirements() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceRequirements(ResourceRequirements source) {
        if (source.Limits != null) {
            this.Limits = new Resource[source.Limits.length];
            for (int i = 0; i < source.Limits.length; i++) {
                this.Limits[i] = new Resource(source.Limits[i]);
            }
        }
        if (source.Requests != null) {
            this.Requests = new Resource[source.Requests.length];
            for (int i = 0; i < source.Requests.length; i++) {
                this.Requests[i] = new Resource(source.Requests[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Limits.", this.Limits);
        this.setParamArrayObj(map, prefix + "Requests.", this.Requests);

    }
}

