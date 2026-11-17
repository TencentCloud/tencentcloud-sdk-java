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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FullBackupProgress extends AbstractModel {

    /**
    * 结构备份进度，取值范围为 0 - 100，单位：百分比。
    */
    @SerializedName("SchemaProgress")
    @Expose
    private Long SchemaProgress;

    /**
    * 数据备份进度，取值范围为 0 - 100，单位：百分比。
    */
    @SerializedName("DataProgress")
    @Expose
    private Long DataProgress;

    /**
     * Get 结构备份进度，取值范围为 0 - 100，单位：百分比。 
     * @return SchemaProgress 结构备份进度，取值范围为 0 - 100，单位：百分比。
     */
    public Long getSchemaProgress() {
        return this.SchemaProgress;
    }

    /**
     * Set 结构备份进度，取值范围为 0 - 100，单位：百分比。
     * @param SchemaProgress 结构备份进度，取值范围为 0 - 100，单位：百分比。
     */
    public void setSchemaProgress(Long SchemaProgress) {
        this.SchemaProgress = SchemaProgress;
    }

    /**
     * Get 数据备份进度，取值范围为 0 - 100，单位：百分比。 
     * @return DataProgress 数据备份进度，取值范围为 0 - 100，单位：百分比。
     */
    public Long getDataProgress() {
        return this.DataProgress;
    }

    /**
     * Set 数据备份进度，取值范围为 0 - 100，单位：百分比。
     * @param DataProgress 数据备份进度，取值范围为 0 - 100，单位：百分比。
     */
    public void setDataProgress(Long DataProgress) {
        this.DataProgress = DataProgress;
    }

    public FullBackupProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FullBackupProgress(FullBackupProgress source) {
        if (source.SchemaProgress != null) {
            this.SchemaProgress = new Long(source.SchemaProgress);
        }
        if (source.DataProgress != null) {
            this.DataProgress = new Long(source.DataProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchemaProgress", this.SchemaProgress);
        this.setParamSimple(map, prefix + "DataProgress", this.DataProgress);

    }
}

