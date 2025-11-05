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

public class CreateDataFlowRequest extends AbstractModel {

    /**
    * 文件系统 ID ，通过查询文件系统 [DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 获取
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 源端数据类型；包含S3_COS，S3_L5 
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * 源端存储地址
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * 源端路径
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * 文件系统内目标路径
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

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
    * 数据流动名称；支持不超过64字符长度，支持中文、数字、_、-
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    *  0：不开启自动更新  1：开启自动更新
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * KafkaConsumer 消费时使用的Topic参数
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * 	服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Kafka消费用户名.示例值：name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Kafka消费用户密码。默认${SecretId}#${SecretKey}。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get 源端数据类型；包含S3_COS，S3_L5  
     * @return SourceStorageType 源端数据类型；包含S3_COS，S3_L5 
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set 源端数据类型；包含S3_COS，S3_L5 
     * @param SourceStorageType 源端数据类型；包含S3_COS，S3_L5 
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get 源端存储地址 
     * @return SourceStorageAddress 源端存储地址
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set 源端存储地址
     * @param SourceStorageAddress 源端存储地址
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get 源端路径 
     * @return SourcePath 源端路径
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set 源端路径
     * @param SourcePath 源端路径
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get 文件系统内目标路径 
     * @return TargetPath 文件系统内目标路径
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 文件系统内目标路径
     * @param TargetPath 文件系统内目标路径
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
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
     * Get  0：不开启自动更新  1：开启自动更新 
     * @return AutoRefresh  0：不开启自动更新  1：开启自动更新
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set  0：不开启自动更新  1：开启自动更新
     * @param AutoRefresh  0：不开启自动更新  1：开启自动更新
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    /**
     * Get KafkaConsumer 消费时使用的Topic参数 
     * @return UserKafkaTopic KafkaConsumer 消费时使用的Topic参数
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set KafkaConsumer 消费时使用的Topic参数
     * @param UserKafkaTopic KafkaConsumer 消费时使用的Topic参数
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get 	服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095 
     * @return ServerAddr 	服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 	服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095
     * @param ServerAddr 	服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Kafka消费用户名.示例值：name 
     * @return UserName Kafka消费用户名.示例值：name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Kafka消费用户名.示例值：name
     * @param UserName Kafka消费用户名.示例值：name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Kafka消费用户密码。默认${SecretId}#${SecretKey}。 
     * @return Password Kafka消费用户密码。默认${SecretId}#${SecretKey}。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Kafka消费用户密码。默认${SecretId}#${SecretKey}。
     * @param Password Kafka消费用户密码。默认${SecretId}#${SecretKey}。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public CreateDataFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataFlowRequest(CreateDataFlowRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.SourceStorageType != null) {
            this.SourceStorageType = new String(source.SourceStorageType);
        }
        if (source.SourceStorageAddress != null) {
            this.SourceStorageAddress = new String(source.SourceStorageAddress);
        }
        if (source.SourcePath != null) {
            this.SourcePath = new String(source.SourcePath);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.DataFlowName != null) {
            this.DataFlowName = new String(source.DataFlowName);
        }
        if (source.AutoRefresh != null) {
            this.AutoRefresh = new Long(source.AutoRefresh);
        }
        if (source.UserKafkaTopic != null) {
            this.UserKafkaTopic = new String(source.UserKafkaTopic);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "SourceStorageType", this.SourceStorageType);
        this.setParamSimple(map, prefix + "SourceStorageAddress", this.SourceStorageAddress);
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "DataFlowName", this.DataFlowName);
        this.setParamSimple(map, prefix + "AutoRefresh", this.AutoRefresh);
        this.setParamSimple(map, prefix + "UserKafkaTopic", this.UserKafkaTopic);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

