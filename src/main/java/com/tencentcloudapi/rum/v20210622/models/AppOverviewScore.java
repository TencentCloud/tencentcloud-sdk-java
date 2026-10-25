/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppOverviewScore extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>端</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>加权总分，全部缺失时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalScore")
    @Expose
    private Float TotalScore;

    /**
    * <p>计分项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private OverviewScoreItem [] Items;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>端</p> 
     * @return Platform <p>端</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>端</p>
     * @param Platform <p>端</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>加权总分，全部缺失时省略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalScore <p>加权总分，全部缺失时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalScore() {
        return this.TotalScore;
    }

    /**
     * Set <p>加权总分，全部缺失时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalScore <p>加权总分，全部缺失时省略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalScore(Float TotalScore) {
        this.TotalScore = TotalScore;
    }

    /**
     * Get <p>计分项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items <p>计分项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OverviewScoreItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>计分项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items <p>计分项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(OverviewScoreItem [] Items) {
        this.Items = Items;
    }

    public AppOverviewScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppOverviewScore(AppOverviewScore source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.TotalScore != null) {
            this.TotalScore = new Float(source.TotalScore);
        }
        if (source.Items != null) {
            this.Items = new OverviewScoreItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new OverviewScoreItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "TotalScore", this.TotalScore);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

