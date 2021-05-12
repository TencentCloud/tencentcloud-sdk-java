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

public class CreateSecurityGroupApiRulesRequest extends AbstractModel{

    /**
    * 创建规则数据
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupApiRuleData [] Data;

    /**
    * 方向，0：出站，1：入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 插入类型，0：后插，1：前插，2：中插
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 腾讯云地域的英文简写
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 创建规则数据 
     * @return Data 创建规则数据
     */
    public SecurityGroupApiRuleData [] getData() {
        return this.Data;
    }

    /**
     * Set 创建规则数据
     * @param Data 创建规则数据
     */
    public void setData(SecurityGroupApiRuleData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 方向，0：出站，1：入站 
     * @return Direction 方向，0：出站，1：入站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站
     * @param Direction 方向，0：出站，1：入站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 插入类型，0：后插，1：前插，2：中插 
     * @return Type 插入类型，0：后插，1：前插，2：中插
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 插入类型，0：后插，1：前插，2：中插
     * @param Type 插入类型，0：后插，1：前插，2：中插
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 腾讯云地域的英文简写 
     * @return Area 腾讯云地域的英文简写
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 腾讯云地域的英文简写
     * @param Area 腾讯云地域的英文简写
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public CreateSecurityGroupApiRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupApiRulesRequest(CreateSecurityGroupApiRulesRequest source) {
        if (source.Data != null) {
            this.Data = new SecurityGroupApiRuleData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupApiRuleData(source.Data[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

