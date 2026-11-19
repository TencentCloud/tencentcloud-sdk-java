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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSecretValueResponse extends AbstractModel {

    /**
    * <p>凭据的名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>该凭据对应的版本号。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>在创建凭据(CreateSecret)时，如果指定的是二进制数据，则该字段为返回结果，并且使用base64进行编码，应用方需要进行base64解码后获取原始数据。<br>SecretBinary和SecretString只有一个不为空。</p>
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * <p>在创建凭据(CreateSecret)时，如果指定的是普通文本数据，则该字段为返回结果。<br>SecretBinary和SecretString只有一个不为空。</p>
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>凭据的名称。</p> 
     * @return SecretName <p>凭据的名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据的名称。</p>
     * @param SecretName <p>凭据的名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>该凭据对应的版本号。</p> 
     * @return VersionId <p>该凭据对应的版本号。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>该凭据对应的版本号。</p>
     * @param VersionId <p>该凭据对应的版本号。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>在创建凭据(CreateSecret)时，如果指定的是二进制数据，则该字段为返回结果，并且使用base64进行编码，应用方需要进行base64解码后获取原始数据。<br>SecretBinary和SecretString只有一个不为空。</p> 
     * @return SecretBinary <p>在创建凭据(CreateSecret)时，如果指定的是二进制数据，则该字段为返回结果，并且使用base64进行编码，应用方需要进行base64解码后获取原始数据。<br>SecretBinary和SecretString只有一个不为空。</p>
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set <p>在创建凭据(CreateSecret)时，如果指定的是二进制数据，则该字段为返回结果，并且使用base64进行编码，应用方需要进行base64解码后获取原始数据。<br>SecretBinary和SecretString只有一个不为空。</p>
     * @param SecretBinary <p>在创建凭据(CreateSecret)时，如果指定的是二进制数据，则该字段为返回结果，并且使用base64进行编码，应用方需要进行base64解码后获取原始数据。<br>SecretBinary和SecretString只有一个不为空。</p>
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get <p>在创建凭据(CreateSecret)时，如果指定的是普通文本数据，则该字段为返回结果。<br>SecretBinary和SecretString只有一个不为空。</p> 
     * @return SecretString <p>在创建凭据(CreateSecret)时，如果指定的是普通文本数据，则该字段为返回结果。<br>SecretBinary和SecretString只有一个不为空。</p>
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set <p>在创建凭据(CreateSecret)时，如果指定的是普通文本数据，则该字段为返回结果。<br>SecretBinary和SecretString只有一个不为空。</p>
     * @param SecretString <p>在创建凭据(CreateSecret)时，如果指定的是普通文本数据，则该字段为返回结果。<br>SecretBinary和SecretString只有一个不为空。</p>
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
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

    public GetSecretValueResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSecretValueResponse(GetSecretValueResponse source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.SecretBinary != null) {
            this.SecretBinary = new String(source.SecretBinary);
        }
        if (source.SecretString != null) {
            this.SecretString = new String(source.SecretString);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

