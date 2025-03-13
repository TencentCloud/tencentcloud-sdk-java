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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGatewayDevicesData extends AbstractModel {

    /**
    * 网关下设备列表
    */
    @SerializedName("List")
    @Expose
    private GatewayDevice [] List;

    /**
    * 网关下设备总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 网关下设备列表 
     * @return List 网关下设备列表
     */
    public GatewayDevice [] getList() {
        return this.List;
    }

    /**
     * Set 网关下设备列表
     * @param List 网关下设备列表
     */
    public void setList(GatewayDevice [] List) {
        this.List = List;
    }

    /**
     * Get 网关下设备总数 
     * @return TotalCount 网关下设备总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 网关下设备总数
     * @param TotalCount 网关下设备总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ListGatewayDevicesData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGatewayDevicesData(ListGatewayDevicesData source) {
        if (source.List != null) {
            this.List = new GatewayDevice[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new GatewayDevice(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

