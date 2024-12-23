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

public class TopAssetStat extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * db_name
    */
    @SerializedName("SubData")
    @Expose
    private String SubData;

    /**
    * 敏感个数
    */
    @SerializedName("SensitiveCnt")
    @Expose
    private Long SensitiveCnt;

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
     * Get db_name 
     * @return SubData db_name
     */
    public String getSubData() {
        return this.SubData;
    }

    /**
     * Set db_name
     * @param SubData db_name
     */
    public void setSubData(String SubData) {
        this.SubData = SubData;
    }

    /**
     * Get 敏感个数 
     * @return SensitiveCnt 敏感个数
     */
    public Long getSensitiveCnt() {
        return this.SensitiveCnt;
    }

    /**
     * Set 敏感个数
     * @param SensitiveCnt 敏感个数
     */
    public void setSensitiveCnt(Long SensitiveCnt) {
        this.SensitiveCnt = SensitiveCnt;
    }

    public TopAssetStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopAssetStat(TopAssetStat source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.SubData != null) {
            this.SubData = new String(source.SubData);
        }
        if (source.SensitiveCnt != null) {
            this.SensitiveCnt = new Long(source.SensitiveCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "SubData", this.SubData);
        this.setParamSimple(map, prefix + "SensitiveCnt", this.SensitiveCnt);

    }
}

