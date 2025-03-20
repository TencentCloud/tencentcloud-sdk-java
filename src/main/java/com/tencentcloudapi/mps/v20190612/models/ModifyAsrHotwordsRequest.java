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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAsrHotwordsRequest extends AbstractModel {

    /**
    * 热词库 id
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * 热词库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 热词库文本
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 热词库文件的 base64 的内容，Type 为 1 必选



    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 热词文件上传时的文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 热词库 id 
     * @return HotwordsId 热词库 id
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set 热词库 id
     * @param HotwordsId 热词库 id
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get 热词库名称 
     * @return Name 热词库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词库名称
     * @param Name 热词库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 热词库文本 
     * @return Content 热词库文本
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 热词库文本
     * @param Content 热词库文本
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 热词库文件的 base64 的内容，Type 为 1 必选


 
     * @return FileContent 热词库文件的 base64 的内容，Type 为 1 必选



     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 热词库文件的 base64 的内容，Type 为 1 必选



     * @param FileContent 热词库文件的 base64 的内容，Type 为 1 必选



     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 热词文件上传时的文件名 
     * @return FileName 热词文件上传时的文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 热词文件上传时的文件名
     * @param FileName 热词文件上传时的文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public ModifyAsrHotwordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAsrHotwordsRequest(ModifyAsrHotwordsRequest source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

