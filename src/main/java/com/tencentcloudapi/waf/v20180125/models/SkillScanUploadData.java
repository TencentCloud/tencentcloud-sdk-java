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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillScanUploadData extends AbstractModel {

    /**
    * <p>文件的 SHA256 Hash，用于轮询查询接口</p>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * <p>固定为 scanning，表示任务已接收</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>可读的操作结果描述</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>文件的 SHA256 Hash，用于轮询查询接口</p> 
     * @return ContentHash <p>文件的 SHA256 Hash，用于轮询查询接口</p>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set <p>文件的 SHA256 Hash，用于轮询查询接口</p>
     * @param ContentHash <p>文件的 SHA256 Hash，用于轮询查询接口</p>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get <p>固定为 scanning，表示任务已接收</p> 
     * @return Status <p>固定为 scanning，表示任务已接收</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>固定为 scanning，表示任务已接收</p>
     * @param Status <p>固定为 scanning，表示任务已接收</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>可读的操作结果描述</p> 
     * @return Message <p>可读的操作结果描述</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>可读的操作结果描述</p>
     * @param Message <p>可读的操作结果描述</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SkillScanUploadData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanUploadData(SkillScanUploadData source) {
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

