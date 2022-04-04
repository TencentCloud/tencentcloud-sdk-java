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
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchData")
    @Expose
    private String SearchData;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpCountryIso")
    @Expose
    private String IpCountryIso;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpProvinceIso")
    @Expose
    private String IpProvinceIso;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpCity")
    @Expose
    private String IpCity;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

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

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchData 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSearchData() {
        return this.SearchData;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchData 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchData(String SearchData) {
        this.SearchData = SearchData;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpCountryIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpCountryIso() {
        return this.IpCountryIso;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpCountryIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpCountryIso(String IpCountryIso) {
        this.IpCountryIso = IpCountryIso;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpProvinceIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpProvinceIso() {
        return this.IpProvinceIso;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpProvinceIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpProvinceIso(String IpProvinceIso) {
        this.IpProvinceIso = IpProvinceIso;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpCity 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpCity() {
        return this.IpCity;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpCity 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpCity(String IpCity) {
        this.IpCity = IpCity;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSubType 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSubType 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
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
        if (source.SearchData != null) {
            this.SearchData = new String(source.SearchData);
        }
        if (source.IpCountryIso != null) {
            this.IpCountryIso = new String(source.IpCountryIso);
        }
        if (source.IpProvinceIso != null) {
            this.IpProvinceIso = new String(source.IpProvinceIso);
        }
        if (source.IpCity != null) {
            this.IpCity = new String(source.IpCity);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
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
        this.setParamSimple(map, prefix + "SearchData", this.SearchData);
        this.setParamSimple(map, prefix + "IpCountryIso", this.IpCountryIso);
        this.setParamSimple(map, prefix + "IpProvinceIso", this.IpProvinceIso);
        this.setParamSimple(map, prefix + "IpCity", this.IpCity);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);

    }
}

