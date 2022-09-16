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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticateDomainOwnerResponse extends AbstractModel{

    /**
    * 验证内容。
VerifyType 传 dnsCheck 时，为要配的 TXT 记录值。
VerifyType 传 fileCheck 时，为文件内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 域名验证状态。
>=0 为已验证归属。
<0 未验证归属权。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * DomainName 对应的主域名。
同一主域名下的所有域名只需成功验证一次，后续均无需再验证。
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证内容。
VerifyType 传 dnsCheck 时，为要配的 TXT 记录值。
VerifyType 传 fileCheck 时，为文件内容。 
     * @return Content 验证内容。
VerifyType 传 dnsCheck 时，为要配的 TXT 记录值。
VerifyType 传 fileCheck 时，为文件内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 验证内容。
VerifyType 传 dnsCheck 时，为要配的 TXT 记录值。
VerifyType 传 fileCheck 时，为文件内容。
     * @param Content 验证内容。
VerifyType 传 dnsCheck 时，为要配的 TXT 记录值。
VerifyType 传 fileCheck 时，为文件内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 域名验证状态。
>=0 为已验证归属。
<0 未验证归属权。 
     * @return Status 域名验证状态。
>=0 为已验证归属。
<0 未验证归属权。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 域名验证状态。
>=0 为已验证归属。
<0 未验证归属权。
     * @param Status 域名验证状态。
>=0 为已验证归属。
<0 未验证归属权。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get DomainName 对应的主域名。
同一主域名下的所有域名只需成功验证一次，后续均无需再验证。 
     * @return MainDomain DomainName 对应的主域名。
同一主域名下的所有域名只需成功验证一次，后续均无需再验证。
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set DomainName 对应的主域名。
同一主域名下的所有域名只需成功验证一次，后续均无需再验证。
     * @param MainDomain DomainName 对应的主域名。
同一主域名下的所有域名只需成功验证一次，后续均无需再验证。
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
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

    public AuthenticateDomainOwnerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthenticateDomainOwnerResponse(AuthenticateDomainOwnerResponse source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

