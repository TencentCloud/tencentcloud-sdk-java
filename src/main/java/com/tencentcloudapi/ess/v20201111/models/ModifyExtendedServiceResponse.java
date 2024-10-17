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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyExtendedServiceResponse extends AbstractModel {

    /**
    * 操作跳转链接
<ul>
<li><strong>有效期：</strong> 跳转链接的有效期为24小时。</li>
<li><strong>无跳转链接返回的情况：</strong> 如果在操作过程中没有返回跳转链接，这意味着无需进行跳转操作。在这种情况下，服务将会直接被开通或关闭。
<li><strong>有跳转链接返回的情况：</strong> 当操作类型为“OPEN”（开通服务），并且扩展服务类型为以下之一时，  系统将返回一个操作链接。当前操作人（超级管理员或法人）需要点击此链接，以完成服务的开通操作。

<ul>
<li><strong>OPEN_SERVER_SIGN</strong>（企业自动签署）</li>
<li><strong>OVERSEA_SIGN</strong>（企业与港澳台居民签署合同）</li>
</ul></li></li>
</ul>
    */
    @SerializedName("OperateUrl")
    @Expose
    private String OperateUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作跳转链接
<ul>
<li><strong>有效期：</strong> 跳转链接的有效期为24小时。</li>
<li><strong>无跳转链接返回的情况：</strong> 如果在操作过程中没有返回跳转链接，这意味着无需进行跳转操作。在这种情况下，服务将会直接被开通或关闭。
<li><strong>有跳转链接返回的情况：</strong> 当操作类型为“OPEN”（开通服务），并且扩展服务类型为以下之一时，  系统将返回一个操作链接。当前操作人（超级管理员或法人）需要点击此链接，以完成服务的开通操作。

<ul>
<li><strong>OPEN_SERVER_SIGN</strong>（企业自动签署）</li>
<li><strong>OVERSEA_SIGN</strong>（企业与港澳台居民签署合同）</li>
</ul></li></li>
</ul> 
     * @return OperateUrl 操作跳转链接
<ul>
<li><strong>有效期：</strong> 跳转链接的有效期为24小时。</li>
<li><strong>无跳转链接返回的情况：</strong> 如果在操作过程中没有返回跳转链接，这意味着无需进行跳转操作。在这种情况下，服务将会直接被开通或关闭。
<li><strong>有跳转链接返回的情况：</strong> 当操作类型为“OPEN”（开通服务），并且扩展服务类型为以下之一时，  系统将返回一个操作链接。当前操作人（超级管理员或法人）需要点击此链接，以完成服务的开通操作。

<ul>
<li><strong>OPEN_SERVER_SIGN</strong>（企业自动签署）</li>
<li><strong>OVERSEA_SIGN</strong>（企业与港澳台居民签署合同）</li>
</ul></li></li>
</ul>
     */
    public String getOperateUrl() {
        return this.OperateUrl;
    }

    /**
     * Set 操作跳转链接
<ul>
<li><strong>有效期：</strong> 跳转链接的有效期为24小时。</li>
<li><strong>无跳转链接返回的情况：</strong> 如果在操作过程中没有返回跳转链接，这意味着无需进行跳转操作。在这种情况下，服务将会直接被开通或关闭。
<li><strong>有跳转链接返回的情况：</strong> 当操作类型为“OPEN”（开通服务），并且扩展服务类型为以下之一时，  系统将返回一个操作链接。当前操作人（超级管理员或法人）需要点击此链接，以完成服务的开通操作。

<ul>
<li><strong>OPEN_SERVER_SIGN</strong>（企业自动签署）</li>
<li><strong>OVERSEA_SIGN</strong>（企业与港澳台居民签署合同）</li>
</ul></li></li>
</ul>
     * @param OperateUrl 操作跳转链接
<ul>
<li><strong>有效期：</strong> 跳转链接的有效期为24小时。</li>
<li><strong>无跳转链接返回的情况：</strong> 如果在操作过程中没有返回跳转链接，这意味着无需进行跳转操作。在这种情况下，服务将会直接被开通或关闭。
<li><strong>有跳转链接返回的情况：</strong> 当操作类型为“OPEN”（开通服务），并且扩展服务类型为以下之一时，  系统将返回一个操作链接。当前操作人（超级管理员或法人）需要点击此链接，以完成服务的开通操作。

<ul>
<li><strong>OPEN_SERVER_SIGN</strong>（企业自动签署）</li>
<li><strong>OVERSEA_SIGN</strong>（企业与港澳台居民签署合同）</li>
</ul></li></li>
</ul>
     */
    public void setOperateUrl(String OperateUrl) {
        this.OperateUrl = OperateUrl;
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

    public ModifyExtendedServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExtendedServiceResponse(ModifyExtendedServiceResponse source) {
        if (source.OperateUrl != null) {
            this.OperateUrl = new String(source.OperateUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperateUrl", this.OperateUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

