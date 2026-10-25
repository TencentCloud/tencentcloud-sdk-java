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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongodbSpaceObjectItem extends AbstractModel {

    /**
    * <p>集合级空间明细数组。每项含顶层标识字段（AppId/InstanceId/Db/Timestamp/SizeOnDisk）与嵌套 Collection 明细。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceSchemas")
    @Expose
    private MongoDBTableSpaceItem [] SpaceSchemas;

    /**
    * <p>数据采集时间戳（秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get <p>集合级空间明细数组。每项含顶层标识字段（AppId/InstanceId/Db/Timestamp/SizeOnDisk）与嵌套 Collection 明细。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceSchemas <p>集合级空间明细数组。每项含顶层标识字段（AppId/InstanceId/Db/Timestamp/SizeOnDisk）与嵌套 Collection 明细。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBTableSpaceItem [] getSpaceSchemas() {
        return this.SpaceSchemas;
    }

    /**
     * Set <p>集合级空间明细数组。每项含顶层标识字段（AppId/InstanceId/Db/Timestamp/SizeOnDisk）与嵌套 Collection 明细。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceSchemas <p>集合级空间明细数组。每项含顶层标识字段（AppId/InstanceId/Db/Timestamp/SizeOnDisk）与嵌套 Collection 明细。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceSchemas(MongoDBTableSpaceItem [] SpaceSchemas) {
        this.SpaceSchemas = SpaceSchemas;
    }

    /**
     * Get <p>数据采集时间戳（秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>数据采集时间戳（秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>数据采集时间戳（秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>数据采集时间戳（秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public MongodbSpaceObjectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongodbSpaceObjectItem(MongodbSpaceObjectItem source) {
        if (source.SpaceSchemas != null) {
            this.SpaceSchemas = new MongoDBTableSpaceItem[source.SpaceSchemas.length];
            for (int i = 0; i < source.SpaceSchemas.length; i++) {
                this.SpaceSchemas[i] = new MongoDBTableSpaceItem(source.SpaceSchemas[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SpaceSchemas.", this.SpaceSchemas);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

