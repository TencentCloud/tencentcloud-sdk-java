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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteHighPriorityRoutesRequest extends AbstractModel {

    /**
    * 高优路由表唯一 ID。
    */
    @SerializedName("HighPriorityRouteTableId")
    @Expose
    private String HighPriorityRouteTableId;

    /**
    * 高优路由表条目唯一 ID 列表。
    */
    @SerializedName("HighPriorityRouteIds")
    @Expose
    private String [] HighPriorityRouteIds;

    /**
     * Get 高优路由表唯一 ID。 
     * @return HighPriorityRouteTableId 高优路由表唯一 ID。
     */
    public String getHighPriorityRouteTableId() {
        return this.HighPriorityRouteTableId;
    }

    /**
     * Set 高优路由表唯一 ID。
     * @param HighPriorityRouteTableId 高优路由表唯一 ID。
     */
    public void setHighPriorityRouteTableId(String HighPriorityRouteTableId) {
        this.HighPriorityRouteTableId = HighPriorityRouteTableId;
    }

    /**
     * Get 高优路由表条目唯一 ID 列表。 
     * @return HighPriorityRouteIds 高优路由表条目唯一 ID 列表。
     */
    public String [] getHighPriorityRouteIds() {
        return this.HighPriorityRouteIds;
    }

    /**
     * Set 高优路由表条目唯一 ID 列表。
     * @param HighPriorityRouteIds 高优路由表条目唯一 ID 列表。
     */
    public void setHighPriorityRouteIds(String [] HighPriorityRouteIds) {
        this.HighPriorityRouteIds = HighPriorityRouteIds;
    }

    public DeleteHighPriorityRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteHighPriorityRoutesRequest(DeleteHighPriorityRoutesRequest source) {
        if (source.HighPriorityRouteTableId != null) {
            this.HighPriorityRouteTableId = new String(source.HighPriorityRouteTableId);
        }
        if (source.HighPriorityRouteIds != null) {
            this.HighPriorityRouteIds = new String[source.HighPriorityRouteIds.length];
            for (int i = 0; i < source.HighPriorityRouteIds.length; i++) {
                this.HighPriorityRouteIds[i] = new String(source.HighPriorityRouteIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighPriorityRouteTableId", this.HighPriorityRouteTableId);
        this.setParamArraySimple(map, prefix + "HighPriorityRouteIds.", this.HighPriorityRouteIds);

    }
}

