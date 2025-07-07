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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingNotification extends AbstractModel {

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
    * 通知事件列表。取值范围如下:
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li>
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
    * 通知接收端类型。取值范围如下：
USER_GROUP：用户组
TDMQ_CMQ_TOPIC：TDMQ CMQ 主题
TDMQ_CMQ_QUEUE：TDMQ CMQ 队列
CMQ_QUEUE：CMQ 队列，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
CMQ_TOPIC：CMQ 主题，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * TDMQ CMQ 队列名。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * TDMQ CMQ 主题名。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

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
     * Get 通知事件列表。取值范围如下:
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li> 
     * @return NotificationTypes 通知事件列表。取值范围如下:
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li>
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set 通知事件列表。取值范围如下:
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li>
     * @param NotificationTypes 通知事件列表。取值范围如下:
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li>
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
     * Get 通知接收端类型。取值范围如下：
USER_GROUP：用户组
TDMQ_CMQ_TOPIC：TDMQ CMQ 主题
TDMQ_CMQ_QUEUE：TDMQ CMQ 队列
CMQ_QUEUE：CMQ 队列，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
CMQ_TOPIC：CMQ 主题，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用 
     * @return TargetType 通知接收端类型。取值范围如下：
USER_GROUP：用户组
TDMQ_CMQ_TOPIC：TDMQ CMQ 主题
TDMQ_CMQ_QUEUE：TDMQ CMQ 队列
CMQ_QUEUE：CMQ 队列，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
CMQ_TOPIC：CMQ 主题，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 通知接收端类型。取值范围如下：
USER_GROUP：用户组
TDMQ_CMQ_TOPIC：TDMQ CMQ 主题
TDMQ_CMQ_QUEUE：TDMQ CMQ 队列
CMQ_QUEUE：CMQ 队列，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
CMQ_TOPIC：CMQ 主题，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
     * @param TargetType 通知接收端类型。取值范围如下：
USER_GROUP：用户组
TDMQ_CMQ_TOPIC：TDMQ CMQ 主题
TDMQ_CMQ_QUEUE：TDMQ CMQ 队列
CMQ_QUEUE：CMQ 队列，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
CMQ_TOPIC：CMQ 主题，[CMQ 接口已下线](https://cloud.tencent.com/document/product/1496/83970)，已无法选用
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get TDMQ CMQ 队列名。 
     * @return QueueName TDMQ CMQ 队列名。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set TDMQ CMQ 队列名。
     * @param QueueName TDMQ CMQ 队列名。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get TDMQ CMQ 主题名。 
     * @return TopicName TDMQ CMQ 主题名。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TDMQ CMQ 主题名。
     * @param TopicName TDMQ CMQ 主题名。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public AutoScalingNotification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingNotification(AutoScalingNotification source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.NotificationUserGroupIds != null) {
            this.NotificationUserGroupIds = new String[source.NotificationUserGroupIds.length];
            for (int i = 0; i < source.NotificationUserGroupIds.length; i++) {
                this.NotificationUserGroupIds[i] = new String(source.NotificationUserGroupIds[i]);
            }
        }
        if (source.NotificationTypes != null) {
            this.NotificationTypes = new String[source.NotificationTypes.length];
            for (int i = 0; i < source.NotificationTypes.length; i++) {
                this.NotificationTypes[i] = new String(source.NotificationTypes[i]);
            }
        }
        if (source.AutoScalingNotificationId != null) {
            this.AutoScalingNotificationId = new String(source.AutoScalingNotificationId);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

