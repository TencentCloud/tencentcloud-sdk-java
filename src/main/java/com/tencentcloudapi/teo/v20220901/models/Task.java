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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * 任务 ID。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 资源。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 任务类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点缓存清除方法，取值有：
<li>invalidate：标记过期，用户请求时触发回源校验，即发送带有 If-None-Match 和 If-Modified-Since 头部的 HTTP 条件请求。若源站响应 200，则节点会回源拉取新的资源并更新缓存；若源站响应 304，则节点不会更新缓存；</li>
<li>delete：直接删除节点缓存，用户请求时触发回源拉取资源。</li>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 状态。取值有：
<li>processing：处理中；</li>
<li>success：成功；</li>
<li>failed：失败；</li>
<li>timeout：超时；</li>
<li>canceled：已取消。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务完成时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 刷新、预热失败类型。取值有：
<li>taskFailed：任务失败；</li>
<li>quotaExceeded：配额超限；</li>
<li>downloadManifestFailed：下载描述文件失败；</li>
<li>accessDenied：访问被拒绝。</li>
<li>originPullFailed：回源失败。</li>
    */
    @SerializedName("FailType")
    @Expose
    private String FailType;

    /**
    * 清除缓存、预热缓存的失败原因描述。
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
     * Get 任务 ID。 
     * @return JobId 任务 ID。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务 ID。
     * @param JobId 任务 ID。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 资源。 
     * @return Target 资源。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 资源。
     * @param Target 资源。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 任务类型。 
     * @return Type 任务类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型。
     * @param Type 任务类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 节点缓存清除方法，取值有：
<li>invalidate：标记过期，用户请求时触发回源校验，即发送带有 If-None-Match 和 If-Modified-Since 头部的 HTTP 条件请求。若源站响应 200，则节点会回源拉取新的资源并更新缓存；若源站响应 304，则节点不会更新缓存；</li>
<li>delete：直接删除节点缓存，用户请求时触发回源拉取资源。</li> 
     * @return Method 节点缓存清除方法，取值有：
<li>invalidate：标记过期，用户请求时触发回源校验，即发送带有 If-None-Match 和 If-Modified-Since 头部的 HTTP 条件请求。若源站响应 200，则节点会回源拉取新的资源并更新缓存；若源站响应 304，则节点不会更新缓存；</li>
<li>delete：直接删除节点缓存，用户请求时触发回源拉取资源。</li>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 节点缓存清除方法，取值有：
<li>invalidate：标记过期，用户请求时触发回源校验，即发送带有 If-None-Match 和 If-Modified-Since 头部的 HTTP 条件请求。若源站响应 200，则节点会回源拉取新的资源并更新缓存；若源站响应 304，则节点不会更新缓存；</li>
<li>delete：直接删除节点缓存，用户请求时触发回源拉取资源。</li>
     * @param Method 节点缓存清除方法，取值有：
<li>invalidate：标记过期，用户请求时触发回源校验，即发送带有 If-None-Match 和 If-Modified-Since 头部的 HTTP 条件请求。若源站响应 200，则节点会回源拉取新的资源并更新缓存；若源站响应 304，则节点不会更新缓存；</li>
<li>delete：直接删除节点缓存，用户请求时触发回源拉取资源。</li>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 状态。取值有：
<li>processing：处理中；</li>
<li>success：成功；</li>
<li>failed：失败；</li>
<li>timeout：超时；</li>
<li>canceled：已取消。</li> 
     * @return Status 状态。取值有：
<li>processing：处理中；</li>
<li>success：成功；</li>
<li>failed：失败；</li>
<li>timeout：超时；</li>
<li>canceled：已取消。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。取值有：
<li>processing：处理中；</li>
<li>success：成功；</li>
<li>failed：失败；</li>
<li>timeout：超时；</li>
<li>canceled：已取消。</li>
     * @param Status 状态。取值有：
<li>processing：处理中；</li>
<li>success：成功；</li>
<li>failed：失败；</li>
<li>timeout：超时；</li>
<li>canceled：已取消。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务完成时间。 
     * @return UpdateTime 任务完成时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务完成时间。
     * @param UpdateTime 任务完成时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 刷新、预热失败类型。取值有：
<li>taskFailed：任务失败；</li>
<li>quotaExceeded：配额超限；</li>
<li>downloadManifestFailed：下载描述文件失败；</li>
<li>accessDenied：访问被拒绝。</li>
<li>originPullFailed：回源失败。</li> 
     * @return FailType 刷新、预热失败类型。取值有：
<li>taskFailed：任务失败；</li>
<li>quotaExceeded：配额超限；</li>
<li>downloadManifestFailed：下载描述文件失败；</li>
<li>accessDenied：访问被拒绝。</li>
<li>originPullFailed：回源失败。</li>
     */
    public String getFailType() {
        return this.FailType;
    }

    /**
     * Set 刷新、预热失败类型。取值有：
<li>taskFailed：任务失败；</li>
<li>quotaExceeded：配额超限；</li>
<li>downloadManifestFailed：下载描述文件失败；</li>
<li>accessDenied：访问被拒绝。</li>
<li>originPullFailed：回源失败。</li>
     * @param FailType 刷新、预热失败类型。取值有：
<li>taskFailed：任务失败；</li>
<li>quotaExceeded：配额超限；</li>
<li>downloadManifestFailed：下载描述文件失败；</li>
<li>accessDenied：访问被拒绝。</li>
<li>originPullFailed：回源失败。</li>
     */
    public void setFailType(String FailType) {
        this.FailType = FailType;
    }

    /**
     * Get 清除缓存、预热缓存的失败原因描述。 
     * @return FailMessage 清除缓存、预热缓存的失败原因描述。
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 清除缓存、预热缓存的失败原因描述。
     * @param FailMessage 清除缓存、预热缓存的失败原因描述。
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FailType != null) {
            this.FailType = new String(source.FailType);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FailType", this.FailType);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);

    }
}

