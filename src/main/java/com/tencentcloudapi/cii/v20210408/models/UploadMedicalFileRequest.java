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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadMedicalFileRequest extends AbstractModel{

    /**
    * 文件的字节内容。File与FileURL有一个不为空即可，若FileURL参数也存在，会只取File的内容。
    */
    @SerializedName("File")
    @Expose
    private byte [] File;

    /**
    * 文件的URL地址。File与FileURL不能同时为空，若File参数也存在，会只取File的内容。
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
     * Get 文件的字节内容。File与FileURL有一个不为空即可，若FileURL参数也存在，会只取File的内容。 
     * @return File 文件的字节内容。File与FileURL有一个不为空即可，若FileURL参数也存在，会只取File的内容。
     */
    public byte [] getFile() {
        return this.File;
    }

    /**
     * Set 文件的字节内容。File与FileURL有一个不为空即可，若FileURL参数也存在，会只取File的内容。
     * @param File 文件的字节内容。File与FileURL有一个不为空即可，若FileURL参数也存在，会只取File的内容。
     */
    public void setFile(byte [] File) {
        this.File = File;
    }

    /**
     * Get 文件的URL地址。File与FileURL不能同时为空，若File参数也存在，会只取File的内容。 
     * @return FileURL 文件的URL地址。File与FileURL不能同时为空，若File参数也存在，会只取File的内容。
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set 文件的URL地址。File与FileURL不能同时为空，若File参数也存在，会只取File的内容。
     * @param FileURL 文件的URL地址。File与FileURL不能同时为空，若File参数也存在，会只取File的内容。
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    public UploadMedicalFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadMedicalFileRequest(UploadMedicalFileRequest source) {
        if (source.File != null) {
            this.File = source.File;
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File", this.File);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);

    }

    protected String [] getBinaryParams() {
        return new String [] {"File"};
    }

    protected HashMap<String, byte []> getMultipartRequestParams() {
        HashMap<String, byte []> map = new HashMap<String, byte []>();
        if (this.File != null) {
            map.put("File", this.File);
        }
        if (this.FileURL != null) {
            map.put("FileURL", this.FileURL.getBytes());
        }
        return map;
    }

}

