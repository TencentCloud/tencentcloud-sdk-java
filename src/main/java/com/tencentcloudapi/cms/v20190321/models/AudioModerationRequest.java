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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioModerationRequest  extends AbstractModel{

    /**
    * 回调URL，音频识别结果将以POST请求方式发送到此地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 音频内容的base64
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 音频文件的MD5值
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * 音频内容Url ，其中FileUrl和FileContent二选一
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
     * 获取回调URL，音频识别结果将以POST请求方式发送到此地址
     * @return CallbackUrl 回调URL，音频识别结果将以POST请求方式发送到此地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * 设置回调URL，音频识别结果将以POST请求方式发送到此地址
     * @param CallbackUrl 回调URL，音频识别结果将以POST请求方式发送到此地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * 获取音频内容的base64
     * @return FileContent 音频内容的base64
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * 设置音频内容的base64
     * @param FileContent 音频内容的base64
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * 获取音频文件的MD5值
     * @return FileMD5 音频文件的MD5值
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * 设置音频文件的MD5值
     * @param FileMD5 音频文件的MD5值
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * 获取音频内容Url ，其中FileUrl和FileContent二选一
     * @return FileUrl 音频内容Url ，其中FileUrl和FileContent二选一
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置音频内容Url ，其中FileUrl和FileContent二选一
     * @param FileUrl 音频内容Url ，其中FileUrl和FileContent二选一
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);

    }
}

