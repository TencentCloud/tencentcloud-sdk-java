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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SampleLog extends AbstractModel{

    /**
    * 日志毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 采样日志属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attributes")
    @Expose
    private Attributes Attributes;

    /**
    * har格式的采样请求
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get 日志毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 日志毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 日志毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 日志毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 采样日志属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attributes 采样日志属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attributes getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 采样日志属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attributes 采样日志属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributes(Attributes Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get har格式的采样请求
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Body har格式的采样请求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set har格式的采样请求
注意：此字段可能返回 null，表示取不到有效值。
     * @param Body har格式的采样请求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    public SampleLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SampleLog(SampleLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Attributes != null) {
            this.Attributes = new Attributes(source.Attributes);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}

