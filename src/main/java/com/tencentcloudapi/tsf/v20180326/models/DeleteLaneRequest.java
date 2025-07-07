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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLaneRequest extends AbstractModel {

    /**
    * 泳道Idl
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
     * Get 泳道Idl 
     * @return LaneId 泳道Idl
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set 泳道Idl
     * @param LaneId 泳道Idl
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    public DeleteLaneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLaneRequest(DeleteLaneRequest source) {
        if (source.LaneId != null) {
            this.LaneId = new String(source.LaneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);

    }
}

