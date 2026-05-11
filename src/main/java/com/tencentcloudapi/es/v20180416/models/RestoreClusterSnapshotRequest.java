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
    * <p>集群实例Id，格式：es-xxxx</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>仓库名称</p>
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * <p>集群快照名称</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致</p>
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * <p>elastic用户名对应的密码信息</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。</p>
    */
    @SerializedName("IndexSettings")
    @Expose
    private String IndexSettings;

    /**
    * <p>不应从快照还原的以逗号分隔的索引设置列表。</p>
    */
    @SerializedName("IncludeGlobalState")
    @Expose
    private String [] IncludeGlobalState;

    /**
    * <p>需要恢复的索引名称，非必填，为空则表示恢复所有</p><p>支持传多个索引名称</p>
    */
    @SerializedName("Indices")
    @Expose
    private String Indices;

    /**
    * <p>如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,</p><p>如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空</p>
    */
    @SerializedName("Partial")
    @Expose
    private String Partial;

    /**
    * <p>快照恢复速率（单位mb）</p>
    */
    @SerializedName("MaxRestorePerSec")
    @Expose
    private String MaxRestorePerSec;

    /**
     * Get <p>集群实例Id，格式：es-xxxx</p> 
     * @return InstanceId <p>集群实例Id，格式：es-xxxx</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例Id，格式：es-xxxx</p>
     * @param InstanceId <p>集群实例Id，格式：es-xxxx</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>仓库名称</p> 
     * @return RepositoryName <p>仓库名称</p>
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set <p>仓库名称</p>
     * @param RepositoryName <p>仓库名称</p>
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get <p>集群快照名称</p> 
     * @return SnapshotName <p>集群快照名称</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>集群快照名称</p>
     * @param SnapshotName <p>集群快照名称</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致</p> 
     * @return TargetInstanceId <p>目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致</p>
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set <p>目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致</p>
     * @param TargetInstanceId <p>目标集群实例Id，格式：es-xxxx，如果是恢复到本地，则和InstanceId一致</p>
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get <p>elastic用户名对应的密码信息</p> 
     * @return Password <p>elastic用户名对应的密码信息</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>elastic用户名对应的密码信息</p>
     * @param Password <p>elastic用户名对应的密码信息</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。</p> 
     * @return IndexSettings <p>要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。</p>
     */
    public String getIndexSettings() {
        return this.IndexSettings;
    }

    /**
     * Set <p>要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。</p>
     * @param IndexSettings <p>要在所有恢复的索引中添加或更改的设置的逗号分隔列表。使用此参数可以在恢复快照时覆盖索引设置。</p>
     */
    public void setIndexSettings(String IndexSettings) {
        this.IndexSettings = IndexSettings;
    }

    /**
     * Get <p>不应从快照还原的以逗号分隔的索引设置列表。</p> 
     * @return IncludeGlobalState <p>不应从快照还原的以逗号分隔的索引设置列表。</p>
     */
    public String [] getIncludeGlobalState() {
        return this.IncludeGlobalState;
    }

    /**
     * Set <p>不应从快照还原的以逗号分隔的索引设置列表。</p>
     * @param IncludeGlobalState <p>不应从快照还原的以逗号分隔的索引设置列表。</p>
     */
    public void setIncludeGlobalState(String [] IncludeGlobalState) {
        this.IncludeGlobalState = IncludeGlobalState;
    }

    /**
     * Get <p>需要恢复的索引名称，非必填，为空则表示恢复所有</p><p>支持传多个索引名称</p> 
     * @return Indices <p>需要恢复的索引名称，非必填，为空则表示恢复所有</p><p>支持传多个索引名称</p>
     */
    public String getIndices() {
        return this.Indices;
    }

    /**
     * Set <p>需要恢复的索引名称，非必填，为空则表示恢复所有</p><p>支持传多个索引名称</p>
     * @param Indices <p>需要恢复的索引名称，非必填，为空则表示恢复所有</p><p>支持传多个索引名称</p>
     */
    public void setIndices(String Indices) {
        this.Indices = Indices;
    }

    /**
     * Get <p>如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,</p><p>如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空</p> 
     * @return Partial <p>如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,</p><p>如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空</p>
     */
    public String getPartial() {
        return this.Partial;
    }

    /**
     * Set <p>如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,</p><p>如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空</p>
     * @param Partial <p>如果为 false，则如果快照中包含的一个或多个索引没有所有主分片可用，则整个恢复操作将失败。默认为 false,</p><p>如果为 true，则允许恢复具有不可用分片的索引的部分快照。只有成功包含在快照中的分片才会被恢复。所有丢失的碎片将被重新创建为空</p>
     */
    public void setPartial(String Partial) {
        this.Partial = Partial;
    }

    /**
     * Get <p>快照恢复速率（单位mb）</p> 
     * @return MaxRestorePerSec <p>快照恢复速率（单位mb）</p>
     */
    public String getMaxRestorePerSec() {
        return this.MaxRestorePerSec;
    }

    /**
     * Set <p>快照恢复速率（单位mb）</p>
     * @param MaxRestorePerSec <p>快照恢复速率（单位mb）</p>
     */
    public void setMaxRestorePerSec(String MaxRestorePerSec) {
        this.MaxRestorePerSec = MaxRestorePerSec;
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
        if (source.MaxRestorePerSec != null) {
            this.MaxRestorePerSec = new String(source.MaxRestorePerSec);
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
        this.setParamSimple(map, prefix + "MaxRestorePerSec", this.MaxRestorePerSec);

    }
}

