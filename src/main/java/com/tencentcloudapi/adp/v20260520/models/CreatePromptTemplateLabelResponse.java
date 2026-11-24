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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePromptTemplateLabelResponse extends AbstractModel {

    /**
    * <p>提示词模板标签ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptTemplateLabelId")
    @Expose
    private String PromptTemplateLabelId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>提示词模板标签ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptTemplateLabelId <p>提示词模板标签ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromptTemplateLabelId() {
        return this.PromptTemplateLabelId;
    }

    /**
     * Set <p>提示词模板标签ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptTemplateLabelId <p>提示词模板标签ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptTemplateLabelId(String PromptTemplateLabelId) {
        this.PromptTemplateLabelId = PromptTemplateLabelId;
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

    public CreatePromptTemplateLabelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePromptTemplateLabelResponse(CreatePromptTemplateLabelResponse source) {
        if (source.PromptTemplateLabelId != null) {
            this.PromptTemplateLabelId = new String(source.PromptTemplateLabelId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptTemplateLabelId", this.PromptTemplateLabelId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

