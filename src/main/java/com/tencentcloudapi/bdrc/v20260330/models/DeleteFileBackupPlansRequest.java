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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFileBackupPlansRequest extends AbstractModel {

    /**
    * 备份点 ID 列表
    */
    @SerializedName("PlanIds")
    @Expose
    private String [] PlanIds;

    /**
     * Get 备份点 ID 列表 
     * @return PlanIds 备份点 ID 列表
     */
    public String [] getPlanIds() {
        return this.PlanIds;
    }

    /**
     * Set 备份点 ID 列表
     * @param PlanIds 备份点 ID 列表
     */
    public void setPlanIds(String [] PlanIds) {
        this.PlanIds = PlanIds;
    }

    public DeleteFileBackupPlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFileBackupPlansRequest(DeleteFileBackupPlansRequest source) {
        if (source.PlanIds != null) {
            this.PlanIds = new String[source.PlanIds.length];
            for (int i = 0; i < source.PlanIds.length; i++) {
                this.PlanIds[i] = new String(source.PlanIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PlanIds.", this.PlanIds);

    }
}

