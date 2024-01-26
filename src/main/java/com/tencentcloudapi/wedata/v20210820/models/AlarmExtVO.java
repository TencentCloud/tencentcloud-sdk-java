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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmExtVO extends AbstractModel {

    /**
    * 告警策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 扩展字段key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropName")
    @Expose
    private String PropName;

    /**
    * 扩展字段value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropValue")
    @Expose
    private String PropValue;

    /**
    * 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 告警策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmId 告警策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmId 告警策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 扩展字段key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropName 扩展字段key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropName() {
        return this.PropName;
    }

    /**
     * Set 扩展字段key
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropName 扩展字段key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropName(String PropName) {
        this.PropName = PropName;
    }

    /**
     * Get 扩展字段value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropValue 扩展字段value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropValue() {
        return this.PropValue;
    }

    /**
     * Set 扩展字段value
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropValue 扩展字段value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropValue(String PropValue) {
        this.PropValue = PropValue;
    }

    /**
     * Get 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public AlarmExtVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmExtVO(AlarmExtVO source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.PropName != null) {
            this.PropName = new String(source.PropName);
        }
        if (source.PropValue != null) {
            this.PropValue = new String(source.PropValue);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "PropName", this.PropName);
        this.setParamSimple(map, prefix + "PropValue", this.PropValue);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

