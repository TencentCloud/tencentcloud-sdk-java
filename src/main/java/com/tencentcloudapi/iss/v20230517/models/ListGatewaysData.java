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

public class ListGatewaysData extends AbstractModel {

    /**
    * 网关列表
    */
    @SerializedName("List")
    @Expose
    private GatewaysData [] List;

    /**
    * 网关数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 网关列表 
     * @return List 网关列表
     */
    public GatewaysData [] getList() {
        return this.List;
    }

    /**
     * Set 网关列表
     * @param List 网关列表
     */
    public void setList(GatewaysData [] List) {
        this.List = List;
    }

    /**
     * Get 网关数量 
     * @return TotalCount 网关数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 网关数量
     * @param TotalCount 网关数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ListGatewaysData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGatewaysData(ListGatewaysData source) {
        if (source.List != null) {
            this.List = new GatewaysData[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new GatewaysData(source.List[i]);
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

