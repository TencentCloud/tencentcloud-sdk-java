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

public class CreateCRWorkRequest extends AbstractModel{

    /**
    * 作品名称
    */
    @SerializedName("WorkName")
    @Expose
    private String WorkName;

    /**
    * 作品分类
    */
    @SerializedName("WorkCategory")
    @Expose
    private String WorkCategory;

    /**
    * 作品内容类型
    */
    @SerializedName("WorkType")
    @Expose
    private String WorkType;

    /**
    * 作品标签
    */
    @SerializedName("WorkSign")
    @Expose
    private String WorkSign;

    /**
    * 作品图片
    */
    @SerializedName("WorkPic")
    @Expose
    private String WorkPic;

    /**
    * 创作描述
    */
    @SerializedName("WorkDesc")
    @Expose
    private String WorkDesc;

    /**
    * 是否原创 0:否 1:是
    */
    @SerializedName("IsOriginal")
    @Expose
    private String IsOriginal;

    /**
    * 是否发布 0：未发布 1：已发布
    */
    @SerializedName("IsRelease")
    @Expose
    private String IsRelease;

    /**
    * 著作权人ID
    */
    @SerializedName("ProducerID")
    @Expose
    private Long ProducerID;

    /**
    * 创作时间
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 样品文件路径
    */
    @SerializedName("SampleContentURL")
    @Expose
    private String SampleContentURL;

    /**
    * 样本下载Url
    */
    @SerializedName("SampleDownloadURL")
    @Expose
    private String SampleDownloadURL;

    /**
    * 授予类型
    */
    @SerializedName("GrantType")
    @Expose
    private String GrantType;

    /**
    * 作品发布Url
    */
    @SerializedName("SamplePublicURL")
    @Expose
    private String SamplePublicURL;

    /**
    * 是否启用监测 0：不启用 1：启用 默认为0
    */
    @SerializedName("IsMonitor")
    @Expose
    private String IsMonitor;

    /**
    * 是否启用存证0：不启用 1：启用 默认为1
    */
    @SerializedName("IsCert")
    @Expose
    private String IsCert;

    /**
    * 存证回调地址
    */
    @SerializedName("CertUrl")
    @Expose
    private String CertUrl;

    /**
    * 监测回调地址
    */
    @SerializedName("MonitorUrl")
    @Expose
    private String MonitorUrl;

    /**
    * 创作性质（原创,改编,翻译,汇编,注释,整理,其他)
    */
    @SerializedName("ProduceType")
    @Expose
    private String ProduceType;

    /**
    * xxx
    */
    @SerializedName("WhiteLists")
    @Expose
    private String [] WhiteLists;

    /**
    * x
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * xx
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * xx
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * x
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * x
    */
    @SerializedName("AuthorizationStartTime")
    @Expose
    private String AuthorizationStartTime;

    /**
    * x
    */
    @SerializedName("AuthorizationEndTime")
    @Expose
    private String AuthorizationEndTime;

    /**
    * x
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * x
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * x
    */
    @SerializedName("MonitorEndTime")
    @Expose
    private String MonitorEndTime;

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
     * Get 作品分类 
     * @return WorkCategory 作品分类
     */
    public String getWorkCategory() {
        return this.WorkCategory;
    }

    /**
     * Set 作品分类
     * @param WorkCategory 作品分类
     */
    public void setWorkCategory(String WorkCategory) {
        this.WorkCategory = WorkCategory;
    }

    /**
     * Get 作品内容类型 
     * @return WorkType 作品内容类型
     */
    public String getWorkType() {
        return this.WorkType;
    }

    /**
     * Set 作品内容类型
     * @param WorkType 作品内容类型
     */
    public void setWorkType(String WorkType) {
        this.WorkType = WorkType;
    }

    /**
     * Get 作品标签 
     * @return WorkSign 作品标签
     */
    public String getWorkSign() {
        return this.WorkSign;
    }

    /**
     * Set 作品标签
     * @param WorkSign 作品标签
     */
    public void setWorkSign(String WorkSign) {
        this.WorkSign = WorkSign;
    }

