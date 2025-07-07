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

public class DeleteIndexRequest extends AbstractModel {

    /**
    * ES集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 删除的索引类型。auto：自治索引；normal：普通索引
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * 删除的索引名
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 集群访问用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 集群访问密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 后备索引名
    */
    @SerializedName("BackingIndexName")
    @Expose
    private String BackingIndexName;

    /**
     * Get ES集群ID 
     * @return InstanceId ES集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES集群ID
     * @param InstanceId ES集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 删除的索引类型。auto：自治索引；normal：普通索引 
     * @return IndexType 删除的索引类型。auto：自治索引；normal：普通索引
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set 删除的索引类型。auto：自治索引；normal：普通索引
     * @param IndexType 删除的索引类型。auto：自治索引；normal：普通索引
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get 删除的索引名 
     * @return IndexName 删除的索引名
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 删除的索引名
     * @param IndexName 删除的索引名
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 集群访问用户名 
     * @return Username 集群访问用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 集群访问用户名
     * @param Username 集群访问用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 集群访问密码 
     * @return Password 集群访问密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 集群访问密码
     * @param Password 集群访问密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 后备索引名 
     * @return BackingIndexName 后备索引名
     */
    public String getBackingIndexName() {
        return this.BackingIndexName;
    }

    /**
     * Set 后备索引名
     * @param BackingIndexName 后备索引名
     */
    public void setBackingIndexName(String BackingIndexName) {
        this.BackingIndexName = BackingIndexName;
    }

    public DeleteIndexRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIndexRequest(DeleteIndexRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
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
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "BackingIndexName", this.BackingIndexName);

    }
}

