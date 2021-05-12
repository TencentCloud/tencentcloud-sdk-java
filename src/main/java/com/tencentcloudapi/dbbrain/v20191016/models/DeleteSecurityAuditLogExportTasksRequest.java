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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityAuditLogExportTasksRequest extends AbstractModel{

    /**
    * 安全审计组Id。
    */
    @SerializedName("SecAuditGroupId")
    @Expose
    private String SecAuditGroupId;

    /**
    * 日志导出任务Id列表，接口会忽略不存在或已删除的任务Id。
    */
    @SerializedName("AsyncRequestIds")
    @Expose
    private Long [] AsyncRequestIds;

    /**
    * 服务产品类型，支持值： "mysql" - 云数据库 MySQL。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 安全审计组Id。 
     * @return SecAuditGroupId 安全审计组Id。
     */
    public String getSecAuditGroupId() {
        return this.SecAuditGroupId;
    }

    /**
     * Set 安全审计组Id。
     * @param SecAuditGroupId 安全审计组Id。
     */
    public void setSecAuditGroupId(String SecAuditGroupId) {
        this.SecAuditGroupId = SecAuditGroupId;
    }

    /**
     * Get 日志导出任务Id列表，接口会忽略不存在或已删除的任务Id。 
     * @return AsyncRequestIds 日志导出任务Id列表，接口会忽略不存在或已删除的任务Id。
     */
    public Long [] getAsyncRequestIds() {
        return this.AsyncRequestIds;
    }

    /**
     * Set 日志导出任务Id列表，接口会忽略不存在或已删除的任务Id。
     * @param AsyncRequestIds 日志导出任务Id列表，接口会忽略不存在或已删除的任务Id。
     */
    public void setAsyncRequestIds(Long [] AsyncRequestIds) {
        this.AsyncRequestIds = AsyncRequestIds;
    }

    /**
     * Get 服务产品类型，支持值： "mysql" - 云数据库 MySQL。 
     * @return Product 服务产品类型，支持值： "mysql" - 云数据库 MySQL。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值： "mysql" - 云数据库 MySQL。
     * @param Product 服务产品类型，支持值： "mysql" - 云数据库 MySQL。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DeleteSecurityAuditLogExportTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityAuditLogExportTasksRequest(DeleteSecurityAuditLogExportTasksRequest source) {
        if (source.SecAuditGroupId != null) {
            this.SecAuditGroupId = new String(source.SecAuditGroupId);
        }
        if (source.AsyncRequestIds != null) {
            this.AsyncRequestIds = new Long[source.AsyncRequestIds.length];
            for (int i = 0; i < source.AsyncRequestIds.length; i++) {
                this.AsyncRequestIds[i] = new Long(source.AsyncRequestIds[i]);
            }
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecAuditGroupId", this.SecAuditGroupId);
        this.setParamArraySimple(map, prefix + "AsyncRequestIds.", this.AsyncRequestIds);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

