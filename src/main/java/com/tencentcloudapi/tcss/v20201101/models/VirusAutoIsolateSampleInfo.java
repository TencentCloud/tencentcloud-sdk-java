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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirusAutoIsolateSampleInfo extends AbstractModel{

    /**
    * 文件MD5值
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 病毒名
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 最近编辑时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 自动隔离开关(true:开 false:关)
    */
    @SerializedName("AutoIsolateSwitch")
    @Expose
    private Boolean AutoIsolateSwitch;

    /**
     * Get 文件MD5值 
     * @return MD5 文件MD5值
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 文件MD5值
     * @param MD5 文件MD5值
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 病毒名 
     * @return VirusName 病毒名
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名
     * @param VirusName 病毒名
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 最近编辑时间 
     * @return ModifyTime 最近编辑时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近编辑时间
     * @param ModifyTime 最近编辑时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 自动隔离开关(true:开 false:关) 
     * @return AutoIsolateSwitch 自动隔离开关(true:开 false:关)
     */
    public Boolean getAutoIsolateSwitch() {
        return this.AutoIsolateSwitch;
    }

    /**
     * Set 自动隔离开关(true:开 false:关)
     * @param AutoIsolateSwitch 自动隔离开关(true:开 false:关)
     */
    public void setAutoIsolateSwitch(Boolean AutoIsolateSwitch) {
        this.AutoIsolateSwitch = AutoIsolateSwitch;
    }

    public VirusAutoIsolateSampleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirusAutoIsolateSampleInfo(VirusAutoIsolateSampleInfo source) {
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AutoIsolateSwitch != null) {
            this.AutoIsolateSwitch = new Boolean(source.AutoIsolateSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AutoIsolateSwitch", this.AutoIsolateSwitch);

    }
}

