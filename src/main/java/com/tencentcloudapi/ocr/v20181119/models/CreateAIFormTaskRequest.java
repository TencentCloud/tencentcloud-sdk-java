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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIFormTaskRequest extends AbstractModel{

    /**
    * 多个文件的URL列表
    */
    @SerializedName("FileList")
    @Expose
    private SmartFormFileUrl [] FileList;

    /**
    * 备注信息1
    */
    @SerializedName("FirstNotes")
    @Expose
    private String FirstNotes;

    /**
    * 备注信息2
    */
    @SerializedName("SecondNotes")
    @Expose
    private String SecondNotes;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
     * Get 多个文件的URL列表 
     * @return FileList 多个文件的URL列表
     */
    public SmartFormFileUrl [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 多个文件的URL列表
     * @param FileList 多个文件的URL列表
     */
    public void setFileList(SmartFormFileUrl [] FileList) {
        this.FileList = FileList;
    }

    /**
     * Get 备注信息1 
     * @return FirstNotes 备注信息1
     */
    public String getFirstNotes() {
        return this.FirstNotes;
    }

    /**
     * Set 备注信息1
     * @param FirstNotes 备注信息1
     */
    public void setFirstNotes(String FirstNotes) {
        this.FirstNotes = FirstNotes;
    }

    /**
     * Get 备注信息2 
     * @return SecondNotes 备注信息2
     */
    public String getSecondNotes() {
        return this.SecondNotes;
    }

    /**
     * Set 备注信息2
     * @param SecondNotes 备注信息2
     */
    public void setSecondNotes(String SecondNotes) {
        this.SecondNotes = SecondNotes;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    public CreateAIFormTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIFormTaskRequest(CreateAIFormTaskRequest source) {
        if (source.FileList != null) {
            this.FileList = new SmartFormFileUrl[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new SmartFormFileUrl(source.FileList[i]);
            }
        }
        if (source.FirstNotes != null) {
            this.FirstNotes = new String(source.FirstNotes);
        }
        if (source.SecondNotes != null) {
            this.SecondNotes = new String(source.SecondNotes);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileList.", this.FileList);
        this.setParamSimple(map, prefix + "FirstNotes", this.FirstNotes);
        this.setParamSimple(map, prefix + "SecondNotes", this.SecondNotes);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

