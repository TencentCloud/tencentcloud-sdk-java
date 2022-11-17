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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterCptResponse extends AbstractModel{

    /**
    * 凭证模板索引
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 凭证模板id
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 凭证模板索引 
     * @return Id 凭证模板索引
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 凭证模板索引
     * @param Id 凭证模板索引
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 凭证模板id 
     * @return CptId 凭证模板id
     */
    public Long getCptId() {
        return this.CptId;
    }

    /**
     * Set 凭证模板id
     * @param CptId 凭证模板id
     */
    public void setCptId(Long CptId) {
        this.CptId = CptId;
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

    public RegisterCptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterCptResponse(RegisterCptResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

