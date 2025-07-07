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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonTraceRoute extends AbstractModel {

    /**
    * 轨迹编码
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 轨迹点序列
    */
    @SerializedName("TracePointSet")
    @Expose
    private PersonTracePoint [] TracePointSet;

    /**
     * Get 轨迹编码 
     * @return TraceId 轨迹编码
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set 轨迹编码
     * @param TraceId 轨迹编码
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get 轨迹点序列 
     * @return TracePointSet 轨迹点序列
     */
    public PersonTracePoint [] getTracePointSet() {
        return this.TracePointSet;
    }

    /**
     * Set 轨迹点序列
     * @param TracePointSet 轨迹点序列
     */
    public void setTracePointSet(PersonTracePoint [] TracePointSet) {
        this.TracePointSet = TracePointSet;
    }

    public PersonTraceRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonTraceRoute(PersonTraceRoute source) {
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.TracePointSet != null) {
            this.TracePointSet = new PersonTracePoint[source.TracePointSet.length];
            for (int i = 0; i < source.TracePointSet.length; i++) {
                this.TracePointSet[i] = new PersonTracePoint(source.TracePointSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArrayObj(map, prefix + "TracePointSet.", this.TracePointSet);

    }
}

