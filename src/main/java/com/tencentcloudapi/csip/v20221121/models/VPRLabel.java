/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRLabel extends AbstractModel {

    /**
    * <p>标签名称<br>枚举值：<br>IN_THE_WILD：在野利用<br>EXP：有 EXP<br>POC：有 POC<br>INTERNET_EXPOSED：外网暴露<br>NO_RESTART：无需重启<br>HIGH_VALUE_ASSET：重要资产<br>MALWARE_WEAPONIZED：已武器化</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标签等级<br>枚举值：<br>HIGH：高<br>MEDIUM：中<br>LOW：低</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>标签说明</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>标签名称<br>枚举值：<br>IN_THE_WILD：在野利用<br>EXP：有 EXP<br>POC：有 POC<br>INTERNET_EXPOSED：外网暴露<br>NO_RESTART：无需重启<br>HIGH_VALUE_ASSET：重要资产<br>MALWARE_WEAPONIZED：已武器化</p> 
     * @return Name <p>标签名称<br>枚举值：<br>IN_THE_WILD：在野利用<br>EXP：有 EXP<br>POC：有 POC<br>INTERNET_EXPOSED：外网暴露<br>NO_RESTART：无需重启<br>HIGH_VALUE_ASSET：重要资产<br>MALWARE_WEAPONIZED：已武器化</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标签名称<br>枚举值：<br>IN_THE_WILD：在野利用<br>EXP：有 EXP<br>POC：有 POC<br>INTERNET_EXPOSED：外网暴露<br>NO_RESTART：无需重启<br>HIGH_VALUE_ASSET：重要资产<br>MALWARE_WEAPONIZED：已武器化</p>
     * @param Name <p>标签名称<br>枚举值：<br>IN_THE_WILD：在野利用<br>EXP：有 EXP<br>POC：有 POC<br>INTERNET_EXPOSED：外网暴露<br>NO_RESTART：无需重启<br>HIGH_VALUE_ASSET：重要资产<br>MALWARE_WEAPONIZED：已武器化</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标签等级<br>枚举值：<br>HIGH：高<br>MEDIUM：中<br>LOW：低</p> 
     * @return Level <p>标签等级<br>枚举值：<br>HIGH：高<br>MEDIUM：中<br>LOW：低</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>标签等级<br>枚举值：<br>HIGH：高<br>MEDIUM：中<br>LOW：低</p>
     * @param Level <p>标签等级<br>枚举值：<br>HIGH：高<br>MEDIUM：中<br>LOW：低</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>标签说明</p> 
     * @return Remark <p>标签说明</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>标签说明</p>
     * @param Remark <p>标签说明</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public VPRLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRLabel(VPRLabel source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

