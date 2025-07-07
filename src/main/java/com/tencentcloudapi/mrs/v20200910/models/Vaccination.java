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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vaccination extends AbstractModel {

    /**
    * 序号
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 疫苗名称
    */
    @SerializedName("Vaccine")
    @Expose
    private String Vaccine;

    /**
    * 剂次
    */
    @SerializedName("Dose")
    @Expose
    private String Dose;

    /**
    * 接种日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 疫苗批号
    */
    @SerializedName("LotNumber")
    @Expose
    private String LotNumber;

    /**
    * 生产企业
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 接种单位
    */
    @SerializedName("Clinic")
    @Expose
    private String Clinic;

    /**
    * 接种部位
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * 接种者
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 疫苗批号
    */
    @SerializedName("Lot")
    @Expose
    private String Lot;

    /**
     * Get 序号 
     * @return Id 序号
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 序号
     * @param Id 序号
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 疫苗名称 
     * @return Vaccine 疫苗名称
     */
    public String getVaccine() {
        return this.Vaccine;
    }

    /**
     * Set 疫苗名称
     * @param Vaccine 疫苗名称
     */
    public void setVaccine(String Vaccine) {
        this.Vaccine = Vaccine;
    }

    /**
     * Get 剂次 
     * @return Dose 剂次
     */
    public String getDose() {
        return this.Dose;
    }

    /**
     * Set 剂次
     * @param Dose 剂次
     */
    public void setDose(String Dose) {
        this.Dose = Dose;
    }

    /**
     * Get 接种日期 
     * @return Date 接种日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 接种日期
     * @param Date 接种日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 疫苗批号 
     * @return LotNumber 疫苗批号
     */
    public String getLotNumber() {
        return this.LotNumber;
    }

    /**
     * Set 疫苗批号
     * @param LotNumber 疫苗批号
     */
    public void setLotNumber(String LotNumber) {
        this.LotNumber = LotNumber;
    }

    /**
     * Get 生产企业 
     * @return Manufacturer 生产企业
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产企业
     * @param Manufacturer 生产企业
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 接种单位 
     * @return Clinic 接种单位
     */
    public String getClinic() {
        return this.Clinic;
    }

    /**
     * Set 接种单位
     * @param Clinic 接种单位
     */
    public void setClinic(String Clinic) {
        this.Clinic = Clinic;
    }

    /**
     * Get 接种部位 
     * @return Site 接种部位
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set 接种部位
     * @param Site 接种部位
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get 接种者 
     * @return Provider 接种者
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 接种者
     * @param Provider 接种者
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 疫苗批号 
     * @return Lot 疫苗批号
     */
    public String getLot() {
        return this.Lot;
    }

    /**
     * Set 疫苗批号
     * @param Lot 疫苗批号
     */
    public void setLot(String Lot) {
        this.Lot = Lot;
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
        if (source.Lot != null) {
            this.Lot = new String(source.Lot);
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
        this.setParamSimple(map, prefix + "Lot", this.Lot);

    }
}

