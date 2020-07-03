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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Lyric extends AbstractModel{

    /**
    * 歌词cdn地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 歌词后缀名
    */
    @SerializedName("FileNameExt")
    @Expose
    private String FileNameExt;

    /**
    * 歌词类型
    */
    @SerializedName("SubItemType")
    @Expose
    private String SubItemType;

    /**
     * Get 歌词cdn地址 
     * @return Url 歌词cdn地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 歌词cdn地址
     * @param Url 歌词cdn地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 歌词后缀名 
     * @return FileNameExt 歌词后缀名
     */
    public String getFileNameExt() {
        return this.FileNameExt;
    }

    /**
     * Set 歌词后缀名
     * @param FileNameExt 歌词后缀名
     */
    public void setFileNameExt(String FileNameExt) {
        this.FileNameExt = FileNameExt;
    }

    /**
     * Get 歌词类型 
     * @return SubItemType 歌词类型
     */
    public String getSubItemType() {
        return this.SubItemType;
    }

    /**
     * Set 歌词类型
     * @param SubItemType 歌词类型
     */
    public void setSubItemType(String SubItemType) {
        this.SubItemType = SubItemType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileNameExt", this.FileNameExt);
        this.setParamSimple(map, prefix + "SubItemType", this.SubItemType);

    }
}

