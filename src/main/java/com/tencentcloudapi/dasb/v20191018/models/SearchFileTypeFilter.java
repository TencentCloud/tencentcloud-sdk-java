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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFileTypeFilter extends AbstractModel{

    /**
    * 需要查询的文件传输类型，如SFTP/CLIP/RDP/RZSZ
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 在当前指定的protocol下进一步过滤具体操作类型,如剪贴板文件上传，剪贴板文件下载等
    */
    @SerializedName("Method")
    @Expose
    private Long [] Method;

    /**
     * Get 需要查询的文件传输类型，如SFTP/CLIP/RDP/RZSZ 
     * @return Protocol 需要查询的文件传输类型，如SFTP/CLIP/RDP/RZSZ
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 需要查询的文件传输类型，如SFTP/CLIP/RDP/RZSZ
     * @param Protocol 需要查询的文件传输类型，如SFTP/CLIP/RDP/RZSZ
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 在当前指定的protocol下进一步过滤具体操作类型,如剪贴板文件上传，剪贴板文件下载等 
     * @return Method 在当前指定的protocol下进一步过滤具体操作类型,如剪贴板文件上传，剪贴板文件下载等
     */
    public Long [] getMethod() {
        return this.Method;
    }

    /**
     * Set 在当前指定的protocol下进一步过滤具体操作类型,如剪贴板文件上传，剪贴板文件下载等
     * @param Method 在当前指定的protocol下进一步过滤具体操作类型,如剪贴板文件上传，剪贴板文件下载等
     */
    public void setMethod(Long [] Method) {
        this.Method = Method;
    }

    public SearchFileTypeFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileTypeFilter(SearchFileTypeFilter source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Method != null) {
            this.Method = new Long[source.Method.length];
            for (int i = 0; i < source.Method.length; i++) {
                this.Method[i] = new Long(source.Method[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "Method.", this.Method);

    }
}

