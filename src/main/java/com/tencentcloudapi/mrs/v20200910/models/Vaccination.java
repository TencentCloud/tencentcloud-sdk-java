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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vaccination extends AbstractModel{

    /**
    * 序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 疫苗名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vaccine")
    @Expose
    private String Vaccine;

    /**
    * 剂次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dose")
    @Expose
    private String Dose;

    /**
    * 接种日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 疫苗批号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LotNumber")
    @Expose
    private String LotNumber;

    /**
    * 生产企业
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 接种单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clinic")
    @Expose
    private String Clinic;

    /**
    * 接种部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * 接种者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
     * Get 序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 疫苗名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vaccine 疫苗名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVaccine() {
        return this.Vaccine;
    }

    /**
     * Set 疫苗名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vaccine 疫苗名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVaccine(String Vaccine) {
        this.Vaccine = Vaccine;
    }

    /**
     * Get 剂次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dose 剂次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDose() {
        return this.Dose;
    }

    /**
     * Set 剂次
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dose 剂次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDose(String Dose) {
        this.Dose = Dose;
    }

    /**
     * Get 接种日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 接种日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 接种日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 接种日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 疫苗批号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LotNumber 疫苗批号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLotNumber() {
        return this.LotNumber;
    }

    /**
     * Set 疫苗批号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LotNumber 疫苗批号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLotNumber(String LotNumber) {
        this.LotNumber = LotNumber;
    }

    /**
     * Get 生产企业
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manufacturer 生产企业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产企业
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manufacturer 生产企业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 接种单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clinic 接种单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClinic() {
        return this.Clinic;
    }

    /**
     * Set 接种单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clinic 接种单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClinic(String Clinic) {
        this.Clinic = Clinic;
    }

    /**
     * Get 接种部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Site 接种部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set 接种部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Site 接种部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get 接种者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Provider 接种者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 接种者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Provider 接种者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    public Vaccination() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vaccination(Vaccination source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Vaccine != null) {
            this.Vaccine = new String(source.Vaccine);
        }
        if (source.Dose != null) {
            this.Dose = new String(source.Dose);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.LotNumber != null) {
            this.LotNumber = new String(source.LotNumber);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.Clinic != null) {
            this.Clinic = new String(source.Clinic);
        }
        if (source.Site != null) {
            this.Site = new String(source.Site);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vaccine", this.Vaccine);
        this.setParamSimple(map, prefix + "Dose", this.Dose);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "LotNumber", this.LotNumber);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "Clinic", this.Clinic);
        this.setParamSimple(map, prefix + "Site", this.Site);
        this.setParamSimple(map, prefix + "Provider", this.Provider);

    }
}

