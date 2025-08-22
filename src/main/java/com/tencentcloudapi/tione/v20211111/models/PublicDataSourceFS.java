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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicDataSourceFS extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 相对数据源子路径
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 相对数据源子路径 
     * @return SubPath 相对数据源子路径
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set 相对数据源子路径
     * @param SubPath 相对数据源子路径
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    public PublicDataSourceFS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicDataSourceFS(PublicDataSourceFS source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);

    }
}

