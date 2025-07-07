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

public class CreateNotificationConfigurationRequest extends AbstractModel {

    /**
    * 伸缩组ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

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
    * 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 TargetType 为 USER_GROUP 时生效。
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
    * 通知接收端类型，取值如下：
<li>USER_GROUP：用户组</li>
<li>TDMQ_CMQ_TOPIC：TDMQ CMQ 主题</li>
<li>TDMQ_CMQ_QUEUE：TDMQ CMQ 队列</li>
<li>CMQ_QUEUE：CMQ 队列，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>
<li>CMQ_TOPIC：CMQ 主题，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>

默认值为：`USER_GROUP`。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * TDMQ CMQ 队列名，如 TargetType 取值为 `TDMQ_CMQ_QUEUE` ，该字段必填。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * TDMQ CMQ 主题名，如 TargetType 取值为 `TDMQ_CMQ_TOPIC` ，该字段必填。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 伸缩组ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。 
     * @return AutoScalingGroupId 伸缩组ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
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
     * Get 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 TargetType 为 USER_GROUP 时生效。 
     * @return NotificationUserGroupIds 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 TargetType 为 USER_GROUP 时生效。
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 TargetType 为 USER_GROUP 时生效。
     * @param NotificationUserGroupIds 通知组ID，即为用户组ID集合，用户组ID可以通过[ListGroups](https://cloud.tencent.com/document/product/598/34589)查询。该参数仅在 TargetType 为 USER_GROUP 时生效。
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Get 通知接收端类型，取值如下：
<li>USER_GROUP：用户组</li>
<li>TDMQ_CMQ_TOPIC：TDMQ CMQ 主题</li>
<li>TDMQ_CMQ_QUEUE：TDMQ CMQ 队列</li>
<li>CMQ_QUEUE：CMQ 队列，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>
<li>CMQ_TOPIC：CMQ 主题，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>

默认值为：`USER_GROUP`。 
     * @return TargetType 通知接收端类型，取值如下：
<li>USER_GROUP：用户组</li>
<li>TDMQ_CMQ_TOPIC：TDMQ CMQ 主题</li>
<li>TDMQ_CMQ_QUEUE：TDMQ CMQ 队列</li>
<li>CMQ_QUEUE：CMQ 队列，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>
<li>CMQ_TOPIC：CMQ 主题，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>

默认值为：`USER_GROUP`。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 通知接收端类型，取值如下：
<li>USER_GROUP：用户组</li>
<li>TDMQ_CMQ_TOPIC：TDMQ CMQ 主题</li>
<li>TDMQ_CMQ_QUEUE：TDMQ CMQ 队列</li>
<li>CMQ_QUEUE：CMQ 队列，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>
<li>CMQ_TOPIC：CMQ 主题，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>

默认值为：`USER_GROUP`。
     * @param TargetType 通知接收端类型，取值如下：
<li>USER_GROUP：用户组</li>
<li>TDMQ_CMQ_TOPIC：TDMQ CMQ 主题</li>
<li>TDMQ_CMQ_QUEUE：TDMQ CMQ 队列</li>
<li>CMQ_QUEUE：CMQ 队列，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>
<li>CMQ_TOPIC：CMQ 主题，[CMQ已下线](https://cloud.tencent.com/document/product/1496/83970)，目前仅推荐使用  TDMQ CMQ。</li>

默认值为：`USER_GROUP`。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get TDMQ CMQ 队列名，如 TargetType 取值为 `TDMQ_CMQ_QUEUE` ，该字段必填。 
     * @return QueueName TDMQ CMQ 队列名，如 TargetType 取值为 `TDMQ_CMQ_QUEUE` ，该字段必填。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set TDMQ CMQ 队列名，如 TargetType 取值为 `TDMQ_CMQ_QUEUE` ，该字段必填。
     * @param QueueName TDMQ CMQ 队列名，如 TargetType 取值为 `TDMQ_CMQ_QUEUE` ，该字段必填。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get TDMQ CMQ 主题名，如 TargetType 取值为 `TDMQ_CMQ_TOPIC` ，该字段必填。 
     * @return TopicName TDMQ CMQ 主题名，如 TargetType 取值为 `TDMQ_CMQ_TOPIC` ，该字段必填。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TDMQ CMQ 主题名，如 TargetType 取值为 `TDMQ_CMQ_TOPIC` ，该字段必填。
     * @param TopicName TDMQ CMQ 主题名，如 TargetType 取值为 `TDMQ_CMQ_TOPIC` ，该字段必填。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CreateNotificationConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotificationConfigurationRequest(CreateNotificationConfigurationRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
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
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

