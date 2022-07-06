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

public class AlterDMSDatabaseRequest extends AbstractModel{

    /**
    * 当前名称
    */
    @SerializedName("CurrentName")
    @Expose
    private String CurrentName;

    /**
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 路径
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 基础对象
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
     * Get 当前名称 
     * @return CurrentName 当前名称
     */
    public String getCurrentName() {
        return this.CurrentName;
    }

    /**
     * Set 当前名称
     * @param CurrentName 当前名称
     */
    public void setCurrentName(String CurrentName) {
        this.CurrentName = CurrentName;
    }

    /**
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 路径 
     * @return Location 路径
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 路径
     * @param Location 路径
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 基础对象 
     * @return Asset 基础对象
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set 基础对象
     * @param Asset 基础对象
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    public AlterDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlterDMSDatabaseRequest(AlterDMSDatabaseRequest source) {
        if (source.CurrentName != null) {
            this.CurrentName = new String(source.CurrentName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Asset != null) {
            this.Asset = new Asset(source.Asset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentName", this.CurrentName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamObj(map, prefix + "Asset.", this.Asset);

    }
}

