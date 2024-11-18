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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBotStatusResponse extends AbstractModel {

    /**
    * 正常情况为null
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 未购买BOT的域名列表
    */
    @SerializedName("UnSupportedList")
    @Expose
    private String [] UnSupportedList;

    /**
    * 已购买但操作失败的域名列表
    */
    @SerializedName("FailDomainList")
    @Expose
    private String [] FailDomainList;

    /**
    * 成功数目
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 正常情况为null 
     * @return Data 正常情况为null
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 正常情况为null
     * @param Data 正常情况为null
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 未购买BOT的域名列表 
     * @return UnSupportedList 未购买BOT的域名列表
     */
    public String [] getUnSupportedList() {
        return this.UnSupportedList;
    }

    /**
     * Set 未购买BOT的域名列表
     * @param UnSupportedList 未购买BOT的域名列表
     */
    public void setUnSupportedList(String [] UnSupportedList) {
        this.UnSupportedList = UnSupportedList;
    }

    /**
     * Get 已购买但操作失败的域名列表 
     * @return FailDomainList 已购买但操作失败的域名列表
     */
    public String [] getFailDomainList() {
        return this.FailDomainList;
    }

    /**
     * Set 已购买但操作失败的域名列表
     * @param FailDomainList 已购买但操作失败的域名列表
     */
    public void setFailDomainList(String [] FailDomainList) {
        this.FailDomainList = FailDomainList;
    }

    /**
     * Get 成功数目 
     * @return Count 成功数目
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 成功数目
     * @param Count 成功数目
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public ModifyBotStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBotStatusResponse(ModifyBotStatusResponse source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.UnSupportedList != null) {
            this.UnSupportedList = new String[source.UnSupportedList.length];
            for (int i = 0; i < source.UnSupportedList.length; i++) {
                this.UnSupportedList[i] = new String(source.UnSupportedList[i]);
            }
        }
        if (source.FailDomainList != null) {
            this.FailDomainList = new String[source.FailDomainList.length];
            for (int i = 0; i < source.FailDomainList.length; i++) {
                this.FailDomainList[i] = new String(source.FailDomainList[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamArraySimple(map, prefix + "UnSupportedList.", this.UnSupportedList);
        this.setParamArraySimple(map, prefix + "FailDomainList.", this.FailDomainList);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

