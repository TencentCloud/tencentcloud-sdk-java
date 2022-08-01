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

public class NormalLog extends AbstractModel{

    /**
    * 毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 日志级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeverityText")
    @Expose
    private String SeverityText;

    /**
    * 日志输出内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
     * Get 毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 日志级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeverityText 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeverityText() {
        return this.SeverityText;
    }

    /**
     * Set 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeverityText 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeverityText(String SeverityText) {
        this.SeverityText = SeverityText;
    }

    /**
     * Get 日志输出内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Body 日志输出内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 日志输出内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Body 日志输出内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    public NormalLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalLog(NormalLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.SeverityText != null) {
            this.SeverityText = new String(source.SeverityText);
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
        this.setParamSimple(map, prefix + "SeverityText", this.SeverityText);
        this.setParamSimple(map, prefix + "Body", this.Body);

    }
}

