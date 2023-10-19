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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRansomDefenseEventsStatusRequest extends AbstractModel {

    /**
    * 需要修改的事件id 数组，支持批量
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 操作 0待处理，1已处理,2信任,9:删除记录
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否更新所有同路径事件
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
     * Get 需要修改的事件id 数组，支持批量 
     * @return Ids 需要修改的事件id 数组，支持批量
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 需要修改的事件id 数组，支持批量
     * @param Ids 需要修改的事件id 数组，支持批量
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 操作 0待处理，1已处理,2信任,9:删除记录 
     * @return Status 操作 0待处理，1已处理,2信任,9:删除记录
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 操作 0待处理，1已处理,2信任,9:删除记录
     * @param Status 操作 0待处理，1已处理,2信任,9:删除记录
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否更新所有同路径事件 
     * @return All 是否更新所有同路径事件
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否更新所有同路径事件
     * @param All 是否更新所有同路径事件
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    public ModifyRansomDefenseEventsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRansomDefenseEventsStatusRequest(ModifyRansomDefenseEventsStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "All", this.All);

    }
}

