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

public class ModifyAcRuleRequest extends AbstractModel{

    /**
    * 规则数组
    */
    @SerializedName("Data")
    @Expose
    private RuleInfoData [] Data;

    /**
    * EdgeId值
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 访问规则状态
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * NAT地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 规则数组 
     * @return Data 规则数组
     */
    public RuleInfoData [] getData() {
        return this.Data;
    }

    /**
     * Set 规则数组
     * @param Data 规则数组
     */
    public void setData(RuleInfoData [] Data) {
        this.Data = Data;
    }

    /**
     * Get EdgeId值 
     * @return EdgeId EdgeId值
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set EdgeId值
     * @param EdgeId EdgeId值
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 访问规则状态 
     * @return Enable 访问规则状态
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 访问规则状态
     * @param Enable 访问规则状态
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get NAT地域 
     * @return Area NAT地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT地域
     * @param Area NAT地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public ModifyAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAcRuleRequest(ModifyAcRuleRequest source) {
        if (source.Data != null) {
            this.Data = new RuleInfoData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new RuleInfoData(source.Data[i]);
            }
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
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
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

