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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JumpEvent extends AbstractModel {

    /**
    * <p>跳转事件枚举</p><p>枚举值：</p><ul><li>1： 企业收录</li><li>2： 超管授权书审核</li><li>3： 企业认证完成</li><li>4： 员工加入完成</li></ul>
    */
    @SerializedName("JumpEventType")
    @Expose
    private Long JumpEventType;

    /**
    * <p>为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。<br>Endpoint如果是APP 类型，请传递<font color="red">&quot;true&quot;</font><br>如果 Endpoint 是 H5 类型，请参考文档<a href="https://qian.tencent.com/developers/partner/openqianh5">跳转电子签H5</a><br>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get <p>跳转事件枚举</p><p>枚举值：</p><ul><li>1： 企业收录</li><li>2： 超管授权书审核</li><li>3： 企业认证完成</li><li>4： 员工加入完成</li></ul> 
     * @return JumpEventType <p>跳转事件枚举</p><p>枚举值：</p><ul><li>1： 企业收录</li><li>2： 超管授权书审核</li><li>3： 企业认证完成</li><li>4： 员工加入完成</li></ul>
     */
    public Long getJumpEventType() {
        return this.JumpEventType;
    }

    /**
     * Set <p>跳转事件枚举</p><p>枚举值：</p><ul><li>1： 企业收录</li><li>2： 超管授权书审核</li><li>3： 企业认证完成</li><li>4： 员工加入完成</li></ul>
     * @param JumpEventType <p>跳转事件枚举</p><p>枚举值：</p><ul><li>1： 企业收录</li><li>2： 超管授权书审核</li><li>3： 企业认证完成</li><li>4： 员工加入完成</li></ul>
     */
    public void setJumpEventType(Long JumpEventType) {
        this.JumpEventType = JumpEventType;
    }

    /**
     * Get <p>为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。<br>Endpoint如果是APP 类型，请传递<font color="red">&quot;true&quot;</font><br>如果 Endpoint 是 H5 类型，请参考文档<a href="https://qian.tencent.com/developers/partner/openqianh5">跳转电子签H5</a><br>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p> 
     * @return JumpUrl <p>为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。<br>Endpoint如果是APP 类型，请传递<font color="red">&quot;true&quot;</font><br>如果 Endpoint 是 H5 类型，请参考文档<a href="https://qian.tencent.com/developers/partner/openqianh5">跳转电子签H5</a><br>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set <p>为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。<br>Endpoint如果是APP 类型，请传递<font color="red">&quot;true&quot;</font><br>如果 Endpoint 是 H5 类型，请参考文档<a href="https://qian.tencent.com/developers/partner/openqianh5">跳转电子签H5</a><br>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
     * @param JumpUrl <p>为认证成功后页面进行回跳的URL，请确保回跳地址的可用性。<br>Endpoint如果是APP 类型，请传递<font color="red">&quot;true&quot;</font><br>如果 Endpoint 是 H5 类型，请参考文档<a href="https://qian.tencent.com/developers/partner/openqianh5">跳转电子签H5</a><br>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
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

