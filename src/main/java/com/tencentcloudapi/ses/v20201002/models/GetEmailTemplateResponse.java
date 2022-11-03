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

public class GetEmailTemplateResponse extends AbstractModel{

    /**
    * 模板内容数据
    */
    @SerializedName("TemplateContent")
    @Expose
    private TemplateContent TemplateContent;

    /**
    * 模板状态 0-审核通过 1-待审核 2-审核拒绝
    */
    @SerializedName("TemplateStatus")
    @Expose
    private Long TemplateStatus;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板内容数据 
     * @return TemplateContent 模板内容数据
     */
    public TemplateContent getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set 模板内容数据
     * @param TemplateContent 模板内容数据
     */
    public void setTemplateContent(TemplateContent TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get 模板状态 0-审核通过 1-待审核 2-审核拒绝 
     * @return TemplateStatus 模板状态 0-审核通过 1-待审核 2-审核拒绝
     */
    public Long getTemplateStatus() {
        return this.TemplateStatus;
    }

    /**
     * Set 模板状态 0-审核通过 1-待审核 2-审核拒绝
     * @param TemplateStatus 模板状态 0-审核通过 1-待审核 2-审核拒绝
     */
    public void setTemplateStatus(Long TemplateStatus) {
        this.TemplateStatus = TemplateStatus;
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetEmailTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmailTemplateResponse(GetEmailTemplateResponse source) {
        if (source.TemplateContent != null) {
            this.TemplateContent = new TemplateContent(source.TemplateContent);
        }
        if (source.TemplateStatus != null) {
            this.TemplateStatus = new Long(source.TemplateStatus);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TemplateContent.", this.TemplateContent);
        this.setParamSimple(map, prefix + "TemplateStatus", this.TemplateStatus);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

