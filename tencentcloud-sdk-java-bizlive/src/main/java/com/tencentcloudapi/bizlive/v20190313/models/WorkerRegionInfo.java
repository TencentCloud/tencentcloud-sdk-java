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
package com.tencentcloudapi.bizlive.v20190313.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkerRegionInfo extends AbstractModel{

    /**
    * 该区域空闲机器数量
    */
    @SerializedName("Idle")
    @Expose
    private Long Idle;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 该区域空闲机器数量 
     * @return Idle 该区域空闲机器数量
     */
    public Long getIdle() {
        return this.Idle;
    }

    /**
     * Set 该区域空闲机器数量
     * @param Idle 该区域空闲机器数量
     */
    public void setIdle(Long Idle) {
        this.Idle = Idle;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Idle", this.Idle);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

