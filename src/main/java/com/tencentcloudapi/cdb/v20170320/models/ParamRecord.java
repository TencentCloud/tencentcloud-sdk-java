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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamRecord extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 参数名称
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数修改前的值
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * 参数修改后的值
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * 参数是否修改成功
    */
    @SerializedName("IsSucess")
    @Expose
    private Boolean IsSucess;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 参数是否修改成功
    */
    @SerializedName("IsSuccess")
    @Expose
    private Boolean IsSuccess;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get 参数修改前的值 
     * @return OldValue 参数修改前的值
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 参数修改前的值
     * @param OldValue 参数修改前的值
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get 参数修改后的值 
     * @return NewValue 参数修改后的值
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 参数修改后的值
     * @param NewValue 参数修改后的值
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get 参数是否修改成功 
     * @return IsSucess 参数是否修改成功
     * @deprecated
     */
    @Deprecated
    public Boolean getIsSucess() {
        return this.IsSucess;
    }

    /**
     * Set 参数是否修改成功
     * @param IsSucess 参数是否修改成功
     * @deprecated
     */
    @Deprecated
    public void setIsSucess(Boolean IsSucess) {
        this.IsSucess = IsSucess;
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
     * Get 参数是否修改成功 
     * @return IsSuccess 参数是否修改成功
     */
    public Boolean getIsSuccess() {
        return this.IsSuccess;
    }

    /**
     * Set 参数是否修改成功
     * @param IsSuccess 参数是否修改成功
     */
    public void setIsSuccess(Boolean IsSuccess) {
        this.IsSuccess = IsSuccess;
    }

    public ParamRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamRecord(ParamRecord source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.IsSucess != null) {
            this.IsSucess = new Boolean(source.IsSucess);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IsSuccess != null) {
            this.IsSuccess = new Boolean(source.IsSuccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "IsSucess", this.IsSucess);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IsSuccess", this.IsSuccess);

    }
}

