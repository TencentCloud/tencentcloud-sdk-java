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

public class DescribeApiKeyListRequest extends AbstractModel {

    /**
    * 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 分页查询的页码，从 1 开始。与 PageSize 配合使用，不传则默认返回第 1 页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页查询每页返回的记录条数。与 PageNumber 配合使用，不传则使用系统默认值
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 密钥类型过滤条件。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限）、publish_key（客户端使用的公开密钥，权限受限）密钥类型过滤条件。不传默认值为api_key
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
     * Get 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离 
     * @return EnvId 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     * @param EnvId 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 分页查询的页码，从 1 开始。与 PageSize 配合使用，不传则默认返回第 1 页 
     * @return PageNumber 分页查询的页码，从 1 开始。与 PageSize 配合使用，不传则默认返回第 1 页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页查询的页码，从 1 开始。与 PageSize 配合使用，不传则默认返回第 1 页
     * @param PageNumber 分页查询的页码，从 1 开始。与 PageSize 配合使用，不传则默认返回第 1 页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页查询每页返回的记录条数。与 PageNumber 配合使用，不传则使用系统默认值 
     * @return PageSize 分页查询每页返回的记录条数。与 PageNumber 配合使用，不传则使用系统默认值
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页查询每页返回的记录条数。与 PageNumber 配合使用，不传则使用系统默认值
     * @param PageSize 分页查询每页返回的记录条数。与 PageNumber 配合使用，不传则使用系统默认值
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 密钥类型过滤条件。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限）、publish_key（客户端使用的公开密钥，权限受限）密钥类型过滤条件。不传默认值为api_key 
     * @return KeyType 密钥类型过滤条件。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限）、publish_key（客户端使用的公开密钥，权限受限）密钥类型过滤条件。不传默认值为api_key
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 密钥类型过滤条件。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限）、publish_key（客户端使用的公开密钥，权限受限）密钥类型过滤条件。不传默认值为api_key
     * @param KeyType 密钥类型过滤条件。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限）、publish_key（客户端使用的公开密钥，权限受限）密钥类型过滤条件。不传默认值为api_key
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    public DescribeApiKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiKeyListRequest(DescribeApiKeyListRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);

    }
}

