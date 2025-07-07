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

public class RestoreClusterSnapshotRequest extends AbstractModel {

    /**
    * 集群实例Id，格式：es-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 集群快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * elastic用户名对应的密码信息
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。
    */
    @SerializedName("IndexSettings")
    @Expose
    private String IndexSettings;

    /**
    * 不应从快照还原的以逗号分隔的索引设置列表。
    */
    @SerializedName("IncludeGlobalState")
    @Expose
    private String [] IncludeGlobalState;

    /**
    * 需要恢复的索引名称，非必填，为空则表示恢复所有

支持传多个索引名称
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * 如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,

如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空
    */
    @SerializedName("Partial")
    @Expose
    private String Partial;

    /**
     * Get 集群实例Id，格式：es-xxxx 
     * @return InstanceId 集群实例Id，格式：es-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id，格式：es-xxxx
     * @param InstanceId 集群实例Id，格式：es-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 仓库名称 
     * @return RepositoryName 仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 仓库名称
     * @param RepositoryName 仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 集群快照名称 
     * @return SnapshotName 集群快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 集群快照名称
     * @param SnapshotName 集群快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致 
     * @return TargetInstanceId 目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致
     * @param TargetInstanceId 目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get elastic用户名对应的密码信息 
     * @return Password elastic用户名对应的密码信息
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set elastic用户名对应的密码信息
     * @param Password elastic用户名对应的密码信息
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。 
     * @return IndexSettings 要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。
     */
    public String getIndexSettings() {
        return this.IndexSettings;
    }

    /**
     * Set 要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。
     * @param IndexSettings 要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。
     */
    public void setIndexSettings(String IndexSettings) {
        this.IndexSettings = IndexSettings;
    }

    /**
     * Get 不应从快照还原的以逗号分隔的索引设置列表。 
     * @return IncludeGlobalState 不应从快照还原的以逗号分隔的索引设置列表。
     */
    public String [] getIncludeGlobalState() {
        return this.IncludeGlobalState;
    }

    /**
     * Set 不应从快照还原的以逗号分隔的索引设置列表。
     * @param IncludeGlobalState 不应从快照还原的以逗号分隔的索引设置列表。
     */
    public void setIncludeGlobalState(String [] IncludeGlobalState) {
        this.IncludeGlobalState = IncludeGlobalState;
    }

    /**
     * Get 需要恢复的索引名称，非必填，为空则表示恢复所有

支持传多个索引名称 
     * @return Indices 需要恢复的索引名称，非必填，为空则表示恢复所有

支持传多个索引名称
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set 需要恢复的索引名称，非必填，为空则表示恢复所有

支持传多个索引名称
     * @param Indices 需要恢复的索引名称，非必填，为空则表示恢复所有

支持传多个索引名称
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get 如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,

如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空 
     * @return Partial 如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,

如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空
     */
    public String getPartial() {
        return this.Partial;
    }

    /**
     * Set 如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,

如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空
     * @param Partial 如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,

如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空
     */
    public void setPartial(String Partial) {
        this.Partial = Partial;
    }

    public RestoreClusterSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreClusterSnapshotRequest(RestoreClusterSnapshotRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.IndexSettings != null) {
            this.IndexSettings = new String(source.IndexSettings);
        }
        if (source.IncludeGlobalState != null) {
            this.IncludeGlobalState = new String[source.IncludeGlobalState.length];
            for (int i = 0; i < source.IncludeGlobalState.length; i++) {
                this.IncludeGlobalState[i] = new String(source.IncludeGlobalState[i]);
            }
        }
        if (source.Indices != null) {
            this.Indices = new String(source.Indices);
        }
        if (source.Partial != null) {
            this.Partial = new String(source.Partial);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "IndexSettings", this.IndexSettings);
        this.setParamArraySimple(map, prefix + "IncludeGlobalState.", this.IncludeGlobalState);
        this.setParamSimple(map, prefix + "Indices", this.Indices);
        this.setParamSimple(map, prefix + "Partial", this.Partial);

    }
}

