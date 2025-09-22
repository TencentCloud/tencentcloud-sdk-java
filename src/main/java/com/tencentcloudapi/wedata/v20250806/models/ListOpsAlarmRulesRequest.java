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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListOpsAlarmRulesRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分页的页数，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的条数，默认为20，最小值为1、最大值为200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 监控对象类型, 任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * 根据任务id查询告警规则
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 查询配置对应告警类型的告警规则
告警规则监控类型 failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警； projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；
离线集成任务对账告警： reconciliationFailure： 离线对账任务失败告警 reconciliationOvertime： 离线对账任务运行超时告警 reconciliationMismatch： 数据对账任务不一致条数超过阀值告警
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 查询配置了对应告警级别的告警规则
告警级别 1.普通、2.重要、3.紧急
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 查询配置对应告警接收人的告警规则
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 根据告警规则id/规则名称查询对应的告警规则
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 告警规则创建人过滤
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 告警规则创建时间范围起始时间, 格式如2025-08-17 00:00:00
    */
    @SerializedName("CreateTimeFrom")
    @Expose
    private String CreateTimeFrom;

    /**
    * 告警规则创建时间范围结束时间，格式如"2025-08-26 23:59:59"

    */
    @SerializedName("CreateTimeTo")
    @Expose
    private String CreateTimeTo;

    /**
    * 最后更新时间过滤告警规则， 格式如"2025-08-26 00:00:00"

    */
    @SerializedName("UpdateTimeFrom")
    @Expose
    private String UpdateTimeFrom;

    /**
    * 最后更新时间过滤告警规则 格式如： "2025-08-26 23:59:59"

    */
    @SerializedName("UpdateTimeTo")
    @Expose
    private String UpdateTimeTo;

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
     * Get 分页的页数，默认为1 
     * @return PageNumber 分页的页数，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页的页数，默认为1
     * @param PageNumber 分页的页数，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的条数，默认为20，最小值为1、最大值为200 
     * @return PageSize 每页显示的条数，默认为20，最小值为1、最大值为200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的条数，默认为20，最小值为1、最大值为200
     * @param PageSize 每页显示的条数，默认为20，最小值为1、最大值为200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 监控对象类型, 任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警 
     * @return MonitorObjectType 监控对象类型, 任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set 监控对象类型, 任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
     * @param MonitorObjectType 监控对象类型, 任务维度监控： 可按照任务/工作流/项目来配置：1.任务、2.工作流、3.项目（默认为1.任务） 项目维度监控： 项目整体任务波动告警， 7：项目波动监控告警
     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get 根据任务id查询告警规则 
     * @return TaskId 根据任务id查询告警规则
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 根据任务id查询告警规则
     * @param TaskId 根据任务id查询告警规则
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 查询配置对应告警类型的告警规则
告警规则监控类型 failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警； projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；
离线集成任务对账告警： reconciliationFailure： 离线对账任务失败告警 reconciliationOvertime： 离线对账任务运行超时告警 reconciliationMismatch： 数据对账任务不一致条数超过阀值告警 
     * @return AlarmType 查询配置对应告警类型的告警规则
告警规则监控类型 failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警； projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；
离线集成任务对账告警： reconciliationFailure： 离线对账任务失败告警 reconciliationOvertime： 离线对账任务运行超时告警 reconciliationMismatch： 数据对账任务不一致条数超过阀值告警
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 查询配置对应告警类型的告警规则
告警规则监控类型 failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警； projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；
离线集成任务对账告警： reconciliationFailure： 离线对账任务失败告警 reconciliationOvertime： 离线对账任务运行超时告警 reconciliationMismatch： 数据对账任务不一致条数超过阀值告警
     * @param AlarmType 查询配置对应告警类型的告警规则
告警规则监控类型 failure：失败告警 ；overtime：超时告警 success：成功告警; backTrackingOrRerunSuccess: 补录重跑成功告警 backTrackingOrRerunFailure：补录重跑失败告警；
项目波动告警
projectFailureInstanceUpwardFluctuationAlarm： 当天失败实例数向上波动率超过阀值告警； projectSuccessInstanceDownwardFluctuationAlarm：当天成功实例数向下波动率超过阀值告警；
离线集成任务对账告警： reconciliationFailure： 离线对账任务失败告警 reconciliationOvertime： 离线对账任务运行超时告警 reconciliationMismatch： 数据对账任务不一致条数超过阀值告警
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 查询配置了对应告警级别的告警规则
告警级别 1.普通、2.重要、3.紧急 
     * @return AlarmLevel 查询配置了对应告警级别的告警规则
