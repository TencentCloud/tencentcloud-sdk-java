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
    * 字段已废弃，作品图片
    */
    @SerializedName("WorkPic")
    @Expose
    private String WorkPic;

    /**
    * 作品描述
    */
    @SerializedName("WorkDesc")
    @Expose
    private String WorkDesc;

    /**
    * 是否原创：0-否 1-是
    */
    @SerializedName("IsOriginal")
    @Expose
    private String IsOriginal;

    /**
    * 是否发布：0-未发布 1-已发布
    */
    @SerializedName("IsRelease")
    @Expose
    private String IsRelease;

    /**
    * 字段已废弃，著作权人ID
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
    * 字段已废弃
    */
    @SerializedName("SampleContentURL")
    @Expose
    private String SampleContentURL;

    /**
    * 作品下载地址
    */
    @SerializedName("SampleDownloadURL")
    @Expose
    private String SampleDownloadURL;

    /**
    * 作品在线地址
    */
    @SerializedName("SamplePublicURL")
    @Expose
    private String SamplePublicURL;

    /**
    * 字段已废弃，授予类型
    */
    @SerializedName("GrantType")
    @Expose
    private String GrantType;

    /**
    * 是否监测：0-不监测 1-监测
    */
    @SerializedName("IsMonitor")
    @Expose
    private String IsMonitor;

    /**
    * 是否存证：0-不存证  2-存证 注意是2
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
    * 字段已废弃，创作性质
    */
    @SerializedName("ProduceType")
    @Expose
    private String ProduceType;

    /**
    * 白名单列表
    */
    @SerializedName("WhiteLists")
    @Expose
    private String [] WhiteLists;

    /**
    * 作品ID，忽略该字段
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 著作权人姓名
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * 作者，小说类型必填
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 授权书下载地址
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * 授权书开始时间
    */
    @SerializedName("AuthorizationStartTime")
    @Expose
    private String AuthorizationStartTime;

    /**
    * 授权书结束时间
    */
    @SerializedName("AuthorizationEndTime")
    @Expose
    private String AuthorizationEndTime;

    /**
    * 内容格式，支持txt、doc等，表示Content的具体格式
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 文件内容base64编码，该字段仅在无法提供下载链接时使用
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 监测结束时间
    */
    @SerializedName("MonitorEndTime")
    @Expose
    private String MonitorEndTime;

    /**
    * 申请人ID，用于存证和取证
    */
    @SerializedName("ApplierId")
    @Expose
    private String ApplierId;

    /**
    * 申请人姓名，用于存证和取证
    */
    @SerializedName("ApplierName")
    @Expose
    private String ApplierName;

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
     * Get 字段已废弃，作品图片 
     * @return WorkPic 字段已废弃，作品图片
     */
    public String getWorkPic() {
        return this.WorkPic;
    }

    /**
     * Set 字段已废弃，作品图片
     * @param WorkPic 字段已废弃，作品图片
     */
    public void setWorkPic(String WorkPic) {
        this.WorkPic = WorkPic;
    }

    /**
     * Get 作品描述 
     * @return WorkDesc 作品描述
     */
    public String getWorkDesc() {
        return this.WorkDesc;
    }

    /**
     * Set 作品描述
     * @param WorkDesc 作品描述
     */
    public void setWorkDesc(String WorkDesc) {
        this.WorkDesc = WorkDesc;
    }

    /**
     * Get 是否原创：0-否 1-是 
     * @return IsOriginal 是否原创：0-否 1-是
     */
    public String getIsOriginal() {
        return this.IsOriginal;
    }

    /**
     * Set 是否原创：0-否 1-是
     * @param IsOriginal 是否原创：0-否 1-是
     */
    public void setIsOriginal(String IsOriginal) {
        this.IsOriginal = IsOriginal;
    }

    /**
     * Get 是否发布：0-未发布 1-已发布 
     * @return IsRelease 是否发布：0-未发布 1-已发布
     */
    public String getIsRelease() {
        return this.IsRelease;
    }

    /**
     * Set 是否发布：0-未发布 1-已发布
     * @param IsRelease 是否发布：0-未发布 1-已发布
     */
    public void setIsRelease(String IsRelease) {
        this.IsRelease = IsRelease;
    }

    /**
     * Get 字段已废弃，著作权人ID 
     * @return ProducerID 字段已废弃，著作权人ID
     */
    public Long getProducerID() {
        return this.ProducerID;
    }

    /**
     * Set 字段已废弃，著作权人ID
     * @param ProducerID 字段已废弃，著作权人ID
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
     * Get 字段已废弃 
     * @return SampleContentURL 字段已废弃
     */
    public String getSampleContentURL() {
        return this.SampleContentURL;
    }

    /**
     * Set 字段已废弃
     * @param SampleContentURL 字段已废弃
     */
    public void setSampleContentURL(String SampleContentURL) {
        this.SampleContentURL = SampleContentURL;
    }

    /**
     * Get 作品下载地址 
     * @return SampleDownloadURL 作品下载地址
     */
    public String getSampleDownloadURL() {
        return this.SampleDownloadURL;
    }

    /**
     * Set 作品下载地址
     * @param SampleDownloadURL 作品下载地址
     */
    public void setSampleDownloadURL(String SampleDownloadURL) {
        this.SampleDownloadURL = SampleDownloadURL;
    }

    /**
     * Get 作品在线地址 
     * @return SamplePublicURL 作品在线地址
     */
    public String getSamplePublicURL() {
        return this.SamplePublicURL;
    }

    /**
     * Set 作品在线地址
     * @param SamplePublicURL 作品在线地址
     */
    public void setSamplePublicURL(String SamplePublicURL) {
        this.SamplePublicURL = SamplePublicURL;
    }

    /**
     * Get 字段已废弃，授予类型 
     * @return GrantType 字段已废弃，授予类型
     */
    public String getGrantType() {
        return this.GrantType;
    }

    /**
     * Set 字段已废弃，授予类型
     * @param GrantType 字段已废弃，授予类型
     */
    public void setGrantType(String GrantType) {
        this.GrantType = GrantType;
    }

    /**
     * Get 是否监测：0-不监测 1-监测 
     * @return IsMonitor 是否监测：0-不监测 1-监测
     */
    public String getIsMonitor() {
        return this.IsMonitor;
    }

    /**
     * Set 是否监测：0-不监测 1-监测
     * @param IsMonitor 是否监测：0-不监测 1-监测
     */
    public void setIsMonitor(String IsMonitor) {
        this.IsMonitor = IsMonitor;
    }

    /**
     * Get 是否存证：0-不存证  2-存证 注意是2 
     * @return IsCert 是否存证：0-不存证  2-存证 注意是2
     */
    public String getIsCert() {
        return this.IsCert;
    }

    /**
     * Set 是否存证：0-不存证  2-存证 注意是2
     * @param IsCert 是否存证：0-不存证  2-存证 注意是2
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
     * Get 字段已废弃，创作性质 
     * @return ProduceType 字段已废弃，创作性质
     */
    public String getProduceType() {
        return this.ProduceType;
    }

    /**
     * Set 字段已废弃，创作性质
     * @param ProduceType 字段已废弃，创作性质
     */
    public void setProduceType(String ProduceType) {
        this.ProduceType = ProduceType;
    }

    /**
     * Get 白名单列表 
     * @return WhiteLists 白名单列表
     */
    public String [] getWhiteLists() {
        return this.WhiteLists;
    }

    /**
     * Set 白名单列表
     * @param WhiteLists 白名单列表
     */
    public void setWhiteLists(String [] WhiteLists) {
        this.WhiteLists = WhiteLists;
    }

    /**
     * Get 作品ID，忽略该字段 
     * @return WorkId 作品ID，忽略该字段
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 作品ID，忽略该字段
     * @param WorkId 作品ID，忽略该字段
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 著作权人姓名 
     * @return ProducerName 著作权人姓名
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set 著作权人姓名
     * @param ProducerName 著作权人姓名
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get 作者，小说类型必填 
     * @return Nickname 作者，小说类型必填
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 作者，小说类型必填
     * @param Nickname 作者，小说类型必填
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 授权书下载地址 
     * @return Authorization 授权书下载地址
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set 授权书下载地址
     * @param Authorization 授权书下载地址
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get 授权书开始时间 
     * @return AuthorizationStartTime 授权书开始时间
     */
    public String getAuthorizationStartTime() {
        return this.AuthorizationStartTime;
    }

    /**
     * Set 授权书开始时间
     * @param AuthorizationStartTime 授权书开始时间
     */
    public void setAuthorizationStartTime(String AuthorizationStartTime) {
        this.AuthorizationStartTime = AuthorizationStartTime;
    }

    /**
     * Get 授权书结束时间 
     * @return AuthorizationEndTime 授权书结束时间
     */
    public String getAuthorizationEndTime() {
        return this.AuthorizationEndTime;
    }

    /**
     * Set 授权书结束时间
     * @param AuthorizationEndTime 授权书结束时间
     */
    public void setAuthorizationEndTime(String AuthorizationEndTime) {
        this.AuthorizationEndTime = AuthorizationEndTime;
    }

    /**
     * Get 内容格式，支持txt、doc等，表示Content的具体格式 
     * @return ContentType 内容格式，支持txt、doc等，表示Content的具体格式
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容格式，支持txt、doc等，表示Content的具体格式
     * @param ContentType 内容格式，支持txt、doc等，表示Content的具体格式
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 文件内容base64编码，该字段仅在无法提供下载链接时使用 
     * @return Content 文件内容base64编码，该字段仅在无法提供下载链接时使用
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文件内容base64编码，该字段仅在无法提供下载链接时使用
     * @param Content 文件内容base64编码，该字段仅在无法提供下载链接时使用
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 监测结束时间 
     * @return MonitorEndTime 监测结束时间
     */
    public String getMonitorEndTime() {
        return this.MonitorEndTime;
    }

    /**
     * Set 监测结束时间
     * @param MonitorEndTime 监测结束时间
     */
    public void setMonitorEndTime(String MonitorEndTime) {
        this.MonitorEndTime = MonitorEndTime;
    }

    /**
     * Get 申请人ID，用于存证和取证 
     * @return ApplierId 申请人ID，用于存证和取证
     */
    public String getApplierId() {
        return this.ApplierId;
    }

    /**
     * Set 申请人ID，用于存证和取证
     * @param ApplierId 申请人ID，用于存证和取证
     */
    public void setApplierId(String ApplierId) {
        this.ApplierId = ApplierId;
    }

    /**
     * Get 申请人姓名，用于存证和取证 
     * @return ApplierName 申请人姓名，用于存证和取证
     */
    public String getApplierName() {
        return this.ApplierName;
    }

    /**
     * Set 申请人姓名，用于存证和取证
     * @param ApplierName 申请人姓名，用于存证和取证
     */
    public void setApplierName(String ApplierName) {
        this.ApplierName = ApplierName;
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
        if (source.SamplePublicURL != null) {
            this.SamplePublicURL = new String(source.SamplePublicURL);
        }
        if (source.GrantType != null) {
            this.GrantType = new String(source.GrantType);
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
        if (source.ApplierId != null) {
            this.ApplierId = new String(source.ApplierId);
        }
        if (source.ApplierName != null) {
            this.ApplierName = new String(source.ApplierName);
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
        this.setParamSimple(map, prefix + "SamplePublicURL", this.SamplePublicURL);
        this.setParamSimple(map, prefix + "GrantType", this.GrantType);
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
        this.setParamSimple(map, prefix + "ApplierId", this.ApplierId);
        this.setParamSimple(map, prefix + "ApplierName", this.ApplierName);

    }
}

