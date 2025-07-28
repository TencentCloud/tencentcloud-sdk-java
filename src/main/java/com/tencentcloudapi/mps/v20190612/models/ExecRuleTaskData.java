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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecRuleTaskData extends AbstractModel {

    /**
    * 质检条件判断需要执行的节点索引。
    */
    @SerializedName("RearDriveIndex")
    @Expose
    private Long [] RearDriveIndex;

    /**
     * Get 质检条件判断需要执行的节点索引。 
     * @return RearDriveIndex 质检条件判断需要执行的节点索引。
     */
    public Long [] getRearDriveIndex() {
        return this.RearDriveIndex;
    }

    /**
     * Set 质检条件判断需要执行的节点索引。
     * @param RearDriveIndex 质检条件判断需要执行的节点索引。
     */
    public void setRearDriveIndex(Long [] RearDriveIndex) {
        this.RearDriveIndex = RearDriveIndex;
    }

    public ExecRuleTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecRuleTaskData(ExecRuleTaskData source) {
        if (source.RearDriveIndex != null) {
            this.RearDriveIndex = new Long[source.RearDriveIndex.length];
            for (int i = 0; i < source.RearDriveIndex.length; i++) {
                this.RearDriveIndex[i] = new Long(source.RearDriveIndex[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RearDriveIndex.", this.RearDriveIndex);

    }
}

