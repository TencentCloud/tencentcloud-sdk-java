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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterSlaveData extends AbstractModel {

    /**
    * 旧主可用区
    */
    @SerializedName("OldMasterZone")
    @Expose
    private String OldMasterZone;

    /**
    * 旧从可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldSlaveZone")
    @Expose
    private String [] OldSlaveZone;

    /**
    * 新主可用区
    */
    @SerializedName("NewMasterZone")
    @Expose
    private String NewMasterZone;

    /**
    * 新从可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewSlaveZone")
    @Expose
    private String [] NewSlaveZone;

    /**
    * 新从可用区属性
    */
    @SerializedName("NewSlaveZoneAttr")
    @Expose
    private SlaveZoneAttrItem [] NewSlaveZoneAttr;

    /**
    * 旧可用区属性
    */
    @SerializedName("OldSlaveZoneAttr")
    @Expose
    private SlaveZoneAttrItem [] OldSlaveZoneAttr;

    /**
     * Get 旧主可用区 
     * @return OldMasterZone 旧主可用区
     */
    public String getOldMasterZone() {
        return this.OldMasterZone;
    }

    /**
     * Set 旧主可用区
     * @param OldMasterZone 旧主可用区
     */
    public void setOldMasterZone(String OldMasterZone) {
        this.OldMasterZone = OldMasterZone;
    }

    /**
     * Get 旧从可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldSlaveZone 旧从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOldSlaveZone() {
        return this.OldSlaveZone;
    }

    /**
     * Set 旧从可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldSlaveZone 旧从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldSlaveZone(String [] OldSlaveZone) {
        this.OldSlaveZone = OldSlaveZone;
    }

    /**
     * Get 新主可用区 
     * @return NewMasterZone 新主可用区
     */
    public String getNewMasterZone() {
        return this.NewMasterZone;
    }

    /**
     * Set 新主可用区
     * @param NewMasterZone 新主可用区
     */
    public void setNewMasterZone(String NewMasterZone) {
        this.NewMasterZone = NewMasterZone;
    }

    /**
     * Get 新从可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewSlaveZone 新从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNewSlaveZone() {
        return this.NewSlaveZone;
    }

    /**
     * Set 新从可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewSlaveZone 新从可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewSlaveZone(String [] NewSlaveZone) {
        this.NewSlaveZone = NewSlaveZone;
    }

    /**
     * Get 新从可用区属性 
     * @return NewSlaveZoneAttr 新从可用区属性
     */
    public SlaveZoneAttrItem [] getNewSlaveZoneAttr() {
        return this.NewSlaveZoneAttr;
    }

    /**
     * Set 新从可用区属性
     * @param NewSlaveZoneAttr 新从可用区属性
     */
    public void setNewSlaveZoneAttr(SlaveZoneAttrItem [] NewSlaveZoneAttr) {
        this.NewSlaveZoneAttr = NewSlaveZoneAttr;
    }

    /**
     * Get 旧可用区属性 
     * @return OldSlaveZoneAttr 旧可用区属性
     */
    public SlaveZoneAttrItem [] getOldSlaveZoneAttr() {
        return this.OldSlaveZoneAttr;
    }

    /**
     * Set 旧可用区属性
     * @param OldSlaveZoneAttr 旧可用区属性
     */
    public void setOldSlaveZoneAttr(SlaveZoneAttrItem [] OldSlaveZoneAttr) {
        this.OldSlaveZoneAttr = OldSlaveZoneAttr;
    }

    public ClusterSlaveData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterSlaveData(ClusterSlaveData source) {
        if (source.OldMasterZone != null) {
            this.OldMasterZone = new String(source.OldMasterZone);
        }
        if (source.OldSlaveZone != null) {
            this.OldSlaveZone = new String[source.OldSlaveZone.length];
            for (int i = 0; i < source.OldSlaveZone.length; i++) {
                this.OldSlaveZone[i] = new String(source.OldSlaveZone[i]);
            }
        }
        if (source.NewMasterZone != null) {
            this.NewMasterZone = new String(source.NewMasterZone);
        }
        if (source.NewSlaveZone != null) {
            this.NewSlaveZone = new String[source.NewSlaveZone.length];
            for (int i = 0; i < source.NewSlaveZone.length; i++) {
                this.NewSlaveZone[i] = new String(source.NewSlaveZone[i]);
            }
        }
        if (source.NewSlaveZoneAttr != null) {
            this.NewSlaveZoneAttr = new SlaveZoneAttrItem[source.NewSlaveZoneAttr.length];
            for (int i = 0; i < source.NewSlaveZoneAttr.length; i++) {
                this.NewSlaveZoneAttr[i] = new SlaveZoneAttrItem(source.NewSlaveZoneAttr[i]);
            }
        }
        if (source.OldSlaveZoneAttr != null) {
            this.OldSlaveZoneAttr = new SlaveZoneAttrItem[source.OldSlaveZoneAttr.length];
            for (int i = 0; i < source.OldSlaveZoneAttr.length; i++) {
                this.OldSlaveZoneAttr[i] = new SlaveZoneAttrItem(source.OldSlaveZoneAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldMasterZone", this.OldMasterZone);
        this.setParamArraySimple(map, prefix + "OldSlaveZone.", this.OldSlaveZone);
        this.setParamSimple(map, prefix + "NewMasterZone", this.NewMasterZone);
        this.setParamArraySimple(map, prefix + "NewSlaveZone.", this.NewSlaveZone);
        this.setParamArrayObj(map, prefix + "NewSlaveZoneAttr.", this.NewSlaveZoneAttr);
        this.setParamArrayObj(map, prefix + "OldSlaveZoneAttr.", this.OldSlaveZoneAttr);

    }
}

