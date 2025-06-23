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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOtherCloudAssetsRequest extends AbstractModel {

    /**
    * -
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * 资产类型:MYSQL/MARIADB/REDIS/MONGODB/POSTGRES/CTS/ES/KAFKA/COS/CBS/CFS
    */
    @SerializedName("AssetTypes")
    @Expose
    private String [] AssetTypes;

    /**
     * Get - 
     * @return Filter -
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set -
     * @param Filter -
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 资产类型:MYSQL/MARIADB/REDIS/MONGODB/POSTGRES/CTS/ES/KAFKA/COS/CBS/CFS 
     * @return AssetTypes 资产类型:MYSQL/MARIADB/REDIS/MONGODB/POSTGRES/CTS/ES/KAFKA/COS/CBS/CFS
     */
    public String [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set 资产类型:MYSQL/MARIADB/REDIS/MONGODB/POSTGRES/CTS/ES/KAFKA/COS/CBS/CFS
     * @param AssetTypes 资产类型:MYSQL/MARIADB/REDIS/MONGODB/POSTGRES/CTS/ES/KAFKA/COS/CBS/CFS
     */
    public void setAssetTypes(String [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    public DescribeOtherCloudAssetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOtherCloudAssetsRequest(DescribeOtherCloudAssetsRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new String[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new String(source.AssetTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);

    }
}

