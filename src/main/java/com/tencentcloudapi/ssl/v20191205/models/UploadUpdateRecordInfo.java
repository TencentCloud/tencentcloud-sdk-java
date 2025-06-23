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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateRecordInfo extends AbstractModel {

    /**
    * 记录ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 原证书ID
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * 部署资源类型列表
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * 部署状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 部署时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后一次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 记录ID 
     * @return Id 记录ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录ID
     * @param Id 记录ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 原证书ID 
     * @return OldCertId 原证书ID
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set 原证书ID
     * @param OldCertId 原证书ID
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get 部署资源类型列表 
     * @return ResourceTypes 部署资源类型列表
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 部署资源类型列表
     * @param ResourceTypes 部署资源类型列表
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get 部署状态 
     * @return Status 部署状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 部署状态
     * @param Status 部署状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 部署时间 
     * @return CreateTime 部署时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 部署时间
     * @param CreateTime 部署时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次更新时间 
     * @return UpdateTime 最后一次更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后一次更新时间
     * @param UpdateTime 最后一次更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public UploadUpdateRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateRecordInfo(UploadUpdateRecordInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OldCertId != null) {
            this.OldCertId = new String(source.OldCertId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

