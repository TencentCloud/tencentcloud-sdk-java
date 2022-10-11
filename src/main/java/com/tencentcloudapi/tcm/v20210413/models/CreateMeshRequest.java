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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMeshRequest extends AbstractModel{

    /**
    * Mesh名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Mesh版本
    */
    @SerializedName("MeshVersion")
    @Expose
    private String MeshVersion;

    /**
    * Mesh类型，取值范围：
- HOSTED：托管网格
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Mesh配置
    */
    @SerializedName("Config")
    @Expose
    private MeshConfig Config;

    /**
    * 关联集群
    */
    @SerializedName("ClusterList")
    @Expose
    private Cluster [] ClusterList;

    /**
    * 标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get Mesh名称 
     * @return DisplayName Mesh名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Mesh名称
     * @param DisplayName Mesh名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Mesh版本 
     * @return MeshVersion Mesh版本
     */
    public String getMeshVersion() {
        return this.MeshVersion;
    }

    /**
     * Set Mesh版本
     * @param MeshVersion Mesh版本
     */
    public void setMeshVersion(String MeshVersion) {
        this.MeshVersion = MeshVersion;
    }

    /**
     * Get Mesh类型，取值范围：
- HOSTED：托管网格 
     * @return Type Mesh类型，取值范围：
- HOSTED：托管网格
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Mesh类型，取值范围：
- HOSTED：托管网格
     * @param Type Mesh类型，取值范围：
- HOSTED：托管网格
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Mesh配置 
     * @return Config Mesh配置
     */
    public MeshConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Mesh配置
     * @param Config Mesh配置
     */
    public void setConfig(MeshConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 关联集群 
     * @return ClusterList 关联集群
     */
    public Cluster [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 关联集群
     * @param ClusterList 关联集群
     */
    public void setClusterList(Cluster [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get 标签列表 
     * @return TagList 标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签列表
     * @param TagList 标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateMeshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMeshRequest(CreateMeshRequest source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.MeshVersion != null) {
            this.MeshVersion = new String(source.MeshVersion);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Config != null) {
            this.Config = new MeshConfig(source.Config);
        }
        if (source.ClusterList != null) {
            this.ClusterList = new Cluster[source.ClusterList.length];
            for (int i = 0; i < source.ClusterList.length; i++) {
                this.ClusterList[i] = new Cluster(source.ClusterList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "MeshVersion", this.MeshVersion);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

