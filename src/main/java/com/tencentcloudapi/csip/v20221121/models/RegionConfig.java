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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionConfig extends AbstractModel {

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 是否国外
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Foreign")
    @Expose
    private Long Foreign;

    /**
    * 地域码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 是否自驾云
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAutoDriveCloud")
    @Expose
    private Long IsAutoDriveCloud;

    /**
    * 是否支持nat
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportNat")
    @Expose
    private Long IsSupportNat;

    /**
    * 地区信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * 地域英文
    */
    @SerializedName("RegionNameEN")
    @Expose
    private String RegionNameEN;

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 地域中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 地域中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 是否国外
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Foreign 是否国外
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getForeign() {
        return this.Foreign;
    }

    /**
     * Set 是否国外
注意：此字段可能返回 null，表示取不到有效值。
     * @param Foreign 是否国外
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForeign(Long Foreign) {
        this.Foreign = Foreign;
    }

    /**
     * Get 地域码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 地域码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 地域码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 地域码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 是否自驾云
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAutoDriveCloud 是否自驾云
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAutoDriveCloud() {
        return this.IsAutoDriveCloud;
    }

    /**
     * Set 是否自驾云
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAutoDriveCloud 是否自驾云
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAutoDriveCloud(Long IsAutoDriveCloud) {
        this.IsAutoDriveCloud = IsAutoDriveCloud;
    }

    /**
     * Get 是否支持nat
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportNat 是否支持nat
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSupportNat() {
        return this.IsSupportNat;
    }

    /**
     * Set 是否支持nat
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportNat 是否支持nat
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportNat(Long IsSupportNat) {
        this.IsSupportNat = IsSupportNat;
    }

    /**
     * Get 地区信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionArea 地区信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set 地区信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionArea 地区信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get 地域英文 
     * @return RegionNameEN 地域英文
     */
    public String getRegionNameEN() {
        return this.RegionNameEN;
    }

    /**
     * Set 地域英文
     * @param RegionNameEN 地域英文
     */
    public void setRegionNameEN(String RegionNameEN) {
        this.RegionNameEN = RegionNameEN;
    }

    public RegionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionConfig(RegionConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Foreign != null) {
            this.Foreign = new Long(source.Foreign);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.IsAutoDriveCloud != null) {
            this.IsAutoDriveCloud = new Long(source.IsAutoDriveCloud);
        }
        if (source.IsSupportNat != null) {
            this.IsSupportNat = new Long(source.IsSupportNat);
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.RegionNameEN != null) {
            this.RegionNameEN = new String(source.RegionNameEN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Foreign", this.Foreign);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "IsAutoDriveCloud", this.IsAutoDriveCloud);
        this.setParamSimple(map, prefix + "IsSupportNat", this.IsSupportNat);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "RegionNameEN", this.RegionNameEN);

    }
}

