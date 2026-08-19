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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterNamespaceListItem extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标签</p>
    */
    @SerializedName("Label")
    @Expose
    private AssetTag [] Label;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>资产 ID</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>命名空间唯一标识ID</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标签</p> 
     * @return Label <p>标签</p>
     */
    public AssetTag [] getLabel() {
        return this.Label;
    }

    /**
     * Set <p>标签</p>
     * @param Label <p>标签</p>
     */
    public void setLabel(AssetTag [] Label) {
        this.Label = Label;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>资产 ID</p> 
     * @return AssetId <p>资产 ID</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产 ID</p>
     * @param AssetId <p>资产 ID</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>命名空间唯一标识ID</p> 
     * @return UniqueID <p>命名空间唯一标识ID</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>命名空间唯一标识ID</p>
     * @param UniqueID <p>命名空间唯一标识ID</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    public ClusterNamespaceListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNamespaceListItem(ClusterNamespaceListItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new AssetTag[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new AssetTag(source.Label[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);

    }
}

