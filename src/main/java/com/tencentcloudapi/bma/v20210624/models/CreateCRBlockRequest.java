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

public class CreateCRBlockRequest extends AbstractModel{

    /**
    * 已存证的作品ID
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 侵权链接
    */
    @SerializedName("TortUrl")
    @Expose
    private String TortUrl;

    /**
    * 侵权标题
    */
    @SerializedName("TortTitle")
    @Expose
    private String TortTitle;

    /**
    * 侵权平台
    */
    @SerializedName("TortPlat")
    @Expose
    private String TortPlat;

    /**
    * 拦截结果回调地址
    */
    @SerializedName("BlockUrl")
    @Expose
    private String BlockUrl;

    /**
    * x
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * x
    */
    @SerializedName("ValidStartDate")
    @Expose
    private String ValidStartDate;

    /**
    * x
    */
    @SerializedName("ValidEndDate")
    @Expose
    private String ValidEndDate;

    /**
    * xx
    */
    @SerializedName("TortPic")
    @Expose
    private String TortPic;

    /**
    * x
    */
    @SerializedName("CommFileUrl")
    @Expose
    private String CommFileUrl;

    /**
    * x
    */
    @SerializedName("CommValidStartDate")
    @Expose
    private String CommValidStartDate;

    /**
    * x
    */
    @SerializedName("CommValidEndDate")
    @Expose
    private String CommValidEndDate;

    /**
    * x
    */
    @SerializedName("IsProducer")
    @Expose
    private String IsProducer;

    /**
    * x
    */
    @SerializedName("EvidenceFileUrl")
    @Expose
    private String EvidenceFileUrl;

    /**
    * x
    */
    @SerializedName("EvidenceValidStartDate")
    @Expose
    private String EvidenceValidStartDate;

    /**
    * x
    */
    @SerializedName("EvidenceValidEndDate")
    @Expose
    private String EvidenceValidEndDate;

    /**
     * Get 已存证的作品ID 
     * @return WorkId 已存证的作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 已存证的作品ID
     * @param WorkId 已存证的作品ID
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 侵权链接 
     * @return TortUrl 侵权链接
     */
    public String getTortUrl() {
        return this.TortUrl;
    }

    /**
     * Set 侵权链接
     * @param TortUrl 侵权链接
     */
    public void setTortUrl(String TortUrl) {
        this.TortUrl = TortUrl;
    }

    /**
     * Get 侵权标题 
     * @return TortTitle 侵权标题
     */
    public String getTortTitle() {
        return this.TortTitle;
    }

    /**
     * Set 侵权标题
     * @param TortTitle 侵权标题
     */
    public void setTortTitle(String TortTitle) {
        this.TortTitle = TortTitle;
    }

    /**
     * Get 侵权平台 
     * @return TortPlat 侵权平台
     */
    public String getTortPlat() {
        return this.TortPlat;
    }

    /**
     * Set 侵权平台
     * @param TortPlat 侵权平台
     */
    public void setTortPlat(String TortPlat) {
        this.TortPlat = TortPlat;
    }

    /**
     * Get 拦截结果回调地址 
     * @return BlockUrl 拦截结果回调地址
     */
    public String getBlockUrl() {
        return this.BlockUrl;
    }

    /**
     * Set 拦截结果回调地址
     * @param BlockUrl 拦截结果回调地址
     */
    public void setBlockUrl(String BlockUrl) {
        this.BlockUrl = BlockUrl;
    }

    /**
     * Get x 
     * @return FileUrl x
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set x
     * @param FileUrl x
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get x 
     * @return ValidStartDate x
     */
    public String getValidStartDate() {
        return this.ValidStartDate;
    }

    /**
     * Set x
     * @param ValidStartDate x
     */
    public void setValidStartDate(String ValidStartDate) {
        this.ValidStartDate = ValidStartDate;
    }

    /**
     * Get x 
     * @return ValidEndDate x
     */
    public String getValidEndDate() {
        return this.ValidEndDate;
    }

    /**
     * Set x
     * @param ValidEndDate x
     */
    public void setValidEndDate(String ValidEndDate) {
        this.ValidEndDate = ValidEndDate;
    }

    /**
     * Get xx 
     * @return TortPic xx
     */
    public String getTortPic() {
        return this.TortPic;
    }

    /**
     * Set xx
     * @param TortPic xx
     */
    public void setTortPic(String TortPic) {
        this.TortPic = TortPic;
    }

    /**
     * Get x 
     * @return CommFileUrl x
     */
    public String getCommFileUrl() {
        return this.CommFileUrl;
    }

    /**
     * Set x
     * @param CommFileUrl x
     */
    public void setCommFileUrl(String CommFileUrl) {
        this.CommFileUrl = CommFileUrl;
    }

    /**
     * Get x 
     * @return CommValidStartDate x
     */
    public String getCommValidStartDate() {
        return this.CommValidStartDate;
    }

