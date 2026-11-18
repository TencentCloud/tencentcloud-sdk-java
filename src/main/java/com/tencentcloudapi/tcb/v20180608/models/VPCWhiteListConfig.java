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

public class VPCWhiteListConfig extends AbstractModel {

    /**
    * <p>VPC 白名单配置状态</p><p>枚举值：</p><ul><li>OPEN： 开启白名单，VPCs 必填，覆盖写入</li><li>CLOSE： 关闭白名单，VPCs 填入时，覆盖写入</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>VPC 信息</p>
    */
    @SerializedName("VPCs")
    @Expose
    private VPCInfo [] VPCs;

    /**
     * Get <p>VPC 白名单配置状态</p><p>枚举值：</p><ul><li>OPEN： 开启白名单，VPCs 必填，覆盖写入</li><li>CLOSE： 关闭白名单，VPCs 填入时，覆盖写入</li></ul> 
     * @return Action <p>VPC 白名单配置状态</p><p>枚举值：</p><ul><li>OPEN： 开启白名单，VPCs 必填，覆盖写入</li><li>CLOSE： 关闭白名单，VPCs 填入时，覆盖写入</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>VPC 白名单配置状态</p><p>枚举值：</p><ul><li>OPEN： 开启白名单，VPCs 必填，覆盖写入</li><li>CLOSE： 关闭白名单，VPCs 填入时，覆盖写入</li></ul>
     * @param Action <p>VPC 白名单配置状态</p><p>枚举值：</p><ul><li>OPEN： 开启白名单，VPCs 必填，覆盖写入</li><li>CLOSE： 关闭白名单，VPCs 填入时，覆盖写入</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>VPC 信息</p> 
     * @return VPCs <p>VPC 信息</p>
     */
    public VPCInfo [] getVPCs() {
        return this.VPCs;
    }

    /**
     * Set <p>VPC 信息</p>
     * @param VPCs <p>VPC 信息</p>
     */
    public void setVPCs(VPCInfo [] VPCs) {
        this.VPCs = VPCs;
    }

    public VPCWhiteListConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPCWhiteListConfig(VPCWhiteListConfig source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.VPCs != null) {
            this.VPCs = new VPCInfo[source.VPCs.length];
            for (int i = 0; i < source.VPCs.length; i++) {
                this.VPCs[i] = new VPCInfo(source.VPCs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "VPCs.", this.VPCs);

    }
}

