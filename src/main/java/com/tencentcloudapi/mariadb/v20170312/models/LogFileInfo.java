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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFileInfo extends AbstractModel{

    /**
    * Log最后修改时间
    */
    @SerializedName("Mtime")
    @Expose
    private Long Mtime;

    /**
    * 文件长度
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 下载Log时用到的统一资源标识符
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get Log最后修改时间 
     * @return Mtime Log最后修改时间
     */
    public Long getMtime() {
        return this.Mtime;
    }

    /**
     * Set Log最后修改时间
     * @param Mtime Log最后修改时间
     */
    public void setMtime(Long Mtime) {
        this.Mtime = Mtime;
    }

    /**
     * Get 文件长度 
     * @return Length 文件长度
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 文件长度
     * @param Length 文件长度
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 下载Log时用到的统一资源标识符 
     * @return Uri 下载Log时用到的统一资源标识符
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 下载Log时用到的统一资源标识符
     * @param Uri 下载Log时用到的统一资源标识符
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mtime", this.Mtime);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

