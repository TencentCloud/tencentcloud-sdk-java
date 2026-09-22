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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditTemplateRequest extends AbstractModel {

    /**
    * <p>审核模板。</p>
    */
    @SerializedName("AuditTemplate")
    @Expose
    private AuditTemplate AuditTemplate;

    /**
     * Get <p>审核模板。</p> 
     * @return AuditTemplate <p>审核模板。</p>
     */
    public AuditTemplate getAuditTemplate() {
        return this.AuditTemplate;
    }

    /**
     * Set <p>审核模板。</p>
     * @param AuditTemplate <p>审核模板。</p>
     */
    public void setAuditTemplate(AuditTemplate AuditTemplate) {
        this.AuditTemplate = AuditTemplate;
    }

    public CreateAuditTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditTemplateRequest(CreateAuditTemplateRequest source) {
        if (source.AuditTemplate != null) {
            this.AuditTemplate = new AuditTemplate(source.AuditTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AuditTemplate.", this.AuditTemplate);

    }
}

