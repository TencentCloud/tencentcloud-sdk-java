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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationFileCollection extends AbstractModel {

    /**
    * <p>最大文件数量</p>
    */
    @SerializedName("MaxFileCount")
    @Expose
    private Long MaxFileCount;

    /**
    * <p>支持的文件类型列表</p>
    */
    @SerializedName("SupportedFileTypeList")
    @Expose
    private String [] SupportedFileTypeList;

    /**
    * <p>支持的文件类型列表</p>
    */
    @SerializedName("SupportedFileTypes")
    @Expose
    private String [] SupportedFileTypes;

    /**
     * Get <p>最大文件数量</p> 
     * @return MaxFileCount <p>最大文件数量</p>
     */
    public Long getMaxFileCount() {
        return this.MaxFileCount;
    }

    /**
     * Set <p>最大文件数量</p>
     * @param MaxFileCount <p>最大文件数量</p>
     */
    public void setMaxFileCount(Long MaxFileCount) {
        this.MaxFileCount = MaxFileCount;
    }

    /**
     * Get <p>支持的文件类型列表</p> 
     * @return SupportedFileTypeList <p>支持的文件类型列表</p>
     */
    public String [] getSupportedFileTypeList() {
        return this.SupportedFileTypeList;
    }

    /**
     * Set <p>支持的文件类型列表</p>
     * @param SupportedFileTypeList <p>支持的文件类型列表</p>
     */
    public void setSupportedFileTypeList(String [] SupportedFileTypeList) {
        this.SupportedFileTypeList = SupportedFileTypeList;
    }

    /**
     * Get <p>支持的文件类型列表</p> 
     * @return SupportedFileTypes <p>支持的文件类型列表</p>
     */
    public String [] getSupportedFileTypes() {
        return this.SupportedFileTypes;
    }

    /**
     * Set <p>支持的文件类型列表</p>
     * @param SupportedFileTypes <p>支持的文件类型列表</p>
     */
    public void setSupportedFileTypes(String [] SupportedFileTypes) {
        this.SupportedFileTypes = SupportedFileTypes;
    }

    public ConversationFileCollection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationFileCollection(ConversationFileCollection source) {
        if (source.MaxFileCount != null) {
            this.MaxFileCount = new Long(source.MaxFileCount);
        }
        if (source.SupportedFileTypeList != null) {
            this.SupportedFileTypeList = new String[source.SupportedFileTypeList.length];
            for (int i = 0; i < source.SupportedFileTypeList.length; i++) {
                this.SupportedFileTypeList[i] = new String(source.SupportedFileTypeList[i]);
            }
        }
        if (source.SupportedFileTypes != null) {
            this.SupportedFileTypes = new String[source.SupportedFileTypes.length];
            for (int i = 0; i < source.SupportedFileTypes.length; i++) {
                this.SupportedFileTypes[i] = new String(source.SupportedFileTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxFileCount", this.MaxFileCount);
        this.setParamArraySimple(map, prefix + "SupportedFileTypeList.", this.SupportedFileTypeList);
        this.setParamArraySimple(map, prefix + "SupportedFileTypes.", this.SupportedFileTypes);

    }
}

