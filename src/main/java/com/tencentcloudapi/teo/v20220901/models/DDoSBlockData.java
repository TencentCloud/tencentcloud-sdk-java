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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSBlockData extends AbstractModel{

    /**
    * 开始时间，采用unix时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，采用unix时间戳, 为0表示还处于封禁中。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 封禁受影响区域。
    */
    @SerializedName("BlockArea")
    @Expose
    private String BlockArea;

    /**
     * Get 开始时间，采用unix时间戳。 
     * @return StartTime 开始时间，采用unix时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，采用unix时间戳。
     * @param StartTime 开始时间，采用unix时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，采用unix时间戳, 为0表示还处于封禁中。 
     * @return EndTime 结束时间，采用unix时间戳, 为0表示还处于封禁中。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，采用unix时间戳, 为0表示还处于封禁中。
     * @param EndTime 结束时间，采用unix时间戳, 为0表示还处于封禁中。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 封禁受影响区域。 
     * @return BlockArea 封禁受影响区域。
     */
    public String getBlockArea() {
        return this.BlockArea;
    }

    /**
     * Set 封禁受影响区域。
     * @param BlockArea 封禁受影响区域。
     */
    public void setBlockArea(String BlockArea) {
        this.BlockArea = BlockArea;
    }

    public DDoSBlockData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSBlockData(DDoSBlockData source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.BlockArea != null) {
            this.BlockArea = new String(source.BlockArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BlockArea", this.BlockArea);

    }
}

