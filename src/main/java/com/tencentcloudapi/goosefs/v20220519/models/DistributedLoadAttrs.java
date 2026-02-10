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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributedLoadAttrs extends AbstractModel {

    /**
    * 预热类型，枚举值 LoadByPath｜LoadByList
    */
    @SerializedName("LoadType")
    @Expose
    private String LoadType;

    /**
    * 是否跳过相同文件，默认为 true
    */
    @SerializedName("SkipIfExists")
    @Expose
    private Boolean SkipIfExists;

    /**
    * 预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空
    */
    @SerializedName("LoadByPath")
    @Expose
    private String LoadByPath;

    /**
    * 通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空
    */
    @SerializedName("LoadByList")
    @Expose
    private String LoadByList;

    /**
    * 副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）
    */
    @SerializedName("Replica")
    @Expose
    private String Replica;

    /**
    * 同步执行元数据预热，并基于预热后的元数据执行 DistributedLoad。默认为 false
    */
    @SerializedName("MetadataSync")
    @Expose
    private Boolean MetadataSync;

    /**
     * Get 预热类型，枚举值 LoadByPath｜LoadByList 
     * @return LoadType 预热类型，枚举值 LoadByPath｜LoadByList
     */
    public String getLoadType() {
        return this.LoadType;
    }

    /**
     * Set 预热类型，枚举值 LoadByPath｜LoadByList
     * @param LoadType 预热类型，枚举值 LoadByPath｜LoadByList
     */
    public void setLoadType(String LoadType) {
        this.LoadType = LoadType;
    }

    /**
     * Get 是否跳过相同文件，默认为 true 
     * @return SkipIfExists 是否跳过相同文件，默认为 true
     */
    public Boolean getSkipIfExists() {
        return this.SkipIfExists;
    }

    /**
     * Set 是否跳过相同文件，默认为 true
     * @param SkipIfExists 是否跳过相同文件，默认为 true
     */
    public void setSkipIfExists(Boolean SkipIfExists) {
        this.SkipIfExists = SkipIfExists;
    }

    /**
     * Get 预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空 
     * @return LoadByPath 预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空
     */
    public String getLoadByPath() {
        return this.LoadByPath;
    }

    /**
     * Set 预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空
     * @param LoadByPath 预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空
     */
    public void setLoadByPath(String LoadByPath) {
        this.LoadByPath = LoadByPath;
    }

    /**
     * Get 通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空 
     * @return LoadByList 通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空
     */
    public String getLoadByList() {
        return this.LoadByList;
    }

    /**
     * Set 通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空
     * @param LoadByList 通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空
     */
    public void setLoadByList(String LoadByList) {
        this.LoadByList = LoadByList;
    }

    /**
     * Get 副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本） 
     * @return Replica 副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）
     */
    public String getReplica() {
        return this.Replica;
    }

    /**
     * Set 副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）
     * @param Replica 副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）
     */
    public void setReplica(String Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 同步执行元数据预热，并基于预热后的元数据执行 DistributedLoad。默认为 false 
     * @return MetadataSync 同步执行元数据预热，并基于预热后的元数据执行 DistributedLoad。默认为 false
     */
    public Boolean getMetadataSync() {
        return this.MetadataSync;
    }

    /**
     * Set 同步执行元数据预热，并基于预热后的元数据执行 DistributedLoad。默认为 false
     * @param MetadataSync 同步执行元数据预热，并基于预热后的元数据执行 DistributedLoad。默认为 false
     */
    public void setMetadataSync(Boolean MetadataSync) {
        this.MetadataSync = MetadataSync;
    }

    public DistributedLoadAttrs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributedLoadAttrs(DistributedLoadAttrs source) {
        if (source.LoadType != null) {
            this.LoadType = new String(source.LoadType);
        }
        if (source.SkipIfExists != null) {
            this.SkipIfExists = new Boolean(source.SkipIfExists);
        }
        if (source.LoadByPath != null) {
            this.LoadByPath = new String(source.LoadByPath);
        }
        if (source.LoadByList != null) {
            this.LoadByList = new String(source.LoadByList);
        }
        if (source.Replica != null) {
            this.Replica = new String(source.Replica);
        }
        if (source.MetadataSync != null) {
            this.MetadataSync = new Boolean(source.MetadataSync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadType", this.LoadType);
        this.setParamSimple(map, prefix + "SkipIfExists", this.SkipIfExists);
        this.setParamSimple(map, prefix + "LoadByPath", this.LoadByPath);
        this.setParamSimple(map, prefix + "LoadByList", this.LoadByList);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "MetadataSync", this.MetadataSync);

    }
}

