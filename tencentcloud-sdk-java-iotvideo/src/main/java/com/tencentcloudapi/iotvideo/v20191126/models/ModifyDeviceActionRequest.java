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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceActionRequest extends AbstractModel{

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 如果设备处于休眠状态，是否唤醒设备
    */
    @SerializedName("Wakeup")
    @Expose
    private Boolean Wakeup;

    /**
    * 物模型的分支路径
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 写入的物模型数据，如果是json需要转义成字符串
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Value字段的类型是否为数值（float、int）
    */
    @SerializedName("IsNum")
    @Expose
    private Boolean IsNum;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 如果设备处于休眠状态，是否唤醒设备 
     * @return Wakeup 如果设备处于休眠状态，是否唤醒设备
     */
    public Boolean getWakeup() {
        return this.Wakeup;
    }

    /**
     * Set 如果设备处于休眠状态，是否唤醒设备
     * @param Wakeup 如果设备处于休眠状态，是否唤醒设备
     */
    public void setWakeup(Boolean Wakeup) {
        this.Wakeup = Wakeup;
    }

    /**
     * Get 物模型的分支路径 
     * @return Branch 物模型的分支路径
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 物模型的分支路径
     * @param Branch 物模型的分支路径
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get 写入的物模型数据，如果是json需要转义成字符串 
     * @return Value 写入的物模型数据，如果是json需要转义成字符串
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 写入的物模型数据，如果是json需要转义成字符串
     * @param Value 写入的物模型数据，如果是json需要转义成字符串
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Value字段的类型是否为数值（float、int） 
     * @return IsNum Value字段的类型是否为数值（float、int）
     */
    public Boolean getIsNum() {
        return this.IsNum;
    }

    /**
     * Set Value字段的类型是否为数值（float、int）
     * @param IsNum Value字段的类型是否为数值（float、int）
     */
    public void setIsNum(Boolean IsNum) {
        this.IsNum = IsNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Wakeup", this.Wakeup);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "IsNum", this.IsNum);

    }
}

