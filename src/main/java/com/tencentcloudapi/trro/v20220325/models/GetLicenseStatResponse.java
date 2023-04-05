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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLicenseStatResponse extends AbstractModel{

    /**
    * 有效授权
    */
    @SerializedName("Valid")
    @Expose
    private Long Valid;

    /**
    * 已绑定授权
    */
    @SerializedName("Bound")
    @Expose
    private Long Bound;

    /**
    * 未绑定授权
    */
    @SerializedName("UnBound")
    @Expose
    private Long UnBound;

    /**
    * 过期授权
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 有效授权 
     * @return Valid 有效授权
     */
    public Long getValid() {
        return this.Valid;
    }

    /**
     * Set 有效授权
     * @param Valid 有效授权
     */
    public void setValid(Long Valid) {
        this.Valid = Valid;
    }

    /**
     * Get 已绑定授权 
     * @return Bound 已绑定授权
     */
    public Long getBound() {
        return this.Bound;
    }

    /**
     * Set 已绑定授权
     * @param Bound 已绑定授权
     */
    public void setBound(Long Bound) {
        this.Bound = Bound;
    }

    /**
     * Get 未绑定授权 
     * @return UnBound 未绑定授权
     */
    public Long getUnBound() {
        return this.UnBound;
    }

    /**
     * Set 未绑定授权
     * @param UnBound 未绑定授权
     */
    public void setUnBound(Long UnBound) {
        this.UnBound = UnBound;
    }

    /**
     * Get 过期授权 
     * @return Expire 过期授权
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 过期授权
     * @param Expire 过期授权
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
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

    public GetLicenseStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLicenseStatResponse(GetLicenseStatResponse source) {
        if (source.Valid != null) {
            this.Valid = new Long(source.Valid);
        }
        if (source.Bound != null) {
            this.Bound = new Long(source.Bound);
        }
        if (source.UnBound != null) {
            this.UnBound = new Long(source.UnBound);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Valid", this.Valid);
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "UnBound", this.UnBound);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

