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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectDirInfo extends AbstractModel{

    /**
    * 网站名称
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * 网站防护目录地址
    */
    @SerializedName("DirPath")
    @Expose
    private String DirPath;

    /**
    * 关联服务器数
    */
    @SerializedName("RelatedServerNum")
    @Expose
    private Long RelatedServerNum;

    /**
    * 防护服务器数
    */
    @SerializedName("ProtectServerNum")
    @Expose
    private Long ProtectServerNum;

    /**
    * 未防护服务器数
    */
    @SerializedName("NoProtectServerNum")
    @Expose
    private Long NoProtectServerNum;

    /**
    * 唯一ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 防护状态
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * 防护异常
    */
    @SerializedName("ProtectException")
    @Expose
    private Long ProtectException;

    /**
    * 自动恢复开关 (Filters 过滤Quuid 时 返回) 默认0
    */
    @SerializedName("AutoRestoreSwitchStatus")
    @Expose
    private Long AutoRestoreSwitchStatus;

    /**
     * Get 网站名称 
     * @return DirName 网站名称
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set 网站名称
     * @param DirName 网站名称
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get 网站防护目录地址 
     * @return DirPath 网站防护目录地址
     */
    public String getDirPath() {
        return this.DirPath;
    }

    /**
     * Set 网站防护目录地址
     * @param DirPath 网站防护目录地址
     */
    public void setDirPath(String DirPath) {
        this.DirPath = DirPath;
    }

    /**
     * Get 关联服务器数 
     * @return RelatedServerNum 关联服务器数
     */
    public Long getRelatedServerNum() {
        return this.RelatedServerNum;
    }

    /**
     * Set 关联服务器数
     * @param RelatedServerNum 关联服务器数
     */
    public void setRelatedServerNum(Long RelatedServerNum) {
        this.RelatedServerNum = RelatedServerNum;
    }

    /**
     * Get 防护服务器数 
     * @return ProtectServerNum 防护服务器数
     */
    public Long getProtectServerNum() {
        return this.ProtectServerNum;
    }

    /**
     * Set 防护服务器数
     * @param ProtectServerNum 防护服务器数
     */
    public void setProtectServerNum(Long ProtectServerNum) {
        this.ProtectServerNum = ProtectServerNum;
    }

    /**
     * Get 未防护服务器数 
     * @return NoProtectServerNum 未防护服务器数
     */
    public Long getNoProtectServerNum() {
        return this.NoProtectServerNum;
    }

    /**
     * Set 未防护服务器数
     * @param NoProtectServerNum 未防护服务器数
     */
    public void setNoProtectServerNum(Long NoProtectServerNum) {
        this.NoProtectServerNum = NoProtectServerNum;
    }

    /**
     * Get 唯一ID 
     * @return Id 唯一ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID
     * @param Id 唯一ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 防护状态 
     * @return ProtectStatus 防护状态
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set 防护状态
     * @param ProtectStatus 防护状态
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get 防护异常 
     * @return ProtectException 防护异常
     */
    public Long getProtectException() {
        return this.ProtectException;
    }

    /**
     * Set 防护异常
     * @param ProtectException 防护异常
     */
    public void setProtectException(Long ProtectException) {
        this.ProtectException = ProtectException;
    }

    /**
     * Get 自动恢复开关 (Filters 过滤Quuid 时 返回) 默认0 
     * @return AutoRestoreSwitchStatus 自动恢复开关 (Filters 过滤Quuid 时 返回) 默认0
     */
    public Long getAutoRestoreSwitchStatus() {
        return this.AutoRestoreSwitchStatus;
    }

    /**
     * Set 自动恢复开关 (Filters 过滤Quuid 时 返回) 默认0
     * @param AutoRestoreSwitchStatus 自动恢复开关 (Filters 过滤Quuid 时 返回) 默认0
     */
    public void setAutoRestoreSwitchStatus(Long AutoRestoreSwitchStatus) {
        this.AutoRestoreSwitchStatus = AutoRestoreSwitchStatus;
    }

    public ProtectDirInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectDirInfo(ProtectDirInfo source) {
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.DirPath != null) {
            this.DirPath = new String(source.DirPath);
        }
        if (source.RelatedServerNum != null) {
            this.RelatedServerNum = new Long(source.RelatedServerNum);
        }
        if (source.ProtectServerNum != null) {
            this.ProtectServerNum = new Long(source.ProtectServerNum);
        }
        if (source.NoProtectServerNum != null) {
            this.NoProtectServerNum = new Long(source.NoProtectServerNum);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.ProtectException != null) {
            this.ProtectException = new Long(source.ProtectException);
        }
        if (source.AutoRestoreSwitchStatus != null) {
            this.AutoRestoreSwitchStatus = new Long(source.AutoRestoreSwitchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamSimple(map, prefix + "DirPath", this.DirPath);
        this.setParamSimple(map, prefix + "RelatedServerNum", this.RelatedServerNum);
        this.setParamSimple(map, prefix + "ProtectServerNum", this.ProtectServerNum);
        this.setParamSimple(map, prefix + "NoProtectServerNum", this.NoProtectServerNum);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "ProtectException", this.ProtectException);
        this.setParamSimple(map, prefix + "AutoRestoreSwitchStatus", this.AutoRestoreSwitchStatus);

    }
}

