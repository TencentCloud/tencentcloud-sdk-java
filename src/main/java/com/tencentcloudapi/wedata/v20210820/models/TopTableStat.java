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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopTableStat extends AbstractModel{

    /**
    * 告警表列表
    */
    @SerializedName("AlarmTables")
    @Expose
    private TopTableStatItem [] AlarmTables;

    /**
    * 阻塞表列表
    */
    @SerializedName("PipelineTables")
    @Expose
    private TopTableStatItem [] PipelineTables;

    /**
     * Get 告警表列表 
     * @return AlarmTables 告警表列表
     */
    public TopTableStatItem [] getAlarmTables() {
        return this.AlarmTables;
    }

    /**
     * Set 告警表列表
     * @param AlarmTables 告警表列表
     */
    public void setAlarmTables(TopTableStatItem [] AlarmTables) {
        this.AlarmTables = AlarmTables;
    }

    /**
     * Get 阻塞表列表 
     * @return PipelineTables 阻塞表列表
     */
    public TopTableStatItem [] getPipelineTables() {
        return this.PipelineTables;
    }

    /**
     * Set 阻塞表列表
     * @param PipelineTables 阻塞表列表
     */
    public void setPipelineTables(TopTableStatItem [] PipelineTables) {
        this.PipelineTables = PipelineTables;
    }

    public TopTableStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopTableStat(TopTableStat source) {
        if (source.AlarmTables != null) {
            this.AlarmTables = new TopTableStatItem[source.AlarmTables.length];
            for (int i = 0; i < source.AlarmTables.length; i++) {
                this.AlarmTables[i] = new TopTableStatItem(source.AlarmTables[i]);
            }
        }
        if (source.PipelineTables != null) {
            this.PipelineTables = new TopTableStatItem[source.PipelineTables.length];
            for (int i = 0; i < source.PipelineTables.length; i++) {
                this.PipelineTables[i] = new TopTableStatItem(source.PipelineTables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmTables.", this.AlarmTables);
        this.setParamArrayObj(map, prefix + "PipelineTables.", this.PipelineTables);

    }
}

