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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DateParam extends AbstractModel{

    /**
    * 时间格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 输入类型，string，unix时间戳，默认string
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 时区，默认GMT+8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 时间格式 
     * @return Format 时间格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 时间格式
     * @param Format 时间格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 输入类型，string，unix时间戳，默认string
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetType 输入类型，string，unix时间戳，默认string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 输入类型，string，unix时间戳，默认string
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetType 输入类型，string，unix时间戳，默认string
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 时区，默认GMT+8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone 时区，默认GMT+8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区，默认GMT+8
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone 时区，默认GMT+8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DateParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DateParam(DateParam source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

