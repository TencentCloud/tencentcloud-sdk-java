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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityRecordItem extends AbstractModel {

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 自定义状态码
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 自定义子状态码
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

    /**
    * 整型子状态码
    */
    @SerializedName("SubStatusInt")
    @Expose
    private Long SubStatusInt;

    /**
    * 是否软删除
    */
    @SerializedName("IsDeleted")
    @Expose
    private Boolean IsDeleted;

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

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
     * Get 自定义状态码 
     * @return Status 自定义状态码
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 自定义状态码
     * @param Status 自定义状态码
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 自定义子状态码 
     * @return SubStatus 自定义子状态码
     */
    public String getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 自定义子状态码
     * @param SubStatus 自定义子状态码
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 整型子状态码 
     * @return SubStatusInt 整型子状态码
     */
    public Long getSubStatusInt() {
        return this.SubStatusInt;
    }

    /**
     * Set 整型子状态码
     * @param SubStatusInt 整型子状态码
     */
    public void setSubStatusInt(Long SubStatusInt) {
        this.SubStatusInt = SubStatusInt;
    }

    /**
     * Get 是否软删除 
     * @return IsDeleted 是否软删除
     */
    public Boolean getIsDeleted() {
        return this.IsDeleted;
    }

    /**
     * Set 是否软删除
     * @param IsDeleted 是否软删除
     */
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public ActivityRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityRecordItem(ActivityRecordItem source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new String(source.SubStatus);
        }
        if (source.SubStatusInt != null) {
            this.SubStatusInt = new Long(source.SubStatusInt);
        }
        if (source.IsDeleted != null) {
            this.IsDeleted = new Boolean(source.IsDeleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "SubStatusInt", this.SubStatusInt);
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);

    }
}

