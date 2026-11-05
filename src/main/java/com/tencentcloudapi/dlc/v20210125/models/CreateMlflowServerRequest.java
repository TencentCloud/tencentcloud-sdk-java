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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMlflowServerRequest extends AbstractModel {

    /**
    * <p>MlFlow Server 名称</p>
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * <p>资源分区 ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>资源组（逻辑队列名，可选）</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>MlFlow 镜像</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>存储配置 JSON，按 StorageMode 解释：cos={bucket,region,path}，cfs={fileSystemId,path}（cos/cfs 必填，local 为空）</p>
    */
    @SerializedName("StorageConfig")
    @Expose
    private String StorageConfig;

    /**
    * <p>存储模式: cos / cfs / local</p>
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>MlFlow的资源配置</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private MlFlowResourceConfig ResourceConfig;

    /**
    * <p>启动参数（可选，单个字符串，如 &quot;--workers 4&quot;）；分词后追加在平台固定命令之后，下次 start 时生效。平台保留参数（--host/--port/--backend-store-uri 等）不允许指定；不传或空白为默认命令</p>
    */
    @SerializedName("ServerArgs")
    @Expose
    private String ServerArgs;

    /**
    * <p>标签列表（TagKey-TagValue），用于将 MLflow Server 与腾讯云标签系统中的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>描述信息（可选，纯文本，不允许换行，最长 1024）；不传或空白为未填写</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>MlFlow Server 名称</p> 
     * @return ServerName <p>MlFlow Server 名称</p>
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set <p>MlFlow Server 名称</p>
     * @param ServerName <p>MlFlow Server 名称</p>
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get <p>资源分区 ID</p> 
     * @return ResourcePartitionId <p>资源分区 ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID</p>
     * @param ResourcePartitionId <p>资源分区 ID</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>资源组（逻辑队列名，可选）</p> 
     * @return Queue <p>资源组（逻辑队列名，可选）</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>资源组（逻辑队列名，可选）</p>
     * @param Queue <p>资源组（逻辑队列名，可选）</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>MlFlow 镜像</p> 
     * @return Image <p>MlFlow 镜像</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>MlFlow 镜像</p>
     * @param Image <p>MlFlow 镜像</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>存储配置 JSON，按 StorageMode 解释：cos={bucket,region,path}，cfs={fileSystemId,path}（cos/cfs 必填，local 为空）</p> 
     * @return StorageConfig <p>存储配置 JSON，按 StorageMode 解释：cos={bucket,region,path}，cfs={fileSystemId,path}（cos/cfs 必填，local 为空）</p>
     */
    public String getStorageConfig() {
        return this.StorageConfig;
    }

    /**
     * Set <p>存储配置 JSON，按 StorageMode 解释：cos={bucket,region,path}，cfs={fileSystemId,path}（cos/cfs 必填，local 为空）</p>
     * @param StorageConfig <p>存储配置 JSON，按 StorageMode 解释：cos={bucket,region,path}，cfs={fileSystemId,path}（cos/cfs 必填，local 为空）</p>
     */
    public void setStorageConfig(String StorageConfig) {
        this.StorageConfig = StorageConfig;
    }

    /**
     * Get <p>存储模式: cos / cfs / local</p> 
     * @return StorageMode <p>存储模式: cos / cfs / local</p>
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式: cos / cfs / local</p>
     * @param StorageMode <p>存储模式: cos / cfs / local</p>
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>MlFlow的资源配置</p> 
     * @return ResourceConfig <p>MlFlow的资源配置</p>
     */
    public MlFlowResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>MlFlow的资源配置</p>
     * @param ResourceConfig <p>MlFlow的资源配置</p>
     */
    public void setResourceConfig(MlFlowResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>启动参数（可选，单个字符串，如 &quot;--workers 4&quot;）；分词后追加在平台固定命令之后，下次 start 时生效。平台保留参数（--host/--port/--backend-store-uri 等）不允许指定；不传或空白为默认命令</p> 
     * @return ServerArgs <p>启动参数（可选，单个字符串，如 &quot;--workers 4&quot;）；分词后追加在平台固定命令之后，下次 start 时生效。平台保留参数（--host/--port/--backend-store-uri 等）不允许指定；不传或空白为默认命令</p>
     */
    public String getServerArgs() {
        return this.ServerArgs;
    }

    /**
     * Set <p>启动参数（可选，单个字符串，如 &quot;--workers 4&quot;）；分词后追加在平台固定命令之后，下次 start 时生效。平台保留参数（--host/--port/--backend-store-uri 等）不允许指定；不传或空白为默认命令</p>
     * @param ServerArgs <p>启动参数（可选，单个字符串，如 &quot;--workers 4&quot;）；分词后追加在平台固定命令之后，下次 start 时生效。平台保留参数（--host/--port/--backend-store-uri 等）不允许指定；不传或空白为默认命令</p>
     */
    public void setServerArgs(String ServerArgs) {
        this.ServerArgs = ServerArgs;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue），用于将 MLflow Server 与腾讯云标签系统中的标签绑定</p> 
     * @return Tags <p>标签列表（TagKey-TagValue），用于将 MLflow Server 与腾讯云标签系统中的标签绑定</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue），用于将 MLflow Server 与腾讯云标签系统中的标签绑定</p>
     * @param Tags <p>标签列表（TagKey-TagValue），用于将 MLflow Server 与腾讯云标签系统中的标签绑定</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>描述信息（可选，纯文本，不允许换行，最长 1024）；不传或空白为未填写</p> 
     * @return Description <p>描述信息（可选，纯文本，不允许换行，最长 1024）；不传或空白为未填写</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息（可选，纯文本，不允许换行，最长 1024）；不传或空白为未填写</p>
     * @param Description <p>描述信息（可选，纯文本，不允许换行，最长 1024）；不传或空白为未填写</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateMlflowServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMlflowServerRequest(CreateMlflowServerRequest source) {
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.StorageConfig != null) {
            this.StorageConfig = new String(source.StorageConfig);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new MlFlowResourceConfig(source.ResourceConfig);
        }
        if (source.ServerArgs != null) {
            this.ServerArgs = new String(source.ServerArgs);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "StorageConfig", this.StorageConfig);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "ServerArgs", this.ServerArgs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

