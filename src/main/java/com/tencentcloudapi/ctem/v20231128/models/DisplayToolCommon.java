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
    * <p>子公司ID</p>
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * <p>子公司名称</p>
    */
    @SerializedName("EnterpriseName")
    @Expose
    private String EnterpriseName;

    /**
    * <p>主任务ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * <p>单任务ID</p>
    */
    @SerializedName("JobStageId")
    @Expose
    private Long JobStageId;

    /**
    * <p>是否忽略</p>
    */
    @SerializedName("Ignored")
    @Expose
    private Boolean Ignored;

    /**
    * <p>子任务ID</p>
    */
    @SerializedName("JobRecordId")
    @Expose
    private Long JobRecordId;

    /**
    * <p>企业ID</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * <p>企业名称</p>
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * <p>详情</p>
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * <p>Md5值</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * <p>标签列表，json格式：{"tag1":["责任人xxx"],"tag2":["测试站"]}</p>
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * <p>演示模式是否明文展示</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
    */
    @SerializedName("IsPlainTextInDemo")
    @Expose
    private Long IsPlainTextInDemo;

    /**
     * Get <p>子公司ID</p> 
     * @return EnterpriseUid <p>子公司ID</p>
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set <p>子公司ID</p>
     * @param EnterpriseUid <p>子公司ID</p>
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get <p>子公司名称</p> 
     * @return EnterpriseName <p>子公司名称</p>
     */
    public String getEnterpriseName() {
        return this.EnterpriseName;
    }

    /**
     * Set <p>子公司名称</p>
     * @param EnterpriseName <p>子公司名称</p>
     */
    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    /**
     * Get <p>主任务ID</p> 
     * @return JobId <p>主任务ID</p>
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>主任务ID</p>
     * @param JobId <p>主任务ID</p>
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>单任务ID</p> 
     * @return JobStageId <p>单任务ID</p>
     */
    public Long getJobStageId() {
        return this.JobStageId;
    }

    /**
     * Set <p>单任务ID</p>
     * @param JobStageId <p>单任务ID</p>
     */
    public void setJobStageId(Long JobStageId) {
        this.JobStageId = JobStageId;
    }

    /**
     * Get <p>是否忽略</p> 
     * @return Ignored <p>是否忽略</p>
     */
    public Boolean getIgnored() {
        return this.Ignored;
    }

    /**
     * Set <p>是否忽略</p>
     * @param Ignored <p>是否忽略</p>
     */
    public void setIgnored(Boolean Ignored) {
        this.Ignored = Ignored;
    }

    /**
     * Get <p>子任务ID</p> 
     * @return JobRecordId <p>子任务ID</p>
     */
    public Long getJobRecordId() {
        return this.JobRecordId;
    }

    /**
     * Set <p>子任务ID</p>
     * @param JobRecordId <p>子任务ID</p>
     */
    public void setJobRecordId(Long JobRecordId) {
        this.JobRecordId = JobRecordId;
    }

    /**
     * Get <p>企业ID</p> 
     * @return CustomerId <p>企业ID</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>企业ID</p>
     * @param CustomerId <p>企业ID</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get <p>企业名称</p> 
     * @return CustomerName <p>企业名称</p>
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set <p>企业名称</p>
     * @param CustomerName <p>企业名称</p>
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get <p>详情</p> 
     * @return Detail <p>详情</p>
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>详情</p>
     * @param Detail <p>详情</p>
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>Md5值</p> 
     * @return Md5 <p>Md5值</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>Md5值</p>
     * @param Md5 <p>Md5值</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateAt <p>创建时间</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateAt <p>创建时间</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateAt <p>更新时间</p>
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateAt <p>更新时间</p>
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get <p>标签列表，json格式：{"tag1":["责任人xxx"],"tag2":["测试站"]}</p> 
     * @return Labels <p>标签列表，json格式：{"tag1":["责任人xxx"],"tag2":["测试站"]}</p>
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签列表，json格式：{"tag1":["责任人xxx"],"tag2":["测试站"]}</p>
     * @param Labels <p>标签列表，json格式：{"tag1":["责任人xxx"],"tag2":["测试站"]}</p>
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>演示模式是否明文展示</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul> 
     * @return IsPlainTextInDemo <p>演示模式是否明文展示</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public Long getIsPlainTextInDemo() {
        return this.IsPlainTextInDemo;
    }

    /**
     * Set <p>演示模式是否明文展示</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     * @param IsPlainTextInDemo <p>演示模式是否明文展示</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public void setIsPlainTextInDemo(Long IsPlainTextInDemo) {
        this.IsPlainTextInDemo = IsPlainTextInDemo;
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
        if (source.IsPlainTextInDemo != null) {
            this.IsPlainTextInDemo = new Long(source.IsPlainTextInDemo);
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
        this.setParamSimple(map, prefix + "IsPlainTextInDemo", this.IsPlainTextInDemo);

    }
}

