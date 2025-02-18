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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTaskResult extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 异步查询结果： 0表示任务进行中、 1表示任务成功、 2表示任务失败、3表示未授权服务角色导致任务失败、4表示有未解绑的云资源导致任务失败、5表示查询关联云资源超时导致任务失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误信息
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
    * 当前结果缓存时间
    */
    @SerializedName("CacheTime")
    @Expose
    private String CacheTime;

    /**
    * 包含的域名
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 异步查询结果： 0表示任务进行中、 1表示任务成功、 2表示任务失败、3表示未授权服务角色导致任务失败、4表示有未解绑的云资源导致任务失败、5表示查询关联云资源超时导致任务失败 
     * @return Status 异步查询结果： 0表示任务进行中、 1表示任务成功、 2表示任务失败、3表示未授权服务角色导致任务失败、4表示有未解绑的云资源导致任务失败、5表示查询关联云资源超时导致任务失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 异步查询结果： 0表示任务进行中、 1表示任务成功、 2表示任务失败、3表示未授权服务角色导致任务失败、4表示有未解绑的云资源导致任务失败、5表示查询关联云资源超时导致任务失败
     * @param Status 异步查询结果： 0表示任务进行中、 1表示任务成功、 2表示任务失败、3表示未授权服务角色导致任务失败、4表示有未解绑的云资源导致任务失败、5表示查询关联云资源超时导致任务失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息 
     * @return Error 错误信息
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
     * @param Error 错误信息
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * Get 当前结果缓存时间 
     * @return CacheTime 当前结果缓存时间
     */
    public String getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 当前结果缓存时间
     * @param CacheTime 当前结果缓存时间
     */
    public void setCacheTime(String CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get 包含的域名 
     * @return Domains 包含的域名
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 包含的域名
     * @param Domains 包含的域名
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DeleteTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskResult(DeleteTaskResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new String(source.CacheTime);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

