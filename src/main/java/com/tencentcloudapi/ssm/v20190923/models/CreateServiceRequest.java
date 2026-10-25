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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceRequest extends AbstractModel {

    /**
    * <p>仅支持 PostPay，区分大小写</p><p>枚举值：</p><ul><li>PostPay： 后付费 按量计费模式</li></ul><p>仅支持 PostPay，区分大小写</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>客户端生成的创建请求标识。同一次逻辑创建发生重试时，须使用相同的值。</p><p>参数格式：1～64 个可见 ASCII 字符（! 至 ~）。</p><p>入参限制：必填；不能含空格、中文或控制字符。建议使用 ssm-&lt;UUID&gt;，不要包含密钥或个人信息。</p><p>默认值：留空，由调用方生成；不要设置固定默认值。</p><p>SSM 将其透传给计费侧，不存储或返回。订单状态不明时先核单，再决定是否用原值重试。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>仅支持 PostPay，区分大小写</p><p>枚举值：</p><ul><li>PostPay： 后付费 按量计费模式</li></ul><p>仅支持 PostPay，区分大小写</p> 
     * @return PayMode <p>仅支持 PostPay，区分大小写</p><p>枚举值：</p><ul><li>PostPay： 后付费 按量计费模式</li></ul><p>仅支持 PostPay，区分大小写</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>仅支持 PostPay，区分大小写</p><p>枚举值：</p><ul><li>PostPay： 后付费 按量计费模式</li></ul><p>仅支持 PostPay，区分大小写</p>
     * @param PayMode <p>仅支持 PostPay，区分大小写</p><p>枚举值：</p><ul><li>PostPay： 后付费 按量计费模式</li></ul><p>仅支持 PostPay，区分大小写</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>客户端生成的创建请求标识。同一次逻辑创建发生重试时，须使用相同的值。</p><p>参数格式：1～64 个可见 ASCII 字符（! 至 ~）。</p><p>入参限制：必填；不能含空格、中文或控制字符。建议使用 ssm-&lt;UUID&gt;，不要包含密钥或个人信息。</p><p>默认值：留空，由调用方生成；不要设置固定默认值。</p><p>SSM 将其透传给计费侧，不存储或返回。订单状态不明时先核单，再决定是否用原值重试。</p> 
     * @return ClientToken <p>客户端生成的创建请求标识。同一次逻辑创建发生重试时，须使用相同的值。</p><p>参数格式：1～64 个可见 ASCII 字符（! 至 ~）。</p><p>入参限制：必填；不能含空格、中文或控制字符。建议使用 ssm-&lt;UUID&gt;，不要包含密钥或个人信息。</p><p>默认值：留空，由调用方生成；不要设置固定默认值。</p><p>SSM 将其透传给计费侧，不存储或返回。订单状态不明时先核单，再决定是否用原值重试。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>客户端生成的创建请求标识。同一次逻辑创建发生重试时，须使用相同的值。</p><p>参数格式：1～64 个可见 ASCII 字符（! 至 ~）。</p><p>入参限制：必填；不能含空格、中文或控制字符。建议使用 ssm-&lt;UUID&gt;，不要包含密钥或个人信息。</p><p>默认值：留空，由调用方生成；不要设置固定默认值。</p><p>SSM 将其透传给计费侧，不存储或返回。订单状态不明时先核单，再决定是否用原值重试。</p>
     * @param ClientToken <p>客户端生成的创建请求标识。同一次逻辑创建发生重试时，须使用相同的值。</p><p>参数格式：1～64 个可见 ASCII 字符（! 至 ~）。</p><p>入参限制：必填；不能含空格、中文或控制字符。建议使用 ssm-&lt;UUID&gt;，不要包含密钥或个人信息。</p><p>默认值：留空，由调用方生成；不要设置固定默认值。</p><p>SSM 将其透传给计费侧，不存储或返回。订单状态不明时先核单，再决定是否用原值重试。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceRequest(CreateServiceRequest source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

