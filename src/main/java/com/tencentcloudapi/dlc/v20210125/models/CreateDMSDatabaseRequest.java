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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDMSDatabaseRequest extends AbstractModel{

    /**
    * 基础元数据对象
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
    * Schema目录
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Db存储路径
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 数据库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 基础元数据对象 
     * @return Asset 基础元数据对象
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set 基础元数据对象
     * @param Asset 基础元数据对象
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    /**
     * Get Schema目录 
     * @return SchemaName Schema目录
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema目录
     * @param SchemaName Schema目录
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Db存储路径 
     * @return Location Db存储路径
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Db存储路径
     * @param Location Db存储路径
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 数据库名称 
     * @return Name 数据库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名称
     * @param Name 数据库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDMSDatabaseRequest(CreateDMSDatabaseRequest source) {
        if (source.Asset != null) {
            this.Asset = new Asset(source.Asset);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Asset.", this.Asset);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

