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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptimizerEngineInfo extends AbstractModel {

    /**
    * 引擎资源名称
    */
    @SerializedName("HouseName")
    @Expose
    private String HouseName;

    /**
    * 引擎资源ID
    */
    @SerializedName("HouseId")
    @Expose
    private String HouseId;

    /**
    * 该参数仅针对spark作业引擎有效，用于执行数据优化任务的资源大小，不填时将采用该引擎所有资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HouseSize")
    @Expose
    private Long HouseSize;

    /**
     * Get 引擎资源名称 
     * @return HouseName 引擎资源名称
     */
    public String getHouseName() {
        return this.HouseName;
    }

    /**
     * Set 引擎资源名称
     * @param HouseName 引擎资源名称
     */
    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    /**
     * Get 引擎资源ID 
     * @return HouseId 引擎资源ID
     */
    public String getHouseId() {
        return this.HouseId;
    }

    /**
     * Set 引擎资源ID
     * @param HouseId 引擎资源ID
     */
    public void setHouseId(String HouseId) {
        this.HouseId = HouseId;
    }

    /**
     * Get 该参数仅针对spark作业引擎有效，用于执行数据优化任务的资源大小，不填时将采用该引擎所有资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HouseSize 该参数仅针对spark作业引擎有效，用于执行数据优化任务的资源大小，不填时将采用该引擎所有资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHouseSize() {
        return this.HouseSize;
    }

    /**
     * Set 该参数仅针对spark作业引擎有效，用于执行数据优化任务的资源大小，不填时将采用该引擎所有资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param HouseSize 该参数仅针对spark作业引擎有效，用于执行数据优化任务的资源大小，不填时将采用该引擎所有资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHouseSize(Long HouseSize) {
        this.HouseSize = HouseSize;
    }

    public OptimizerEngineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptimizerEngineInfo(OptimizerEngineInfo source) {
        if (source.HouseName != null) {
            this.HouseName = new String(source.HouseName);
        }
        if (source.HouseId != null) {
            this.HouseId = new String(source.HouseId);
        }
        if (source.HouseSize != null) {
            this.HouseSize = new Long(source.HouseSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HouseName", this.HouseName);
        this.setParamSimple(map, prefix + "HouseId", this.HouseId);
        this.setParamSimple(map, prefix + "HouseSize", this.HouseSize);

    }
}

