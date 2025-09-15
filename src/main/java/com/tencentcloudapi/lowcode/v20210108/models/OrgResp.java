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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgResp extends AbstractModel {

    /**
    * 部门id
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * 部门名称
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
    * 部门标识
    */
    @SerializedName("OrgIdentity")
    @Expose
    private String OrgIdentity;

    /**
    * 部门层级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 主键字段
    */
    @SerializedName("PrimaryColumn")
    @Expose
    private String PrimaryColumn;

    /**
     * Get 部门id 
     * @return OrgId 部门id
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 部门id
     * @param OrgId 部门id
     */
    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 部门名称 
     * @return OrgName 部门名称
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set 部门名称
     * @param OrgName 部门名称
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    /**
     * Get 部门标识 
     * @return OrgIdentity 部门标识
     */
    public String getOrgIdentity() {
        return this.OrgIdentity;
    }

    /**
     * Set 部门标识
     * @param OrgIdentity 部门标识
     */
    public void setOrgIdentity(String OrgIdentity) {
        this.OrgIdentity = OrgIdentity;
    }

    /**
     * Get 部门层级 
     * @return Level 部门层级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 部门层级
     * @param Level 部门层级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 主键字段 
     * @return PrimaryColumn 主键字段
     */
    public String getPrimaryColumn() {
        return this.PrimaryColumn;
    }

    /**
     * Set 主键字段
     * @param PrimaryColumn 主键字段
     */
    public void setPrimaryColumn(String PrimaryColumn) {
        this.PrimaryColumn = PrimaryColumn;
    }

    public OrgResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgResp(OrgResp source) {
        if (source.OrgId != null) {
            this.OrgId = new String(source.OrgId);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
        if (source.OrgIdentity != null) {
            this.OrgIdentity = new String(source.OrgIdentity);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.PrimaryColumn != null) {
            this.PrimaryColumn = new String(source.PrimaryColumn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);
        this.setParamSimple(map, prefix + "OrgIdentity", this.OrgIdentity);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PrimaryColumn", this.PrimaryColumn);

    }
}

