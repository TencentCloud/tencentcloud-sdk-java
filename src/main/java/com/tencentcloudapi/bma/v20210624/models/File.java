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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File extends AbstractModel{

    /**
    * 文件下载地址
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件类型 1-委托书 2-授权书 5-存证证书 11-营业执照
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * 文件有效开始日期
    */
    @SerializedName("ValidStartDate")
    @Expose
    private String ValidStartDate;

    /**
    * 文件有效截止日期
    */
    @SerializedName("ValidEndDate")
    @Expose
    private String ValidEndDate;

    /**
     * Get 文件下载地址 
     * @return FileUrl 文件下载地址
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件下载地址
     * @param FileUrl 文件下载地址
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件类型 1-委托书 2-授权书 5-存证证书 11-营业执照 
     * @return FileType 文件类型 1-委托书 2-授权书 5-存证证书 11-营业执照
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型 1-委托书 2-授权书 5-存证证书 11-营业执照
     * @param FileType 文件类型 1-委托书 2-授权书 5-存证证书 11-营业执照
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件有效开始日期 
     * @return ValidStartDate 文件有效开始日期
     */
    public String getValidStartDate() {
        return this.ValidStartDate;
    }

    /**
     * Set 文件有效开始日期
     * @param ValidStartDate 文件有效开始日期
     */
    public void setValidStartDate(String ValidStartDate) {
        this.ValidStartDate = ValidStartDate;
    }

    /**
     * Get 文件有效截止日期 
     * @return ValidEndDate 文件有效截止日期
     */
    public String getValidEndDate() {
        return this.ValidEndDate;
    }

    /**
     * Set 文件有效截止日期
     * @param ValidEndDate 文件有效截止日期
     */
    public void setValidEndDate(String ValidEndDate) {
        this.ValidEndDate = ValidEndDate;
    }

    public File() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File(File source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.ValidStartDate != null) {
            this.ValidStartDate = new String(source.ValidStartDate);
        }
        if (source.ValidEndDate != null) {
            this.ValidEndDate = new String(source.ValidEndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "ValidStartDate", this.ValidStartDate);
        this.setParamSimple(map, prefix + "ValidEndDate", this.ValidEndDate);

    }
}

