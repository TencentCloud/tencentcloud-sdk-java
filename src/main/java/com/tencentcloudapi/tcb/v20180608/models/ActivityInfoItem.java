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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityInfoItem extends AbstractModel{

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 记录插入时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 记录最后一次变更时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 活动开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 活动结束时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 自定义备注信息
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 活动id 
     * @return ActivityId 活动id
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
     * @param ActivityId 活动id
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 记录插入时间 
     * @return CreateTime 记录插入时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 记录插入时间
     * @param CreateTime 记录插入时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 记录最后一次变更时间 
     * @return UpdateTime 记录最后一次变更时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 记录最后一次变更时间
     * @param UpdateTime 记录最后一次变更时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 活动开始时间 
     * @return StartTime 活动开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 活动开始时间
     * @param StartTime 活动开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 活动结束时间 
     * @return ExpireTime 活动结束时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 活动结束时间
     * @param ExpireTime 活动结束时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 自定义备注信息 
     * @return Tag 自定义备注信息
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 自定义备注信息
     * @param Tag 自定义备注信息
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public ActivityInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityInfoItem(ActivityInfoItem source) {
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

