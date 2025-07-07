/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class ModifyFileTamperEventsRequest extends AbstractModel {

    /**
    * Status 1 -- 加白 2 -- 删除 3 - 忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 对应事件id
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
     * Get Status 1 -- 加白 2 -- 删除 3 - 忽略 
     * @return Status Status 1 -- 加白 2 -- 删除 3 - 忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status 1 -- 加白 2 -- 删除 3 - 忽略
     * @param Status Status 1 -- 加白 2 -- 删除 3 - 忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 对应事件id 
     * @return Ids 对应事件id
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 对应事件id
     * @param Ids 对应事件id
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    public ModifyFileTamperEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileTamperEventsRequest(ModifyFileTamperEventsRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

