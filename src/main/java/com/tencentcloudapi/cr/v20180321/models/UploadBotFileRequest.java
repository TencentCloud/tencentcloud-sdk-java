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

public class UploadBotFileRequest extends AbstractModel{

    /**
    * 模块名。默认值（固定）：AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名。默认值（固定）：Upload
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 文件类型，输入input，停拨stop
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件链接
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
    * 任务ID，二者必填一个
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 任务名称，二者必填一个
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
     * Get 模块名。默认值（固定）：AiApi 
     * @return Module 模块名。默认值（固定）：AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名。默认值（固定）：AiApi
     * @param Module 模块名。默认值（固定）：AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名。默认值（固定）：Upload 
     * @return Operation 操作名。默认值（固定）：Upload
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名。默认值（固定）：Upload
     * @param Operation 操作名。默认值（固定）：Upload
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 文件类型，输入input，停拨stop 
     * @return FileType 文件类型，输入input，停拨stop
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，输入input，停拨stop
     * @param FileType 文件类型，输入input，停拨stop
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件链接 
     * @return FileUrl 文件链接
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件链接
     * @param FileUrl 文件链接
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 任务ID，二者必填一个 
     * @return BotId 任务ID，二者必填一个
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 任务ID，二者必填一个
     * @param BotId 任务ID，二者必填一个
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 任务名称，二者必填一个 
     * @return BotName 任务名称，二者必填一个
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 任务名称，二者必填一个
     * @param BotName 任务名称，二者必填一个
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    public UploadBotFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadBotFileRequest(UploadBotFileRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotName != null) {
            this.BotName = new String(source.BotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotName", this.BotName);

    }
}

