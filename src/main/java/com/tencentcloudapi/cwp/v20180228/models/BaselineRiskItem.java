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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRiskItem extends AbstractModel{

    /**
    * 检测项Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * 检测项名字
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 影响服务器数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
     * Get 检测项Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemId 检测项Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set 检测项Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemId 检测项Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 检测项名字 
     * @return ItemName 检测项名字
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 检测项名字
     * @param ItemName 检测项名字
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 影响服务器数 
     * @return HostCount 影响服务器数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 影响服务器数
     * @param HostCount 影响服务器数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    public BaselineRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRiskItem(BaselineRiskItem source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);

    }
}

