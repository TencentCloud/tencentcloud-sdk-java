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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeUnitStatisticItem extends AbstractModel{

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 在线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 异常数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abnormal")
    @Expose
    private Long Abnormal;

    /**
    * 离线数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offline")
    @Expose
    private Long Offline;

    /**
    * 未激活
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotActive")
    @Expose
    private Long NotActive;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 在线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Online 在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 在线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Online 在线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 异常数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abnormal 异常数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAbnormal() {
        return this.Abnormal;
    }

    /**
     * Set 异常数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abnormal 异常数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormal(Long Abnormal) {
        this.Abnormal = Abnormal;
    }

    /**
     * Get 离线数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offline 离线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffline() {
        return this.Offline;
    }

    /**
     * Set 离线数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offline 离线数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffline(Long Offline) {
        this.Offline = Offline;
    }

    /**
     * Get 未激活
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotActive 未激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotActive() {
        return this.NotActive;
    }

    /**
     * Set 未激活
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotActive 未激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotActive(Long NotActive) {
        this.NotActive = NotActive;
    }

    public EdgeUnitStatisticItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeUnitStatisticItem(EdgeUnitStatisticItem source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
        if (source.Abnormal != null) {
            this.Abnormal = new Long(source.Abnormal);
        }
        if (source.Offline != null) {
            this.Offline = new Long(source.Offline);
        }
        if (source.NotActive != null) {
            this.NotActive = new Long(source.NotActive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "Abnormal", this.Abnormal);
        this.setParamSimple(map, prefix + "Offline", this.Offline);
        this.setParamSimple(map, prefix + "NotActive", this.NotActive);

    }
}

