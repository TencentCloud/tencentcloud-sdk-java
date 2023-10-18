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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopAttackDomainResponse extends AbstractModel{

    /**
    * CC攻击域名列表
    */
    @SerializedName("CC")
    @Expose
    private KVInt [] CC;

    /**
    * Web攻击域名列表
    */
    @SerializedName("Web")
    @Expose
    private KVInt [] Web;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CC攻击域名列表 
     * @return CC CC攻击域名列表
     */
    public KVInt [] getCC() {
        return this.CC;
    }

    /**
     * Set CC攻击域名列表
     * @param CC CC攻击域名列表
     */
    public void setCC(KVInt [] CC) {
        this.CC = CC;
    }

    /**
     * Get Web攻击域名列表 
     * @return Web Web攻击域名列表
     */
    public KVInt [] getWeb() {
        return this.Web;
    }

    /**
     * Set Web攻击域名列表
     * @param Web Web攻击域名列表
     */
    public void setWeb(KVInt [] Web) {
        this.Web = Web;
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

    public DescribeTopAttackDomainResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopAttackDomainResponse(DescribeTopAttackDomainResponse source) {
        if (source.CC != null) {
            this.CC = new KVInt[source.CC.length];
            for (int i = 0; i < source.CC.length; i++) {
                this.CC[i] = new KVInt(source.CC[i]);
            }
        }
        if (source.Web != null) {
            this.Web = new KVInt[source.Web.length];
            for (int i = 0; i < source.Web.length; i++) {
                this.Web[i] = new KVInt(source.Web[i]);
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
        this.setParamArrayObj(map, prefix + "CC.", this.CC);
        this.setParamArrayObj(map, prefix + "Web.", this.Web);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

