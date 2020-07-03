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

public class DescribeAlarmsRequest extends AbstractModel{

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
    * 0 全部, 1 已恢复, 2 未恢复  默认为0。其他值，视为0 查全部状态。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 格式如：2017-05-09 00:00:00  缺省为7天前0点
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 格式如：2017-05-10 00:00:00  缺省为明天0点
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 告警任务名
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * 排序字段，可为Time, ObjName, Duration, Status, Content 之一。缺省为Time。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 升序或降序。可为Desc, Asc之一。缺省为Desc。
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

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
     * Get 0 全部, 1 已恢复, 2 未恢复  默认为0。其他值，视为0 查全部状态。 
     * @return Status 0 全部, 1 已恢复, 2 未恢复  默认为0。其他值，视为0 查全部状态。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 全部, 1 已恢复, 2 未恢复  默认为0。其他值，视为0 查全部状态。
     * @param Status 0 全部, 1 已恢复, 2 未恢复  默认为0。其他值，视为0 查全部状态。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 格式如：2017-05-09 00:00:00  缺省为7天前0点 
     * @return BeginTime 格式如：2017-05-09 00:00:00  缺省为7天前0点
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 格式如：2017-05-09 00:00:00  缺省为7天前0点
     * @param BeginTime 格式如：2017-05-09 00:00:00  缺省为7天前0点
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 格式如：2017-05-10 00:00:00  缺省为明天0点 
     * @return EndTime 格式如：2017-05-10 00:00:00  缺省为明天0点
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 格式如：2017-05-10 00:00:00  缺省为明天0点
     * @param EndTime 格式如：2017-05-10 00:00:00  缺省为明天0点
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 告警任务名 
     * @return ObjName 告警任务名
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set 告警任务名
     * @param ObjName 告警任务名
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get 排序字段，可为Time, ObjName, Duration, Status, Content 之一。缺省为Time。 
     * @return SortBy 排序字段，可为Time, ObjName, Duration, Status, Content 之一。缺省为Time。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段，可为Time, ObjName, Duration, Status, Content 之一。缺省为Time。
     * @param SortBy 排序字段，可为Time, ObjName, Duration, Status, Content 之一。缺省为Time。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 升序或降序。可为Desc, Asc之一。缺省为Desc。 
     * @return SortType 升序或降序。可为Desc, Asc之一。缺省为Desc。
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 升序或降序。可为Desc, Asc之一。缺省为Desc。
     * @param SortType 升序或降序。可为Desc, Asc之一。缺省为Desc。
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ObjName", this.ObjName);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

