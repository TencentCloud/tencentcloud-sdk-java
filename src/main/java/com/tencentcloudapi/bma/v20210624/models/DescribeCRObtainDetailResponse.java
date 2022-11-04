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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCRObtainDetailResponse extends AbstractModel{

    /**
    * 作品名称
    */
    @SerializedName("WorkName")
    @Expose
    private String WorkName;

    /**
    * 侵权链接
    */
    @SerializedName("TortURL")
    @Expose
    private String TortURL;

    /**
    * 取证时间
    */
    @SerializedName("ObtainTime")
    @Expose
    private String ObtainTime;

    /**
    * 取证类型
    */
    @SerializedName("ObtainType")
    @Expose
    private String ObtainType;

    /**
    * 取证号
    */
    @SerializedName("ObtainNum")
    @Expose
    private String ObtainNum;

    /**
    * 证据地址
    */
    @SerializedName("DepositFile")
    @Expose
    private String DepositFile;

    /**
    * 公证信息地址
    */
    @SerializedName("DepositCert")
    @Expose
    private String DepositCert;

    /**
    * 内容类型
    */
    @SerializedName("WorkType")
    @Expose
    private String WorkType;

    /**
    * 作品类型
    */
    @SerializedName("WorkCategory")
    @Expose
    private String WorkCategory;

    /**
    * 侵权ID
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * 侵权编号
    */
    @SerializedName("TortNum")
    @Expose
    private String TortNum;

    /**
    * 取证状态
    */
    @SerializedName("ObtainStatus")
    @Expose
    private Long ObtainStatus;

    /**
    * 取证状态说明
    */
    @SerializedName("ObtainNote")
    @Expose
    private String ObtainNote;

    /**
    * 取证时长
    */
    @SerializedName("ObtainDuration")
    @Expose
    private String ObtainDuration;

    /**
    * 取证名称
    */
    @SerializedName("ObtainName")
    @Expose
    private String ObtainName;

    /**
    * 取证公证信息
    */
    @SerializedName("DepositPdfCert")
    @Expose
    private String DepositPdfCert;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 作品名称 
     * @return WorkName 作品名称
     */
    public String getWorkName() {
        return this.WorkName;
    }

    /**
     * Set 作品名称
     * @param WorkName 作品名称
     */
    public void setWorkName(String WorkName) {
        this.WorkName = WorkName;
    }

    /**
     * Get 侵权链接 
     * @return TortURL 侵权链接
     */
    public String getTortURL() {
        return this.TortURL;
    }

    /**
     * Set 侵权链接
     * @param TortURL 侵权链接
     */
    public void setTortURL(String TortURL) {
        this.TortURL = TortURL;
    }

    /**
     * Get 取证时间 
     * @return ObtainTime 取证时间
     */
    public String getObtainTime() {
        return this.ObtainTime;
    }

    /**
     * Set 取证时间
     * @param ObtainTime 取证时间
     */
    public void setObtainTime(String ObtainTime) {
        this.ObtainTime = ObtainTime;
    }

    /**
     * Get 取证类型 
     * @return ObtainType 取证类型
     */
    public String getObtainType() {
        return this.ObtainType;
    }

    /**
     * Set 取证类型
     * @param ObtainType 取证类型
     */
    public void setObtainType(String ObtainType) {
        this.ObtainType = ObtainType;
    }

    /**
     * Get 取证号 
     * @return ObtainNum 取证号
     */
    public String getObtainNum() {
        return this.ObtainNum;
    }

    /**
     * Set 取证号
     * @param ObtainNum 取证号
     */
    public void setObtainNum(String ObtainNum) {
        this.ObtainNum = ObtainNum;
    }

    /**
     * Get 证据地址 
     * @return DepositFile 证据地址
     */
    public String getDepositFile() {
        return this.DepositFile;
    }

    /**
     * Set 证据地址
     * @param DepositFile 证据地址
     */
    public void setDepositFile(String DepositFile) {
        this.DepositFile = DepositFile;
    }

    /**
     * Get 公证信息地址 
     * @return DepositCert 公证信息地址
     */
    public String getDepositCert() {
        return this.DepositCert;
    }

    /**
     * Set 公证信息地址
     * @param DepositCert 公证信息地址
     */
    public void setDepositCert(String DepositCert) {
        this.DepositCert = DepositCert;
    }

    /**
     * Get 内容类型 
     * @return WorkType 内容类型
     */
    public String getWorkType() {
        return this.WorkType;
    }

    /**
     * Set 内容类型
     * @param WorkType 内容类型
     */
    public void setWorkType(String WorkType) {
        this.WorkType = WorkType;
    }

    /**
     * Get 作品类型 
     * @return WorkCategory 作品类型
     */
    public String getWorkCategory() {
        return this.WorkCategory;
    }

    /**
     * Set 作品类型
     * @param WorkCategory 作品类型
     */
    public void setWorkCategory(String WorkCategory) {
        this.WorkCategory = WorkCategory;
    }

    /**
     * Get 侵权ID 
     * @return TortId 侵权ID
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set 侵权ID
     * @param TortId 侵权ID
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get 侵权编号 
     * @return TortNum 侵权编号
     */
    public String getTortNum() {
        return this.TortNum;
    }

    /**
     * Set 侵权编号
     * @param TortNum 侵权编号
     */
    public void setTortNum(String TortNum) {
        this.TortNum = TortNum;
    }

    /**
     * Get 取证状态 
     * @return ObtainStatus 取证状态
     */
    public Long getObtainStatus() {
        return this.ObtainStatus;
    }

    /**
     * Set 取证状态
     * @param ObtainStatus 取证状态
     */
    public void setObtainStatus(Long ObtainStatus) {
        this.ObtainStatus = ObtainStatus;
    }

    /**
     * Get 取证状态说明 
     * @return ObtainNote 取证状态说明
     */
    public String getObtainNote() {
        return this.ObtainNote;
    }

    /**
     * Set 取证状态说明
     * @param ObtainNote 取证状态说明
     */
    public void setObtainNote(String ObtainNote) {
        this.ObtainNote = ObtainNote;
    }

    /**
     * Get 取证时长 
     * @return ObtainDuration 取证时长
     */
    public String getObtainDuration() {
        return this.ObtainDuration;
    }

    /**
     * Set 取证时长
     * @param ObtainDuration 取证时长
     */
    public void setObtainDuration(String ObtainDuration) {
        this.ObtainDuration = ObtainDuration;
    }

    /**
     * Get 取证名称 
     * @return ObtainName 取证名称
     */
    public String getObtainName() {
        return this.ObtainName;
    }

    /**
     * Set 取证名称
     * @param ObtainName 取证名称
     */
    public void setObtainName(String ObtainName) {
        this.ObtainName = ObtainName;
    }

    /**
     * Get 取证公证信息 
     * @return DepositPdfCert 取证公证信息
     */
    public String getDepositPdfCert() {
        return this.DepositPdfCert;
    }

    /**
     * Set 取证公证信息
     * @param DepositPdfCert 取证公证信息
     */
    public void setDepositPdfCert(String DepositPdfCert) {
        this.DepositPdfCert = DepositPdfCert;
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

    public DescribeCRObtainDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCRObtainDetailResponse(DescribeCRObtainDetailResponse source) {
        if (source.WorkName != null) {
            this.WorkName = new String(source.WorkName);
        }
        if (source.TortURL != null) {
            this.TortURL = new String(source.TortURL);
        }
        if (source.ObtainTime != null) {
            this.ObtainTime = new String(source.ObtainTime);
        }
        if (source.ObtainType != null) {
            this.ObtainType = new String(source.ObtainType);
        }
        if (source.ObtainNum != null) {
            this.ObtainNum = new String(source.ObtainNum);
        }
        if (source.DepositFile != null) {
            this.DepositFile = new String(source.DepositFile);
        }
        if (source.DepositCert != null) {
            this.DepositCert = new String(source.DepositCert);
        }
        if (source.WorkType != null) {
            this.WorkType = new String(source.WorkType);
        }
        if (source.WorkCategory != null) {
            this.WorkCategory = new String(source.WorkCategory);
        }
        if (source.TortId != null) {
            this.TortId = new Long(source.TortId);
        }
        if (source.TortNum != null) {
            this.TortNum = new String(source.TortNum);
        }
        if (source.ObtainStatus != null) {
            this.ObtainStatus = new Long(source.ObtainStatus);
        }
        if (source.ObtainNote != null) {
            this.ObtainNote = new String(source.ObtainNote);
        }
        if (source.ObtainDuration != null) {
            this.ObtainDuration = new String(source.ObtainDuration);
        }
        if (source.ObtainName != null) {
            this.ObtainName = new String(source.ObtainName);
        }
        if (source.DepositPdfCert != null) {
            this.DepositPdfCert = new String(source.DepositPdfCert);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkName", this.WorkName);
        this.setParamSimple(map, prefix + "TortURL", this.TortURL);
        this.setParamSimple(map, prefix + "ObtainTime", this.ObtainTime);
        this.setParamSimple(map, prefix + "ObtainType", this.ObtainType);
        this.setParamSimple(map, prefix + "ObtainNum", this.ObtainNum);
        this.setParamSimple(map, prefix + "DepositFile", this.DepositFile);
        this.setParamSimple(map, prefix + "DepositCert", this.DepositCert);
        this.setParamSimple(map, prefix + "WorkType", this.WorkType);
        this.setParamSimple(map, prefix + "WorkCategory", this.WorkCategory);
        this.setParamSimple(map, prefix + "TortId", this.TortId);
        this.setParamSimple(map, prefix + "TortNum", this.TortNum);
        this.setParamSimple(map, prefix + "ObtainStatus", this.ObtainStatus);
        this.setParamSimple(map, prefix + "ObtainNote", this.ObtainNote);
        this.setParamSimple(map, prefix + "ObtainDuration", this.ObtainDuration);
        this.setParamSimple(map, prefix + "ObtainName", this.ObtainName);
        this.setParamSimple(map, prefix + "DepositPdfCert", this.DepositPdfCert);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

