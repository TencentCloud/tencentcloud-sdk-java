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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigFilePersistent extends AbstractModel {

    /**
    * 文件编码
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * 文件下发路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 文件后置命令
    */
    @SerializedName("PostCmd")
    @Expose
    private String PostCmd;

    /**
     * Get 文件编码 
     * @return Encoding 文件编码
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set 文件编码
     * @param Encoding 文件编码
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get 文件下发路径 
     * @return Path 文件下发路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 文件下发路径
     * @param Path 文件下发路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 文件后置命令 
     * @return PostCmd 文件后置命令
     */
    public String getPostCmd() {
        return this.PostCmd;
    }

    /**
     * Set 文件后置命令
     * @param PostCmd 文件后置命令
     */
    public void setPostCmd(String PostCmd) {
        this.PostCmd = PostCmd;
    }

    public ConfigFilePersistent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFilePersistent(ConfigFilePersistent source) {
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.PostCmd != null) {
            this.PostCmd = new String(source.PostCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "PostCmd", this.PostCmd);

    }
}

