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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWorkGroupRequest extends AbstractModel{

    /**
    * 要删除的工作组Id集合
    */
    @SerializedName("WorkGroupIds")
    @Expose
    private Long [] WorkGroupIds;

    /**
     * Get 要删除的工作组Id集合 
     * @return WorkGroupIds 要删除的工作组Id集合
     */
    public Long [] getWorkGroupIds() {
        return this.WorkGroupIds;
    }

    /**
     * Set 要删除的工作组Id集合
     * @param WorkGroupIds 要删除的工作组Id集合
     */
    public void setWorkGroupIds(Long [] WorkGroupIds) {
        this.WorkGroupIds = WorkGroupIds;
    }

    public DeleteWorkGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkGroupRequest(DeleteWorkGroupRequest source) {
        if (source.WorkGroupIds != null) {
            this.WorkGroupIds = new Long[source.WorkGroupIds.length];
            for (int i = 0; i < source.WorkGroupIds.length; i++) {
                this.WorkGroupIds[i] = new Long(source.WorkGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WorkGroupIds.", this.WorkGroupIds);

    }
}

