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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppStatisticsResponse extends AbstractModel{

    /**
    * 应用用量统计数据
    */
    @SerializedName("AppStatistics")
    @Expose
    private AppStatisticsItem [] AppStatistics;

    /**
     * Get 应用用量统计数据 
     * @return AppStatistics 应用用量统计数据
     */
    public AppStatisticsItem [] getAppStatistics() {
        return this.AppStatistics;
    }

    /**
     * Set 应用用量统计数据
     * @param AppStatistics 应用用量统计数据
     */
    public void setAppStatistics(AppStatisticsItem [] AppStatistics) {
        this.AppStatistics = AppStatistics;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AppStatistics.", this.AppStatistics);

    }
}

