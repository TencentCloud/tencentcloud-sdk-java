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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceCachePurgeTask extends AbstractModel {

    /**
    * <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO</li><li>TCBCDN： 云开发cdn</li></ul><p>默认值：EO</p>
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>TIMEOUT： 超时</li><li>CANCELED： 取消</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>刷新类型</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * <p>清除缓存分为直接删除和标记过期两种方式。URL 类型默认为“直接删除”，其它清除类型默认为“标记过期”</p><p>枚举值：</p><ul><li>INVALIDATE： 标记过期：节点缓存标记为过期，用户请求时回源校验，源站 304 则复用，200 则更新</li><li>DELETE： 直接删除：从节点直接删除缓存，用户下次请求强制回源拉新</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>刷新目标列表（URL / 前缀 / host）</p>
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>任务创建时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务更新时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO</li><li>TCBCDN： 云开发cdn</li></ul><p>默认值：EO</p> 
     * @return CacheType <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO</li><li>TCBCDN： 云开发cdn</li></ul><p>默认值：EO</p>
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO</li><li>TCBCDN： 云开发cdn</li></ul><p>默认值：EO</p>
     * @param CacheType <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO</li><li>TCBCDN： 云开发cdn</li></ul><p>默认值：EO</p>
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>TIMEOUT： 超时</li><li>CANCELED： 取消</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>TIMEOUT： 超时</li><li>CANCELED： 取消</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>TIMEOUT： 超时</li><li>CANCELED： 取消</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAILED： 失败</li><li>TIMEOUT： 超时</li><li>CANCELED： 取消</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>刷新类型</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul> 
     * @return PurgeType <p>刷新类型</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set <p>刷新类型</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
     * @param PurgeType <p>刷新类型</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * Get <p>清除缓存分为直接删除和标记过期两种方式。URL 类型默认为“直接删除”，其它清除类型默认为“标记过期”</p><p>枚举值：</p><ul><li>INVALIDATE： 标记过期：节点缓存标记为过期，用户请求时回源校验，源站 304 则复用，200 则更新</li><li>DELETE： 直接删除：从节点直接删除缓存，用户下次请求强制回源拉新</li></ul> 
     * @return Method <p>清除缓存分为直接删除和标记过期两种方式。URL 类型默认为“直接删除”，其它清除类型默认为“标记过期”</p><p>枚举值：</p><ul><li>INVALIDATE： 标记过期：节点缓存标记为过期，用户请求时回源校验，源站 304 则复用，200 则更新</li><li>DELETE： 直接删除：从节点直接删除缓存，用户下次请求强制回源拉新</li></ul>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>清除缓存分为直接删除和标记过期两种方式。URL 类型默认为“直接删除”，其它清除类型默认为“标记过期”</p><p>枚举值：</p><ul><li>INVALIDATE： 标记过期：节点缓存标记为过期，用户请求时回源校验，源站 304 则复用，200 则更新</li><li>DELETE： 直接删除：从节点直接删除缓存，用户下次请求强制回源拉新</li></ul>
     * @param Method <p>清除缓存分为直接删除和标记过期两种方式。URL 类型默认为“直接删除”，其它清除类型默认为“标记过期”</p><p>枚举值：</p><ul><li>INVALIDATE： 标记过期：节点缓存标记为过期，用户请求时回源校验，源站 304 则复用，200 则更新</li><li>DELETE： 直接删除：从节点直接删除缓存，用户下次请求强制回源拉新</li></ul>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>刷新目标列表（URL / 前缀 / host）</p> 
     * @return Targets <p>刷新目标列表（URL / 前缀 / host）</p>
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>刷新目标列表（URL / 前缀 / host）</p>
     * @param Targets <p>刷新目标列表（URL / 前缀 / host）</p>
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>失败原因</p> 
     * @return FailReason <p>失败原因</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因</p>
     * @param FailReason <p>失败原因</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>任务创建时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p> 
     * @return CreateTime <p>任务创建时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     * @param CreateTime <p>任务创建时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务更新时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p> 
     * @return UpdateTime <p>任务更新时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务更新时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     * @param UpdateTime <p>任务更新时间</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public HTTPServiceCachePurgeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceCachePurgeTask(HTTPServiceCachePurgeTask source) {
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PurgeType != null) {
            this.PurgeType = new String(source.PurgeType);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

