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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiPathGatewayOriginACLInfo extends AbstractModel {

    /**
    * 当前生效的回源 IP 网段。
    */
    @SerializedName("MultiPathGatewayCurrentOriginACL")
    @Expose
    private MultiPathGatewayCurrentOriginACL MultiPathGatewayCurrentOriginACL;

    /**
    * 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新时该字段为空。
    */
    @SerializedName("MultiPathGatewayNextOriginACL")
    @Expose
    private MultiPathGatewayNextOriginACL MultiPathGatewayNextOriginACL;

    /**
     * Get 当前生效的回源 IP 网段。 
     * @return MultiPathGatewayCurrentOriginACL 当前生效的回源 IP 网段。
     */
    public MultiPathGatewayCurrentOriginACL getMultiPathGatewayCurrentOriginACL() {
        return this.MultiPathGatewayCurrentOriginACL;
    }

    /**
     * Set 当前生效的回源 IP 网段。
     * @param MultiPathGatewayCurrentOriginACL 当前生效的回源 IP 网段。
     */
    public void setMultiPathGatewayCurrentOriginACL(MultiPathGatewayCurrentOriginACL MultiPathGatewayCurrentOriginACL) {
        this.MultiPathGatewayCurrentOriginACL = MultiPathGatewayCurrentOriginACL;
    }

    /**
     * Get 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新时该字段为空。 
     * @return MultiPathGatewayNextOriginACL 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新时该字段为空。
     */
    public MultiPathGatewayNextOriginACL getMultiPathGatewayNextOriginACL() {
        return this.MultiPathGatewayNextOriginACL;
    }

    /**
     * Set 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新时该字段为空。
     * @param MultiPathGatewayNextOriginACL 当回源 IP 网段发生更新时，该字段会返回下一个版本将要生效的回源 IP 网段，包含与当前回源 IP 网段的对比。无更新时该字段为空。
     */
    public void setMultiPathGatewayNextOriginACL(MultiPathGatewayNextOriginACL MultiPathGatewayNextOriginACL) {
        this.MultiPathGatewayNextOriginACL = MultiPathGatewayNextOriginACL;
    }

    public MultiPathGatewayOriginACLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayOriginACLInfo(MultiPathGatewayOriginACLInfo source) {
        if (source.MultiPathGatewayCurrentOriginACL != null) {
            this.MultiPathGatewayCurrentOriginACL = new MultiPathGatewayCurrentOriginACL(source.MultiPathGatewayCurrentOriginACL);
        }
        if (source.MultiPathGatewayNextOriginACL != null) {
            this.MultiPathGatewayNextOriginACL = new MultiPathGatewayNextOriginACL(source.MultiPathGatewayNextOriginACL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MultiPathGatewayCurrentOriginACL.", this.MultiPathGatewayCurrentOriginACL);
        this.setParamObj(map, prefix + "MultiPathGatewayNextOriginACL.", this.MultiPathGatewayNextOriginACL);

    }
}

