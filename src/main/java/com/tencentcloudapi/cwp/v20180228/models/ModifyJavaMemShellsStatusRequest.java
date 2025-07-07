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

public class ModifyJavaMemShellsStatusRequest extends AbstractModel {

    /**
    * 目标处理状态： 0 - 待处理 1 - 已加白 2 - 已删除 3 - 已忽略 4 - 已手动处理
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 事件Id数组
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 是否更新全部，只支持忽略、已处理、删除
    */
    @SerializedName("UpdateAll")
    @Expose
    private Boolean UpdateAll;

    /**
     * Get 目标处理状态： 0 - 待处理 1 - 已加白 2 - 已删除 3 - 已忽略 4 - 已手动处理 
     * @return Status 目标处理状态： 0 - 待处理 1 - 已加白 2 - 已删除 3 - 已忽略 4 - 已手动处理
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 目标处理状态： 0 - 待处理 1 - 已加白 2 - 已删除 3 - 已忽略 4 - 已手动处理
     * @param Status 目标处理状态： 0 - 待处理 1 - 已加白 2 - 已删除 3 - 已忽略 4 - 已手动处理
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 事件Id数组 
     * @return Ids 事件Id数组
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 事件Id数组
     * @param Ids 事件Id数组
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 是否更新全部，只支持忽略、已处理、删除 
     * @return UpdateAll 是否更新全部，只支持忽略、已处理、删除
     */
    public Boolean getUpdateAll() {
        return this.UpdateAll;
    }

    /**
     * Set 是否更新全部，只支持忽略、已处理、删除
     * @param UpdateAll 是否更新全部，只支持忽略、已处理、删除
     */
    public void setUpdateAll(Boolean UpdateAll) {
        this.UpdateAll = UpdateAll;
    }

    public ModifyJavaMemShellsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJavaMemShellsStatusRequest(ModifyJavaMemShellsStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.UpdateAll != null) {
            this.UpdateAll = new Boolean(source.UpdateAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "UpdateAll", this.UpdateAll);

    }
}

