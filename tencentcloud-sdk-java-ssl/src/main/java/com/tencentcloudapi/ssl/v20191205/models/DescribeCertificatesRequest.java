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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesRequest extends AbstractModel{

    /**
    * 分页偏移量，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键词，可搜索证书 ID、备注名称、域名。例如： a8xHcaIs。
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
    * 按到期时间排序：DESC = 降序， ASC = 升序。
    */
    @SerializedName("ExpirationSort")
    @Expose
    private String ExpirationSort;

    /**
    * 证书状态。
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
     * Get 分页偏移量，从0开始。 
     * @return Offset 分页偏移量，从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始。
     * @param Offset 分页偏移量，从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认20。 
     * @return Limit 每页数量，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认20。
     * @param Limit 每页数量，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键词，可搜索证书 ID、备注名称、域名。例如： a8xHcaIs。 
     * @return SearchKey 搜索关键词，可搜索证书 ID、备注名称、域名。例如： a8xHcaIs。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索关键词，可搜索证书 ID、备注名称、域名。例如： a8xHcaIs。
     * @param SearchKey 搜索关键词，可搜索证书 ID、备注名称、域名。例如： a8xHcaIs。
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
     * Get 按到期时间排序：DESC = 降序， ASC = 升序。 
     * @return ExpirationSort 按到期时间排序：DESC = 降序， ASC = 升序。
     */
    public String getExpirationSort() {
        return this.ExpirationSort;
    }

    /**
     * Set 按到期时间排序：DESC = 降序， ASC = 升序。
     * @param ExpirationSort 按到期时间排序：DESC = 降序， ASC = 升序。
     */
    public void setExpirationSort(String ExpirationSort) {
        this.ExpirationSort = ExpirationSort;
    }

    /**
     * Get 证书状态。 
     * @return CertificateStatus 证书状态。
     */
    public Long [] getCertificateStatus() {
        return this.CertificateStatus;
    }

    /**
     * Set 证书状态。
     * @param CertificateStatus 证书状态。
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

    }
}

