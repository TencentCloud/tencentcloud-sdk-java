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

public class DownloadRecordListRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：Record
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：DownloadList
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 录音日期，格式为YYYY-MM-DD
    */
    @SerializedName("BizDate")
    @Expose
    private String BizDate;

    /**
    * 实例ID
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

    /**
     * Get 模块名，本接口取值：Record 
     * @return Module 模块名，本接口取值：Record
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：Record
     * @param Module 模块名，本接口取值：Record
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：DownloadList 
     * @return Operation 操作名，本接口取值：DownloadList
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：DownloadList
     * @param Operation 操作名，本接口取值：DownloadList
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 录音日期，格式为YYYY-MM-DD 
     * @return BizDate 录音日期，格式为YYYY-MM-DD
     */
    public String getBizDate() {
        return this.BizDate;
    }

    /**
     * Set 录音日期，格式为YYYY-MM-DD
     * @param BizDate 录音日期，格式为YYYY-MM-DD
     */
    public void setBizDate(String BizDate) {
        this.BizDate = BizDate;
    }

    /**
     * Get 实例ID 
     * @return InstId 实例ID
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * Set 实例ID
     * @param InstId 实例ID
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "BizDate", this.BizDate);
        this.setParamSimple(map, prefix + "InstId", this.InstId);

    }
}

