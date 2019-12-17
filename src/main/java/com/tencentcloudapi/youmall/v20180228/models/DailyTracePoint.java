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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DailyTracePoint extends AbstractModel{

    /**
    * 轨迹日期
    */
    @SerializedName("TraceDate")
    @Expose
    private String TraceDate;

    /**
    * 轨迹点序列
    */
    @SerializedName("TracePointSet")
    @Expose
    private PersonTracePoint [] TracePointSet;

    /**
     * Get 轨迹日期 
     * @return TraceDate 轨迹日期
     */
    public String getTraceDate() {
        return this.TraceDate;
    }

    /**
     * Set 轨迹日期
     * @param TraceDate 轨迹日期
     */
    public void setTraceDate(String TraceDate) {
        this.TraceDate = TraceDate;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceDate", this.TraceDate);
        this.setParamArrayObj(map, prefix + "TracePointSet.", this.TracePointSet);

    }
}

