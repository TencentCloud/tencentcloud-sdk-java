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

public class ModifySecurityGroupRuleRequest extends AbstractModel{

    /**
    * 方向，0：出站，1：入站，默认1
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 编辑后是否启用规则，0：不启用，1：启用，默认1
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 编辑的企业安全组规则数据
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupListData [] Data;

    /**
    * 编辑的企业安全组规则的原始执行顺序
    */
    @SerializedName("SgRuleOriginSequence")
    @Expose
    private Long SgRuleOriginSequence;

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
     * Get 编辑后是否启用规则，0：不启用，1：启用，默认1 
     * @return Enable 编辑后是否启用规则，0：不启用，1：启用，默认1
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 编辑后是否启用规则，0：不启用，1：启用，默认1
     * @param Enable 编辑后是否启用规则，0：不启用，1：启用，默认1
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 编辑的企业安全组规则数据 
     * @return Data 编辑的企业安全组规则数据
     */
    public SecurityGroupListData [] getData() {
        return this.Data;
    }

    /**
     * Set 编辑的企业安全组规则数据
     * @param Data 编辑的企业安全组规则数据
     */
    public void setData(SecurityGroupListData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 编辑的企业安全组规则的原始执行顺序 
     * @return SgRuleOriginSequence 编辑的企业安全组规则的原始执行顺序
     */
    public Long getSgRuleOriginSequence() {
        return this.SgRuleOriginSequence;
    }

    /**
     * Set 编辑的企业安全组规则的原始执行顺序
     * @param SgRuleOriginSequence 编辑的企业安全组规则的原始执行顺序
     */
    public void setSgRuleOriginSequence(Long SgRuleOriginSequence) {
        this.SgRuleOriginSequence = SgRuleOriginSequence;
    }

    public ModifySecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupRuleRequest(ModifySecurityGroupRuleRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupListData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupListData(source.Data[i]);
            }
        }
        if (source.SgRuleOriginSequence != null) {
            this.SgRuleOriginSequence = new Long(source.SgRuleOriginSequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "SgRuleOriginSequence", this.SgRuleOriginSequence);

    }
}

