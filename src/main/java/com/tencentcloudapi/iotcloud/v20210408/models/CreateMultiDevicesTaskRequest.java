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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMultiDevicesTaskRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 参数类型 cosfile-文件上传 random-随机创建
    */
    @SerializedName("ParametersType")
    @Expose
    private String ParametersType;

    /**
    * 文件上传类型时文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件上传类型时文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 随机创建时设备创建个数
    */
    @SerializedName("BatchCount")
    @Expose
    private Long BatchCount;

    /**
    * 文件上传类型时文件md5值
    */
    @SerializedName("Hash")
    @Expose
    private String Hash;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 参数类型 cosfile-文件上传 random-随机创建 
     * @return ParametersType 参数类型 cosfile-文件上传 random-随机创建
     */
    public String getParametersType() {
        return this.ParametersType;
    }

    /**
     * Set 参数类型 cosfile-文件上传 random-随机创建
     * @param ParametersType 参数类型 cosfile-文件上传 random-随机创建
     */
    public void setParametersType(String ParametersType) {
        this.ParametersType = ParametersType;
    }

    /**
     * Get 文件上传类型时文件名 
     * @return FileName 文件上传类型时文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件上传类型时文件名
     * @param FileName 文件上传类型时文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件上传类型时文件大小 
     * @return FileSize 文件上传类型时文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件上传类型时文件大小
     * @param FileSize 文件上传类型时文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 随机创建时设备创建个数 
     * @return BatchCount 随机创建时设备创建个数
     */
    public Long getBatchCount() {
        return this.BatchCount;
    }

    /**
     * Set 随机创建时设备创建个数
     * @param BatchCount 随机创建时设备创建个数
     */
    public void setBatchCount(Long BatchCount) {
        this.BatchCount = BatchCount;
    }

    /**
     * Get 文件上传类型时文件md5值 
     * @return Hash 文件上传类型时文件md5值
     */
    public String getHash() {
        return this.Hash;
    }

    /**
     * Set 文件上传类型时文件md5值
     * @param Hash 文件上传类型时文件md5值
     */
    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    public CreateMultiDevicesTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMultiDevicesTaskRequest(CreateMultiDevicesTaskRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ParametersType != null) {
            this.ParametersType = new String(source.ParametersType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.BatchCount != null) {
            this.BatchCount = new Long(source.BatchCount);
        }
        if (source.Hash != null) {
            this.Hash = new String(source.Hash);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ParametersType", this.ParametersType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "BatchCount", this.BatchCount);
        this.setParamSimple(map, prefix + "Hash", this.Hash);

    }
}

