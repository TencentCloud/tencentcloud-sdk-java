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

public class DeleteNotificationConfigurationRequest extends AbstractModel {

    /**
    * 待删除的通知ID，目前为必填参数。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
     * Get 待删除的通知ID，目前为必填参数。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。 
     * @return AutoScalingNotificationId 待删除的通知ID，目前为必填参数。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set 待删除的通知ID，目前为必填参数。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
     * @param AutoScalingNotificationId 待删除的通知ID，目前为必填参数。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeNotificationConfigurations](https://cloud.tencent.com/document/api/377/33183) ，取返回信息中的 AutoScalingNotificationId 获取通知ID。
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    public DeleteNotificationConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNotificationConfigurationRequest(DeleteNotificationConfigurationRequest source) {
        if (source.AutoScalingNotificationId != null) {
            this.AutoScalingNotificationId = new String(source.AutoScalingNotificationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);

    }
}

