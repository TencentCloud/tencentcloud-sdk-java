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

public class DescribePolicyRuleExecuteRecordRequest extends AbstractModel {

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>最大返回数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

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
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>最大返回数量</p> 
     * @return Limit <p>最大返回数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大返回数量</p>
     * @param Limit <p>最大返回数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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

    public DescribePolicyRuleExecuteRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyRuleExecuteRecordRequest(DescribePolicyRuleExecuteRecordRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

