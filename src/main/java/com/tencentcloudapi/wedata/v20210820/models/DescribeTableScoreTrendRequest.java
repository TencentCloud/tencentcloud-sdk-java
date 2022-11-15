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

public class DescribeTableScoreTrendRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 开始时间 秒级时间戳
    */
    @SerializedName("StatisticsStartDate")
    @Expose
    private Long StatisticsStartDate;

    /**
    * 结束时间 秒级时间戳
    */
    @SerializedName("StatisticsEndDate")
    @Expose
    private Long StatisticsEndDate;

    /**
    * 表id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 开始时间 秒级时间戳 
     * @return StatisticsStartDate 开始时间 秒级时间戳
     */
    public Long getStatisticsStartDate() {
        return this.StatisticsStartDate;
    }

    /**
     * Set 开始时间 秒级时间戳
     * @param StatisticsStartDate 开始时间 秒级时间戳
     */
    public void setStatisticsStartDate(Long StatisticsStartDate) {
        this.StatisticsStartDate = StatisticsStartDate;
    }

    /**
     * Get 结束时间 秒级时间戳 
     * @return StatisticsEndDate 结束时间 秒级时间戳
     */
    public Long getStatisticsEndDate() {
        return this.StatisticsEndDate;
    }

    /**
     * Set 结束时间 秒级时间戳
     * @param StatisticsEndDate 结束时间 秒级时间戳
     */
    public void setStatisticsEndDate(Long StatisticsEndDate) {
        this.StatisticsEndDate = StatisticsEndDate;
    }

    /**
     * Get 表id 
     * @return TableId 表id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表id
     * @param TableId 表id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    public DescribeTableScoreTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableScoreTrendRequest(DescribeTableScoreTrendRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.StatisticsStartDate != null) {
            this.StatisticsStartDate = new Long(source.StatisticsStartDate);
        }
        if (source.StatisticsEndDate != null) {
            this.StatisticsEndDate = new Long(source.StatisticsEndDate);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StatisticsStartDate", this.StatisticsStartDate);
        this.setParamSimple(map, prefix + "StatisticsEndDate", this.StatisticsEndDate);
        this.setParamSimple(map, prefix + "TableId", this.TableId);

    }
}

