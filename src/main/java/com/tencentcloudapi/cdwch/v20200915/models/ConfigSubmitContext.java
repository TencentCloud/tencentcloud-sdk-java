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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigSubmitContext extends AbstractModel{

    /**
    * 配置文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 配置文件旧内容，base64编码
    */
    @SerializedName("OldConfValue")
    @Expose
    private String OldConfValue;

    /**
    * 配置文件新内容，base64编码
    */
    @SerializedName("NewConfValue")
    @Expose
    private String NewConfValue;

    /**
    * 保存配置文件的路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get 配置文件名称 
     * @return FileName 配置文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 配置文件名称
     * @param FileName 配置文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 配置文件旧内容，base64编码 
     * @return OldConfValue 配置文件旧内容，base64编码
     */
    public String getOldConfValue() {
        return this.OldConfValue;
    }

    /**
     * Set 配置文件旧内容，base64编码
     * @param OldConfValue 配置文件旧内容，base64编码
     */
    public void setOldConfValue(String OldConfValue) {
        this.OldConfValue = OldConfValue;
    }

    /**
     * Get 配置文件新内容，base64编码 
     * @return NewConfValue 配置文件新内容，base64编码
     */
    public String getNewConfValue() {
        return this.NewConfValue;
    }

    /**
     * Set 配置文件新内容，base64编码
     * @param NewConfValue 配置文件新内容，base64编码
     */
    public void setNewConfValue(String NewConfValue) {
        this.NewConfValue = NewConfValue;
    }

    /**
     * Get 保存配置文件的路径 
     * @return FilePath 保存配置文件的路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 保存配置文件的路径
     * @param FilePath 保存配置文件的路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public ConfigSubmitContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigSubmitContext(ConfigSubmitContext source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.OldConfValue != null) {
            this.OldConfValue = new String(source.OldConfValue);
        }
        if (source.NewConfValue != null) {
            this.NewConfValue = new String(source.NewConfValue);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "OldConfValue", this.OldConfValue);
        this.setParamSimple(map, prefix + "NewConfValue", this.NewConfValue);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

