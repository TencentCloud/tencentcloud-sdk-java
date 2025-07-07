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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosMigrateToServerlessInstanceRequest extends AbstractModel {

    /**
    * 快照名
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * 索引 id
    */
    @SerializedName("ServerlessId")
    @Expose
    private String ServerlessId;

    /**
    * cos 桶名
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * BasePath 路径
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * 云上集群 id
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
    * 待迁移普通索引名列表
    */
    @SerializedName("CommonIndexArr")
    @Expose
    private String [] CommonIndexArr;

    /**
    * 待迁移自治索引名列表
    */
    @SerializedName("DataStreamArr")
    @Expose
    private String [] DataStreamArr;

    /**
     * Get 快照名 
     * @return Snapshot 快照名
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set 快照名
     * @param Snapshot 快照名
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get 索引 id 
     * @return ServerlessId 索引 id
     */
    public String getServerlessId() {
        return this.ServerlessId;
    }

    /**
     * Set 索引 id
     * @param ServerlessId 索引 id
     */
    public void setServerlessId(String ServerlessId) {
        this.ServerlessId = ServerlessId;
    }

    /**
     * Get cos 桶名 
     * @return CosBucket cos 桶名
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set cos 桶名
     * @param CosBucket cos 桶名
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get BasePath 路径 
     * @return BasePath BasePath 路径
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set BasePath 路径
     * @param BasePath BasePath 路径
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get 云上集群 id 
     * @return ClusterInstanceId 云上集群 id
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set 云上集群 id
     * @param ClusterInstanceId 云上集群 id
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    /**
     * Get 待迁移普通索引名列表 
     * @return CommonIndexArr 待迁移普通索引名列表
     */
    public String [] getCommonIndexArr() {
        return this.CommonIndexArr;
    }

    /**
     * Set 待迁移普通索引名列表
     * @param CommonIndexArr 待迁移普通索引名列表
     */
    public void setCommonIndexArr(String [] CommonIndexArr) {
        this.CommonIndexArr = CommonIndexArr;
    }

    /**
     * Get 待迁移自治索引名列表 
     * @return DataStreamArr 待迁移自治索引名列表
     */
    public String [] getDataStreamArr() {
        return this.DataStreamArr;
    }

    /**
     * Set 待迁移自治索引名列表
     * @param DataStreamArr 待迁移自治索引名列表
     */
    public void setDataStreamArr(String [] DataStreamArr) {
        this.DataStreamArr = DataStreamArr;
    }

    public CreateCosMigrateToServerlessInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosMigrateToServerlessInstanceRequest(CreateCosMigrateToServerlessInstanceRequest source) {
        if (source.Snapshot != null) {
            this.Snapshot = new String(source.Snapshot);
        }
        if (source.ServerlessId != null) {
            this.ServerlessId = new String(source.ServerlessId);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.ClusterInstanceId != null) {
            this.ClusterInstanceId = new String(source.ClusterInstanceId);
        }
        if (source.CommonIndexArr != null) {
            this.CommonIndexArr = new String[source.CommonIndexArr.length];
            for (int i = 0; i < source.CommonIndexArr.length; i++) {
                this.CommonIndexArr[i] = new String(source.CommonIndexArr[i]);
            }
        }
        if (source.DataStreamArr != null) {
            this.DataStreamArr = new String[source.DataStreamArr.length];
            for (int i = 0; i < source.DataStreamArr.length; i++) {
                this.DataStreamArr[i] = new String(source.DataStreamArr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "ServerlessId", this.ServerlessId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);
        this.setParamArraySimple(map, prefix + "CommonIndexArr.", this.CommonIndexArr);
        this.setParamArraySimple(map, prefix + "DataStreamArr.", this.DataStreamArr);

    }
}

