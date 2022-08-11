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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomizationStateRequest extends AbstractModel{

    /**
    * 自学习模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 想要变换的模型状态，-1代表下线，1代表上线
    */
    @SerializedName("ToState")
    @Expose
    private Long ToState;

    /**
    * 应用 ID，登录控制台创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
     * Get 自学习模型ID 
     * @return ModelId 自学习模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 自学习模型ID
     * @param ModelId 自学习模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 想要变换的模型状态，-1代表下线，1代表上线 
     * @return ToState 想要变换的模型状态，-1代表下线，1代表上线
     */
    public Long getToState() {
        return this.ToState;
    }

    /**
     * Set 想要变换的模型状态，-1代表下线，1代表上线
     * @param ToState 想要变换的模型状态，-1代表下线，1代表上线
     */
    public void setToState(Long ToState) {
        this.ToState = ToState;
    }

    /**
     * Get 应用 ID，登录控制台创建应用得到的AppID 
     * @return BizId 应用 ID，登录控制台创建应用得到的AppID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用 ID，登录控制台创建应用得到的AppID
     * @param BizId 应用 ID，登录控制台创建应用得到的AppID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    public ModifyCustomizationStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomizationStateRequest(ModifyCustomizationStateRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ToState != null) {
            this.ToState = new Long(source.ToState);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ToState", this.ToState);
        this.setParamSimple(map, prefix + "BizId", this.BizId);

    }
}