告警级别 1.普通、2.重要、3.紧急
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 查询配置了对应告警级别的告警规则
告警级别 1.普通、2.重要、3.紧急
     * @param AlarmLevel 查询配置了对应告警级别的告警规则
告警级别 1.普通、2.重要、3.紧急
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 查询配置对应告警接收人的告警规则 
     * @return AlarmRecipientId 查询配置对应告警接收人的告警规则
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 查询配置对应告警接收人的告警规则
     * @param AlarmRecipientId 查询配置对应告警接收人的告警规则
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 根据告警规则id/规则名称查询对应的告警规则 
     * @return Keyword 根据告警规则id/规则名称查询对应的告警规则
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 根据告警规则id/规则名称查询对应的告警规则
     * @param Keyword 根据告警规则id/规则名称查询对应的告警规则
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 告警规则创建人过滤 
     * @return CreateUserUin 告警规则创建人过滤
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 告警规则创建人过滤
     * @param CreateUserUin 告警规则创建人过滤
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 告警规则创建时间范围起始时间, 格式如2025-08-17 00:00:00 
     * @return CreateTimeFrom 告警规则创建时间范围起始时间, 格式如2025-08-17 00:00:00
     */
    public String getCreateTimeFrom() {
        return this.CreateTimeFrom;
    }

    /**
     * Set 告警规则创建时间范围起始时间, 格式如2025-08-17 00:00:00
     * @param CreateTimeFrom 告警规则创建时间范围起始时间, 格式如2025-08-17 00:00:00
     */
    public void setCreateTimeFrom(String CreateTimeFrom) {
        this.CreateTimeFrom = CreateTimeFrom;
    }

    /**
     * Get 告警规则创建时间范围结束时间，格式如"2025-08-26 23:59:59"
 
     * @return CreateTimeTo 告警规则创建时间范围结束时间，格式如"2025-08-26 23:59:59"

     */
    public String getCreateTimeTo() {
        return this.CreateTimeTo;
    }

    /**
     * Set 告警规则创建时间范围结束时间，格式如"2025-08-26 23:59:59"

     * @param CreateTimeTo 告警规则创建时间范围结束时间，格式如"2025-08-26 23:59:59"

     */
    public void setCreateTimeTo(String CreateTimeTo) {
        this.CreateTimeTo = CreateTimeTo;
    }

    /**
     * Get 最后更新时间过滤告警规则， 格式如"2025-08-26 00:00:00"
 
     * @return UpdateTimeFrom 最后更新时间过滤告警规则， 格式如"2025-08-26 00:00:00"

     */
    public String getUpdateTimeFrom() {
        return this.UpdateTimeFrom;
    }

    /**
     * Set 最后更新时间过滤告警规则， 格式如"2025-08-26 00:00:00"

     * @param UpdateTimeFrom 最后更新时间过滤告警规则， 格式如"2025-08-26 00:00:00"

     */
    public void setUpdateTimeFrom(String UpdateTimeFrom) {
        this.UpdateTimeFrom = UpdateTimeFrom;
    }

    /**
     * Get 最后更新时间过滤告警规则 格式如： "2025-08-26 23:59:59"
 
     * @return UpdateTimeTo 最后更新时间过滤告警规则 格式如： "2025-08-26 23:59:59"

     */
    public String getUpdateTimeTo() {
        return this.UpdateTimeTo;
    }

    /**
     * Set 最后更新时间过滤告警规则 格式如： "2025-08-26 23:59:59"

     * @param UpdateTimeTo 最后更新时间过滤告警规则 格式如： "2025-08-26 23:59:59"

     */
    public void setUpdateTimeTo(String UpdateTimeTo) {
        this.UpdateTimeTo = UpdateTimeTo;
    }

    public ListOpsAlarmRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOpsAlarmRulesRequest(ListOpsAlarmRulesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateTimeFrom != null) {
            this.CreateTimeFrom = new String(source.CreateTimeFrom);
        }
        if (source.CreateTimeTo != null) {
            this.CreateTimeTo = new String(source.CreateTimeTo);
        }
        if (source.UpdateTimeFrom != null) {
            this.UpdateTimeFrom = new String(source.UpdateTimeFrom);
        }
        if (source.UpdateTimeTo != null) {
            this.UpdateTimeTo = new String(source.UpdateTimeTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateTimeFrom", this.CreateTimeFrom);
        this.setParamSimple(map, prefix + "CreateTimeTo", this.CreateTimeTo);
        this.setParamSimple(map, prefix + "UpdateTimeFrom", this.UpdateTimeFrom);
        this.setParamSimple(map, prefix + "UpdateTimeTo", this.UpdateTimeTo);

    }
}

