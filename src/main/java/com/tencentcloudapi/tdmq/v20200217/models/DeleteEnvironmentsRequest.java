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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEnvironmentsRequest extends AbstractModel {

    /**
    * 环境（命名空间）数组，每次最多删除20个。
    */
    @SerializedName("EnvironmentIds")
    @Expose
    private String [] EnvironmentIds;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 环境（命名空间）数组，每次最多删除20个。 
     * @return EnvironmentIds 环境（命名空间）数组，每次最多删除20个。
     */
    public String [] getEnvironmentIds() {
        return this.EnvironmentIds;
    }

    /**
     * Set 环境（命名空间）数组，每次最多删除20个。
     * @param EnvironmentIds 环境（命名空间）数组，每次最多删除20个。
     */
    public void setEnvironmentIds(String [] EnvironmentIds) {
        this.EnvironmentIds = EnvironmentIds;
    }

    /**
     * Get Pulsar 集群的ID 
     * @return ClusterId Pulsar 集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID
     * @param ClusterId Pulsar 集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DeleteEnvironmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEnvironmentsRequest(DeleteEnvironmentsRequest source) {
        if (source.EnvironmentIds != null) {
            this.EnvironmentIds = new String[source.EnvironmentIds.length];
            for (int i = 0; i < source.EnvironmentIds.length; i++) {
                this.EnvironmentIds[i] = new String(source.EnvironmentIds[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EnvironmentIds.", this.EnvironmentIds);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

