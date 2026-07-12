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

public class CreateContractComparisonTaskRequest extends AbstractModel {

    /**
    * <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>原版文件ID，对比基准的旧版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
    */
    @SerializedName("OriginFileResourceId")
    @Expose
    private String OriginFileResourceId;

    /**
    * <p>新版文件ID，与旧版进行对比的新版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
    */
    @SerializedName("DiffFileResourceId")
    @Expose
    private String DiffFileResourceId;

    /**
    * <p>对比任务备注，长度不能超过50个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2">回调通知</a>模块。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>文档修订操作类型，对比任务执行前处理修订内容，适用于doc、docx存在修订情况。<br> 类型如下： <ul> <li> <strong>0</strong>：不做任何操作</li> <li> <strong>1</strong>：接受所有修订</li> </ul></p>
    */
    @SerializedName("RevisionOperation")
    @Expose
    private Long RevisionOperation;

    /**
     * Get <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>原版文件ID，对比基准的旧版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p> 
     * @return OriginFileResourceId <p>原版文件ID，对比基准的旧版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
     */
    public String getOriginFileResourceId() {
        return this.OriginFileResourceId;
    }

    /**
     * Set <p>原版文件ID，对比基准的旧版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
     * @param OriginFileResourceId <p>原版文件ID，对比基准的旧版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
     */
    public void setOriginFileResourceId(String OriginFileResourceId) {
        this.OriginFileResourceId = OriginFileResourceId;
    }

    /**
     * Get <p>新版文件ID，与旧版进行对比的新版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p> 
     * @return DiffFileResourceId <p>新版文件ID，与旧版进行对比的新版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
     */
    public String getDiffFileResourceId() {
        return this.DiffFileResourceId;
    }

    /**
     * Set <p>新版文件ID，与旧版进行对比的新版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
     * @param DiffFileResourceId <p>新版文件ID，与旧版进行对比的新版本文件唯一标识，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a>接口获取文件资源ID。</p>
     */
    public void setDiffFileResourceId(String DiffFileResourceId) {
        this.DiffFileResourceId = DiffFileResourceId;
    }

    /**
     * Get <p>对比任务备注，长度不能超过50个字符。</p> 
     * @return Comment <p>对比任务备注，长度不能超过50个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>对比任务备注，长度不能超过50个字符。</p>
     * @param Comment <p>对比任务备注，长度不能超过50个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2">回调通知</a>模块。</p> 
     * @return UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2">回调通知</a>模块。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2">回调通知</a>模块。</p>
     * @param UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 1024长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2">回调通知</a>模块。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。</p> 
     * @return Tags <p>标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。</p>
     * @param Tags <p>标签列表，用户自定义的键值对（Key-Value），可绑定到资源上，用于资源的分类、管理和访问控制。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>文档修订操作类型，对比任务执行前处理修订内容，适用于doc、docx存在修订情况。<br> 类型如下： <ul> <li> <strong>0</strong>：不做任何操作</li> <li> <strong>1</strong>：接受所有修订</li> </ul></p> 
     * @return RevisionOperation <p>文档修订操作类型，对比任务执行前处理修订内容，适用于doc、docx存在修订情况。<br> 类型如下： <ul> <li> <strong>0</strong>：不做任何操作</li> <li> <strong>1</strong>：接受所有修订</li> </ul></p>
     */
    public Long getRevisionOperation() {
        return this.RevisionOperation;
    }

    /**
     * Set <p>文档修订操作类型，对比任务执行前处理修订内容，适用于doc、docx存在修订情况。<br> 类型如下： <ul> <li> <strong>0</strong>：不做任何操作</li> <li> <strong>1</strong>：接受所有修订</li> </ul></p>
     * @param RevisionOperation <p>文档修订操作类型，对比任务执行前处理修订内容，适用于doc、docx存在修订情况。<br> 类型如下： <ul> <li> <strong>0</strong>：不做任何操作</li> <li> <strong>1</strong>：接受所有修订</li> </ul></p>
     */
    public void setRevisionOperation(Long RevisionOperation) {
        this.RevisionOperation = RevisionOperation;
    }

    public CreateContractComparisonTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateContractComparisonTaskRequest(CreateContractComparisonTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.OriginFileResourceId != null) {
            this.OriginFileResourceId = new String(source.OriginFileResourceId);
        }
        if (source.DiffFileResourceId != null) {
            this.DiffFileResourceId = new String(source.DiffFileResourceId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RevisionOperation != null) {
            this.RevisionOperation = new Long(source.RevisionOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "OriginFileResourceId", this.OriginFileResourceId);
        this.setParamSimple(map, prefix + "DiffFileResourceId", this.DiffFileResourceId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RevisionOperation", this.RevisionOperation);

    }
}

