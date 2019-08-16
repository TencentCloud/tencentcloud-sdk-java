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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTraditionalClassTaskRequest  extends AbstractModel{

    /**
    * 输入分析对象内容，仅支持url，暂不支持直接上传base64图片
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 查询人员库列表，可填写学生们的注册照所在人员库
    */
    @SerializedName("LibrarySet")
    @Expose
    private String [] LibrarySet;

    /**
    * 直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
    */
    @SerializedName("MaxVideoDuration")
    @Expose
    private Long MaxVideoDuration;

    /**
     * 获取输入分析对象内容，仅支持url，暂不支持直接上传base64图片
     * @return FileContent 输入分析对象内容，仅支持url，暂不支持直接上传base64图片
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * 设置输入分析对象内容，仅支持url，暂不支持直接上传base64图片
     * @param FileContent 输入分析对象内容，仅支持url，暂不支持直接上传base64图片
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * 获取输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址
     * @return FileType 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址
     * @param FileType 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 获取查询人员库列表，可填写学生们的注册照所在人员库
     * @return LibrarySet 查询人员库列表，可填写学生们的注册照所在人员库
     */
    public String [] getLibrarySet() {
        return this.LibrarySet;
    }

    /**
     * 设置查询人员库列表，可填写学生们的注册照所在人员库
     * @param LibrarySet 查询人员库列表，可填写学生们的注册照所在人员库
     */
    public void setLibrarySet(String [] LibrarySet) {
        this.LibrarySet = LibrarySet;
    }

    /**
     * 获取直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     * @return MaxVideoDuration 直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     */
    public Long getMaxVideoDuration() {
        return this.MaxVideoDuration;
    }

    /**
     * 设置直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     * @param MaxVideoDuration 直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     */
    public void setMaxVideoDuration(Long MaxVideoDuration) {
        this.MaxVideoDuration = MaxVideoDuration;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamArraySimple(map, prefix + "LibrarySet.", this.LibrarySet);
        this.setParamSimple(map, prefix + "MaxVideoDuration", this.MaxVideoDuration);

    }
}

