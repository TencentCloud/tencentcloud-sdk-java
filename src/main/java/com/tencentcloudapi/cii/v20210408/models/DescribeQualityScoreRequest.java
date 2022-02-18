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

public class DescribeQualityScoreRequest extends AbstractModel{

    /**
    * 文件二进制数据
    */
    @SerializedName("File")
    @Expose
    private byte [] File;

    /**
     * Get 文件二进制数据 
     * @return File 文件二进制数据
     */
    public byte [] getFile() {
        return this.File;
    }

    /**
     * Set 文件二进制数据
     * @param File 文件二进制数据
     */
    public void setFile(byte [] File) {
        this.File = File;
    }

    public DescribeQualityScoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityScoreRequest(DescribeQualityScoreRequest source) {
        if (source.File != null) {
            this.File = source.File;
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "File", this.File);

    }

    protected String [] getBinaryParams() {
        return new String [] {"File"};
    }

    protected HashMap<String, byte []> getMultipartRequestParams() {
        HashMap<String, byte []> map = new HashMap<String, byte []>();
        if (this.File != null) {
            map.put("File", this.File);
        }
        return map;
    }

}

