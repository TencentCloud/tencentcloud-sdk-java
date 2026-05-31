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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageRankItem extends AbstractModel {

    /**
    * 全局排名（从 1 起）。分页场景下仍为全量排序中的位次，非页内序号
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * 对象标识。apikey 维度为 APIKey ID；endpoint 维度为接入点；model 维度为模型名。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对象展示名。apikey 维度返回 APIKey 名称（已删除的 APIKey 仍保留原名）；
endpoint / model 维度等于 Key。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 时间周期内的统计值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stats")
    @Expose
    private UsageStats Stats;

    /**
    * 时间周期内的时序点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Series")
    @Expose
    private UsageSeries Series;

    /**
     * Get 全局排名（从 1 起）。分页场景下仍为全量排序中的位次，非页内序号 
     * @return Rank 全局排名（从 1 起）。分页场景下仍为全量排序中的位次，非页内序号
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 全局排名（从 1 起）。分页场景下仍为全量排序中的位次，非页内序号
     * @param Rank 全局排名（从 1 起）。分页场景下仍为全量排序中的位次，非页内序号
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get 对象标识。apikey 维度为 APIKey ID；endpoint 维度为接入点；model 维度为模型名。 
     * @return Key 对象标识。apikey 维度为 APIKey ID；endpoint 维度为接入点；model 维度为模型名。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 对象标识。apikey 维度为 APIKey ID；endpoint 维度为接入点；model 维度为模型名。
     * @param Key 对象标识。apikey 维度为 APIKey ID；endpoint 维度为接入点；model 维度为模型名。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对象展示名。apikey 维度返回 APIKey 名称（已删除的 APIKey 仍保留原名）；
endpoint / model 维度等于 Key。 
     * @return Name 对象展示名。apikey 维度返回 APIKey 名称（已删除的 APIKey 仍保留原名）；
endpoint / model 维度等于 Key。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 对象展示名。apikey 维度返回 APIKey 名称（已删除的 APIKey 仍保留原名）；
endpoint / model 维度等于 Key。
     * @param Name 对象展示名。apikey 维度返回 APIKey 名称（已删除的 APIKey 仍保留原名）；
endpoint / model 维度等于 Key。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 时间周期内的统计值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stats 时间周期内的统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageStats getStats() {
        return this.Stats;
    }

    /**
     * Set 时间周期内的统计值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stats 时间周期内的统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStats(UsageStats Stats) {
        this.Stats = Stats;
    }

    /**
     * Get 时间周期内的时序点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Series 时间周期内的时序点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsageSeries getSeries() {
        return this.Series;
    }

    /**
     * Set 时间周期内的时序点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Series 时间周期内的时序点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeries(UsageSeries Series) {
        this.Series = Series;
    }

    public UsageRankItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageRankItem(UsageRankItem source) {
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Stats != null) {
            this.Stats = new UsageStats(source.Stats);
        }
        if (source.Series != null) {
            this.Series = new UsageSeries(source.Series);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Stats.", this.Stats);
        this.setParamObj(map, prefix + "Series.", this.Series);

    }
}

