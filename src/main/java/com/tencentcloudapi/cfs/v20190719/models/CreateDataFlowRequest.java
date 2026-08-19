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
    * <p>文件系统 ID ，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>源端数据类型；包含S3_COS，S3_L5</p>
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * <p>源端存储地址</p>
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * <p>源端路径</p>
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>密钥 ID</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>密钥 key</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>数据流动名称；支持不超过64字符长度，支持中文、数字、_、-</p>
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * <p>0：不开启自动更新  1：开启自动更新</p>
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * <p>KafkaConsumer 消费时使用的Topic参数</p>
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * <p>服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * <p>Kafka消费用户名.示例值：name</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Kafka消费用户密码。默认${SecretId}#${SecretKey}。</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <p>文件系统 ID ，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p> 
     * @return FileSystemId <p>文件系统 ID ，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID ，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
     * @param FileSystemId <p>文件系统 ID ，通过查询文件系统 <a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a> 获取</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>源端数据类型；包含S3_COS，S3_L5</p> 
     * @return SourceStorageType <p>源端数据类型；包含S3_COS，S3_L5</p>
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set <p>源端数据类型；包含S3_COS，S3_L5</p>
     * @param SourceStorageType <p>源端数据类型；包含S3_COS，S3_L5</p>
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get <p>源端存储地址</p> 
     * @return SourceStorageAddress <p>源端存储地址</p>
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set <p>源端存储地址</p>
     * @param SourceStorageAddress <p>源端存储地址</p>
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get <p>源端路径</p> 
     * @return SourcePath <p>源端路径</p>
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set <p>源端路径</p>
     * @param SourcePath <p>源端路径</p>
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul> 
     * @return TargetPath <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
     * @param TargetPath <p>设置数据流动时指定的文件系统内目标路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需将对象存储上的源端目录与挂载路径下的 test1/test2 建立映射关系，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>密钥 ID</p> 
     * @return SecretId <p>密钥 ID</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>密钥 ID</p>
     * @param SecretId <p>密钥 ID</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>密钥 key</p> 
     * @return SecretKey <p>密钥 key</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>密钥 key</p>
     * @param SecretKey <p>密钥 key</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>数据流动名称；支持不超过64字符长度，支持中文、数字、_、-</p> 
     * @return DataFlowName <p>数据流动名称；支持不超过64字符长度，支持中文、数字、_、-</p>
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set <p>数据流动名称；支持不超过64字符长度，支持中文、数字、_、-</p>
     * @param DataFlowName <p>数据流动名称；支持不超过64字符长度，支持中文、数字、_、-</p>
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get <p>0：不开启自动更新  1：开启自动更新</p> 
     * @return AutoRefresh <p>0：不开启自动更新  1：开启自动更新</p>
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set <p>0：不开启自动更新  1：开启自动更新</p>
     * @param AutoRefresh <p>0：不开启自动更新  1：开启自动更新</p>
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    /**
     * Get <p>KafkaConsumer 消费时使用的Topic参数</p> 
     * @return UserKafkaTopic <p>KafkaConsumer 消费时使用的Topic参数</p>
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set <p>KafkaConsumer 消费时使用的Topic参数</p>
     * @param UserKafkaTopic <p>KafkaConsumer 消费时使用的Topic参数</p>
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get <p>服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p> 
     * @return ServerAddr <p>服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set <p>服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
     * @param ServerAddr <p>服务地址 示例值：kafkaconsumer-ap-beijing.cls.tencentyun.com:9095</p>
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get <p>Kafka消费用户名.示例值：name</p> 
     * @return UserName <p>Kafka消费用户名.示例值：name</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Kafka消费用户名.示例值：name</p>
     * @param UserName <p>Kafka消费用户名.示例值：name</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Kafka消费用户密码。默认${SecretId}#${SecretKey}。</p> 
     * @return Password <p>Kafka消费用户密码。默认${SecretId}#${SecretKey}。</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Kafka消费用户密码。默认${SecretId}#${SecretKey}。</p>
     * @param Password <p>Kafka消费用户密码。默认${SecretId}#${SecretKey}。</p>
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

