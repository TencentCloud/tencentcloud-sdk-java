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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareResourceToMember extends AbstractModel {

    /**
    * 共享单元资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 共享单元ID。
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * 共享单元名称。
    */
    @SerializedName("UnitName")
    @Expose
    private String UnitName;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 业务资源ID。
    */
    @SerializedName("ProductResourceId")
    @Expose
    private String ProductResourceId;

    /**
    * 共享账号Uin。
    */
    @SerializedName("ShareManagerUin")
    @Expose
    private Long ShareManagerUin;

    /**
     * Get 共享单元资源ID。 
     * @return ResourceId 共享单元资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 共享单元资源ID。
     * @param ResourceId 共享单元资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型。 
     * @return Type 资源类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源类型。
     * @param Type 资源类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 共享单元ID。 
     * @return UnitId 共享单元ID。
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set 共享单元ID。
     * @param UnitId 共享单元ID。
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get 共享单元名称。 
     * @return UnitName 共享单元名称。
     */
    public String getUnitName() {
        return this.UnitName;
    }

    /**
     * Set 共享单元名称。
     * @param UnitName 共享单元名称。
     */
    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 业务资源ID。 
     * @return ProductResourceId 业务资源ID。
     */
    public String getProductResourceId() {
        return this.ProductResourceId;
    }

    /**
     * Set 业务资源ID。
     * @param ProductResourceId 业务资源ID。
     */
    public void setProductResourceId(String ProductResourceId) {
        this.ProductResourceId = ProductResourceId;
    }

    /**
     * Get 共享账号Uin。 
     * @return ShareManagerUin 共享账号Uin。
     */
    public Long getShareManagerUin() {
        return this.ShareManagerUin;
    }

    /**
     * Set 共享账号Uin。
     * @param ShareManagerUin 共享账号Uin。
     */
    public void setShareManagerUin(Long ShareManagerUin) {
        this.ShareManagerUin = ShareManagerUin;
    }

    public ShareResourceToMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareResourceToMember(ShareResourceToMember source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.UnitName != null) {
            this.UnitName = new String(source.UnitName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProductResourceId != null) {
            this.ProductResourceId = new String(source.ProductResourceId);
        }
        if (source.ShareManagerUin != null) {
            this.ShareManagerUin = new Long(source.ShareManagerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "UnitName", this.UnitName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductResourceId", this.ProductResourceId);
        this.setParamSimple(map, prefix + "ShareManagerUin", this.ShareManagerUin);

    }
}

