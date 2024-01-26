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

public class ParamDsRequest extends AbstractModel {

    /**
    * 参数key
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 参数类型
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * 参数周期运行值
    */
    @SerializedName("ParamDefine")
    @Expose
    private String ParamDefine;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 操作者名
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * sql内容
    */
    @SerializedName("SqlContent")
    @Expose
    private String SqlContent;

    /**
    * 数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 关键字
    */
    @SerializedName("KeyWords")
    @Expose
    private String KeyWords;

    /**
    * 版本号
    */
    @SerializedName("MyVersion")
    @Expose
    private Long MyVersion;

    /**
    * 上游
    */
    @SerializedName("Upstream")
    @Expose
    private Boolean Upstream;

    /**
    * 参数描述
    */
    @SerializedName("ParamDescription")
    @Expose
    private String ParamDescription;

    /**
    * 参数调试运行值
    */
    @SerializedName("ParamDefineTest")
    @Expose
    private String ParamDefineTest;

    /**
    * 是否为更新，true表示更新，false表示新建
    */
    @SerializedName("UpdateFlag")
    @Expose
    private Boolean UpdateFlag;

    /**
     * Get 参数key 
     * @return ParamKey 参数key
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 参数key
     * @param ParamKey 参数key
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 参数类型 
     * @return ParamType 参数类型
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型
     * @param ParamType 参数类型
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get 参数周期运行值 
     * @return ParamDefine 参数周期运行值
     */
    public String getParamDefine() {
        return this.ParamDefine;
    }

    /**
     * Set 参数周期运行值
     * @param ParamDefine 参数周期运行值
     */
    public void setParamDefine(String ParamDefine) {
        this.ParamDefine = ParamDefine;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 操作者名 
     * @return OperatorName 操作者名
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作者名
     * @param OperatorName 操作者名
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get sql内容 
     * @return SqlContent sql内容
     */
    public String getSqlContent() {
        return this.SqlContent;
    }

    /**
     * Set sql内容
     * @param SqlContent sql内容
     */
    public void setSqlContent(String SqlContent) {
        this.SqlContent = SqlContent;
    }

    /**
     * Get 数据时间 
     * @return CurRunDate 数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
     * @param CurRunDate 数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 关键字 
     * @return KeyWords 关键字
     */
    public String getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 关键字
     * @param KeyWords 关键字
     */
    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get 版本号 
     * @return MyVersion 版本号
     */
    public Long getMyVersion() {
        return this.MyVersion;
    }

    /**
     * Set 版本号
     * @param MyVersion 版本号
     */
    public void setMyVersion(Long MyVersion) {
        this.MyVersion = MyVersion;
    }

    /**
     * Get 上游 
     * @return Upstream 上游
     */
    public Boolean getUpstream() {
        return this.Upstream;
    }

    /**
     * Set 上游
     * @param Upstream 上游
     */
    public void setUpstream(Boolean Upstream) {
        this.Upstream = Upstream;
    }

    /**
     * Get 参数描述 
     * @return ParamDescription 参数描述
     */
    public String getParamDescription() {
        return this.ParamDescription;
    }

    /**
     * Set 参数描述
     * @param ParamDescription 参数描述
     */
    public void setParamDescription(String ParamDescription) {
        this.ParamDescription = ParamDescription;
    }

    /**
     * Get 参数调试运行值 
     * @return ParamDefineTest 参数调试运行值
     */
    public String getParamDefineTest() {
        return this.ParamDefineTest;
    }

    /**
     * Set 参数调试运行值
     * @param ParamDefineTest 参数调试运行值
     */
    public void setParamDefineTest(String ParamDefineTest) {
        this.ParamDefineTest = ParamDefineTest;
    }

    /**
     * Get 是否为更新，true表示更新，false表示新建 
     * @return UpdateFlag 是否为更新，true表示更新，false表示新建
     */
    public Boolean getUpdateFlag() {
        return this.UpdateFlag;
    }

    /**
     * Set 是否为更新，true表示更新，false表示新建
     * @param UpdateFlag 是否为更新，true表示更新，false表示新建
     */
    public void setUpdateFlag(Boolean UpdateFlag) {
        this.UpdateFlag = UpdateFlag;
    }

    public ParamDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamDsRequest(ParamDsRequest source) {
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.ParamDefine != null) {
            this.ParamDefine = new String(source.ParamDefine);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.SqlContent != null) {
            this.SqlContent = new String(source.SqlContent);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String(source.KeyWords);
        }
        if (source.MyVersion != null) {
            this.MyVersion = new Long(source.MyVersion);
        }
        if (source.Upstream != null) {
            this.Upstream = new Boolean(source.Upstream);
        }
        if (source.ParamDescription != null) {
            this.ParamDescription = new String(source.ParamDescription);
        }
        if (source.ParamDefineTest != null) {
            this.ParamDefineTest = new String(source.ParamDefineTest);
        }
        if (source.UpdateFlag != null) {
            this.UpdateFlag = new Boolean(source.UpdateFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "ParamDefine", this.ParamDefine);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "SqlContent", this.SqlContent);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "KeyWords", this.KeyWords);
        this.setParamSimple(map, prefix + "MyVersion", this.MyVersion);
        this.setParamSimple(map, prefix + "Upstream", this.Upstream);
        this.setParamSimple(map, prefix + "ParamDescription", this.ParamDescription);
        this.setParamSimple(map, prefix + "ParamDefineTest", this.ParamDefineTest);
        this.setParamSimple(map, prefix + "UpdateFlag", this.UpdateFlag);

    }
}

