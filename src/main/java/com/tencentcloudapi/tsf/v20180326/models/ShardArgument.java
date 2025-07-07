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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShardArgument extends AbstractModel {

    /**
    * 分片参数 KEY，整形, 范围 [1,1000]
    */
    @SerializedName("ShardKey")
    @Expose
    private Long ShardKey;

    /**
    * 分片参数 VALUE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardValue")
    @Expose
    private String ShardValue;

    /**
     * Get 分片参数 KEY，整形, 范围 [1,1000] 
     * @return ShardKey 分片参数 KEY，整形, 范围 [1,1000]
     */
    public Long getShardKey() {
        return this.ShardKey;
    }

    /**
     * Set 分片参数 KEY，整形, 范围 [1,1000]
     * @param ShardKey 分片参数 KEY，整形, 范围 [1,1000]
     */
    public void setShardKey(Long ShardKey) {
        this.ShardKey = ShardKey;
    }

    /**
     * Get 分片参数 VALUE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardValue 分片参数 VALUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardValue() {
        return this.ShardValue;
    }

    /**
     * Set 分片参数 VALUE
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardValue 分片参数 VALUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardValue(String ShardValue) {
        this.ShardValue = ShardValue;
    }

    public ShardArgument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShardArgument(ShardArgument source) {
        if (source.ShardKey != null) {
            this.ShardKey = new Long(source.ShardKey);
        }
        if (source.ShardValue != null) {
            this.ShardValue = new String(source.ShardValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardKey", this.ShardKey);
        this.setParamSimple(map, prefix + "ShardValue", this.ShardValue);

    }
}

