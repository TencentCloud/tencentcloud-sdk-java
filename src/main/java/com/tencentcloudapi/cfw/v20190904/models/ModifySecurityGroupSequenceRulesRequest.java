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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupSequenceRulesRequest extends AbstractModel{

    /**
    * 方向，0：出站，1：入站，默认1
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 企业安全组规则快速排序数据
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupOrderIndexData [] Data;

    /**
     * Get 方向，0：出站，1：入站，默认1 
     * @return Direction 方向，0：出站，1：入站，默认1
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站，默认1
     * @param Direction 方向，0：出站，1：入站，默认1
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 企业安全组规则快速排序数据 
     * @return Data 企业安全组规则快速排序数据
     */
    public SecurityGroupOrderIndexData [] getData() {
        return this.Data;
    }

    /**
     * Set 企业安全组规则快速排序数据
     * @param Data 企业安全组规则快速排序数据
     */
    public void setData(SecurityGroupOrderIndexData [] Data) {
        this.Data = Data;
    }

    public ModifySecurityGroupSequenceRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupSequenceRulesRequest(ModifySecurityGroupSequenceRulesRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupOrderIndexData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupOrderIndexData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

