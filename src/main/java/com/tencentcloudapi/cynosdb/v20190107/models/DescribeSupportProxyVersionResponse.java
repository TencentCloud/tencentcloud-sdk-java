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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupportProxyVersionResponse extends AbstractModel {

    /**
    * <p>支持的数据库代理版本集合</p>
    */
    @SerializedName("SupportProxyVersions")
    @Expose
    private String [] SupportProxyVersions;

    /**
    * <p>当前proxy版本号</p>
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * <p>代理版本详情</p>
    */
    @SerializedName("SupportProxyVersionDetail")
    @Expose
    private ProxyVersionInfo [] SupportProxyVersionDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>支持的数据库代理版本集合</p> 
     * @return SupportProxyVersions <p>支持的数据库代理版本集合</p>
     */
    public String [] getSupportProxyVersions() {
        return this.SupportProxyVersions;
    }

    /**
     * Set <p>支持的数据库代理版本集合</p>
     * @param SupportProxyVersions <p>支持的数据库代理版本集合</p>
     */
    public void setSupportProxyVersions(String [] SupportProxyVersions) {
        this.SupportProxyVersions = SupportProxyVersions;
    }

    /**
     * Get <p>当前proxy版本号</p> 
     * @return CurrentProxyVersion <p>当前proxy版本号</p>
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set <p>当前proxy版本号</p>
     * @param CurrentProxyVersion <p>当前proxy版本号</p>
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get <p>代理版本详情</p> 
     * @return SupportProxyVersionDetail <p>代理版本详情</p>
     */
    public ProxyVersionInfo [] getSupportProxyVersionDetail() {
        return this.SupportProxyVersionDetail;
    }

    /**
     * Set <p>代理版本详情</p>
     * @param SupportProxyVersionDetail <p>代理版本详情</p>
     */
    public void setSupportProxyVersionDetail(ProxyVersionInfo [] SupportProxyVersionDetail) {
        this.SupportProxyVersionDetail = SupportProxyVersionDetail;
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

    public DescribeSupportProxyVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupportProxyVersionResponse(DescribeSupportProxyVersionResponse source) {
        if (source.SupportProxyVersions != null) {
            this.SupportProxyVersions = new String[source.SupportProxyVersions.length];
            for (int i = 0; i < source.SupportProxyVersions.length; i++) {
                this.SupportProxyVersions[i] = new String(source.SupportProxyVersions[i]);
            }
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.SupportProxyVersionDetail != null) {
            this.SupportProxyVersionDetail = new ProxyVersionInfo[source.SupportProxyVersionDetail.length];
            for (int i = 0; i < source.SupportProxyVersionDetail.length; i++) {
                this.SupportProxyVersionDetail[i] = new ProxyVersionInfo(source.SupportProxyVersionDetail[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SupportProxyVersions.", this.SupportProxyVersions);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamArrayObj(map, prefix + "SupportProxyVersionDetail.", this.SupportProxyVersionDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

