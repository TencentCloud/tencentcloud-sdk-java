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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOsList extends AbstractModel {

    /**
    * 支持的Windows操作系统。
    */
    @SerializedName("Windows")
    @Expose
    private String [] Windows;

    /**
    * 支持的Linux操作系统
    */
    @SerializedName("Linux")
    @Expose
    private String [] Linux;

    /**
     * Get 支持的Windows操作系统。 
     * @return Windows 支持的Windows操作系统。
     */
    public String [] getWindows() {
        return this.Windows;
    }

    /**
     * Set 支持的Windows操作系统。
     * @param Windows 支持的Windows操作系统。
     */
    public void setWindows(String [] Windows) {
        this.Windows = Windows;
    }

    /**
     * Get 支持的Linux操作系统 
     * @return Linux 支持的Linux操作系统
     */
    public String [] getLinux() {
        return this.Linux;
    }

    /**
     * Set 支持的Linux操作系统
     * @param Linux 支持的Linux操作系统
     */
    public void setLinux(String [] Linux) {
        this.Linux = Linux;
    }

    public ImageOsList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageOsList(ImageOsList source) {
        if (source.Windows != null) {
            this.Windows = new String[source.Windows.length];
            for (int i = 0; i < source.Windows.length; i++) {
                this.Windows[i] = new String(source.Windows[i]);
            }
        }
        if (source.Linux != null) {
            this.Linux = new String[source.Linux.length];
            for (int i = 0; i < source.Linux.length; i++) {
                this.Linux[i] = new String(source.Linux[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Windows.", this.Windows);
        this.setParamArraySimple(map, prefix + "Linux.", this.Linux);

    }
}

