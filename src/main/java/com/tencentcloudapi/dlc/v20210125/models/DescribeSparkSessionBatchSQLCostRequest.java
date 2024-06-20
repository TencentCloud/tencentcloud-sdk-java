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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkSessionBatchSQLCostRequest extends AbstractModel {

    /**
    * SparkSQL唯一标识
    */
    @SerializedName("BatchIds")
    @Expose
    private String [] BatchIds;

    /**
     * Get SparkSQL唯一标识 
     * @return BatchIds SparkSQL唯一标识
     */
    public String [] getBatchIds() {
        return this.BatchIds;
    }

    /**
     * Set SparkSQL唯一标识
     * @param BatchIds SparkSQL唯一标识
     */
    public void setBatchIds(String [] BatchIds) {
        this.BatchIds = BatchIds;
    }

    public DescribeSparkSessionBatchSQLCostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkSessionBatchSQLCostRequest(DescribeSparkSessionBatchSQLCostRequest source) {
        if (source.BatchIds != null) {
            this.BatchIds = new String[source.BatchIds.length];
            for (int i = 0; i < source.BatchIds.length; i++) {
                this.BatchIds[i] = new String(source.BatchIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BatchIds.", this.BatchIds);

    }
}

