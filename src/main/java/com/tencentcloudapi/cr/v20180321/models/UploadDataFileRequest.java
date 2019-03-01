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

public class UploadDataFileRequest  extends AbstractModel{

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
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 上传类型，不填默认催收文件，催收文件为data，还款文件为repay。
    */
    @SerializedName("UploadModel")
    @Expose
    private String UploadModel;

    /**
    * 文件，文件与文件地址上传只可选用一种，必须使用multipart/form-data协议来上传二进制流文件，建议使用xlsx格式，大小不超过5MB。
    */
    @SerializedName("File")
    @Expose
    private byte [] File;

    /**
    * 文件上传地址，文件与文件地址上传只可选用一种，大小不超过50MB。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 实例ID，不传默认为系统分配的初始实例。
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

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
     * 获取上传类型，不填默认催收文件，催收文件为data，还款文件为repay。
     * @return UploadModel 上传类型，不填默认催收文件，催收文件为data，还款文件为repay。
     */
    public String getUploadModel() {
        return this.UploadModel;
    }

    /**
     * 设置上传类型，不填默认催收文件，催收文件为data，还款文件为repay。
     * @param UploadModel 上传类型，不填默认催收文件，催收文件为data，还款文件为repay。
     */
    public void setUploadModel(String UploadModel) {
        this.UploadModel = UploadModel;
    }

    /**
     * 获取文件，文件与文件地址上传只可选用一种，必须使用multipart/form-data协议来上传二进制流文件，建议使用xlsx格式，大小不超过5MB。
     * @return File 文件，文件与文件地址上传只可选用一种，必须使用multipart/form-data协议来上传二进制流文件，建议使用xlsx格式，大小不超过5MB。
     */
    public byte [] getFile() {
        return this.File;
    }

    /**
     * 设置文件，文件与文件地址上传只可选用一种，必须使用multipart/form-data协议来上传二进制流文件，建议使用xlsx格式，大小不超过5MB。
     * @param File 文件，文件与文件地址上传只可选用一种，必须使用multipart/form-data协议来上传二进制流文件，建议使用xlsx格式，大小不超过5MB。
     */
    public void setFile(byte [] File) {
        this.File = File;
    }

    /**
     * 获取文件上传地址，文件与文件地址上传只可选用一种，大小不超过50MB。
     * @return FileUrl 文件上传地址，文件与文件地址上传只可选用一种，大小不超过50MB。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置文件上传地址，文件与文件地址上传只可选用一种，大小不超过50MB。
     * @param FileUrl 文件上传地址，文件与文件地址上传只可选用一种，大小不超过50MB。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 获取实例ID，不传默认为系统分配的初始实例。
     * @return InstId 实例ID，不传默认为系统分配的初始实例。
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * 设置实例ID，不传默认为系统分配的初始实例。
     * @param InstId 实例ID，不传默认为系统分配的初始实例。
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "UploadModel", this.UploadModel);
        this.setParamSimple(map, prefix + "File", this.File);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "InstId", this.InstId);

    }

    protected String [] getBinaryParams() {
        return new String [] {"File"};
    }

    protected HashMap<String, byte []> getMultipartRequestParams() {
        HashMap<String, byte []> map = new HashMap<String, byte []>();
        if (this.Module != null) {
            map.put("Module", this.Module.getBytes());
        }
        if (this.Operation != null) {
            map.put("Operation", this.Operation.getBytes());
        }
        if (this.FileName != null) {
            map.put("FileName", this.FileName.getBytes());
        }
        if (this.UploadModel != null) {
            map.put("UploadModel", this.UploadModel.getBytes());
        }
        if (this.File != null) {
            map.put("File", this.File);
        }
        if (this.FileUrl != null) {
            map.put("FileUrl", this.FileUrl.getBytes());
        }
        if (this.InstId != null) {
            map.put("InstId", this.InstId.getBytes());
        }
        return map;
    }

}

