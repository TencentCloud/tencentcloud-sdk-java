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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisInstanceInfo extends AbstractModel {

    /**
    * <p>副本数</p>
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
     * Get <p>副本数</p> 
     * @return ReplicasNum <p>副本数</p>
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set <p>副本数</p>
     * @param ReplicasNum <p>副本数</p>
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    public AnalysisInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisInstanceInfo(AnalysisInstanceInfo source) {
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);

    }
}

