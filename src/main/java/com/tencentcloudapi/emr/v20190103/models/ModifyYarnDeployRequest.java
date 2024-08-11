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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyYarnDeployRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 切换后的调度器，可选值为fair、capacity
    */
    @SerializedName("NewScheduler")
    @Expose
    private String NewScheduler;

    /**
    * 现在使用的调度器，可选值为fair、capacity
    */
    @SerializedName("OldScheduler")
    @Expose
    private String OldScheduler;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 切换后的调度器，可选值为fair、capacity 
     * @return NewScheduler 切换后的调度器，可选值为fair、capacity
     */
    public String getNewScheduler() {
        return this.NewScheduler;
    }

    /**
     * Set 切换后的调度器，可选值为fair、capacity
     * @param NewScheduler 切换后的调度器，可选值为fair、capacity
     */
    public void setNewScheduler(String NewScheduler) {
        this.NewScheduler = NewScheduler;
    }

    /**
     * Get 现在使用的调度器，可选值为fair、capacity 
     * @return OldScheduler 现在使用的调度器，可选值为fair、capacity
     */
    public String getOldScheduler() {
        return this.OldScheduler;
    }

    /**
     * Set 现在使用的调度器，可选值为fair、capacity
     * @param OldScheduler 现在使用的调度器，可选值为fair、capacity
     */
    public void setOldScheduler(String OldScheduler) {
        this.OldScheduler = OldScheduler;
    }

    public ModifyYarnDeployRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyYarnDeployRequest(ModifyYarnDeployRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NewScheduler != null) {
            this.NewScheduler = new String(source.NewScheduler);
        }
        if (source.OldScheduler != null) {
            this.OldScheduler = new String(source.OldScheduler);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NewScheduler", this.NewScheduler);
        this.setParamSimple(map, prefix + "OldScheduler", this.OldScheduler);

    }
}

