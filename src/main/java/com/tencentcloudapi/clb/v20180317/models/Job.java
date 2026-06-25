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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel {

    /**
    * <p>接口名称</p>
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * <p>请求ID</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>异步任务状态</p><p>枚举值：</p><ul><li>Processing： 进行中</li><li>Succeeded： 成功</li><li>Failed： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get <p>接口名称</p> 
     * @return ApiName <p>接口名称</p>
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set <p>接口名称</p>
     * @param ApiName <p>接口名称</p>
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get <p>请求ID</p> 
     * @return RequestId <p>请求ID</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>请求ID</p>
     * @param RequestId <p>请求ID</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>异步任务状态</p><p>枚举值：</p><ul><li>Processing： 进行中</li><li>Succeeded： 成功</li><li>Failed： 失败</li></ul> 
     * @return Status <p>异步任务状态</p><p>枚举值：</p><ul><li>Processing： 进行中</li><li>Succeeded： 成功</li><li>Failed： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>异步任务状态</p><p>枚举值：</p><ul><li>Processing： 进行中</li><li>Succeeded： 成功</li><li>Failed： 失败</li></ul>
     * @param Status <p>异步任务状态</p><p>枚举值：</p><ul><li>Processing： 进行中</li><li>Succeeded： 成功</li><li>Failed： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源ID</p> 
     * @return ResourceIds <p>资源ID</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceIds <p>资源ID</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

