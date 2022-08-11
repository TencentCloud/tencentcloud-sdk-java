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

public class CustomizationConfigs extends AbstractModel{

    /**
    * 应用 ID，登录控制台创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型状态，-1下线状态，1上线状态, 0训练中, -2训练失败
    */
    @SerializedName("ModelState")
    @Expose
    private Long ModelState;

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

    /**
     * Get 模型ID 
     * @return ModelId 模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
     * @param ModelId 模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型状态，-1下线状态，1上线状态, 0训练中, -2训练失败 
     * @return ModelState 模型状态，-1下线状态，1上线状态, 0训练中, -2训练失败
     */
    public Long getModelState() {
        return this.ModelState;
    }

    /**
     * Set 模型状态，-1下线状态，1上线状态, 0训练中, -2训练失败
     * @param ModelState 模型状态，-1下线状态，1上线状态, 0训练中, -2训练失败
     */
    public void setModelState(Long ModelState) {
        this.ModelState = ModelState;
    }

    public CustomizationConfigs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomizationConfigs(CustomizationConfigs source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelState != null) {
            this.ModelState = new Long(source.ModelState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelState", this.ModelState);

    }
}

