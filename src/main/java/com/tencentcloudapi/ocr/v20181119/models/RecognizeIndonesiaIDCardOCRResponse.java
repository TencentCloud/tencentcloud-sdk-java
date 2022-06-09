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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeIndonesiaIDCardOCRResponse extends AbstractModel{

    /**
    * 证件号码
    */
    @SerializedName("NIK")
    @Expose
    private String NIK;

    /**
    * 姓名
    */
    @SerializedName("Nama")
    @Expose
    private String Nama;

    /**
    * 出生地/出生时间
    */
    @SerializedName("TempatTglLahir")
    @Expose
    private String TempatTglLahir;

    /**
    * 性别
    */
    @SerializedName("JenisKelamin")
    @Expose
    private String JenisKelamin;

    /**
    * 血型
    */
    @SerializedName("GolDarah")
    @Expose
    private String GolDarah;

    /**
    * 地址
    */
    @SerializedName("Alamat")
    @Expose
    private String Alamat;

    /**
    * 街道
    */
    @SerializedName("RTRW")
    @Expose
    private String RTRW;

    /**
    * 村
    */
    @SerializedName("KelDesa")
    @Expose
    private String KelDesa;

    /**
    * 地区
    */
    @SerializedName("Kecamatan")
    @Expose
    private String Kecamatan;

    /**
    * 宗教信仰
    */
    @SerializedName("Agama")
    @Expose
    private String Agama;

    /**
    * 婚姻状况
    */
    @SerializedName("StatusPerkawinan")
    @Expose
    private String StatusPerkawinan;

    /**
    * 职业
    */
    @SerializedName("Perkerjaan")
    @Expose
    private String Perkerjaan;

    /**
    * 国籍
    */
    @SerializedName("KewargaNegaraan")
    @Expose
    private String KewargaNegaraan;

    /**
    * 身份证有效期限
    */
    @SerializedName("BerlakuHingga")
    @Expose
    private String BerlakuHingga;

    /**
    * 发证日期
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * 人像截图
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 证件号码 
     * @return NIK 证件号码
     */
    public String getNIK() {
        return this.NIK;
    }

    /**
     * Set 证件号码
     * @param NIK 证件号码
     */
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * Get 姓名 
     * @return Nama 姓名
     */
    public String getNama() {
        return this.Nama;
    }

    /**
     * Set 姓名
     * @param Nama 姓名
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * Get 出生地/出生时间 
     * @return TempatTglLahir 出生地/出生时间
     */
    public String getTempatTglLahir() {
        return this.TempatTglLahir;
    }

    /**
     * Set 出生地/出生时间
     * @param TempatTglLahir 出生地/出生时间
     */
    public void setTempatTglLahir(String TempatTglLahir) {
        this.TempatTglLahir = TempatTglLahir;
    }

    /**
     * Get 性别 
     * @return JenisKelamin 性别
     */
    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    /**
     * Set 性别
     * @param JenisKelamin 性别
     */
    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    /**
     * Get 血型 
     * @return GolDarah 血型
     */
    public String getGolDarah() {
        return this.GolDarah;
    }

    /**
     * Set 血型
     * @param GolDarah 血型
     */
    public void setGolDarah(String GolDarah) {
        this.GolDarah = GolDarah;
    }

    /**
     * Get 地址 
     * @return Alamat 地址
     */
    public String getAlamat() {
        return this.Alamat;
    }

    /**
     * Set 地址
     * @param Alamat 地址
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * Get 街道 
     * @return RTRW 街道
     */
    public String getRTRW() {
        return this.RTRW;
    }

    /**
     * Set 街道
     * @param RTRW 街道
     */
    public void setRTRW(String RTRW) {
        this.RTRW = RTRW;
    }

    /**
     * Get 村 
     * @return KelDesa 村
     */
    public String getKelDesa() {
        return this.KelDesa;
    }

    /**
     * Set 村
     * @param KelDesa 村
     */
    public void setKelDesa(String KelDesa) {
        this.KelDesa = KelDesa;
    }

    /**
     * Get 地区 
     * @return Kecamatan 地区
     */
    public String getKecamatan() {
        return this.Kecamatan;
    }

    /**
     * Set 地区
     * @param Kecamatan 地区
     */
    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    /**
     * Get 宗教信仰 
     * @return Agama 宗教信仰
     */
    public String getAgama() {
        return this.Agama;
    }

    /**
     * Set 宗教信仰
     * @param Agama 宗教信仰
     */
    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    /**
     * Get 婚姻状况 
     * @return StatusPerkawinan 婚姻状况
     */
    public String getStatusPerkawinan() {
        return this.StatusPerkawinan;
    }

    /**
     * Set 婚姻状况
     * @param StatusPerkawinan 婚姻状况
     */
    public void setStatusPerkawinan(String StatusPerkawinan) {
        this.StatusPerkawinan = StatusPerkawinan;
    }

    /**
     * Get 职业 
     * @return Perkerjaan 职业
     */
    public String getPerkerjaan() {
        return this.Perkerjaan;
    }

    /**
     * Set 职业
     * @param Perkerjaan 职业
     */
    public void setPerkerjaan(String Perkerjaan) {
        this.Perkerjaan = Perkerjaan;
    }

    /**
     * Get 国籍 
     * @return KewargaNegaraan 国籍
     */
    public String getKewargaNegaraan() {
        return this.KewargaNegaraan;
    }

    /**
     * Set 国籍
     * @param KewargaNegaraan 国籍
     */
    public void setKewargaNegaraan(String KewargaNegaraan) {
        this.KewargaNegaraan = KewargaNegaraan;
    }

    /**
     * Get 身份证有效期限 
     * @return BerlakuHingga 身份证有效期限
     */
    public String getBerlakuHingga() {
        return this.BerlakuHingga;
    }

    /**
     * Set 身份证有效期限
     * @param BerlakuHingga 身份证有效期限
     */
    public void setBerlakuHingga(String BerlakuHingga) {
        this.BerlakuHingga = BerlakuHingga;
    }

    /**
     * Get 发证日期 
     * @return IssuedDate 发证日期
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set 发证日期
     * @param IssuedDate 发证日期
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get 人像截图 
     * @return Photo 人像截图
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set 人像截图
     * @param Photo 人像截图
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeIndonesiaIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeIndonesiaIDCardOCRResponse(RecognizeIndonesiaIDCardOCRResponse source) {
        if (source.NIK != null) {
            this.NIK = new String(source.NIK);
        }
        if (source.Nama != null) {
            this.Nama = new String(source.Nama);
        }
        if (source.TempatTglLahir != null) {
            this.TempatTglLahir = new String(source.TempatTglLahir);
        }
        if (source.JenisKelamin != null) {
            this.JenisKelamin = new String(source.JenisKelamin);
        }
        if (source.GolDarah != null) {
            this.GolDarah = new String(source.GolDarah);
        }
        if (source.Alamat != null) {
            this.Alamat = new String(source.Alamat);
        }
        if (source.RTRW != null) {
            this.RTRW = new String(source.RTRW);
        }
        if (source.KelDesa != null) {
            this.KelDesa = new String(source.KelDesa);
        }
        if (source.Kecamatan != null) {
            this.Kecamatan = new String(source.Kecamatan);
        }
        if (source.Agama != null) {
            this.Agama = new String(source.Agama);
        }
        if (source.StatusPerkawinan != null) {
            this.StatusPerkawinan = new String(source.StatusPerkawinan);
        }
        if (source.Perkerjaan != null) {
            this.Perkerjaan = new String(source.Perkerjaan);
        }
        if (source.KewargaNegaraan != null) {
            this.KewargaNegaraan = new String(source.KewargaNegaraan);
        }
        if (source.BerlakuHingga != null) {
            this.BerlakuHingga = new String(source.BerlakuHingga);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NIK", this.NIK);
        this.setParamSimple(map, prefix + "Nama", this.Nama);
        this.setParamSimple(map, prefix + "TempatTglLahir", this.TempatTglLahir);
        this.setParamSimple(map, prefix + "JenisKelamin", this.JenisKelamin);
        this.setParamSimple(map, prefix + "GolDarah", this.GolDarah);
        this.setParamSimple(map, prefix + "Alamat", this.Alamat);
        this.setParamSimple(map, prefix + "RTRW", this.RTRW);
        this.setParamSimple(map, prefix + "KelDesa", this.KelDesa);
        this.setParamSimple(map, prefix + "Kecamatan", this.Kecamatan);
        this.setParamSimple(map, prefix + "Agama", this.Agama);
        this.setParamSimple(map, prefix + "StatusPerkawinan", this.StatusPerkawinan);
        this.setParamSimple(map, prefix + "Perkerjaan", this.Perkerjaan);
        this.setParamSimple(map, prefix + "KewargaNegaraan", this.KewargaNegaraan);
        this.setParamSimple(map, prefix + "BerlakuHingga", this.BerlakuHingga);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

