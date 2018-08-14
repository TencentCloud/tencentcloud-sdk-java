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

public class UploadFileRequest  extends AbstractModel{

    /**
    * 模块名
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 文件上传地址，要求地址协议为HTTPS，且URL端口必须为443
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件日期
    */
    @SerializedName("FileDate")
    @Expose
    private String FileDate;

    /**
     * 获取模块名
     * @return Module 模块名
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名
     * @param Module 模块名
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名
     * @return Operation 操作名
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名
     * @param Operation 操作名
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取文件上传地址，要求地址协议为HTTPS，且URL端口必须为443
     * @return FileUrl 文件上传地址，要求地址协议为HTTPS，且URL端口必须为443
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置文件上传地址，要求地址协议为HTTPS，且URL端口必须为443
     * @param FileUrl 文件上传地址，要求地址协议为HTTPS，且URL端口必须为443
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 获取文件名
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取文件日期
     * @return FileDate 文件日期
     */
    public String getFileDate() {
        return this.FileDate;
    }

    /**
     * 设置文件日期
     * @param FileDate 文件日期
     */
    public void setFileDate(String FileDate) {
        this.FileDate = FileDate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileDate", this.FileDate);

    }
}

