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

public class DescribeMem0ServiceResponse extends AbstractModel {

    /**
    * <p>mem0服务运行状态</p><p>枚举值：</p><ul><li>running： mem0服务正常运行</li><li>none： 未开通</li><li>creating： 正在开通</li><li>deleting： mem0服务关闭中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Mem0服务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Mem0服务最后更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Mem0服务访问地址</p>
    */
    @SerializedName("InnerAddress")
    @Expose
    private String InnerAddress;

    /**
    * <p>Mem0服务使用的AgenticBase</p>
    */
    @SerializedName("AgenticBaseId")
    @Expose
    private String AgenticBaseId;

    /**
    * <p>Mem0服务使用的LLM提供方</p><p>枚举值：</p><ul><li>tokenhub： 腾讯云大模型服务平台TokenHub</li></ul>
    */
    @SerializedName("LLMMode")
    @Expose
    private String LLMMode;

    /**
    * <p>Mem0服务使用的LLM模型</p>
    */
    @SerializedName("LLMModel")
    @Expose
    private String LLMModel;

    /**
    * <p>Mem0服务当前使用的Embedding 模型</p>
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
    * <p>Embedding 向量维度，目前固定1024</p>
    */
    @SerializedName("EmbeddingDims")
    @Expose
    private Long EmbeddingDims;

    /**
    * <p>Mem0服务使用的PG数据库</p>
    */
    @SerializedName("PGDatabaseName")
    @Expose
    private String PGDatabaseName;

    /**
    * <p>Mem0服务使用的PG用户名</p>
    */
    @SerializedName("PGUserName")
    @Expose
    private String PGUserName;

    /**
    * <p>Mem0的网络状态</p>
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private DBInstanceNetInfo [] NetworkAccessList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>mem0服务运行状态</p><p>枚举值：</p><ul><li>running： mem0服务正常运行</li><li>none： 未开通</li><li>creating： 正在开通</li><li>deleting： mem0服务关闭中</li></ul> 
     * @return Status <p>mem0服务运行状态</p><p>枚举值：</p><ul><li>running： mem0服务正常运行</li><li>none： 未开通</li><li>creating： 正在开通</li><li>deleting： mem0服务关闭中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>mem0服务运行状态</p><p>枚举值：</p><ul><li>running： mem0服务正常运行</li><li>none： 未开通</li><li>creating： 正在开通</li><li>deleting： mem0服务关闭中</li></ul>
     * @param Status <p>mem0服务运行状态</p><p>枚举值：</p><ul><li>running： mem0服务正常运行</li><li>none： 未开通</li><li>creating： 正在开通</li><li>deleting： mem0服务关闭中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Mem0服务创建时间</p> 
     * @return CreateTime <p>Mem0服务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Mem0服务创建时间</p>
     * @param CreateTime <p>Mem0服务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Mem0服务最后更新时间</p> 
     * @return UpdateTime <p>Mem0服务最后更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Mem0服务最后更新时间</p>
     * @param UpdateTime <p>Mem0服务最后更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Mem0服务访问地址</p> 
     * @return InnerAddress <p>Mem0服务访问地址</p>
     */
    public String getInnerAddress() {
        return this.InnerAddress;
    }

    /**
     * Set <p>Mem0服务访问地址</p>
     * @param InnerAddress <p>Mem0服务访问地址</p>
     */
    public void setInnerAddress(String InnerAddress) {
        this.InnerAddress = InnerAddress;
    }

    /**
     * Get <p>Mem0服务使用的AgenticBase</p> 
     * @return AgenticBaseId <p>Mem0服务使用的AgenticBase</p>
     */
    public String getAgenticBaseId() {
        return this.AgenticBaseId;
    }

    /**
     * Set <p>Mem0服务使用的AgenticBase</p>
     * @param AgenticBaseId <p>Mem0服务使用的AgenticBase</p>
     */
    public void setAgenticBaseId(String AgenticBaseId) {
        this.AgenticBaseId = AgenticBaseId;
    }

    /**
     * Get <p>Mem0服务使用的LLM提供方</p><p>枚举值：</p><ul><li>tokenhub： 腾讯云大模型服务平台TokenHub</li></ul> 
     * @return LLMMode <p>Mem0服务使用的LLM提供方</p><p>枚举值：</p><ul><li>tokenhub： 腾讯云大模型服务平台TokenHub</li></ul>
     */
    public String getLLMMode() {
        return this.LLMMode;
    }

