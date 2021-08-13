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

public class CreateSecurityGroupRulesRequest extends AbstractModel{

    /**
    * 添加的企业安全组规则数据
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupListData [] Data;

    /**
    * 方向，0：出站，1：入站，默认1
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 0：后插，1：前插，2：中插，默认0
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 添加后是否启用规则，0：不启用，1：启用，默认1
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 添加的企业安全组规则数据 
     * @return Data 添加的企业安全组规则数据
     */
    public SecurityGroupListData [] getData() {
        return this.Data;
    }

    /**
     * Set 添加的企业安全组规则数据
     * @param Data 添加的企业安全组规则数据
     */
    public void setData(SecurityGroupListData [] Data) {
        this.Data = Data;
    }

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
     * Get 0：后插，1：前插，2：中插，默认0 
     * @return Type 0：后插，1：前插，2：中插，默认0
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0：后插，1：前插，2：中插，默认0
     * @param Type 0：后插，1：前插，2：中插，默认0
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 添加后是否启用规则，0：不启用，1：启用，默认1 
     * @return Enable 添加后是否启用规则，0：不启用，1：启用，默认1
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 添加后是否启用规则，0：不启用，1：启用，默认1
     * @param Enable 添加后是否启用规则，0：不启用，1：启用，默认1
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public CreateSecurityGroupRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupRulesRequest(CreateSecurityGroupRulesRequest source) {
        if (source.Data != null) {
            this.Data = new SecurityGroupListData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupListData(source.Data[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

