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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorLogItemExport extends AbstractModel{

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 日志等级，可选值note, warning，error
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 日志内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 日志等级，可选值note, warning，error
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 日志等级，可选值note, warning，error
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志等级，可选值note, warning，error
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 日志等级，可选值note, warning，error
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 日志内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ErrorLogItemExport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorLogItemExport(ErrorLogItemExport source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