    /**
     * Set <p>Mem0服务使用的LLM提供方</p><p>枚举值：</p><ul><li>tokenhub： 腾讯云大模型服务平台TokenHub</li></ul>
     * @param LLMMode <p>Mem0服务使用的LLM提供方</p><p>枚举值：</p><ul><li>tokenhub： 腾讯云大模型服务平台TokenHub</li></ul>
     */
    public void setLLMMode(String LLMMode) {
        this.LLMMode = LLMMode;
    }

    /**
     * Get <p>Mem0服务使用的LLM模型</p> 
     * @return LLMModel <p>Mem0服务使用的LLM模型</p>
     */
    public String getLLMModel() {
        return this.LLMModel;
    }

    /**
     * Set <p>Mem0服务使用的LLM模型</p>
     * @param LLMModel <p>Mem0服务使用的LLM模型</p>
     */
    public void setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
    }

    /**
     * Get <p>Mem0服务当前使用的Embedding 模型</p> 
     * @return EmbeddingModel <p>Mem0服务当前使用的Embedding 模型</p>
     */
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set <p>Mem0服务当前使用的Embedding 模型</p>
     * @param EmbeddingModel <p>Mem0服务当前使用的Embedding 模型</p>
     */
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    /**
     * Get <p>Embedding 向量维度，目前固定1024</p> 
     * @return EmbeddingDims <p>Embedding 向量维度，目前固定1024</p>
     */
    public Long getEmbeddingDims() {
        return this.EmbeddingDims;
    }

    /**
     * Set <p>Embedding 向量维度，目前固定1024</p>
     * @param EmbeddingDims <p>Embedding 向量维度，目前固定1024</p>
     */
    public void setEmbeddingDims(Long EmbeddingDims) {
        this.EmbeddingDims = EmbeddingDims;
    }

    /**
     * Get <p>Mem0服务使用的PG数据库</p> 
     * @return PGDatabaseName <p>Mem0服务使用的PG数据库</p>
     */
    public String getPGDatabaseName() {
        return this.PGDatabaseName;
    }

    /**
     * Set <p>Mem0服务使用的PG数据库</p>
     * @param PGDatabaseName <p>Mem0服务使用的PG数据库</p>
     */
    public void setPGDatabaseName(String PGDatabaseName) {
        this.PGDatabaseName = PGDatabaseName;
    }

    /**
     * Get <p>Mem0服务使用的PG用户名</p> 
     * @return PGUserName <p>Mem0服务使用的PG用户名</p>
     */
    public String getPGUserName() {
        return this.PGUserName;
    }

    /**
     * Set <p>Mem0服务使用的PG用户名</p>
     * @param PGUserName <p>Mem0服务使用的PG用户名</p>
     */
    public void setPGUserName(String PGUserName) {
        this.PGUserName = PGUserName;
    }

    /**
     * Get <p>Mem0的网络状态</p> 
     * @return NetworkAccessList <p>Mem0的网络状态</p>
     */
    public DBInstanceNetInfo [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set <p>Mem0的网络状态</p>
     * @param NetworkAccessList <p>Mem0的网络状态</p>
     */
    public void setNetworkAccessList(DBInstanceNetInfo [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMem0ServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMem0ServiceResponse(DescribeMem0ServiceResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.InnerAddress != null) {
            this.InnerAddress = new String(source.InnerAddress);
        }
        if (source.AgenticBaseId != null) {
            this.AgenticBaseId = new String(source.AgenticBaseId);
        }
        if (source.LLMMode != null) {
            this.LLMMode = new String(source.LLMMode);
        }
        if (source.LLMModel != null) {
            this.LLMModel = new String(source.LLMModel);
        }
        if (source.EmbeddingModel != null) {
            this.EmbeddingModel = new String(source.EmbeddingModel);
        }
        if (source.EmbeddingDims != null) {
            this.EmbeddingDims = new Long(source.EmbeddingDims);
        }
        if (source.PGDatabaseName != null) {
            this.PGDatabaseName = new String(source.PGDatabaseName);
        }
        if (source.PGUserName != null) {
            this.PGUserName = new String(source.PGUserName);
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new DBInstanceNetInfo[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new DBInstanceNetInfo(source.NetworkAccessList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InnerAddress", this.InnerAddress);
        this.setParamSimple(map, prefix + "AgenticBaseId", this.AgenticBaseId);
        this.setParamSimple(map, prefix + "LLMMode", this.LLMMode);
        this.setParamSimple(map, prefix + "LLMModel", this.LLMModel);
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);
        this.setParamSimple(map, prefix + "EmbeddingDims", this.EmbeddingDims);
        this.setParamSimple(map, prefix + "PGDatabaseName", this.PGDatabaseName);
        this.setParamSimple(map, prefix + "PGUserName", this.PGUserName);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

