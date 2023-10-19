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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScreenGeneralStatResponse extends AbstractModel {

    /**
    * name 的值: 在线，关机/离线,未安装，
value : 表示对应的数量
    */
    @SerializedName("Machines")
    @Expose
    private ScreenNameValue [] Machines;

    /**
    * name 的值: 旗舰版，专业版，基础版
value : 表示对应的数量
    */
    @SerializedName("Protection")
    @Expose
    private ScreenNameValue [] Protection;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get name 的值: 在线，关机/离线,未安装，
value : 表示对应的数量 
     * @return Machines name 的值: 在线，关机/离线,未安装，
value : 表示对应的数量
     */
    public ScreenNameValue [] getMachines() {
        return this.Machines;
    }

    /**
     * Set name 的值: 在线，关机/离线,未安装，
value : 表示对应的数量
     * @param Machines name 的值: 在线，关机/离线,未安装，
value : 表示对应的数量
     */
    public void setMachines(ScreenNameValue [] Machines) {
        this.Machines = Machines;
    }

    /**
     * Get name 的值: 旗舰版，专业版，基础版
value : 表示对应的数量 
     * @return Protection name 的值: 旗舰版，专业版，基础版
value : 表示对应的数量
     */
    public ScreenNameValue [] getProtection() {
        return this.Protection;
    }

    /**
     * Set name 的值: 旗舰版，专业版，基础版
value : 表示对应的数量
     * @param Protection name 的值: 旗舰版，专业版，基础版
value : 表示对应的数量
     */
    public void setProtection(ScreenNameValue [] Protection) {
        this.Protection = Protection;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScreenGeneralStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenGeneralStatResponse(DescribeScreenGeneralStatResponse source) {
        if (source.Machines != null) {
            this.Machines = new ScreenNameValue[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new ScreenNameValue(source.Machines[i]);
            }
        }
        if (source.Protection != null) {
            this.Protection = new ScreenNameValue[source.Protection.length];
            for (int i = 0; i < source.Protection.length; i++) {
                this.Protection[i] = new ScreenNameValue(source.Protection[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);
        this.setParamArrayObj(map, prefix + "Protection.", this.Protection);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

