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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeGatewayServerGroups extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 分组信息数组。
    */
    @SerializedName("GatewayGroupList")
    @Expose
    private NativeGatewayServerGroup [] GatewayGroupList;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 分组信息数组。 
     * @return GatewayGroupList 分组信息数组。
     */
    public NativeGatewayServerGroup [] getGatewayGroupList() {
        return this.GatewayGroupList;
    }

    /**
     * Set 分组信息数组。
     * @param GatewayGroupList 分组信息数组。
     */
    public void setGatewayGroupList(NativeGatewayServerGroup [] GatewayGroupList) {
        this.GatewayGroupList = GatewayGroupList;
    }

    public NativeGatewayServerGroups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeGatewayServerGroups(NativeGatewayServerGroups source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.GatewayGroupList != null) {
            this.GatewayGroupList = new NativeGatewayServerGroup[source.GatewayGroupList.length];
            for (int i = 0; i < source.GatewayGroupList.length; i++) {
                this.GatewayGroupList[i] = new NativeGatewayServerGroup(source.GatewayGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "GatewayGroupList.", this.GatewayGroupList);

    }
}

