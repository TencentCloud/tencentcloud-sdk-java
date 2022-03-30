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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InjectConfig extends AbstractModel{

    /**
    * 不需要进行代理的 ip 地址范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeIPRanges")
    @Expose
    private String [] ExcludeIPRanges;

    /**
    * 是否等待sidecar启动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HoldApplicationUntilProxyStarts")
    @Expose
    private Boolean HoldApplicationUntilProxyStarts;

    /**
    * 是否允许sidecar等待
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HoldProxyUntilApplicationEnds")
    @Expose
    private Boolean HoldProxyUntilApplicationEnds;

    /**
     * Get 不需要进行代理的 ip 地址范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeIPRanges 不需要进行代理的 ip 地址范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludeIPRanges() {
        return this.ExcludeIPRanges;
    }

    /**
     * Set 不需要进行代理的 ip 地址范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeIPRanges 不需要进行代理的 ip 地址范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeIPRanges(String [] ExcludeIPRanges) {
        this.ExcludeIPRanges = ExcludeIPRanges;
    }

    /**
     * Get 是否等待sidecar启动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HoldApplicationUntilProxyStarts 是否等待sidecar启动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHoldApplicationUntilProxyStarts() {
        return this.HoldApplicationUntilProxyStarts;
    }

    /**
     * Set 是否等待sidecar启动
注意：此字段可能返回 null，表示取不到有效值。
     * @param HoldApplicationUntilProxyStarts 是否等待sidecar启动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHoldApplicationUntilProxyStarts(Boolean HoldApplicationUntilProxyStarts) {
        this.HoldApplicationUntilProxyStarts = HoldApplicationUntilProxyStarts;
    }

    /**
     * Get 是否允许sidecar等待
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HoldProxyUntilApplicationEnds 是否允许sidecar等待
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHoldProxyUntilApplicationEnds() {
        return this.HoldProxyUntilApplicationEnds;
    }

    /**
     * Set 是否允许sidecar等待
注意：此字段可能返回 null，表示取不到有效值。
     * @param HoldProxyUntilApplicationEnds 是否允许sidecar等待
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHoldProxyUntilApplicationEnds(Boolean HoldProxyUntilApplicationEnds) {
        this.HoldProxyUntilApplicationEnds = HoldProxyUntilApplicationEnds;
    }

    public InjectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InjectConfig(InjectConfig source) {
        if (source.ExcludeIPRanges != null) {
            this.ExcludeIPRanges = new String[source.ExcludeIPRanges.length];
            for (int i = 0; i < source.ExcludeIPRanges.length; i++) {
                this.ExcludeIPRanges[i] = new String(source.ExcludeIPRanges[i]);
            }
        }
        if (source.HoldApplicationUntilProxyStarts != null) {
            this.HoldApplicationUntilProxyStarts = new Boolean(source.HoldApplicationUntilProxyStarts);
        }
        if (source.HoldProxyUntilApplicationEnds != null) {
            this.HoldProxyUntilApplicationEnds = new Boolean(source.HoldProxyUntilApplicationEnds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ExcludeIPRanges.", this.ExcludeIPRanges);
        this.setParamSimple(map, prefix + "HoldApplicationUntilProxyStarts", this.HoldApplicationUntilProxyStarts);
        this.setParamSimple(map, prefix + "HoldProxyUntilApplicationEnds", this.HoldProxyUntilApplicationEnds);

    }
}

