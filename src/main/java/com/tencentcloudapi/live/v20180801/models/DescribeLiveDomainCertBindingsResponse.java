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

public class DescribeLiveDomainCertBindingsResponse extends AbstractModel{

    /**
    * 有绑定证书的域名信息数组。
    */
    @SerializedName("LiveDomainCertBindings")
    @Expose
    private LiveDomainCertBindings [] LiveDomainCertBindings;

    /**
    * 总的记录行数，便于分页。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 有绑定证书的域名信息数组。 
     * @return LiveDomainCertBindings 有绑定证书的域名信息数组。
     */
    public LiveDomainCertBindings [] getLiveDomainCertBindings() {
        return this.LiveDomainCertBindings;
    }

    /**
     * Set 有绑定证书的域名信息数组。
     * @param LiveDomainCertBindings 有绑定证书的域名信息数组。
     */
    public void setLiveDomainCertBindings(LiveDomainCertBindings [] LiveDomainCertBindings) {
        this.LiveDomainCertBindings = LiveDomainCertBindings;
    }

    /**
     * Get 总的记录行数，便于分页。 
     * @return TotalNum 总的记录行数，便于分页。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总的记录行数，便于分页。
     * @param TotalNum 总的记录行数，便于分页。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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

    public DescribeLiveDomainCertBindingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainCertBindingsResponse(DescribeLiveDomainCertBindingsResponse source) {
        if (source.LiveDomainCertBindings != null) {
            this.LiveDomainCertBindings = new LiveDomainCertBindings[source.LiveDomainCertBindings.length];
            for (int i = 0; i < source.LiveDomainCertBindings.length; i++) {
                this.LiveDomainCertBindings[i] = new LiveDomainCertBindings(source.LiveDomainCertBindings[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LiveDomainCertBindings.", this.LiveDomainCertBindings);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

