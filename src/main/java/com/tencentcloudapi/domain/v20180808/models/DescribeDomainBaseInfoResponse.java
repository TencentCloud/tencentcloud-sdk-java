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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainBaseInfoResponse extends AbstractModel{

    /**
    * 域名信息
    */
    @SerializedName("DomainInfo")
    @Expose
    private DomainBaseInfo DomainInfo;

    /**
    * 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名信息 
     * @return DomainInfo 域名信息
     */
    public DomainBaseInfo getDomainInfo() {
        return this.DomainInfo;
    }

    /**
     * Set 域名信息
     * @param DomainInfo 域名信息
     */
    public void setDomainInfo(DomainBaseInfo DomainInfo) {
        this.DomainInfo = DomainInfo;
    }

    /**
     * Get 用户Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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

    public DescribeDomainBaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainBaseInfoResponse(DescribeDomainBaseInfoResponse source) {
        if (source.DomainInfo != null) {
            this.DomainInfo = new DomainBaseInfo(source.DomainInfo);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DomainInfo.", this.DomainInfo);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

