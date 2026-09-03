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

public class LoadDataAttrs extends AbstractModel {

    /**
    * <p>预热类型，枚举值 LoadByPath｜LoadByList</p>
    */
    @SerializedName("LoadType")
    @Expose
    private String LoadType;

    /**
    * <p>是否跳过相同文件，默认为 true</p>
    */
    @SerializedName("SkipIfExists")
    @Expose
    private Boolean SkipIfExists;

    /**
    * <p>预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空</p>
    */
    @SerializedName("LoadByPath")
    @Expose
    private String LoadByPath;

    /**
    * <p>通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空</p>
    */
    @SerializedName("LoadByList")
    @Expose
    private String LoadByList;

    /**
    * <p>副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）</p>
    */
    @SerializedName("Replica")
    @Expose
    private String Replica;

    /**
     * Get <p>预热类型，枚举值 LoadByPath｜LoadByList</p> 
     * @return LoadType <p>预热类型，枚举值 LoadByPath｜LoadByList</p>
     */
    public String getLoadType() {
        return this.LoadType;
    }

    /**
     * Set <p>预热类型，枚举值 LoadByPath｜LoadByList</p>
     * @param LoadType <p>预热类型，枚举值 LoadByPath｜LoadByList</p>
     */
    public void setLoadType(String LoadType) {
        this.LoadType = LoadType;
    }

    /**
     * Get <p>是否跳过相同文件，默认为 true</p> 
     * @return SkipIfExists <p>是否跳过相同文件，默认为 true</p>
     */
    public Boolean getSkipIfExists() {
        return this.SkipIfExists;
    }

    /**
     * Set <p>是否跳过相同文件，默认为 true</p>
     * @param SkipIfExists <p>是否跳过相同文件，默认为 true</p>
     */
    public void setSkipIfExists(Boolean SkipIfExists) {
        this.SkipIfExists = SkipIfExists;
    }

    /**
     * Get <p>预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空</p> 
     * @return LoadByPath <p>预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空</p>
     */
    public String getLoadByPath() {
        return this.LoadByPath;
    }

    /**
     * Set <p>预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空</p>
     * @param LoadByPath <p>预热路径，入参单条挂载路径。入参数LoadType为LoadByPath，该参数不应为空</p>
     */
    public void setLoadByPath(String LoadByPath) {
        this.LoadByPath = LoadByPath;
    }

    /**
     * Get <p>通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空</p> 
     * @return LoadByList <p>通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空</p>
     */
    public String getLoadByList() {
        return this.LoadByList;
    }

    /**
     * Set <p>通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空</p>
     * @param LoadByList <p>通过文件列表批量预热，入参为 cos://bucket-appid/ 开头的 COS 路径，且仅支持 txt 格式文件，长度不能超过255个字符。入参数LoadType为LoadByList，该参数不应为空</p>
     */
    public void setLoadByList(String LoadByList) {
        this.LoadByList = LoadByList;
    }

    /**
     * Get <p>副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）</p> 
     * @return Replica <p>副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）</p>
     */
    public String getReplica() {
        return this.Replica;
    }

    /**
     * Set <p>副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）</p>
     * @param Replica <p>副本数配置，枚举值，可选值 SingleReplica（单副本，默认）｜MaxReplica（最大副本）</p>
     */
    public void setReplica(String Replica) {
        this.Replica = Replica;
    }

    public LoadDataAttrs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadDataAttrs(LoadDataAttrs source) {
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

    }
}

