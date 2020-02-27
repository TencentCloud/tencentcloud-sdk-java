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

public class AgentGroup extends AbstractModel{

    /**
    * 拨测分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 拨测分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 是否默认拨测分组。1表示是，0表示否
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 使用本拨测分组的任务数
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * 拨测结点列表
    */
    @SerializedName("GroupDetail")
    @Expose
    private CatAgent [] GroupDetail;

    /**
    * 最大拨测分组数
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
     * Get 拨测分组ID 
     * @return GroupId 拨测分组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 拨测分组ID
     * @param GroupId 拨测分组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 拨测分组名称 
     * @return GroupName 拨测分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 拨测分组名称
     * @param GroupName 拨测分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 是否默认拨测分组。1表示是，0表示否 
     * @return IsDefault 是否默认拨测分组。1表示是，0表示否
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认拨测分组。1表示是，0表示否
     * @param IsDefault 是否默认拨测分组。1表示是，0表示否
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 使用本拨测分组的任务数 
     * @return TaskNum 使用本拨测分组的任务数
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set 使用本拨测分组的任务数
     * @param TaskNum 使用本拨测分组的任务数
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get 拨测结点列表 
     * @return GroupDetail 拨测结点列表
     */
    public CatAgent [] getGroupDetail() {
        return this.GroupDetail;
    }

    /**
     * Set 拨测结点列表
     * @param GroupDetail 拨测结点列表
     */
    public void setGroupDetail(CatAgent [] GroupDetail) {
        this.GroupDetail = GroupDetail;
    }

    /**
     * Get 最大拨测分组数 
     * @return MaxGroupNum 最大拨测分组数
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set 最大拨测分组数
     * @param MaxGroupNum 最大拨测分组数
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamArrayObj(map, prefix + "GroupDetail.", this.GroupDetail);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);

    }
}

