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

public class UserInfo extends AbstractModel {

    /**
    * 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


注意:
1. OpenId在子客企业对应一个真实员工，**本应用唯一, 不可重复使用**，最大64位字符串
2. 可使用用户在贵方企业系统中的Userid或者hash值作为子客企业的员工OpenId
3. **员工加入企业后**, 可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录子客控制台后, 在**组织架构**模块查看员工们的OpenId, 样式如下图
![image](https://qcloudimg.tencent-cloud.cn/raw/bb67fb66c926759df3a0af5838fdafd5.png)
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 内部参数，暂未开放使用
    */
    @SerializedName("ProxyIp")
    @Expose
    private String ProxyIp;

    /**
     * Get 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


注意:
1. OpenId在子客企业对应一个真实员工，**本应用唯一, 不可重复使用**，最大64位字符串
2. 可使用用户在贵方企业系统中的Userid或者hash值作为子客企业的员工OpenId
3. **员工加入企业后**, 可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录子客控制台后, 在**组织架构**模块查看员工们的OpenId, 样式如下图
![image](https://qcloudimg.tencent-cloud.cn/raw/bb67fb66c926759df3a0af5838fdafd5.png) 
     * @return OpenId 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


注意:
1. OpenId在子客企业对应一个真实员工，**本应用唯一, 不可重复使用**，最大64位字符串
2. 可使用用户在贵方企业系统中的Userid或者hash值作为子客企业的员工OpenId
3. **员工加入企业后**, 可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录子客控制台后, 在**组织架构**模块查看员工们的OpenId, 样式如下图
![image](https://qcloudimg.tencent-cloud.cn/raw/bb67fb66c926759df3a0af5838fdafd5.png)
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


注意:
1. OpenId在子客企业对应一个真实员工，**本应用唯一, 不可重复使用**，最大64位字符串
2. 可使用用户在贵方企业系统中的Userid或者hash值作为子客企业的员工OpenId
3. **员工加入企业后**, 可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录子客控制台后, 在**组织架构**模块查看员工们的OpenId, 样式如下图
![image](https://qcloudimg.tencent-cloud.cn/raw/bb67fb66c926759df3a0af5838fdafd5.png)
     * @param OpenId 第三方应用平台自定义，对应第三方平台子客企业员工的唯一标识。


注意:
1. OpenId在子客企业对应一个真实员工，**本应用唯一, 不可重复使用**，最大64位字符串
2. 可使用用户在贵方企业系统中的Userid或者hash值作为子客企业的员工OpenId
3. **员工加入企业后**, 可以通过<a href="https://qian.tencent.com/developers/partnerApis/accounts/CreateConsoleLoginUrl" target="_blank">生成子客登录链接</a>登录子客控制台后, 在**组织架构**模块查看员工们的OpenId, 样式如下图
![image](https://qcloudimg.tencent-cloud.cn/raw/bb67fb66c926759df3a0af5838fdafd5.png)
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return Channel 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param Channel 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return CustomUserId 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param CustomUserId 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return ClientIp 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param ClientIp 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 内部参数，暂未开放使用 
     * @return ProxyIp 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public String getProxyIp() {
        return this.ProxyIp;
    }

    /**
     * Set 内部参数，暂未开放使用
     * @param ProxyIp 内部参数，暂未开放使用
     * @deprecated
     */
    @Deprecated
    public void setProxyIp(String ProxyIp) {
        this.ProxyIp = ProxyIp;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ProxyIp != null) {
            this.ProxyIp = new String(source.ProxyIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ProxyIp", this.ProxyIp);

    }
}

