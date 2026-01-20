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
    * <p>分页偏移量，从0开始。 默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认10。最大值1000，如超过1000按1000处理</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>搜索关键词，模糊匹配证书 ID、备注名称、证书域名</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * <p>项目 ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。</p>
    */
    @SerializedName("ExpirationSort")
    @Expose
    private String ExpirationSort;

    /**
    * <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中</p>
    */
    @SerializedName("CertificateStatus")
    @Expose
    private Long [] CertificateStatus;

    /**
    * <p>是否可部署，可选值：1 = 可部署，0 =  不可部署。</p>
    */
    @SerializedName("Deployable")
    @Expose
    private Long Deployable;

    /**
    * <p>是否筛选上传托管的 1筛选，0不筛选</p>
    */
    @SerializedName("Upload")
    @Expose
    private Long Upload;

    /**
    * <p>是否筛选可续期证书 1筛选 0不筛选</p>
    */
    @SerializedName("Renew")
    @Expose
    private Long Renew;

    /**
    * <p>筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部</p>
    */
    @SerializedName("FilterSource")
    @Expose
    private String FilterSource;

    /**
    * <p>是否筛选国密证书。1:筛选  0:不筛选</p>
    */
    @SerializedName("IsSM")
    @Expose
    private Long IsSM;

    /**
    * <p>筛选证书是否即将过期，传1是筛选，0不筛选</p>
    */
    @SerializedName("FilterExpiring")
    @Expose
    private Long FilterExpiring;

    /**
    * <p>是否可托管，可选值：1 = 可托管，0 =  不可托管。</p>
    */
    @SerializedName("Hostable")
    @Expose
    private Long Hostable;

    /**
    * <p>筛选指定标签的证书</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>是否筛选等待签发的证书，传1是筛选，0和null不筛选</p>
    */
    @SerializedName("IsPendingIssue")
    @Expose
    private Long IsPendingIssue;

    /**
    * <p>筛选指定证书ID的证书，只支持有权限的证书ID</p>
    */
    @SerializedName("CertIds")
    @Expose
    private String [] CertIds;

    /**
    * <p>订阅服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get <p>分页偏移量，从0开始。 默认为0</p> 
     * @return Offset <p>分页偏移量，从0开始。 默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，从0开始。 默认为0</p>
     * @param Offset <p>分页偏移量，从0开始。 默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认10。最大值1000，如超过1000按1000处理</p> 
     * @return Limit <p>每页数量，默认10。最大值1000，如超过1000按1000处理</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认10。最大值1000，如超过1000按1000处理</p>
     * @param Limit <p>每页数量，默认10。最大值1000，如超过1000按1000处理</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>搜索关键词，模糊匹配证书 ID、备注名称、证书域名</p> 
     * @return SearchKey <p>搜索关键词，模糊匹配证书 ID、备注名称、证书域名</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>搜索关键词，模糊匹配证书 ID、备注名称、证书域名</p>
     * @param SearchKey <p>搜索关键词，模糊匹配证书 ID、备注名称、证书域名</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p> 
     * @return CertificateType <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
     * @param CertificateType <p>证书类型：CA = 客户端证书，SVR = 服务器证书。</p>
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get <p>项目 ID。</p> 
     * @return ProjectId <p>项目 ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。</p>
     * @param ProjectId <p>项目 ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。</p> 
     * @return ExpirationSort <p>默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。</p>
     */
    public String getExpirationSort() {
        return this.ExpirationSort;
    }

    /**
     * Set <p>默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。</p>
     * @param ExpirationSort <p>默认按照证书申请时间降序； 若传排序则按到期时间排序：DESC = 证书到期时间降序， ASC = 证书到期时间升序。</p>
     */
    public void setExpirationSort(String ExpirationSort) {
        this.ExpirationSort = ExpirationSort;
    }

    /**
     * Get <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中</p> 
     * @return CertificateStatus <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中</p>
     */
    public Long [] getCertificateStatus() {
        return this.CertificateStatus;
    }

    /**
     * Set <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中</p>
     * @param CertificateStatus <p>证书状态：0 = 审核中，1 = 已通过，2 = 审核失败，3 = 已过期，4 = 已添加DNS记录，5 = 企业证书，待提交，6 = 订单取消中，7 = 已取消，8 = 已提交资料， 待上传确认函，9 = 证书吊销中，10 = 已吊销，11 = 重颁发中，12 = 待上传吊销确认函，13 = 免费证书待提交资料。14 = 已退款。 15 = 证书迁移中</p>
     */
    public void setCertificateStatus(Long [] CertificateStatus) {
        this.CertificateStatus = CertificateStatus;
    }

    /**
     * Get <p>是否可部署，可选值：1 = 可部署，0 =  不可部署。</p> 
     * @return Deployable <p>是否可部署，可选值：1 = 可部署，0 =  不可部署。</p>
     */
    public Long getDeployable() {
        return this.Deployable;
    }

    /**
     * Set <p>是否可部署，可选值：1 = 可部署，0 =  不可部署。</p>
     * @param Deployable <p>是否可部署，可选值：1 = 可部署，0 =  不可部署。</p>
     */
    public void setDeployable(Long Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get <p>是否筛选上传托管的 1筛选，0不筛选</p> 
     * @return Upload <p>是否筛选上传托管的 1筛选，0不筛选</p>
     */
    public Long getUpload() {
        return this.Upload;
    }

    /**
     * Set <p>是否筛选上传托管的 1筛选，0不筛选</p>
     * @param Upload <p>是否筛选上传托管的 1筛选，0不筛选</p>
     */
    public void setUpload(Long Upload) {
        this.Upload = Upload;
    }

    /**
     * Get <p>是否筛选可续期证书 1筛选 0不筛选</p> 
     * @return Renew <p>是否筛选可续期证书 1筛选 0不筛选</p>
     */
    public Long getRenew() {
        return this.Renew;
    }

    /**
     * Set <p>是否筛选可续期证书 1筛选 0不筛选</p>
     * @param Renew <p>是否筛选可续期证书 1筛选 0不筛选</p>
     */
    public void setRenew(Long Renew) {
        this.Renew = Renew;
    }

    /**
     * Get <p>筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部</p> 
     * @return FilterSource <p>筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部</p>
     */
    public String getFilterSource() {
        return this.FilterSource;
    }

    /**
     * Set <p>筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部</p>
     * @param FilterSource <p>筛选来源， upload：上传证书， buy：腾讯云证书， 不传默认全部</p>
     */
    public void setFilterSource(String FilterSource) {
        this.FilterSource = FilterSource;
    }

    /**
     * Get <p>是否筛选国密证书。1:筛选  0:不筛选</p> 
     * @return IsSM <p>是否筛选国密证书。1:筛选  0:不筛选</p>
     */
    public Long getIsSM() {
        return this.IsSM;
    }

    /**
     * Set <p>是否筛选国密证书。1:筛选  0:不筛选</p>
     * @param IsSM <p>是否筛选国密证书。1:筛选  0:不筛选</p>
     */
    public void setIsSM(Long IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get <p>筛选证书是否即将过期，传1是筛选，0不筛选</p> 
     * @return FilterExpiring <p>筛选证书是否即将过期，传1是筛选，0不筛选</p>
     */
    public Long getFilterExpiring() {
        return this.FilterExpiring;
    }

    /**
     * Set <p>筛选证书是否即将过期，传1是筛选，0不筛选</p>
     * @param FilterExpiring <p>筛选证书是否即将过期，传1是筛选，0不筛选</p>
     */
    public void setFilterExpiring(Long FilterExpiring) {
        this.FilterExpiring = FilterExpiring;
    }

    /**
     * Get <p>是否可托管，可选值：1 = 可托管，0 =  不可托管。</p> 
     * @return Hostable <p>是否可托管，可选值：1 = 可托管，0 =  不可托管。</p>
     */
    public Long getHostable() {
        return this.Hostable;
    }

    /**
     * Set <p>是否可托管，可选值：1 = 可托管，0 =  不可托管。</p>
     * @param Hostable <p>是否可托管，可选值：1 = 可托管，0 =  不可托管。</p>
     */
    public void setHostable(Long Hostable) {
        this.Hostable = Hostable;
    }

    /**
     * Get <p>筛选指定标签的证书</p> 
     * @return Tags <p>筛选指定标签的证书</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>筛选指定标签的证书</p>
     * @param Tags <p>筛选指定标签的证书</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否筛选等待签发的证书，传1是筛选，0和null不筛选</p> 
     * @return IsPendingIssue <p>是否筛选等待签发的证书，传1是筛选，0和null不筛选</p>
     */
    public Long getIsPendingIssue() {
        return this.IsPendingIssue;
    }

    /**
     * Set <p>是否筛选等待签发的证书，传1是筛选，0和null不筛选</p>
     * @param IsPendingIssue <p>是否筛选等待签发的证书，传1是筛选，0和null不筛选</p>
     */
    public void setIsPendingIssue(Long IsPendingIssue) {
        this.IsPendingIssue = IsPendingIssue;
    }

    /**
     * Get <p>筛选指定证书ID的证书，只支持有权限的证书ID</p> 
     * @return CertIds <p>筛选指定证书ID的证书，只支持有权限的证书ID</p>
     */
    public String [] getCertIds() {
        return this.CertIds;
    }

    /**
     * Set <p>筛选指定证书ID的证书，只支持有权限的证书ID</p>
     * @param CertIds <p>筛选指定证书ID的证书，只支持有权限的证书ID</p>
     */
    public void setCertIds(String [] CertIds) {
        this.CertIds = CertIds;
    }

    /**
     * Get <p>订阅服务ID</p> 
     * @return ServiceId <p>订阅服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>订阅服务ID</p>
     * @param ServiceId <p>订阅服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
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
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
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
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

