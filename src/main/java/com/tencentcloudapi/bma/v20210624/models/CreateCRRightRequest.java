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

public class CreateCRRightRequest extends AbstractModel{

    /**
    * 作品ID
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
    * 发函结果回调地址
    */
    @SerializedName("RightUrl")
    @Expose
    private String RightUrl;

    /**
    * 授权书下载地址
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 授权书生效日期
    */
    @SerializedName("ValidStartDate")
    @Expose
    private String ValidStartDate;

    /**
    * 授权书截止日期
    */
    @SerializedName("ValidEndDate")
    @Expose
    private String ValidEndDate;

    /**
    * 委托书下载地址
    */
    @SerializedName("CommFileUrl")
    @Expose
    private String CommFileUrl;

    /**
    * 委托书生效日期
    */
    @SerializedName("CommValidStartDate")
    @Expose
    private String CommValidStartDate;

    /**
    * 委托书截止日期
    */
    @SerializedName("CommValidEndDate")
    @Expose
    private String CommValidEndDate;

    /**
    * 主页下载地址
    */
    @SerializedName("HomeFileUrl")
    @Expose
    private String HomeFileUrl;

    /**
    * 主页生效日期
    */
    @SerializedName("HomeValidStartDate")
    @Expose
    private String HomeValidStartDate;

    /**
    * 主页截止日期
    */
    @SerializedName("HomeValidEndDate")
    @Expose
    private String HomeValidEndDate;

    /**
    * 是否著作权人：0-否 1-是
    */
    @SerializedName("IsProducer")
    @Expose
    private String IsProducer;

    /**
    * 存证证书下载地址
    */
    @SerializedName("EvidenceFileUrl")
    @Expose
    private String EvidenceFileUrl;

    /**
    * 存证证书生效日期
    */
    @SerializedName("EvidenceValidStartDate")
    @Expose
    private String EvidenceValidStartDate;

    /**
    * 存证证书截止日期
    */
    @SerializedName("EvidenceValidEndDate")
    @Expose
    private String EvidenceValidEndDate;

    /**
     * Get 作品ID 
     * @return WorkId 作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 作品ID
     * @param WorkId 作品ID
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
     * Get 发函结果回调地址 
     * @return RightUrl 发函结果回调地址
     */
    public String getRightUrl() {
        return this.RightUrl;
    }

    /**
     * Set 发函结果回调地址
     * @param RightUrl 发函结果回调地址
     */
    public void setRightUrl(String RightUrl) {
        this.RightUrl = RightUrl;
    }

    /**
     * Get 授权书下载地址 
     * @return FileUrl 授权书下载地址
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 授权书下载地址
     * @param FileUrl 授权书下载地址
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 授权书生效日期 
     * @return ValidStartDate 授权书生效日期
     */
    public String getValidStartDate() {
        return this.ValidStartDate;
    }

    /**
     * Set 授权书生效日期
     * @param ValidStartDate 授权书生效日期
     */
    public void setValidStartDate(String ValidStartDate) {
        this.ValidStartDate = ValidStartDate;
    }

    /**
     * Get 授权书截止日期 
     * @return ValidEndDate 授权书截止日期
     */
    public String getValidEndDate() {
        return this.ValidEndDate;
    }

    /**
     * Set 授权书截止日期
     * @param ValidEndDate 授权书截止日期
     */
    public void setValidEndDate(String ValidEndDate) {
        this.ValidEndDate = ValidEndDate;
    }

    /**
     * Get 委托书下载地址 
     * @return CommFileUrl 委托书下载地址
     */
    public String getCommFileUrl() {
        return this.CommFileUrl;
    }

    /**
     * Set 委托书下载地址
     * @param CommFileUrl 委托书下载地址
     */
    public void setCommFileUrl(String CommFileUrl) {
        this.CommFileUrl = CommFileUrl;
    }

    /**
     * Get 委托书生效日期 
     * @return CommValidStartDate 委托书生效日期
     */
    public String getCommValidStartDate() {
        return this.CommValidStartDate;
    }

    /**
     * Set 委托书生效日期
     * @param CommValidStartDate 委托书生效日期
     */
    public void setCommValidStartDate(String CommValidStartDate) {
        this.CommValidStartDate = CommValidStartDate;
    }

    /**
     * Get 委托书截止日期 
     * @return CommValidEndDate 委托书截止日期
     */
    public String getCommValidEndDate() {
        return this.CommValidEndDate;
    }

    /**
     * Set 委托书截止日期
     * @param CommValidEndDate 委托书截止日期
     */
    public void setCommValidEndDate(String CommValidEndDate) {
        this.CommValidEndDate = CommValidEndDate;
    }

    /**
     * Get 主页下载地址 
     * @return HomeFileUrl 主页下载地址
     */
    public String getHomeFileUrl() {
        return this.HomeFileUrl;
    }

