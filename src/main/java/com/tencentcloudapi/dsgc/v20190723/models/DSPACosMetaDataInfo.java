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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DSPACosMetaDataInfo extends AbstractModel {

    /**
    * COS桶名
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS桶创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 1 -- 有效，0 -- 无效，资源可能已被删除。
    */
    @SerializedName("Valid")
    @Expose
    private Long Valid;

    /**
    * DSPA为COS资源生成的资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * COS资源所处的地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * COS桶绑定状态
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * COS桶存储量
    */
    @SerializedName("Storage")
    @Expose
    private Float Storage;

    /**
    * 治理授权状态，0:关闭 1：开启
    */
    @SerializedName("GovernAuthStatus")
    @Expose
    private Long GovernAuthStatus;

    /**
     * Get COS桶名 
     * @return Bucket COS桶名
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS桶名
     * @param Bucket COS桶名
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS桶创建时间 
     * @return CreateTime COS桶创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set COS桶创建时间
     * @param CreateTime COS桶创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 1 -- 有效，0 -- 无效，资源可能已被删除。 
     * @return Valid 1 -- 有效，0 -- 无效，资源可能已被删除。
     */
    public Long getValid() {
        return this.Valid;
    }

    /**
     * Set 1 -- 有效，0 -- 无效，资源可能已被删除。
     * @param Valid 1 -- 有效，0 -- 无效，资源可能已被删除。
     */
    public void setValid(Long Valid) {
        this.Valid = Valid;
    }

    /**
     * Get DSPA为COS资源生成的资源ID 
     * @return ResourceId DSPA为COS资源生成的资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set DSPA为COS资源生成的资源ID
     * @param ResourceId DSPA为COS资源生成的资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get COS资源所处的地域 
     * @return ResourceRegion COS资源所处的地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set COS资源所处的地域
     * @param ResourceRegion COS资源所处的地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get COS桶绑定状态 
     * @return BindStatus COS桶绑定状态
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set COS桶绑定状态
     * @param BindStatus COS桶绑定状态
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get COS桶存储量 
     * @return Storage COS桶存储量
     */
    public Float getStorage() {
        return this.Storage;
    }

    /**
     * Set COS桶存储量
     * @param Storage COS桶存储量
     */
    public void setStorage(Float Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 治理授权状态，0:关闭 1：开启 
     * @return GovernAuthStatus 治理授权状态，0:关闭 1：开启
     */
    public Long getGovernAuthStatus() {
        return this.GovernAuthStatus;
    }

    /**
     * Set 治理授权状态，0:关闭 1：开启
     * @param GovernAuthStatus 治理授权状态，0:关闭 1：开启
     */
    public void setGovernAuthStatus(Long GovernAuthStatus) {
        this.GovernAuthStatus = GovernAuthStatus;
    }

    public DSPACosMetaDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DSPACosMetaDataInfo(DSPACosMetaDataInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Valid != null) {
            this.Valid = new Long(source.Valid);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.Storage != null) {
            this.Storage = new Float(source.Storage);
        }
        if (source.GovernAuthStatus != null) {
            this.GovernAuthStatus = new Long(source.GovernAuthStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Valid", this.Valid);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "GovernAuthStatus", this.GovernAuthStatus);

    }
}

