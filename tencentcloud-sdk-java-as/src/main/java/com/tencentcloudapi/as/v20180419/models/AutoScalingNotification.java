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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingNotification extends AbstractModel{

    /**
    * 伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 用户组ID列表。
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
    * 通知事件列表。
    */
    @SerializedName("NotificationTypes")
    @Expose
    private String [] NotificationTypes;

    /**
    * 事件通知ID。
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
     * Get 伸缩组ID。 
     * @return AutoScalingGroupId 伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 用户组ID列表。 
     * @return NotificationUserGroupIds 用户组ID列表。
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set 用户组ID列表。
     * @param NotificationUserGroupIds 用户组ID列表。
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Get 通知事件列表。 
     * @return NotificationTypes 通知事件列表。
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set 通知事件列表。
     * @param NotificationTypes 通知事件列表。
     */
    public void setNotificationTypes(String [] NotificationTypes) {
        this.NotificationTypes = NotificationTypes;
    }

    /**
     * Get 事件通知ID。 
     * @return AutoScalingNotificationId 事件通知ID。
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set 事件通知ID。
     * @param AutoScalingNotificationId 事件通知ID。
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);

    }
}

