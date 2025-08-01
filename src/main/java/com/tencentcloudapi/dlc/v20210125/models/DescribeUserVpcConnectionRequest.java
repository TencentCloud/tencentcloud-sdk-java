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

public class DescribeUserVpcConnectionRequest extends AbstractModel {

    /**
    * 引擎网络ID
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * 引擎ID集合
    */
    @SerializedName("DataEngineIds")
    @Expose
    private String [] DataEngineIds;

    /**
     * Get 引擎网络ID 
     * @return EngineNetworkId 引擎网络ID
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set 引擎网络ID
     * @param EngineNetworkId 引擎网络ID
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get 引擎ID集合 
     * @return DataEngineIds 引擎ID集合
     */
    public String [] getDataEngineIds() {
        return this.DataEngineIds;
    }

    /**
     * Set 引擎ID集合
     * @param DataEngineIds 引擎ID集合
     */
    public void setDataEngineIds(String [] DataEngineIds) {
        this.DataEngineIds = DataEngineIds;
    }

    public DescribeUserVpcConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserVpcConnectionRequest(DescribeUserVpcConnectionRequest source) {
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.DataEngineIds != null) {
            this.DataEngineIds = new String[source.DataEngineIds.length];
            for (int i = 0; i < source.DataEngineIds.length; i++) {
                this.DataEngineIds[i] = new String(source.DataEngineIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamArraySimple(map, prefix + "DataEngineIds.", this.DataEngineIds);

    }
}

