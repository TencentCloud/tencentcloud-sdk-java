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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessIndexOptionsField extends AbstractModel {

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireMaxAge")
    @Expose
    private String ExpireMaxAge;

    /**
    * 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireMaxAge 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireMaxAge() {
        return this.ExpireMaxAge;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireMaxAge 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireMaxAge(String ExpireMaxAge) {
        this.ExpireMaxAge = ExpireMaxAge;
    }

    /**
     * Get 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimestampField 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimestampField 时间分区字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    public ServerlessIndexOptionsField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessIndexOptionsField(ServerlessIndexOptionsField source) {
        if (source.ExpireMaxAge != null) {
            this.ExpireMaxAge = new String(source.ExpireMaxAge);
        }
        if (source.TimestampField != null) {
            this.TimestampField = new String(source.TimestampField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpireMaxAge", this.ExpireMaxAge);
        this.setParamSimple(map, prefix + "TimestampField", this.TimestampField);

    }
}

