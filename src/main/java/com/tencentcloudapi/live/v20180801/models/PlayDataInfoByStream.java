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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayDataInfoByStream extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 总流量，单位: MB。
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 总流量，单位: MB。 
     * @return TotalFlux 总流量，单位: MB。
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set 总流量，单位: MB。
     * @param TotalFlux 总流量，单位: MB。
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);

    }
}

