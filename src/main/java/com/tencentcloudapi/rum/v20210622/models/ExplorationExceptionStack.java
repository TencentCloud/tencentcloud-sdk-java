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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExplorationExceptionStack extends AbstractModel {

    /**
    * <p>异常类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>异常信息</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>mechanism 类型</p>
    */
    @SerializedName("MechanismType")
    @Expose
    private String MechanismType;

    /**
    * <p>是否已处理 0/1</p>
    */
    @SerializedName("MechanismHandled")
    @Expose
    private Long MechanismHandled;

    /**
     * Get <p>异常类型</p> 
     * @return Type <p>异常类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>异常类型</p>
     * @param Type <p>异常类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>异常信息</p> 
     * @return Value <p>异常信息</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>异常信息</p>
     * @param Value <p>异常信息</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>mechanism 类型</p> 
     * @return MechanismType <p>mechanism 类型</p>
     */
    public String getMechanismType() {
        return this.MechanismType;
    }

    /**
     * Set <p>mechanism 类型</p>
     * @param MechanismType <p>mechanism 类型</p>
     */
    public void setMechanismType(String MechanismType) {
        this.MechanismType = MechanismType;
    }

    /**
     * Get <p>是否已处理 0/1</p> 
     * @return MechanismHandled <p>是否已处理 0/1</p>
     */
    public Long getMechanismHandled() {
        return this.MechanismHandled;
    }

    /**
     * Set <p>是否已处理 0/1</p>
     * @param MechanismHandled <p>是否已处理 0/1</p>
     */
    public void setMechanismHandled(Long MechanismHandled) {
        this.MechanismHandled = MechanismHandled;
    }

    public ExplorationExceptionStack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExplorationExceptionStack(ExplorationExceptionStack source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.MechanismType != null) {
            this.MechanismType = new String(source.MechanismType);
        }
        if (source.MechanismHandled != null) {
            this.MechanismHandled = new Long(source.MechanismHandled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "MechanismType", this.MechanismType);
        this.setParamSimple(map, prefix + "MechanismHandled", this.MechanismHandled);

    }
}

