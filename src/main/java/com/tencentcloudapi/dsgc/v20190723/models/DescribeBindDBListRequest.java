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

public class DescribeBindDBListRequest extends AbstractModel {

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 数据源类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
     * Get dspa实例id 
     * @return DspaId dspa实例id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例id
     * @param DspaId dspa实例id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 数据源类型 
     * @return DataSourceType 数据源类型
     * @deprecated
     */
    @Deprecated
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
     * @param DataSourceType 数据源类型
     * @deprecated
     */
    @Deprecated
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     * @deprecated
     */
    @Deprecated
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     * @deprecated
     */
    @Deprecated
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    public DescribeBindDBListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindDBListRequest(DescribeBindDBListRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);

    }
}

