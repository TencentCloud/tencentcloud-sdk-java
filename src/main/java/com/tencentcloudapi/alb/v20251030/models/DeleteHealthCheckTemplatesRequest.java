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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteHealthCheckTemplatesRequest extends AbstractModel {

    /**
    * 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
    */
    @SerializedName("HealthCheckTemplateIds")
    @Expose
    private String [] HealthCheckTemplateIds;

    /**
    * 是否预览此次请求。
- **false**（默认）：发送普通请求，直接删除模板。
- **true**：发送预览请求，检查删除模板的参数、格式、业务限制等是否符合要求。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。 
     * @return HealthCheckTemplateIds 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
     */
    public String [] getHealthCheckTemplateIds() {
        return this.HealthCheckTemplateIds;
    }

    /**
     * Set 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
     * @param HealthCheckTemplateIds 健康检查模板 ID 列表，ID 格式为 hct- 后接字母数字。
     */
    public void setHealthCheckTemplateIds(String [] HealthCheckTemplateIds) {
        this.HealthCheckTemplateIds = HealthCheckTemplateIds;
    }

    /**
     * Get 是否预览此次请求。
- **false**（默认）：发送普通请求，直接删除模板。
- **true**：发送预览请求，检查删除模板的参数、格式、业务限制等是否符合要求。 
     * @return DryRun 是否预览此次请求。
- **false**（默认）：发送普通请求，直接删除模板。
- **true**：发送预览请求，检查删除模板的参数、格式、业务限制等是否符合要求。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否预览此次请求。
- **false**（默认）：发送普通请求，直接删除模板。
- **true**：发送预览请求，检查删除模板的参数、格式、业务限制等是否符合要求。
     * @param DryRun 是否预览此次请求。
- **false**（默认）：发送普通请求，直接删除模板。
- **true**：发送预览请求，检查删除模板的参数、格式、业务限制等是否符合要求。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteHealthCheckTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteHealthCheckTemplatesRequest(DeleteHealthCheckTemplatesRequest source) {
        if (source.HealthCheckTemplateIds != null) {
            this.HealthCheckTemplateIds = new String[source.HealthCheckTemplateIds.length];
            for (int i = 0; i < source.HealthCheckTemplateIds.length; i++) {
                this.HealthCheckTemplateIds[i] = new String(source.HealthCheckTemplateIds[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HealthCheckTemplateIds.", this.HealthCheckTemplateIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

