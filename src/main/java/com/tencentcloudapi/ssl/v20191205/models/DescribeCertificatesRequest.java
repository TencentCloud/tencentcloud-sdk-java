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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesRequest extends AbstractModel {

    /**
    * 分页偏移量，从0开始。 默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认10。最大值1000，如超过1000按1000处理
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键词，模糊匹配证书 ID、备注名称、证书域名
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 证书类型：CA = 客户端证书，SVR = 服务器证书。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。
    */
    @SerializedName("ExpirationSort")
    @Expose
    private String ExpirationSort;

    /**
    * 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中
    */
    @SerializedName("CertificateStatus")
    @Expose
    private Long [] CertificateStatus;

    /**
    * 是否可部署，可选值：1 = 可部署，0 =  不可部署。
    */
    @SerializedName("Deployable")
    @Expose
    private Long Deployable;

    /**
    * 是否筛选上传托管的 1筛选，0不筛选
    */
    @SerializedName("Upload")
    @Expose
    private Long Upload;

    /**
    * 是否筛选可续期证书 1筛选 0不筛选
    */
    @SerializedName("Renew")
    @Expose
    private Long Renew;

    /**
    * 筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部
    */
    @SerializedName("FilterSource")
    @Expose
    private String FilterSource;

    /**
    * 是否筛选国密证书。1:筛选  0:不筛选
    */
    @SerializedName("IsSM")
    @Expose
    private Long IsSM;

    /**
    * 筛选证书是否即将过期，传1是筛选，0不筛选
    */
    @SerializedName("FilterExpiring")
    @Expose
    private Long FilterExpiring;

    /**
    * 是否可托管，可选值：1 = 可托管，0 =  不可托管。
    */
    @SerializedName("Hostable")
    @Expose
    private Long Hostable;

    /**
    * 筛选指定标签的证书
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 是否筛选等待签发的证书，传1是筛选，0和null不筛选
    */
    @SerializedName("IsPendingIssue")
    @Expose
    private Long IsPendingIssue;

    /**
    * 筛选指定证书ID的证书，只支持有权限的证书ID
    */
    @SerializedName("CertIds")
    @Expose
    private String [] CertIds;

    /**
     * Get 分页偏移量，从0开始。 默认为0 
     * @return Offset 分页偏移量，从0开始。 默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始。 默认为0
     * @param Offset 分页偏移量，从0开始。 默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认10。最大值1000，如超过1000按1000处理 
     * @return Limit 每页数量，默认10。最大值1000，如超过1000按1000处理
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认10。最大值1000，如超过1000按1000处理
     * @param Limit 每页数量，默认10。最大值1000，如超过1000按1000处理
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键词，模糊匹配证书 ID、备注名称、证书域名 
     * @return SearchKey 搜索关键词，模糊匹配证书 ID、备注名称、证书域名
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索关键词，模糊匹配证书 ID、备注名称、证书域名
     * @param SearchKey 搜索关键词，模糊匹配证书 ID、备注名称、证书域名
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 证书类型：CA = 客户端证书，SVR = 服务器证书。 
     * @return CertificateType 证书类型：CA = 客户端证书，SVR = 服务器证书。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证书类型：CA = 客户端证书，SVR = 服务器证书。
     * @param CertificateType 证书类型：CA = 客户端证书，SVR = 服务器证书。
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。 
     * @return ExpirationSort 默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。
     */
    public String getExpirationSort() {
        return this.ExpirationSort;
    }

    /**
     * Set 默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。
     * @param ExpirationSort 默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。
     */
    public void setExpirationSort(String ExpirationSort) {
        this.ExpirationSort = ExpirationSort;
    }

    /**
     * Get 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中 
     * @return CertificateStatus 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中
     */
    public Long [] getCertificateStatus() {
        return this.CertificateStatus;
    }

    /**
     * Set 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中
     * @param CertificateStatus 证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中
     */
    public void setCertificateStatus(Long [] CertificateStatus) {
        this.CertificateStatus = CertificateStatus;
    }

    /**
     * Get 是否可部署，可选值：1 = 可部署，0 =  不可部署。 
     * @return Deployable 是否可部署，可选值：1 = 可部署，0 =  不可部署。
     */
    public Long getDeployable() {
        return this.Deployable;
    }

    /**
     * Set 是否可部署，可选值：1 = 可部署，0 =  不可部署。
     * @param Deployable 是否可部署，可选值：1 = 可部署，0 =  不可部署。
     */
    public void setDeployable(Long Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get 是否筛选上传托管的 1筛选，0不筛选 
     * @return Upload 是否筛选上传托管的 1筛选，0不筛选
     */
    public Long getUpload() {
        return this.Upload;
    }

    /**
     * Set 是否筛选上传托管的 1筛选，0不筛选
     * @param Upload 是否筛选上传托管的 1筛选，0不筛选
     */
    public void setUpload(Long Upload) {
        this.Upload = Upload;
    }

    /**
     * Get 是否筛选可续期证书 1筛选 0不筛选 
     * @return Renew 是否筛选可续期证书 1筛选 0不筛选
     */
    public Long getRenew() {
        return this.Renew;
    }

    /**
     * Set 是否筛选可续期证书 1筛选 0不筛选
     * @param Renew 是否筛选可续期证书 1筛选 0不筛选
     */
    public void setRenew(Long Renew) {
        this.Renew = Renew;
    }

    /**
     * Get 筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部 
     * @return FilterSource 筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部
     */
    public String getFilterSource() {
        return this.FilterSource;
    }

    /**
     * Set 筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部
     * @param FilterSource 筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部
     */
    public void setFilterSource(String FilterSource) {
        this.FilterSource = FilterSource;
    }

    /**
     * Get 是否筛选国密证书。1:筛选  0:不筛选 
     * @return IsSM 是否筛选国密证书。1:筛选  0:不筛选
     */
    public Long getIsSM() {
        return this.IsSM;
    }

    /**
     * Set 是否筛选国密证书。1:筛选  0:不筛选
     * @param IsSM 是否筛选国密证书。1:筛选  0:不筛选
     */
    public void setIsSM(Long IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get 筛选证书是否即将过期，传1是筛选，0不筛选 
     * @return FilterExpiring 筛选证书是否即将过期，传1是筛选，0不筛选
     */
    public Long getFilterExpiring() {
        return this.FilterExpiring;
    }

    /**
     * Set 筛选证书是否即将过期，传1是筛选，0不筛选
     * @param FilterExpiring 筛选证书是否即将过期，传1是筛选，0不筛选
     */
    public void setFilterExpiring(Long FilterExpiring) {
        this.FilterExpiring = FilterExpiring;
    }

    /**
     * Get 是否可托管，可选值：1 = 可托管，0 =  不可托管。 
     * @return Hostable 是否可托管，可选值：1 = 可托管，0 =  不可托管。
     */
    public Long getHostable() {
        return this.Hostable;
    }

    /**
     * Set 是否可托管，可选值：1 = 可托管，0 =  不可托管。
     * @param Hostable 是否可托管，可选值：1 = 可托管，0 =  不可托管。
     */
    public void setHostable(Long Hostable) {
        this.Hostable = Hostable;
    }

    /**
     * Get 筛选指定标签的证书 
     * @return Tags 筛选指定标签的证书
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 筛选指定标签的证书
     * @param Tags 筛选指定标签的证书
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否筛选等待签发的证书，传1是筛选，0和null不筛选 
     * @return IsPendingIssue 是否筛选等待签发的证书，传1是筛选，0和null不筛选
     */
    public Long getIsPendingIssue() {
        return this.IsPendingIssue;
    }

    /**
     * Set 是否筛选等待签发的证书，传1是筛选，0和null不筛选
     * @param IsPendingIssue 是否筛选等待签发的证书，传1是筛选，0和null不筛选
     */
    public void setIsPendingIssue(Long IsPendingIssue) {
        this.IsPendingIssue = IsPendingIssue;
    }

    /**
     * Get 筛选指定证书ID的证书，只支持有权限的证书ID 
     * @return CertIds 筛选指定证书ID的证书，只支持有权限的证书ID
     */
    public String [] getCertIds() {
        return this.CertIds;
    }

    /**
     * Set 筛选指定证书ID的证书，只支持有权限的证书ID
     * @param CertIds 筛选指定证书ID的证书，只支持有权限的证书ID
     */
    public void setCertIds(String [] CertIds) {
        this.CertIds = CertIds;
    }

    public DescribeCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificatesRequest(DescribeCertificatesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ExpirationSort != null) {
            this.ExpirationSort = new String(source.ExpirationSort);
        }
        if (source.CertificateStatus != null) {
            this.CertificateStatus = new Long[source.CertificateStatus.length];
            for (int i = 0; i < source.CertificateStatus.length; i++) {
                this.CertificateStatus[i] = new Long(source.CertificateStatus[i]);
            }
        }
        if (source.Deployable != null) {
            this.Deployable = new Long(source.Deployable);
        }
        if (source.Upload != null) {
            this.Upload = new Long(source.Upload);
        }
        if (source.Renew != null) {
            this.Renew = new Long(source.Renew);
        }
        if (source.FilterSource != null) {
            this.FilterSource = new String(source.FilterSource);
        }
        if (source.IsSM != null) {
            this.IsSM = new Long(source.IsSM);
        }
        if (source.FilterExpiring != null) {
            this.FilterExpiring = new Long(source.FilterExpiring);
        }
        if (source.Hostable != null) {
            this.Hostable = new Long(source.Hostable);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.IsPendingIssue != null) {
            this.IsPendingIssue = new Long(source.IsPendingIssue);
        }
        if (source.CertIds != null) {
            this.CertIds = new String[source.CertIds.length];
            for (int i = 0; i < source.CertIds.length; i++) {
                this.CertIds[i] = new String(source.CertIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ExpirationSort", this.ExpirationSort);
        this.setParamArraySimple(map, prefix + "CertificateStatus.", this.CertificateStatus);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);
        this.setParamSimple(map, prefix + "Upload", this.Upload);
        this.setParamSimple(map, prefix + "Renew", this.Renew);
        this.setParamSimple(map, prefix + "FilterSource", this.FilterSource);
        this.setParamSimple(map, prefix + "IsSM", this.IsSM);
        this.setParamSimple(map, prefix + "FilterExpiring", this.FilterExpiring);
        this.setParamSimple(map, prefix + "Hostable", this.Hostable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsPendingIssue", this.IsPendingIssue);
        this.setParamArraySimple(map, prefix + "CertIds.", this.CertIds);

    }
}

