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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadDataJsonRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：Data
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：UploadJson
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 报文信息
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * <p>上传类型，不填默认到期/逾期提醒数据，取值范围：</p><ul style="margin-bottom:0px;"><li>data：到期/逾期提醒数据</li><li>repay：到期/逾期提醒停拨数据</li></ul>
    */
    @SerializedName("UploadModel")
    @Expose
    private String UploadModel;

    /**
    * 实例ID，不传默认为系统分配的初始实例。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 模块名，本接口取值：Data 
     * @return Module 模块名，本接口取值：Data
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：Data
     * @param Module 模块名，本接口取值：Data
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：UploadJson 
     * @return Operation 操作名，本接口取值：UploadJson
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：UploadJson
     * @param Operation 操作名，本接口取值：UploadJson
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 报文信息 
     * @return Data 报文信息
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 报文信息
     * @param Data 报文信息
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get <p>上传类型，不填默认到期/逾期提醒数据，取值范围：</p><ul style="margin-bottom:0px;"><li>data：到期/逾期提醒数据</li><li>repay：到期/逾期提醒停拨数据</li></ul> 
     * @return UploadModel <p>上传类型，不填默认到期/逾期提醒数据，取值范围：</p><ul style="margin-bottom:0px;"><li>data：到期/逾期提醒数据</li><li>repay：到期/逾期提醒停拨数据</li></ul>
     */
    public String getUploadModel() {
        return this.UploadModel;
    }

    /**
     * Set <p>上传类型，不填默认到期/逾期提醒数据，取值范围：</p><ul style="margin-bottom:0px;"><li>data：到期/逾期提醒数据</li><li>repay：到期/逾期提醒停拨数据</li></ul>
     * @param UploadModel <p>上传类型，不填默认到期/逾期提醒数据，取值范围：</p><ul style="margin-bottom:0px;"><li>data：到期/逾期提醒数据</li><li>repay：到期/逾期提醒停拨数据</li></ul>
     */
    public void setUploadModel(String UploadModel) {
        this.UploadModel = UploadModel;
    }

    /**
     * Get 实例ID，不传默认为系统分配的初始实例。 
     * @return InstanceId 实例ID，不传默认为系统分配的初始实例。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，不传默认为系统分配的初始实例。
     * @param InstanceId 实例ID，不传默认为系统分配的初始实例。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "UploadModel", this.UploadModel);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

