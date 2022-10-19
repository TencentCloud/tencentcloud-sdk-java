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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmHierarchicalValue extends AbstractModel{

    /**
    * 提醒等级阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remind")
    @Expose
    private String Remind;

    /**
    * 警告等级阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warn")
    @Expose
    private String Warn;

    /**
    * 严重等级阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Serious")
    @Expose
    private String Serious;

    /**
     * Get 提醒等级阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remind 提醒等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemind() {
        return this.Remind;
    }

    /**
     * Set 提醒等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remind 提醒等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemind(String Remind) {
        this.Remind = Remind;
    }

    /**
     * Get 警告等级阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warn 警告等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarn() {
        return this.Warn;
    }

    /**
     * Set 警告等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warn 警告等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarn(String Warn) {
        this.Warn = Warn;
    }

    /**
     * Get 严重等级阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Serious 严重等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerious() {
        return this.Serious;
    }

    /**
     * Set 严重等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Serious 严重等级阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerious(String Serious) {
        this.Serious = Serious;
    }

    public AlarmHierarchicalValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmHierarchicalValue(AlarmHierarchicalValue source) {
        if (source.Remind != null) {
            this.Remind = new String(source.Remind);
        }
        if (source.Warn != null) {
            this.Warn = new String(source.Warn);
        }
        if (source.Serious != null) {
            this.Serious = new String(source.Serious);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remind", this.Remind);
        this.setParamSimple(map, prefix + "Warn", this.Warn);
        this.setParamSimple(map, prefix + "Serious", this.Serious);

    }
}

