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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCodeTemplateVersionRequest extends AbstractModel {

    /**
    * 模版Id
    */
    @SerializedName("CodeTemplateId")
    @Expose
    private String CodeTemplateId;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模版关联的任务以及调度参数设置
    */
    @SerializedName("Tasks")
    @Expose
    private TaskFormParams [] Tasks;

    /**
    * 代码模本脚本内置参数
    */
    @SerializedName("OriginalParams")
    @Expose
    private String [] OriginalParams;

    /**
    * 提交描述
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * true表示：针对新建、已下线状态的任务仅生成开发态保存版本，您可在任务中自行提交到生产。针对调度中、已暂停、已失效的任务生成开发态保存版本并提交到生产（即本次代码模板的改动在调度中生效）； 
false表示：针对所有状态的任务均仅生成开发态保存版本。
    */
    @SerializedName("NeedSubmitScheduleForTemplate")
    @Expose
    private Boolean NeedSubmitScheduleForTemplate;

    /**
     * Get 模版Id 
     * @return CodeTemplateId 模版Id
     */
    public String getCodeTemplateId() {
        return this.CodeTemplateId;
    }

    /**
     * Set 模版Id
     * @param CodeTemplateId 模版Id
     */
    public void setCodeTemplateId(String CodeTemplateId) {
        this.CodeTemplateId = CodeTemplateId;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模版关联的任务以及调度参数设置 
     * @return Tasks 模版关联的任务以及调度参数设置
     */
    public TaskFormParams [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 模版关联的任务以及调度参数设置
     * @param Tasks 模版关联的任务以及调度参数设置
     */
    public void setTasks(TaskFormParams [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 代码模本脚本内置参数 
     * @return OriginalParams 代码模本脚本内置参数
     */
    public String [] getOriginalParams() {
        return this.OriginalParams;
    }

    /**
     * Set 代码模本脚本内置参数
     * @param OriginalParams 代码模本脚本内置参数
     */
    public void setOriginalParams(String [] OriginalParams) {
        this.OriginalParams = OriginalParams;
    }

    /**
     * Get 提交描述 
     * @return VersionRemark 提交描述
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set 提交描述
     * @param VersionRemark 提交描述
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get true表示：针对新建、已下线状态的任务仅生成开发态保存版本，您可在任务中自行提交到生产。针对调度中、已暂停、已失效的任务生成开发态保存版本并提交到生产（即本次代码模板的改动在调度中生效）； 
false表示：针对所有状态的任务均仅生成开发态保存版本。 
     * @return NeedSubmitScheduleForTemplate true表示：针对新建、已下线状态的任务仅生成开发态保存版本，您可在任务中自行提交到生产。针对调度中、已暂停、已失效的任务生成开发态保存版本并提交到生产（即本次代码模板的改动在调度中生效）； 
false表示：针对所有状态的任务均仅生成开发态保存版本。
     */
    public Boolean getNeedSubmitScheduleForTemplate() {
        return this.NeedSubmitScheduleForTemplate;
    }

    /**
     * Set true表示：针对新建、已下线状态的任务仅生成开发态保存版本，您可在任务中自行提交到生产。针对调度中、已暂停、已失效的任务生成开发态保存版本并提交到生产（即本次代码模板的改动在调度中生效）； 
false表示：针对所有状态的任务均仅生成开发态保存版本。
     * @param NeedSubmitScheduleForTemplate true表示：针对新建、已下线状态的任务仅生成开发态保存版本，您可在任务中自行提交到生产。针对调度中、已暂停、已失效的任务生成开发态保存版本并提交到生产（即本次代码模板的改动在调度中生效）； 
false表示：针对所有状态的任务均仅生成开发态保存版本。
     */
    public void setNeedSubmitScheduleForTemplate(Boolean NeedSubmitScheduleForTemplate) {
        this.NeedSubmitScheduleForTemplate = NeedSubmitScheduleForTemplate;
    }

    public CreateCodeTemplateVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodeTemplateVersionRequest(CreateCodeTemplateVersionRequest source) {
        if (source.CodeTemplateId != null) {
            this.CodeTemplateId = new String(source.CodeTemplateId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskFormParams[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskFormParams(source.Tasks[i]);
            }
        }
        if (source.OriginalParams != null) {
            this.OriginalParams = new String[source.OriginalParams.length];
            for (int i = 0; i < source.OriginalParams.length; i++) {
                this.OriginalParams[i] = new String(source.OriginalParams[i]);
            }
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.NeedSubmitScheduleForTemplate != null) {
            this.NeedSubmitScheduleForTemplate = new Boolean(source.NeedSubmitScheduleForTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeTemplateId", this.CodeTemplateId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArraySimple(map, prefix + "OriginalParams.", this.OriginalParams);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "NeedSubmitScheduleForTemplate", this.NeedSubmitScheduleForTemplate);

    }
}

