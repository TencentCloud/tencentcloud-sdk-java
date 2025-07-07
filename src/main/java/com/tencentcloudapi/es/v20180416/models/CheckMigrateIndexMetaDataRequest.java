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

public class CheckMigrateIndexMetaDataRequest extends AbstractModel {

    /**
    * 索引 id
    */
    @SerializedName("ServerlessId")
    @Expose
    private String ServerlessId;

    /**
    * 快照名
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * Cos桶名
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * BasePath路径
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * 云上集群名
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
    * 普通索引名列表
    */
    @SerializedName("CommonIndexArr")
    @Expose
    private String [] CommonIndexArr;

    /**
    * 自治索引名列表
    */
    @SerializedName("DataStreamArr")
    @Expose
    private String [] DataStreamArr;

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
     * Get Cos桶名 
     * @return CosBucket Cos桶名
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set Cos桶名
     * @param CosBucket Cos桶名
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get BasePath路径 
     * @return BasePath BasePath路径
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set BasePath路径
     * @param BasePath BasePath路径
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get 云上集群名 
     * @return ClusterInstanceId 云上集群名
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set 云上集群名
     * @param ClusterInstanceId 云上集群名
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    /**
     * Get 普通索引名列表 
     * @return CommonIndexArr 普通索引名列表
     */
    public String [] getCommonIndexArr() {
        return this.CommonIndexArr;
    }

    /**
     * Set 普通索引名列表
     * @param CommonIndexArr 普通索引名列表
     */
    public void setCommonIndexArr(String [] CommonIndexArr) {
        this.CommonIndexArr = CommonIndexArr;
    }

    /**
     * Get 自治索引名列表 
     * @return DataStreamArr 自治索引名列表
     */
    public String [] getDataStreamArr() {
        return this.DataStreamArr;
    }

    /**
     * Set 自治索引名列表
     * @param DataStreamArr 自治索引名列表
     */
    public void setDataStreamArr(String [] DataStreamArr) {
        this.DataStreamArr = DataStreamArr;
    }

    public CheckMigrateIndexMetaDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckMigrateIndexMetaDataRequest(CheckMigrateIndexMetaDataRequest source) {
        if (source.ServerlessId != null) {
            this.ServerlessId = new String(source.ServerlessId);
        }
        if (source.Snapshot != null) {
            this.Snapshot = new String(source.Snapshot);
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
        this.setParamSimple(map, prefix + "ServerlessId", this.ServerlessId);
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);
        this.setParamArraySimple(map, prefix + "CommonIndexArr.", this.CommonIndexArr);
        this.setParamArraySimple(map, prefix + "DataStreamArr.", this.DataStreamArr);

    }
}

