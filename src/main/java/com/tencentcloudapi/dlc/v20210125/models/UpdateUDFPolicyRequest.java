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

public class UpdateUDFPolicyRequest extends AbstractModel {

    /**
    * UDF名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据目录名
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * UDF权限信息
    */
    @SerializedName("UDFPolicyInfos")
    @Expose
    private UDFPolicyInfo [] UDFPolicyInfos;

    /**
     * Get UDF名称 
     * @return Name UDF名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set UDF名称
     * @param Name UDF名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据库名 
     * @return DatabaseName 数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名
     * @param DatabaseName 数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据目录名 
     * @return CatalogName 数据目录名
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录名
     * @param CatalogName 数据目录名
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get UDF权限信息 
     * @return UDFPolicyInfos UDF权限信息
     */
    public UDFPolicyInfo [] getUDFPolicyInfos() {
        return this.UDFPolicyInfos;
    }

    /**
     * Set UDF权限信息
     * @param UDFPolicyInfos UDF权限信息
     */
    public void setUDFPolicyInfos(UDFPolicyInfo [] UDFPolicyInfos) {
        this.UDFPolicyInfos = UDFPolicyInfos;
    }

    public UpdateUDFPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUDFPolicyRequest(UpdateUDFPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.UDFPolicyInfos != null) {
            this.UDFPolicyInfos = new UDFPolicyInfo[source.UDFPolicyInfos.length];
            for (int i = 0; i < source.UDFPolicyInfos.length; i++) {
                this.UDFPolicyInfos[i] = new UDFPolicyInfo(source.UDFPolicyInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamArrayObj(map, prefix + "UDFPolicyInfos.", this.UDFPolicyInfos);

    }
}

