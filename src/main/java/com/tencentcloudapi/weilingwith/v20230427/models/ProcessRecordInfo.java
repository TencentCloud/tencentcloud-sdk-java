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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessRecordInfo extends AbstractModel {

    /**
    * 告警的id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 处理时间，毫秒

    */
    @SerializedName("ProcessTime")
    @Expose
    private Long ProcessTime;

    /**
    * 处理类型，此处操作类型固定填add_record

    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 注:此字段填写的是孪生中台的用户，非孪生中台用户不填该字段
[{\"id\":\"123\",\"name\":\"tes\"}]

    */
    @SerializedName("Processor")
    @Expose
    private String Processor;

    /**
    * 处理描述信息
    */
    @SerializedName("ProcessDescription")
    @Expose
    private String ProcessDescription;

    /**
    * 附加文件标识
    */
    @SerializedName("AttachedFileId")
    @Expose
    private String AttachedFileId;

    /**
     * Get 告警的id 
     * @return Id 告警的id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 告警的id
     * @param Id 告警的id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 处理时间，毫秒
 
     * @return ProcessTime 处理时间，毫秒

     */
    public Long getProcessTime() {
        return this.ProcessTime;
    }

    /**
     * Set 处理时间，毫秒

     * @param ProcessTime 处理时间，毫秒

     */
    public void setProcessTime(Long ProcessTime) {
        this.ProcessTime = ProcessTime;
    }

    /**
     * Get 处理类型，此处操作类型固定填add_record
 
     * @return ProcessType 处理类型，此处操作类型固定填add_record

     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 处理类型，此处操作类型固定填add_record

     * @param ProcessType 处理类型，此处操作类型固定填add_record

     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 注:此字段填写的是孪生中台的用户，非孪生中台用户不填该字段
[{\"id\":\"123\",\"name\":\"tes\"}]
 
     * @return Processor 注:此字段填写的是孪生中台的用户，非孪生中台用户不填该字段
[{\"id\":\"123\",\"name\":\"tes\"}]

     */
    public String getProcessor() {
        return this.Processor;
    }

    /**
     * Set 注:此字段填写的是孪生中台的用户，非孪生中台用户不填该字段
[{\"id\":\"123\",\"name\":\"tes\"}]

     * @param Processor 注:此字段填写的是孪生中台的用户，非孪生中台用户不填该字段
[{\"id\":\"123\",\"name\":\"tes\"}]

     */
    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    /**
     * Get 处理描述信息 
     * @return ProcessDescription 处理描述信息
     */
    public String getProcessDescription() {
        return this.ProcessDescription;
    }

    /**
     * Set 处理描述信息
     * @param ProcessDescription 处理描述信息
     */
    public void setProcessDescription(String ProcessDescription) {
        this.ProcessDescription = ProcessDescription;
    }

    /**
     * Get 附加文件标识 
     * @return AttachedFileId 附加文件标识
     */
    public String getAttachedFileId() {
        return this.AttachedFileId;
    }

    /**
     * Set 附加文件标识
     * @param AttachedFileId 附加文件标识
     */
    public void setAttachedFileId(String AttachedFileId) {
        this.AttachedFileId = AttachedFileId;
    }

    public ProcessRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessRecordInfo(ProcessRecordInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProcessTime != null) {
            this.ProcessTime = new Long(source.ProcessTime);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.Processor != null) {
            this.Processor = new String(source.Processor);
        }
        if (source.ProcessDescription != null) {
            this.ProcessDescription = new String(source.ProcessDescription);
        }
        if (source.AttachedFileId != null) {
            this.AttachedFileId = new String(source.AttachedFileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProcessTime", this.ProcessTime);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "Processor", this.Processor);
        this.setParamSimple(map, prefix + "ProcessDescription", this.ProcessDescription);
        this.setParamSimple(map, prefix + "AttachedFileId", this.AttachedFileId);

    }
}

