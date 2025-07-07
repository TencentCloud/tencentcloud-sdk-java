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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOrganizationRegistrationTasksDetails extends AbstractModel {

    /**
    * 生成注册链接的任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 批量创建企业任务的状态
<ul>
<li>Processing</li>
<li>Create</li>
<li>Submit</li>
<li>Authorization</li>
<li>Failed</li>
</ul>

各个状态所代表的含义如下表格所示：
<table>
<thead align="center" valign="center">
<tr><th>任务状态名称</th><th>任务状态详情</th></tr>
</thead>
<tbody>
<tr><th align="center" valign="center">Processing</th><th>企业认证任务处理中，用户调用了<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateBatchOrganizationRegistrationTasks">CreateBatchOrganizationRegistrationTasks</a>接口，但是任务还在处理中的状态</th></tr>
<tr><th align="center" valign="center">Create</th><th>创建企业认证链接任务完成，可以调用生成任务链接接口</th></tr>
<tr><th align="center" valign="center">Submit</th><th>企业认证任务已提交,到如下界面之后，会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/acbcec8c7a71de14d9c041e3b8ca8b3f.png)</th></tr>
<tr><th align="center" valign="center">Authorization</th><th>企业认证任务认证成功,点击下图下一步，进入到授权书上传或者法人认证，则会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/c52448354871cffa729da8db4e3a6f18.png)</th></tr>
<tr><th align="center" valign="center">Failed</th><th>企业认证任务失败</th></tr>
</tbody>
</table>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 如果任务失败,会返回错误信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 生成注册链接的任务Id 
     * @return TaskId 生成注册链接的任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 生成注册链接的任务Id
     * @param TaskId 生成注册链接的任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 批量创建企业任务的状态
<ul>
<li>Processing</li>
<li>Create</li>
<li>Submit</li>
<li>Authorization</li>
<li>Failed</li>
</ul>

各个状态所代表的含义如下表格所示：
<table>
<thead align="center" valign="center">
<tr><th>任务状态名称</th><th>任务状态详情</th></tr>
</thead>
<tbody>
<tr><th align="center" valign="center">Processing</th><th>企业认证任务处理中，用户调用了<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateBatchOrganizationRegistrationTasks">CreateBatchOrganizationRegistrationTasks</a>接口，但是任务还在处理中的状态</th></tr>
<tr><th align="center" valign="center">Create</th><th>创建企业认证链接任务完成，可以调用生成任务链接接口</th></tr>
<tr><th align="center" valign="center">Submit</th><th>企业认证任务已提交,到如下界面之后，会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/acbcec8c7a71de14d9c041e3b8ca8b3f.png)</th></tr>
<tr><th align="center" valign="center">Authorization</th><th>企业认证任务认证成功,点击下图下一步，进入到授权书上传或者法人认证，则会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/c52448354871cffa729da8db4e3a6f18.png)</th></tr>
<tr><th align="center" valign="center">Failed</th><th>企业认证任务失败</th></tr>
</tbody>
</table> 
     * @return Status 批量创建企业任务的状态
<ul>
<li>Processing</li>
<li>Create</li>
<li>Submit</li>
<li>Authorization</li>
<li>Failed</li>
</ul>

各个状态所代表的含义如下表格所示：
<table>
<thead align="center" valign="center">
<tr><th>任务状态名称</th><th>任务状态详情</th></tr>
</thead>
<tbody>
<tr><th align="center" valign="center">Processing</th><th>企业认证任务处理中，用户调用了<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateBatchOrganizationRegistrationTasks">CreateBatchOrganizationRegistrationTasks</a>接口，但是任务还在处理中的状态</th></tr>
<tr><th align="center" valign="center">Create</th><th>创建企业认证链接任务完成，可以调用生成任务链接接口</th></tr>
<tr><th align="center" valign="center">Submit</th><th>企业认证任务已提交,到如下界面之后，会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/acbcec8c7a71de14d9c041e3b8ca8b3f.png)</th></tr>
<tr><th align="center" valign="center">Authorization</th><th>企业认证任务认证成功,点击下图下一步，进入到授权书上传或者法人认证，则会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/c52448354871cffa729da8db4e3a6f18.png)</th></tr>
<tr><th align="center" valign="center">Failed</th><th>企业认证任务失败</th></tr>
</tbody>
</table>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 批量创建企业任务的状态
<ul>
<li>Processing</li>
<li>Create</li>
<li>Submit</li>
<li>Authorization</li>
<li>Failed</li>
</ul>

各个状态所代表的含义如下表格所示：
<table>
<thead align="center" valign="center">
<tr><th>任务状态名称</th><th>任务状态详情</th></tr>
</thead>
<tbody>
<tr><th align="center" valign="center">Processing</th><th>企业认证任务处理中，用户调用了<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateBatchOrganizationRegistrationTasks">CreateBatchOrganizationRegistrationTasks</a>接口，但是任务还在处理中的状态</th></tr>
<tr><th align="center" valign="center">Create</th><th>创建企业认证链接任务完成，可以调用生成任务链接接口</th></tr>
<tr><th align="center" valign="center">Submit</th><th>企业认证任务已提交,到如下界面之后，会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/acbcec8c7a71de14d9c041e3b8ca8b3f.png)</th></tr>
<tr><th align="center" valign="center">Authorization</th><th>企业认证任务认证成功,点击下图下一步，进入到授权书上传或者法人认证，则会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/c52448354871cffa729da8db4e3a6f18.png)</th></tr>
<tr><th align="center" valign="center">Failed</th><th>企业认证任务失败</th></tr>
</tbody>
</table>
     * @param Status 批量创建企业任务的状态
<ul>
<li>Processing</li>
<li>Create</li>
<li>Submit</li>
<li>Authorization</li>
<li>Failed</li>
</ul>

各个状态所代表的含义如下表格所示：
<table>
<thead align="center" valign="center">
<tr><th>任务状态名称</th><th>任务状态详情</th></tr>
</thead>
<tbody>
<tr><th align="center" valign="center">Processing</th><th>企业认证任务处理中，用户调用了<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateBatchOrganizationRegistrationTasks">CreateBatchOrganizationRegistrationTasks</a>接口，但是任务还在处理中的状态</th></tr>
<tr><th align="center" valign="center">Create</th><th>创建企业认证链接任务完成，可以调用生成任务链接接口</th></tr>
<tr><th align="center" valign="center">Submit</th><th>企业认证任务已提交,到如下界面之后，会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/acbcec8c7a71de14d9c041e3b8ca8b3f.png)</th></tr>
<tr><th align="center" valign="center">Authorization</th><th>企业认证任务认证成功,点击下图下一步，进入到授权书上传或者法人认证，则会变为这个状态

![image](https://qcloudimg.tencent-cloud.cn/raw/c52448354871cffa729da8db4e3a6f18.png)</th></tr>
<tr><th align="center" valign="center">Failed</th><th>企业认证任务失败</th></tr>
</tbody>
</table>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 如果任务失败,会返回错误信息 
     * @return ErrorMessage 如果任务失败,会返回错误信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 如果任务失败,会返回错误信息
     * @param ErrorMessage 如果任务失败,会返回错误信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public BatchOrganizationRegistrationTasksDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOrganizationRegistrationTasksDetails(BatchOrganizationRegistrationTasksDetails source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

