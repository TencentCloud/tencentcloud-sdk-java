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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false 
     * @return ForceRestart 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
     * @param ForceRestart 是否强制重启<li>true：强制重启</li><li>false：不强制重启</li>默认false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

