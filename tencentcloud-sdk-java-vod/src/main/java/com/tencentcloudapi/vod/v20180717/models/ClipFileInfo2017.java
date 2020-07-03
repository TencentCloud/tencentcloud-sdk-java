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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClipFileInfo2017 extends AbstractModel{

    /**
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误描述。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 输出目标文件的文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 输出目标文件的文件地址。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 输出目标文件的文件类型。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get 错误码
<li>0：成功；</li>
<li>其他值：失败。</li> 
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误描述。 
     * @return Message 错误描述。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误描述。
     * @param Message 错误描述。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 输出目标文件的文件 ID。 
     * @return FileId 输出目标文件的文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 输出目标文件的文件 ID。
     * @param FileId 输出目标文件的文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 输出目标文件的文件地址。 
     * @return FileUrl 输出目标文件的文件地址。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 输出目标文件的文件地址。
     * @param FileUrl 输出目标文件的文件地址。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 输出目标文件的文件类型。 
     * @return FileType 输出目标文件的文件类型。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 输出目标文件的文件类型。
     * @param FileType 输出目标文件的文件类型。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

