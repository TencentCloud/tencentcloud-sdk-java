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

public class UpdateIndexRequest extends AbstractModel {

    /**
    * <p>ES集群ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>更新的索引类型。auto：自治索引；normal：普通索引</p>
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * <p>更新的索引名</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>更新的索引元数据JSON，如mappings、settings</p>
    */
    @SerializedName("UpdateMetaJson")
    @Expose
    private String UpdateMetaJson;

    /**
    * <p>集群访问用户名</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>集群访问密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>是否滚动后备索引</p>
    */
    @SerializedName("RolloverBackingIndex")
    @Expose
    private Boolean RolloverBackingIndex;

    /**
    * <p>是否为取回完全卸载索引</p>
    */
    @SerializedName("MountIndex")
    @Expose
    private Boolean MountIndex;

    /**
    * <p>索引Uuid</p>
    */
    @SerializedName("IndexUuid")
    @Expose
    private String IndexUuid;

    /**
    * <p>后备索引名</p>
    */
    @SerializedName("BackingIndexName")
    @Expose
    private String BackingIndexName;

    /**
     * Get <p>ES集群ID</p> 
     * @return InstanceId <p>ES集群ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES集群ID</p>
     * @param InstanceId <p>ES集群ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>更新的索引类型。auto：自治索引；normal：普通索引</p> 
     * @return IndexType <p>更新的索引类型。auto：自治索引；normal：普通索引</p>
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set <p>更新的索引类型。auto：自治索引；normal：普通索引</p>
     * @param IndexType <p>更新的索引类型。auto：自治索引；normal：普通索引</p>
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get <p>更新的索引名</p> 
     * @return IndexName <p>更新的索引名</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>更新的索引名</p>
     * @param IndexName <p>更新的索引名</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>更新的索引元数据JSON，如mappings、settings</p> 
     * @return UpdateMetaJson <p>更新的索引元数据JSON，如mappings、settings</p>
     */
    public String getUpdateMetaJson() {
        return this.UpdateMetaJson;
    }

    /**
     * Set <p>更新的索引元数据JSON，如mappings、settings</p>
     * @param UpdateMetaJson <p>更新的索引元数据JSON，如mappings、settings</p>
     */
    public void setUpdateMetaJson(String UpdateMetaJson) {
        this.UpdateMetaJson = UpdateMetaJson;
    }

    /**
     * Get <p>集群访问用户名</p> 
     * @return Username <p>集群访问用户名</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>集群访问用户名</p>
     * @param Username <p>集群访问用户名</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>集群访问密码</p> 
     * @return Password <p>集群访问密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>集群访问密码</p>
     * @param Password <p>集群访问密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>是否滚动后备索引</p> 
     * @return RolloverBackingIndex <p>是否滚动后备索引</p>
     */
    public Boolean getRolloverBackingIndex() {
        return this.RolloverBackingIndex;
    }

    /**
     * Set <p>是否滚动后备索引</p>
     * @param RolloverBackingIndex <p>是否滚动后备索引</p>
     */
    public void setRolloverBackingIndex(Boolean RolloverBackingIndex) {
        this.RolloverBackingIndex = RolloverBackingIndex;
    }

    /**
     * Get <p>是否为取回完全卸载索引</p> 
     * @return MountIndex <p>是否为取回完全卸载索引</p>
     */
    public Boolean getMountIndex() {
        return this.MountIndex;
    }

    /**
     * Set <p>是否为取回完全卸载索引</p>
     * @param MountIndex <p>是否为取回完全卸载索引</p>
     */
    public void setMountIndex(Boolean MountIndex) {
        this.MountIndex = MountIndex;
    }

    /**
     * Get <p>索引Uuid</p> 
     * @return IndexUuid <p>索引Uuid</p>
     */
    public String getIndexUuid() {
        return this.IndexUuid;
    }

    /**
     * Set <p>索引Uuid</p>
     * @param IndexUuid <p>索引Uuid</p>
     */
    public void setIndexUuid(String IndexUuid) {
        this.IndexUuid = IndexUuid;
    }

    /**
     * Get <p>后备索引名</p> 
     * @return BackingIndexName <p>后备索引名</p>
     */
    public String getBackingIndexName() {
        return this.BackingIndexName;
    }

    /**
     * Set <p>后备索引名</p>
     * @param BackingIndexName <p>后备索引名</p>
     */
    public void setBackingIndexName(String BackingIndexName) {
        this.BackingIndexName = BackingIndexName;
    }

    public UpdateIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateIndexRequest(UpdateIndexRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.UpdateMetaJson != null) {
            this.UpdateMetaJson = new String(source.UpdateMetaJson);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.RolloverBackingIndex != null) {
            this.RolloverBackingIndex = new Boolean(source.RolloverBackingIndex);
        }
        if (source.MountIndex != null) {
            this.MountIndex = new Boolean(source.MountIndex);
        }
        if (source.IndexUuid != null) {
            this.IndexUuid = new String(source.IndexUuid);
        }
        if (source.BackingIndexName != null) {
            this.BackingIndexName = new String(source.BackingIndexName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "UpdateMetaJson", this.UpdateMetaJson);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "RolloverBackingIndex", this.RolloverBackingIndex);
        this.setParamSimple(map, prefix + "MountIndex", this.MountIndex);
        this.setParamSimple(map, prefix + "IndexUuid", this.IndexUuid);
        this.setParamSimple(map, prefix + "BackingIndexName", this.BackingIndexName);

    }
}

