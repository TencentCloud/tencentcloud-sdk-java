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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputModifyNameListDataFront extends AbstractModel {

    /**
    * 名单数据ID
    */
    @SerializedName("NameListDataId")
    @Expose
    private Long NameListDataId;

    /**
    * 名单数据内容
    */
    @SerializedName("DataContent")
    @Expose
    private String DataContent;

    /**
    * 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 记录状态 [1 启用 2 停用]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 名单数据描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 名单数据ID 
     * @return NameListDataId 名单数据ID
     */
    public Long getNameListDataId() {
        return this.NameListDataId;
    }

    /**
     * Set 名单数据ID
     * @param NameListDataId 名单数据ID
     */
    public void setNameListDataId(Long NameListDataId) {
        this.NameListDataId = NameListDataId;
    }

    /**
     * Get 名单数据内容 
     * @return DataContent 名单数据内容
     */
    public String getDataContent() {
        return this.DataContent;
    }

    /**
     * Set 名单数据内容
     * @param DataContent 名单数据内容
     */
    public void setDataContent(String DataContent) {
        this.DataContent = DataContent;
    }

    /**
     * Get 名单数据开始时间，时间格式示例"2024-05-05 12:10:15" 
     * @return StartTime 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
     * @param StartTime 名单数据开始时间，时间格式示例"2024-05-05 12:10:15"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 名单数据结束时间，时间格式示例"2024-05-05 12:10:15" 
     * @return EndTime 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
     * @param EndTime 名单数据结束时间，时间格式示例"2024-05-05 12:10:15"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 记录状态 [1 启用 2 停用] 
     * @return Status 记录状态 [1 启用 2 停用]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 记录状态 [1 启用 2 停用]
     * @param Status 记录状态 [1 启用 2 停用]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 名单数据描述 
     * @return Remark 名单数据描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 名单数据描述
     * @param Remark 名单数据描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public InputModifyNameListDataFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputModifyNameListDataFront(InputModifyNameListDataFront source) {
        if (source.NameListDataId != null) {
            this.NameListDataId = new Long(source.NameListDataId);
        }
        if (source.DataContent != null) {
            this.DataContent = new String(source.DataContent);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameListDataId", this.NameListDataId);
        this.setParamSimple(map, prefix + "DataContent", this.DataContent);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

