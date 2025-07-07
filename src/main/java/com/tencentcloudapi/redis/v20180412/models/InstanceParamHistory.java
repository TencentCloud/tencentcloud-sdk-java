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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceParamHistory extends AbstractModel {

    /**
    * 参数名称。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数修改之前的值。
    */
    @SerializedName("PreValue")
    @Expose
    private String PreValue;

    /**
    * 参数修改之后的值。
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * 参数配置状态。
- 1：参数配置修改中。
- 2：参数配置修改成功。
- 3：参数配置修改失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 修改时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 参数名称。 
     * @return ParamName 参数名称。
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称。
     * @param ParamName 参数名称。
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 参数修改之前的值。 
     * @return PreValue 参数修改之前的值。
     */
    public String getPreValue() {
        return this.PreValue;
    }

    /**
     * Set 参数修改之前的值。
     * @param PreValue 参数修改之前的值。
     */
    public void setPreValue(String PreValue) {
        this.PreValue = PreValue;
    }

    /**
     * Get 参数修改之后的值。 
     * @return NewValue 参数修改之后的值。
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 参数修改之后的值。
     * @param NewValue 参数修改之后的值。
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get 参数配置状态。
- 1：参数配置修改中。
- 2：参数配置修改成功。
- 3：参数配置修改失败。 
     * @return Status 参数配置状态。
- 1：参数配置修改中。
- 2：参数配置修改成功。
- 3：参数配置修改失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 参数配置状态。
- 1：参数配置修改中。
- 2：参数配置修改成功。
- 3：参数配置修改失败。
     * @param Status 参数配置状态。
- 1：参数配置修改中。
- 2：参数配置修改成功。
- 3：参数配置修改失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 修改时间。 
     * @return ModifyTime 修改时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间。
     * @param ModifyTime 修改时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public InstanceParamHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceParamHistory(InstanceParamHistory source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.PreValue != null) {
            this.PreValue = new String(source.PreValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "PreValue", this.PreValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

