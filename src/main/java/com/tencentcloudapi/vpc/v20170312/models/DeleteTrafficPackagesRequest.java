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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTrafficPackagesRequest extends AbstractModel{

    /**
    * 待删除的流量包唯一ID数组
    */
    @SerializedName("TrafficPackageIds")
    @Expose
    private String [] TrafficPackageIds;

    /**
     * Get 待删除的流量包唯一ID数组 
     * @return TrafficPackageIds 待删除的流量包唯一ID数组
     */
    public String [] getTrafficPackageIds() {
        return this.TrafficPackageIds;
    }

    /**
     * Set 待删除的流量包唯一ID数组
     * @param TrafficPackageIds 待删除的流量包唯一ID数组
     */
    public void setTrafficPackageIds(String [] TrafficPackageIds) {
        this.TrafficPackageIds = TrafficPackageIds;
    }

    public DeleteTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTrafficPackagesRequest(DeleteTrafficPackagesRequest source) {
        if (source.TrafficPackageIds != null) {
            this.TrafficPackageIds = new String[source.TrafficPackageIds.length];
            for (int i = 0; i < source.TrafficPackageIds.length; i++) {
                this.TrafficPackageIds[i] = new String(source.TrafficPackageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficPackageIds.", this.TrafficPackageIds);

    }
}

