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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificationDataItem extends AbstractModel {

    /**
    * 任务规格。
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 统计数据。
    */
    @SerializedName("Data")
    @Expose
    private TaskStatDataItem [] Data;

    /**
     * Get 任务规格。 
     * @return Specification 任务规格。
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 任务规格。
     * @param Specification 任务规格。
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 统计数据。 
     * @return Data 统计数据。
     */
    public TaskStatDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set 统计数据。
     * @param Data 统计数据。
     */
    public void setData(TaskStatDataItem [] Data) {
        this.Data = Data;
    }

    public SpecificationDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecificationDataItem(SpecificationDataItem source) {
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Data != null) {
            this.Data = new TaskStatDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TaskStatDataItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

