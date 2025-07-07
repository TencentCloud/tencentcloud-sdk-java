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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmdPerfInfo extends AbstractModel {

    /**
    * redis命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 监控数据
    */
    @SerializedName("SeriesData")
    @Expose
    private MonitorMetricSeriesData SeriesData;

    /**
     * Get redis命令 
     * @return Command redis命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set redis命令
     * @param Command redis命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 监控数据 
     * @return SeriesData 监控数据
     */
    public MonitorMetricSeriesData getSeriesData() {
        return this.SeriesData;
    }

    /**
     * Set 监控数据
     * @param SeriesData 监控数据
     */
    public void setSeriesData(MonitorMetricSeriesData SeriesData) {
        this.SeriesData = SeriesData;
    }

    public CmdPerfInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmdPerfInfo(CmdPerfInfo source) {
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.SeriesData != null) {
            this.SeriesData = new MonitorMetricSeriesData(source.SeriesData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "SeriesData.", this.SeriesData);

    }
}

