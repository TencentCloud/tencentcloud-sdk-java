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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LbRsItem extends AbstractModel {

    /**
    * vpc的字符串id，只支持字符串id。
可以通过 [DescribeVpcs](https://cloud.tencent.com/document/api/215/15778) 接口查询。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 需要查询后端的内网 IP，可以是 CVM 和弹性网卡。
可以通过 [DescribeAddresses](https://cloud.tencent.com/document/product/215/16702) 接口查询。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
     * Get vpc的字符串id，只支持字符串id。
可以通过 [DescribeVpcs](https://cloud.tencent.com/document/api/215/15778) 接口查询。 
     * @return VpcId vpc的字符串id，只支持字符串id。
可以通过 [DescribeVpcs](https://cloud.tencent.com/document/api/215/15778) 接口查询。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的字符串id，只支持字符串id。
可以通过 [DescribeVpcs](https://cloud.tencent.com/document/api/215/15778) 接口查询。
     * @param VpcId vpc的字符串id，只支持字符串id。
可以通过 [DescribeVpcs](https://cloud.tencent.com/document/api/215/15778) 接口查询。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 需要查询后端的内网 IP，可以是 CVM 和弹性网卡。
可以通过 [DescribeAddresses](https://cloud.tencent.com/document/product/215/16702) 接口查询。 
     * @return PrivateIp 需要查询后端的内网 IP，可以是 CVM 和弹性网卡。
可以通过 [DescribeAddresses](https://cloud.tencent.com/document/product/215/16702) 接口查询。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 需要查询后端的内网 IP，可以是 CVM 和弹性网卡。
可以通过 [DescribeAddresses](https://cloud.tencent.com/document/product/215/16702) 接口查询。
     * @param PrivateIp 需要查询后端的内网 IP，可以是 CVM 和弹性网卡。
可以通过 [DescribeAddresses](https://cloud.tencent.com/document/product/215/16702) 接口查询。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    public LbRsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LbRsItem(LbRsItem source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);

    }
}