    /**
     * Set 主页下载地址
     * @param HomeFileUrl 主页下载地址
     */
    public void setHomeFileUrl(String HomeFileUrl) {
        this.HomeFileUrl = HomeFileUrl;
    }

    /**
     * Get 主页生效日期 
     * @return HomeValidStartDate 主页生效日期
     */
    public String getHomeValidStartDate() {
        return this.HomeValidStartDate;
    }

    /**
     * Set 主页生效日期
     * @param HomeValidStartDate 主页生效日期
     */
    public void setHomeValidStartDate(String HomeValidStartDate) {
        this.HomeValidStartDate = HomeValidStartDate;
    }

    /**
     * Get 主页截止日期 
     * @return HomeValidEndDate 主页截止日期
     */
    public String getHomeValidEndDate() {
        return this.HomeValidEndDate;
    }

    /**
     * Set 主页截止日期
     * @param HomeValidEndDate 主页截止日期
     */
    public void setHomeValidEndDate(String HomeValidEndDate) {
        this.HomeValidEndDate = HomeValidEndDate;
    }

    /**
     * Get 是否著作权人：0-否 1-是 
     * @return IsProducer 是否著作权人：0-否 1-是
     */
    public String getIsProducer() {
        return this.IsProducer;
    }

    /**
     * Set 是否著作权人：0-否 1-是
     * @param IsProducer 是否著作权人：0-否 1-是
     */
    public void setIsProducer(String IsProducer) {
        this.IsProducer = IsProducer;
    }

    /**
     * Get 存证证书下载地址 
     * @return EvidenceFileUrl 存证证书下载地址
     */
    public String getEvidenceFileUrl() {
        return this.EvidenceFileUrl;
    }

    /**
     * Set 存证证书下载地址
     * @param EvidenceFileUrl 存证证书下载地址
     */
    public void setEvidenceFileUrl(String EvidenceFileUrl) {
        this.EvidenceFileUrl = EvidenceFileUrl;
    }

    /**
     * Get 存证证书生效日期 
     * @return EvidenceValidStartDate 存证证书生效日期
     */
    public String getEvidenceValidStartDate() {
        return this.EvidenceValidStartDate;
    }

    /**
     * Set 存证证书生效日期
     * @param EvidenceValidStartDate 存证证书生效日期
     */
    public void setEvidenceValidStartDate(String EvidenceValidStartDate) {
        this.EvidenceValidStartDate = EvidenceValidStartDate;
    }

    /**
     * Get 存证证书截止日期 
     * @return EvidenceValidEndDate 存证证书截止日期
     */
    public String getEvidenceValidEndDate() {
        return this.EvidenceValidEndDate;
    }

    /**
     * Set 存证证书截止日期
     * @param EvidenceValidEndDate 存证证书截止日期
     */
    public void setEvidenceValidEndDate(String EvidenceValidEndDate) {
        this.EvidenceValidEndDate = EvidenceValidEndDate;
    }

    public CreateCRRightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRRightRequest(CreateCRRightRequest source) {
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
        if (source.RightUrl != null) {
            this.RightUrl = new String(source.RightUrl);
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
        if (source.CommFileUrl != null) {
            this.CommFileUrl = new String(source.CommFileUrl);
        }
        if (source.CommValidStartDate != null) {
            this.CommValidStartDate = new String(source.CommValidStartDate);
        }
        if (source.CommValidEndDate != null) {
            this.CommValidEndDate = new String(source.CommValidEndDate);
        }
        if (source.HomeFileUrl != null) {
            this.HomeFileUrl = new String(source.HomeFileUrl);
        }
        if (source.HomeValidStartDate != null) {
            this.HomeValidStartDate = new String(source.HomeValidStartDate);
        }
        if (source.HomeValidEndDate != null) {
            this.HomeValidEndDate = new String(source.HomeValidEndDate);
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
        this.setParamSimple(map, prefix + "RightUrl", this.RightUrl);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ValidStartDate", this.ValidStartDate);
        this.setParamSimple(map, prefix + "ValidEndDate", this.ValidEndDate);
        this.setParamSimple(map, prefix + "CommFileUrl", this.CommFileUrl);
        this.setParamSimple(map, prefix + "CommValidStartDate", this.CommValidStartDate);
        this.setParamSimple(map, prefix + "CommValidEndDate", this.CommValidEndDate);
        this.setParamSimple(map, prefix + "HomeFileUrl", this.HomeFileUrl);
        this.setParamSimple(map, prefix + "HomeValidStartDate", this.HomeValidStartDate);
        this.setParamSimple(map, prefix + "HomeValidEndDate", this.HomeValidEndDate);
        this.setParamSimple(map, prefix + "IsProducer", this.IsProducer);
        this.setParamSimple(map, prefix + "EvidenceFileUrl", this.EvidenceFileUrl);
        this.setParamSimple(map, prefix + "EvidenceValidStartDate", this.EvidenceValidStartDate);
        this.setParamSimple(map, prefix + "EvidenceValidEndDate", this.EvidenceValidEndDate);

    }
}

