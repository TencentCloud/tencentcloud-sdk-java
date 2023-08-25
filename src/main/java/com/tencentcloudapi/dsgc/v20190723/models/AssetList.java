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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetList extends AbstractModel{

    /**
    * 数据源类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 数据源信息
    */
    @SerializedName("DataSourceInfo")
    @Expose
    private DataSourceInfo [] DataSourceInfo;

    /**
     * Get 数据源类型 
     * @return DataSourceType 数据源类型
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
     * @param DataSourceType 数据源类型
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 数据源信息 
     * @return DataSourceInfo 数据源信息
     */
    public DataSourceInfo [] getDataSourceInfo() {
        return this.DataSourceInfo;
    }

    /**
     * Set 数据源信息
     * @param DataSourceInfo 数据源信息
     */
    public void setDataSourceInfo(DataSourceInfo [] DataSourceInfo) {
        this.DataSourceInfo = DataSourceInfo;
    }

    public AssetList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetList(AssetList source) {
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.DataSourceInfo != null) {
            this.DataSourceInfo = new DataSourceInfo[source.DataSourceInfo.length];
            for (int i = 0; i < source.DataSourceInfo.length; i++) {
                this.DataSourceInfo[i] = new DataSourceInfo(source.DataSourceInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamArrayObj(map, prefix + "DataSourceInfo.", this.DataSourceInfo);

    }
}

