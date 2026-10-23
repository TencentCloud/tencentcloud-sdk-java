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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindServiceList extends AbstractModel {

    /**
    * 密钥对绑定的mcp服务列表
    */
    @SerializedName("Mcp")
    @Expose
    private BindService [] Mcp;

    /**
    * 密钥对绑定的apis服务列表
    */
    @SerializedName("Apis")
    @Expose
    private BindService [] Apis;

    /**
    * 登记哪个资源下的哪个场景使用了密钥对
    */
    @SerializedName("Other")
    @Expose
    private BindService [] Other;

    /**
     * Get 密钥对绑定的mcp服务列表 
     * @return Mcp 密钥对绑定的mcp服务列表
     */
    public BindService [] getMcp() {
        return this.Mcp;
    }

    /**
     * Set 密钥对绑定的mcp服务列表
     * @param Mcp 密钥对绑定的mcp服务列表
     */
    public void setMcp(BindService [] Mcp) {
        this.Mcp = Mcp;
    }

    /**
     * Get 密钥对绑定的apis服务列表 
     * @return Apis 密钥对绑定的apis服务列表
     */
    public BindService [] getApis() {
        return this.Apis;
    }

    /**
     * Set 密钥对绑定的apis服务列表
     * @param Apis 密钥对绑定的apis服务列表
     */
    public void setApis(BindService [] Apis) {
        this.Apis = Apis;
    }

    /**
     * Get 登记哪个资源下的哪个场景使用了密钥对 
     * @return Other 登记哪个资源下的哪个场景使用了密钥对
     */
    public BindService [] getOther() {
        return this.Other;
    }

    /**
     * Set 登记哪个资源下的哪个场景使用了密钥对
     * @param Other 登记哪个资源下的哪个场景使用了密钥对
     */
    public void setOther(BindService [] Other) {
        this.Other = Other;
    }

    public BindServiceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindServiceList(BindServiceList source) {
        if (source.Mcp != null) {
            this.Mcp = new BindService[source.Mcp.length];
            for (int i = 0; i < source.Mcp.length; i++) {
                this.Mcp[i] = new BindService(source.Mcp[i]);
            }
        }
        if (source.Apis != null) {
            this.Apis = new BindService[source.Apis.length];
            for (int i = 0; i < source.Apis.length; i++) {
                this.Apis[i] = new BindService(source.Apis[i]);
            }
        }
        if (source.Other != null) {
            this.Other = new BindService[source.Other.length];
            for (int i = 0; i < source.Other.length; i++) {
                this.Other[i] = new BindService(source.Other[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Mcp.", this.Mcp);
        this.setParamArrayObj(map, prefix + "Apis.", this.Apis);
        this.setParamArrayObj(map, prefix + "Other.", this.Other);

    }
}

