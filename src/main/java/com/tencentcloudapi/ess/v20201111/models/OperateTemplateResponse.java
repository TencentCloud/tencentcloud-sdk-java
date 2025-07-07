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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateTemplateResponse extends AbstractModel {

    /**
    * 模板ID，为32位字符串，模板复制新建时返回
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名称，模板复制新建时返回
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板ID，为32位字符串，模板复制新建时返回 
     * @return TemplateId 模板ID，为32位字符串，模板复制新建时返回
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID，为32位字符串，模板复制新建时返回
     * @param TemplateId 模板ID，为32位字符串，模板复制新建时返回
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称，模板复制新建时返回 
     * @return TemplateName 模板名称，模板复制新建时返回
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称，模板复制新建时返回
     * @param TemplateName 模板名称，模板复制新建时返回
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public OperateTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateTemplateResponse(OperateTemplateResponse source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

