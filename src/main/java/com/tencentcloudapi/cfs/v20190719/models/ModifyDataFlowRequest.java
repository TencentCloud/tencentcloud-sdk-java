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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataFlowRequest extends AbstractModel {

    /**
    * 数据流动管理 ID ，通过查询数据流动接口获取
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 数据流动名称；支持不超过64字符长度，支持中文、数字、_、-
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * 密钥 ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 密钥 key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get 数据流动管理 ID ，通过查询数据流动接口获取 
     * @return DataFlowId 数据流动管理 ID ，通过查询数据流动接口获取
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set 数据流动管理 ID ，通过查询数据流动接口获取
     * @param DataFlowId 数据流动管理 ID ，通过查询数据流动接口获取
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取 
     * @return FileSystemId 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     * @param FileSystemId 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 数据流动名称；支持不超过64字符长度，支持中文、数字、_、- 
     * @return DataFlowName 数据流动名称；支持不超过64字符长度，支持中文、数字、_、-
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set 数据流动名称；支持不超过64字符长度，支持中文、数字、_、-
     * @param DataFlowName 数据流动名称；支持不超过64字符长度，支持中文、数字、_、-
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get 密钥 ID 
     * @return SecretId 密钥 ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 密钥 ID
     * @param SecretId 密钥 ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 密钥 key 
     * @return SecretKey 密钥 key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 密钥 key
     * @param SecretKey 密钥 key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public ModifyDataFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataFlowRequest(ModifyDataFlowRequest source) {
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.DataFlowName != null) {
            this.DataFlowName = new String(source.DataFlowName);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "DataFlowName", this.DataFlowName);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

