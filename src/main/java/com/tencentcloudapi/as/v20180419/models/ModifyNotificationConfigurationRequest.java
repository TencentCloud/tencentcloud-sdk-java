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

public class ModifyNotificationConfigurationRequest extends AbstractModel {

    /**
    * 待修改的通知ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
    * 通知类型，即为需要订阅的通知类型集合，取值范围如下：
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
    * 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 `TargetType ` 为 `USER_GROUP ` 时生效。
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
    *  TDMQ CMQ 队列名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_QUEUE ` 时生效。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * TDMQ CMQ 主题名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_TOPIC ` 时生效。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 待修改的通知ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。 
     * @return AutoScalingNotificationId 待修改的通知ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set 待修改的通知ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
     * @param AutoScalingNotificationId 待修改的通知ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    /**
     * Get 通知类型，即为需要订阅的通知类型集合，取值范围如下：
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li> 
     * @return NotificationTypes 通知类型，即为需要订阅的通知类型集合，取值范围如下：
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
     * Set 通知类型，即为需要订阅的通知类型集合，取值范围如下：
<li>SCALE_OUT_SUCCESSFUL：扩容成功</li>
<li>SCALE_OUT_FAILED：扩容失败</li>
<li>SCALE_IN_SUCCESSFUL：缩容成功</li>
<li>SCALE_IN_FAILED：缩容失败</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：替换不健康子机成功</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：替换不健康子机失败</li>
     * @param NotificationTypes 通知类型，即为需要订阅的通知类型集合，取值范围如下：
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
     * Get 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 `TargetType ` 为 `USER_GROUP ` 时生效。 
     * @return NotificationUserGroupIds 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 `TargetType ` 为 `USER_GROUP ` 时生效。
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 `TargetType ` 为 `USER_GROUP ` 时生效。
     * @param NotificationUserGroupIds 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 `TargetType ` 为 `USER_GROUP ` 时生效。
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Get  TDMQ CMQ 队列名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_QUEUE ` 时生效。 
     * @return QueueName  TDMQ CMQ 队列名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_QUEUE ` 时生效。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set  TDMQ CMQ 队列名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_QUEUE ` 时生效。
     * @param QueueName  TDMQ CMQ 队列名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_QUEUE ` 时生效。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get TDMQ CMQ 主题名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_TOPIC ` 时生效。 
     * @return TopicName TDMQ CMQ 主题名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_TOPIC ` 时生效。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TDMQ CMQ 主题名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_TOPIC ` 时生效。
     * @param TopicName TDMQ CMQ 主题名。[原CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。该参数仅在 `TargetType ` 为 `TDMQ_CMQ_TOPIC ` 时生效。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public ModifyNotificationConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotificationConfigurationRequest(ModifyNotificationConfigurationRequest source) {
        if (source.AutoScalingNotificationId != null) {
            this.AutoScalingNotificationId = new String(source.AutoScalingNotificationId);
        }
        if (source.NotificationTypes != null) {
            this.NotificationTypes = new String[source.NotificationTypes.length];
            for (int i = 0; i < source.NotificationTypes.length; i++) {
                this.NotificationTypes[i] = new String(source.NotificationTypes[i]);
            }
        }
        if (source.NotificationUserGroupIds != null) {
            this.NotificationUserGroupIds = new String[source.NotificationUserGroupIds.length];
            for (int i = 0; i < source.NotificationUserGroupIds.length; i++) {
                this.NotificationUserGroupIds[i] = new String(source.NotificationUserGroupIds[i]);
            }
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
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

