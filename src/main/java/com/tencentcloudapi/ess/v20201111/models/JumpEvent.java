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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JumpEvent extends AbstractModel {

    /**
    * 跳转事件枚举，
* 1 - 企业收录。
* 2 - 超管授权书审核。
* 3 - 认证完成。
    */
    @SerializedName("JumpEventType")
    @Expose
    private Long JumpEventType;

    /**
    * 为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。
Endpoint如果是APP 类型，请传递<font color="red">"true"</font>
如果 Endpoint 是 H5 类型，请参考文档[跳转电子签H5](https://qian.tencent.com/developers/company/openqianh5/)

p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get 跳转事件枚举，
* 1 - 企业收录。
* 2 - 超管授权书审核。
* 3 - 认证完成。 
     * @return JumpEventType 跳转事件枚举，
* 1 - 企业收录。
* 2 - 超管授权书审核。
* 3 - 认证完成。
     */
    public Long getJumpEventType() {
        return this.JumpEventType;
    }

    /**
     * Set 跳转事件枚举，
* 1 - 企业收录。
* 2 - 超管授权书审核。
* 3 - 认证完成。
     * @param JumpEventType 跳转事件枚举，
* 1 - 企业收录。
* 2 - 超管授权书审核。
* 3 - 认证完成。
     */
    public void setJumpEventType(Long JumpEventType) {
        this.JumpEventType = JumpEventType;
    }

    /**
     * Get 为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。
Endpoint如果是APP 类型，请传递<font color="red">"true"</font>
如果 Endpoint 是 H5 类型，请参考文档[跳转电子签H5](https://qian.tencent.com/developers/company/openqianh5/)

p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。 
     * @return JumpUrl 为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。
Endpoint如果是APP 类型，请传递<font color="red">"true"</font>
如果 Endpoint 是 H5 类型，请参考文档[跳转电子签H5](https://qian.tencent.com/developers/company/openqianh5/)

p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。
Endpoint如果是APP 类型，请传递<font color="red">"true"</font>
如果 Endpoint 是 H5 类型，请参考文档[跳转电子签H5](https://qian.tencent.com/developers/company/openqianh5/)

p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。
     * @param JumpUrl 为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。
Endpoint如果是APP 类型，请传递<font color="red">"true"</font>
如果 Endpoint 是 H5 类型，请参考文档[跳转电子签H5](https://qian.tencent.com/developers/company/openqianh5/)

p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public JumpEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JumpEvent(JumpEvent source) {
        if (source.JumpEventType != null) {
            this.JumpEventType = new Long(source.JumpEventType);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JumpEventType", this.JumpEventType);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

