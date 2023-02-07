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

public class ClusterConfigsInfoFromEMR extends AbstractModel{

    /**
    * 配置文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 配置文件对应的相关属性信息
    */
    @SerializedName("FileConf")
    @Expose
    private String FileConf;

    /**
    * 配置文件对应的其他属性信息
    */
    @SerializedName("KeyConf")
    @Expose
    private String KeyConf;

    /**
    * 配置文件的内容，base64编码
    */
    @SerializedName("OriParam")
    @Expose
    private String OriParam;

    /**
    * 用于表示当前配置文件是不是有过修改后没有重启，提醒用户需要重启
    */
    @SerializedName("NeedRestart")
    @Expose
    private Long NeedRestart;

    /**
    * 保存配置文件的路径
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 配置文件对应的相关属性信息 
     * @return FileConf 配置文件对应的相关属性信息
     */
    public String getFileConf() {
        return this.FileConf;
    }

    /**
     * Set 配置文件对应的相关属性信息
     * @param FileConf 配置文件对应的相关属性信息
     */
    public void setFileConf(String FileConf) {
        this.FileConf = FileConf;
    }

    /**
     * Get 配置文件对应的其他属性信息 
     * @return KeyConf 配置文件对应的其他属性信息
     */
    public String getKeyConf() {
        return this.KeyConf;
    }

    /**
     * Set 配置文件对应的其他属性信息
     * @param KeyConf 配置文件对应的其他属性信息
     */
    public void setKeyConf(String KeyConf) {
        this.KeyConf = KeyConf;
    }

    /**
     * Get 配置文件的内容，base64编码 
     * @return OriParam 配置文件的内容，base64编码
     */
    public String getOriParam() {
        return this.OriParam;
    }

    /**
     * Set 配置文件的内容，base64编码
     * @param OriParam 配置文件的内容，base64编码
     */
    public void setOriParam(String OriParam) {
        this.OriParam = OriParam;
    }

    /**
     * Get 用于表示当前配置文件是不是有过修改后没有重启，提醒用户需要重启 
     * @return NeedRestart 用于表示当前配置文件是不是有过修改后没有重启，提醒用户需要重启
     */
    public Long getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 用于表示当前配置文件是不是有过修改后没有重启，提醒用户需要重启
     * @param NeedRestart 用于表示当前配置文件是不是有过修改后没有重启，提醒用户需要重启
     */
    public void setNeedRestart(Long NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 保存配置文件的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath 保存配置文件的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 保存配置文件的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath 保存配置文件的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public ClusterConfigsInfoFromEMR() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterConfigsInfoFromEMR(ClusterConfigsInfoFromEMR source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileConf != null) {
            this.FileConf = new String(source.FileConf);
        }
        if (source.KeyConf != null) {
            this.KeyConf = new String(source.KeyConf);
        }
        if (source.OriParam != null) {
            this.OriParam = new String(source.OriParam);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Long(source.NeedRestart);
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
        this.setParamSimple(map, prefix + "FileConf", this.FileConf);
        this.setParamSimple(map, prefix + "KeyConf", this.KeyConf);
        this.setParamSimple(map, prefix + "OriParam", this.OriParam);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

