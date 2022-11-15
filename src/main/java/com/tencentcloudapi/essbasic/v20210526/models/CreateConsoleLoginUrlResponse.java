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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsoleLoginUrlResponse extends AbstractModel{

    /**
    * 子客Web控制台url注意事项：
1. 所有类型的链接在企业未认证/员工未认证完成时，只要在有效期内（一年）都可以访问
2. 若企业认证完成且员工认证完成后，重新获取pc端的链接5分钟之内有效，且只能访问一次
3. 若企业认证完成且员工认证完成后，重新获取H5/APP的链接只要在有效期内（一年）都可以访问
4. 此链接仅单次有效，使用后需要再次创建新的链接（部分聊天软件，如企业微信默认会对链接进行解析，此时需要使用类似“代码片段”的方式或者放到txt文件里发送链接）
5. 创建的链接应避免被转义，如：&被转义为\u0026；如使用Postman请求后，请选择响应类型为 JSON，否则链接将被转义
    */
    @SerializedName("ConsoleUrl")
    @Expose
    private String ConsoleUrl;

    /**
    * 渠道子客企业是否已开通腾讯电子签
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * 当前经办人是否已认证（false:未认证 true:已认证）
    */
    @SerializedName("ProxyOperatorIsVerified")
    @Expose
    private Boolean ProxyOperatorIsVerified;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 子客Web控制台url注意事项：
1. 所有类型的链接在企业未认证/员工未认证完成时，只要在有效期内（一年）都可以访问
2. 若企业认证完成且员工认证完成后，重新获取pc端的链接5分钟之内有效，且只能访问一次
3. 若企业认证完成且员工认证完成后，重新获取H5/APP的链接只要在有效期内（一年）都可以访问
4. 此链接仅单次有效，使用后需要再次创建新的链接（部分聊天软件，如企业微信默认会对链接进行解析，此时需要使用类似“代码片段”的方式或者放到txt文件里发送链接）
5. 创建的链接应避免被转义，如：&被转义为\u0026；如使用Postman请求后，请选择响应类型为 JSON，否则链接将被转义 
     * @return ConsoleUrl 子客Web控制台url注意事项：
1. 所有类型的链接在企业未认证/员工未认证完成时，只要在有效期内（一年）都可以访问
2. 若企业认证完成且员工认证完成后，重新获取pc端的链接5分钟之内有效，且只能访问一次
3. 若企业认证完成且员工认证完成后，重新获取H5/APP的链接只要在有效期内（一年）都可以访问
4. 此链接仅单次有效，使用后需要再次创建新的链接（部分聊天软件，如企业微信默认会对链接进行解析，此时需要使用类似“代码片段”的方式或者放到txt文件里发送链接）
5. 创建的链接应避免被转义，如：&被转义为\u0026；如使用Postman请求后，请选择响应类型为 JSON，否则链接将被转义
     */
    public String getConsoleUrl() {
        return this.ConsoleUrl;
    }

    /**
     * Set 子客Web控制台url注意事项：
1. 所有类型的链接在企业未认证/员工未认证完成时，只要在有效期内（一年）都可以访问
2. 若企业认证完成且员工认证完成后，重新获取pc端的链接5分钟之内有效，且只能访问一次
3. 若企业认证完成且员工认证完成后，重新获取H5/APP的链接只要在有效期内（一年）都可以访问
4. 此链接仅单次有效，使用后需要再次创建新的链接（部分聊天软件，如企业微信默认会对链接进行解析，此时需要使用类似“代码片段”的方式或者放到txt文件里发送链接）
5. 创建的链接应避免被转义，如：&被转义为\u0026；如使用Postman请求后，请选择响应类型为 JSON，否则链接将被转义
     * @param ConsoleUrl 子客Web控制台url注意事项：
1. 所有类型的链接在企业未认证/员工未认证完成时，只要在有效期内（一年）都可以访问
2. 若企业认证完成且员工认证完成后，重新获取pc端的链接5分钟之内有效，且只能访问一次
3. 若企业认证完成且员工认证完成后，重新获取H5/APP的链接只要在有效期内（一年）都可以访问
4. 此链接仅单次有效，使用后需要再次创建新的链接（部分聊天软件，如企业微信默认会对链接进行解析，此时需要使用类似“代码片段”的方式或者放到txt文件里发送链接）
5. 创建的链接应避免被转义，如：&被转义为\u0026；如使用Postman请求后，请选择响应类型为 JSON，否则链接将被转义
     */
    public void setConsoleUrl(String ConsoleUrl) {
        this.ConsoleUrl = ConsoleUrl;
    }

    /**
     * Get 渠道子客企业是否已开通腾讯电子签 
     * @return IsActivated 渠道子客企业是否已开通腾讯电子签
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 渠道子客企业是否已开通腾讯电子签
     * @param IsActivated 渠道子客企业是否已开通腾讯电子签
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 当前经办人是否已认证（false:未认证 true:已认证） 
     * @return ProxyOperatorIsVerified 当前经办人是否已认证（false:未认证 true:已认证）
     */
    public Boolean getProxyOperatorIsVerified() {
        return this.ProxyOperatorIsVerified;
    }

    /**
     * Set 当前经办人是否已认证（false:未认证 true:已认证）
     * @param ProxyOperatorIsVerified 当前经办人是否已认证（false:未认证 true:已认证）
     */
    public void setProxyOperatorIsVerified(Boolean ProxyOperatorIsVerified) {
        this.ProxyOperatorIsVerified = ProxyOperatorIsVerified;
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

    public CreateConsoleLoginUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsoleLoginUrlResponse(CreateConsoleLoginUrlResponse source) {
        if (source.ConsoleUrl != null) {
            this.ConsoleUrl = new String(source.ConsoleUrl);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.ProxyOperatorIsVerified != null) {
            this.ProxyOperatorIsVerified = new Boolean(source.ProxyOperatorIsVerified);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleUrl", this.ConsoleUrl);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "ProxyOperatorIsVerified", this.ProxyOperatorIsVerified);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

