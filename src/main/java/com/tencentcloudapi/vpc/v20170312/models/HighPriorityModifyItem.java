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

public class HighPriorityModifyItem extends AbstractModel {

    /**
    * 高优路由条目唯一ID。
    */
    @SerializedName("HighPriorityRouteId")
    @Expose
    private String HighPriorityRouteId;

    /**
    * 高优路由条目描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 高优路由条目唯一ID。 
     * @return HighPriorityRouteId 高优路由条目唯一ID。
     */
    public String getHighPriorityRouteId() {
        return this.HighPriorityRouteId;
    }

    /**
     * Set 高优路由条目唯一ID。
     * @param HighPriorityRouteId 高优路由条目唯一ID。
     */
    public void setHighPriorityRouteId(String HighPriorityRouteId) {
        this.HighPriorityRouteId = HighPriorityRouteId;
    }

    /**
     * Get 高优路由条目描述。 
     * @return Description 高优路由条目描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 高优路由条目描述。
     * @param Description 高优路由条目描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public HighPriorityModifyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighPriorityModifyItem(HighPriorityModifyItem source) {
        if (source.HighPriorityRouteId != null) {
            this.HighPriorityRouteId = new String(source.HighPriorityRouteId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighPriorityRouteId", this.HighPriorityRouteId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