    /**
     * Get 作品图片 
     * @return WorkPic 作品图片
     */
    public String getWorkPic() {
        return this.WorkPic;
    }

    /**
     * Set 作品图片
     * @param WorkPic 作品图片
     */
    public void setWorkPic(String WorkPic) {
        this.WorkPic = WorkPic;
    }

    /**
     * Get 创作描述 
     * @return WorkDesc 创作描述
     */
    public String getWorkDesc() {
        return this.WorkDesc;
    }

    /**
     * Set 创作描述
     * @param WorkDesc 创作描述
     */
    public void setWorkDesc(String WorkDesc) {
        this.WorkDesc = WorkDesc;
    }

    /**
     * Get 是否原创 0:否 1:是 
     * @return IsOriginal 是否原创 0:否 1:是
     */
    public String getIsOriginal() {
        return this.IsOriginal;
    }

    /**
     * Set 是否原创 0:否 1:是
     * @param IsOriginal 是否原创 0:否 1:是
     */
    public void setIsOriginal(String IsOriginal) {
        this.IsOriginal = IsOriginal;
    }

    /**
     * Get 是否发布 0：未发布 1：已发布 
     * @return IsRelease 是否发布 0：未发布 1：已发布
     */
    public String getIsRelease() {
        return this.IsRelease;
    }

    /**
     * Set 是否发布 0：未发布 1：已发布
     * @param IsRelease 是否发布 0：未发布 1：已发布
     */
    public void setIsRelease(String IsRelease) {
        this.IsRelease = IsRelease;
    }

    /**
     * Get 著作权人ID 
     * @return ProducerID 著作权人ID
     */
    public Long getProducerID() {
        return this.ProducerID;
    }

    /**
     * Set 著作权人ID
     * @param ProducerID 著作权人ID
     */
    public void setProducerID(Long ProducerID) {
        this.ProducerID = ProducerID;
    }

    /**
     * Get 创作时间 
     * @return ProduceTime 创作时间
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 创作时间
     * @param ProduceTime 创作时间
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 样品文件路径 
     * @return SampleContentURL 样品文件路径
     */
    public String getSampleContentURL() {
        return this.SampleContentURL;
    }

    /**
     * Set 样品文件路径
     * @param SampleContentURL 样品文件路径
     */
    public void setSampleContentURL(String SampleContentURL) {
        this.SampleContentURL = SampleContentURL;
    }

    /**
     * Get 样本下载Url 
     * @return SampleDownloadURL 样本下载Url
     */
    public String getSampleDownloadURL() {
        return this.SampleDownloadURL;
    }

    /**
     * Set 样本下载Url
     * @param SampleDownloadURL 样本下载Url
     */
    public void setSampleDownloadURL(String SampleDownloadURL) {
        this.SampleDownloadURL = SampleDownloadURL;
    }

    /**
     * Get 授予类型 
     * @return GrantType 授予类型
     */
    public String getGrantType() {
        return this.GrantType;
    }

    /**
     * Set 授予类型
     * @param GrantType 授予类型
     */
    public void setGrantType(String GrantType) {
        this.GrantType = GrantType;
    }

    /**
     * Get 作品发布Url 
     * @return SamplePublicURL 作品发布Url
     */
    public String getSamplePublicURL() {
        return this.SamplePublicURL;
    }

    /**
     * Set 作品发布Url
     * @param SamplePublicURL 作品发布Url
     */
    public void setSamplePublicURL(String SamplePublicURL) {
        this.SamplePublicURL = SamplePublicURL;
    }

    /**
     * Get 是否启用监测 0：不启用 1：启用 默认为0 
     * @return IsMonitor 是否启用监测 0：不启用 1：启用 默认为0
     */
    public String getIsMonitor() {
        return this.IsMonitor;
    }

    /**
     * Set 是否启用监测 0：不启用 1：启用 默认为0
     * @param IsMonitor 是否启用监测 0：不启用 1：启用 默认为0
     */
    public void setIsMonitor(String IsMonitor) {
        this.IsMonitor = IsMonitor;
    }

