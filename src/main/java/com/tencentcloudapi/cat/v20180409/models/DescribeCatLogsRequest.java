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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCatLogsRequest extends AbstractModel{

    /**
    * 拨测任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 从第Offset 条开始查询。缺省值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本批次查询Limit 条记录。缺省值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 格式如：2017-05-09 00:00:00  缺省为当天0点，最多拉取1天的数据
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 格式如：2017-05-10 00:00:00  缺省为当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 按时间升序或降序。默认降序。可选值： Desc, Asc
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
     * Get 拨测任务Id 
     * @return TaskId 拨测任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 拨测任务Id
     * @param TaskId 拨测任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 从第Offset 条开始查询。缺省值为0 
     * @return Offset 从第Offset 条开始查询。缺省值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 从第Offset 条开始查询。缺省值为0
     * @param Offset 从第Offset 条开始查询。缺省值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本批次查询Limit 条记录。缺省值为20 
     * @return Limit 本批次查询Limit 条记录。缺省值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本批次查询Limit 条记录。缺省值为20
     * @param Limit 本批次查询Limit 条记录。缺省值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 格式如：2017-05-09 00:00:00  缺省为当天0点，最多拉取1天的数据 
     * @return BeginTime 格式如：2017-05-09 00:00:00  缺省为当天0点，最多拉取1天的数据
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 格式如：2017-05-09 00:00:00  缺省为当天0点，最多拉取1天的数据
     * @param BeginTime 格式如：2017-05-09 00:00:00  缺省为当天0点，最多拉取1天的数据
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 格式如：2017-05-10 00:00:00  缺省为当前时间 
     * @return EndTime 格式如：2017-05-10 00:00:00  缺省为当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 格式如：2017-05-10 00:00:00  缺省为当前时间
     * @param EndTime 格式如：2017-05-10 00:00:00  缺省为当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 按时间升序或降序。默认降序。可选值： Desc, Asc 
     * @return SortType 按时间升序或降序。默认降序。可选值： Desc, Asc
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 按时间升序或降序。默认降序。可选值： Desc, Asc
     * @param SortType 按时间升序或降序。默认降序。可选值： Desc, Asc
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

