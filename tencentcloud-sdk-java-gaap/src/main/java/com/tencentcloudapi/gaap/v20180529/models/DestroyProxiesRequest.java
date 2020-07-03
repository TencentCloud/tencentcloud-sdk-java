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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestroyProxiesRequest extends AbstractModel{

    /**
    * 强制删除标识。
1，强制删除该通道列表，无论是否已经绑定了源站；
0，如果已绑定了源站，则无法删除。
删除多通道时，如果该标识为0，只有所有的通道都没有绑定源站，才允许删除。
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
    * （旧参数，请切换到ProxyIds）通道实例ID列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * （新参数）通道实例ID列表。
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
     * Get 强制删除标识。
1，强制删除该通道列表，无论是否已经绑定了源站；
0，如果已绑定了源站，则无法删除。
删除多通道时，如果该标识为0，只有所有的通道都没有绑定源站，才允许删除。 
     * @return Force 强制删除标识。
1，强制删除该通道列表，无论是否已经绑定了源站；
0，如果已绑定了源站，则无法删除。
删除多通道时，如果该标识为0，只有所有的通道都没有绑定源站，才允许删除。
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 强制删除标识。
1，强制删除该通道列表，无论是否已经绑定了源站；
0，如果已绑定了源站，则无法删除。
删除多通道时，如果该标识为0，只有所有的通道都没有绑定源站，才允许删除。
     * @param Force 强制删除标识。
1，强制删除该通道列表，无论是否已经绑定了源站；
0，如果已绑定了源站，则无法删除。
删除多通道时，如果该标识为0，只有所有的通道都没有绑定源站，才允许删除。
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Get （旧参数，请切换到ProxyIds）通道实例ID列表。 
     * @return InstanceIds （旧参数，请切换到ProxyIds）通道实例ID列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set （旧参数，请切换到ProxyIds）通道实例ID列表。
     * @param InstanceIds （旧参数，请切换到ProxyIds）通道实例ID列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get （新参数）通道实例ID列表。 
     * @return ProxyIds （新参数）通道实例ID列表。
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set （新参数）通道实例ID列表。
     * @param ProxyIds （新参数）通道实例ID列表。
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);

    }
}

