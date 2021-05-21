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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainShareInfoResponse extends AbstractModel{

    /**
    * 域名共享信息
    */
    @SerializedName("ShareList")
    @Expose
    private DomainShareInfo [] ShareList;

    /**
    * 域名拥有者账号
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名共享信息 
     * @return ShareList 域名共享信息
     */
    public DomainShareInfo [] getShareList() {
        return this.ShareList;
    }

    /**
     * Set 域名共享信息
     * @param ShareList 域名共享信息
     */
    public void setShareList(DomainShareInfo [] ShareList) {
        this.ShareList = ShareList;
    }

    /**
     * Get 域名拥有者账号 
     * @return Owner 域名拥有者账号
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 域名拥有者账号
     * @param Owner 域名拥有者账号
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
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

    public DescribeDomainShareInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainShareInfoResponse(DescribeDomainShareInfoResponse source) {
        if (source.ShareList != null) {
            this.ShareList = new DomainShareInfo[source.ShareList.length];
            for (int i = 0; i < source.ShareList.length; i++) {
                this.ShareList[i] = new DomainShareInfo(source.ShareList[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ShareList.", this.ShareList);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

