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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertChannelRequest extends AbstractModel {

    /**
    * monitor 服务的告警通知模板的 NoticeId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 Id 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * monitor 服务的告警通知模板的 AMPConsumerId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 AMPConsumerId 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
    */
    @SerializedName("AMPConsumerId")
    @Expose
    private String AMPConsumerId;

    /**
     * Get monitor 服务的告警通知模板的 NoticeId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 Id 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可） 
     * @return NoticeId monitor 服务的告警通知模板的 NoticeId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 Id 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set monitor 服务的告警通知模板的 NoticeId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 Id 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
     * @param NoticeId monitor 服务的告警通知模板的 NoticeId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 Id 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get monitor 服务的告警通知模板的 AMPConsumerId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 AMPConsumerId 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可） 
     * @return AMPConsumerId monitor 服务的告警通知模板的 AMPConsumerId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 AMPConsumerId 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
     */
    public String getAMPConsumerId() {
        return this.AMPConsumerId;
    }

    /**
     * Set monitor 服务的告警通知模板的 AMPConsumerId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 AMPConsumerId 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
     * @param AMPConsumerId monitor 服务的告警通知模板的 AMPConsumerId，可从 monitor 服务的云 API 的 DescribeAlarmNotices 接口响应里的 AMPConsumerId 字段获取。（CreateAlertChannel 接口的入参里用于标识一个告警通知模板的 AMPConsumerId 与 NoticeId 二选一即可）
     */
    public void setAMPConsumerId(String AMPConsumerId) {
        this.AMPConsumerId = AMPConsumerId;
    }

    public CreateAlertChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertChannelRequest(CreateAlertChannelRequest source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AMPConsumerId != null) {
            this.AMPConsumerId = new String(source.AMPConsumerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AMPConsumerId", this.AMPConsumerId);

    }
}

