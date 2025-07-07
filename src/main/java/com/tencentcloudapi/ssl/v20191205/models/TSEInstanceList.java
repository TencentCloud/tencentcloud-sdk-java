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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TSEInstanceList extends AbstractModel {

    /**
    * TSE实例详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceList")
    @Expose
    private TSEInstanceDetail [] InstanceList;

    /**
    * 该地域下TSE实例总数	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 地域	
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get TSE实例详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceList TSE实例详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TSEInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set TSE实例详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceList TSE实例详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceList(TSEInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get 该地域下TSE实例总数	 
     * @return TotalCount 该地域下TSE实例总数	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 该地域下TSE实例总数	
     * @param TotalCount 该地域下TSE实例总数	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 地域	 
     * @return Region 地域	
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域	
     * @param Region 地域	
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 是否查询异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public TSEInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TSEInstanceList(TSEInstanceList source) {
        if (source.InstanceList != null) {
            this.InstanceList = new TSEInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new TSEInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

