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

public class CallInfo extends AbstractModel{

    /**
    * 业务日期
    */
    @SerializedName("BizDate")
    @Expose
    private String BizDate;

    /**
    * 状态 WAIT：待执行；DOING：执行中；ERROR：执行错误；DONE：已完成；
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 成功总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型 I：呼叫文件 R：停拨文件
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 作业唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
     * Get 业务日期 
     * @return BizDate 业务日期
     */
    public String getBizDate() {
        return this.BizDate;
    }

    /**
     * Set 业务日期
     * @param BizDate 业务日期
     */
    public void setBizDate(String BizDate) {
        this.BizDate = BizDate;
    }

    /**
     * Get 状态 WAIT：待执行；DOING：执行中；ERROR：执行错误；DONE：已完成； 
     * @return Status 状态 WAIT：待执行；DOING：执行中；ERROR：执行错误；DONE：已完成；
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 WAIT：待执行；DOING：执行中；ERROR：执行错误；DONE：已完成；
     * @param Status 状态 WAIT：待执行；DOING：执行中；ERROR：执行错误；DONE：已完成；
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 成功总数 
     * @return TotalCount 成功总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 成功总数
     * @param TotalCount 成功总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型 I：呼叫文件 R：停拨文件 
     * @return FileType 文件类型 I：呼叫文件 R：停拨文件
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型 I：呼叫文件 R：停拨文件
     * @param FileType 文件类型 I：呼叫文件 R：停拨文件
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 作业唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallId 作业唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallId() {
        return this.CallId;
    }

    /**
     * Set 作业唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallId 作业唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallId(String CallId) {
        this.CallId = CallId;
    }

    public CallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInfo(CallInfo source) {
        if (source.BizDate != null) {
            this.BizDate = new String(source.BizDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CallId != null) {
            this.CallId = new String(source.CallId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizDate", this.BizDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CallId", this.CallId);

    }
}

