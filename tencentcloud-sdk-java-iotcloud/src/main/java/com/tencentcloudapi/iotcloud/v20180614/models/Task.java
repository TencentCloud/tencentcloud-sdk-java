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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * 批量更新影子任务的描述细节，当 taskType 取值为 “UpdateShadow” 时，此字段必填。描述见下 BatchUpdateShadow
    */
    @SerializedName("UpdateShadowTask")
    @Expose
    private BatchUpdateShadow UpdateShadowTask;

    /**
    * 批量下发消息任务的描述细节，当 taskType 取值为 “PublishMessage” 时，此字段必填。描述见下 BatchPublishMessage
    */
    @SerializedName("PublishMessageTask")
    @Expose
    private BatchPublishMessage PublishMessageTask;

    /**
     * Get 批量更新影子任务的描述细节，当 taskType 取值为 “UpdateShadow” 时，此字段必填。描述见下 BatchUpdateShadow 
     * @return UpdateShadowTask 批量更新影子任务的描述细节，当 taskType 取值为 “UpdateShadow” 时，此字段必填。描述见下 BatchUpdateShadow
     */
    public BatchUpdateShadow getUpdateShadowTask() {
        return this.UpdateShadowTask;
    }

    /**
     * Set 批量更新影子任务的描述细节，当 taskType 取值为 “UpdateShadow” 时，此字段必填。描述见下 BatchUpdateShadow
     * @param UpdateShadowTask 批量更新影子任务的描述细节，当 taskType 取值为 “UpdateShadow” 时，此字段必填。描述见下 BatchUpdateShadow
     */
    public void setUpdateShadowTask(BatchUpdateShadow UpdateShadowTask) {
        this.UpdateShadowTask = UpdateShadowTask;
    }

    /**
     * Get 批量下发消息任务的描述细节，当 taskType 取值为 “PublishMessage” 时，此字段必填。描述见下 BatchPublishMessage 
     * @return PublishMessageTask 批量下发消息任务的描述细节，当 taskType 取值为 “PublishMessage” 时，此字段必填。描述见下 BatchPublishMessage
     */
    public BatchPublishMessage getPublishMessageTask() {
        return this.PublishMessageTask;
    }

    /**
     * Set 批量下发消息任务的描述细节，当 taskType 取值为 “PublishMessage” 时，此字段必填。描述见下 BatchPublishMessage
     * @param PublishMessageTask 批量下发消息任务的描述细节，当 taskType 取值为 “PublishMessage” 时，此字段必填。描述见下 BatchPublishMessage
     */
    public void setPublishMessageTask(BatchPublishMessage PublishMessageTask) {
        this.PublishMessageTask = PublishMessageTask;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UpdateShadowTask.", this.UpdateShadowTask);
        this.setParamObj(map, prefix + "PublishMessageTask.", this.PublishMessageTask);

    }
}

