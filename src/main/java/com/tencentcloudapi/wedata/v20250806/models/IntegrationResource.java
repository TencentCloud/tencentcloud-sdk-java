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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationResource extends AbstractModel {

    /**
    * 实时集成资源组

- i32c(实时数据同步-16C64G)
    */
    @SerializedName("RealTimeDataSync")
    @Expose
    private ResourceGroupSpecification RealTimeDataSync;

    /**
    * 离线集成资源组

- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)
    */
    @SerializedName("OfflineDataSync")
    @Expose
    private ResourceGroupSpecification OfflineDataSync;

    /**
     * Get 实时集成资源组

- i32c(实时数据同步-16C64G) 
     * @return RealTimeDataSync 实时集成资源组

- i32c(实时数据同步-16C64G)
     */
    public ResourceGroupSpecification getRealTimeDataSync() {
        return this.RealTimeDataSync;
    }

    /**
     * Set 实时集成资源组

- i32c(实时数据同步-16C64G)
     * @param RealTimeDataSync 实时集成资源组

- i32c(实时数据同步-16C64G)
     */
    public void setRealTimeDataSync(ResourceGroupSpecification RealTimeDataSync) {
        this.RealTimeDataSync = RealTimeDataSync;
    }

    /**
     * Get 离线集成资源组

- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G) 
     * @return OfflineDataSync 离线集成资源组

- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)
     */
    public ResourceGroupSpecification getOfflineDataSync() {
        return this.OfflineDataSync;
    }

    /**
     * Set 离线集成资源组

- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)
     * @param OfflineDataSync 离线集成资源组

- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)
     */
    public void setOfflineDataSync(ResourceGroupSpecification OfflineDataSync) {
        this.OfflineDataSync = OfflineDataSync;
    }

    public IntegrationResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationResource(IntegrationResource source) {
        if (source.RealTimeDataSync != null) {
            this.RealTimeDataSync = new ResourceGroupSpecification(source.RealTimeDataSync);
        }
        if (source.OfflineDataSync != null) {
            this.OfflineDataSync = new ResourceGroupSpecification(source.OfflineDataSync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RealTimeDataSync.", this.RealTimeDataSync);
        this.setParamObj(map, prefix + "OfflineDataSync.", this.OfflineDataSync);

    }
}

