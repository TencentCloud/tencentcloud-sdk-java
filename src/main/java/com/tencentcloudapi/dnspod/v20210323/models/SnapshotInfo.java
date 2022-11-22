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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotInfo extends AbstractModel{

    /**
    * 快照的对象存储地址
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 添加时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 所属域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 快照记录 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 域名解析记录数
    */
    @SerializedName("RecordCount")
    @Expose
    private String RecordCount;

    /**
    * 状态：normal-正常，create-备份中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 快照的对象存储地址 
     * @return CosUrl 快照的对象存储地址
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 快照的对象存储地址
     * @param CosUrl 快照的对象存储地址
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 添加时间 
     * @return CreatedOn 添加时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 添加时间
     * @param CreatedOn 添加时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 所属域名 
     * @return Domain 所属域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 所属域名
     * @param Domain 所属域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 快照记录 ID 
     * @return Id 快照记录 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 快照记录 ID
     * @param Id 快照记录 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 域名解析记录数 
     * @return RecordCount 域名解析记录数
     */
    public String getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 域名解析记录数
     * @param RecordCount 域名解析记录数
     */
    public void setRecordCount(String RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 状态：normal-正常，create-备份中 
     * @return Status 状态：normal-正常，create-备份中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：normal-正常，create-备份中
     * @param Status 状态：normal-正常，create-备份中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotInfo(SnapshotInfo source) {
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new String(source.RecordCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

