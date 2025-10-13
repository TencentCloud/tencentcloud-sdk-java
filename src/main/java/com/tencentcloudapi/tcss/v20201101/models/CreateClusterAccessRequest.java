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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterAccessRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
     * Get 集群ID 
     * @return ClusterIDs 集群ID
     */
    public String [] getClusterIDs() {
        return this.ClusterIDs;
    }

    /**
     * Set 集群ID
     * @param ClusterIDs 集群ID
     */
    public void setClusterIDs(String [] ClusterIDs) {
        this.ClusterIDs = ClusterIDs;
    }

    public CreateClusterAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterAccessRequest(CreateClusterAccessRequest source) {
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);

    }
}

