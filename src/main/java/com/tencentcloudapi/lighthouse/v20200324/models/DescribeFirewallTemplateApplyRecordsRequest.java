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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirewallTemplateApplyRecordsRequest extends AbstractModel {

    /**
    * 防火墙模板ID。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 应用防火墙模版任务ID列表。可通过[ApplyFirewallTemplate](https://cloud.tencent.com/document/product/1207/96883)接口返回值TaskId字段获取。
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get 防火墙模板ID。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。 
     * @return TemplateId 防火墙模板ID。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 防火墙模板ID。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。
     * @param TemplateId 防火墙模板ID。可通过[DescribeFirewallTemplates](https://cloud.tencent.com/document/product/1207/96874)接口返回值字段TemplateSet获取。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 应用防火墙模版任务ID列表。可通过[ApplyFirewallTemplate](https://cloud.tencent.com/document/product/1207/96883)接口返回值TaskId字段获取。 
     * @return TaskIds 应用防火墙模版任务ID列表。可通过[ApplyFirewallTemplate](https://cloud.tencent.com/document/product/1207/96883)接口返回值TaskId字段获取。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 应用防火墙模版任务ID列表。可通过[ApplyFirewallTemplate](https://cloud.tencent.com/document/product/1207/96883)接口返回值TaskId字段获取。
     * @param TaskIds 应用防火墙模版任务ID列表。可通过[ApplyFirewallTemplate](https://cloud.tencent.com/document/product/1207/96883)接口返回值TaskId字段获取。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public DescribeFirewallTemplateApplyRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirewallTemplateApplyRecordsRequest(DescribeFirewallTemplateApplyRecordsRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

