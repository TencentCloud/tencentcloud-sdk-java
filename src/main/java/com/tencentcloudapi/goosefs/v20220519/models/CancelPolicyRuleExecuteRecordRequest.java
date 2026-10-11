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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelPolicyRuleExecuteRecordRequest extends AbstractModel {

    /**
    * <p>规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>执行记录id</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
     * Get <p>规则id</p> 
     * @return RuleId <p>规则id</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则id</p>
     * @param RuleId <p>规则id</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>文件系统ID</p> 
     * @return FileSystemId <p>文件系统ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID</p>
     * @param FileSystemId <p>文件系统ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>执行记录id</p> 
     * @return RecordId <p>执行记录id</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>执行记录id</p>
     * @param RecordId <p>执行记录id</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    public CancelPolicyRuleExecuteRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelPolicyRuleExecuteRecordRequest(CancelPolicyRuleExecuteRecordRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);

    }
}

