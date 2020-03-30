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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceInfo extends AbstractModel{

    /**
    * 人体轨迹ID。
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 包含的人体轨迹图片Id列表。
    */
    @SerializedName("BodyIds")
    @Expose
    private String [] BodyIds;

    /**
     * Get 人体轨迹ID。 
     * @return TraceId 人体轨迹ID。
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set 人体轨迹ID。
     * @param TraceId 人体轨迹ID。
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get 包含的人体轨迹图片Id列表。 
     * @return BodyIds 包含的人体轨迹图片Id列表。
     */
    public String [] getBodyIds() {
        return this.BodyIds;
    }

    /**
     * Set 包含的人体轨迹图片Id列表。
     * @param BodyIds 包含的人体轨迹图片Id列表。
     */
    public void setBodyIds(String [] BodyIds) {
        this.BodyIds = BodyIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArraySimple(map, prefix + "BodyIds.", this.BodyIds);

    }
}

