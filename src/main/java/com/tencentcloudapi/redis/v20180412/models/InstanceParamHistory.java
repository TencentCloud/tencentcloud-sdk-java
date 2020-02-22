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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceParamHistory extends AbstractModel{

    /**
    * 参数名称
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 修改前值
    */
    @SerializedName("PreValue")
    @Expose
    private String PreValue;

    /**
    * 修改后值
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * 状态：1-参数配置修改中；2-参数配置修改成功；3-参数配置修改失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 参数名称 
     * @return ParamName 参数名称
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称
     * @param ParamName 参数名称
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 修改前值 
     * @return PreValue 修改前值
     */
    public String getPreValue() {
        return this.PreValue;
    }

    /**
     * Set 修改前值
     * @param PreValue 修改前值
     */
    public void setPreValue(String PreValue) {
        this.PreValue = PreValue;
    }

    /**
     * Get 修改后值 
     * @return NewValue 修改后值
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 修改后值
     * @param NewValue 修改后值
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get 状态：1-参数配置修改中；2-参数配置修改成功；3-参数配置修改失败 
     * @return Status 状态：1-参数配置修改中；2-参数配置修改成功；3-参数配置修改失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：1-参数配置修改中；2-参数配置修改成功；3-参数配置修改失败
     * @param Status 状态：1-参数配置修改中；2-参数配置修改成功；3-参数配置修改失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

