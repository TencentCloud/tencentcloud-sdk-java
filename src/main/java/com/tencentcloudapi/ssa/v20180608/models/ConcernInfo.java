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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcernInfo extends AbstractModel{

    /**
    * 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcernType")
    @Expose
    private Long ConcernType;

    /**
    * 实体类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntityType")
    @Expose
    private Long EntityType;

    /**
    * 关注点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Concern")
    @Expose
    private String Concern;

    /**
    * 最近数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticsCount")
    @Expose
    private Long StatisticsCount;

    /**
     * Get 关注点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcernType 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcernType() {
        return this.ConcernType;
    }

    /**
     * Set 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcernType 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcernType(Long ConcernType) {
        this.ConcernType = ConcernType;
    }

    /**
     * Get 实体类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntityType 实体类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 实体类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntityType 实体类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntityType(Long EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 关注点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Concern 关注点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConcern() {
        return this.Concern;
    }

    /**
     * Set 关注点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Concern 关注点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcern(String Concern) {
        this.Concern = Concern;
    }

    /**
     * Get 最近数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticsCount 最近数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatisticsCount() {
        return this.StatisticsCount;
    }

    /**
     * Set 最近数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticsCount 最近数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticsCount(Long StatisticsCount) {
        this.StatisticsCount = StatisticsCount;
    }

    public ConcernInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcernInfo(ConcernInfo source) {
        if (source.ConcernType != null) {
            this.ConcernType = new Long(source.ConcernType);
        }
        if (source.EntityType != null) {
            this.EntityType = new Long(source.EntityType);
        }
        if (source.Concern != null) {
            this.Concern = new String(source.Concern);
        }
        if (source.StatisticsCount != null) {
            this.StatisticsCount = new Long(source.StatisticsCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConcernType", this.ConcernType);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "Concern", this.Concern);
        this.setParamSimple(map, prefix + "StatisticsCount", this.StatisticsCount);

    }
}

