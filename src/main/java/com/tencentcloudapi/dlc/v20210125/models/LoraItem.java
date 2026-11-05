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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoraItem extends AbstractModel {

    /**
    * <p>模型版本 UID</p>
    */
    @SerializedName("ModelVersionUid")
    @Expose
    private String ModelVersionUid;

    /**
    * <p>模型 UID</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Lora Rank</p>
    */
    @SerializedName("AdapterRank")
    @Expose
    private Long AdapterRank;

    /**
     * Get <p>模型版本 UID</p> 
     * @return ModelVersionUid <p>模型版本 UID</p>
     */
    public String getModelVersionUid() {
        return this.ModelVersionUid;
    }

    /**
     * Set <p>模型版本 UID</p>
     * @param ModelVersionUid <p>模型版本 UID</p>
     */
    public void setModelVersionUid(String ModelVersionUid) {
        this.ModelVersionUid = ModelVersionUid;
    }

    /**
     * Get <p>模型 UID</p> 
     * @return ModelUid <p>模型 UID</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型 UID</p>
     * @param ModelUid <p>模型 UID</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本</p> 
     * @return Version <p>模型版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>模型版本</p>
     * @param Version <p>模型版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>别名</p> 
     * @return Alias <p>别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>别名</p>
     * @param Alias <p>别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Lora Rank</p> 
     * @return AdapterRank <p>Lora Rank</p>
     */
    public Long getAdapterRank() {
        return this.AdapterRank;
    }

    /**
     * Set <p>Lora Rank</p>
     * @param AdapterRank <p>Lora Rank</p>
     */
    public void setAdapterRank(Long AdapterRank) {
        this.AdapterRank = AdapterRank;
    }

    public LoraItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoraItem(LoraItem source) {
        if (source.ModelVersionUid != null) {
            this.ModelVersionUid = new String(source.ModelVersionUid);
        }
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.AdapterRank != null) {
            this.AdapterRank = new Long(source.AdapterRank);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelVersionUid", this.ModelVersionUid);
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "AdapterRank", this.AdapterRank);

    }
}