    /**
     * Get 是否启用存证0：不启用 1：启用 默认为1 
     * @return IsCert 是否启用存证0：不启用 1：启用 默认为1
     */
    public String getIsCert() {
        return this.IsCert;
    }

    /**
     * Set 是否启用存证0：不启用 1：启用 默认为1
     * @param IsCert 是否启用存证0：不启用 1：启用 默认为1
     */
    public void setIsCert(String IsCert) {
        this.IsCert = IsCert;
    }

    /**
     * Get 存证回调地址 
     * @return CertUrl 存证回调地址
     */
    public String getCertUrl() {
        return this.CertUrl;
    }

    /**
     * Set 存证回调地址
     * @param CertUrl 存证回调地址
     */
    public void setCertUrl(String CertUrl) {
        this.CertUrl = CertUrl;
    }

    /**
     * Get 监测回调地址 
     * @return MonitorUrl 监测回调地址
     */
    public String getMonitorUrl() {
        return this.MonitorUrl;
    }

    /**
     * Set 监测回调地址
     * @param MonitorUrl 监测回调地址
     */
    public void setMonitorUrl(String MonitorUrl) {
        this.MonitorUrl = MonitorUrl;
    }

    /**
     * Get 创作性质（原创,改编,翻译,汇编,注释,整理,其他) 
     * @return ProduceType 创作性质（原创,改编,翻译,汇编,注释,整理,其他)
     */
    public String getProduceType() {
        return this.ProduceType;
    }

    /**
     * Set 创作性质（原创,改编,翻译,汇编,注释,整理,其他)
     * @param ProduceType 创作性质（原创,改编,翻译,汇编,注释,整理,其他)
     */
    public void setProduceType(String ProduceType) {
        this.ProduceType = ProduceType;
    }

    /**
     * Get xxx 
     * @return WhiteLists xxx
     */
    public String [] getWhiteLists() {
        return this.WhiteLists;
    }

    /**
     * Set xxx
     * @param WhiteLists xxx
     */
    public void setWhiteLists(String [] WhiteLists) {
        this.WhiteLists = WhiteLists;
    }

    /**
     * Get x 
     * @return WorkId x
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set x
     * @param WorkId x
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get xx 
     * @return ProducerName xx
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set xx
     * @param ProducerName xx
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get xx 
     * @return Nickname xx
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set xx
     * @param Nickname xx
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get x 
     * @return Authorization x
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set x
     * @param Authorization x
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get x 
     * @return AuthorizationStartTime x
     */
    public String getAuthorizationStartTime() {
        return this.AuthorizationStartTime;
    }

    /**
     * Set x
     * @param AuthorizationStartTime x
     */
    public void setAuthorizationStartTime(String AuthorizationStartTime) {
        this.AuthorizationStartTime = AuthorizationStartTime;
    }

    /**
     * Get x 
     * @return AuthorizationEndTime x
     */
    public String getAuthorizationEndTime() {
        return this.AuthorizationEndTime;
    }

    /**
     * Set x
     * @param AuthorizationEndTime x
     */
    public void setAuthorizationEndTime(String AuthorizationEndTime) {
        this.AuthorizationEndTime = AuthorizationEndTime;
    }

    /**
     * Get x 
     * @return ContentType x
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set x
     * @param ContentType x
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get x 
     * @return Content x
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set x
     * @param Content x
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get x 
     * @return MonitorEndTime x
     */
    public String getMonitorEndTime() {
        return this.MonitorEndTime;
    }

    /**
     * Set x
     * @param MonitorEndTime x
     */
    public void setMonitorEndTime(String MonitorEndTime) {
        this.MonitorEndTime = MonitorEndTime;
    }

