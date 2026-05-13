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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleForAllocatedEnvResponse extends AbstractModel {

    /**
    * <p>SecretId</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>SecretKey</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>Token值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>过期时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * <p>是否从缓存中加载。标明该值是否实时从sts服务获取，还是从缓存中获取。调用方可不关心</p>
    */
    @SerializedName("IsCache")
    @Expose
    private Boolean IsCache;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>SecretId</p> 
     * @return SecretId <p>SecretId</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>SecretId</p>
     * @param SecretId <p>SecretId</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>SecretKey</p> 
     * @return SecretKey <p>SecretKey</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>SecretKey</p>
     * @param SecretKey <p>SecretKey</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>Token值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token <p>Token值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>Token值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token <p>Token值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>过期时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime <p>过期时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>过期时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime <p>过期时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>是否从缓存中加载。标明该值是否实时从sts服务获取，还是从缓存中获取。调用方可不关心</p> 
     * @return IsCache <p>是否从缓存中加载。标明该值是否实时从sts服务获取，还是从缓存中获取。调用方可不关心</p>
     */
    public Boolean getIsCache() {
        return this.IsCache;
    }

    /**
     * Set <p>是否从缓存中加载。标明该值是否实时从sts服务获取，还是从缓存中获取。调用方可不关心</p>
     * @param IsCache <p>是否从缓存中加载。标明该值是否实时从sts服务获取，还是从缓存中获取。调用方可不关心</p>
     */
    public void setIsCache(Boolean IsCache) {
        this.IsCache = IsCache;
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

    public AssumeRoleForAllocatedEnvResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleForAllocatedEnvResponse(AssumeRoleForAllocatedEnvResponse source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.IsCache != null) {
            this.IsCache = new Boolean(source.IsCache);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IsCache", this.IsCache);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

