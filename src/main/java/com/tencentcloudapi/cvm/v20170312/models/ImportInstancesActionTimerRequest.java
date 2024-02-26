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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportInstancesActionTimerRequest extends AbstractModel {

    /**
    * 实例id列表，可以通过DescribeInstances接口查询到。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 定时器任务信息，目前仅支持定时销毁。
    */
    @SerializedName("ActionTimer")
    @Expose
    private ActionTimer ActionTimer;

    /**
     * Get 实例id列表，可以通过DescribeInstances接口查询到。 
     * @return InstanceIds 实例id列表，可以通过DescribeInstances接口查询到。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例id列表，可以通过DescribeInstances接口查询到。
     * @param InstanceIds 实例id列表，可以通过DescribeInstances接口查询到。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 定时器任务信息，目前仅支持定时销毁。 
     * @return ActionTimer 定时器任务信息，目前仅支持定时销毁。
     */
    public ActionTimer getActionTimer() {
        return this.ActionTimer;
    }

    /**
     * Set 定时器任务信息，目前仅支持定时销毁。
     * @param ActionTimer 定时器任务信息，目前仅支持定时销毁。
     */
    public void setActionTimer(ActionTimer ActionTimer) {
        this.ActionTimer = ActionTimer;
    }

    public ImportInstancesActionTimerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportInstancesActionTimerRequest(ImportInstancesActionTimerRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ActionTimer != null) {
            this.ActionTimer = new ActionTimer(source.ActionTimer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "ActionTimer.", this.ActionTimer);

    }
}

