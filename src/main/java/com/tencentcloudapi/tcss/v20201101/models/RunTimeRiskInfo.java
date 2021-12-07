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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunTimeRiskInfo extends AbstractModel{

    /**
    * 数量
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
    * 风险等级：
CRITICAL: 严重
HIGH: 高
MEDIUM：中
LOW: 低
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
     * Get 数量 
     * @return Cnt 数量
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set 数量
     * @param Cnt 数量
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    /**
     * Get 风险等级：
CRITICAL: 严重
HIGH: 高
MEDIUM：中
LOW: 低 
     * @return Level 风险等级：
CRITICAL: 严重
HIGH: 高
MEDIUM：中
LOW: 低
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级：
CRITICAL: 严重
HIGH: 高
MEDIUM：中
LOW: 低
     * @param Level 风险等级：
CRITICAL: 严重
HIGH: 高
MEDIUM：中
LOW: 低
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    public RunTimeRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunTimeRiskInfo(RunTimeRiskInfo source) {
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

