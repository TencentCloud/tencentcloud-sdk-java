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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGrafanaInstanceRequest extends AbstractModel{

    /**
    * 实例名数组
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
     * Get 实例名数组 
     * @return InstanceIDs 实例名数组
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set 实例名数组
     * @param InstanceIDs 实例名数组
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    public DeleteGrafanaInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGrafanaInstanceRequest(DeleteGrafanaInstanceRequest source) {
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);

    }
}

