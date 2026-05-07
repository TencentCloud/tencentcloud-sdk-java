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

public class ManagedAIModelChargingInfo extends AbstractModel {

    /**
    * <p>计费类型</p><p>枚举值：</p><ul><li>Uniform： 固定计费</li><li>Tiered： 分段计费</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>分组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>输入 Token 价格</p>
    */
    @SerializedName("InputPrice")
    @Expose
    private String InputPrice;

    /**
    * <p>输出 Token 价格</p>
    */
    @SerializedName("OutputPrice")
    @Expose
    private String OutputPrice;

    /**
    * <p>命中缓存价格</p>
    */
    @SerializedName("CachePrice")
    @Expose
    private String CachePrice;

    /**
    * <p>计费单位</p>
    */
    @SerializedName("InputOutputUnit")
    @Expose
    private String InputOutputUnit;

    /**
     * Get <p>计费类型</p><p>枚举值：</p><ul><li>Uniform： 固定计费</li><li>Tiered： 分段计费</li></ul> 
     * @return Type <p>计费类型</p><p>枚举值：</p><ul><li>Uniform： 固定计费</li><li>Tiered： 分段计费</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>计费类型</p><p>枚举值：</p><ul><li>Uniform： 固定计费</li><li>Tiered： 分段计费</li></ul>
     * @param Type <p>计费类型</p><p>枚举值：</p><ul><li>Uniform： 固定计费</li><li>Tiered： 分段计费</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>分组名称</p> 
     * @return Name <p>分组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分组名称</p>
     * @param Name <p>分组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>输入 Token 价格</p> 
     * @return InputPrice <p>输入 Token 价格</p>
     */
    public String getInputPrice() {
        return this.InputPrice;
    }

    /**
     * Set <p>输入 Token 价格</p>
     * @param InputPrice <p>输入 Token 价格</p>
     */
    public void setInputPrice(String InputPrice) {
        this.InputPrice = InputPrice;
    }

    /**
     * Get <p>输出 Token 价格</p> 
     * @return OutputPrice <p>输出 Token 价格</p>
     */
    public String getOutputPrice() {
        return this.OutputPrice;
    }

    /**
     * Set <p>输出 Token 价格</p>
     * @param OutputPrice <p>输出 Token 价格</p>
     */
    public void setOutputPrice(String OutputPrice) {
        this.OutputPrice = OutputPrice;
    }

    /**
     * Get <p>命中缓存价格</p> 
     * @return CachePrice <p>命中缓存价格</p>
     */
    public String getCachePrice() {
        return this.CachePrice;
    }

    /**
     * Set <p>命中缓存价格</p>
     * @param CachePrice <p>命中缓存价格</p>
     */
    public void setCachePrice(String CachePrice) {
        this.CachePrice = CachePrice;
    }

    /**
     * Get <p>计费单位</p> 
     * @return InputOutputUnit <p>计费单位</p>
     */
    public String getInputOutputUnit() {
        return this.InputOutputUnit;
    }

    /**
     * Set <p>计费单位</p>
     * @param InputOutputUnit <p>计费单位</p>
     */
    public void setInputOutputUnit(String InputOutputUnit) {
        this.InputOutputUnit = InputOutputUnit;
    }

    public ManagedAIModelChargingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedAIModelChargingInfo(ManagedAIModelChargingInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InputPrice != null) {
            this.InputPrice = new String(source.InputPrice);
        }
        if (source.OutputPrice != null) {
            this.OutputPrice = new String(source.OutputPrice);
        }
        if (source.CachePrice != null) {
            this.CachePrice = new String(source.CachePrice);
        }
        if (source.InputOutputUnit != null) {
            this.InputOutputUnit = new String(source.InputOutputUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InputPrice", this.InputPrice);
        this.setParamSimple(map, prefix + "OutputPrice", this.OutputPrice);
        this.setParamSimple(map, prefix + "CachePrice", this.CachePrice);
        this.setParamSimple(map, prefix + "InputOutputUnit", this.InputOutputUnit);

    }
}

