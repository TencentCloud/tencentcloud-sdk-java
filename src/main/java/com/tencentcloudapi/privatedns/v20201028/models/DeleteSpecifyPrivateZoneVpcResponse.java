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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSpecifyPrivateZoneVpcResponse extends AbstractModel {

    /**
    * 私有域id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 本次删除的VPC
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * 本次删除的关联账户的VPC
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfo [] AccountVpcSet;

    /**
    * 唯一id
    */
    @SerializedName("UniqId")
    @Expose
    private String UniqId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 私有域id 
     * @return ZoneId 私有域id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域id
     * @param ZoneId 私有域id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 本次删除的VPC 
     * @return VpcSet 本次删除的VPC
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set 本次删除的VPC
     * @param VpcSet 本次删除的VPC
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get 本次删除的关联账户的VPC 
     * @return AccountVpcSet 本次删除的关联账户的VPC
     */
    public AccountVpcInfo [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set 本次删除的关联账户的VPC
     * @param AccountVpcSet 本次删除的关联账户的VPC
     */
    public void setAccountVpcSet(AccountVpcInfo [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    /**
     * Get 唯一id 
     * @return UniqId 唯一id
     */
    public String getUniqId() {
        return this.UniqId;
    }

    /**
     * Set 唯一id
     * @param UniqId 唯一id
     */
    public void setUniqId(String UniqId) {
        this.UniqId = UniqId;
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

    public DeleteSpecifyPrivateZoneVpcResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSpecifyPrivateZoneVpcResponse(DeleteSpecifyPrivateZoneVpcResponse source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfo[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfo(source.AccountVpcSet[i]);
            }
        }
        if (source.UniqId != null) {
            this.UniqId = new String(source.UniqId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);
        this.setParamSimple(map, prefix + "UniqId", this.UniqId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

