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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskFromActionRequest extends AbstractModel {

    /**
    * 动作ID，可从动作列表接口DescribeActionLibraryList获取
    */
    @SerializedName("TaskActionId")
    @Expose
    private Long TaskActionId;

    /**
    * 参与演练的实例ID
    */
    @SerializedName("TaskInstances")
    @Expose
    private String [] TaskInstances;

    /**
    * 演练名称，不填则默认取动作名称
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * 演练描述，不填则默认取动作描述
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * 动作通用参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数
    */
    @SerializedName("TaskActionGeneralConfiguration")
    @Expose
    private String TaskActionGeneralConfiguration;

    /**
    * 动作自定义参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数，注意：必填参数，是没有默认值的 ，务必保证传入有效值
    */
    @SerializedName("TaskActionCustomConfiguration")
    @Expose
    private String TaskActionCustomConfiguration;

    /**
    * 演练自动暂停时间，单位分钟, 不填则默认为60
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
    * 标签列表
    */
    @SerializedName("TaskTags")
    @Expose
    private TagWithCreate [] TaskTags;

    /**
     * Get 动作ID，可从动作列表接口DescribeActionLibraryList获取 
     * @return TaskActionId 动作ID，可从动作列表接口DescribeActionLibraryList获取
     */
    public Long getTaskActionId() {
        return this.TaskActionId;
    }

    /**
     * Set 动作ID，可从动作列表接口DescribeActionLibraryList获取
     * @param TaskActionId 动作ID，可从动作列表接口DescribeActionLibraryList获取
     */
    public void setTaskActionId(Long TaskActionId) {
        this.TaskActionId = TaskActionId;
    }

    /**
     * Get 参与演练的实例ID 
     * @return TaskInstances 参与演练的实例ID
     */
    public String [] getTaskInstances() {
        return this.TaskInstances;
    }

    /**
     * Set 参与演练的实例ID
     * @param TaskInstances 参与演练的实例ID
     */
    public void setTaskInstances(String [] TaskInstances) {
        this.TaskInstances = TaskInstances;
    }

    /**
     * Get 演练名称，不填则默认取动作名称 
     * @return TaskTitle 演练名称，不填则默认取动作名称
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set 演练名称，不填则默认取动作名称
     * @param TaskTitle 演练名称，不填则默认取动作名称
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get 演练描述，不填则默认取动作描述 
     * @return TaskDescription 演练描述，不填则默认取动作描述
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set 演练描述，不填则默认取动作描述
     * @param TaskDescription 演练描述，不填则默认取动作描述
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get 动作通用参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数 
     * @return TaskActionGeneralConfiguration 动作通用参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数
     */
    public String getTaskActionGeneralConfiguration() {
        return this.TaskActionGeneralConfiguration;
    }

    /**
     * Set 动作通用参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数
     * @param TaskActionGeneralConfiguration 动作通用参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数
     */
    public void setTaskActionGeneralConfiguration(String TaskActionGeneralConfiguration) {
        this.TaskActionGeneralConfiguration = TaskActionGeneralConfiguration;
    }

    /**
     * Get 动作自定义参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数，注意：必填参数，是没有默认值的 ，务必保证传入有效值 
     * @return TaskActionCustomConfiguration 动作自定义参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数，注意：必填参数，是没有默认值的 ，务必保证传入有效值
     */
    public String getTaskActionCustomConfiguration() {
        return this.TaskActionCustomConfiguration;
    }

    /**
     * Set 动作自定义参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数，注意：必填参数，是没有默认值的 ，务必保证传入有效值
     * @param TaskActionCustomConfiguration 动作自定义参数，需要json序列化传入，可以从动作详情接口DescribeActionFieldConfigList获取，不填默认使用动作默认参数，注意：必填参数，是没有默认值的 ，务必保证传入有效值
     */
    public void setTaskActionCustomConfiguration(String TaskActionCustomConfiguration) {
        this.TaskActionCustomConfiguration = TaskActionCustomConfiguration;
    }

    /**
     * Get 演练自动暂停时间，单位分钟, 不填则默认为60 
     * @return TaskPauseDuration 演练自动暂停时间，单位分钟, 不填则默认为60
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set 演练自动暂停时间，单位分钟, 不填则默认为60
     * @param TaskPauseDuration 演练自动暂停时间，单位分钟, 不填则默认为60
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    /**
     * Get 标签列表 
     * @return TaskTags 标签列表
     */
    public TagWithCreate [] getTaskTags() {
        return this.TaskTags;
    }

    /**
     * Set 标签列表
     * @param TaskTags 标签列表
     */
    public void setTaskTags(TagWithCreate [] TaskTags) {
        this.TaskTags = TaskTags;
    }

    public CreateTaskFromActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFromActionRequest(CreateTaskFromActionRequest source) {
        if (source.TaskActionId != null) {
            this.TaskActionId = new Long(source.TaskActionId);
        }
        if (source.TaskInstances != null) {
            this.TaskInstances = new String[source.TaskInstances.length];
            for (int i = 0; i < source.TaskInstances.length; i++) {
                this.TaskInstances[i] = new String(source.TaskInstances[i]);
            }
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskActionGeneralConfiguration != null) {
            this.TaskActionGeneralConfiguration = new String(source.TaskActionGeneralConfiguration);
        }
        if (source.TaskActionCustomConfiguration != null) {
            this.TaskActionCustomConfiguration = new String(source.TaskActionCustomConfiguration);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
        if (source.TaskTags != null) {
            this.TaskTags = new TagWithCreate[source.TaskTags.length];
            for (int i = 0; i < source.TaskTags.length; i++) {
                this.TaskTags[i] = new TagWithCreate(source.TaskTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskActionId", this.TaskActionId);
        this.setParamArraySimple(map, prefix + "TaskInstances.", this.TaskInstances);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskActionGeneralConfiguration", this.TaskActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskActionCustomConfiguration", this.TaskActionCustomConfiguration);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);
        this.setParamArrayObj(map, prefix + "TaskTags.", this.TaskTags);

    }
}

