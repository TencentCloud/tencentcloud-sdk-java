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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataStreamInfo extends AbstractModel {

    /**
    * 自治索引名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataStreamName")
    @Expose
    private String DataStreamName;

    /**
    * 分片状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsShardComplete")
    @Expose
    private Long IsShardComplete;

    /**
     * Get 自治索引名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataStreamName 自治索引名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataStreamName() {
        return this.DataStreamName;
    }

    /**
     * Set 自治索引名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataStreamName 自治索引名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataStreamName(String DataStreamName) {
        this.DataStreamName = DataStreamName;
    }

    /**
     * Get 分片状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsShardComplete 分片状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsShardComplete() {
        return this.IsShardComplete;
    }

    /**
     * Set 分片状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsShardComplete 分片状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsShardComplete(Long IsShardComplete) {
        this.IsShardComplete = IsShardComplete;
    }

    public DataStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataStreamInfo(DataStreamInfo source) {
        if (source.DataStreamName != null) {
            this.DataStreamName = new String(source.DataStreamName);
        }
        if (source.IsShardComplete != null) {
            this.IsShardComplete = new Long(source.IsShardComplete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataStreamName", this.DataStreamName);
        this.setParamSimple(map, prefix + "IsShardComplete", this.IsShardComplete);

    }
}