    /**
     * Set x
     * @param CommValidStartDate x
     */
    public void setCommValidStartDate(String CommValidStartDate) {
        this.CommValidStartDate = CommValidStartDate;
    }

    /**
     * Get x 
     * @return CommValidEndDate x
     */
    public String getCommValidEndDate() {
        return this.CommValidEndDate;
    }

    /**
     * Set x
     * @param CommValidEndDate x
     */
    public void setCommValidEndDate(String CommValidEndDate) {
        this.CommValidEndDate = CommValidEndDate;
    }

    /**
     * Get x 
     * @return IsProducer x
     */
    public String getIsProducer() {
        return this.IsProducer;
    }

    /**
     * Set x
     * @param IsProducer x
     */
    public void setIsProducer(String IsProducer) {
        this.IsProducer = IsProducer;
    }

    /**
     * Get x 
     * @return EvidenceFileUrl x
     */
    public String getEvidenceFileUrl() {
        return this.EvidenceFileUrl;
    }

    /**
     * Set x
     * @param EvidenceFileUrl x
     */
    public void setEvidenceFileUrl(String EvidenceFileUrl) {
        this.EvidenceFileUrl = EvidenceFileUrl;
    }

    /**
     * Get x 
     * @return EvidenceValidStartDate x
     */
    public String getEvidenceValidStartDate() {
        return this.EvidenceValidStartDate;
    }

    /**
     * Set x
     * @param EvidenceValidStartDate x
     */
    public void setEvidenceValidStartDate(String EvidenceValidStartDate) {
        this.EvidenceValidStartDate = EvidenceValidStartDate;
    }

    /**
     * Get x 
     * @return EvidenceValidEndDate x
     */
    public String getEvidenceValidEndDate() {
        return this.EvidenceValidEndDate;
    }

    /**
     * Set x
     * @param EvidenceValidEndDate x
     */
    public void setEvidenceValidEndDate(String EvidenceValidEndDate) {
        this.EvidenceValidEndDate = EvidenceValidEndDate;
    }

    public CreateCRBlockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRBlockRequest(CreateCRBlockRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.TortUrl != null) {
            this.TortUrl = new String(source.TortUrl);
        }
        if (source.TortTitle != null) {
            this.TortTitle = new String(source.TortTitle);
        }
        if (source.TortPlat != null) {
            this.TortPlat = new String(source.TortPlat);
        }
        if (source.BlockUrl != null) {
            this.BlockUrl = new String(source.BlockUrl);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.ValidStartDate != null) {
            this.ValidStartDate = new String(source.ValidStartDate);
        }
        if (source.ValidEndDate != null) {
            this.ValidEndDate = new String(source.ValidEndDate);
        }
        if (source.TortPic != null) {
            this.TortPic = new String(source.TortPic);
        }
        if (source.CommFileUrl != null) {
            this.CommFileUrl = new String(source.CommFileUrl);
        }
        if (source.CommValidStartDate != null) {
            this.CommValidStartDate = new String(source.CommValidStartDate);
        }
        if (source.CommValidEndDate != null) {
            this.CommValidEndDate = new String(source.CommValidEndDate);
        }
        if (source.IsProducer != null) {
            this.IsProducer = new String(source.IsProducer);
        }
        if (source.EvidenceFileUrl != null) {
            this.EvidenceFileUrl = new String(source.EvidenceFileUrl);
        }
        if (source.EvidenceValidStartDate != null) {
            this.EvidenceValidStartDate = new String(source.EvidenceValidStartDate);
        }
        if (source.EvidenceValidEndDate != null) {
            this.EvidenceValidEndDate = new String(source.EvidenceValidEndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "TortUrl", this.TortUrl);
        this.setParamSimple(map, prefix + "TortTitle", this.TortTitle);
        this.setParamSimple(map, prefix + "TortPlat", this.TortPlat);
        this.setParamSimple(map, prefix + "BlockUrl", this.BlockUrl);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ValidStartDate", this.ValidStartDate);
        this.setParamSimple(map, prefix + "ValidEndDate", this.ValidEndDate);
        this.setParamSimple(map, prefix + "TortPic", this.TortPic);
        this.setParamSimple(map, prefix + "CommFileUrl", this.CommFileUrl);
        this.setParamSimple(map, prefix + "CommValidStartDate", this.CommValidStartDate);
        this.setParamSimple(map, prefix + "CommValidEndDate", this.CommValidEndDate);
        this.setParamSimple(map, prefix + "IsProducer", this.IsProducer);
        this.setParamSimple(map, prefix + "EvidenceFileUrl", this.EvidenceFileUrl);
        this.setParamSimple(map, prefix + "EvidenceValidStartDate", this.EvidenceValidStartDate);
        this.setParamSimple(map, prefix + "EvidenceValidEndDate", this.EvidenceValidEndDate);

    }
}

