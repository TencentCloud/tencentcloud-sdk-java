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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmListRequest extends AbstractModel {

    /**
    * 告警开始时间，必填,时间戳秒
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 告警结束时间，必填，时间戳秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页查询，第几页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 告警状态
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * 告警类型
    */
    @SerializedName("AlarmTypeSet")
    @Expose
    private AlarmTypeInfo [] AlarmTypeSet;

    /**
    * 告警级别id
    */
    @SerializedName("LevelSet")
    @Expose
    private Long [] LevelSet;

    /**
    * 告警id
    */
    @SerializedName("IdSet")
    @Expose
    private String [] IdSet;

    /**
    * 应用id
    */
    @SerializedName("AppIdSet")
    @Expose
    private Long [] AppIdSet;

    /**
    * 设备id
    */
    @SerializedName("WIDSet")
    @Expose
    private String [] WIDSet;

    /**
    * 空间层级
    */
    @SerializedName("SpaceCodeSet")
    @Expose
    private String [] SpaceCodeSet;

    /**
    * 应用扩展字段1
    */
    @SerializedName("ExtendOne")
    @Expose
    private String [] ExtendOne;

    /**
    * 应用扩展字段2
    */
    @SerializedName("ExtendTwo")
    @Expose
    private String [] ExtendTwo;

    /**
    * 当前告警处理人，填孪生中台的用户id
    */
    @SerializedName("ProcessorSet")
    @Expose
    private String [] ProcessorSet;

    /**
    * 分组id
    */
    @SerializedName("GroupIdSet")
    @Expose
    private Long [] GroupIdSet;

    /**
     * Get 告警开始时间，必填,时间戳秒 
     * @return BeginTime 告警开始时间，必填,时间戳秒
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 告警开始时间，必填,时间戳秒
     * @param BeginTime 告警开始时间，必填,时间戳秒
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 告警结束时间，必填，时间戳秒 
     * @return EndTime 告警结束时间，必填，时间戳秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 告警结束时间，必填，时间戳秒
     * @param EndTime 告警结束时间，必填，时间戳秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页查询，第几页 
     * @return PageNumber 分页查询，第几页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页查询，第几页
     * @param PageNumber 分页查询，第几页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页条数 
     * @return PageSize 每页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数
     * @param PageSize 每页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 告警状态 
     * @return Statuses 告警状态
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 告警状态
     * @param Statuses 告警状态
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get 告警类型 
     * @return AlarmTypeSet 告警类型
     */
    public AlarmTypeInfo [] getAlarmTypeSet() {
        return this.AlarmTypeSet;
    }

    /**
     * Set 告警类型
     * @param AlarmTypeSet 告警类型
     */
    public void setAlarmTypeSet(AlarmTypeInfo [] AlarmTypeSet) {
        this.AlarmTypeSet = AlarmTypeSet;
    }

    /**
     * Get 告警级别id 
     * @return LevelSet 告警级别id
     */
    public Long [] getLevelSet() {
        return this.LevelSet;
    }

    /**
     * Set 告警级别id
     * @param LevelSet 告警级别id
     */
    public void setLevelSet(Long [] LevelSet) {
        this.LevelSet = LevelSet;
    }

    /**
     * Get 告警id 
     * @return IdSet 告警id
     */
    public String [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 告警id
     * @param IdSet 告警id
     */
    public void setIdSet(String [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 应用id 
     * @return AppIdSet 应用id
     */
    public Long [] getAppIdSet() {
        return this.AppIdSet;
    }

    /**
     * Set 应用id
     * @param AppIdSet 应用id
     */
    public void setAppIdSet(Long [] AppIdSet) {
        this.AppIdSet = AppIdSet;
    }

    /**
     * Get 设备id 
     * @return WIDSet 设备id
     */
    public String [] getWIDSet() {
        return this.WIDSet;
    }

    /**
     * Set 设备id
     * @param WIDSet 设备id
     */
    public void setWIDSet(String [] WIDSet) {
        this.WIDSet = WIDSet;
    }

    /**
     * Get 空间层级 
     * @return SpaceCodeSet 空间层级
     */
    public String [] getSpaceCodeSet() {
        return this.SpaceCodeSet;
    }

    /**
     * Set 空间层级
     * @param SpaceCodeSet 空间层级
     */
    public void setSpaceCodeSet(String [] SpaceCodeSet) {
        this.SpaceCodeSet = SpaceCodeSet;
    }

    /**
     * Get 应用扩展字段1 
     * @return ExtendOne 应用扩展字段1
     */
    public String [] getExtendOne() {
        return this.ExtendOne;
    }

    /**
     * Set 应用扩展字段1
     * @param ExtendOne 应用扩展字段1
     */
    public void setExtendOne(String [] ExtendOne) {
        this.ExtendOne = ExtendOne;
    }

    /**
     * Get 应用扩展字段2 
     * @return ExtendTwo 应用扩展字段2
     */
    public String [] getExtendTwo() {
        return this.ExtendTwo;
    }

    /**
     * Set 应用扩展字段2
     * @param ExtendTwo 应用扩展字段2
     */
    public void setExtendTwo(String [] ExtendTwo) {
        this.ExtendTwo = ExtendTwo;
    }

    /**
     * Get 当前告警处理人，填孪生中台的用户id 
     * @return ProcessorSet 当前告警处理人，填孪生中台的用户id
     */
    public String [] getProcessorSet() {
        return this.ProcessorSet;
    }

    /**
     * Set 当前告警处理人，填孪生中台的用户id
     * @param ProcessorSet 当前告警处理人，填孪生中台的用户id
     */
    public void setProcessorSet(String [] ProcessorSet) {
        this.ProcessorSet = ProcessorSet;
    }

    /**
     * Get 分组id 
     * @return GroupIdSet 分组id
     */
    public Long [] getGroupIdSet() {
        return this.GroupIdSet;
    }

    /**
     * Set 分组id
     * @param GroupIdSet 分组id
     */
    public void setGroupIdSet(Long [] GroupIdSet) {
        this.GroupIdSet = GroupIdSet;
    }

    public DescribeAlarmListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmListRequest(DescribeAlarmListRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
            }
        }
        if (source.AlarmTypeSet != null) {
            this.AlarmTypeSet = new AlarmTypeInfo[source.AlarmTypeSet.length];
            for (int i = 0; i < source.AlarmTypeSet.length; i++) {
                this.AlarmTypeSet[i] = new AlarmTypeInfo(source.AlarmTypeSet[i]);
            }
        }
        if (source.LevelSet != null) {
            this.LevelSet = new Long[source.LevelSet.length];
            for (int i = 0; i < source.LevelSet.length; i++) {
                this.LevelSet[i] = new Long(source.LevelSet[i]);
            }
        }
        if (source.IdSet != null) {
            this.IdSet = new String[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new String(source.IdSet[i]);
            }
        }
        if (source.AppIdSet != null) {
            this.AppIdSet = new Long[source.AppIdSet.length];
            for (int i = 0; i < source.AppIdSet.length; i++) {
                this.AppIdSet[i] = new Long(source.AppIdSet[i]);
            }
        }
        if (source.WIDSet != null) {
            this.WIDSet = new String[source.WIDSet.length];
            for (int i = 0; i < source.WIDSet.length; i++) {
                this.WIDSet[i] = new String(source.WIDSet[i]);
            }
        }
        if (source.SpaceCodeSet != null) {
            this.SpaceCodeSet = new String[source.SpaceCodeSet.length];
            for (int i = 0; i < source.SpaceCodeSet.length; i++) {
                this.SpaceCodeSet[i] = new String(source.SpaceCodeSet[i]);
            }
        }
        if (source.ExtendOne != null) {
            this.ExtendOne = new String[source.ExtendOne.length];
            for (int i = 0; i < source.ExtendOne.length; i++) {
                this.ExtendOne[i] = new String(source.ExtendOne[i]);
            }
        }
        if (source.ExtendTwo != null) {
            this.ExtendTwo = new String[source.ExtendTwo.length];
            for (int i = 0; i < source.ExtendTwo.length; i++) {
                this.ExtendTwo[i] = new String(source.ExtendTwo[i]);
            }
        }
        if (source.ProcessorSet != null) {
            this.ProcessorSet = new String[source.ProcessorSet.length];
            for (int i = 0; i < source.ProcessorSet.length; i++) {
                this.ProcessorSet[i] = new String(source.ProcessorSet[i]);
            }
        }
        if (source.GroupIdSet != null) {
            this.GroupIdSet = new Long[source.GroupIdSet.length];
            for (int i = 0; i < source.GroupIdSet.length; i++) {
                this.GroupIdSet[i] = new Long(source.GroupIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamArrayObj(map, prefix + "AlarmTypeSet.", this.AlarmTypeSet);
        this.setParamArraySimple(map, prefix + "LevelSet.", this.LevelSet);
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamArraySimple(map, prefix + "AppIdSet.", this.AppIdSet);
        this.setParamArraySimple(map, prefix + "WIDSet.", this.WIDSet);
        this.setParamArraySimple(map, prefix + "SpaceCodeSet.", this.SpaceCodeSet);
        this.setParamArraySimple(map, prefix + "ExtendOne.", this.ExtendOne);
        this.setParamArraySimple(map, prefix + "ExtendTwo.", this.ExtendTwo);
        this.setParamArraySimple(map, prefix + "ProcessorSet.", this.ProcessorSet);
        this.setParamArraySimple(map, prefix + "GroupIdSet.", this.GroupIdSet);

    }
}

