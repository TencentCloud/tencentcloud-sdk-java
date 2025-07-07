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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstancesActionTimerRequest extends AbstractModel {

    /**
    * 定时任务ID列表，可以通过[ DescribeInstancesActionTimer ](https://cloud.tencent.com/document/product/213/103950)接口查询。只能删除未执行的定时任务。
    */
    @SerializedName("ActionTimerIds")
    @Expose
    private String [] ActionTimerIds;

    /**
     * Get 定时任务ID列表，可以通过[ DescribeInstancesActionTimer ](https://cloud.tencent.com/document/product/213/103950)接口查询。只能删除未执行的定时任务。 
     * @return ActionTimerIds 定时任务ID列表，可以通过[ DescribeInstancesActionTimer ](https://cloud.tencent.com/document/product/213/103950)接口查询。只能删除未执行的定时任务。
     */
    public String [] getActionTimerIds() {
        return this.ActionTimerIds;
    }

    /**
     * Set 定时任务ID列表，可以通过[ DescribeInstancesActionTimer ](https://cloud.tencent.com/document/product/213/103950)接口查询。只能删除未执行的定时任务。
     * @param ActionTimerIds 定时任务ID列表，可以通过[ DescribeInstancesActionTimer ](https://cloud.tencent.com/document/product/213/103950)接口查询。只能删除未执行的定时任务。
     */
    public void setActionTimerIds(String [] ActionTimerIds) {
        this.ActionTimerIds = ActionTimerIds;
    }

    public DeleteInstancesActionTimerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstancesActionTimerRequest(DeleteInstancesActionTimerRequest source) {
        if (source.ActionTimerIds != null) {
            this.ActionTimerIds = new String[source.ActionTimerIds.length];
            for (int i = 0; i < source.ActionTimerIds.length; i++) {
                this.ActionTimerIds[i] = new String(source.ActionTimerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActionTimerIds.", this.ActionTimerIds);

    }
}

