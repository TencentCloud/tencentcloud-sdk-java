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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplatesMetadata extends AbstractModel{

    /**
    * 创建时间
    */
    @SerializedName("CreatedTimestamp")
    @Expose
    private Long CreatedTimestamp;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板状态。1-审核中|0-已通过|2-拒绝|其它-不可用
    */
    @SerializedName("TemplateStatus")
    @Expose
    private Long TemplateStatus;

    /**
    * 模板ID
    */
    @SerializedName("TemplateID")
    @Expose
    private Long TemplateID;

    /**
    * 审核原因
    */
    @SerializedName("ReviewReason")
    @Expose
    private String ReviewReason;

    /**
     * Get 创建时间 
     * @return CreatedTimestamp 创建时间
     */
    public Long getCreatedTimestamp() {
        return this.CreatedTimestamp;
    }

    /**
     * Set 创建时间
     * @param CreatedTimestamp 创建时间
     */
    public void setCreatedTimestamp(Long CreatedTimestamp) {
        this.CreatedTimestamp = CreatedTimestamp;
    }

    /**
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板状态。1-审核中|0-已通过|2-拒绝|其它-不可用 
     * @return TemplateStatus 模板状态。1-审核中|0-已通过|2-拒绝|其它-不可用
     */
    public Long getTemplateStatus() {
        return this.TemplateStatus;
    }

    /**
     * Set 模板状态。1-审核中|0-已通过|2-拒绝|其它-不可用
     * @param TemplateStatus 模板状态。1-审核中|0-已通过|2-拒绝|其它-不可用
     */
    public void setTemplateStatus(Long TemplateStatus) {
        this.TemplateStatus = TemplateStatus;
    }

    /**
     * Get 模板ID 
     * @return TemplateID 模板ID
     */
    public Long getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set 模板ID
     * @param TemplateID 模板ID
     */
    public void setTemplateID(Long TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get 审核原因 
     * @return ReviewReason 审核原因
     */
    public String getReviewReason() {
        return this.ReviewReason;
    }

    /**
     * Set 审核原因
     * @param ReviewReason 审核原因
     */
    public void setReviewReason(String ReviewReason) {
        this.ReviewReason = ReviewReason;
    }

    public TemplatesMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplatesMetadata(TemplatesMetadata source) {
        if (source.CreatedTimestamp != null) {
            this.CreatedTimestamp = new Long(source.CreatedTimestamp);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateStatus != null) {
            this.TemplateStatus = new Long(source.TemplateStatus);
        }
        if (source.TemplateID != null) {
            this.TemplateID = new Long(source.TemplateID);
        }
        if (source.ReviewReason != null) {
            this.ReviewReason = new String(source.ReviewReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTimestamp", this.CreatedTimestamp);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateStatus", this.TemplateStatus);
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "ReviewReason", this.ReviewReason);

    }
}

