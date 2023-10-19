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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDealedTrendItem extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 未解决数量
    */
    @SerializedName("Unhandled")
    @Expose
    private Long Unhandled;

    /**
    * 已解决数量
    */
    @SerializedName("Handled")
    @Expose
    private Long Handled;

    /**
    * 新发现
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewDiscoveryHandled")
    @Expose
    private Long NewDiscoveryHandled;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 未解决数量 
     * @return Unhandled 未解决数量
     */
    public Long getUnhandled() {
        return this.Unhandled;
    }

    /**
     * Set 未解决数量
     * @param Unhandled 未解决数量
     */
    public void setUnhandled(Long Unhandled) {
        this.Unhandled = Unhandled;
    }

    /**
     * Get 已解决数量 
     * @return Handled 已解决数量
     */
    public Long getHandled() {
        return this.Handled;
    }

    /**
     * Set 已解决数量
     * @param Handled 已解决数量
     */
    public void setHandled(Long Handled) {
        this.Handled = Handled;
    }

    /**
     * Get 新发现
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewDiscoveryHandled 新发现
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewDiscoveryHandled() {
        return this.NewDiscoveryHandled;
    }

    /**
     * Set 新发现
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewDiscoveryHandled 新发现
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewDiscoveryHandled(Long NewDiscoveryHandled) {
        this.NewDiscoveryHandled = NewDiscoveryHandled;
    }

    public RiskDealedTrendItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDealedTrendItem(RiskDealedTrendItem source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Unhandled != null) {
            this.Unhandled = new Long(source.Unhandled);
        }
        if (source.Handled != null) {
            this.Handled = new Long(source.Handled);
        }
        if (source.NewDiscoveryHandled != null) {
            this.NewDiscoveryHandled = new Long(source.NewDiscoveryHandled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Unhandled", this.Unhandled);
        this.setParamSimple(map, prefix + "Handled", this.Handled);
        this.setParamSimple(map, prefix + "NewDiscoveryHandled", this.NewDiscoveryHandled);

    }
}

