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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIntegrationNodeColumnSchemaRequest extends AbstractModel{

    /**
    * 字段示例（json格式）
    */
    @SerializedName("ColumnContent")
    @Expose
    private String ColumnContent;

    /**
    * 数据源类型
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get 字段示例（json格式） 
     * @return ColumnContent 字段示例（json格式）
     */
    public String getColumnContent() {
        return this.ColumnContent;
    }

    /**
     * Set 字段示例（json格式）
     * @param ColumnContent 字段示例（json格式）
     */
    public void setColumnContent(String ColumnContent) {
        this.ColumnContent = ColumnContent;
    }

    /**
     * Get 数据源类型 
     * @return DatasourceType 数据源类型
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
     * @param DatasourceType 数据源类型
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public GetIntegrationNodeColumnSchemaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIntegrationNodeColumnSchemaRequest(GetIntegrationNodeColumnSchemaRequest source) {
        if (source.ColumnContent != null) {
            this.ColumnContent = new String(source.ColumnContent);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnContent", this.ColumnContent);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