    public CreateCRWorkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRWorkRequest(CreateCRWorkRequest source) {
        if (source.WorkName != null) {
            this.WorkName = new String(source.WorkName);
        }
        if (source.WorkCategory != null) {
            this.WorkCategory = new String(source.WorkCategory);
        }
        if (source.WorkType != null) {
            this.WorkType = new String(source.WorkType);
        }
        if (source.WorkSign != null) {
            this.WorkSign = new String(source.WorkSign);
        }
        if (source.WorkPic != null) {
            this.WorkPic = new String(source.WorkPic);
        }
        if (source.WorkDesc != null) {
            this.WorkDesc = new String(source.WorkDesc);
        }
        if (source.IsOriginal != null) {
            this.IsOriginal = new String(source.IsOriginal);
        }
        if (source.IsRelease != null) {
            this.IsRelease = new String(source.IsRelease);
        }
        if (source.ProducerID != null) {
            this.ProducerID = new Long(source.ProducerID);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.SampleContentURL != null) {
            this.SampleContentURL = new String(source.SampleContentURL);
        }
        if (source.SampleDownloadURL != null) {
            this.SampleDownloadURL = new String(source.SampleDownloadURL);
        }
        if (source.GrantType != null) {
            this.GrantType = new String(source.GrantType);
        }
        if (source.SamplePublicURL != null) {
            this.SamplePublicURL = new String(source.SamplePublicURL);
        }
        if (source.IsMonitor != null) {
            this.IsMonitor = new String(source.IsMonitor);
        }
        if (source.IsCert != null) {
            this.IsCert = new String(source.IsCert);
        }
        if (source.CertUrl != null) {
            this.CertUrl = new String(source.CertUrl);
        }
        if (source.MonitorUrl != null) {
            this.MonitorUrl = new String(source.MonitorUrl);
        }
        if (source.ProduceType != null) {
            this.ProduceType = new String(source.ProduceType);
        }
        if (source.WhiteLists != null) {
            this.WhiteLists = new String[source.WhiteLists.length];
            for (int i = 0; i < source.WhiteLists.length; i++) {
                this.WhiteLists[i] = new String(source.WhiteLists[i]);
            }
        }
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Authorization != null) {
            this.Authorization = new String(source.Authorization);
        }
        if (source.AuthorizationStartTime != null) {
            this.AuthorizationStartTime = new String(source.AuthorizationStartTime);
        }
        if (source.AuthorizationEndTime != null) {
            this.AuthorizationEndTime = new String(source.AuthorizationEndTime);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.MonitorEndTime != null) {
            this.MonitorEndTime = new String(source.MonitorEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkName", this.WorkName);
        this.setParamSimple(map, prefix + "WorkCategory", this.WorkCategory);
        this.setParamSimple(map, prefix + "WorkType", this.WorkType);
        this.setParamSimple(map, prefix + "WorkSign", this.WorkSign);
        this.setParamSimple(map, prefix + "WorkPic", this.WorkPic);
        this.setParamSimple(map, prefix + "WorkDesc", this.WorkDesc);
        this.setParamSimple(map, prefix + "IsOriginal", this.IsOriginal);
        this.setParamSimple(map, prefix + "IsRelease", this.IsRelease);
        this.setParamSimple(map, prefix + "ProducerID", this.ProducerID);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "SampleContentURL", this.SampleContentURL);
        this.setParamSimple(map, prefix + "SampleDownloadURL", this.SampleDownloadURL);
        this.setParamSimple(map, prefix + "GrantType", this.GrantType);
        this.setParamSimple(map, prefix + "SamplePublicURL", this.SamplePublicURL);
        this.setParamSimple(map, prefix + "IsMonitor", this.IsMonitor);
        this.setParamSimple(map, prefix + "IsCert", this.IsCert);
        this.setParamSimple(map, prefix + "CertUrl", this.CertUrl);
        this.setParamSimple(map, prefix + "MonitorUrl", this.MonitorUrl);
        this.setParamSimple(map, prefix + "ProduceType", this.ProduceType);
        this.setParamArraySimple(map, prefix + "WhiteLists.", this.WhiteLists);
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "AuthorizationStartTime", this.AuthorizationStartTime);
        this.setParamSimple(map, prefix + "AuthorizationEndTime", this.AuthorizationEndTime);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "MonitorEndTime", this.MonitorEndTime);

    }
}

