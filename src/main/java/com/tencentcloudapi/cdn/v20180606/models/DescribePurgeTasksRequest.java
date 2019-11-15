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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeTasksRequest  extends AbstractModel{

    /**
    * 指定刷新类型查询
url：url 刷新记录
path：目录刷新记录
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * 根据时间区间查询时，填充开始时间，如 2018-08-08 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 根据时间区间查询时，填充结束时间，如 2018-08-08 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 根据任务 ID 查询时，填充任务 ID
查询时任务 ID 与起始时间必须填充一项
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 分页查询偏移量，默认为 0 （第一页）
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页查询限制数目，默认为 20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 支持域名过滤，或 http(s):// 开头完整 URL 过滤
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 指定任务状态查询
fail：刷新失败
done：刷新成功
process：刷新中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 指定刷新地域查询
mainland：境内
overseas：境外
global：全球
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * 获取指定刷新类型查询
url：url 刷新记录
path：目录刷新记录
     * @return PurgeType 指定刷新类型查询
url：url 刷新记录
path：目录刷新记录
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * 设置指定刷新类型查询
url：url 刷新记录
path：目录刷新记录
     * @param PurgeType 指定刷新类型查询
url：url 刷新记录
path：目录刷新记录
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * 获取根据时间区间查询时，填充开始时间，如 2018-08-08 00:00:00
     * @return StartTime 根据时间区间查询时，填充开始时间，如 2018-08-08 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置根据时间区间查询时，填充开始时间，如 2018-08-08 00:00:00
     * @param StartTime 根据时间区间查询时，填充开始时间，如 2018-08-08 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取根据时间区间查询时，填充结束时间，如 2018-08-08 23:59:59
     * @return EndTime 根据时间区间查询时，填充结束时间，如 2018-08-08 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置根据时间区间查询时，填充结束时间，如 2018-08-08 23:59:59
     * @param EndTime 根据时间区间查询时，填充结束时间，如 2018-08-08 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取根据任务 ID 查询时，填充任务 ID
查询时任务 ID 与起始时间必须填充一项
     * @return TaskId 根据任务 ID 查询时，填充任务 ID
查询时任务 ID 与起始时间必须填充一项
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置根据任务 ID 查询时，填充任务 ID
查询时任务 ID 与起始时间必须填充一项
     * @param TaskId 根据任务 ID 查询时，填充任务 ID
查询时任务 ID 与起始时间必须填充一项
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取分页查询偏移量，默认为 0 （第一页）
     * @return Offset 分页查询偏移量，默认为 0 （第一页）
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页查询偏移量，默认为 0 （第一页）
     * @param Offset 分页查询偏移量，默认为 0 （第一页）
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页查询限制数目，默认为 20
     * @return Limit 分页查询限制数目，默认为 20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页查询限制数目，默认为 20
     * @param Limit 分页查询限制数目，默认为 20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取支持域名过滤，或 http(s):// 开头完整 URL 过滤
     * @return Keyword 支持域名过滤，或 http(s):// 开头完整 URL 过滤
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * 设置支持域名过滤，或 http(s):// 开头完整 URL 过滤
     * @param Keyword 支持域名过滤，或 http(s):// 开头完整 URL 过滤
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * 获取指定任务状态查询
fail：刷新失败
done：刷新成功
process：刷新中
     * @return Status 指定任务状态查询
fail：刷新失败
done：刷新成功
process：刷新中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置指定任务状态查询
fail：刷新失败
done：刷新成功
process：刷新中
     * @param Status 指定任务状态查询
fail：刷新失败
done：刷新成功
process：刷新中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取指定刷新地域查询
mainland：境内
overseas：境外
global：全球
     * @return Area 指定刷新地域查询
mainland：境内
overseas：境外
global：全球
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * 设置指定刷新地域查询
mainland：境内
overseas：境外
global：全球
     * @param Area 指定刷新地域查询
mainland：境内
overseas：境外
global：全球
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

