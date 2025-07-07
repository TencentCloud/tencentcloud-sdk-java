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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayToolCommon extends AbstractModel {

    /**
    * 子公司ID
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * 子公司名称
    */
    @SerializedName("EnterpriseName")
    @Expose
    private String EnterpriseName;

    /**
    * 主任务ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 单任务ID
    */
    @SerializedName("JobStageId")
    @Expose
    private Long JobStageId;

    /**
    * 是否忽略
    */
    @SerializedName("Ignored")
    @Expose
    private Boolean Ignored;

    /**
    * 子任务ID
    */
    @SerializedName("JobRecordId")
    @Expose
    private Long JobRecordId;

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 企业名称
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 详情
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Md5值
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 创建时间
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * 标签列表，json格式：{\"tag1\":[\"责任人xxx\"],\"tag2\":[\"测试站\"]}
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
     * Get 子公司ID 
     * @return EnterpriseUid 子公司ID
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司ID
     * @param EnterpriseUid 子公司ID
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get 子公司名称 
     * @return EnterpriseName 子公司名称
     */
    public String getEnterpriseName() {
        return this.EnterpriseName;
    }

    /**
     * Set 子公司名称
     * @param EnterpriseName 子公司名称
     */
    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    /**
     * Get 主任务ID 
     * @return JobId 主任务ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 主任务ID
     * @param JobId 主任务ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 单任务ID 
     * @return JobStageId 单任务ID
     */
    public Long getJobStageId() {
        return this.JobStageId;
    }

    /**
     * Set 单任务ID
     * @param JobStageId 单任务ID
     */
    public void setJobStageId(Long JobStageId) {
        this.JobStageId = JobStageId;
    }

    /**
     * Get 是否忽略 
     * @return Ignored 是否忽略
     */
    public Boolean getIgnored() {
        return this.Ignored;
    }

    /**
     * Set 是否忽略
     * @param Ignored 是否忽略
     */
    public void setIgnored(Boolean Ignored) {
        this.Ignored = Ignored;
    }

    /**
     * Get 子任务ID 
     * @return JobRecordId 子任务ID
     */
    public Long getJobRecordId() {
        return this.JobRecordId;
    }

    /**
     * Set 子任务ID
     * @param JobRecordId 子任务ID
     */
    public void setJobRecordId(Long JobRecordId) {
        this.JobRecordId = JobRecordId;
    }

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 企业名称 
     * @return CustomerName 企业名称
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 企业名称
     * @param CustomerName 企业名称
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 详情 
     * @return Detail 详情
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 详情
     * @param Detail 详情
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Md5值 
     * @return Md5 Md5值
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Md5值
     * @param Md5 Md5值
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 创建时间 
     * @return CreateAt 创建时间
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
     * @param CreateAt 创建时间
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 更新时间 
     * @return UpdateAt 更新时间
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 更新时间
     * @param UpdateAt 更新时间
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get 标签列表，json格式：{\"tag1\":[\"责任人xxx\"],\"tag2\":[\"测试站\"]} 
     * @return Labels 标签列表，json格式：{\"tag1\":[\"责任人xxx\"],\"tag2\":[\"测试站\"]}
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签列表，json格式：{\"tag1\":[\"责任人xxx\"],\"tag2\":[\"测试站\"]}
     * @param Labels 标签列表，json格式：{\"tag1\":[\"责任人xxx\"],\"tag2\":[\"测试站\"]}
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    public DisplayToolCommon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayToolCommon(DisplayToolCommon source) {
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
        if (source.EnterpriseName != null) {
            this.EnterpriseName = new String(source.EnterpriseName);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.JobStageId != null) {
            this.JobStageId = new Long(source.JobStageId);
        }
        if (source.Ignored != null) {
            this.Ignored = new Boolean(source.Ignored);
        }
        if (source.JobRecordId != null) {
            this.JobRecordId = new Long(source.JobRecordId);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);
        this.setParamSimple(map, prefix + "EnterpriseName", this.EnterpriseName);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobStageId", this.JobStageId);
        this.setParamSimple(map, prefix + "Ignored", this.Ignored);
        this.setParamSimple(map, prefix + "JobRecordId", this.JobRecordId);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamSimple(map, prefix + "Labels", this.Labels);

    }
}

