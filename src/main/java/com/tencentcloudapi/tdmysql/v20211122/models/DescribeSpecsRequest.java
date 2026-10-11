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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecsRequest extends AbstractModel {

    /**
    * <p>全能型副本数，当前支持范围：1-3，默认为3</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>独享实例</p>
    */
    @SerializedName("IsExclusiveInstance")
    @Expose
    private Long IsExclusiveInstance;

    /**
    * <p>可用区组合列表</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
     * Get <p>全能型副本数，当前支持范围：1-3，默认为3</p> 
     * @return FullReplications <p>全能型副本数，当前支持范围：1-3，默认为3</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>全能型副本数，当前支持范围：1-3，默认为3</p>
     * @param FullReplications <p>全能型副本数，当前支持范围：1-3，默认为3</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    /**
     * Get <p>独享实例</p> 
     * @return IsExclusiveInstance <p>独享实例</p>
     */
    public Long getIsExclusiveInstance() {
        return this.IsExclusiveInstance;
    }

    /**
     * Set <p>独享实例</p>
     * @param IsExclusiveInstance <p>独享实例</p>
     */
    public void setIsExclusiveInstance(Long IsExclusiveInstance) {
        this.IsExclusiveInstance = IsExclusiveInstance;
    }

    /**
     * Get <p>可用区组合列表</p> 
     * @return Zones <p>可用区组合列表</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>可用区组合列表</p>
     * @param Zones <p>可用区组合列表</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    public DescribeSpecsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecsRequest(DescribeSpecsRequest source) {
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.IsExclusiveInstance != null) {
            this.IsExclusiveInstance = new Long(source.IsExclusiveInstance);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "IsExclusiveInstance", this.IsExclusiveInstance);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);

    }
}

