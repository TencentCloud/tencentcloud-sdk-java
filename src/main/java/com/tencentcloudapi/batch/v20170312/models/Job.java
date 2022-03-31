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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel{

    /**
    * 任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * 作业名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 作业描述
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 依赖信息
    */
    @SerializedName("Dependences")
    @Expose
    private Dependence [] Dependences;

    /**
    * 通知信息
    */
    @SerializedName("Notifications")
    @Expose
    private Notification [] Notifications;

    /**
    * 对于存在依赖关系的任务中，后序任务执行对于前序任务的依赖条件。取值范围包括 PRE_TASK_SUCCEED，PRE_TASK_AT_LEAST_PARTLY_SUCCEED，PRE_TASK_FINISHED，默认值为PRE_TASK_SUCCEED。
    */
    @SerializedName("TaskExecutionDependOn")
    @Expose
    private String TaskExecutionDependOn;

    /**
    * 表示创建 CVM 失败按照何种策略处理。取值范围包括 FAILED，RUNNABLE。FAILED 表示创建 CVM 失败按照一次执行失败处理，RUNNABLE 表示创建 CVM 失败按照继续等待处理。默认值为FAILED。StateIfCreateCvmFailed对于提交的指定计算环境的作业无效。
    */
    @SerializedName("StateIfCreateCvmFailed")
    @Expose
    private String StateIfCreateCvmFailed;

    /**
    * 标签列表。通过指定该参数可以支持绑定标签到作业。每个作业最多绑定10个标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 表示通知信息的通知目标类型。
取值范围：CMQ，TDMQ_CMQ。
CMQ:表示向腾讯云CMQ发送消息。
TDMQ_CMQ：表示向腾讯云TDMQ_CMQ发送消息。<br/>默认值为CMQ。<br/>注：腾讯云计划于2022年6月前正式下线消息队列 CMQ，建议使用TDMQ_CMQ。参考文档：[CMQ迁移到TDMQ_CMQ](https://cloud.tencent.com/document/product/406/60860)
    */
    @SerializedName("NotificationTarget")
    @Expose
    private String NotificationTarget;

    /**
     * Get 任务信息 
     * @return Tasks 任务信息
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务信息
     * @param Tasks 任务信息
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 作业名称 
     * @return JobName 作业名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 作业名称
     * @param JobName 作业名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 作业描述 
     * @return JobDescription 作业描述
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set 作业描述
     * @param JobDescription 作业描述
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级 
     * @return Priority 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     * @param Priority 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 依赖信息 
     * @return Dependences 依赖信息
     */
    public Dependence [] getDependences() {
        return this.Dependences;
    }

    /**
     * Set 依赖信息
     * @param Dependences 依赖信息
     */
    public void setDependences(Dependence [] Dependences) {
        this.Dependences = Dependences;
    }

    /**
     * Get 通知信息 
     * @return Notifications 通知信息
     */
    public Notification [] getNotifications() {
        return this.Notifications;
    }

    /**
     * Set 通知信息
     * @param Notifications 通知信息
     */
    public void setNotifications(Notification [] Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * Get 对于存在依赖关系的任务中，后序任务执行对于前序任务的依赖条件。取值范围包括 PRE_TASK_SUCCEED，PRE_TASK_AT_LEAST_PARTLY_SUCCEED，PRE_TASK_FINISHED，默认值为PRE_TASK_SUCCEED。 
     * @return TaskExecutionDependOn 对于存在依赖关系的任务中，后序任务执行对于前序任务的依赖条件。取值范围包括 PRE_TASK_SUCCEED，PRE_TASK_AT_LEAST_PARTLY_SUCCEED，PRE_TASK_FINISHED，默认值为PRE_TASK_SUCCEED。
     */
    public String getTaskExecutionDependOn() {
        return this.TaskExecutionDependOn;
    }

    /**
     * Set 对于存在依赖关系的任务中，后序任务执行对于前序任务的依赖条件。取值范围包括 PRE_TASK_SUCCEED，PRE_TASK_AT_LEAST_PARTLY_SUCCEED，PRE_TASK_FINISHED，默认值为PRE_TASK_SUCCEED。
     * @param TaskExecutionDependOn 对于存在依赖关系的任务中，后序任务执行对于前序任务的依赖条件。取值范围包括 PRE_TASK_SUCCEED，PRE_TASK_AT_LEAST_PARTLY_SUCCEED，PRE_TASK_FINISHED，默认值为PRE_TASK_SUCCEED。
     */
    public void setTaskExecutionDependOn(String TaskExecutionDependOn) {
        this.TaskExecutionDependOn = TaskExecutionDependOn;
    }

    /**
     * Get 表示创建 CVM 失败按照何种策略处理。取值范围包括 FAILED，RUNNABLE。FAILED 表示创建 CVM 失败按照一次执行失败处理，RUNNABLE 表示创建 CVM 失败按照继续等待处理。默认值为FAILED。StateIfCreateCvmFailed对于提交的指定计算环境的作业无效。 
     * @return StateIfCreateCvmFailed 表示创建 CVM 失败按照何种策略处理。取值范围包括 FAILED，RUNNABLE。FAILED 表示创建 CVM 失败按照一次执行失败处理，RUNNABLE 表示创建 CVM 失败按照继续等待处理。默认值为FAILED。StateIfCreateCvmFailed对于提交的指定计算环境的作业无效。
     */
    public String getStateIfCreateCvmFailed() {
        return this.StateIfCreateCvmFailed;
    }

    /**
     * Set 表示创建 CVM 失败按照何种策略处理。取值范围包括 FAILED，RUNNABLE。FAILED 表示创建 CVM 失败按照一次执行失败处理，RUNNABLE 表示创建 CVM 失败按照继续等待处理。默认值为FAILED。StateIfCreateCvmFailed对于提交的指定计算环境的作业无效。
     * @param StateIfCreateCvmFailed 表示创建 CVM 失败按照何种策略处理。取值范围包括 FAILED，RUNNABLE。FAILED 表示创建 CVM 失败按照一次执行失败处理，RUNNABLE 表示创建 CVM 失败按照继续等待处理。默认值为FAILED。StateIfCreateCvmFailed对于提交的指定计算环境的作业无效。
     */
    public void setStateIfCreateCvmFailed(String StateIfCreateCvmFailed) {
        this.StateIfCreateCvmFailed = StateIfCreateCvmFailed;
    }

    /**
     * Get 标签列表。通过指定该参数可以支持绑定标签到作业。每个作业最多绑定10个标签。 
     * @return Tags 标签列表。通过指定该参数可以支持绑定标签到作业。每个作业最多绑定10个标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表。通过指定该参数可以支持绑定标签到作业。每个作业最多绑定10个标签。
     * @param Tags 标签列表。通过指定该参数可以支持绑定标签到作业。每个作业最多绑定10个标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 表示通知信息的通知目标类型。
取值范围：CMQ，TDMQ_CMQ。
CMQ:表示向腾讯云CMQ发送消息。
TDMQ_CMQ：表示向腾讯云TDMQ_CMQ发送消息。<br/>默认值为CMQ。<br/>注：腾讯云计划于2022年6月前正式下线消息队列 CMQ，建议使用TDMQ_CMQ。参考文档：[CMQ迁移到TDMQ_CMQ](https://cloud.tencent.com/document/product/406/60860) 
     * @return NotificationTarget 表示通知信息的通知目标类型。
取值范围：CMQ，TDMQ_CMQ。
CMQ:表示向腾讯云CMQ发送消息。
TDMQ_CMQ：表示向腾讯云TDMQ_CMQ发送消息。<br/>默认值为CMQ。<br/>注：腾讯云计划于2022年6月前正式下线消息队列 CMQ，建议使用TDMQ_CMQ。参考文档：[CMQ迁移到TDMQ_CMQ](https://cloud.tencent.com/document/product/406/60860)
     */
    public String getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set 表示通知信息的通知目标类型。
取值范围：CMQ，TDMQ_CMQ。
CMQ:表示向腾讯云CMQ发送消息。
TDMQ_CMQ：表示向腾讯云TDMQ_CMQ发送消息。<br/>默认值为CMQ。<br/>注：腾讯云计划于2022年6月前正式下线消息队列 CMQ，建议使用TDMQ_CMQ。参考文档：[CMQ迁移到TDMQ_CMQ](https://cloud.tencent.com/document/product/406/60860)
     * @param NotificationTarget 表示通知信息的通知目标类型。
取值范围：CMQ，TDMQ_CMQ。
CMQ:表示向腾讯云CMQ发送消息。
TDMQ_CMQ：表示向腾讯云TDMQ_CMQ发送消息。<br/>默认值为CMQ。<br/>注：腾讯云计划于2022年6月前正式下线消息队列 CMQ，建议使用TDMQ_CMQ。参考文档：[CMQ迁移到TDMQ_CMQ](https://cloud.tencent.com/document/product/406/60860)
     */
    public void setNotificationTarget(String NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.Tasks != null) {
            this.Tasks = new Task[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new Task(source.Tasks[i]);
            }
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobDescription != null) {
            this.JobDescription = new String(source.JobDescription);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Dependences != null) {
            this.Dependences = new Dependence[source.Dependences.length];
            for (int i = 0; i < source.Dependences.length; i++) {
                this.Dependences[i] = new Dependence(source.Dependences[i]);
            }
        }
        if (source.Notifications != null) {
            this.Notifications = new Notification[source.Notifications.length];
            for (int i = 0; i < source.Notifications.length; i++) {
                this.Notifications[i] = new Notification(source.Notifications[i]);
            }
        }
        if (source.TaskExecutionDependOn != null) {
            this.TaskExecutionDependOn = new String(source.TaskExecutionDependOn);
        }
        if (source.StateIfCreateCvmFailed != null) {
            this.StateIfCreateCvmFailed = new String(source.StateIfCreateCvmFailed);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NotificationTarget != null) {
            this.NotificationTarget = new String(source.NotificationTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Dependences.", this.Dependences);
        this.setParamArrayObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "TaskExecutionDependOn", this.TaskExecutionDependOn);
        this.setParamSimple(map, prefix + "StateIfCreateCvmFailed", this.StateIfCreateCvmFailed);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NotificationTarget", this.NotificationTarget);

    }
}

