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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTaskStatus extends AbstractModel {

    /**
    * <p>文件id</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>0： 处理中</li><li>1： 可用</li><li>-1： 错误</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>是否已拉取过状态</p><p>枚举值：</p><ul><li>0： 未被拉取过状态</li><li>1： 已被拉取过状态</li></ul>
    */
    @SerializedName("IsTerminated")
    @Expose
    private Long IsTerminated;

    /**
    * <p>错误信息，状态-1时不为空</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get <p>文件id</p> 
     * @return FileId <p>文件id</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件id</p>
     * @param FileId <p>文件id</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>0： 处理中</li><li>1： 可用</li><li>-1： 错误</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>0： 处理中</li><li>1： 可用</li><li>-1： 错误</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>0： 处理中</li><li>1： 可用</li><li>-1： 错误</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>0： 处理中</li><li>1： 可用</li><li>-1： 错误</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否已拉取过状态</p><p>枚举值：</p><ul><li>0： 未被拉取过状态</li><li>1： 已被拉取过状态</li></ul> 
     * @return IsTerminated <p>是否已拉取过状态</p><p>枚举值：</p><ul><li>0： 未被拉取过状态</li><li>1： 已被拉取过状态</li></ul>
     */
    public Long getIsTerminated() {
        return this.IsTerminated;
    }

    /**
     * Set <p>是否已拉取过状态</p><p>枚举值：</p><ul><li>0： 未被拉取过状态</li><li>1： 已被拉取过状态</li></ul>
     * @param IsTerminated <p>是否已拉取过状态</p><p>枚举值：</p><ul><li>0： 未被拉取过状态</li><li>1： 已被拉取过状态</li></ul>
     */
    public void setIsTerminated(Long IsTerminated) {
        this.IsTerminated = IsTerminated;
    }

    /**
     * Get <p>错误信息，状态-1时不为空</p> 
     * @return ErrorMsg <p>错误信息，状态-1时不为空</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>错误信息，状态-1时不为空</p>
     * @param ErrorMsg <p>错误信息，状态-1时不为空</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public FileTaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTaskStatus(FileTaskStatus source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsTerminated != null) {
            this.IsTerminated = new Long(source.IsTerminated);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsTerminated", this.IsTerminated);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

