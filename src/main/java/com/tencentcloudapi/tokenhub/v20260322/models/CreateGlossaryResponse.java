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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGlossaryResponse extends AbstractModel {

    /**
    * 术语库 ID。
    */
    @SerializedName("GlossaryId")
    @Expose
    private String GlossaryId;

    /**
    * 术语库名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建时间。Unix 时间戳（毫秒）。
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 术语库 ID。 
     * @return GlossaryId 术语库 ID。
     */
    public String getGlossaryId() {
        return this.GlossaryId;
    }

    /**
     * Set 术语库 ID。
     * @param GlossaryId 术语库 ID。
     */
    public void setGlossaryId(String GlossaryId) {
        this.GlossaryId = GlossaryId;
    }

    /**
     * Get 术语库名称。 
     * @return Name 术语库名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 术语库名称。
     * @param Name 术语库名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建时间。Unix 时间戳（毫秒）。 
     * @return CreatedAt 创建时间。Unix 时间戳（毫秒）。
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间。Unix 时间戳（毫秒）。
     * @param CreatedAt 创建时间。Unix 时间戳（毫秒）。
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
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

    public CreateGlossaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlossaryResponse(CreateGlossaryResponse source) {
        if (source.GlossaryId != null) {
            this.GlossaryId = new String(source.GlossaryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlossaryId", this.GlossaryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

