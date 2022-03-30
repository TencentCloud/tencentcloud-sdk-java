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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicaSetInfo extends AbstractModel{

    /**
    * 副本集ID
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
     * Get 副本集ID 
     * @return ReplicaSetId 副本集ID
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set 副本集ID
     * @param ReplicaSetId 副本集ID
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    public ReplicaSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicaSetInfo(ReplicaSetInfo source) {
        if (source.ReplicaSetId != null) {
            this.ReplicaSetId = new String(source.ReplicaSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);

    }
}

