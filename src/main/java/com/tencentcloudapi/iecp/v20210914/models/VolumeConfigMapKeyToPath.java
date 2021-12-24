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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeConfigMapKeyToPath extends AbstractModel{

    /**
    * 健名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对应本地路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 对应权限模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 健名 
     * @return Key 健名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 健名
     * @param Key 健名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对应本地路径 
     * @return Path 对应本地路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 对应本地路径
     * @param Path 对应本地路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 对应权限模式 
     * @return Mode 对应权限模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 对应权限模式
     * @param Mode 对应权限模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public VolumeConfigMapKeyToPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeConfigMapKeyToPath(VolumeConfigMapKeyToPath source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

