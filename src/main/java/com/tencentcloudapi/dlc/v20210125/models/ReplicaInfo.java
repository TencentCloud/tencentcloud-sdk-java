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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicaInfo extends AbstractModel {

    /**
    * <p>期望副本数</p>
    */
    @SerializedName("Desired")
    @Expose
    private Long Desired;

    /**
    * <p>可用（就绪）副本数</p>
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get <p>期望副本数</p> 
     * @return Desired <p>期望副本数</p>
     */
    public Long getDesired() {
        return this.Desired;
    }

    /**
     * Set <p>期望副本数</p>
     * @param Desired <p>期望副本数</p>
     */
    public void setDesired(Long Desired) {
        this.Desired = Desired;
    }

    /**
     * Get <p>可用（就绪）副本数</p> 
     * @return Available <p>可用（就绪）副本数</p>
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>可用（就绪）副本数</p>
     * @param Available <p>可用（就绪）副本数</p>
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public ReplicaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicaInfo(ReplicaInfo source) {
        if (source.Desired != null) {
            this.Desired = new Long(source.Desired);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Desired", this.Desired);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

