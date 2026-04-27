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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogFilesRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>产品名称</p><p>入参限制：postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>日志文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>查询限制</p><p>取值范围：[1, 300]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p><p>取值范围：[0, 1000]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>产品名称</p><p>入参限制：postgres</p> 
     * @return Product <p>产品名称</p><p>入参限制：postgres</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品名称</p><p>入参限制：postgres</p>
     * @param Product <p>产品名称</p><p>入参限制：postgres</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>日志文件名称</p> 
     * @return FileName <p>日志文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>日志文件名称</p>
     * @param FileName <p>日志文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>查询限制</p><p>取值范围：[1, 300]</p> 
     * @return Limit <p>查询限制</p><p>取值范围：[1, 300]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询限制</p><p>取值范围：[1, 300]</p>
     * @param Limit <p>查询限制</p><p>取值范围：[1, 300]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p><p>取值范围：[0, 1000]</p> 
     * @return Offset <p>偏移量</p><p>取值范围：[0, 1000]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p><p>取值范围：[0, 1000]</p>
     * @param Offset <p>偏移量</p><p>取值范围：[0, 1000]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAuditLogFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogFilesRequest(DescribeAuditLogFilesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

